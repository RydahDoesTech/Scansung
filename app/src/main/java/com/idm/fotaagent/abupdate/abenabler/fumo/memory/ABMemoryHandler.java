package com.idm.fotaagent.abupdate.abenabler.fumo.memory;

import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.abupdate.abenabler.fumo.exception.insufficientmemory.AllocateFailedException;
import com.idm.fotaagent.abupdate.abenabler.fumo.exception.insufficientmemory.InsufficientMemoryToAllocateException;
import com.idm.fotaagent.abupdate.abenabler.utils.metadata.MetadataDownloader;
import com.idm.fotaagent.abupdate.enablerinterface.MemoryHandler;
import com.idm.fotaagent.abupdate.manager.EnablerManager;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.memory.FumoMemoryHandler;
import com.idm.fotaagent.enabler.ui.dialog.model.InsufficientMemoryDialogModel;
import com.idm.fotaagent.utils.storage.FileManager;
import com.idm.fotaagent.utils.storage.StorageConstants;
import com.idm.fotaagent.utils.storage.StorageType;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class ABMemoryHandler implements MemoryHandler {
    protected final ActionInfoDao actionInfoDao;
    protected final String taskId;

    public static class Installable extends ABMemoryHandler {
        public Installable(String str) {
            super(str);
            Log.I("");
        }

        @Override // com.idm.fotaagent.abupdate.abenabler.fumo.memory.ABMemoryHandler, com.idm.fotaagent.abupdate.enablerinterface.MemoryHandler
        public void check() throws InsufficientMemoryToAllocateException {
            checkStorage();
            Log.I("available to apply update");
        }
    }

    public ABMemoryHandler(String str) {
        Log.I("");
        this.taskId = str;
        this.actionInfoDao = new ActionInfoDao(str);
    }

    public static ABMemoryHandler get(String str, FumoMemoryHandler.CheckStatus checkStatus) {
        return checkStatus == FumoMemoryHandler.CheckStatus.INSTALLABLE ? new Installable(str) : new ABMemoryHandler(str);
    }

    public void allocateAndCheckStorage(String str) throws InsufficientMemoryToAllocateException, AllocateFailedException {
        long jAllocateSpaceAndGetRequiredFreeMemory = EnablerManager.getInstance().allocateSpaceAndGetRequiredFreeMemory(str);
        if (jAllocateSpaceAndGetRequiredFreeMemory < 0) {
            throw new AllocateFailedException("requiredBytes is negative");
        }
        long requiredDataMargin = getRequiredDataMargin();
        long availableBytesAtData = new FileManager().getAvailableBytesAtData();
        long metadataFileSize = new InstallParamRepository(IDMApplication.idmGetContext()).getMetadataFileSize();
        Log.I("availableBytes : " + availableBytesAtData + ", requiredBytes : " + jAllocateSpaceAndGetRequiredFreeMemory + ", marginBytes : " + requiredDataMargin + " , metadataSize : " + metadataFileSize);
        long j5 = jAllocateSpaceAndGetRequiredFreeMemory + requiredDataMargin + metadataFileSize;
        if (availableBytesAtData >= j5) {
            return;
        }
        long j6 = j5 - availableBytesAtData;
        InsufficientMemoryDialogModel.setRequiredBytes(j6);
        throw new InsufficientMemoryToAllocateException("Memory NOT INSUFFICIENT for VAB", j6);
    }

    @Override // com.idm.fotaagent.abupdate.enablerinterface.MemoryHandler
    public void check() throws Throwable {
        MetadataDownloader metadataDownloader = MetadataDownloader.getInstance();
        boolean zDownload = metadataDownloader.download(this.taskId);
        this.actionInfoDao.setDeltaIndex(StorageType.DATA.type());
        if (zDownload) {
            allocateAndCheckStorage(metadataDownloader.downloadPath().toString());
        } else {
            checkStorage();
        }
        Log.I("available to download and install");
    }

    public void checkStorage() throws InsufficientMemoryToAllocateException {
        long requiredDataMargin = getRequiredDataMargin();
        long availableBytesAtData = new FileManager().getAvailableBytesAtData();
        Log.I("availableBytes : " + availableBytesAtData + ", marginBytes : " + requiredDataMargin);
        if (availableBytesAtData >= requiredDataMargin) {
            return;
        }
        long j5 = requiredDataMargin - availableBytesAtData;
        InsufficientMemoryDialogModel.setRequiredBytes(j5);
        throw new InsufficientMemoryToAllocateException("Memory NOT INSUFFICIENT for VAB", j5);
    }

    public long getRequiredDataMargin() {
        return new InstallParamRepository(IDMApplication.idmGetContext()).getDataMargin() * StorageConstants.MEGA_BYTES;
    }
}
