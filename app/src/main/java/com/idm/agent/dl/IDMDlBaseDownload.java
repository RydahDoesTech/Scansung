package com.idm.agent.dl;

import com.idm.adapter.filesystem.IDMFileSystemAdapter;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.exception.file.IDMExceptionFileEnospc;
import com.idm.exception.file.IDMExceptionFileNotFound;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class IDMDlBaseDownload {
    private String deltaPath;
    private FileOutputStream fos;
    protected long lDownloadSize;
    protected int szDownloadReceiveBuffer = 50176;
    protected IDMFileSystemAdapter fileSystemAdapter = new IDMFileSystemAdapter();

    public long getDownloadedSize() {
        return this.lDownloadSize;
    }

    public void idmCloseFileInputStream() {
        try {
            FileOutputStream fileOutputStream = this.fos;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        } catch (IOException e5) {
            IDMDebug.printStackTrace(e5);
        }
    }

    public boolean idmFirmwareVerifyChecksum(String str, String str2) {
        return true;
    }

    public abstract List<String> idmGetExtraDDElement();

    public int idmGetReceiveDownloadBufferSize() {
        return this.szDownloadReceiveBuffer;
    }

    public void idmOpenFileInputStream(String str) throws IDMExceptionFileNotFound {
        try {
            this.fos = new FileOutputStream(str, true);
            this.deltaPath = str;
        } catch (FileNotFoundException e5) {
            throw new IDMExceptionFileNotFound(e5);
        } catch (RuntimeException e6) {
            throw new IDMExceptionFileNotFound(e6);
        }
    }

    public void idmResetDownloadInfo() {
        this.lDownloadSize = 0L;
    }

    public void idmSetReceiveDownloadBufferSize(int i5) {
        this.szDownloadReceiveBuffer = i5;
    }

    public boolean idmUpdateDownloadInfo(IDMDlDownloadInfo iDMDlDownloadInfo, long j5, byte[] bArr) throws IDMExceptionFileEnospc, IOException, IDMExceptionFileNotFound {
        this.lDownloadSize += bArr.length;
        idmWriteDeltaFile(bArr);
        IDMDebug.I("totalSize : " + j5 + ", downloadSize : " + this.lDownloadSize);
        long j6 = this.lDownloadSize;
        if (j6 <= 0 || j5 <= 0) {
            return true;
        }
        iDMDlDownloadInfo.idmSetDownloadSize(j6);
        int i5 = (int) ((this.lDownloadSize * 100) / j5);
        if (iDMDlDownloadInfo.idmGetDownloadPercent() == i5) {
            return true;
        }
        iDMDlDownloadInfo.idmSetDownloadPercent(i5);
        return true;
    }

    public void idmWriteDeltaFile(byte[] bArr) throws IDMExceptionFileEnospc, IOException, IDMExceptionFileNotFound {
        if (!new File(this.deltaPath).exists()) {
            throw new IDMExceptionFileNotFound();
        }
        try {
            this.fos.write(bArr);
            this.fos.flush();
            this.fos.getFD().sync();
        } catch (FileNotFoundException e5) {
            throw new IDMExceptionFileNotFound(e5);
        } catch (IOException e6) {
            if (!e6.getMessage().contains("ENOSPC")) {
                throw new IOException(e6);
            }
            throw new IDMExceptionFileEnospc(e6);
        }
    }

    public void setDownloadedSize(long j5) {
        this.lDownloadSize += j5;
    }

    public void idmWriteDeltaFile(byte[] bArr, int i5) throws IDMExceptionFileEnospc, IOException, IDMExceptionFileNotFound {
        if (new File(this.deltaPath).exists()) {
            try {
                this.fos.write(bArr, 0, i5);
                this.fos.flush();
                this.fos.getFD().sync();
                return;
            } catch (FileNotFoundException e5) {
                throw new IDMExceptionFileNotFound(e5);
            } catch (IOException e6) {
                if (e6.getMessage().contains("ENOSPC")) {
                    throw new IDMExceptionFileEnospc(e6);
                }
                throw new IOException(e6);
            }
        }
        throw new IDMExceptionFileNotFound();
    }
}
