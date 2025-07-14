package com.idm.fotaagent.abupdate.manager;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.abupdate.manager.callbacks.AbstractCallback;
import com.idm.fotaagent.abupdate.manager.callbacks.SlotSwitchCallback;
import com.idm.fotaagent.abupdate.manager.callbacks.UpdateCallback;
import com.idm.fotaagent.abupdate.updateengine.ErrorCode;
import com.idm.fotaagent.abupdate.updateengine.UpdateEngine;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.proxy.ProxyHandler;
import com.idm.fotaagent.enabler.network.HTTPHeader;
import com.idm.fotaagent.receiver.dynamic.IDMDynamicReceivers;
import com.idm.fotaagent.receiver.dynamic.LowBatteryReceiver;
import com.idm.fotaagent.receiver.dynamic.ReceiverToBeSpecifiedFlag;
import com.idm.fotaagent.restapi.parser.XmlParser;
import com.idm.fotaagent.utils.GeneralUtils;
import com.idm.network.IDMNetworkInterface;
import com.samsung.android.fotaagent.common.log.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/* loaded from: classes.dex */
public class UpdateEngineManager {
    private static final String DELTA_QB_ID = "DELTA_QB_ID";
    private static final String DOWNLOAD_RETRY = "DOWNLOAD_RETRY";
    public static final String FILE_HASH = "FILE_HASH";
    public static final String FILE_SIZE = "FILE_SIZE";
    private static final String HTTP_EXTRAS = "HTTP_EXTRAS";
    public static final String METADATA_FILE_SIZE = "METADATA_FILE_SIZE";
    public static final String METADATA_HASH = "METADATA_HASH";
    public static final String METADATA_SIZE = "METADATA_SIZE";
    private static final String NETWORK_ID = "NETWORK_ID";
    public static final String OFFSET = "OFFSET";
    private static final String PROXY_URL = "NETWORK_PROXY";
    private static final String SWITCH_SLOT_ON_REBOOT = "SWITCH_SLOT_ON_REBOOT";
    private static final String TARGET_FIRMWARE_VERSION = "TARGET_FIRMWARE_VERSION";
    private static final String USER_AGENT = "USER_AGENT";
    private AbstractCallback callback;
    private final Handler handler;
    private final UpdateEngine updateEngine = new UpdateEngine();

    public UpdateEngineManager(Handler handler) {
        this.handler = handler;
    }

    private String getFormattedProperties(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(XmlParser.Polling.POLLING_VERSION_SEPARATOR);
            sb.append(entry.getValue());
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        Log.V("request properties : " + ((Object) sb));
        return sb.toString();
    }

    private String[] getPayloadProperties(long j5) {
        Context contextIdmGetContext = IDMApplication.idmGetContext();
        InstallParamRepository installParamRepository = new InstallParamRepository(contextIdmGetContext);
        ArrayList arrayList = new ArrayList();
        arrayList.add("FILE_HASH=" + installParamRepository.getFileHash());
        arrayList.add("FILE_SIZE=" + installParamRepository.getFileSize());
        arrayList.add("METADATA_HASH=" + installParamRepository.getMetadataHash());
        arrayList.add("METADATA_SIZE=" + installParamRepository.getMetadataSize());
        arrayList.add("DOWNLOAD_RETRY=0");
        ProxyHandler proxyHandler = new ProxyHandler(contextIdmGetContext);
        String address = proxyHandler.getAddress();
        if (!TextUtils.isEmpty(address)) {
            String str = "http://" + address + ":" + proxyHandler.getPort();
            Log.H("NETWORK_PROXY=" + str);
            arrayList.add("NETWORK_PROXY=" + str);
        }
        arrayList.add("SWITCH_SLOT_ON_REBOOT=0");
        arrayList.add("NETWORK_ID=" + j5);
        Map<String, String> mapMakeProperties = new HTTPHeader.ForDL().makeProperties(getUrlConnection());
        String str2 = mapMakeProperties.get("User-Agent");
        mapMakeProperties.remove("User-Agent");
        arrayList.add("USER_AGENT=" + str2);
        arrayList.add("HTTP_EXTRAS=" + getFormattedProperties(mapMakeProperties));
        arrayList.add("TARGET_FIRMWARE_VERSION=" + installParamRepository.getUpdateFwVersion());
        String deltaQbId = new FotaJobRepository(contextIdmGetContext).getDeltaQbId();
        if (!TextUtils.isEmpty(deltaQbId)) {
            arrayList.add("DELTA_QB_ID=" + deltaQbId);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private Proxy getProxy() {
        ProxyHandler proxyHandler = new ProxyHandler(IDMApplication.idmGetContext());
        String address = proxyHandler.getAddress();
        if (TextUtils.isEmpty(address)) {
            return null;
        }
        return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(address, proxyHandler.getPort()));
    }

    private String getTaskId() {
        return new ActionInfoDao().getSessionId();
    }

    private HttpURLConnection getUrlConnection() throws ProtocolException {
        if (new ActionInfoDao(getTaskId()).isTriggeredBySideload()) {
            return null;
        }
        try {
            URL url = new URL(new ActionInfoDao(getTaskId()).getObjectUrl());
            HttpURLConnection httpURLConnection = (HttpURLConnection) (getProxy() == null ? url.openConnection() : url.openConnection(getProxy()));
            httpURLConnection.setRequestMethod(IDMNetworkInterface.IDM_HTTP_METHOD_GET);
            return httpURLConnection;
        } catch (IOException e5) {
            Log.printStackTrace(e5);
            return null;
        }
    }

    private void unbind() {
        Log.I("");
        boolean zUnbind = this.updateEngine.unbind();
        Log.I("unbind result : " + zUnbind);
        if (zUnbind) {
            this.callback = null;
        }
    }

    public long allocateSpaceForPayload(String str) {
        Log.I("");
        return this.updateEngine.allocateSpace(str, getPayloadProperties(0L)).getFreeSpaceRequired();
    }

    public void applyPayload(long j5) {
        Log.I("networkId : " + j5);
        Context contextIdmGetContext = IDMApplication.idmGetContext();
        InstallParamRepository installParamRepository = new InstallParamRepository(contextIdmGetContext);
        try {
            ActionInfoDao actionInfoDao = new ActionInfoDao(getTaskId());
            String objectUrl = actionInfoDao.getObjectUrl();
            if (!actionInfoDao.isTriggeredBySideload()) {
                objectUrl = GeneralUtils.appendExtraParam(contextIdmGetContext, objectUrl);
            }
            this.updateEngine.applyPayload(objectUrl, installParamRepository.getOffset(), installParamRepository.getFileSize(), getPayloadProperties(j5));
            IDMDynamicReceivers.getInstance().registerTemperatureChangeReceiverIfNeeded();
            IDMDynamicReceivers.getInstance().register(LowBatteryReceiver.class, ReceiverToBeSpecifiedFlag.Property.NOT_SPECIFY_FOR_SYSTEM);
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            throw e5;
        }
    }

    public void bind() throws InterruptedException {
        Log.I("");
        bind(new UpdateCallback());
    }

    public void bindForSlotSwitch(CompletableFuture<Void> completableFuture) {
        bind(new SlotSwitchCallback(completableFuture));
    }

    public void cancel() {
        Log.I("");
        this.updateEngine.cancel();
    }

    public int cleanupSuccessfulUpdate() {
        Log.I("");
        return this.updateEngine.cleanupAppliedPayload();
    }

    public void executeCallbackIfPossible(ErrorCode errorCode) {
        AbstractCallback abstractCallback = this.callback;
        if (abstractCallback != null) {
            abstractCallback.setResultCode(errorCode.getErrorCode());
        }
    }

    public void reset() {
        Log.I("");
        try {
            this.updateEngine.cancel();
        } finally {
            this.updateEngine.resetStatus();
        }
    }

    public void resetShouldSwitchSlotOnReboot() {
        this.updateEngine.resetShouldSwitchSlotOnReboot();
    }

    public void setShouldSwitchSlotOnReboot(String str) {
        this.updateEngine.setShouldSwitchSlotOnReboot(str);
    }

    public void triggerPostinstall(String str) {
        this.updateEngine.triggerPostinstall(str);
    }

    private void bind(AbstractCallback abstractCallback) throws InterruptedException {
        unbind();
        boolean zBind = this.updateEngine.bind(abstractCallback, this.handler);
        if (!zBind) {
            Log.W("Try binding again.");
            try {
                Thread.sleep(300L);
            } catch (Exception e5) {
                Log.I(e5.getMessage());
            }
            zBind = this.updateEngine.bind(abstractCallback, this.handler);
        }
        Log.I("bind result : " + zBind);
        if (zBind) {
            this.callback = abstractCallback;
        }
    }
}
