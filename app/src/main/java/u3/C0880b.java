package u3;

import b3.AbstractC0219i;
import p4.h;
import r0.AbstractC0807a;
import s0.AbstractC0823a;

/* renamed from: u3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0880b {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f9186a;

    public /* synthetic */ C0880b(ClassLoader classLoader) {
        this.f9186a = classLoader;
    }

    public B.g a(N3.b bVar, M3.f fVar) {
        C0881c c0881cA;
        AbstractC0219i.e("classId", bVar);
        AbstractC0219i.e("jvmMetadataVersion", fVar);
        String strM0 = h.m0(bVar.h().b(), '.', '$');
        if (!bVar.g().d()) {
            strM0 = bVar.g() + '.' + strM0;
        }
        Class clsE = AbstractC0823a.e(this.f9186a, strM0);
        if (clsE == null || (c0881cA = AbstractC0807a.a(clsE)) == null) {
            return null;
        }
        return new B.g(8, c0881cA);
    }
}
