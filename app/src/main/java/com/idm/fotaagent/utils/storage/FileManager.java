package com.idm.fotaagent.utils.storage;

import android.os.StatFs;
import com.idm.adapter.filesystem.IDMFileSystemAdapter;
import com.idm.adapter.filesystem.c;
import com.idm.exception.file.IDMExceptionFileDelete;
import com.idm.exception.file.IDMExceptionFileDirCreate;
import com.idm.exception.file.IDMExceptionFileNotFound;
import com.idm.exception.file.IDMExceptionFileRead;
import com.samsung.android.fotaagent.common.log.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public class FileManager {
    public static final String[] EXCLUSION_FOR_CACHE_CLEAR = {"lost+found", "recovery", "fota", "omc", "backup"};
    private static final String NAME_PAYLOAD_METADATA = "payload_metadata.bin";
    static final String PATH_COMMAND_FILE = "/cache/recovery/command";
    public static final String PATH_FOTA_STATUS = "/cache/fota/fota.status";
    static final String PATH_UNCRYPT_FILE = "/cache/recovery/uncrypt_file";
    private final IDMFileSystemAdapter fileAdapter = new IDMFileSystemAdapter();

    private void clearDirectory(File file, final String... strArr) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        try {
            Arrays.stream(fileArrListFiles).filter(new Predicate() { // from class: com.idm.fotaagent.utils.storage.a
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return this.f6373a.lambda$clearDirectory$0(strArr, (File) obj);
                }
            }).forEach(new com.idm.fotaagent.enabler.adapter.a(this, 5, strArr));
        } catch (Exception e5) {
            Log.printStackTrace(e5);
        }
    }

    private boolean exists(String str) {
        try {
            this.fileAdapter.idmFileExists(str);
            return true;
        } catch (IDMExceptionFileNotFound | IDMExceptionFileRead unused) {
            Log.E("Not exist in " + str);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$clearDirectory$0(String[] strArr, File file) {
        return !shouldExclude(file.getName(), strArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearDirectory$1(String[] strArr, File file) {
        if (file.isDirectory()) {
            clearDirectory(file, strArr);
            return;
        }
        if (file.delete()) {
            Log.I("succeeded to delete : " + file.getName());
        } else {
            Log.I("failed to delete : " + file.getPath());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$shouldExclude$2(String str) {
        Log.W("Skip deleting : " + str);
    }

    public void clearCache() {
        clearDirectory(new File(StorageType.CACHE.path()), EXCLUSION_FOR_CACHE_CLEAR);
    }

    public void clearCommandAndUncryptFile() {
        deleteFile(PATH_COMMAND_FILE, PATH_UNCRYPT_FILE);
    }

    public boolean createDeltaFolder(StorageType storageType) {
        try {
            String strPathForFotaFolder = storageType.pathForFotaFolder();
            Log.I("Delta Path : " + strPathForFotaFolder);
            this.fileAdapter.idmDirCreate(strPathForFotaFolder);
            return true;
        } catch (IDMExceptionFileDirCreate e5) {
            Log.printStackTrace(e5);
            return false;
        }
    }

    public void deleteDeltaAndMetadataFiles() {
        deleteFile(StorageType.CACHE.pathForDeltaFile(), StorageType.DATA.pathForDeltaFile(), getPayloadMetadataPath());
    }

    public void deleteFile(String... strArr) {
        for (String str : strArr) {
            try {
                this.fileAdapter.idmFileDelete(str);
                Log.I("succeeded to delete file. path : " + str);
            } catch (IDMExceptionFileDelete e5) {
                Log.printStackTrace(e5);
            }
        }
    }

    public void deleteMetadataFile() {
        deleteFile(getPayloadMetadataPath());
    }

    public boolean existsDeltaFileInCache() {
        return exists(StorageType.CACHE.pathForDeltaFile());
    }

    public boolean existsDeltaFileInData() {
        return exists(StorageType.DATA.pathForDeltaFile());
    }

    public boolean existsMetadataFile() {
        return exists(getPayloadMetadataPath());
    }

    public long getAvailableBytes(int i5) {
        try {
            return new StatFs(StorageType.get(i5).path()).getAvailableBytes();
        } catch (IllegalArgumentException | NullPointerException e5) {
            Log.printStackTrace(e5);
            return 0L;
        }
    }

    public long getAvailableBytesAtCache() {
        return getAvailableBytes(StorageType.CACHE.type());
    }

    public long getAvailableBytesAtData() {
        return getAvailableBytes(StorageType.DATA.type());
    }

    public long getDeltaFileSize(int i5) {
        return getDeltaFileSize(StorageType.get(i5).pathForDeltaFile());
    }

    public long getMetadataFileSize() {
        try {
            return this.fileAdapter.idmGetFileSize(getPayloadMetadataPath());
        } catch (IDMExceptionFileNotFound | NullPointerException e5) {
            Log.printStackTrace(e5);
            return 0L;
        }
    }

    public String getPayloadMetadataPath() {
        return StorageType.DATA.pathForFotaFolder() + "/payload_metadata.bin";
    }

    public boolean shouldExclude(String str, String... strArr) {
        Stream stream = Arrays.stream(strArr);
        Objects.requireNonNull(str);
        return stream.filter(new com.idm.core.ddf.a(str, 3)).peek(new c(24)).count() > 0;
    }

    public long getDeltaFileSize(String str) {
        try {
            return this.fileAdapter.idmGetFileSize(str);
        } catch (NullPointerException e5) {
            throw new IDMExceptionFileNotFound(e5);
        }
    }
}
