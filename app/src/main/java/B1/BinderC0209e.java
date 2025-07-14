package b1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.Z;
import o1.AbstractC0715a;

/* renamed from: b1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0209e extends Z implements p {

    /* renamed from: b, reason: collision with root package name */
    public k f5013b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5014c;

    public BinderC0209e(k kVar, int i5) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 1);
        this.f5013b = kVar;
        this.f5014c = i5;
    }

    @Override // b1.p
    public final void w(int i5, IBinder iBinder, Bundle bundle) {
        AbstractC0203C.f("onPostInitComplete can be called only once per call to getRemoteService", this.f5013b);
        k kVar = this.f5013b;
        kVar.getClass();
        h hVar = new h(kVar, i5, iBinder, bundle);
        HandlerC0208d handlerC0208d = kVar.f5035d;
        handlerC0208d.sendMessage(handlerC0208d.obtainMessage(1, this.f5014c, -1, hVar));
        this.f5013b = null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Z
    public final boolean y(int i5, Parcel parcel, Parcel parcel2) {
        if (i5 == 1) {
            w(parcel.readInt(), parcel.readStrongBinder(), (Bundle) AbstractC0715a.a(parcel, Bundle.CREATOR));
        } else if (i5 == 2) {
            parcel.readInt();
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i5 != 3) {
                return false;
            }
            int i6 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            w wVar = (w) AbstractC0715a.a(parcel, w.CREATOR);
            AbstractC0203C.f("onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService", this.f5013b);
            AbstractC0203C.e(wVar);
            this.f5013b.f5048s = wVar;
            w(i6, strongBinder, wVar.f5069d);
        }
        parcel2.writeNoException();
        return true;
    }
}
