package com.idm.fotaagent.tool.ddf;

import A2.c;
import D2.a;
import D2.b;
import android.content.Context;
import android.content.res.AssetManager;
import com.idm.adapter.deviceinfo.IDMDeviceInfoAdapter;
import com.idm.adapter.filesystem.IDMFileSystemAdapter;
import com.idm.agent.dm.IDMDmInterface;
import com.idm.core.ddf.DDFProfileInfo;
import com.idm.core.security.IDMSecurityImpl;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseServerInfo;
import com.idm.fotaagent.database.sqlite.database.mo.IDMDatabaseMoNodeManager;
import com.idm.fotaagent.enabler.adapter.IDMAdapterDeviceInfoImpl;
import com.idm.fotaagent.enabler.security.IDMSecurityAESCryptImpl;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.providers.mo.IDMMoDatabaseManager;
import com.idm.tool.ddf.DDFNodeCreator;
import com.samsung.android.fotaagent.common.DeviceId;
import com.samsung.android.fotaagent.common.feature.SalesCode;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.log.Logger;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public class DDFManager {
    private static final String DDF_DEFAULT_DIRECTORY = "default";
    private static final String DDF_FILE_EXCLUDED_IN_CHINA = "x6g1q14r75_DDF_SYNCML_DM.exml";
    private static final String DDF_FILE_EXCLUDED_IN_GLOBAL = "x6g1q14r75_DDF_SYNCML_DM_CHN.exml";
    private static final String DDF_FILE_MAGIC_NAME = "DDF";
    private static final String DDF_ROOT_DIRECTORY = "profile";
    private final AssetManager assetManager;
    private final List<String> candidateServerIds;
    private final Context context;
    private final HashMap<String, IDMToolDDFHashInfo> ddfHashInfos;
    private final IDMDeviceInfoAdapter deviceInfoAdapter;

    public DDFManager(Context context) {
        this(context, new IDMAdapterDeviceInfoImpl());
    }

    private String calculateHash(InputStream inputStream) {
        return new IDMSecurityImpl().idmSecurityMD5FileHash(new IDMFileSystemAdapter().idmGetByteFromInputStream(inputStream));
    }

    private void clearCandidateServerIds() {
        this.candidateServerIds.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createDDFNode(String str) throws IOException {
        try {
            InputStream inputStreamOpen = this.assetManager.open(str);
            try {
                inputStreamOpen.mark(inputStreamOpen.available() + 1);
                String strCalculateHash = calculateHash(inputStreamOpen);
                if (strCalculateHash.equals(getHashFor(str))) {
                    inputStreamOpen.close();
                    return;
                }
                Log.I("create nodes for " + str + " since changed");
                inputStreamOpen.reset();
                InputStream inputStreamDecrypt = decrypt(inputStreamOpen);
                try {
                    replaceProfile(new DDFNodeCreator(this.context, getServerIdFrom(str), inputStreamDecrypt, this.deviceInfoAdapter).creatAndReturnProfiles());
                    saveHashFor(str, strCalculateHash);
                    if (inputStreamDecrypt != null) {
                        inputStreamDecrypt.close();
                    }
                    inputStreamOpen.close();
                } finally {
                }
            } finally {
            }
        } catch (Exception e5) {
            Log.printStackTrace(e5);
        }
    }

    private InputStream decrypt(InputStream inputStream) {
        return new ByteArrayInputStream(new IDMSecurityAESCryptImpl().decrypt(new IDMFileSystemAdapter().idmGetByteFromInputStream(inputStream)));
    }

    private boolean excludes(String str) {
        if (!str.contains(DDF_FILE_MAGIC_NAME)) {
            return true;
        }
        if (SalesCode.get().isChinaCountryFeature() && str.contains(DDF_FILE_EXCLUDED_IN_CHINA)) {
            return true;
        }
        return !SalesCode.get().isChinaCountryFeature() && str.contains(DDF_FILE_EXCLUDED_IN_GLOBAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Stream<String> getFilePaths(String str) throws IOException {
        ArrayList arrayList = new ArrayList();
        try {
            for (String str2 : this.assetManager.list("profile/" + str)) {
                if (!excludes(str2)) {
                    arrayList.add("profile/" + str + "/" + str2);
                }
            }
        } catch (IOException e5) {
            Log.printStackTrace(e5);
        }
        return arrayList.stream();
    }

    private String getHashFor(String str) {
        IDMToolDDFHashInfo iDMToolDDFHashInfo = this.ddfHashInfos.get(str);
        return iDMToolDDFHashInfo == null ? "" : iDMToolDDFHashInfo.idmGetDDFHashData();
    }

    private static String getServerIdFrom(String str) {
        int iLastIndexOf = str.lastIndexOf("/");
        return str.substring(str.substring(0, iLastIndexOf).lastIndexOf("/") + 1, iLastIndexOf);
    }

    private int getServerIndex(String str) {
        Log.I("serverId : " + str);
        for (int i5 = 0; i5 < this.candidateServerIds.size(); i5++) {
            if (this.candidateServerIds.get(i5).equals(str)) {
                return i5 + 1;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isCandidateDirectory(String str) throws IOException {
        if (!this.candidateServerIds.contains(str)) {
            return false;
        }
        try {
            String[] list = this.assetManager.list("profile/" + str);
            Objects.requireNonNull(list, "list of assets should not be null");
            return list.length > 0;
        } catch (IOException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isTableCreatedSuccessfully(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);
        return IDMDatabaseMoNodeManager.getInstance().idmGetMoDatabaseManager().idmMoDatabaseCreateTable(arrayList);
    }

    private void logBootstrapInfo(IDMDatabaseServerInfo iDMDatabaseServerInfo) {
        IDMMoDatabaseManager iDMMoDatabaseManagerIdmGetMoDatabaseManager = IDMDatabaseMoNodeManager.getInstance().idmGetMoDatabaseManager();
        Logger loggerBootstrapLogger = Log.bootstrapLogger(this.context);
        loggerBootstrapLogger.H("Model : " + DeviceUtils.readModelName());
        loggerBootstrapLogger.H("Device ID : " + DeviceId.readDeviceId(this.context));
        loggerBootstrapLogger.H("Server ID : " + iDMMoDatabaseManagerIdmGetMoDatabaseManager.idmMoGetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHNAME, iDMDatabaseServerInfo.idmGetServer()));
        loggerBootstrapLogger.H("Server PW : " + iDMMoDatabaseManagerIdmGetMoDatabaseManager.idmMoGetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHSECRET, iDMDatabaseServerInfo.idmGetServer()));
        loggerBootstrapLogger.H("Server URL : " + iDMMoDatabaseManagerIdmGetMoDatabaseManager.idmMoGetAccServerUriInfo(iDMDatabaseServerInfo.idmGetServer()));
        loggerBootstrapLogger.H("User ID : " + iDMMoDatabaseManagerIdmGetMoDatabaseManager.idmMoGetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHNAME, iDMDatabaseServerInfo.idmGetServer()));
    }

    private void populateCandidateServerIds(boolean z4) {
        this.candidateServerIds.add("x6g1q14r75");
        if (z4) {
            return;
        }
        this.candidateServerIds.add("mformtest2020");
    }

    private void replaceProfile(List<DDFProfileInfo> list) {
        if (list == null) {
            return;
        }
        for (DDFProfileInfo dDFProfileInfo : list) {
            IDMDatabaseServerInfo iDMDatabaseServerInfo = new IDMDatabaseServerInfo();
            String serverId = dDFProfileInfo.getServerId();
            iDMDatabaseServerInfo.idmSetServer(serverId);
            if ("x6g1q14r75".equals(serverId)) {
                iDMDatabaseServerInfo.idmSetActive(1);
            }
            iDMDatabaseServerInfo.idmSetId(getServerIndex(serverId));
            IDMDatabaseManager.getInstance().replaceServerInfo(iDMDatabaseServerInfo);
            logBootstrapInfo(iDMDatabaseServerInfo);
        }
    }

    private void saveHashFor(String str, String str2) {
        IDMToolDDFHashInfo iDMToolDDFHashInfo = new IDMToolDDFHashInfo();
        iDMToolDDFHashInfo.idmSetDDFFileName(str);
        iDMToolDDFHashInfo.idmSetDDFHashData(str2);
        IDMDatabaseManager.getInstance().insertDDFHashInfo(iDMToolDDFHashInfo);
    }

    public void execute(boolean z4) {
        populateCandidateServerIds(z4);
        Arrays.stream(this.assetManager.list("profile")).filter(new a(0, this)).filter(new a(1, this)).flatMap(new b(0, this)).forEach(new c(1, this));
        clearCandidateServerIds();
    }

    public DDFManager(Context context, IDMDeviceInfoAdapter iDMDeviceInfoAdapter) {
        this.context = context;
        this.assetManager = context.getAssets();
        this.ddfHashInfos = IDMDatabaseManager.getInstance().getAllDDFHashInfos();
        this.deviceInfoAdapter = iDMDeviceInfoAdapter;
        this.candidateServerIds = new ArrayList();
    }
}
