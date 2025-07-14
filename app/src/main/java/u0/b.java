package U0;

import G3.d;
import Z0.e;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.p000firebaseauthapi.J3;
import com.google.android.gms.internal.p000firebaseauthapi.X3;
import g3.y;
import r1.C0810a;

/* loaded from: classes.dex */
public final class b extends y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2559a;

    public /* synthetic */ b(int i5) {
        this.f2559a = i5;
    }

    @Override // g3.y
    public /* synthetic */ Z0.a c(Context context, Looper looper, d dVar, Object obj, Z0.d dVar2, e eVar) {
        switch (this.f2559a) {
            case 2:
                return new C0810a(context, looper, dVar, dVar2, eVar);
            case 3:
                throw new NoSuchMethodError();
            default:
                return super.c(context, looper, dVar, obj, dVar2, eVar);
        }
    }

    @Override // g3.y
    public Z0.a d(Context context, Looper looper, d dVar, Object obj, Z0.d dVar2, e eVar) {
        switch (this.f2559a) {
            case 0:
                if (obj == null) {
                    return new l1.e(context, looper, 126, dVar, dVar2, eVar);
                }
                throw new ClassCastException();
            case 1:
                return new J3(context, looper, dVar, (X3) obj, dVar2, eVar);
            default:
                return super.d(context, looper, dVar, obj, dVar2, eVar);
        }
    }
}
