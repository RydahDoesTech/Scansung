package P3;

import C3.C0012d;
import P2.u;
import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import com.idm.core.tnds.IDMTndsXmlWbxmlDefine;
import com.idm.providers.mo.IDMMoInterface;
import e1.AbstractC0415a;
import e4.AbstractC0420c;
import e4.AbstractC0434q;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.C0418a;
import e4.C0430m;
import e4.C0437u;
import e4.C0440x;
import e4.J;
import e4.N;
import e4.X;
import e4.Z;
import g3.InterfaceC0466p;
import g3.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import m3.AbstractC0695h;
import p3.AbstractC0771o;
import p3.C0740B;
import p3.C0770n;
import p3.InterfaceC0742D;
import p3.InterfaceC0747I;
import p3.InterfaceC0750L;
import p3.InterfaceC0755Q;
import p3.InterfaceC0759c;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import p3.InterfaceC0764h;
import p3.InterfaceC0766j;
import p3.InterfaceC0767k;
import p3.InterfaceC0780x;
import p3.InterfaceC0781y;
import p3.U;
import q3.EnumC0794d;
import q3.InterfaceC0791a;
import q3.InterfaceC0792b;
import s3.C0835K;
import s3.C0836L;
import s3.C0843T;
import s3.C0855k;
import s3.C0864t;
import s3.C0867w;

/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: c, reason: collision with root package name */
    public static final g f2193c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f2194d;

    /* renamed from: e, reason: collision with root package name */
    public static final g f2195e;

    /* renamed from: a, reason: collision with root package name */
    public final k f2196a;

    /* renamed from: b, reason: collision with root package name */
    public final O2.i f2197b = new O2.i(new C0012d(3, this));

    static {
        Y0.j.T(d.f2178g);
        Y0.j.T(d.f2177e);
        Y0.j.T(d.f);
        Y0.j.T(d.f2179h);
        Y0.j.T(d.f2184m);
        f2193c = Y0.j.T(d.f2181j);
        Y0.j.T(d.f2182k);
        f2194d = Y0.j.T(d.n);
        f2195e = Y0.j.T(d.f2180i);
        Y0.j.T(d.f2183l);
    }

    public g(k kVar) {
        this.f2196a = kVar;
    }

    public static void V(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public static boolean h0(AbstractC0438v abstractC0438v) {
        if (AbstractC0415a.E(abstractC0438v)) {
            List listS0 = abstractC0438v.s0();
            if (listS0 == null || !listS0.isEmpty()) {
                Iterator it = listS0.iterator();
                while (it.hasNext()) {
                    if (((N) it.next()).c()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final void l(g gVar, InterfaceC0750L interfaceC0750L, StringBuilder sb) {
        if (!gVar.p()) {
            k kVar = gVar.f2196a;
            InterfaceC0466p[] interfaceC0466pArr = k.f2216W;
            if (!((Boolean) kVar.f2243g.a(interfaceC0466pArr[5], kVar)).booleanValue()) {
                if (gVar.o().contains(h.ANNOTATIONS)) {
                    gVar.w(sb, interfaceC0750L, null);
                    C0864t c0864tQ0 = interfaceC0750L.q0();
                    if (c0864tQ0 != null) {
                        gVar.w(sb, c0864tQ0, EnumC0794d.FIELD);
                    }
                    C0864t c0864tG0 = interfaceC0750L.g0();
                    if (c0864tG0 != null) {
                        gVar.w(sb, c0864tG0, EnumC0794d.PROPERTY_DELEGATE_FIELD);
                    }
                    if (((p) kVar.f2222G.a(interfaceC0466pArr[31], kVar)) == p.f2270e) {
                        C0835K c0835kF = interfaceC0750L.f();
                        if (c0835kF != null) {
                            gVar.w(sb, c0835kF, EnumC0794d.PROPERTY_GETTER);
                        }
                        C0836L c0836lE = interfaceC0750L.e();
                        if (c0836lE != null) {
                            gVar.w(sb, c0836lE, EnumC0794d.PROPERTY_SETTER);
                            List listV0 = c0836lE.v0();
                            AbstractC0219i.d("setter.valueParameters", listV0);
                            C0843T c0843t = (C0843T) P2.m.J0(listV0);
                            AbstractC0219i.d("it", c0843t);
                            gVar.w(sb, c0843t, EnumC0794d.SETTER_PARAMETER);
                        }
                    }
                }
                List listU0 = interfaceC0750L.u0();
                AbstractC0219i.d("property.contextReceiverParameters", listU0);
                gVar.A(sb, listU0);
                C0770n c0770nB = interfaceC0750L.b();
                AbstractC0219i.d("property.visibility", c0770nB);
                gVar.f0(c0770nB, sb);
                gVar.L(sb, gVar.o().contains(h.CONST) && interfaceC0750L.P(), "const");
                gVar.I(interfaceC0750L, sb);
                gVar.K(sb, interfaceC0750L);
                gVar.Q(sb, interfaceC0750L);
                gVar.L(sb, gVar.o().contains(h.LATEINIT) && interfaceC0750L.C0(), "lateinit");
                gVar.H(sb, interfaceC0750L);
            }
            gVar.c0(interfaceC0750L, sb, false);
            List listU = interfaceC0750L.u();
            AbstractC0219i.d("property.typeParameters", listU);
            gVar.b0(sb, listU, true);
            gVar.T(sb, interfaceC0750L);
        }
        gVar.N(interfaceC0750L, sb, true);
        sb.append(": ");
        AbstractC0438v abstractC0438vD = interfaceC0750L.d();
        AbstractC0219i.d("property.type", abstractC0438vD);
        sb.append(gVar.W(abstractC0438vD));
        gVar.U(sb, interfaceC0750L);
        gVar.F(interfaceC0750L, sb);
        List listU2 = interfaceC0750L.u();
        AbstractC0219i.d("property.typeParameters", listU2);
        gVar.g0(sb, listU2);
    }

    public static int t(InterfaceC0780x interfaceC0780x) {
        if (interfaceC0780x instanceof InterfaceC0761e) {
            return ((InterfaceC0761e) interfaceC0780x).L() == 2 ? 4 : 1;
        }
        InterfaceC0766j interfaceC0766jL = interfaceC0780x.l();
        InterfaceC0761e interfaceC0761e = interfaceC0766jL instanceof InterfaceC0761e ? (InterfaceC0761e) interfaceC0766jL : null;
        if (interfaceC0761e == null || !(interfaceC0780x instanceof InterfaceC0759c)) {
            return 1;
        }
        InterfaceC0759c interfaceC0759c = (InterfaceC0759c) interfaceC0780x;
        Collection collectionP = interfaceC0759c.p();
        AbstractC0219i.d("this.overriddenDescriptors", collectionP);
        if (!collectionP.isEmpty() && interfaceC0761e.i() != 1) {
            return 3;
        }
        if (interfaceC0761e.L() != 2 || AbstractC0219i.a(interfaceC0759c.b(), AbstractC0771o.f8419a)) {
            return 1;
        }
        return interfaceC0759c.i() == 4 ? 4 : 3;
    }

    public final void A(StringBuilder sb, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            int i6 = i5 + 1;
            C0867w c0867w = (C0867w) it.next();
            w(sb, c0867w, EnumC0794d.RECEIVER);
            AbstractC0438v abstractC0438vD = c0867w.d();
            AbstractC0219i.d("contextReceiver.type", abstractC0438vD);
            sb.append(E(abstractC0438vD));
            if (i5 == P2.n.g0(list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i5 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(java.lang.StringBuilder r6, e4.AbstractC0442z r7) {
        /*
            r5 = this;
            x(r5, r6, r7)
            boolean r0 = r7 instanceof e4.C0430m
            boolean r0 = e4.AbstractC0420c.i(r7)
            r1 = 0
            if (r0 == 0) goto L8c
            boolean r0 = r7 instanceof g4.g
            if (r0 == 0) goto L1b
            r2 = r7
            g4.g r2 = (g4.g) r2
            g4.i r2 = r2.f6800g
            boolean r2 = r2.f6836e
            if (r2 == 0) goto L1b
            r2 = 1
            goto L1c
        L1b:
            r2 = r1
        L1c:
            P3.k r3 = r5.f2196a
            if (r2 == 0) goto L56
            g3.p[] r2 = P3.k.f2216W
            r4 = 45
            r2 = r2[r4]
            P3.j r4 = r3.f2235T
            java.lang.Object r2 = r4.a(r2, r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L56
            g4.j r2 = g4.j.f6837a
            if (r0 == 0) goto L3f
            r0 = r7
            g4.g r0 = (g4.g) r0
            g4.i r0 = r0.f6800g
            boolean r0 = r0.f6836e
        L3f:
            e4.J r0 = r7.I0()
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor"
            b3.AbstractC0219i.c(r2, r0)
            g4.h r0 = (g4.h) r0
            java.lang.String[] r0 = r0.f6806b
            r0 = r0[r1]
            java.lang.String r5 = r5.C(r0)
            r6.append(r5)
            goto Lbc
        L56:
            if (r0 == 0) goto L75
            g3.p[] r0 = P3.k.f2216W
            r1 = 47
            r0 = r0[r1]
            P3.j r1 = r3.f2237V
            java.lang.Object r0 = r1.a(r0, r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L75
            r0 = r7
            g4.g r0 = (g4.g) r0
            java.lang.String r0 = r0.f6804k
            r6.append(r0)
            goto L80
        L75:
            e4.J r0 = r7.I0()
            java.lang.String r0 = r0.toString()
            r6.append(r0)
        L80:
            java.util.List r0 = r7.s0()
            java.lang.String r5 = r5.X(r0)
            r6.append(r5)
            goto Lbc
        L8c:
            e4.J r0 = r7.I0()
            e4.J r2 = r7.I0()
            p3.g r2 = r2.i()
            boolean r3 = r2 instanceof p3.InterfaceC0764h
            if (r3 == 0) goto L9f
            p3.h r2 = (p3.InterfaceC0764h) r2
            goto La0
        L9f:
            r2 = 0
        La0:
            D3.c r1 = p3.AbstractC0779w.a(r7, r2, r1)
            if (r1 != 0) goto Lb9
            java.lang.String r0 = r5.Y(r0)
            r6.append(r0)
            java.util.List r0 = r7.s0()
            java.lang.String r5 = r5.X(r0)
            r6.append(r5)
            goto Lbc
        Lb9:
            r5.S(r6, r1)
        Lbc:
            boolean r5 = r7.J0()
            if (r5 == 0) goto Lc7
            java.lang.String r5 = "?"
            r6.append(r5)
        Lc7:
            boolean r5 = r7 instanceof e4.C0430m
            if (r5 == 0) goto Ld0
            java.lang.String r5 = " & Any"
            r6.append(r5)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P3.g.B(java.lang.StringBuilder, e4.z):void");
    }

    public final String C(String str) {
        int iOrdinal = q().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return A3.f.o("<font color=red><b>", str, "</b></font>");
        }
        throw new O2.d();
    }

    public final String D(String str, String str2, AbstractC0695h abstractC0695h) {
        AbstractC0219i.e("lowerRendered", str);
        AbstractC0219i.e("upperRendered", str2);
        if (AbstractC0415a.W(str, str2)) {
            return p4.h.o0(str2, "(") ? A3.f.o("(", str, ")!") : str.concat("!");
        }
        String strR0 = p4.h.r0(n().a(abstractC0695h.i(m3.m.f8091B), this), "Collection");
        String strP = AbstractC0415a.P(str, strR0.concat("Mutable"), str2, strR0, strR0.concat("(Mutable)"));
        if (strP != null) {
            return strP;
        }
        String strP2 = AbstractC0415a.P(str, strR0.concat("MutableMap.MutableEntry"), str2, strR0.concat("Map.Entry"), strR0.concat("(Mutable)Map.(Mutable)Entry"));
        if (strP2 != null) {
            return strP2;
        }
        String strR02 = p4.h.r0(n().a(abstractC0695h.j("Array"), this), "Array");
        String strP3 = AbstractC0415a.P(str, strR02.concat(m("Array<")), str2, strR02.concat(m("Array<out ")), strR02.concat(m("Array<(out) ")));
        if (strP3 != null) {
            return strP3;
        }
        return "(" + str + ".." + str2 + ')';
    }

    public final String E(AbstractC0438v abstractC0438v) {
        String strW = W(abstractC0438v);
        if ((!h0(abstractC0438v) || X.e(abstractC0438v)) && !(abstractC0438v instanceof C0430m)) {
            return strW;
        }
        return "(" + strW + ')';
    }

    public final void F(U u4, StringBuilder sb) {
        S3.g gVarE0;
        k kVar = this.f2196a;
        if (!((Boolean) kVar.f2256u.a(k.f2216W[19], kVar)).booleanValue() || (gVarE0 = u4.e0()) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(m(z(gVarE0)));
    }

    public final String G(String str) {
        int iOrdinal = q().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal != 1) {
            throw new O2.d();
        }
        k kVar = this.f2196a;
        return ((Boolean) kVar.f2236U.a(k.f2216W[46], kVar)).booleanValue() ? str : A3.f.o("<b>", str, "</b>");
    }

    public final void H(StringBuilder sb, InterfaceC0759c interfaceC0759c) {
        String str;
        if (o().contains(h.MEMBER_KIND) && s() && interfaceC0759c.i0() != 1) {
            sb.append("/*");
            int iI0 = interfaceC0759c.i0();
            if (iI0 == 1) {
                str = "DECLARATION";
            } else if (iI0 == 2) {
                str = "FAKE_OVERRIDE";
            } else if (iI0 == 3) {
                str = "DELEGATION";
            } else {
                if (iI0 != 4) {
                    throw null;
                }
                str = "SYNTHESIZED";
            }
            sb.append(J2.b.b0(str));
            sb.append("*/ ");
        }
    }

    public final void I(InterfaceC0780x interfaceC0780x, StringBuilder sb) {
        L(sb, interfaceC0780x.E(), "external");
        boolean z4 = false;
        L(sb, o().contains(h.EXPECT) && interfaceC0780x.z(), "expect");
        if (o().contains(h.ACTUAL) && interfaceC0780x.h0()) {
            z4 = true;
        }
        L(sb, z4, "actual");
    }

    public final void J(int i5, StringBuilder sb, int i6) {
        String str;
        k kVar = this.f2196a;
        if (((Boolean) kVar.f2251p.a(k.f2216W[14], kVar)).booleanValue() || i5 != i6) {
            boolean zContains = o().contains(h.MODALITY);
            if (i5 == 1) {
                str = "FINAL";
            } else if (i5 == 2) {
                str = "SEALED";
            } else if (i5 == 3) {
                str = "OPEN";
            } else {
                if (i5 != 4) {
                    throw null;
                }
                str = "ABSTRACT";
            }
            L(sb, zContains, J2.b.b0(str));
        }
    }

    public final void K(StringBuilder sb, InterfaceC0759c interfaceC0759c) {
        if (Q3.f.t(interfaceC0759c) && interfaceC0759c.i() == 1) {
            return;
        }
        k kVar = this.f2196a;
        if (((n) kVar.f2217A.a(k.f2216W[25], kVar)) == n.f2264d && interfaceC0759c.i() == 3 && !interfaceC0759c.p().isEmpty()) {
            return;
        }
        int i5 = interfaceC0759c.i();
        A3.f.u(i5, "callable.modality");
        J(i5, sb, t(interfaceC0759c));
    }

    public final void L(StringBuilder sb, boolean z4, String str) {
        if (z4) {
            sb.append(G(str));
            sb.append(" ");
        }
    }

    public final String M(N3.f fVar, boolean z4) {
        String strM = m(AbstractC0415a.N(fVar));
        k kVar = this.f2196a;
        return (((Boolean) kVar.f2236U.a(k.f2216W[46], kVar)).booleanValue() && q() == s.f2272e && z4) ? A3.f.o("<b>", strM, "</b>") : strM;
    }

    public final void N(InterfaceC0766j interfaceC0766j, StringBuilder sb, boolean z4) {
        N3.f name = interfaceC0766j.getName();
        AbstractC0219i.d("descriptor.name", name);
        sb.append(M(name, z4));
    }

    public final void O(StringBuilder sb, AbstractC0438v abstractC0438v) {
        Z zL0 = abstractC0438v.L0();
        C0418a c0418a = zL0 instanceof C0418a ? (C0418a) zL0 : null;
        if (c0418a == null) {
            P(sb, abstractC0438v);
            return;
        }
        k kVar = this.f2196a;
        InterfaceC0466p[] interfaceC0466pArr = k.f2216W;
        boolean zBooleanValue = ((Boolean) kVar.f2232Q.a(interfaceC0466pArr[41], kVar)).booleanValue();
        AbstractC0442z abstractC0442z = c0418a.f6674e;
        if (zBooleanValue) {
            P(sb, abstractC0442z);
            return;
        }
        P(sb, c0418a.f);
        if (((Boolean) kVar.f2231P.a(interfaceC0466pArr[40], kVar)).booleanValue()) {
            s sVarQ = q();
            q qVar = s.f2272e;
            if (sVarQ == qVar) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* = ");
            P(sb, abstractC0442z);
            sb.append(" */");
            if (q() == qVar) {
                sb.append("</i></font>");
            }
        }
    }

    public final void P(StringBuilder sb, AbstractC0438v abstractC0438v) {
        N3.f fVarJ;
        String strM;
        boolean z4 = abstractC0438v instanceof C0440x;
        k kVar = this.f2196a;
        if (z4 && kVar.l()) {
            d4.i iVar = ((C0440x) abstractC0438v).f6706g;
            if (iVar.f == d4.k.f6414d || iVar.f == d4.k.f6415e) {
                sb.append("<Not computed yet>");
                return;
            }
        }
        Z zL0 = abstractC0438v.L0();
        if (zL0 instanceof AbstractC0434q) {
            sb.append(((AbstractC0434q) zL0).Q0(this, this));
            return;
        }
        if (zL0 instanceof AbstractC0442z) {
            AbstractC0442z abstractC0442z = (AbstractC0442z) zL0;
            if (abstractC0442z.equals(X.f6671b) || abstractC0442z.I0() == X.f6670a.f6799e) {
                sb.append("???");
                return;
            }
            J jI0 = abstractC0442z.I0();
            boolean z5 = false;
            if ((jI0 instanceof g4.h) && ((g4.h) jI0).f6805a == g4.i.f6822m) {
                if (!((Boolean) kVar.f2255t.a(k.f2216W[18], kVar)).booleanValue()) {
                    sb.append("???");
                    return;
                }
                J jI02 = abstractC0442z.I0();
                AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor", jI02);
                sb.append(C(((g4.h) jI02).f6806b[0]));
                return;
            }
            if (AbstractC0420c.i(abstractC0442z)) {
                B(sb, abstractC0442z);
                return;
            }
            if (!h0(abstractC0442z)) {
                B(sb, abstractC0442z);
                return;
            }
            int length = sb.length();
            ((g) this.f2197b.getValue()).w(sb, abstractC0442z, null);
            boolean z6 = sb.length() != length;
            AbstractC0438v abstractC0438vZ = AbstractC0415a.z(abstractC0442z);
            List listP = AbstractC0415a.p(abstractC0442z);
            if (!listP.isEmpty()) {
                sb.append("context(");
                Iterator it = listP.subList(0, P2.n.g0(listP)).iterator();
                while (it.hasNext()) {
                    O(sb, (AbstractC0438v) it.next());
                    sb.append(", ");
                }
                O(sb, (AbstractC0438v) P2.m.C0(listP));
                sb.append(") ");
            }
            boolean zH = AbstractC0415a.H(abstractC0442z);
            boolean zJ0 = abstractC0442z.J0();
            boolean z7 = zJ0 || (z6 && abstractC0438vZ != null);
            if (z7) {
                if (zH) {
                    sb.insert(length, '(');
                } else {
                    if (z6) {
                        if (sb.length() == 0) {
                            throw new NoSuchElementException("Char sequence is empty.");
                        }
                        char cCharAt = sb.charAt(p4.h.h0(sb));
                        if (!Character.isWhitespace(cCharAt)) {
                            Character.isSpaceChar(cCharAt);
                        }
                        if (sb.charAt(p4.h.h0(sb) - 1) != ')') {
                            sb.insert(p4.h.h0(sb), "()");
                        }
                    }
                    sb.append("(");
                }
            }
            L(sb, zH, "suspend");
            if (abstractC0438vZ != null) {
                boolean z8 = (h0(abstractC0438vZ) && !abstractC0438vZ.J0()) || AbstractC0415a.H(abstractC0438vZ) || !abstractC0438vZ.s().isEmpty() || (abstractC0438vZ instanceof C0430m);
                if (z8) {
                    sb.append("(");
                }
                O(sb, abstractC0438vZ);
                if (z8) {
                    sb.append(")");
                }
                sb.append(IDMMoInterface.IDM_MO_ROOT_PATH);
            }
            sb.append("(");
            if (!AbstractC0415a.E(abstractC0442z) || abstractC0442z.s().h(m3.m.f8131p) == null || abstractC0442z.s0().size() > 1) {
                int i5 = 0;
                for (N n : AbstractC0415a.C(abstractC0442z)) {
                    int i6 = i5 + 1;
                    if (i5 > 0) {
                        sb.append(", ");
                    }
                    if (((Boolean) kVar.f2234S.a(k.f2216W[43], kVar)).booleanValue()) {
                        AbstractC0438v abstractC0438vB = n.b();
                        AbstractC0219i.d("typeProjection.type", abstractC0438vB);
                        fVarJ = AbstractC0415a.j(abstractC0438vB);
                    } else {
                        fVarJ = null;
                    }
                    if (fVarJ != null) {
                        sb.append(M(fVarJ, z5));
                        sb.append(": ");
                    }
                    AbstractC0219i.e("typeProjection", n);
                    StringBuilder sb2 = new StringBuilder();
                    P2.m.z0(y.N(n), sb2, null, null, new f(this, 0), 60);
                    String string = sb2.toString();
                    AbstractC0219i.d("StringBuilder().apply(builderAction).toString()", string);
                    sb.append(string);
                    i5 = i6;
                    z5 = false;
                }
            } else {
                sb.append("???");
            }
            sb.append(") ");
            int iOrdinal = q().ordinal();
            if (iOrdinal == 0) {
                strM = m("->");
            } else {
                if (iOrdinal != 1) {
                    throw new O2.d();
                }
                strM = "&rarr;";
            }
            sb.append(strM);
            sb.append(" ");
            AbstractC0415a.E(abstractC0442z);
            AbstractC0438v abstractC0438vB2 = ((N) P2.m.C0(abstractC0442z.s0())).b();
            AbstractC0219i.d("arguments.last().type", abstractC0438vB2);
            O(sb, abstractC0438vB2);
            if (z7) {
                sb.append(")");
            }
            if (zJ0) {
                sb.append("?");
            }
        }
    }

    public final void Q(StringBuilder sb, InterfaceC0759c interfaceC0759c) {
        if (o().contains(h.OVERRIDE) && !interfaceC0759c.p().isEmpty()) {
            k kVar = this.f2196a;
            if (((n) kVar.f2217A.a(k.f2216W[25], kVar)) != n.f2265e) {
                L(sb, true, "override");
                if (s()) {
                    sb.append("/*");
                    sb.append(interfaceC0759c.p().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    public final void R(N3.c cVar, String str, StringBuilder sb) {
        sb.append(G(str));
        N3.e eVarI = cVar.i();
        AbstractC0219i.d("fqName.toUnsafe()", eVarI);
        String strM = m(AbstractC0415a.O(eVarI.e()));
        if (strM.length() > 0) {
            sb.append(" ");
            sb.append(strM);
        }
    }

    public final void S(StringBuilder sb, D3.c cVar) {
        D3.c cVar2 = (D3.c) cVar.f508g;
        InterfaceC0764h interfaceC0764h = (InterfaceC0764h) cVar.f507e;
        if (cVar2 != null) {
            S(sb, cVar2);
            sb.append('.');
            N3.f name = interfaceC0764h.getName();
            AbstractC0219i.d("possiblyInnerType.classifierDescriptor.name", name);
            sb.append(M(name, false));
        } else {
            J jI = interfaceC0764h.I();
            AbstractC0219i.d("possiblyInnerType.classi…escriptor.typeConstructor", jI);
            sb.append(Y(jI));
        }
        sb.append(X((List) cVar.f));
    }

    public final void T(StringBuilder sb, InterfaceC0759c interfaceC0759c) {
        C0867w c0867wB0 = interfaceC0759c.b0();
        if (c0867wB0 != null) {
            w(sb, c0867wB0, EnumC0794d.RECEIVER);
            AbstractC0438v abstractC0438vD = c0867wB0.d();
            AbstractC0219i.d("receiver.type", abstractC0438vD);
            sb.append(E(abstractC0438vD));
            sb.append(IDMMoInterface.IDM_MO_ROOT_PATH);
        }
    }

    public final void U(StringBuilder sb, InterfaceC0759c interfaceC0759c) {
        C0867w c0867wB0;
        k kVar = this.f2196a;
        if (((Boolean) kVar.E.a(k.f2216W[29], kVar)).booleanValue() && (c0867wB0 = interfaceC0759c.b0()) != null) {
            sb.append(" on ");
            AbstractC0438v abstractC0438vD = c0867wB0.d();
            AbstractC0219i.d("receiver.type", abstractC0438vD);
            sb.append(W(abstractC0438vD));
        }
    }

    public final String W(AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("type", abstractC0438v);
        StringBuilder sb = new StringBuilder();
        k kVar = this.f2196a;
        O(sb, (AbstractC0438v) ((InterfaceC0107b) kVar.f2259x.a(k.f2216W[22], kVar)).d(abstractC0438v));
        String string = sb.toString();
        AbstractC0219i.d("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }

    public final String X(List list) {
        AbstractC0219i.e("typeArguments", list);
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m("<"));
        P2.m.z0(list, sb, null, null, new f(this, 0), 60);
        sb.append(m(">"));
        String string = sb.toString();
        AbstractC0219i.d("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }

    public final String Y(J j5) {
        AbstractC0219i.e("typeConstructor", j5);
        InterfaceC0763g interfaceC0763gI = j5.i();
        if (interfaceC0763gI instanceof InterfaceC0755Q ? true : interfaceC0763gI instanceof InterfaceC0761e ? true : interfaceC0763gI instanceof c4.s) {
            AbstractC0219i.e("klass", interfaceC0763gI);
            return g4.j.f(interfaceC0763gI) ? interfaceC0763gI.I().toString() : n().a(interfaceC0763gI, this);
        }
        if (interfaceC0763gI == null) {
            return j5 instanceof C0437u ? ((C0437u) j5).c(d.f2186p) : j5.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + interfaceC0763gI.getClass()).toString());
    }

    public final void Z(InterfaceC0755Q interfaceC0755Q, StringBuilder sb, boolean z4) {
        String str;
        if (z4) {
            sb.append(m("<"));
        }
        if (s()) {
            sb.append("/*");
            sb.append(interfaceC0755Q.x0());
            sb.append("*/ ");
        }
        L(sb, interfaceC0755Q.l0(), "reified");
        int iB = interfaceC0755Q.B();
        if (iB == 1) {
            str = "";
        } else if (iB == 2) {
            str = "in";
        } else {
            if (iB != 3) {
                throw null;
            }
            str = "out";
        }
        boolean z5 = true;
        L(sb, str.length() > 0, str);
        w(sb, interfaceC0755Q, null);
        N(interfaceC0755Q, sb, z4);
        int size = interfaceC0755Q.getUpperBounds().size();
        if ((size > 1 && !z4) || size == 1) {
            AbstractC0438v abstractC0438v = (AbstractC0438v) interfaceC0755Q.getUpperBounds().iterator().next();
            if (abstractC0438v == null) {
                AbstractC0695h.a(141);
                throw null;
            }
            if (!AbstractC0695h.w(abstractC0438v) || !abstractC0438v.J0()) {
                sb.append(" : ");
                sb.append(W(abstractC0438v));
            }
        } else if (z4) {
            for (AbstractC0438v abstractC0438v2 : interfaceC0755Q.getUpperBounds()) {
                if (abstractC0438v2 == null) {
                    AbstractC0695h.a(141);
                    throw null;
                }
                if (!AbstractC0695h.w(abstractC0438v2) || !abstractC0438v2.J0()) {
                    if (z5) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(W(abstractC0438v2));
                    z5 = false;
                }
            }
        }
        if (z4) {
            sb.append(m(">"));
        }
    }

    @Override // P3.i
    public final void a() {
        this.f2196a.a();
    }

    public final void a0(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Z((InterfaceC0755Q) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    @Override // P3.i
    public final void b(c cVar) {
        this.f2196a.b(cVar);
    }

    public final void b0(StringBuilder sb, List list, boolean z4) {
        k kVar = this.f2196a;
        if (((Boolean) kVar.f2257v.a(k.f2216W[20], kVar)).booleanValue() || list.isEmpty()) {
            return;
        }
        sb.append(m("<"));
        a0(sb, list);
        sb.append(m(">"));
        if (z4) {
            sb.append(" ");
        }
    }

    @Override // P3.i
    public final void c() {
        this.f2196a.c();
    }

    public final void c0(U u4, StringBuilder sb, boolean z4) {
        if (z4 || !(u4 instanceof C0843T)) {
            sb.append(G(u4.T() ? "var" : "val"));
            sb.append(" ");
        }
    }

    @Override // P3.i
    public final void d() {
        this.f2196a.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d0(s3.C0843T r11, boolean r12, java.lang.StringBuilder r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: P3.g.d0(s3.T, boolean, java.lang.StringBuilder, boolean):void");
    }

    @Override // P3.i
    public final void e() {
        this.f2196a.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e0(java.lang.StringBuilder r8, java.util.List r9, boolean r10) {
        /*
            r7 = this;
            P3.k r0 = r7.f2196a
            g3.p[] r1 = P3.k.f2216W
            r2 = 28
            r1 = r1[r2]
            P3.j r2 = r0.f2220D
            java.lang.Object r0 = r2.a(r1, r0)
            P3.o r0 = (P3.o) r0
            int r0 = r0.ordinal()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L27
            if (r0 == r1) goto L25
            r10 = 2
            if (r0 != r10) goto L1f
        L1d:
            r10 = r2
            goto L28
        L1f:
            O2.d r7 = new O2.d
            r7.<init>()
            throw r7
        L25:
            if (r10 != 0) goto L1d
        L27:
            r10 = r1
        L28:
            int r0 = r9.size()
            P3.e r3 = r7.r()
            r3.getClass()
            java.lang.String r3 = "builder"
            b3.AbstractC0219i.e(r3, r8)
            java.lang.String r3 = "("
            r8.append(r3)
            java.util.Iterator r9 = r9.iterator()
            r3 = r2
        L42:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L71
            int r4 = r3 + 1
            java.lang.Object r5 = r9.next()
            s3.T r5 = (s3.C0843T) r5
            P3.e r6 = r7.r()
            r6.getClass()
            java.lang.String r6 = "parameter"
            b3.AbstractC0219i.e(r6, r5)
            r7.d0(r5, r10, r8, r2)
            P3.e r5 = r7.r()
            r5.getClass()
            int r5 = r0 + (-1)
            if (r3 == r5) goto L6f
            java.lang.String r3 = ", "
            r8.append(r3)
        L6f:
            r3 = r4
            goto L42
        L71:
            P3.e r7 = r7.r()
            r7.getClass()
            java.lang.String r7 = ")"
            r8.append(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P3.g.e0(java.lang.StringBuilder, java.util.List, boolean):void");
    }

    @Override // P3.i
    public final void f() {
        this.f2196a.f();
    }

    public final boolean f0(C0770n c0770n, StringBuilder sb) {
        if (!o().contains(h.VISIBILITY)) {
            return false;
        }
        k kVar = this.f2196a;
        InterfaceC0466p[] interfaceC0466pArr = k.f2216W;
        if (((Boolean) kVar.n.a(interfaceC0466pArr[12], kVar)).booleanValue()) {
            c0770n = AbstractC0771o.f(c0770n.f8417a.c());
        }
        if (!((Boolean) kVar.f2250o.a(interfaceC0466pArr[13], kVar)).booleanValue() && AbstractC0219i.a(c0770n, AbstractC0771o.f8427j)) {
            return false;
        }
        sb.append(G(c0770n.f8417a.b()));
        sb.append(" ");
        return true;
    }

    @Override // P3.i
    public final void g(o oVar) {
        this.f2196a.g(oVar);
    }

    public final void g0(StringBuilder sb, List list) {
        k kVar = this.f2196a;
        if (((Boolean) kVar.f2257v.a(k.f2216W[20], kVar)).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0755Q interfaceC0755Q = (InterfaceC0755Q) it.next();
            List upperBounds = interfaceC0755Q.getUpperBounds();
            AbstractC0219i.d("typeParameter.upperBounds", upperBounds);
            for (AbstractC0438v abstractC0438v : P2.m.r0(upperBounds)) {
                StringBuilder sb2 = new StringBuilder();
                N3.f name = interfaceC0755Q.getName();
                AbstractC0219i.d("typeParameter.name", name);
                sb2.append(M(name, false));
                sb2.append(" : ");
                AbstractC0219i.d("it", abstractC0438v);
                sb2.append(W(abstractC0438v));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(G("where"));
        sb.append(" ");
        P2.m.z0(arrayList, sb, null, null, null, 124);
    }

    @Override // P3.i
    public final void h() {
        this.f2196a.h();
    }

    @Override // P3.i
    public final void i() {
        this.f2196a.i();
    }

    @Override // P3.i
    public final void j() {
        this.f2196a.j();
    }

    @Override // P3.i
    public final void k(Set set) {
        AbstractC0219i.e("<set-?>", set);
        this.f2196a.k(set);
    }

    public final String m(String str) {
        return q().a(str);
    }

    public final c n() {
        k kVar = this.f2196a;
        return (c) kVar.f2239b.a(k.f2216W[0], kVar);
    }

    public final Set o() {
        k kVar = this.f2196a;
        return (Set) kVar.f2242e.a(k.f2216W[3], kVar);
    }

    public final boolean p() {
        k kVar = this.f2196a;
        return ((Boolean) kVar.f.a(k.f2216W[4], kVar)).booleanValue();
    }

    public final s q() {
        k kVar = this.f2196a;
        return (s) kVar.f2219C.a(k.f2216W[27], kVar);
    }

    public final e r() {
        k kVar = this.f2196a;
        return (e) kVar.f2218B.a(k.f2216W[26], kVar);
    }

    public final boolean s() {
        k kVar = this.f2196a;
        return ((Boolean) kVar.f2246j.a(k.f2216W[8], kVar)).booleanValue();
    }

    public final String u(InterfaceC0766j interfaceC0766j) {
        InterfaceC0766j interfaceC0766jL;
        String str;
        AbstractC0219i.e("declarationDescriptor", interfaceC0766j);
        StringBuilder sb = new StringBuilder();
        interfaceC0766j.U(new B.g(17, this), sb);
        k kVar = this.f2196a;
        j jVar = kVar.f2240c;
        InterfaceC0466p[] interfaceC0466pArr = k.f2216W;
        if (((Boolean) jVar.a(interfaceC0466pArr[1], kVar)).booleanValue() && !(interfaceC0766j instanceof InterfaceC0742D) && !(interfaceC0766j instanceof InterfaceC0747I) && (interfaceC0766jL = interfaceC0766j.l()) != null && !(interfaceC0766jL instanceof InterfaceC0781y)) {
            sb.append(" ");
            int iOrdinal = q().ordinal();
            if (iOrdinal == 0) {
                str = "defined in";
            } else {
                if (iOrdinal != 1) {
                    throw new O2.d();
                }
                str = "<i>defined in</i>";
            }
            sb.append(str);
            sb.append(" ");
            N3.e eVarG = Q3.f.g(interfaceC0766jL);
            AbstractC0219i.d("getFqName(containingDeclaration)", eVarG);
            sb.append(eVarG.f1838a.isEmpty() ? "root package" : m(AbstractC0415a.O(eVarG.e())));
            if (((Boolean) kVar.f2241d.a(interfaceC0466pArr[2], kVar)).booleanValue() && (interfaceC0766jL instanceof InterfaceC0742D) && (interfaceC0766j instanceof InterfaceC0767k)) {
                ((InterfaceC0767k) interfaceC0766j).n().getClass();
            }
        }
        String string = sb.toString();
        AbstractC0219i.d("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [P2.u] */
    public final String v(InterfaceC0792b interfaceC0792b, EnumC0794d enumC0794d) {
        List listI0;
        C0855k c0855kV;
        List listV0;
        AbstractC0219i.e("annotation", interfaceC0792b);
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (enumC0794d != null) {
            sb.append(enumC0794d.f8475d + ':');
        }
        AbstractC0438v abstractC0438vD = interfaceC0792b.d();
        sb.append(W(abstractC0438vD));
        k kVar = this.f2196a;
        InterfaceC0466p[] interfaceC0466pArr = k.f2216W;
        InterfaceC0466p interfaceC0466p = interfaceC0466pArr[37];
        j jVar = kVar.f2228M;
        if (((a) jVar.a(interfaceC0466p, kVar)).f2171d) {
            Map mapB = interfaceC0792b.b();
            ?? arrayList = 0;
            arrayList = 0;
            arrayList = 0;
            InterfaceC0761e interfaceC0761eD = ((Boolean) kVar.f2223H.a(interfaceC0466pArr[32], kVar)).booleanValue() ? U3.f.d(interfaceC0792b) : null;
            if (interfaceC0761eD != null && (c0855kV = interfaceC0761eD.V()) != null && (listV0 = c0855kV.v0()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listV0) {
                    if (((C0843T) obj).P0()) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = new ArrayList(P2.o.l0(arrayList2));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C0843T) it.next()).getName());
                }
            }
            if (arrayList == 0) {
                arrayList = u.f2163d;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                N3.f fVar = (N3.f) obj2;
                AbstractC0219i.d("it", fVar);
                if (!mapB.containsKey(fVar)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(P2.o.l0(arrayList3));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((N3.f) it2.next()).b() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapB.entrySet();
            ArrayList arrayList5 = new ArrayList(P2.o.l0(setEntrySet));
            for (Map.Entry entry : setEntrySet) {
                N3.f fVar2 = (N3.f) entry.getKey();
                S3.g gVar = (S3.g) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(fVar2.b());
                sb2.append(" = ");
                sb2.append(!arrayList.contains(fVar2) ? z(gVar) : "...");
                arrayList5.add(sb2.toString());
            }
            ArrayList arrayListG0 = P2.m.G0(arrayList4, arrayList5);
            if (arrayListG0.size() <= 1) {
                listI0 = P2.m.O0(arrayListG0);
            } else {
                Object[] array = arrayListG0.toArray(new Comparable[0]);
                Comparable[] comparableArr = (Comparable[]) array;
                AbstractC0219i.e("<this>", comparableArr);
                if (comparableArr.length > 1) {
                    Arrays.sort(comparableArr);
                }
                listI0 = P2.i.i0(array);
            }
            if (((a) jVar.a(k.f2216W[37], kVar)).f2172e || !listI0.isEmpty()) {
                P2.m.z0(listI0, sb, "(", ")", null, 112);
            }
        }
        if (s() && (AbstractC0420c.i(abstractC0438vD) || (abstractC0438vD.I0().i() instanceof C0740B))) {
            sb.append(" /* annotation class not found */");
        }
        String string = sb.toString();
        AbstractC0219i.d("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }

    public final void w(StringBuilder sb, InterfaceC0791a interfaceC0791a, EnumC0794d enumC0794d) {
        if (o().contains(h.ANNOTATIONS)) {
            boolean z4 = interfaceC0791a instanceof AbstractC0438v;
            k kVar = this.f2196a;
            Set setM = z4 ? kVar.m() : (Set) kVar.f2225J.a(k.f2216W[34], kVar);
            InterfaceC0107b interfaceC0107b = (InterfaceC0107b) kVar.f2227L.a(k.f2216W[36], kVar);
            for (InterfaceC0792b interfaceC0792b : interfaceC0791a.s()) {
                if (!P2.m.q0(setM, interfaceC0792b.a()) && !AbstractC0219i.a(interfaceC0792b.a(), m3.m.f8133r) && (interfaceC0107b == null || ((Boolean) interfaceC0107b.d(interfaceC0792b)).booleanValue())) {
                    sb.append(v(interfaceC0792b, enumC0794d));
                    if (((Boolean) kVar.f2224I.a(k.f2216W[33], kVar)).booleanValue()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    public final void y(InterfaceC0764h interfaceC0764h, StringBuilder sb) {
        List listR = interfaceC0764h.r();
        AbstractC0219i.d("classifier.declaredTypeParameters", listR);
        List listK = interfaceC0764h.I().k();
        AbstractC0219i.d("classifier.typeConstructor.parameters", listK);
        if (s() && interfaceC0764h.A() && listK.size() > listR.size()) {
            sb.append(" /*captured type parameters: ");
            a0(sb, listK.subList(listR.size(), listK.size()));
            sb.append("*/");
        }
    }

    public final String z(S3.g gVar) {
        if (gVar instanceof S3.b) {
            return P2.m.A0((Iterable) ((S3.b) gVar).f2531a, ", ", "{", "}", new f(this, 1), 24);
        }
        if (gVar instanceof S3.a) {
            return p4.h.l0(v((InterfaceC0792b) ((S3.a) gVar).f2531a, null), "@");
        }
        if (!(gVar instanceof S3.r)) {
            return gVar.toString();
        }
        S3.q qVar = (S3.q) ((S3.r) gVar).f2531a;
        if (qVar instanceof S3.o) {
            return ((S3.o) qVar).f2539a + "::class";
        }
        if (!(qVar instanceof S3.p)) {
            throw new O2.d();
        }
        S3.p pVar = (S3.p) qVar;
        String strB = pVar.f2540a.f2529a.b().b();
        S3.f fVar = pVar.f2540a;
        for (int i5 = 0; i5 < fVar.f2530b; i5++) {
            strB = "kotlin.Array<" + strB + IDMTndsXmlWbxmlDefine.XML_CLOSE_TAG;
        }
        return g4.f.c(strB, "::class");
    }
}
