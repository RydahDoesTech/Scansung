package com.idm.fotaagent.abupdate.abenabler.utils.metadata;

import android.content.Context;
import android.net.TrafficStats;
import com.idm.adapter.filesystem.c;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.abupdate.updateengine.ErrorCode;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.adapter.IDMAdapterNetworkImpl;
import com.idm.fotaagent.enabler.adapter.NetworkApnManager;
import com.idm.fotaagent.enabler.fumo.exception.insufficientmemory.InvalidStateException;
import com.idm.fotaagent.utils.GeneralUtils;
import com.idm.fotaagent.utils.rangerequest.FileRangeRequest;
import com.idm.fotaagent.utils.rangerequest.HttpRangeRequest;
import com.idm.fotaagent.utils.rangerequest.RangeRequest;
import com.idm.fotaagent.utils.rangerequest.exception.HttpResponseCodeException;
import com.idm.fotaagent.utils.storage.FileManager;
import com.samsung.android.fotaagent.common.FotaTelephonyManager;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.Flavor;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class MetadataDownloader {
    private static final AtomicBoolean downloading = new AtomicBoolean(false);

    public static class AlreadyDownloadingException extends InvalidStateException {
        private static final long serialVersionUID = 3869683711675783131L;
    }

    public static class DownloadFailedException extends InvalidStateException {
        private static final long serialVersionUID = -7676470398786631561L;
        private final ErrorCode errorCode;

        public DownloadFailedException() {
            this(ErrorCode.METADATA_DOWNLOAD_GENERIC_FAILED);
        }

        public ErrorCode getErrorCode() {
            return this.errorCode;
        }

        public DownloadFailedException(Throwable th) {
            super(th);
            this.errorCode = ErrorCode.METADATA_DOWNLOAD_GENERIC_FAILED;
        }

        public DownloadFailedException(ErrorCode errorCode) {
            this.errorCode = errorCode;
        }
    }

    public static class DownloadSuspendedException extends InvalidStateException {
        private static final long serialVersionUID = 2084849013158852555L;
    }

    public static class InstanceLazyHolder {
        public static final MetadataDownloader INSTANCE = new MetadataDownloader();

        private InstanceLazyHolder() {
        }
    }

    public enum MetadataDownloadState {
        SUCCESS { // from class: com.idm.fotaagent.abupdate.abenabler.utils.metadata.MetadataDownloader.MetadataDownloadState.1
            @Override // com.idm.fotaagent.abupdate.abenabler.utils.metadata.MetadataDownloader.MetadataDownloadState
            public void throwIfNeeded() {
            }
        },
        FAILURE { // from class: com.idm.fotaagent.abupdate.abenabler.utils.metadata.MetadataDownloader.MetadataDownloadState.2
            @Override // com.idm.fotaagent.abupdate.abenabler.utils.metadata.MetadataDownloader.MetadataDownloadState
            public void throwIfNeeded() throws DownloadFailedException {
                throw new DownloadFailedException();
            }
        },
        SUSPENDED { // from class: com.idm.fotaagent.abupdate.abenabler.utils.metadata.MetadataDownloader.MetadataDownloadState.3
            @Override // com.idm.fotaagent.abupdate.abenabler.utils.metadata.MetadataDownloader.MetadataDownloadState
            public void throwIfNeeded() throws DownloadSuspendedException {
                throw new DownloadSuspendedException();
            }
        },
        TIMEOUT { // from class: com.idm.fotaagent.abupdate.abenabler.utils.metadata.MetadataDownloader.MetadataDownloadState.4
            @Override // com.idm.fotaagent.abupdate.abenabler.utils.metadata.MetadataDownloader.MetadataDownloadState
            public void throwIfNeeded() throws DownloadFailedException {
                throw new DownloadFailedException();
            }
        };

        public abstract void throwIfNeeded();
    }

    private void changePermissionTo644() throws IOException {
        HashSet hashSet = new HashSet();
        hashSet.add(PosixFilePermission.OWNER_READ);
        hashSet.add(PosixFilePermission.OWNER_WRITE);
        hashSet.add(PosixFilePermission.GROUP_READ);
        hashSet.add(PosixFilePermission.OTHERS_READ);
        Files.setPosixFilePermissions(downloadPath(), hashSet);
    }

    private void deinitialize() {
        downloading.set(false);
        NetworkApnManager.get().close();
    }

    private Context getContext() {
        return IDMApplication.idmGetContext();
    }

    public static MetadataDownloader getInstance() {
        return InstanceLazyHolder.INSTANCE;
    }

    private void initialize() {
        if (Flavor.Apn.usesConfiguredApn(FotaTelephonyManager.getDataSimSlotId(getContext()))) {
            NetworkApnManager.get().open();
        }
        TrafficStats.setThreadStatsUid(IDMAdapterNetworkImpl.FOTA_UID);
    }

    private URL url(String str) {
        return new URL(new ActionInfoDao(str).getObjectUrl());
    }

    private URL urlWithParam(String str) {
        return new URL(GeneralUtils.appendExtraParam(getContext(), new ActionInfoDao(str).getObjectUrl()));
    }

    public boolean download(String str) throws Throwable {
        DownloadTask downloadTask;
        FileManager fileManager = new FileManager();
        if (fileManager.existsMetadataFile() && fileManager.getMetadataFileSize() == new InstallParamRepository(getContext()).getMetadataFileSize()) {
            Log.I("metadata file already exists");
            return false;
        }
        if (!downloading.compareAndSet(false, true)) {
            throw new AlreadyDownloadingException();
        }
        TimeoutTask timeoutTask = null;
        try {
            initialize();
            TimeoutTask timeoutTask2 = new TimeoutTask();
            try {
                downloadTask = new DownloadTask(str, rangeRequest(str, timeoutTask2));
                try {
                    MetadataDownloadState metadataDownloadState = (MetadataDownloadState) CompletableFuture.anyOf(CompletableFuture.supplyAsync(downloadTask), CompletableFuture.supplyAsync(timeoutTask2)).get();
                    Log.I("metadataDownloadState : " + metadataDownloadState);
                    metadataDownloadState.throwIfNeeded();
                    changePermissionTo644();
                    Optional.ofNullable(timeoutTask2).ifPresent(new c(3));
                    Optional.ofNullable(downloadTask).ifPresent(new c(4));
                    deinitialize();
                    return true;
                } catch (IOException | InterruptedException | RuntimeException | ExecutionException e5) {
                    e = e5;
                    timeoutTask = timeoutTask2;
                    try {
                        if (e instanceof ExecutionException) {
                            Throwable cause = e.getCause();
                            if (cause instanceof HttpResponseCodeException) {
                                int responseCode = ((HttpResponseCodeException) cause).getResponseCode();
                                Log.I("httpResponseCode : " + responseCode + ", errorCode : " + HTTPResponseMapper.of(responseCode));
                                throw new DownloadFailedException(HTTPResponseMapper.of(((HttpResponseCodeException) cause).getResponseCode()));
                            }
                        }
                        throw new DownloadFailedException(e);
                    } catch (Throwable th) {
                        th = th;
                        Optional.ofNullable(timeoutTask).ifPresent(new c(3));
                        Optional.ofNullable(downloadTask).ifPresent(new c(4));
                        deinitialize();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    timeoutTask = timeoutTask2;
                    Optional.ofNullable(timeoutTask).ifPresent(new c(3));
                    Optional.ofNullable(downloadTask).ifPresent(new c(4));
                    deinitialize();
                    throw th;
                }
            } catch (IOException | InterruptedException | RuntimeException | ExecutionException e6) {
                e = e6;
                downloadTask = null;
            } catch (Throwable th3) {
                th = th3;
                downloadTask = null;
            }
        } catch (IOException | InterruptedException | RuntimeException | ExecutionException e7) {
            e = e7;
            downloadTask = null;
        } catch (Throwable th4) {
            th = th4;
            downloadTask = null;
        }
    }

    public Path downloadPath() {
        return new File(new FileManager().getPayloadMetadataPath()).toPath();
    }

    public RangeRequest rangeRequest(String str, RangeRequest.OnFileLengthChangedListener onFileLengthChangedListener) {
        return new ActionInfoDao(str).isTriggeredBySideload() ? new FileRangeRequest(url(str), downloadPath()) : new HttpRangeRequest(urlWithParam(str), downloadPath(), onFileLengthChangedListener);
    }

    private MetadataDownloader() {
        Log.I("");
    }
}
