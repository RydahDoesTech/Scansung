package com.idm.fotaagent.abupdate.abenabler.utils.metadata;

import E2.b;
import com.idm.adapter.filesystem.c;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.abupdate.abenabler.utils.metadata.MetadataDownloader;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.network.DLNetworkChecker;
import com.idm.fotaagent.utils.rangerequest.HttpRangeRequest;
import com.idm.fotaagent.utils.rangerequest.RangeRequest;
import com.idm.fotaagent.utils.rangerequest.exception.HttpResponseCodeException;
import com.idm.fotaagent.utils.storage.FileManager;
import com.samsung.android.fotaagent.common.log.Log;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Optional;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public class DownloadTask implements Supplier<MetadataDownloader.MetadataDownloadState> {
    private static final int METADATA_DOWNLOAD_RETRY_COUNT = 15;
    private final ActionInfoDao actionInfoDao;
    private final RangeRequest rangeRequest;
    private volatile boolean stopRequested = false;
    private final String taskId;

    public DownloadTask(String str, RangeRequest rangeRequest) {
        this.taskId = str;
        this.rangeRequest = rangeRequest;
        this.actionInfoDao = new ActionInfoDao(str);
    }

    private void append(String str, RangeRequest rangeRequest) throws MetadataDownloader.DownloadSuspendedException, MetadataDownloader.DownloadFailedException {
        while (true) {
            try {
                rangeRequest.append(range(new FileManager().getMetadataFileSize()));
                return;
            } catch (IOException | RuntimeException | URISyntaxException e5) {
                if (e5 instanceof HttpResponseCodeException) {
                    HttpResponseCodeException httpResponseCodeException = (HttpResponseCodeException) e5;
                    if (!httpResponseCodeException.allowsRetry()) {
                        throw httpResponseCodeException;
                    }
                }
                if (this.stopRequested) {
                    throw new MetadataDownloader.DownloadFailedException(e5);
                }
                checkRetriable(e5, str);
            }
        }
    }

    private void checkRetriable(Exception exc, String str) throws MetadataDownloader.DownloadSuspendedException, MetadataDownloader.DownloadFailedException {
        int dlCurrentRetryCount = this.actionInfoDao.getDlCurrentRetryCount();
        Log.I("currentRetryCount : " + dlCurrentRetryCount + ", maxRetryCount : 15");
        if (dlCurrentRetryCount >= 15) {
            throw new MetadataDownloader.DownloadFailedException(exc);
        }
        if (!DLNetworkChecker.getInstance().isDLRetriable(str)) {
            throw new MetadataDownloader.DownloadSuspendedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HttpRangeRequest lambda$stopIfRunning$0(RangeRequest rangeRequest) {
        if (rangeRequest instanceof HttpRangeRequest) {
            return (HttpRangeRequest) rangeRequest;
        }
        return null;
    }

    private RangeRequest.Range range(long j5) {
        InstallParamRepository installParamRepository = new InstallParamRepository(IDMApplication.idmGetContext());
        return new RangeRequest.Range(installParamRepository.getOffset() + j5, (installParamRepository.getMetadataFileSize() + installParamRepository.getOffset()) - 1);
    }

    public void stopIfRunning() {
        Log.I("");
        this.stopRequested = true;
        Optional.of(this.rangeRequest).map(new b(3)).map(new b(4)).ifPresent(new c(2));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.function.Supplier
    public MetadataDownloader.MetadataDownloadState get() {
        try {
            append(this.taskId, this.rangeRequest);
            return MetadataDownloader.MetadataDownloadState.SUCCESS;
        } catch (MetadataDownloader.DownloadFailedException e5) {
            Log.printStackTrace(e5);
            return MetadataDownloader.MetadataDownloadState.FAILURE;
        } catch (MetadataDownloader.DownloadSuspendedException e6) {
            Log.printStackTrace(e6);
            return MetadataDownloader.MetadataDownloadState.SUSPENDED;
        }
    }
}
