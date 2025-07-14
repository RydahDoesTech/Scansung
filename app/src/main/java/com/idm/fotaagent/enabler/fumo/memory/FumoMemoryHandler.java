package com.idm.fotaagent.enabler.fumo.memory;

import com.idm.fotaagent.abupdate.enablerinterface.MemoryHandler;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.exception.insufficientmemory.DownloadPathSQLWriteFailException;
import com.idm.fotaagent.enabler.fumo.exception.insufficientmemory.FolderCreateFailException;
import com.idm.fotaagent.enabler.fumo.exception.insufficientmemory.InsufficientMemoryException;
import com.idm.fotaagent.enabler.fumo.exception.insufficientmemory.InvalidStateException;
import com.idm.fotaagent.enabler.fumo.memory.MemoryChecker;
import com.idm.fotaagent.utils.storage.FileManager;
import com.idm.fotaagent.utils.storage.StorageType;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public abstract class FumoMemoryHandler implements MemoryHandler {
    protected final ActionInfoDao actionInfoDao;
    protected final FileManager fileManager = new FileManager();
    protected final String taskId;

    public enum CheckStatus {
        DOWNLOADABLE,
        RESUMEABLE,
        INSTALLABLE
    }

    public static class Downloadable extends FumoMemoryHandler {
        public Downloadable(String str) {
            super(str);
        }

        @Override // com.idm.fotaagent.abupdate.enablerinterface.MemoryHandler
        public void check() throws FolderCreateFailException, DownloadPathSQLWriteFailException {
            Log.I("");
            try {
                checkAvailableInCache();
            } catch (InsufficientMemoryException | InvalidStateException unused) {
                checkAvailableInData();
            }
        }

        public void checkAvailableInCache() throws DownloadPathSQLWriteFailException {
            MemoryChecker.ForCache forCache = new MemoryChecker.ForCache(this.taskId);
            try {
                forCache.checkDownloadable();
            } catch (InsufficientMemoryException unused) {
                Log.I("CacheMemoryPath : " + StorageType.CACHE.pathForFotaFolder());
                this.fileManager.clearCache();
                forCache.checkDownloadable();
            }
            ActionInfoDao actionInfoDao = this.actionInfoDao;
            StorageType storageType = StorageType.CACHE;
            actionInfoDao.setDeltaIndex(storageType.type());
            this.actionInfoDao.setDownloadPath(storageType.pathForDeltaFile());
            Log.I("Download at Cache Memory >>> IDMDB_FS_OK...");
        }

        public void checkAvailableInData() throws FolderCreateFailException, DownloadPathSQLWriteFailException {
            MemoryChecker.ForData forData = new MemoryChecker.ForData(this.taskId);
            ActionInfoDao actionInfoDao = this.actionInfoDao;
            StorageType storageType = StorageType.DATA;
            actionInfoDao.setDeltaIndex(storageType.type());
            this.actionInfoDao.setDownloadPath(storageType.pathForDeltaFile());
            forData.checkDownloadable();
            Log.I("Download at Interior memory >>> IDMDB_FS_OK...");
            StorageType storageType2 = StorageType.get(this.actionInfoDao.getDeltaIndex());
            Log.I("storageType : " + storageType2);
            if (!this.fileManager.createDeltaFolder(storageType2)) {
                throw new FolderCreateFailException();
            }
        }
    }

    public static class Installable extends FumoMemoryHandler {
        public Installable(String str) {
            super(str);
        }

        @Override // com.idm.fotaagent.abupdate.enablerinterface.MemoryHandler
        public void check() {
            new MemoryChecker.ForData(this.taskId).checkInstallable();
        }
    }

    public static class Resumable extends FumoMemoryHandler {
        public Resumable(String str) {
            super(str);
        }

        @Override // com.idm.fotaagent.abupdate.enablerinterface.MemoryHandler
        public void check() {
            Log.I("");
            String downloadPath = this.actionInfoDao.getDownloadPath();
            if (downloadPath.contains(StorageType.CACHE.path())) {
                new MemoryChecker.ForCache(this.taskId).checkDownloadable(downloadPath);
            } else {
                new MemoryChecker.ForData(this.taskId).checkDownloadable(downloadPath);
            }
        }
    }

    public FumoMemoryHandler(String str) {
        this.taskId = str;
        this.actionInfoDao = new ActionInfoDao(str);
    }

    public static FumoMemoryHandler get(String str, CheckStatus checkStatus) {
        return checkStatus == CheckStatus.DOWNLOADABLE ? new Downloadable(str) : checkStatus == CheckStatus.RESUMEABLE ? new Resumable(str) : new Installable(str);
    }
}
