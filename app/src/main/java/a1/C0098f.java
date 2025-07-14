package a1;

import b1.AbstractC0203C;
import com.samsung.android.knox.ex.KnoxContract;
import java.util.Arrays;

/* renamed from: a1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098f {

    /* renamed from: a, reason: collision with root package name */
    public final C0093a f2949a;

    /* renamed from: b, reason: collision with root package name */
    public final Y0.c f2950b;

    public C0098f(C0093a c0093a, Y0.c cVar) {
        this.f2949a = c0093a;
        this.f2950b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C0098f)) {
            C0098f c0098f = (C0098f) obj;
            if (AbstractC0203C.h(this.f2949a, c0098f.f2949a) && AbstractC0203C.h(this.f2950b, c0098f.f2950b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2949a, this.f2950b});
    }

    public final String toString() {
        E0.d dVar = new E0.d(this);
        dVar.C0(KnoxContract.KEY, this.f2949a);
        dVar.C0("feature", this.f2950b);
        return dVar.toString();
    }
}
