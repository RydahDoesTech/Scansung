package r1;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b1.k;
import q1.C0784a;

/* renamed from: r1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0810a extends k implements Z0.a {

    /* renamed from: w, reason: collision with root package name */
    public final boolean f8563w;

    /* renamed from: x, reason: collision with root package name */
    public final G3.d f8564x;

    /* renamed from: y, reason: collision with root package name */
    public final Bundle f8565y;

    /* renamed from: z, reason: collision with root package name */
    public final Integer f8566z;

    public C0810a(Context context, Looper looper, G3.d dVar, Z0.d dVar2, Z0.e eVar) {
        C0784a c0784a = (C0784a) dVar.f749h;
        Integer num = (Integer) dVar.f750i;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (c0784a != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
            bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        }
        super(context, looper, 44, dVar, dVar2, eVar);
        this.f8563w = true;
        this.f8564x = dVar;
        this.f8565y = bundle;
        this.f8566z = (Integer) dVar.f750i;
    }

    @Override // b1.k, Z0.a
    public final boolean a() {
        return this.f8563w;
    }

    @Override // b1.k
    public final /* synthetic */ IInterface c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C0812c ? (C0812c) iInterfaceQueryLocalInterface : new C0812c(iBinder);
    }

    @Override // b1.k
    public final Bundle f() {
        G3.d dVar = this.f8564x;
        boolean zEquals = this.f5033b.getPackageName().equals((String) dVar.f);
        Bundle bundle = this.f8565y;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) dVar.f);
        }
        return bundle;
    }

    @Override // b1.k
    public final String i() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // b1.k
    public final String j() {
        return "com.google.android.gms.signin.service.START";
    }
}
