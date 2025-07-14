package com.idm.fotaagent.utils.rangerequest;

import com.idm.fotaagent.utils.rangerequest.RangeRequest;
import com.samsung.android.fotaagent.common.log.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Path;

/* loaded from: classes.dex */
public class FileRangeRequest extends RangeRequest {
    private volatile FileInputStream fileInputStream;

    public FileRangeRequest(URL url, Path path) {
        this(url, path, null);
    }

    @Override // com.idm.fotaagent.utils.rangerequest.RangeRequest
    public void finalize(Thread thread) throws IOException {
        super.finalize(thread);
        try {
            if (this.fileInputStream != null) {
                this.fileInputStream.close();
            }
        } catch (IOException e5) {
            Log.printStackTrace(e5);
        }
    }

    @Override // com.idm.fotaagent.utils.rangerequest.RangeRequest
    public InputStream getInputStream(RangeRequest.Range range) throws IOException {
        this.fileInputStream = new FileInputStream(new File(this.url.toURI()));
        long jSkip = this.fileInputStream.skip(range.start());
        if (jSkip == range.start()) {
            return this.fileInputStream;
        }
        throw new IOException("skippedBytes(" + jSkip + ") and start(" + range.start() + ") is mismatched");
    }

    public FileRangeRequest(URL url, Path path, RangeRequest.OnFileLengthChangedListener onFileLengthChangedListener) {
        super(url, path, onFileLengthChangedListener);
    }
}
