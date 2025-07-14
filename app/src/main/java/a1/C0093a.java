package a1;

import b1.AbstractC0203C;
import com.google.android.gms.internal.p000firebaseauthapi.X3;
import java.util.Arrays;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2926a;

    /* renamed from: b, reason: collision with root package name */
    public final E0.d f2927b;

    /* renamed from: c, reason: collision with root package name */
    public final X3 f2928c;

    public C0093a(E0.d dVar, X3 x32) {
        this.f2927b = dVar;
        this.f2928c = x32;
        this.f2926a = Arrays.hashCode(new Object[]{dVar, x32});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0093a)) {
            return false;
        }
        C0093a c0093a = (C0093a) obj;
        c0093a.getClass();
        return AbstractC0203C.h(this.f2927b, c0093a.f2927b) && AbstractC0203C.h(this.f2928c, c0093a.f2928c);
    }

    public final int hashCode() {
        return this.f2926a;
    }
}
