package com.idm.fotaagent.abupdate.updateengine;

import android.content.res.AssetFileDescriptor;
import android.os.Handler;
import android.os.IBinder;
import android.os.IUpdateEngine;
import android.os.IUpdateEngineCallback;
import android.os.RemoteException;
import android.os.ServiceSpecificException;
import com.idm.fotaagent.abupdate.abenabler.fumo.exception.insufficientmemory.AllocateFailedException;
import com.idm.fotaagent.utils.GeneralUtils;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class UpdateEngine {
    private static final String GETSERVICE_METHOD_NAME = "getService";
    private static final String SERVICE_MANAGER_CLASS_NAME = "android.os.ServiceManager";
    private static final String UPDATE_ENGINE_SERVICE = "android.os.UpdateEngineService";
    private IUpdateEngine mUpdateEngine;
    private IUpdateEngineCallback mUpdateEngineCallback = null;
    private final Object mUpdateEngineCallbackLock = new Object();

    public static final class AllocateSpaceResult {
        private int mErrorCode;
        private long mFreeSpaceRequired;

        public int getErrorCode() {
            return this.mErrorCode;
        }

        public long getFreeSpaceRequired() throws AllocateFailedException {
            int i5 = this.mErrorCode;
            if (i5 == 0) {
                return 0L;
            }
            if (i5 == 60) {
                return this.mFreeSpaceRequired;
            }
            throw new AllocateFailedException(String.format("getFreeSpaceRequired() is not available when error code is %d", Integer.valueOf(this.mErrorCode)), this.mErrorCode);
        }

        private AllocateSpaceResult() {
            this.mErrorCode = 0;
            this.mFreeSpaceRequired = 0L;
        }
    }

    public static class CleanupAppliedPayloadCallback extends IUpdateEngineCallback.Stub {
        private boolean mCompleted;
        private int mErrorCode;
        private final Object mLock;

        private CleanupAppliedPayloadCallback() {
            this.mErrorCode = 1;
            this.mCompleted = false;
            this.mLock = new Object();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getResult() {
            int i5;
            synchronized (this.mLock) {
                while (!this.mCompleted) {
                    try {
                        this.mLock.wait();
                    } catch (InterruptedException unused) {
                    }
                }
                i5 = this.mErrorCode;
            }
            return i5;
        }

        @Override // android.os.IUpdateEngineCallback
        public void onPayloadApplicationComplete(int i5) {
            synchronized (this.mLock) {
                this.mErrorCode = i5;
                this.mCompleted = true;
                this.mLock.notifyAll();
            }
        }

        @Override // android.os.IUpdateEngineCallback
        public void onStatusUpdate(int i5, float f) {
        }
    }

    public @interface ErrorCode {
    }

    public static final class ErrorCodeConstants {
        public static final int DEVICE_CORRUPTED = 61;
        private static final int DOWNLOAD_PAYLOAD_VERIFICATION_ERROR = 12;
        private static final int DOWNLOAD_TRANSFER_ERROR = 9;
        public static final int ERROR = 1;
        private static final int FILESYSTEM_COPIER_ERROR = 4;
        private static final int INSTALL_DEVICE_OPEN_ERROR = 7;
        private static final int KERNEL_DEVICE_OPEN_ERROR = 8;
        private static final int NOT_ENOUGH_SPACE = 60;
        private static final int PAYLOAD_HASH_MISMATCH_ERROR = 10;
        private static final int PAYLOAD_MISMATCHED_TYPE_ERROR = 6;
        private static final int PAYLOAD_SIZE_MISMATCH_ERROR = 11;
        private static final int PAYLOAD_TIMESTAMP_ERROR = 51;
        private static final int POST_INSTALL_RUNNER_ERROR = 5;
        public static final int SUCCESS = 0;
        private static final int UPDATED_BUT_NOT_ACTIVE = 52;
    }

    public UpdateEngine() {
        IBinder iBinder = (IBinder) GeneralUtils.invokeStaticMethod(SERVICE_MANAGER_CLASS_NAME, GETSERVICE_METHOD_NAME, new Class[]{String.class}, UPDATE_ENGINE_SERVICE);
        Log.I("IBinder(updateEngineService : " + iBinder + ")");
        if (iBinder != null) {
            this.mUpdateEngine = IUpdateEngine.Stub.asInterface(iBinder);
        }
    }

    private void resume() {
        try {
            this.mUpdateEngine.resume();
        } catch (Exception e5) {
            Log.I(e5.toString());
        }
    }

    private void suspend() {
        try {
            this.mUpdateEngine.suspend();
        } catch (Exception e5) {
            Log.I(e5.toString());
        }
    }

    public AllocateSpaceResult allocateSpace(String str, String[] strArr) {
        AllocateSpaceResult allocateSpaceResult = new AllocateSpaceResult();
        try {
            allocateSpaceResult.mFreeSpaceRequired = this.mUpdateEngine.allocateSpaceForPayload(str, strArr);
            allocateSpaceResult.mErrorCode = allocateSpaceResult.mFreeSpaceRequired == 0 ? 0 : 60;
            return allocateSpaceResult;
        } catch (RemoteException e5) {
            throw new RuntimeException(e5);
        } catch (ServiceSpecificException e6) {
            allocateSpaceResult.mErrorCode = e6.errorCode;
            allocateSpaceResult.mFreeSpaceRequired = 0L;
            return allocateSpaceResult;
        }
    }

    public void applyPayload(String str, long j5, long j6, String[] strArr) {
        this.mUpdateEngine.applyPayload(str, j5, j6, strArr);
    }

    public boolean bind(final UpdateEngineCallback updateEngineCallback, final Handler handler) {
        boolean zBind;
        synchronized (this.mUpdateEngineCallbackLock) {
            try {
                IUpdateEngineCallback.Stub stub = new IUpdateEngineCallback.Stub() { // from class: com.idm.fotaagent.abupdate.updateengine.UpdateEngine.1
                    @Override // android.os.IUpdateEngineCallback
                    public void onPayloadApplicationComplete(final int i5) {
                        Handler handler2 = handler;
                        if (handler2 != null) {
                            handler2.post(new Runnable() { // from class: com.idm.fotaagent.abupdate.updateengine.UpdateEngine.1.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    updateEngineCallback.setResultCode(i5);
                                }
                            });
                        } else {
                            updateEngineCallback.setResultCode(i5);
                        }
                    }

                    @Override // android.os.IUpdateEngineCallback
                    public void onStatusUpdate(final int i5, final float f) {
                        Handler handler2 = handler;
                        if (handler2 != null) {
                            handler2.post(new Runnable() { // from class: com.idm.fotaagent.abupdate.updateengine.UpdateEngine.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    updateEngineCallback.setUpdateStatus(i5, f);
                                }
                            });
                        } else {
                            updateEngineCallback.setUpdateStatus(i5, f);
                        }
                    }
                };
                this.mUpdateEngineCallback = stub;
                try {
                    zBind = this.mUpdateEngine.bind(stub);
                } catch (Exception e5) {
                    Log.I(e5.toString());
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBind;
    }

    public void cancel() {
        this.mUpdateEngine.cancel();
    }

    public int cleanupAppliedPayload() {
        CleanupAppliedPayloadCallback cleanupAppliedPayloadCallback = new CleanupAppliedPayloadCallback();
        try {
            this.mUpdateEngine.cleanupSuccessfulUpdate(cleanupAppliedPayloadCallback);
            return cleanupAppliedPayloadCallback.getResult();
        } catch (RemoteException e5) {
            throw new RuntimeException(e5);
        }
    }

    public void resetShouldSwitchSlotOnReboot() {
        try {
            this.mUpdateEngine.resetShouldSwitchSlotOnReboot();
        } catch (Exception e5) {
            Log.I(e5.toString());
        }
    }

    public void resetStatus() {
        try {
            this.mUpdateEngine.resetStatus();
        } catch (Exception e5) {
            Log.I(e5.toString());
        }
    }

    public void setShouldSwitchSlotOnReboot(String str) {
        this.mUpdateEngine.setShouldSwitchSlotOnReboot(str);
    }

    public void triggerPostinstall(String str) {
        try {
            this.mUpdateEngine.triggerPostinstall(str);
        } catch (RemoteException e5) {
            throw new RuntimeException(e5);
        }
    }

    public boolean unbind() {
        synchronized (this.mUpdateEngineCallbackLock) {
            IUpdateEngineCallback iUpdateEngineCallback = this.mUpdateEngineCallback;
            if (iUpdateEngineCallback == null) {
                return true;
            }
            try {
                boolean zUnbind = this.mUpdateEngine.unbind(iUpdateEngineCallback);
                this.mUpdateEngineCallback = null;
                return zUnbind;
            } catch (Exception e5) {
                Log.I(e5.toString());
                return false;
            }
        }
    }

    public boolean verifyPayloadMetadata(String str) {
        try {
            return this.mUpdateEngine.verifyPayloadApplicable(str);
        } catch (Exception e5) {
            Log.I(e5.toString());
            return false;
        }
    }

    public void applyPayload(AssetFileDescriptor assetFileDescriptor, String[] strArr) {
        try {
            this.mUpdateEngine.applyPayloadFd(assetFileDescriptor.getParcelFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength(), strArr);
        } catch (Exception e5) {
            Log.I(e5.toString());
        }
    }

    public boolean bind(UpdateEngineCallback updateEngineCallback) {
        return bind(updateEngineCallback, null);
    }
}
