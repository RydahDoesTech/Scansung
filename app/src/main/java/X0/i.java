package X0;

import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f2690a;

    /* renamed from: b, reason: collision with root package name */
    public final t1.i f2691b = new t1.i();

    /* renamed from: c, reason: collision with root package name */
    public final int f2692c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f2693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2694e;

    public i(int i5, int i6, Bundle bundle, int i7) {
        this.f2694e = i7;
        this.f2690a = i5;
        this.f2692c = i6;
        this.f2693d = bundle;
    }

    public final boolean a() {
        switch (this.f2694e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(V1.h hVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(hVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 14 + strValueOf2.length());
            sb.append("Failing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f2691b.a(hVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 16 + strValueOf2.length());
            sb.append("Finishing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f2691b.b(bundle);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(this.f2692c);
        sb.append(" id=");
        sb.append(this.f2690a);
        sb.append(" oneWay=");
        sb.append(a());
        sb.append("}");
        return sb.toString();
    }
}
