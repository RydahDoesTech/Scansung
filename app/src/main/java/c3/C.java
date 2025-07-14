package C3;

import O3.AbstractC0071c;
import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import j3.C0582w;
import j3.C0585z;
import j3.x0;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Type;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;

/* loaded from: classes.dex */
public final class C extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f354e;
    public final /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f355g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(Object obj, Object obj2, Object obj3, int i5) {
        super(0);
        this.f353d = i5;
        this.f354e = obj;
        this.f = obj2;
        this.f355g = obj3;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        switch (this.f353d) {
            case 0:
                D d5 = (D) this.f354e;
                d4.l lVar = ((B3.b) d5.f357b.f255e).f223a;
                A a5 = new A(d5, (v3.u) this.f, (A3.h) this.f355g);
                lVar.getClass();
                return new d4.h(lVar, a5);
            case 1:
                return ((AbstractC0071c) this.f354e).b((ByteArrayInputStream) this.f, ((a4.i) ((c4.o) this.f355g).f5190b.f3058d).f3050p);
            default:
                InterfaceC0763g interfaceC0763gI = ((AbstractC0438v) this.f354e).I0().i();
                if (!(interfaceC0763gI instanceof InterfaceC0761e)) {
                    throw new O2.e("Supertype not a class: " + interfaceC0763gI, 2);
                }
                Class clsJ = x0.j((InterfaceC0761e) interfaceC0763gI);
                C0582w c0582w = (C0582w) this.f;
                if (clsJ == null) {
                    throw new O2.e("Unsupported superclass of " + c0582w + ": " + interfaceC0763gI, 2);
                }
                C0585z c0585z = (C0585z) this.f355g;
                boolean zA = AbstractC0219i.a(c0585z.f7460e.getSuperclass(), clsJ);
                Class cls = c0585z.f7460e;
                if (zA) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    AbstractC0219i.d("{\n                      …ass\n                    }", genericSuperclass);
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                AbstractC0219i.d("jClass.interfaces", interfaces);
                int iR0 = P2.i.r0(clsJ, interfaces);
                if (iR0 >= 0) {
                    Type type = cls.getGenericInterfaces()[iR0];
                    AbstractC0219i.d("{\n                      …ex]\n                    }", type);
                    return type;
                }
                throw new O2.e("No superclass of " + c0582w + " in Java reflection for " + interfaceC0763gI, 2);
        }
    }
}
