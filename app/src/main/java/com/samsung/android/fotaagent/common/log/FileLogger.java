package com.samsung.android.fotaagent.common.log;

import android.os.Process;
import com.idm.fotaagent.utils.Formatted;
import com.samsung.android.fotaagent.common.cipher.AESWithRSA;
import com.samsung.android.fotaagent.common.log.Logger;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

/* loaded from: classes.dex */
class FileLogger extends Logger {
    private static final String PID = "[" + Process.myPid() + " ";
    private RotatingFileWriter fileWriter;
    private final Lock readLockForFileWriter;
    private final Lock writeLockForFileWriter;

    public FileLogger() {
        this(0);
    }

    private String encrypt(String str) {
        try {
            return AESWithRSA.encrypt(str);
        } catch (RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException e5) {
            Log.ANDROID_LOGGER.printStackTrace(Where.here(), e5);
            return "[!] Log encryption failed: " + str;
        }
    }

    private void retryLog(String str) {
        this.writeLockForFileWriter.lock();
        try {
            try {
                if (!this.fileWriter.isOpen()) {
                    this.fileWriter = RotatingFileWriter.clone(this.fileWriter);
                }
                boolean zInterrupted = Thread.interrupted();
                this.fileWriter.println(str);
                if (zInterrupted) {
                    Thread.currentThread().interrupt();
                }
            } catch (IOException e5) {
                Log.ANDROID_LOGGER.printStackTrace(Where.here(), e5);
            }
            this.writeLockForFileWriter.unlock();
        } catch (Throwable th) {
            this.writeLockForFileWriter.unlock();
            throw th;
        }
    }

    private static String when() {
        return new Formatted.DateTimeWithoutYearForLog(System.currentTimeMillis()).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.concurrent.locks.Lock] */
    public void changeFileWriter(RotatingFileWriter rotatingFileWriter) {
        this.writeLockForFileWriter.lock();
        try {
            try {
                this.fileWriter.close();
                this.fileWriter = rotatingFileWriter;
            } catch (IOException e5) {
                Log.ANDROID_LOGGER.printStackTrace(Where.here(), e5);
            }
        } finally {
            this.writeLockForFileWriter.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.concurrent.locks.Lock] */
    public void force() {
        this.readLockForFileWriter.lock();
        try {
            try {
                this.fileWriter.force();
            } catch (IOException e5) {
                Log.ANDROID_LOGGER.printStackTrace(Where.here(), e5);
            }
        } finally {
            this.readLockForFileWriter.unlock();
        }
    }

    @Override // com.samsung.android.fotaagent.common.log.Logger
    public void log(Logger.Level level, Where where, Object obj) {
        String strEncrypt = PID + Process.myTid() + "] " + obj;
        try {
            if (level == Logger.Level.S || level == Logger.Level.H) {
                strEncrypt = encrypt(strEncrypt);
            }
            String str = when() + " [" + level + "] " + where + " " + strEncrypt;
            this.readLockForFileWriter.lock();
            try {
                this.fileWriter.println(str);
                this.readLockForFileWriter.unlock();
            } catch (Throwable th) {
                this.readLockForFileWriter.unlock();
                throw th;
            }
        } catch (ClosedChannelException e5) {
            Log.ANDROID_LOGGER.printStackTrace(Where.here(), e5);
            retryLog(strEncrypt);
        } catch (Exception e6) {
            Log.ANDROID_LOGGER.printStackTrace(Where.here(), e6);
        }
    }

    public FileLogger(int i5) {
        this(RotatingFileWriter.STUB, i5);
    }

    public FileLogger(RotatingFileWriter rotatingFileWriter) {
        this(rotatingFileWriter, 0);
    }

    public FileLogger(RotatingFileWriter rotatingFileWriter, int i5) {
        super(i5);
        this.fileWriter = rotatingFileWriter;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.readLockForFileWriter = reentrantReadWriteLock.readLock();
        this.writeLockForFileWriter = reentrantReadWriteLock.writeLock();
    }
}
