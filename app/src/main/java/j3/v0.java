package j3;

import I3.C0030l;
import I3.C0042y;
import O3.AbstractC0070b;
import O3.C0077i;
import O3.C0083o;
import b3.AbstractC0219i;
import e1.AbstractC0415a;
import java.lang.reflect.Method;
import o3.C0718a;
import p3.InterfaceC0750L;
import p3.InterfaceC0752N;
import p3.InterfaceC0766j;
import p3.InterfaceC0776t;
import r0.AbstractC0808b;
import s3.AbstractC0859o;
import s3.C0835K;
import s3.C0836L;

/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final N3.b f7443a = N3.b.j(new N3.c("java.lang.Void"));

    /* JADX WARN: Multi-variable type inference failed */
    public static C0570j a(InterfaceC0776t interfaceC0776t) {
        String strA = AbstractC0808b.a(interfaceC0776t);
        if (strA == null) {
            if (interfaceC0776t instanceof C0835K) {
                String strB = U3.f.k(interfaceC0776t).getName().b();
                AbstractC0219i.d("descriptor.propertyIfAccessor.name.asString()", strB);
                strA = y3.w.a(strB);
            } else if (interfaceC0776t instanceof C0836L) {
                String strB2 = U3.f.k(interfaceC0776t).getName().b();
                AbstractC0219i.d("descriptor.propertyIfAccessor.name.asString()", strB2);
                strA = y3.w.b(strB2);
            } else {
                strA = ((AbstractC0859o) interfaceC0776t).getName().b();
                AbstractC0219i.d("descriptor.name.asString()", strA);
            }
        }
        return new C0570j(new M3.e(strA, V1.a.j(interfaceC0776t, 1)));
    }

    public static s0 b(InterfaceC0750L interfaceC0750L) {
        AbstractC0219i.e("possiblyOverriddenProperty", interfaceC0750L);
        InterfaceC0750L interfaceC0750LA = ((InterfaceC0750L) Q3.f.u(interfaceC0750L)).a();
        AbstractC0219i.d("unwrapFakeOverride(possi…rriddenProperty).original", interfaceC0750LA);
        if (interfaceC0750LA instanceof c4.q) {
            c4.q qVar = (c4.q) interfaceC0750LA;
            C0083o c0083o = L3.k.f1799d;
            AbstractC0219i.d("propertySignature", c0083o);
            I3.G g5 = qVar.f5197D;
            L3.e eVar = (L3.e) AbstractC0415a.s(g5, c0083o);
            if (eVar != null) {
                return new C0573m(interfaceC0750LA, g5, eVar, qVar.E, qVar.f5198F);
            }
        } else if (interfaceC0750LA instanceof A3.h) {
            InterfaceC0752N interfaceC0752NN = ((A3.h) interfaceC0750LA).n();
            u3.g gVar = interfaceC0752NN instanceof u3.g ? (u3.g) interfaceC0752NN : null;
            v3.s sVar = gVar != null ? gVar.f9194d : null;
            if (sVar instanceof v3.u) {
                return new C0571k(((v3.u) sVar).f9264a);
            }
            if (!(sVar instanceof v3.x)) {
                throw new O2.e("Incorrect resolution sequence for Java field " + interfaceC0750LA + " (source = " + sVar + ')', 2);
            }
            Method method = ((v3.x) sVar).f9266a;
            C0836L c0836lE = interfaceC0750LA.e();
            InterfaceC0752N interfaceC0752NN2 = c0836lE != null ? c0836lE.n() : null;
            u3.g gVar2 = interfaceC0752NN2 instanceof u3.g ? (u3.g) interfaceC0752NN2 : null;
            v3.s sVar2 = gVar2 != null ? gVar2.f9194d : null;
            v3.x xVar = sVar2 instanceof v3.x ? (v3.x) sVar2 : null;
            return new C0572l(method, xVar != null ? xVar.f9266a : null);
        }
        C0835K c0835kF = interfaceC0750LA.f();
        AbstractC0219i.b(c0835kF);
        C0570j c0570jA = a(c0835kF);
        C0836L c0836lE2 = interfaceC0750LA.e();
        return new C0574n(c0570jA, c0836lE2 != null ? a(c0836lE2) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static s0 c(InterfaceC0776t interfaceC0776t) {
        Method method;
        AbstractC0219i.e("possiblySubstitutedFunction", interfaceC0776t);
        InterfaceC0776t interfaceC0776tA = ((InterfaceC0776t) Q3.f.u(interfaceC0776t)).a();
        AbstractC0219i.d("unwrapFakeOverride(possi…titutedFunction).original", interfaceC0776tA);
        if (interfaceC0776tA instanceof c4.b) {
            c4.b bVar = (c4.b) interfaceC0776tA;
            AbstractC0070b abstractC0070bJ0 = bVar.j0();
            if (abstractC0070bJ0 instanceof C0042y) {
                C0077i c0077i = M3.h.f1826a;
                M3.e eVarC = M3.h.c((C0042y) abstractC0070bJ0, bVar.A0(), bVar.Y());
                if (eVarC != null) {
                    return new C0570j(eVarC);
                }
            }
            if (abstractC0070bJ0 instanceof C0030l) {
                C0077i c0077i2 = M3.h.f1826a;
                M3.e eVarA = M3.h.a((C0030l) abstractC0070bJ0, bVar.A0(), bVar.Y());
                if (eVarA != null) {
                    InterfaceC0766j interfaceC0766jL = interfaceC0776t.l();
                    AbstractC0219i.d("possiblySubstitutedFunction.containingDeclaration", interfaceC0766jL);
                    return Q3.j.b(interfaceC0766jL) ? new C0570j(eVarA) : new C0569i(eVarA);
                }
            }
            return a(interfaceC0776tA);
        }
        if (interfaceC0776tA instanceof A3.g) {
            InterfaceC0752N interfaceC0752NN = ((A3.g) interfaceC0776tA).n();
            u3.g gVar = interfaceC0752NN instanceof u3.g ? (u3.g) interfaceC0752NN : null;
            v3.s sVar = gVar != null ? gVar.f9194d : null;
            v3.x xVar = sVar instanceof v3.x ? (v3.x) sVar : null;
            if (xVar != null && (method = xVar.f9266a) != null) {
                return new C0568h(method);
            }
            throw new O2.e("Incorrect resolution sequence for Java method " + interfaceC0776tA, 2);
        }
        if (!(interfaceC0776tA instanceof A3.b)) {
            AbstractC0859o abstractC0859o = (AbstractC0859o) interfaceC0776tA;
            if ((abstractC0859o.getName().equals(m3.n.f8144c) && Q3.q.n(interfaceC0776tA)) || ((abstractC0859o.getName().equals(m3.n.f8142a) && Q3.q.n(interfaceC0776tA)) || (AbstractC0219i.a(abstractC0859o.getName(), C0718a.f8244e) && interfaceC0776tA.v0().isEmpty()))) {
                return a(interfaceC0776tA);
            }
            throw new O2.e("Unknown origin of " + interfaceC0776tA + " (" + interfaceC0776tA.getClass() + ')', 2);
        }
        InterfaceC0752N interfaceC0752NN2 = ((A3.b) interfaceC0776tA).n();
        u3.g gVar2 = interfaceC0752NN2 instanceof u3.g ? (u3.g) interfaceC0752NN2 : null;
        Object obj = gVar2 != null ? gVar2.f9194d : null;
        if (obj instanceof v3.r) {
            return new C0567g(((v3.r) obj).f9262a);
        }
        if (obj instanceof v3.o) {
            v3.o oVar = (v3.o) obj;
            if (oVar.f9258a.isAnnotation()) {
                return new C0566f(oVar.f9258a);
            }
        }
        throw new O2.e("Incorrect resolution sequence for Java constructor " + interfaceC0776tA + " (" + obj + ')', 2);
    }
}
