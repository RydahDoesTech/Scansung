package j3;

import b3.AbstractC0219i;
import java.lang.reflect.Constructor;

/* renamed from: j3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0567g extends s0 {

    /* renamed from: e, reason: collision with root package name */
    public final Constructor f7388e;

    public C0567g(Constructor constructor) {
        AbstractC0219i.e("constructor", constructor);
        this.f7388e = constructor;
    }

    @Override // j3.s0
    public final String d() {
        Class<?>[] parameterTypes = this.f7388e.getParameterTypes();
        AbstractC0219i.d("constructor.parameterTypes", parameterTypes);
        return P2.i.t0(parameterTypes, "<init>(", ")V", C0562b.f7371h);
    }
}
