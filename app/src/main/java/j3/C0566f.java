package j3;

import b3.AbstractC0219i;
import java.util.Arrays;
import java.util.List;

/* renamed from: j3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0566f extends s0 {

    /* renamed from: e, reason: collision with root package name */
    public final List f7385e;

    public C0566f(Class cls) throws SecurityException {
        AbstractC0219i.e("jClass", cls);
        Object[] declaredMethods = cls.getDeclaredMethods();
        AbstractC0219i.d("jClass.declaredMethods", declaredMethods);
        E0.b bVar = new E0.b(4);
        AbstractC0219i.e("<this>", declaredMethods);
        if (declaredMethods.length != 0) {
            declaredMethods = Arrays.copyOf(declaredMethods, declaredMethods.length);
            AbstractC0219i.d("copyOf(this, size)", declaredMethods);
            if (declaredMethods.length > 1) {
                Arrays.sort(declaredMethods, bVar);
            }
        }
        this.f7385e = P2.i.i0(declaredMethods);
    }

    @Override // j3.s0
    public final String d() {
        return P2.m.A0(this.f7385e, "", "<init>(", ")V", C0562b.f7370g, 24);
    }
}
