package e;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import com.google.android.gms.internal.p000firebaseauthapi.P3;

/* loaded from: classes.dex */
public final class y extends P3 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6626c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B f6627d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6628e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(B b2, D3.c cVar) {
        super(b2);
        this.f6627d = b2;
        this.f6628e = cVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.P3
    public final IntentFilter e() {
        switch (this.f6626c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.P3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f() {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.y.f():int");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.P3
    public final void h() throws PackageManager.NameNotFoundException {
        switch (this.f6626c) {
            case 0:
                this.f6627d.p(true);
                break;
            default:
                this.f6627d.p(true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(B b2, Context context) {
        super(b2);
        this.f6627d = b2;
        this.f6628e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
