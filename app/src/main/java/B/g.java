package B;

import E1.i;
import O2.l;
import O3.AbstractC0073e;
import O3.B;
import P2.m;
import P3.k;
import P3.p;
import X3.n;
import Z1.j;
import Z1.t;
import a1.ComponentCallbacks2C0095c;
import android.app.Application;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import b3.AbstractC0219i;
import c4.s;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.C0382z4;
import com.google.firebase.auth.FirebaseAuth;
import com.idm.fotaagent.restapi.restclient.push.campaign.button.Action;
import e4.AbstractC0438v;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import k.Q0;
import m3.AbstractC0695h;
import p3.AbstractC0779w;
import p3.C0770n;
import p3.InterfaceC0742D;
import p3.InterfaceC0746H;
import p3.InterfaceC0749K;
import p3.InterfaceC0750L;
import p3.InterfaceC0752N;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import p3.InterfaceC0766j;
import p3.InterfaceC0768l;
import p3.InterfaceC0776t;
import s3.AbstractC0825A;
import s3.AbstractC0828D;
import s3.AbstractC0832H;
import s3.AbstractC0854j;
import s3.C0826B;
import s3.C0834J;
import s3.C0835K;
import s3.C0836L;
import s3.C0843T;
import s3.C0855k;
import s3.C0867w;
import s3.y;
import v3.o;
import x3.EnumC0915b;

/* loaded from: classes.dex */
public class g implements F.e, B1.a, i, InterfaceC0752N, I1.f, InterfaceC0768l, M0.b, j, t1.d, a4.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f94d;

    /* renamed from: e, reason: collision with root package name */
    public Object f95e;

    public /* synthetic */ g(int i5, Object obj) {
        this.f94d = i5;
        this.f95e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    @Override // p3.InterfaceC0768l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A(s3.C0855k r18, java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B.g.A(s3.k, java.lang.Object):java.lang.Object");
    }

    @Override // a4.e
    public a4.d F(N3.b bVar) {
        a4.d dVarF;
        AbstractC0219i.e("classId", bVar);
        N3.c cVarG = bVar.g();
        AbstractC0219i.d("classId.packageFqName", cVarG);
        Iterator it = AbstractC0779w.i((InterfaceC0746H) this.f95e, cVarG).iterator();
        while (it.hasNext()) {
            InterfaceC0742D interfaceC0742D = (InterfaceC0742D) it.next();
            if ((interfaceC0742D instanceof b4.c) && (dVarF = ((b4.c) interfaceC0742D).f5104l.F(bVar)) != null) {
                return dVarF;
            }
        }
        return null;
    }

    @Override // p3.InterfaceC0768l
    public Object G(y yVar, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        P3.g gVar = (P3.g) this.f95e;
        gVar.getClass();
        gVar.R(yVar.f8900g, Action.KEY_PACKAGENAME, sb);
        if (gVar.f2196a.l()) {
            sb.append(" in context of ");
            gVar.N(yVar.f, sb, false);
        }
        return l.f2016a;
    }

    @Override // p3.InterfaceC0768l
    public /* bridge */ /* synthetic */ Object H(InterfaceC0776t interfaceC0776t, Object obj) {
        k(interfaceC0776t, (StringBuilder) obj);
        return l.f2016a;
    }

    @Override // t1.d
    public void I(Exception exc) {
        long j5;
        if (exc instanceof V1.i) {
            A.d dVar = Z1.c.f2862e;
            dVar.i("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            Z1.c cVar = (Z1.c) ((G.a) this.f95e).f;
            int i5 = (int) cVar.f2864b;
            if (i5 == 30 || i5 == 60 || i5 == 120 || i5 == 240 || i5 == 480) {
                long j6 = cVar.f2864b;
                j5 = j6 + j6;
            } else {
                j5 = i5 != 960 ? 30L : 960L;
            }
            cVar.f2864b = j5;
            cVar.f2863a = (cVar.f2864b * 1000) + System.currentTimeMillis();
            long j7 = cVar.f2863a;
            StringBuilder sb = new StringBuilder(43);
            sb.append("Scheduling refresh for ");
            sb.append(j7);
            dVar.i(sb.toString(), new Object[0]);
            cVar.f2865c.postDelayed(cVar.f2866d, cVar.f2864b * 1000);
        }
    }

    @Override // p3.InterfaceC0768l
    public Object J(AbstractC0825A abstractC0825A, Object obj) {
        C0855k c0855kV;
        String str;
        StringBuilder sb = (StringBuilder) obj;
        P3.g gVar = (P3.g) this.f95e;
        gVar.getClass();
        boolean z4 = abstractC0825A.L() == 4;
        if (!gVar.p()) {
            gVar.w(sb, abstractC0825A, null);
            List listR0 = abstractC0825A.r0();
            AbstractC0219i.d("klass.contextReceivers", listR0);
            gVar.A(sb, listR0);
            if (!z4) {
                C0770n c0770nB = abstractC0825A.b();
                AbstractC0219i.d("klass.visibility", c0770nB);
                gVar.f0(c0770nB, sb);
            }
            if ((abstractC0825A.L() != 2 || abstractC0825A.i() != 4) && (!g4.f.a(abstractC0825A.L()) || abstractC0825A.i() != 1)) {
                int i5 = abstractC0825A.i();
                A3.f.u(i5, "klass.modality");
                gVar.J(i5, sb, P3.g.t(abstractC0825A));
            }
            gVar.I(abstractC0825A, sb);
            gVar.L(sb, gVar.o().contains(P3.h.INNER) && abstractC0825A.A(), "inner");
            gVar.L(sb, gVar.o().contains(P3.h.DATA) && abstractC0825A.D0(), "data");
            gVar.L(sb, gVar.o().contains(P3.h.INLINE) && abstractC0825A.j(), "inline");
            gVar.L(sb, gVar.o().contains(P3.h.VALUE) && abstractC0825A.v(), "value");
            gVar.L(sb, gVar.o().contains(P3.h.FUN) && abstractC0825A.f0(), "fun");
            if (abstractC0825A.N()) {
                str = "companion object";
            } else {
                int iC = Q0.c(abstractC0825A.L());
                if (iC == 0) {
                    str = "class";
                } else if (iC == 1) {
                    str = "interface";
                } else if (iC == 2) {
                    str = "enum class";
                } else if (iC == 3) {
                    str = "enum entry";
                } else if (iC == 4) {
                    str = "annotation class";
                } else {
                    if (iC != 5) {
                        throw new O2.d();
                    }
                    str = "object";
                }
            }
            sb.append(gVar.G(str));
        }
        boolean zM = Q3.f.m(abstractC0825A);
        k kVar = gVar.f2196a;
        if (zM) {
            if (((Boolean) kVar.f2221F.a(k.f2216W[30], kVar)).booleanValue()) {
                if (gVar.p()) {
                    sb.append("companion object");
                }
                P3.g.V(sb);
                InterfaceC0766j interfaceC0766jL = abstractC0825A.l();
                if (interfaceC0766jL != null) {
                    sb.append("of ");
                    N3.f name = interfaceC0766jL.getName();
                    AbstractC0219i.d("containingDeclaration.name", name);
                    sb.append(gVar.M(name, false));
                }
            }
            if (gVar.s() || !AbstractC0219i.a(abstractC0825A.getName(), N3.h.f1846b)) {
                if (!gVar.p()) {
                    P3.g.V(sb);
                }
                N3.f name2 = abstractC0825A.getName();
                AbstractC0219i.d("descriptor.name", name2);
                sb.append(gVar.M(name2, true));
            }
        } else {
            if (!gVar.p()) {
                P3.g.V(sb);
            }
            gVar.N(abstractC0825A, sb, true);
        }
        if (!z4) {
            List listR = abstractC0825A.r();
            AbstractC0219i.d("klass.declaredTypeParameters", listR);
            gVar.b0(sb, listR, false);
            gVar.y(abstractC0825A, sb);
            if (!g4.f.a(abstractC0825A.L())) {
                if (((Boolean) kVar.f2245i.a(k.f2216W[7], kVar)).booleanValue() && (c0855kV = abstractC0825A.V()) != null) {
                    sb.append(" ");
                    gVar.w(sb, c0855kV, null);
                    C0855k c0855k = c0855kV;
                    C0770n c0770nB2 = c0855k.b();
                    AbstractC0219i.d("primaryConstructor.visibility", c0770nB2);
                    gVar.f0(c0770nB2, sb);
                    sb.append(gVar.G("constructor"));
                    List listV0 = c0855k.v0();
                    AbstractC0219i.d("primaryConstructor.valueParameters", listV0);
                    gVar.e0(sb, listV0, c0855kV.o0());
                }
            }
            if (!((Boolean) kVar.f2258w.a(k.f2216W[21], kVar)).booleanValue() && !AbstractC0695h.D(abstractC0825A.q())) {
                Collection collectionJ = abstractC0825A.I().j();
                AbstractC0219i.d("klass.typeConstructor.supertypes", collectionJ);
                if (!collectionJ.isEmpty() && (collectionJ.size() != 1 || !AbstractC0695h.w((AbstractC0438v) collectionJ.iterator().next()))) {
                    P3.g.V(sb);
                    sb.append(": ");
                    m.z0(collectionJ, sb, null, null, new P3.f(gVar, 2), 60);
                }
            }
            gVar.g0(sb, listR);
        }
        return l.f2016a;
    }

    @Override // p3.InterfaceC0768l
    public Object K(s sVar, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        P3.g gVar = (P3.g) this.f95e;
        gVar.getClass();
        gVar.w(sb, sVar, null);
        C0770n c0770n = sVar.f5206h;
        AbstractC0219i.d("typeAlias.visibility", c0770n);
        gVar.f0(c0770n, sb);
        gVar.I(sVar, sb);
        sb.append(gVar.G("typealias"));
        sb.append(" ");
        gVar.N(sVar, sb, true);
        gVar.b0(sb, sVar.r(), false);
        gVar.y(sVar, sb);
        sb.append(" = ");
        sb.append(gVar.W(sVar.Q0()));
        return l.f2016a;
    }

    @Override // p3.InterfaceC0768l
    public Object M(C0835K c0835k, Object obj) {
        m(c0835k, (StringBuilder) obj, "getter");
        return l.f2016a;
    }

    @Override // Z1.j
    public void a(Status status) {
        int i5 = status.f5238e;
        if (i5 == 17011 || i5 == 17021 || i5 == 17005) {
            ((FirebaseAuth) this.f95e).a();
        }
    }

    @Override // p3.InterfaceC0768l
    public Object b(C0826B c0826b, Object obj) {
        ((P3.g) this.f95e).N(c0826b, (StringBuilder) obj, true);
        return l.f2016a;
    }

    @Override // Z1.m
    public void c(C0382z4 c0382z4, t tVar) {
        FirebaseAuth.d((FirebaseAuth) this.f95e, tVar, c0382z4, true, true);
    }

    public K.h d(int i5) {
        return null;
    }

    public void e(AbstractC0073e abstractC0073e) {
        if (!abstractC0073e.q()) {
            if (!(abstractC0073e instanceof B)) {
                String strValueOf = String.valueOf(abstractC0073e.getClass());
                throw new IllegalArgumentException(A3.f.p(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
            }
            B b2 = (B) abstractC0073e;
            e(b2.f);
            e(b2.f2023g);
            return;
        }
        int size = abstractC0073e.size();
        int[] iArr = B.f2021k;
        int iBinarySearch = Arrays.binarySearch(iArr, size);
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int i5 = iArr[iBinarySearch + 1];
        Stack stack = (Stack) this.f95e;
        if (stack.isEmpty() || ((AbstractC0073e) stack.peek()).size() >= i5) {
            stack.push(abstractC0073e);
            return;
        }
        int i6 = iArr[iBinarySearch];
        AbstractC0073e b5 = (AbstractC0073e) stack.pop();
        while (!stack.isEmpty() && ((AbstractC0073e) stack.peek()).size() < i6) {
            b5 = new B((AbstractC0073e) stack.pop(), b5);
        }
        B b6 = new B(b5, abstractC0073e);
        while (!stack.isEmpty()) {
            int[] iArr2 = B.f2021k;
            int iBinarySearch2 = Arrays.binarySearch(iArr2, b6.f2022e);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((AbstractC0073e) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                break;
            } else {
                b6 = new B((AbstractC0073e) stack.pop(), b6);
            }
        }
        stack.push(b6);
    }

    @Override // p3.InterfaceC0768l
    public Object f(C0836L c0836l, Object obj) {
        m(c0836l, (StringBuilder) obj, "setter");
        return l.f2016a;
    }

    @Override // p3.InterfaceC0768l
    public Object g(AbstractC0854j abstractC0854j, Object obj) {
        ((P3.g) this.f95e).Z(abstractC0854j, (StringBuilder) obj, true);
        return l.f2016a;
    }

    @Override // N2.a
    public Object get() {
        return new Q0.h(new b4.d(), new Y0.h(5), Q0.a.f, (Q0.j) ((L0.e) this.f95e).get());
    }

    public K.h h(int i5) {
        return null;
    }

    public boolean i(int i5, int i6, Bundle bundle) {
        return false;
    }

    public InterfaceC0761e j(o oVar) {
        AbstractC0219i.e("javaClass", oVar);
        N3.c cVarB = oVar.b();
        Class cls = oVar.f9258a;
        Class<?> declaringClass = cls.getDeclaringClass();
        o oVar2 = declaringClass != null ? new o(declaringClass) : null;
        if (oVar2 != null) {
            InterfaceC0761e interfaceC0761eJ = j(oVar2);
            n nVarR = interfaceC0761eJ != null ? interfaceC0761eJ.R() : null;
            InterfaceC0763g interfaceC0763gG = nVarR != null ? nVarR.g(N3.f.e(cls.getSimpleName()), EnumC0915b.f9321k) : null;
            if (interfaceC0763gG instanceof InterfaceC0761e) {
                return (InterfaceC0761e) interfaceC0763gG;
            }
            return null;
        }
        N3.c cVarE = cVarB.e();
        AbstractC0219i.d("fqName.parent()", cVarE);
        C3.t tVar = (C3.t) m.w0(((B3.f) this.f95e).a(cVarE));
        if (tVar == null) {
            return null;
        }
        C3.y yVar = tVar.f444m.f386d;
        yVar.getClass();
        return yVar.v(N3.f.e(cls.getSimpleName()), oVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(p3.InterfaceC0776t r10, java.lang.StringBuilder r11) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B.g.k(p3.t, java.lang.StringBuilder):void");
    }

    @Override // p3.InterfaceC0768l
    public Object l(C0843T c0843t, Object obj) {
        ((P3.g) this.f95e).d0(c0843t, true, (StringBuilder) obj, true);
        return l.f2016a;
    }

    public void m(InterfaceC0749K interfaceC0749K, StringBuilder sb, String str) {
        P3.g gVar = (P3.g) this.f95e;
        k kVar = gVar.f2196a;
        int iOrdinal = ((p) kVar.f2222G.a(k.f2216W[31], kVar)).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                return;
            }
            k(interfaceC0749K, sb);
        } else {
            gVar.I(interfaceC0749K, sb);
            sb.append(str.concat(" for "));
            InterfaceC0750L interfaceC0750LO0 = ((AbstractC0832H) interfaceC0749K).O0();
            AbstractC0219i.d("descriptor.correspondingProperty", interfaceC0750LO0);
            P3.g.l(gVar, interfaceC0750LO0, sb);
        }
    }

    @Override // F.e
    public void onCancel() {
        ((B0.t) this.f95e).d();
    }

    @Override // p3.InterfaceC0768l
    public Object q(AbstractC0828D abstractC0828D, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        P3.g gVar = (P3.g) this.f95e;
        gVar.getClass();
        gVar.R(abstractC0828D.f8745h, "package-fragment", sb);
        if (gVar.f2196a.l()) {
            sb.append(" in ");
            gVar.N(abstractC0828D.l(), sb, false);
        }
        return l.f2016a;
    }

    @Override // p3.InterfaceC0768l
    public Object s(C0867w c0867w, Object obj) {
        AbstractC0219i.e("descriptor", c0867w);
        ((StringBuilder) obj).append(c0867w.getName());
        return l.f2016a;
    }

    public String toString() {
        switch (this.f94d) {
            case 9:
                StringBuilder sb = new StringBuilder();
                C3.t tVar = (C3.t) this.f95e;
                sb.append(tVar);
                sb.append(": ");
                sb.append(((Map) V1.a.Q(tVar.f443l, C3.t.f440p[0])).keySet());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // p3.InterfaceC0768l
    public Object w(C0834J c0834j, Object obj) {
        AbstractC0219i.e("descriptor", c0834j);
        P3.g.l((P3.g) this.f95e, c0834j, (StringBuilder) obj);
        return l.f2016a;
    }

    public /* synthetic */ g(int i5, boolean z4) {
        this.f94d = i5;
    }

    public g(C3.t tVar) {
        this.f94d = 9;
        AbstractC0219i.e("packageFragment", tVar);
        this.f95e = tVar;
    }

    public g(TextView textView) {
        this.f94d = 23;
        this.f95e = new X.g(textView);
    }

    public g(EditText editText) {
        this.f94d = 22;
        this.f95e = new E0.d(editText);
    }

    public g(V1.g gVar) {
        this.f94d = 27;
        gVar.a();
        this.f95e = new Z1.c(gVar);
        ComponentCallbacks2C0095c.b((Application) gVar.f2610a.getApplicationContext());
        ComponentCallbacks2C0095c.f2929h.a(new Z1.h(0, this));
    }

    public g(int i5) {
        this.f94d = i5;
        switch (i5) {
            case 13:
                this.f95e = new K.i(this);
                break;
            case 16:
                this.f95e = new Stack();
                break;
            default:
                this.f95e = new LinkedHashMap();
                break;
        }
    }
}
