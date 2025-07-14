package Y1;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import b1.j;
import b1.p;
import b1.r;
import com.google.android.gms.internal.p000firebaseauthapi.L3;
import com.google.firebase.auth.api.fallback.service.FirebaseAuthFallbackService;

/* loaded from: classes.dex */
public final class a extends Binder implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuthFallbackService f2836a;

    public a(FirebaseAuthFallbackService firebaseAuthFallbackService) {
        this.f2836a = firebaseAuthFallbackService;
        attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // b1.r
    public final void e(p pVar, j jVar) {
        Bundle bundle = jVar.f5026j;
        if (bundle == null) {
            throw new IllegalArgumentException("ExtraArgs is null.");
        }
        String string = bundle.getString("com.google.firebase.auth.API_KEY");
        if (TextUtils.isEmpty(string)) {
            throw new IllegalArgumentException("ApiKey must not be empty.");
        }
        pVar.w(0, new L3(this.f2836a, string), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d8  */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
