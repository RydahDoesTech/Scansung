package com.samsung.context.sdk.samsunganalytics.internal.util;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.SecureRandom;
import java.util.Objects;

/* loaded from: classes.dex */
public class IdGenerator {
    public static final int DEVICE_ID_BIT_NUM = 128;
    private static final String FILE_NAME = "SamsungAnalyticsSdkId";

    private boolean checkSkipGenerateDeviceId(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        return !Objects.equals(str, str2);
    }

    private String generateRandomDeviceId() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[16];
        StringBuilder sb = new StringBuilder(32);
        for (int i5 = 0; i5 < 32; i5++) {
            secureRandom.nextBytes(bArr);
            try {
                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt((int) (Math.abs(new BigInteger(bArr).longValue()) % 62)));
            } catch (Exception e5) {
                Debug.logwingW("failed to generate random deviceId" + e5.getMessage());
                return null;
            }
        }
        return sb.toString();
    }

    public String createDeviceId(Context context) {
        return recreateDeviceId(context, null);
    }

    public String recreateDeviceId(Context context, String str) throws IOException {
        String path = context.getFileStreamPath(FILE_NAME).getPath();
        for (int i5 = 0; i5 < 20; i5++) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(path, "rw");
                try {
                    FileChannel channel = randomAccessFile.getChannel();
                    try {
                        FileLock fileLockTryLock = channel.tryLock();
                        if (fileLockTryLock != null) {
                            try {
                                if (fileLockTryLock.isValid()) {
                                    String line = randomAccessFile.readLine();
                                    if (checkSkipGenerateDeviceId(line, str)) {
                                        fileLockTryLock.close();
                                        channel.close();
                                        randomAccessFile.close();
                                        return line;
                                    }
                                    String strGenerateRandomDeviceId = generateRandomDeviceId();
                                    if (!TextUtils.isEmpty(strGenerateRandomDeviceId)) {
                                        randomAccessFile.setLength(0L);
                                        randomAccessFile.writeBytes(strGenerateRandomDeviceId);
                                    }
                                    fileLockTryLock.close();
                                    channel.close();
                                    randomAccessFile.close();
                                    return strGenerateRandomDeviceId;
                                }
                            } finally {
                            }
                        }
                        Debug.LogI("Get file lock failed, retry: " + i5);
                        Thread.sleep(500L);
                        if (fileLockTryLock != null) {
                            fileLockTryLock.close();
                        }
                        channel.close();
                        randomAccessFile.close();
                    } finally {
                    }
                } finally {
                }
            } catch (Exception e5) {
                Debug.logwingE("Generate deviceId failed, error: " + e5.getMessage());
            }
        }
        return null;
    }
}
