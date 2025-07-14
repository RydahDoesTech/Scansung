package U3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import b3.p;
import f4.g;
import g3.y;
import m3.AbstractC0695h;
import n4.k;
import p3.InterfaceC0742D;
import p3.InterfaceC0749K;
import p3.InterfaceC0750L;
import p3.InterfaceC0759c;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import p3.InterfaceC0764h;
import p3.InterfaceC0766j;
import p3.InterfaceC0767k;
import p3.InterfaceC0781y;
import q3.InterfaceC0792b;
import s3.AbstractC0828D;
import s3.AbstractC0832H;
import s3.C0843T;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2570a = 0;

    static {
        N3.f.e("value");
    }

    public static final boolean a(C0843T c0843t) {
        Boolean boolG = k.g(y.N(c0843t), a.f2563d, c.f2565l);
        AbstractC0219i.d("ifAny(\n        listOf(th…eclaresDefaultValue\n    )", boolG);
        return boolG.booleanValue();
    }

    public static InterfaceC0759c b(InterfaceC0759c interfaceC0759c, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("<this>", interfaceC0759c);
        return (InterfaceC0759c) k.e(y.N(interfaceC0759c), new b(false), new d(new p(), interfaceC0107b));
    }

    public static final N3.c c(InterfaceC0767k interfaceC0767k) {
        AbstractC0219i.e("<this>", interfaceC0767k);
        N3.e eVarH = h(interfaceC0767k);
        if (!eVarH.d()) {
            eVarH = null;
        }
        if (eVarH != null) {
            return eVarH.g();
        }
        return null;
    }

    public static final InterfaceC0761e d(InterfaceC0792b interfaceC0792b) {
        AbstractC0219i.e("<this>", interfaceC0792b);
        InterfaceC0763g interfaceC0763gI = interfaceC0792b.d().I0().i();
        if (interfaceC0763gI instanceof InterfaceC0761e) {
            return (InterfaceC0761e) interfaceC0763gI;
        }
        return null;
    }

    public static final AbstractC0695h e(InterfaceC0766j interfaceC0766j) {
        AbstractC0219i.e("<this>", interfaceC0766j);
        return j(interfaceC0766j).g();
    }

    public static final N3.b f(InterfaceC0763g interfaceC0763g) {
        InterfaceC0766j interfaceC0766jL;
        N3.b bVarF;
        if (interfaceC0763g == null || (interfaceC0766jL = interfaceC0763g.l()) == null) {
            return null;
        }
        if (interfaceC0766jL instanceof InterfaceC0742D) {
            return new N3.b(((AbstractC0828D) ((InterfaceC0742D) interfaceC0766jL)).f8745h, interfaceC0763g.getName());
        }
        if (!(interfaceC0766jL instanceof InterfaceC0764h) || (bVarF = f((InterfaceC0763g) interfaceC0766jL)) == null) {
            return null;
        }
        return bVarF.d(interfaceC0763g.getName());
    }

    public static final N3.c g(InterfaceC0766j interfaceC0766j) {
        AbstractC0219i.e("<this>", interfaceC0766j);
        N3.c cVarH = Q3.f.h(interfaceC0766j);
        if (cVarH == null) {
            cVarH = Q3.f.i(interfaceC0766j).g();
        }
        if (cVarH != null) {
            return cVarH;
        }
        Q3.f.a(4);
        throw null;
    }

    public static final N3.e h(InterfaceC0766j interfaceC0766j) {
        AbstractC0219i.e("<this>", interfaceC0766j);
        N3.e eVarG = Q3.f.g(interfaceC0766j);
        AbstractC0219i.d("getFqName(this)", eVarG);
        return eVarG;
    }

    public static final void i(InterfaceC0781y interfaceC0781y) {
        AbstractC0219i.e("<this>", interfaceC0781y);
        if (interfaceC0781y.y0(g.f6741a) != null) {
            throw new ClassCastException();
        }
    }

    public static final InterfaceC0781y j(InterfaceC0766j interfaceC0766j) {
        AbstractC0219i.e("<this>", interfaceC0766j);
        InterfaceC0781y interfaceC0781yD = Q3.f.d(interfaceC0766j);
        AbstractC0219i.d("getContainingModule(this)", interfaceC0781yD);
        return interfaceC0781yD;
    }

    public static final InterfaceC0759c k(InterfaceC0759c interfaceC0759c) {
        AbstractC0219i.e("<this>", interfaceC0759c);
        if (!(interfaceC0759c instanceof InterfaceC0749K)) {
            return interfaceC0759c;
        }
        InterfaceC0750L interfaceC0750LO0 = ((AbstractC0832H) ((InterfaceC0749K) interfaceC0759c)).O0();
        AbstractC0219i.d("correspondingProperty", interfaceC0750LO0);
        return interfaceC0750LO0;
    }
}
