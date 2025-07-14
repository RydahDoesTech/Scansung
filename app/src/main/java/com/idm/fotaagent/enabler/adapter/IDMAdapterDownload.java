package com.idm.fotaagent.enabler.adapter;

import android.text.TextUtils;
import com.idm.agent.dl.IDMDlBaseDownload;
import com.idm.agent.dl.IDMDlDownloadInfo;
import com.idm.core.security.IDMSecurityInterface;
import com.idm.exception.file.IDMExceptionFileEnospc;
import com.idm.exception.file.IDMExceptionFileNotFound;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.utils.EnablerUtils;
import com.idm.fotaagent.utils.storage.StorageType;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.util.NativeUtils;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class IDMAdapterDownload extends IDMDlBaseDownload {
    private static final int APPEND_SAVED_BUFFER_SIZE = 2097152;
    private static final int DOWNLOAD_PROGRESS_THRESHOLD_SIZE = 524288;
    static final int DOWNLOAD_RECEIVE_BUFFER_SIZE = 50176;
    public static final String IDM_DD_EXTRA_ELEMENT_DESCRIPTIONTYPE = "descriptionType";
    public static final String IDM_DD_EXTRA_ELEMENT_INSTALLTYPEURI = "installTypeURI";
    public static final String IDM_DD_EXTRA_ELEMENT_SUMMARYDESCRIPTION = "summaryDescription";
    private final ActionInfoDao actionInfoDao;
    private int checkProgress;
    private long downloadProgressSize;
    private final FotaJobRepository fotaJobRepository = new FotaJobRepository(IDMApplication.idmGetContext());
    private final IDMAdapterFlexibleBuffer flexibleBuffer = new IDMAdapterFlexibleBuffer(APPEND_SAVED_BUFFER_SIZE, DOWNLOAD_RECEIVE_BUFFER_SIZE);

    public IDMAdapterDownload(String str) {
        this.actionInfoDao = new ActionInfoDao(str);
    }

    private void checkDeltaExistence() throws IDMExceptionFileNotFound {
        if (!new File(this.actionInfoDao.getDownloadPath()).exists()) {
            throw new IDMExceptionFileNotFound();
        }
    }

    private boolean isF2FSTypeOfData() throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/mounts"));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        return false;
                    }
                    String[] strArrSplit = line.split(" ");
                    String str = strArrSplit[1];
                    String str2 = strArrSplit[2];
                    if ("/data".equals(str) && "f2fs".equals(str2)) {
                        bufferedReader.close();
                        return true;
                    }
                } finally {
                }
            }
        } catch (IOException e5) {
            Log.printStackTrace(e5);
            return false;
        }
    }

    private void setPinAndAllocateIfDownloadingInDataAndF2FSType() {
        if (this.actionInfoDao.getDeltaIndex() == StorageType.DATA.type() && isF2FSTypeOfData() && !NativeUtils.setPinAndFallocate(this.actionInfoDao.getDownloadPath(), this.fotaJobRepository.getDownloadedSize(), this.flexibleBuffer.idmGetFlexibleBufferLength())) {
            Log.W("setpin and fallocate was failed. try again");
            Log.I("result : " + NativeUtils.setPinAndFallocate(this.actionInfoDao.getDownloadPath(), this.fotaJobRepository.getDownloadedSize(), this.flexibleBuffer.idmGetFlexibleBufferLength()));
        }
    }

    private void updateDownloadInfo(IDMDlDownloadInfo iDMDlDownloadInfo, long j5) {
        long j6 = this.downloadProgressSize;
        if (j6 <= 0 || j5 <= 0) {
            return;
        }
        iDMDlDownloadInfo.idmSetDownloadSize(j6);
        int i5 = (int) ((this.downloadProgressSize * 100) / j5);
        if (iDMDlDownloadInfo.idmGetDownloadPercent() != i5) {
            iDMDlDownloadInfo.idmSetDownloadPercent(i5);
        }
    }

    private boolean verifyFirmwareCheckSum(String str) throws IOException {
        String strCalculateChecksum = calculateChecksum(str);
        if (TextUtils.isEmpty(strCalculateChecksum)) {
            Log.E("Calculated checksum should not be empty");
            return false;
        }
        if (strCalculateChecksum.equals(new InstallParamRepository(IDMApplication.idmGetContext()).getMD5())) {
            Log.I("Checksum matched");
            return true;
        }
        Log.I("Checksum mismatched");
        return false;
    }

    public String calculateChecksum(String str) throws IOException {
        String hexString = "";
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                byte[] bArr = new byte[NetworkAnalyticsConstants.DataPoints.FLAG_UID];
                MessageDigest messageDigest = MessageDigest.getInstance(IDMSecurityInterface.IDM_CRED_TYPE_MD5_STR);
                int i5 = 0;
                while (i5 != -1) {
                    i5 = fileInputStream.read(bArr);
                    if (i5 > 0) {
                        messageDigest.update(bArr, 0, i5);
                    }
                }
                hexString = EnablerUtils.toHexString(messageDigest.digest());
                fileInputStream.close();
            } finally {
            }
        } catch (Exception e5) {
            Log.printStackTrace(e5);
        }
        Log.I("Checksum : " + hexString);
        return hexString;
    }

    @Override // com.idm.agent.dl.IDMDlBaseDownload
    public long getDownloadedSize() {
        return this.fotaJobRepository.getDownloadedSize();
    }

    @Override // com.idm.agent.dl.IDMDlBaseDownload
    public boolean idmFirmwareVerifyChecksum(String str, String str2) {
        return verifyFirmwareCheckSum(str2);
    }

    @Override // com.idm.agent.dl.IDMDlBaseDownload
    public List<String> idmGetExtraDDElement() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(IDM_DD_EXTRA_ELEMENT_DESCRIPTIONTYPE);
        arrayList.add(IDM_DD_EXTRA_ELEMENT_SUMMARYDESCRIPTION);
        arrayList.add(IDM_DD_EXTRA_ELEMENT_INSTALLTYPEURI);
        return arrayList;
    }

    @Override // com.idm.agent.dl.IDMDlBaseDownload
    public int idmGetReceiveDownloadBufferSize() {
        return DOWNLOAD_RECEIVE_BUFFER_SIZE;
    }

    @Override // com.idm.agent.dl.IDMDlBaseDownload
    public void idmResetDownloadInfo() {
        this.flexibleBuffer.idmAllClearBufferInfo();
        this.downloadProgressSize = 0L;
    }

    @Override // com.idm.agent.dl.IDMDlBaseDownload
    public boolean idmUpdateDownloadInfo(IDMDlDownloadInfo iDMDlDownloadInfo, long j5, byte[] bArr) throws IDMExceptionFileEnospc, IOException, IDMExceptionFileNotFound {
        this.downloadProgressSize += bArr.length;
        writeFirmwareObject(bArr, j5);
        updateDownloadInfo(iDMDlDownloadInfo, j5);
        return needsToRefreshProgress(j5);
    }

    public boolean needsToRefreshProgress(long j5) {
        long j6 = this.downloadProgressSize;
        int i5 = ((int) j6) / 524288;
        if (this.checkProgress == i5) {
            return j6 == j5;
        }
        this.checkProgress = i5;
        return true;
    }

    @Override // com.idm.agent.dl.IDMDlBaseDownload
    public void setDownloadedSize(long j5) {
        this.downloadProgressSize += j5;
    }

    public void writeFirmwareObject(byte[] bArr, long j5) throws IDMExceptionFileEnospc, IOException, IDMExceptionFileNotFound {
        int length = bArr.length;
        if (length > 0) {
            this.flexibleBuffer.idmAddFlexibleBuffer(bArr, length);
        }
        if (this.flexibleBuffer.idmGetFlexibleBufferLength() > this.flexibleBuffer.idmGetAppendSavedBufferSize() || (this.downloadProgressSize >= j5 && this.flexibleBuffer.idmGetFlexibleBufferLength() > 0)) {
            setPinAndAllocateIfDownloadingInDataAndF2FSType();
            checkDeltaExistence();
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.actionInfoDao.getDownloadPath(), "rw");
                try {
                    randomAccessFile.seek(this.fotaJobRepository.getDownloadedSize());
                    randomAccessFile.write(this.flexibleBuffer.idmGetRealWriteBuffer(), 0, this.flexibleBuffer.idmGetFlexibleBufferLength());
                    this.fotaJobRepository.setDownloadedSize(this.downloadProgressSize);
                    this.flexibleBuffer.idmClearFlexibleBuffer();
                    randomAccessFile.close();
                } finally {
                }
            } catch (IOException e5) {
                if (e5.getMessage() != null && e5.getMessage().contains("ENOSPC")) {
                    throw new IDMExceptionFileEnospc(e5);
                }
                throw new IOException(e5);
            }
        }
    }
}
