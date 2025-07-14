package M2;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f1812a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1812a;
    }

    public final int f(int i5, String str, String str2, String str3) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.sec.android.diagmonagent.sa.IDMAInterface");
            parcelObtain.writeInt(i5);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeString(str3);
            this.f1812a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final int g(int i5, String str, String str2, long j5, String str3) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.sec.android.diagmonagent.sa.IDMAInterface");
            parcelObtain.writeInt(i5);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeLong(j5);
            parcelObtain.writeString(str3);
            this.f1812a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
