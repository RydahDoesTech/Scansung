package r1;

import a1.p;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: r1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0812c implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f8569a;

    public C0812c(IBinder iBinder) {
        this.f8569a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8569a;
    }

    public final void f(C0813d c0813d, p pVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        int i5 = m1.a.f8036a;
        parcelObtain.writeInt(1);
        c0813d.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(pVar);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            this.f8569a.transact(12, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }
}
