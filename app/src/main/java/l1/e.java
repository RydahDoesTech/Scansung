package l1;

import android.os.IBinder;
import android.os.IInterface;
import b1.k;

/* loaded from: classes.dex */
public final class e extends k {
    @Override // b1.k
    public final /* synthetic */ IInterface c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return iInterfaceQueryLocalInterface instanceof C0680c ? (C0680c) iInterfaceQueryLocalInterface : new C0680c(iBinder);
    }

    @Override // b1.k
    public final Y0.c[] e() {
        return AbstractC0678a.f8010b;
    }

    @Override // b1.k
    public final String i() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // b1.k
    public final String j() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }
}
