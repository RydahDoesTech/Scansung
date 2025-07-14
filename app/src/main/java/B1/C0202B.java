package b1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.p000firebaseauthapi.AbstractC0228a;
import o1.AbstractC0715a;

/* renamed from: b1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202B extends AbstractC0228a implements p {
    @Override // b1.p
    public final void w(int i5, IBinder iBinder, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f5420c);
        parcelObtain.writeInt(0);
        parcelObtain.writeStrongBinder(iBinder);
        int i6 = AbstractC0715a.f8241a;
        parcelObtain.writeInt(0);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            this.f5419b.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }
}
