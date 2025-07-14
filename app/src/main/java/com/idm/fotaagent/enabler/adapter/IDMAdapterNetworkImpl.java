package com.idm.fotaagent.enabler.adapter;

import android.net.TrafficStats;
import android.text.TextUtils;
import com.idm.adapter.networkinfo.IDMNetworkInfoAdapter;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.AdminRepository;
import com.idm.fotaagent.database.room.data.repository.RegisteredDeviceRepository;
import com.idm.fotaagent.enabler.fumo.proxy.ProxyHandler;
import com.idm.fotaagent.enabler.network.HTTPHeader;
import com.idm.fotaagent.utils.GeneralUtils;
import com.samsung.android.fotaagent.common.FotaTelephonyManager;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.lib.episode.EternalContract;
import com.wssyncmldm.Flavor;
import java.net.HttpURLConnection;
import java.util.Map;

/* loaded from: classes.dex */
public class IDMAdapterNetworkImpl extends IDMNetworkInfoAdapter {
    private static final int CONNECTION_TIMEOUT_IN_MILLIS = 60000;
    private static final String DEFAULT_MANUFACTURER = "samsung";
    private static final String DEFAULT_MODEL_NAME = "GT-I9100";
    public static final int DL_MAX_RETRY_COUNT = 15;
    public static final int DL_TOTAL_RETRY_COUNT = 1;
    public static final int DM_MAX_RETRY_COUNT = 5;
    public static final int FOTA_UID = 2904;
    static final String HTTP_ACCEPT = "Accept";
    static final String HTTP_HEADER_DL_ACCEPT = "application/vnd.oma.dd+xml";
    static final String HTTP_HEADER_DM_ACCEPT = "application/vnd.syncml.dm+wbxml";
    static final String HTTP_NETWORK_BEARER = "X-Sec-Download-Network-Bearer";
    private static final int RECEIVE_TIMEOUT_IN_MILLIS = 60000;
    private final int appId;
    private boolean isProxy;
    private String proxyIp;
    private int proxyPort;
    private final String taskId;

    public IDMAdapterNetworkImpl(String str, int i5) {
        this.taskId = str;
        this.appId = i5;
        initializeNetworkInfo();
    }

    private void initializeNetworkInfo() {
        int i5 = this.appId;
        idmSetNetworkRetryCount(i5, i5 == 0 ? 5 : 15);
        idmSetConnectNetworkTimeOut(this.appId, EternalContract.ONEUI_6_0_0);
        idmSetRecvNetworkTimeOut(this.appId, EternalContract.ONEUI_6_0_0);
        ProxyHandler proxyHandler = new ProxyHandler(IDMApplication.idmGetContext());
        String address = proxyHandler.getAddress();
        if (TextUtils.isEmpty(address)) {
            return;
        }
        idmSetIsProxy(true);
        idmSetProxyIp(address);
        idmSetProxyPort(proxyHandler.getPort());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$idmMakeHttpHeader$0(Map map, String str) {
        idmSetHttpHeadersMap(str, (String) map.get(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$makeHttpUserAgent$1(String str) {
        return str.length() > 0;
    }

    @Override // com.idm.adapter.networkinfo.IDMNetworkInfoAdapter
    public void idmCustomApnClose() {
        try {
            NetworkApnManager.get().close();
        } catch (IllegalStateException e5) {
            Log.printStackTrace(e5);
        }
    }

    @Override // com.idm.adapter.networkinfo.IDMNetworkInfoAdapter
    public boolean idmCustomApnOpen() {
        if (!idmGetIsCustomApn()) {
            return false;
        }
        try {
            NetworkApnManager.get().open();
            return true;
        } catch (IllegalStateException e5) {
            Log.printStackTrace(e5);
            return false;
        }
    }

    @Override // com.idm.adapter.networkinfo.IDMNetworkInfoAdapter
    public boolean idmGetIsCustomApn() {
        return Flavor.Apn.usesConfiguredApn(FotaTelephonyManager.getDataSimSlotId(IDMApplication.idmGetContext()));
    }

    @Override // com.idm.adapter.networkinfo.IDMNetworkInfoAdapter
    public boolean idmGetIsProxy() {
        return this.isProxy;
    }

    @Override // com.idm.adapter.networkinfo.IDMNetworkInfoAdapter
    public boolean idmGetIsSSLCheck() {
        return new AdminRepository(IDMApplication.idmGetContext()).isSslCheckEnabled();
    }

    @Override // com.idm.adapter.networkinfo.IDMNetworkInfoAdapter
    public String idmGetObjectUrlAddNetworkInfo(String str) {
        return GeneralUtils.appendExtraParam(IDMApplication.idmGetContext(), str);
    }

    @Override // com.idm.adapter.networkinfo.IDMNetworkInfoAdapter
    public String idmGetProxyIp() {
        return this.proxyIp;
    }

    @Override // com.idm.adapter.networkinfo.IDMNetworkInfoAdapter
    public int idmGetProxyPort() {
        return this.proxyPort;
    }

    @Override // com.idm.adapter.networkinfo.IDMNetworkInfoAdapter
    public void idmMakeHttpHeader(int i5, HttpURLConnection httpURLConnection, String str, int i6) {
        Map<String, String> mapMakeProperties;
        if (i5 == 0) {
            mapMakeProperties = new HTTPHeader.ForDM().makeProperties(httpURLConnection);
        } else {
            if (i5 != 1) {
                Log.W("unexpected appId : " + i5);
                super.idmMakeHttpHeader(i5, httpURLConnection, str, i6);
                return;
            }
            mapMakeProperties = new HTTPHeader.ForDL().makeProperties(httpURLConnection);
        }
        mapMakeProperties.keySet().forEach(new a(this, 0, mapMakeProperties));
        super.idmMakeHttpHeader(i5, httpURLConnection, str, i6);
    }

    @Override // com.idm.adapter.networkinfo.IDMNetworkInfoAdapter
    public void idmSetIsCustomApn() {
    }

    @Override // com.idm.adapter.networkinfo.IDMNetworkInfoAdapter
    public void idmSetIsProxy(boolean z4) {
        this.isProxy = z4;
    }

    @Override // com.idm.adapter.networkinfo.IDMNetworkInfoAdapter
    public void idmSetProxyIp(String str) {
        this.proxyIp = str;
    }

    @Override // com.idm.adapter.networkinfo.IDMNetworkInfoAdapter
    public void idmSetProxyPort(int i5) {
        this.proxyPort = i5;
    }

    @Override // com.idm.adapter.networkinfo.IDMNetworkInfoAdapter
    public void idmSocketTrafficStats() {
        TrafficStats.setThreadStatsUid(FOTA_UID);
    }

    public String makeHttpUserAgent() {
        String strIdmGetDeviceManufacturer = new IDMAdapterDeviceInfoImpl().idmGetDeviceManufacturer();
        if (TextUtils.isEmpty(strIdmGetDeviceManufacturer)) {
            strIdmGetDeviceManufacturer = DEFAULT_MANUFACTURER;
        }
        return strIdmGetDeviceManufacturer + ' ' + new RegisteredDeviceRepository(IDMApplication.idmGetContext()).getModelName().filter(new com.idm.adapter.filesystem.a(5)).orElse(DEFAULT_MODEL_NAME) + " SyncML DM Client";
    }
}
