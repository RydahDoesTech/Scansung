package android.os;

import android.os.IUpdateEngineCallback;
import android.os.Parcelable;

/* loaded from: classes.dex */
public interface IUpdateEngine extends IInterface {

    public static class Default implements IUpdateEngine {
        @Override // android.os.IUpdateEngine
        public long allocateSpaceForPayload(String str, String[] strArr) {
            return 0L;
        }

        @Override // android.os.IUpdateEngine
        public void applyPayload(String str, long j5, long j6, String[] strArr) {
        }

        @Override // android.os.IUpdateEngine
        public void applyPayloadFd(ParcelFileDescriptor parcelFileDescriptor, long j5, long j6, String[] strArr) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.os.IUpdateEngine
        public boolean bind(IUpdateEngineCallback iUpdateEngineCallback) {
            return false;
        }

        @Override // android.os.IUpdateEngine
        public void cancel() {
        }

        @Override // android.os.IUpdateEngine
        public void cleanupSuccessfulUpdate(IUpdateEngineCallback iUpdateEngineCallback) {
        }

        @Override // android.os.IUpdateEngine
        public void resetShouldSwitchSlotOnReboot() {
        }

        @Override // android.os.IUpdateEngine
        public void resetStatus() {
        }

        @Override // android.os.IUpdateEngine
        public void resume() {
        }

        @Override // android.os.IUpdateEngine
        public void setShouldSwitchSlotOnReboot(String str) {
        }

        @Override // android.os.IUpdateEngine
        public void suspend() {
        }

        @Override // android.os.IUpdateEngine
        public void triggerPostinstall(String str) {
        }

        @Override // android.os.IUpdateEngine
        public boolean unbind(IUpdateEngineCallback iUpdateEngineCallback) {
            return false;
        }

        @Override // android.os.IUpdateEngine
        public boolean verifyPayloadApplicable(String str) {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements IUpdateEngine {
        public static final String DESCRIPTOR = "android.os.IUpdateEngine";
        static final int TRANSACTION_allocateSpaceForPayload = 12;
        static final int TRANSACTION_applyPayload = 1;
        static final int TRANSACTION_applyPayloadFd = 2;
        static final int TRANSACTION_bind = 3;
        static final int TRANSACTION_cancel = 7;
        static final int TRANSACTION_cleanupSuccessfulUpdate = 13;
        static final int TRANSACTION_resetShouldSwitchSlotOnReboot = 10;
        static final int TRANSACTION_resetStatus = 8;
        static final int TRANSACTION_resume = 6;
        static final int TRANSACTION_setShouldSwitchSlotOnReboot = 9;
        static final int TRANSACTION_suspend = 5;
        static final int TRANSACTION_triggerPostinstall = 14;
        static final int TRANSACTION_unbind = 4;
        static final int TRANSACTION_verifyPayloadApplicable = 11;

        public static class Proxy implements IUpdateEngine {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IUpdateEngine
            public long allocateSpaceForPayload(String str, String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringArray(strArr);
                    this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IUpdateEngine
            public void applyPayload(String str, long j5, long j6, String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeLong(j5);
                    parcelObtain.writeLong(j6);
                    parcelObtain.writeStringArray(strArr);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IUpdateEngine
            public void applyPayloadFd(ParcelFileDescriptor parcelFileDescriptor, long j5, long j6, String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, parcelFileDescriptor, 0);
                    parcelObtain.writeLong(j5);
                    parcelObtain.writeLong(j6);
                    parcelObtain.writeStringArray(strArr);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // android.os.IUpdateEngine
            public boolean bind(IUpdateEngineCallback iUpdateEngineCallback) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iUpdateEngineCallback);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IUpdateEngine
            public void cancel() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IUpdateEngine
            public void cleanupSuccessfulUpdate(IUpdateEngineCallback iUpdateEngineCallback) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iUpdateEngineCallback);
                    this.mRemote.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // android.os.IUpdateEngine
            public void resetShouldSwitchSlotOnReboot() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IUpdateEngine
            public void resetStatus() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IUpdateEngine
            public void resume() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IUpdateEngine
            public void setShouldSwitchSlotOnReboot(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IUpdateEngine
            public void suspend() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IUpdateEngine
            public void triggerPostinstall(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IUpdateEngine
            public boolean unbind(IUpdateEngineCallback iUpdateEngineCallback) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iUpdateEngineCallback);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IUpdateEngine
            public boolean verifyPayloadApplicable(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IUpdateEngine asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IUpdateEngine)) ? new Proxy(iBinder) : (IUpdateEngine) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) {
            if (i5 >= 1 && i5 <= 16777215) {
                parcel.enforceInterface(DESCRIPTOR);
            }
            if (i5 == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i5) {
                case 1:
                    applyPayload(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.createStringArray());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    applyPayloadFd((ParcelFileDescriptor) _Parcel.readTypedObject(parcel, ParcelFileDescriptor.CREATOR), parcel.readLong(), parcel.readLong(), parcel.createStringArray());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    boolean zBind = bind(IUpdateEngineCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zBind ? 1 : 0);
                    return true;
                case 4:
                    boolean zUnbind = unbind(IUpdateEngineCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zUnbind ? 1 : 0);
                    return true;
                case 5:
                    suspend();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    resume();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    cancel();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    resetStatus();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    setShouldSwitchSlotOnReboot(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    resetShouldSwitchSlotOnReboot();
                    parcel2.writeNoException();
                    return true;
                case 11:
                    boolean zVerifyPayloadApplicable = verifyPayloadApplicable(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zVerifyPayloadApplicable ? 1 : 0);
                    return true;
                case 12:
                    long jAllocateSpaceForPayload = allocateSpaceForPayload(parcel.readString(), parcel.createStringArray());
                    parcel2.writeNoException();
                    parcel2.writeLong(jAllocateSpaceForPayload);
                    return true;
                case 13:
                    cleanupSuccessfulUpdate(IUpdateEngineCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    triggerPostinstall(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i5, parcel, parcel2, i6);
            }
        }
    }

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t4, int i5) {
            if (t4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t4.writeToParcel(parcel, i5);
            }
        }
    }

    long allocateSpaceForPayload(String str, String[] strArr);

    void applyPayload(String str, long j5, long j6, String[] strArr);

    void applyPayloadFd(ParcelFileDescriptor parcelFileDescriptor, long j5, long j6, String[] strArr);

    boolean bind(IUpdateEngineCallback iUpdateEngineCallback);

    void cancel();

    void cleanupSuccessfulUpdate(IUpdateEngineCallback iUpdateEngineCallback);

    void resetShouldSwitchSlotOnReboot();

    void resetStatus();

    void resume();

    void setShouldSwitchSlotOnReboot(String str);

    void suspend();

    void triggerPostinstall(String str);

    boolean unbind(IUpdateEngineCallback iUpdateEngineCallback);

    boolean verifyPayloadApplicable(String str);
}
