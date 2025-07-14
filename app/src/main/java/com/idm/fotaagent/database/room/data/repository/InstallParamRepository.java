package com.idm.fotaagent.database.room.data.repository;

import A.o;
import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.PropertyRepository;
import com.idm.fotaagent.restapi.parser.XmlParser;
import com.samsung.android.fotaagent.common.log.Log;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

/* loaded from: classes.dex */
public class InstallParamRepository extends PropertyRepository.SpecificCategory {
    public static final String CATEGORY = "InstallParam";
    public static final long DEFAULT_CACHE_MARGIN = 300;
    public static final long DEFAULT_DATA_MARGIN = 500;
    private static final String NAME_APP_FOTA = "appFota";
    private static final String NAME_BATTERY_INSTALL_LEVEL = "batteryInstallLevel";
    private static final String NAME_CACHE_MARGIN = "cacheMargin";
    private static final String NAME_DATA_MARGIN = "dataMargin";
    private static final String NAME_FILE_HASH = "fileHash";
    private static final String NAME_FILE_SIZE = "fileSize";
    private static final String NAME_FIRMWARE_TYPE = "firmwareType";
    private static final String NAME_MD5 = "MD5";
    private static final String NAME_METADATA_FILE_SIZE = "metadataFileSize";
    private static final String NAME_METADATA_HASH = "metadataHash";
    private static final String NAME_METADATA_SIZE = "metadataSize";
    private static final String NAME_MR_TYPE = "mrType";
    private static final String NAME_OFFSET = "offset";
    private static final String NAME_ONE_UI_TYPE = "oneUiType";
    private static final String NAME_SECURITY_PATCH_VERSION = "securityPatchVersion";
    private static final String NAME_UPDATE_FW_OS_VERSION = "updateFwOsV";
    private static final String NAME_UPDATE_FW_VERSION = "updateFwV";
    private static final String NAME_UPDATE_ONE_UI_VERSION = "updateOneUiVersion";
    public static final String VALUE_ONE_UI_TYPE_MAJOR = "MAJOR";
    public static final String VALUE_ONE_UI_TYPE_MINOR = "MINOR";

    public static class Internal {
        private static final Map<String, Function<String, Serializable>> converters;
        private final PropertyRepository.SpecificCategory repository;

        static {
            HashMap map = new HashMap();
            converters = map;
            map.put("MD5", new h(0));
            map.put(InstallParamRepository.NAME_DATA_MARGIN, new h(11));
            map.put(InstallParamRepository.NAME_CACHE_MARGIN, new h(11));
            map.put(InstallParamRepository.NAME_BATTERY_INSTALL_LEVEL, new h(12));
            map.put(InstallParamRepository.NAME_UPDATE_FW_VERSION, new h(7));
            map.put(InstallParamRepository.NAME_SECURITY_PATCH_VERSION, new h(8));
            map.put(InstallParamRepository.NAME_MR_TYPE, new h(9));
            map.put(InstallParamRepository.NAME_APP_FOTA, new h(12));
            map.put(InstallParamRepository.NAME_FIRMWARE_TYPE, new h(1));
            map.put(InstallParamRepository.NAME_UPDATE_ONE_UI_VERSION, new h(2));
            map.put(InstallParamRepository.NAME_ONE_UI_TYPE, new h(3));
            map.put(InstallParamRepository.NAME_UPDATE_FW_OS_VERSION, new h(4));
            map.put(InstallParamRepository.NAME_FILE_HASH, new h(5));
            map.put(InstallParamRepository.NAME_FILE_SIZE, new h(11));
            map.put(InstallParamRepository.NAME_METADATA_HASH, new h(6));
            map.put(InstallParamRepository.NAME_METADATA_SIZE, new h(11));
            map.put(InstallParamRepository.NAME_METADATA_FILE_SIZE, new h(11));
            map.put(InstallParamRepository.NAME_OFFSET, new h(11));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Serializable lambda$static$0(String str) {
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Serializable lambda$static$1(String str) {
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Serializable lambda$static$2(String str) {
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Serializable lambda$static$3(String str) {
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Serializable lambda$static$4(String str) {
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Serializable lambda$static$5(String str) {
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Serializable lambda$static$6(String str) {
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Serializable lambda$static$7(String str) {
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Serializable lambda$static$8(String str) {
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Serializable lambda$static$9(String str) {
            return str;
        }

        public void insertOrReplace(String str, String str2) {
            Function<String, Serializable> function = converters.get(str);
            if (function == null) {
                Log.W("unsupported name for installParam: " + str);
            } else {
                Log.I(str + '=' + str2);
                this.repository.insertOrReplaceWithoutException(str, function.apply(str2));
            }
        }

        private Internal(PropertyRepository.SpecificCategory specificCategory) {
            this.repository = specificCategory;
        }
    }

    public InstallParamRepository(Context context) {
        super(FotaRoomDatabase.get(context), CATEGORY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$save$0(String str) {
        String str2;
        String str3;
        Internal internal = new Internal(this);
        for (String str4 : str.split(XmlParser.Polling.POLLING_VERSION_SEPARATOR)) {
            String[] strArrSplit = str4.split("=", 2);
            if (strArrSplit.length != 2 || (str2 = strArrSplit[0]) == null || (str3 = strArrSplit[1]) == null) {
                Log.W("invalid attribute: ".concat(str4));
            } else {
                try {
                    internal.insertOrReplace(str2, str3);
                } catch (Exception e5) {
                    Log.printStackTrace(e5);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveInstallParamForABUpdate$1(String str, long j5, String str2, long j6, long j7, long j8, String str3) {
        insertOrReplaceWithoutException(NAME_FILE_HASH, str);
        insertOrReplaceWithoutException(NAME_FILE_SIZE, Long.valueOf(j5));
        insertOrReplaceWithoutException(NAME_METADATA_HASH, str2);
        insertOrReplaceWithoutException(NAME_METADATA_SIZE, Long.valueOf(j6));
        insertOrReplaceWithoutException(NAME_METADATA_FILE_SIZE, Long.valueOf(j7));
        insertOrReplaceWithoutException(NAME_OFFSET, Long.valueOf(j8));
        insertOrReplaceWithoutException(NAME_UPDATE_FW_VERSION, str3);
    }

    public void clear() {
        deleteAll();
    }

    public int getAppFota() {
        return ((Integer) getValueOf(NAME_APP_FOTA, 0)).intValue();
    }

    public Optional<Integer> getBatteryInstallLevel() {
        return getValueOf(NAME_BATTERY_INSTALL_LEVEL);
    }

    public long getCacheMargin() {
        return ((Long) getValueOf(NAME_CACHE_MARGIN, 300L)).longValue();
    }

    public long getDataMargin() {
        return ((Long) getValueOf(NAME_DATA_MARGIN, 500L)).longValue();
    }

    public String getFileHash() {
        return (String) getValueOf(NAME_FILE_HASH, "");
    }

    public long getFileSize() {
        return ((Long) getValueOf(NAME_FILE_SIZE, 0L)).longValue();
    }

    public String getMD5() {
        return (String) getValueOf("MD5", "");
    }

    public long getMetadataFileSize() {
        return ((Long) getValueOf(NAME_METADATA_FILE_SIZE, 0L)).longValue();
    }

    public String getMetadataHash() {
        return (String) getValueOf(NAME_METADATA_HASH, "");
    }

    public long getMetadataSize() {
        return ((Long) getValueOf(NAME_METADATA_SIZE, 0L)).longValue();
    }

    public String getMrType() {
        return (String) getValueOf(NAME_MR_TYPE, "");
    }

    public long getOffset() {
        return ((Long) getValueOf(NAME_OFFSET, 0L)).longValue();
    }

    public String getOneUiType() {
        return (String) getValueOf(NAME_ONE_UI_TYPE, "");
    }

    public String getSecurityPatchVersion() {
        return (String) getValueOf(NAME_SECURITY_PATCH_VERSION, "");
    }

    public String getUpdateFwOsVersion() {
        return (String) getValueOf(NAME_UPDATE_FW_OS_VERSION, "");
    }

    public String getUpdateFwVersion() {
        return (String) getValueOf(NAME_UPDATE_FW_VERSION, "");
    }

    public String getUpdateOneUiVersion() {
        return (String) getValueOf(NAME_UPDATE_ONE_UI_VERSION, "");
    }

    public boolean isMajor() {
        return VALUE_ONE_UI_TYPE_MAJOR.equals(getOneUiType());
    }

    public boolean isMinor() {
        return !isMajor();
    }

    public void save(String str) {
        runInTransaction(new o(this, 8, str));
    }

    public void saveInstallParamForABUpdate(final String str, final long j5, final String str2, final long j6, final long j7, final long j8, final String str3) {
        runInTransaction(new Runnable() { // from class: com.idm.fotaagent.database.room.data.repository.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f6259d.lambda$saveInstallParamForABUpdate$1(str, j5, str2, j6, j7, j8, str3);
            }
        });
    }
}
