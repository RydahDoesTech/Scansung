package com.samsung.android.fotaagent.common.log;

import android.content.Context;
import com.idm.providers.mo.IDMMoInterface;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

/* loaded from: classes.dex */
interface RotatingFileWriter {
    public static final RotatingFileWriter STUB = new RotatingFileWriter() { // from class: com.samsung.android.fotaagent.common.log.RotatingFileWriter.1
        @Override // com.samsung.android.fotaagent.common.log.RotatingFileWriter
        public void close() {
        }

        @Override // com.samsung.android.fotaagent.common.log.RotatingFileWriter
        public void force() {
        }

        @Override // com.samsung.android.fotaagent.common.log.RotatingFileWriter
        public boolean isOpen() {
            return true;
        }

        @Override // com.samsung.android.fotaagent.common.log.RotatingFileWriter
        public void println(String str) {
        }
    };

    public static class Real implements RotatingFileWriter {
        private static final Charset CHARSET = Charset.defaultCharset();
        private final FileChannel fileChannel;
        private final Path filePath;
        private final Object lockForRotation;
        private final int minBytesForRotation;
        private final int numFiles;

        private void rotateIfNeeded() {
            if (this.fileChannel.size() <= this.minBytesForRotation) {
                return;
            }
            synchronized (this.lockForRotation) {
                try {
                    if (this.fileChannel.size() <= this.minBytesForRotation) {
                        return;
                    }
                    Path parent = this.filePath.getParent();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.filePath.getFileName());
                    sb.append(IDMMoInterface.IDM_MO_ROOT_PATH);
                    sb.append(this.numFiles - 1);
                    Path pathResolve = parent.resolve(sb.toString());
                    int i5 = this.numFiles - 2;
                    while (i5 > 0) {
                        Path pathResolve2 = this.filePath.getParent().resolve(this.filePath.getFileName() + IDMMoInterface.IDM_MO_ROOT_PATH + i5);
                        if (Files.exists(pathResolve2, new LinkOption[0])) {
                            Files.move(pathResolve2, pathResolve, StandardCopyOption.REPLACE_EXISTING);
                        }
                        i5--;
                        pathResolve = pathResolve2;
                    }
                    Files.copy(this.filePath, pathResolve, StandardCopyOption.REPLACE_EXISTING);
                    this.fileChannel.truncate(0L);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.samsung.android.fotaagent.common.log.RotatingFileWriter
        public void close() throws IOException {
            force();
            this.fileChannel.close();
        }

        @Override // com.samsung.android.fotaagent.common.log.RotatingFileWriter
        public void force() throws IOException {
            if (isOpen()) {
                this.fileChannel.force(true);
            }
        }

        @Override // com.samsung.android.fotaagent.common.log.RotatingFileWriter
        public boolean isOpen() {
            return this.fileChannel.isOpen();
        }

        @Override // com.samsung.android.fotaagent.common.log.RotatingFileWriter
        public void println(String str) throws IOException {
            rotateIfNeeded();
            this.fileChannel.write(CHARSET.encode(str + "\n"));
        }

        private Real(Path path, int i5, int i6) {
            this.filePath = path;
            this.numFiles = i5;
            this.minBytesForRotation = i6;
            this.lockForRotation = new Object();
            this.fileChannel = FileChannel.open(path, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        }
    }

    static RotatingFileWriter clone(RotatingFileWriter rotatingFileWriter) {
        try {
            Real real = (Real) rotatingFileWriter;
            return of(real.filePath, real.numFiles, real.minBytesForRotation);
        } catch (ClassCastException e5) {
            android.util.Log.e("IDM_FOTA", e5.toString());
            return STUB;
        }
    }

    static RotatingFileWriter of(Context context, String str, String str2, int i5, int i6) {
        try {
            return of(context.getDir(str, 0).toPath().resolve(str2), i5, i6);
        } catch (RuntimeException e5) {
            android.util.Log.e("IDM_FOTA", e5.toString());
            return STUB;
        }
    }

    void close();

    void force();

    boolean isOpen();

    void println(String str);

    static RotatingFileWriter of(Path path, int i5, int i6) {
        try {
            return new Real(path, i5, i6);
        } catch (IOException e5) {
            android.util.Log.e("IDM_FOTA", e5.toString());
            return STUB;
        }
    }
}
