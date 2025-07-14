package Q3;

import b3.AbstractC0219i;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import p3.AbstractC0756S;
import p3.C0777u;
import p3.C0782z;
import p3.InterfaceC0750L;
import p3.InterfaceC0759c;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import p3.InterfaceC0766j;
import p3.U;
import s3.C0835K;

/* loaded from: classes.dex */
public abstract class j {
    static {
        N3.b.j(new N3.c("kotlin.jvm.JvmInline"));
    }

    public static final boolean a(InterfaceC0759c interfaceC0759c) {
        AbstractC0219i.e("<this>", interfaceC0759c);
        if (interfaceC0759c instanceof C0835K) {
            InterfaceC0750L interfaceC0750LO0 = ((C0835K) interfaceC0759c).O0();
            AbstractC0219i.d("correspondingProperty", interfaceC0750LO0);
            if (d(interfaceC0750LO0)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(InterfaceC0766j interfaceC0766j) {
        AbstractC0219i.e("<this>", interfaceC0766j);
        return (interfaceC0766j instanceof InterfaceC0761e) && (((InterfaceC0761e) interfaceC0766j).S() instanceof C0777u);
    }

    public static final boolean c(AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("<this>", abstractC0438v);
        InterfaceC0763g interfaceC0763gI = abstractC0438v.I0().i();
        if (interfaceC0763gI != null) {
            return b(interfaceC0763gI);
        }
        return false;
    }

    public static final boolean d(U u4) {
        if (u4.b0() == null) {
            InterfaceC0766j interfaceC0766jL = u4.l();
            N3.f fVar = null;
            InterfaceC0761e interfaceC0761e = interfaceC0766jL instanceof InterfaceC0761e ? (InterfaceC0761e) interfaceC0766jL : null;
            if (interfaceC0761e != null) {
                int i5 = U3.f.f2570a;
                AbstractC0756S abstractC0756SS = interfaceC0761e.S();
                C0777u c0777u = abstractC0756SS instanceof C0777u ? (C0777u) abstractC0756SS : null;
                if (c0777u != null) {
                    fVar = c0777u.f8439a;
                }
            }
            if (AbstractC0219i.a(fVar, u4.getName())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean e(InterfaceC0766j interfaceC0766j) {
        return b(interfaceC0766j) || ((interfaceC0766j instanceof InterfaceC0761e) && (((InterfaceC0761e) interfaceC0766j).S() instanceof C0782z));
    }

    public static final AbstractC0442z f(AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("<this>", abstractC0438v);
        InterfaceC0763g interfaceC0763gI = abstractC0438v.I0().i();
        InterfaceC0761e interfaceC0761e = interfaceC0763gI instanceof InterfaceC0761e ? (InterfaceC0761e) interfaceC0763gI : null;
        if (interfaceC0761e == null) {
            return null;
        }
        int i5 = U3.f.f2570a;
        AbstractC0756S abstractC0756SS = interfaceC0761e.S();
        C0777u c0777u = abstractC0756SS instanceof C0777u ? (C0777u) abstractC0756SS : null;
        if (c0777u != null) {
            return (AbstractC0442z) c0777u.f8440b;
        }
        return null;
    }
}
