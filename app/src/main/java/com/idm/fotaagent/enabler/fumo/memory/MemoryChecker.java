package com.idm.fotaagent.enabler.fumo.memory;

import com.idm.exception.file.IDMExceptionFileNotFound;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.exception.insufficientmemory.InsufficientMemoryToDownloadException;
import com.idm.fotaagent.enabler.fumo.exception.insufficientmemory.InsufficientMemoryToInstallException;
import com.idm.fotaagent.enabler.fumo.exception.insufficientmemory.NotFoundDeltaFileException;
import com.idm.fotaagent.enabler.ui.dialog.model.InsufficientMemoryDialogModel;
import com.idm.fotaagent.utils.storage.FileManager;
import com.idm.fotaagent.utils.storage.StorageConstants;
import com.idm.fotaagent.utils.storage.StorageType;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
abstract class MemoryChecker {
    protected final ActionInfoDao actionInfoDao;
    protected final FileManager fileManager = new FileManager();
    protected final InstallParamRepository installParamRepository = new InstallParamRepository(IDMApplication.idmGetContext());

    public static class ForCache extends MemoryChecker {
        public ForCache(String str) {
            super(str);
        }

        @Override // com.idm.fotaagent.enabler.fumo.memory.MemoryChecker
        @Deprecated
        public void checkInstallable() {
        }

        @Override // com.idm.fotaagent.enabler.fumo.memory.MemoryChecker
        public long getFreeSize() {
            return this.fileManager.getAvailableBytesAtCache();
        }

        @Override // com.idm.fotaagent.enabler.fumo.memory.MemoryChecker
        public long getRequiredMarginForDownload() {
            long objectSize = this.actionInfoDao.getObjectSize();
            long cacheMargin = this.installParamRepository.getCacheMargin() * StorageConstants.MEGA_BYTES;
            long j5 = objectSize + cacheMargin;
            Log.I("Cache - delta size : " + objectSize + ", cache margin : " + cacheMargin + ", sum : " + j5);
            return j5;
        }

        @Override // com.idm.fotaagent.enabler.fumo.memory.MemoryChecker
        public long getRequiredMarginForInstall() {
            return 0L;
        }

        @Override // com.idm.fotaagent.enabler.fumo.memory.MemoryChecker
        public void setRequiredBytesIfNeeded(long j5) {
        }
    }

    public static class ForData extends MemoryChecker {
        public ForData(String str) {
            super(str);
        }

        @Override // com.idm.fotaagent.enabler.fumo.memory.MemoryChecker
        public long getFreeSize() {
            return this.fileManager.getAvailableBytesAtData();
        }

        @Override // com.idm.fotaagent.enabler.fumo.memory.MemoryChecker
        public long getRequiredMarginForDownload() {
            long dataMargin = this.installParamRepository.getDataMargin() * StorageConstants.MEGA_BYTES;
            long objectSize = this.actionInfoDao.getObjectSize();
            long jMax = Math.max(objectSize, dataMargin);
            Log.I("### Download at Data - max(delta size: " + objectSize + ", needSpace:" + dataMargin + "), result : " + jMax);
            return jMax;
        }

        @Override // com.idm.fotaagent.enabler.fumo.memory.MemoryChecker
        public long getRequiredMarginForInstall() {
            long dataMargin = this.installParamRepository.getDataMargin() * StorageConstants.MEGA_BYTES;
            long objectSize = this.actionInfoDao.getObjectSize();
            if (this.actionInfoDao.getDeltaIndex() == StorageType.DATA.type()) {
                dataMargin = objectSize >= dataMargin ? 0L : dataMargin - objectSize;
            }
            Log.I("### Need free space for install : " + dataMargin);
            return dataMargin;
        }

        @Override // com.idm.fotaagent.enabler.fumo.memory.MemoryChecker
        public void setRequiredBytesIfNeeded(long j5) {
            InsufficientMemoryDialogModel.setRequiredBytes(j5);
        }
    }

    public MemoryChecker(String str) {
        this.actionInfoDao = new ActionInfoDao(str);
    }

    private long getDeltaSize(String str) throws NotFoundDeltaFileException {
        try {
            return this.fileManager.getDeltaFileSize(str);
        } catch (IDMExceptionFileNotFound e5) {
            throw new NotFoundDeltaFileException(e5);
        }
    }

    public void checkDownloadable() {
        checkDownloadable(getRequiredMarginForDownload());
    }

    public void checkInstallable() {
        long requiredMarginForInstall = getRequiredMarginForInstall();
        long freeSize = getFreeSize();
        if (requiredMarginForInstall < freeSize) {
            Log.I("### need : " + requiredMarginForInstall + " now has : " + freeSize + ") ... Memory SUFFICIENT...");
            return;
        }
        Log.I("### need : " + requiredMarginForInstall + " but now has : " + freeSize + ") ... Memory INSUFFICIENT...");
        InsufficientMemoryDialogModel.setRequiredBytes(requiredMarginForInstall - freeSize);
        throw new InsufficientMemoryToInstallException("Memory NOT SUFFICIENT to install");
    }

    public abstract long getFreeSize();

    public abstract long getRequiredMarginForDownload();

    public abstract long getRequiredMarginForInstall();

    public abstract void setRequiredBytesIfNeeded(long j5);

    public void checkDownloadable(String str) {
        long deltaSize = getDeltaSize(str);
        long requiredMarginForDownload = getRequiredMarginForDownload() - deltaSize;
        Log.I("needSpace : " + requiredMarginForDownload + ", dataMargin : " + getRequiredMarginForDownload() + ", deltaSize : " + deltaSize);
        checkDownloadable(requiredMarginForDownload);
    }

    private void checkDownloadable(long j5) throws InsufficientMemoryToDownloadException {
        long freeSize = getFreeSize();
        if (j5 < freeSize) {
            return;
        }
        Log.I("### need : " + j5 + " but now has : " + freeSize + ") ... Memory INSUFFICIENT...");
        setRequiredBytesIfNeeded(j5 - freeSize);
        throw new InsufficientMemoryToDownloadException("Memory NOT SUFFICIENT to download");
    }
}
