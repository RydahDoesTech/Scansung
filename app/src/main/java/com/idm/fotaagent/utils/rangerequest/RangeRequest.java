package com.idm.fotaagent.utils.rangerequest;

import C1.b;
import com.samsung.android.fotaagent.common.log.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class RangeRequest {
    private static final long FILE_LENGTH_WATCH_INTERVAL_IN_MILLIS = 250;
    protected final Path downloadPath;
    final OnFileLengthChangedListener onFileLengthChangedListener;
    protected final URL url;

    public interface OnFileLengthChangedListener {
        void onFileLengthChanged(long j5);
    }

    public static class Range {
        private final long end;
        private final long start;

        public Range(long j5, long j6) {
            if (j5 < 0) {
                throw new IllegalArgumentException("start(" + j5 + ") should be greater than or equal to zero");
            }
            if (j6 < 0) {
                throw new IllegalArgumentException("end(" + j6 + ") should be greater than or equal to zero: ");
            }
            if (j5 <= j6) {
                this.start = j5;
                this.end = j6;
                return;
            }
            throw new IllegalArgumentException("start(" + j5 + ") should be less than or equal to end(" + j6 + ")");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long count() {
            return (this.end - this.start) + 1;
        }

        public long end() {
            return this.end;
        }

        public long start() {
            return this.start;
        }
    }

    public RangeRequest(URL url, Path path, OnFileLengthChangedListener onFileLengthChangedListener) {
        this.url = url;
        this.downloadPath = path;
        this.onFileLengthChangedListener = onFileLengthChangedListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void watchFileLengthChange() throws IOException {
        try {
            WatchService watchServiceNewWatchService = FileSystems.getDefault().newWatchService();
            try {
                Path parent = this.downloadPath.toAbsolutePath().getParent();
                parent.register(watchServiceNewWatchService, StandardWatchEventKinds.ENTRY_MODIFY);
                while (true) {
                    WatchKey watchKeyTake = watchServiceNewWatchService.take();
                    Iterator<WatchEvent<?>> it = watchKeyTake.pollEvents().iterator();
                    while (it.hasNext()) {
                        Path pathResolve = parent.resolve((Path) it.next().context());
                        if (pathResolve.equals(this.downloadPath)) {
                            this.onFileLengthChangedListener.onFileLengthChanged(pathResolve.toFile().length());
                        }
                    }
                    watchKeyTake.reset();
                    TimeUnit.MILLISECONDS.sleep(FILE_LENGTH_WATCH_INTERVAL_IN_MILLIS);
                }
            } catch (Throwable th) {
                if (watchServiceNewWatchService != null) {
                    try {
                        watchServiceNewWatchService.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            Log.printStackTrace(e5);
        } catch (InterruptedException unused) {
            Log.I("interrupted");
            this.onFileLengthChangedListener.onFileLengthChanged(this.downloadPath.toFile().length());
        }
    }

    public void append(Range range) {
        execute(range, false);
    }

    public void execute(Range range, boolean z4) {
        Thread thread = null;
        try {
            FileChannel fileChannelOpen = FileChannel.open(this.downloadPath, StandardOpenOption.WRITE, StandardOpenOption.CREATE);
            try {
                ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(getInputStream(range));
                try {
                    if (this.onFileLengthChangedListener != null) {
                        Thread thread2 = new Thread(new b(22, this));
                        try {
                            thread2.setDaemon(true);
                            thread2.start();
                            thread = thread2;
                        } catch (Throwable th) {
                            th = th;
                            thread = thread2;
                            if (readableByteChannelNewChannel != null) {
                                try {
                                    readableByteChannelNewChannel.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                    if (z4) {
                        fileChannelOpen.truncate(0L);
                    }
                    long jTransferFrom = 0;
                    while (jTransferFrom < range.count()) {
                        jTransferFrom += fileChannelOpen.transferFrom(readableByteChannelNewChannel, fileChannelOpen.size(), range.count() - jTransferFrom);
                        Log.I("countTransferred: " + jTransferFrom);
                    }
                    fileChannelOpen.force(true);
                    if (readableByteChannelNewChannel != null) {
                        readableByteChannelNewChannel.close();
                    }
                    fileChannelOpen.close();
                } catch (Throwable th3) {
                    th = th3;
                }
            } finally {
            }
        } finally {
            finalize(thread);
        }
    }

    public void finalize(Thread thread) {
        if (thread != null) {
            thread.interrupt();
        }
    }

    public abstract InputStream getInputStream(Range range);

    public void overwrite(Range range) {
        execute(range, true);
    }
}
