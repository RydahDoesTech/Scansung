package Q3;

import a3.InterfaceC0108c;
import b3.AbstractC0219i;
import e4.J;
import java.util.Collection;
import p3.InterfaceC0742D;
import p3.InterfaceC0752N;
import p3.InterfaceC0755Q;
import p3.InterfaceC0758b;
import p3.InterfaceC0759c;
import p3.InterfaceC0761e;
import p3.InterfaceC0766j;
import p3.InterfaceC0780x;
import s3.AbstractC0828D;

/* loaded from: classes.dex */
public final class d implements f4.c {

    /* renamed from: a, reason: collision with root package name */
    public static final d f2340a = new d();

    public static /* synthetic */ void b(int i5) {
        Object[] objArr = new Object[3];
        if (i5 != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static InterfaceC0752N f(InterfaceC0758b interfaceC0758b) {
        while (interfaceC0758b instanceof InterfaceC0759c) {
            InterfaceC0759c interfaceC0759c = (InterfaceC0759c) interfaceC0758b;
            if (interfaceC0759c.i0() != 2) {
                break;
            }
            Collection collectionP = interfaceC0759c.p();
            AbstractC0219i.d("overriddenDescriptors", collectionP);
            interfaceC0758b = (InterfaceC0759c) P2.m.K0(collectionP);
            if (interfaceC0758b == null) {
                return null;
            }
        }
        return interfaceC0758b.n();
    }

    @Override // f4.c
    public boolean a(J j5, J j6) {
        if (j5 == null) {
            b(0);
            throw null;
        }
        if (j6 != null) {
            return j5.equals(j6);
        }
        b(1);
        throw null;
    }

    public boolean c(InterfaceC0766j interfaceC0766j, InterfaceC0766j interfaceC0766j2, boolean z4, boolean z5) {
        if ((interfaceC0766j instanceof InterfaceC0761e) && (interfaceC0766j2 instanceof InterfaceC0761e)) {
            return AbstractC0219i.a(((InterfaceC0761e) interfaceC0766j).I(), ((InterfaceC0761e) interfaceC0766j2).I());
        }
        if ((interfaceC0766j instanceof InterfaceC0755Q) && (interfaceC0766j2 instanceof InterfaceC0755Q)) {
            return d((InterfaceC0755Q) interfaceC0766j, (InterfaceC0755Q) interfaceC0766j2, z4, b.f);
        }
        if (!(interfaceC0766j instanceof InterfaceC0758b) || !(interfaceC0766j2 instanceof InterfaceC0758b)) {
            return ((interfaceC0766j instanceof InterfaceC0742D) && (interfaceC0766j2 instanceof InterfaceC0742D)) ? AbstractC0219i.a(((AbstractC0828D) ((InterfaceC0742D) interfaceC0766j)).f8745h, ((AbstractC0828D) ((InterfaceC0742D) interfaceC0766j2)).f8745h) : AbstractC0219i.a(interfaceC0766j, interfaceC0766j2);
        }
        InterfaceC0758b interfaceC0758b = (InterfaceC0758b) interfaceC0766j;
        InterfaceC0758b interfaceC0758b2 = (InterfaceC0758b) interfaceC0766j2;
        AbstractC0219i.e("a", interfaceC0758b);
        AbstractC0219i.e("b", interfaceC0758b2);
        boolean z6 = true;
        if (!interfaceC0758b.equals(interfaceC0758b2)) {
            if (!AbstractC0219i.a(interfaceC0758b.getName(), interfaceC0758b2.getName()) || ((z5 && (interfaceC0758b instanceof InterfaceC0780x) && (interfaceC0758b2 instanceof InterfaceC0780x) && ((InterfaceC0780x) interfaceC0758b).z() != ((InterfaceC0780x) interfaceC0758b2).z()) || ((AbstractC0219i.a(interfaceC0758b.l(), interfaceC0758b2.l()) && (!z4 || !AbstractC0219i.a(f(interfaceC0758b), f(interfaceC0758b2)))) || f.p(interfaceC0758b) || f.p(interfaceC0758b2) || !e(interfaceC0758b, interfaceC0758b2, b.f2336e, z4)))) {
                return false;
            }
            p pVar = new p(new a(interfaceC0758b, interfaceC0758b2, z4));
            if (pVar.m(interfaceC0758b, interfaceC0758b2, null, true).c() != 1 || pVar.m(interfaceC0758b2, interfaceC0758b, null, true).c() != 1) {
                z6 = false;
            }
        }
        return z6;
    }

    public boolean d(InterfaceC0755Q interfaceC0755Q, InterfaceC0755Q interfaceC0755Q2, boolean z4, InterfaceC0108c interfaceC0108c) {
        AbstractC0219i.e("a", interfaceC0755Q);
        AbstractC0219i.e("b", interfaceC0755Q2);
        AbstractC0219i.e("equivalentCallables", interfaceC0108c);
        if (interfaceC0755Q.equals(interfaceC0755Q2)) {
            return true;
        }
        return !AbstractC0219i.a(interfaceC0755Q.l(), interfaceC0755Q2.l()) && e(interfaceC0755Q, interfaceC0755Q2, interfaceC0108c, z4) && interfaceC0755Q.x0() == interfaceC0755Q2.x0();
    }

    public boolean e(InterfaceC0766j interfaceC0766j, InterfaceC0766j interfaceC0766j2, InterfaceC0108c interfaceC0108c, boolean z4) {
        InterfaceC0766j interfaceC0766jL = interfaceC0766j.l();
        InterfaceC0766j interfaceC0766jL2 = interfaceC0766j2.l();
        return ((interfaceC0766jL instanceof InterfaceC0759c) || (interfaceC0766jL2 instanceof InterfaceC0759c)) ? ((Boolean) interfaceC0108c.c(interfaceC0766jL, interfaceC0766jL2)).booleanValue() : c(interfaceC0766jL, interfaceC0766jL2, z4, true);
    }
}
