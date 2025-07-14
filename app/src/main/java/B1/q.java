package b1;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.p000firebaseauthapi.Z;

/* loaded from: classes.dex */
public final class q implements r {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f5056a;

    public q(IBinder iBinder) {
        this.f5056a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5056a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b1.r
    public final void e(p pVar, j jVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder((Z) pVar);
            parcelObtain.writeInt(1);
            jVar.writeToParcel(parcelObtain, 0);
            this.f5056a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
