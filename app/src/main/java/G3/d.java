package G3;

import I3.C0025g;
import I3.C0030l;
import I3.C0037t;
import I3.C0042y;
import I3.EnumC0027i;
import I3.G;
import I3.Q;
import I3.W;
import O3.AbstractC0081m;
import O3.C0077i;
import O3.C0083o;
import P2.u;
import S3.s;
import S3.x;
import a3.InterfaceC0108c;
import a4.InterfaceC0110a;
import a4.InterfaceC0112c;
import a4.t;
import a4.v;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import b3.AbstractC0219i;
import com.google.android.gms.internal.p000firebaseauthapi.AbstractC0289k0;
import com.google.android.gms.internal.p000firebaseauthapi.AbstractC0335s;
import com.google.android.gms.internal.p000firebaseauthapi.C0231a2;
import com.google.android.gms.internal.p000firebaseauthapi.C0258f;
import com.google.android.gms.internal.p000firebaseauthapi.C0306n;
import com.google.android.gms.internal.p000firebaseauthapi.C0307n0;
import com.google.android.gms.internal.p000firebaseauthapi.E2;
import com.google.android.gms.internal.p000firebaseauthapi.G0;
import com.google.android.gms.internal.p000firebaseauthapi.V;
import com.google.android.gms.internal.p000firebaseauthapi.V1;
import com.google.android.gms.internal.p000firebaseauthapi.X1;
import com.google.android.gms.internal.p000firebaseauthapi.Y;
import com.google.android.gms.internal.p000firebaseauthapi.Y3;
import com.google.android.gms.internal.p000firebaseauthapi.g5;
import com.google.android.gms.internal.p000firebaseauthapi.l5;
import com.google.firebase.messaging.ExecutorC0386c;
import com.idm.core.tnds.IDMTndsXmlWbxmlDefine;
import com.idm.providers.mo.IDMMoDatabaseConstants;
import e1.AbstractC0415a;
import e4.AbstractC0438v;
import g3.y;
import i1.C0480a;
import j2.InterfaceC0558a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import javax.crypto.KeyGenerator;
import k.Q0;
import k2.C0668a;
import l3.AbstractC0683a;
import p3.AbstractC0779w;
import p3.InterfaceC0752N;
import q1.C0784a;
import r0.AbstractC0809c;
import s3.C0826B;
import u3.C0879a;
import u3.C0880b;
import u3.C0881c;
import v3.AbstractC0897d;
import y3.w;

/* loaded from: classes.dex */
public final class d implements InterfaceC0110a, InterfaceC0112c, M0.b, Y3 {

    /* renamed from: d, reason: collision with root package name */
    public Object f746d;

    /* renamed from: e, reason: collision with root package name */
    public Object f747e;
    public Object f;

    /* renamed from: g, reason: collision with root package name */
    public Object f748g;

    /* renamed from: h, reason: collision with root package name */
    public Object f749h;

    /* renamed from: i, reason: collision with root package name */
    public Object f750i;

    public d(int i5) {
        this.f746d = i5 != 1 ? i5 != 4 ? i5 != 6 ? i5 != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_AND_CHANGE_EMAIL" : "EMAIL_SIGNIN" : "VERIFY_EMAIL" : "PASSWORD_RESET";
    }

    public static final S3.g b(d dVar, N3.f fVar, Object obj) {
        S3.g gVarB = S3.h.f2532a.b(obj, (C0826B) dVar.f);
        if (gVarB != null) {
            return gVarB;
        }
        String str = "Unsupported annotation argument: " + fVar;
        AbstractC0219i.e("message", str);
        return new S3.j(str);
    }

    public static /* synthetic */ List i(d dVar, v vVar, p pVar, boolean z4, Boolean bool, boolean z5, int i5) {
        boolean z6 = (i5 & 4) != 0 ? false : z4;
        if ((i5 & 16) != 0) {
            bool = null;
        }
        return dVar.h(vVar, pVar, z6, false, bool, (i5 & 32) != 0 ? false : z5);
    }

    public static p l(AbstractC0081m abstractC0081m, K3.f fVar, K3.g gVar, int i5, boolean z4) {
        AbstractC0219i.e("proto", abstractC0081m);
        AbstractC0219i.e("nameResolver", fVar);
        AbstractC0219i.e("typeTable", gVar);
        A3.f.q(i5, "kind");
        if (abstractC0081m instanceof C0030l) {
            C0077i c0077i = M3.h.f1826a;
            M3.e eVarA = M3.h.a((C0030l) abstractC0081m, fVar, gVar);
            if (eVarA == null) {
                return null;
            }
            return y.r(eVarA);
        }
        if (abstractC0081m instanceof C0042y) {
            C0077i c0077i2 = M3.h.f1826a;
            M3.e eVarC = M3.h.c((C0042y) abstractC0081m, fVar, gVar);
            if (eVarC == null) {
                return null;
            }
            return y.r(eVarC);
        }
        if (!(abstractC0081m instanceof G)) {
            return null;
        }
        C0083o c0083o = L3.k.f1799d;
        AbstractC0219i.d("propertySignature", c0083o);
        L3.e eVar = (L3.e) AbstractC0415a.s(abstractC0081m, c0083o);
        if (eVar == null) {
            return null;
        }
        int iC = Q0.c(i5);
        if (iC == 1) {
            return V1.a.L((G) abstractC0081m, fVar, gVar, true, true, z4);
        }
        if (iC == 2) {
            if ((eVar.f1758e & 4) != 4) {
                return null;
            }
            L3.c cVar = eVar.f1760h;
            AbstractC0219i.d("signature.getter", cVar);
            return new p(fVar.s(cVar.f).concat(fVar.s(cVar.f1748g)));
        }
        if (iC != 3 || (eVar.f1758e & 8) != 8) {
            return null;
        }
        L3.c cVar2 = eVar.f1761i;
        AbstractC0219i.d("signature.setter", cVar2);
        return new p(fVar.s(cVar2.f).concat(fVar.s(cVar2.f1748g)));
    }

    public static C0881c u(t tVar) {
        InterfaceC0752N interfaceC0752N = (InterfaceC0752N) tVar.f3095d;
        o oVar = interfaceC0752N instanceof o ? (o) interfaceC0752N : null;
        if (oVar != null) {
            return oVar.f772d;
        }
        return null;
    }

    public Y A() throws GeneralSecurityException {
        C0307n0 c0307n0 = (C0307n0) this.f;
        if (c0307n0 != null) {
            try {
                C0231a2 c0231a2 = (C0231a2) C0306n.u((C0306n) this.f750i, c0307n0).f5568e;
                l5 l5Var = (l5) c0231a2.h(5);
                l5Var.a(c0231a2);
                return new Y((X1) l5Var);
            } catch (C0258f | GeneralSecurityException e5) {
                Log.w("n", "cannot decrypt keyset: ", e5);
            }
        }
        C0231a2 c0231a2Q = C0231a2.q(((C0306n) this.f750i).m(), g5.a());
        if (c0231a2Q.m() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        l5 l5Var2 = (l5) c0231a2Q.h(5);
        l5Var2.a(c0231a2Q);
        return new Y((X1) l5Var2);
    }

    @Override // a4.InterfaceC0110a
    public Object K(v vVar, G g5, AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("proto", g5);
        return q(vVar, g5, 2, abstractC0438v, b.f);
    }

    @Override // a4.InterfaceC0112c
    public List L(v vVar, AbstractC0081m abstractC0081m, int i5) {
        AbstractC0219i.e("proto", abstractC0081m);
        A3.f.q(i5, "kind");
        p pVarL = l(abstractC0081m, (K3.f) vVar.f3093b, (K3.g) vVar.f3094c, i5, false);
        return pVarL != null ? i(this, vVar, new p(A3.f.p(new StringBuilder(), pVarL.f773a, "@0")), false, null, false, 60) : u.f2163d;
    }

    @Override // a4.InterfaceC0112c
    public List R(v vVar, G g5) {
        AbstractC0219i.e("proto", g5);
        return r(vVar, g5, 3);
    }

    @Override // a4.InterfaceC0112c
    public List S(v vVar, G g5) {
        AbstractC0219i.e("proto", g5);
        return r(vVar, g5, 2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.Y3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a() throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.d.a():java.lang.String");
    }

    public void c(String str, String str2) {
        HashMap map = (HashMap) this.f750i;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    @Override // a4.InterfaceC0112c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List d(a4.v r9, O3.AbstractC0081m r10, int r11, int r12, I3.Z r13) {
        /*
            r8 = this;
            java.lang.String r13 = "callableProto"
            b3.AbstractC0219i.e(r13, r10)
            java.lang.String r13 = "kind"
            A3.f.q(r11, r13)
            java.lang.Object r13 = r9.f3093b
            K3.f r13 = (K3.f) r13
            java.lang.Object r0 = r9.f3094c
            K3.g r0 = (K3.g) r0
            r1 = 0
            G3.p r11 = l(r10, r13, r0, r11, r1)
            if (r11 == 0) goto L93
            boolean r13 = r10 instanceof I3.C0042y
            r0 = 64
            r2 = 1
            if (r13 == 0) goto L2f
            I3.y r10 = (I3.C0042y) r10
            boolean r13 = r10.p()
            if (r13 != 0) goto L2d
            int r10 = r10.f
            r10 = r10 & r0
            if (r10 != r0) goto L55
        L2d:
            r1 = r2
            goto L55
        L2f:
            boolean r13 = r10 instanceof I3.G
            if (r13 == 0) goto L41
            I3.G r10 = (I3.G) r10
            boolean r13 = r10.p()
            if (r13 != 0) goto L2d
            int r10 = r10.f
            r10 = r10 & r0
            if (r10 != r0) goto L55
            goto L2d
        L41:
            boolean r13 = r10 instanceof I3.C0030l
            if (r13 == 0) goto L7b
            r10 = r9
            a4.t r10 = (a4.t) r10
            I3.i r13 = I3.EnumC0027i.ENUM_CLASS
            I3.i r3 = r10.f3089h
            if (r3 != r13) goto L50
            r1 = 2
            goto L55
        L50:
            boolean r10 = r10.f3090i
            if (r10 == 0) goto L55
            goto L2d
        L55:
            int r12 = r12 + r1
            G3.p r3 = new G3.p
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r11.f773a
            r10.append(r11)
            r10.append(r0)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            r3.<init>(r10)
            r5 = 0
            r6 = 0
            r4 = 0
            r7 = 60
            r1 = r8
            r2 = r9
            java.util.List r8 = i(r1, r2, r3, r4, r5, r6, r7)
            return r8
        L7b:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "Unsupported message: "
            r9.<init>(r11)
            java.lang.Class r10 = r10.getClass()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L93:
            P2.u r8 = P2.u.f2163d
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.d.d(a4.v, O3.m, int, int, I3.Z):java.util.List");
    }

    public K0.a e() {
        String strC = ((String) this.f746d) == null ? " transportName" : "";
        if (((K0.e) this.f) == null) {
            strC = strC.concat(" encodedPayload");
        }
        if (((Long) this.f748g) == null) {
            strC = g4.f.c(strC, " eventMillis");
        }
        if (((Long) this.f749h) == null) {
            strC = g4.f.c(strC, " uptimeMillis");
        }
        if (((HashMap) this.f750i) == null) {
            strC = g4.f.c(strC, " autoMetadata");
        }
        if (strC.isEmpty()) {
            return new K0.a((String) this.f746d, (Integer) this.f747e, (K0.e) this.f, ((Long) this.f748g).longValue(), ((Long) this.f749h).longValue(), (HashMap) this.f750i);
        }
        throw new IllegalStateException("Missing required properties:".concat(strC));
    }

    public t1.n f(t1.n nVar) {
        Executor executor = ExecutorC0386c.f6138h;
        com.google.firebase.messaging.h hVar = new com.google.firebase.messaging.h(3);
        hVar.f6150e = this;
        return nVar.g(executor, hVar);
    }

    @Override // a4.InterfaceC0112c
    public ArrayList g(t tVar) {
        AbstractC0219i.e("container", tVar);
        C0881c c0881cU = u(tVar);
        if (c0881cU == null) {
            throw new IllegalStateException(("Class for loading annotations is not found: " + tVar.f3088g.b()).toString());
        }
        ArrayList arrayList = new ArrayList(1);
        Class cls = c0881cU.f9187a;
        AbstractC0219i.e("klass", cls);
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        AbstractC0219i.d("klass.declaredAnnotations", declaredAnnotations);
        for (Annotation annotation : declaredAnnotations) {
            AbstractC0219i.d("annotation", annotation);
            Class clsZ = y.z(y.s(annotation));
            c cVarP = p(AbstractC0897d.a(clsZ), new C0879a(annotation), arrayList);
            if (cVarP != null) {
                r2.d.h(cVarP, annotation, clsZ);
            }
        }
        return arrayList;
    }

    @Override // N2.a
    public Object get() {
        return new P0.j((Context) ((M0.c) this.f746d).f1811d, (L0.f) ((N2.a) this.f747e).get(), (Q0.c) ((N2.a) this.f).get(), (P0.d) ((D3.c) this.f748g).get(), (Executor) ((N2.a) this.f749h).get(), (R0.c) ((N2.a) this.f750i).get(), new b4.d());
    }

    public List h(v vVar, p pVar, boolean z4, boolean z5, Boolean bool, boolean z6) {
        List list;
        C0881c c0881cM = m(vVar, z4, z5, bool, z6);
        if (c0881cM == null) {
            c0881cM = vVar instanceof t ? u((t) vVar) : null;
        }
        u uVar = u.f2163d;
        return (c0881cM == null || (list = (List) ((a) ((d4.e) this.f747e).d(c0881cM)).f734a.get(pVar)) == null) ? uVar : list;
    }

    @Override // a4.InterfaceC0112c
    public List j(v vVar, C0037t c0037t) {
        AbstractC0219i.e("container", vVar);
        String strS = ((K3.f) vVar.f3093b).s(c0037t.f1352g);
        String strB = M3.b.b(((t) vVar).f3088g.c());
        AbstractC0219i.e("desc", strB);
        return i(this, vVar, new p(strS + '#' + strB), false, null, false, 60);
    }

    @Override // a4.InterfaceC0112c
    public List k(v vVar, AbstractC0081m abstractC0081m, int i5) {
        AbstractC0219i.e("proto", abstractC0081m);
        A3.f.q(i5, "kind");
        if (i5 == 2) {
            return r(vVar, (G) abstractC0081m, 1);
        }
        p pVarL = l(abstractC0081m, (K3.f) vVar.f3093b, (K3.g) vVar.f3094c, i5, false);
        return pVarL == null ? u.f2163d : i(this, vVar, pVarL, false, null, false, 60);
    }

    public C0881c m(v vVar, boolean z4, boolean z5, Boolean bool, boolean z6) {
        t tVar;
        AbstractC0219i.e("container", vVar);
        EnumC0027i enumC0027i = EnumC0027i.INTERFACE;
        C0880b c0880b = (C0880b) this.f746d;
        InterfaceC0752N interfaceC0752N = (InterfaceC0752N) vVar.f3095d;
        if (z4) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + vVar + ')').toString());
            }
            if (vVar instanceof t) {
                t tVar2 = (t) vVar;
                if (tVar2.f3089h == enumC0027i) {
                    return AbstractC0415a.k(c0880b, tVar2.f3088g.d(N3.f.e("DefaultImpls")), (M3.f) this.f750i);
                }
            }
            if (bool.booleanValue() && (vVar instanceof a4.u)) {
                h hVar = interfaceC0752N instanceof h ? (h) interfaceC0752N : null;
                V3.b bVar = hVar != null ? hVar.f761e : null;
                if (bVar != null) {
                    String strE = bVar.e();
                    AbstractC0219i.d("facadeClassName.internalName", strE);
                    return AbstractC0415a.k(c0880b, N3.b.j(new N3.c(p4.h.m0(strE, IDMTndsXmlWbxmlDefine.XML_SLASH, '.'))), (M3.f) this.f750i);
                }
            }
        }
        if (z5 && (vVar instanceof t)) {
            t tVar3 = (t) vVar;
            if (tVar3.f3089h == EnumC0027i.COMPANION_OBJECT && (tVar = tVar3.f) != null) {
                EnumC0027i enumC0027i2 = EnumC0027i.CLASS;
                EnumC0027i enumC0027i3 = tVar.f3089h;
                if (enumC0027i3 == enumC0027i2 || enumC0027i3 == EnumC0027i.ENUM_CLASS || (z6 && (enumC0027i3 == enumC0027i || enumC0027i3 == EnumC0027i.ANNOTATION_CLASS))) {
                    return u(tVar);
                }
            }
        }
        if (!(vVar instanceof a4.u) || !(interfaceC0752N instanceof h)) {
            return null;
        }
        AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource", interfaceC0752N);
        h hVar2 = (h) interfaceC0752N;
        C0881c c0881c = hVar2.f;
        return c0881c == null ? AbstractC0415a.k(c0880b, hVar2.a(), (M3.f) this.f750i) : c0881c;
    }

    public boolean n(N3.b bVar) {
        if (bVar.f() == null || !AbstractC0219i.a(bVar.i().b(), "Container")) {
            return false;
        }
        C0881c c0881cK = AbstractC0415a.k((C0880b) this.f746d, bVar, (M3.f) this.f750i);
        if (c0881cK != null) {
            LinkedHashSet linkedHashSet = AbstractC0683a.f8023a;
            Class cls = c0881cK.f9187a;
            AbstractC0219i.e("klass", cls);
            Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
            AbstractC0219i.d("klass.declaredAnnotations", declaredAnnotations);
            boolean z4 = false;
            for (Annotation annotation : declaredAnnotations) {
                AbstractC0219i.d("annotation", annotation);
                if (AbstractC0897d.a(y.z(y.s(annotation))).equals(w.f9440b)) {
                    z4 = true;
                }
            }
            if (z4) {
                return true;
            }
        }
        return false;
    }

    public c o(N3.b bVar, InterfaceC0752N interfaceC0752N, List list) {
        AbstractC0219i.e("result", list);
        return new c(this, AbstractC0779w.f((C0826B) this.f, bVar, (com.google.firebase.messaging.q) this.f748g), bVar, list, interfaceC0752N);
    }

    public c p(N3.b bVar, C0879a c0879a, List list) {
        AbstractC0219i.e("result", list);
        if (AbstractC0683a.f8023a.contains(bVar)) {
            return null;
        }
        return o(bVar, c0879a, list);
    }

    public Object q(v vVar, G g5, int i5, AbstractC0438v abstractC0438v, InterfaceC0108c interfaceC0108c) {
        Object objC;
        x xVar;
        C0881c c0881cM = m(vVar, true, true, K3.e.f1660A.c(g5.f1001g), M3.h.d(g5));
        if (c0881cM == null) {
            c0881cM = vVar instanceof t ? u((t) vVar) : null;
        }
        if (c0881cM == null) {
            return null;
        }
        M3.f fVar = (M3.f) c0881cM.f9188b.f826e;
        M3.f fVar2 = f.f755e;
        AbstractC0219i.e("version", fVar2);
        p pVarL = l(g5, (K3.f) vVar.f3093b, (K3.g) vVar.f3094c, i5, fVar.a(fVar2.f1653b, fVar2.f1654c, fVar2.f1655d));
        if (pVarL == null || (objC = interfaceC0108c.c(((d4.e) this.f747e).d(c0881cM), pVarL)) == null) {
            return null;
        }
        if (!m3.r.a(abstractC0438v)) {
            return objC;
        }
        S3.g gVar = (S3.g) objC;
        if (gVar instanceof S3.d) {
            xVar = new x(((Number) ((S3.d) gVar).f2531a).byteValue());
        } else if (gVar instanceof S3.u) {
            xVar = new x(((Number) ((S3.u) gVar).f2531a).shortValue());
        } else if (gVar instanceof S3.k) {
            xVar = new x(((Number) ((S3.k) gVar).f2531a).intValue());
        } else {
            if (!(gVar instanceof s)) {
                return gVar;
            }
            xVar = new x(((Number) ((s) gVar).f2531a).longValue());
        }
        return xVar;
    }

    public List r(v vVar, G g5, int i5) {
        Boolean boolC = K3.e.f1660A.c(g5.f1001g);
        boolean zD = M3.h.d(g5);
        u uVar = u.f2163d;
        if (i5 == 1) {
            p pVarL = V1.a.L(g5, (K3.f) vVar.f3093b, (K3.g) vVar.f3094c, (40 & 8) != 0 ? false : false, (40 & 16) != 0 ? false : true, true);
            return pVarL == null ? uVar : i(this, vVar, pVarL, true, boolC, zD, 8);
        }
        p pVarL2 = V1.a.L(g5, (K3.f) vVar.f3093b, (K3.g) vVar.f3094c, (40 & 8) != 0 ? false : true, (40 & 16) != 0 ? false : false, true);
        if (pVarL2 == null) {
            return uVar;
        }
        return p4.h.g0(pVarL2.f773a, "$delegate") != (i5 == 3) ? uVar : h(vVar, pVarL2, true, true, boolC, zD);
    }

    public void s(String str, String str2, Bundle bundle) {
        int i5;
        String str3;
        String strEncodeToString;
        int iA;
        PackageInfo packageInfoC;
        bundle.putString(IDMMoDatabaseConstants.IDM_SCOPE, str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        V1.g gVar = (V1.g) this.f746d;
        gVar.a();
        bundle.putString("gmp_app_id", gVar.f2612c.f2618b);
        com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f747e;
        synchronized (mVar) {
            try {
                if (mVar.f6160d == 0 && (packageInfoC = mVar.c("com.google.android.gms")) != null) {
                    mVar.f6160d = packageInfoC.versionCode;
                }
                i5 = mVar.f6160d;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i5));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((com.google.firebase.messaging.m) this.f747e).a());
        com.google.firebase.messaging.m mVar2 = (com.google.firebase.messaging.m) this.f747e;
        synchronized (mVar2) {
            try {
                if (mVar2.f6159c == null) {
                    mVar2.e();
                }
                str3 = mVar2.f6159c;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str3);
        V1.g gVar2 = (V1.g) this.f746d;
        gVar2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar2.f2611b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str4 = ((C0668a) AbstractC0809c.a(((k2.d) ((k2.e) this.f750i)).d())).f7875a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException | ExecutionException e5) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e5);
        }
        bundle.putString("appid", (String) AbstractC0809c.a(((k2.d) ((k2.e) this.f750i)).c()));
        bundle.putString("cliv", "fcm-23.0.0");
        h2.b bVar = (h2.b) ((InterfaceC0558a) this.f749h).get();
        r2.b bVar2 = (r2.b) ((InterfaceC0558a) this.f748g).get();
        if (bVar == null || bVar2 == null || (iA = bVar.a("fire-iid")) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(Q0.c(iA)));
        bundle.putString("Firebase-Client", bVar2.a());
    }

    public t1.n t(String str, String str2, Bundle bundle) {
        int i5;
        int i6;
        PackageInfo packageInfo;
        try {
            s(str, str2, bundle);
            X0.a aVar = (X0.a) this.f;
            X0.k kVar = aVar.f2673c;
            synchronized (kVar) {
                if (kVar.f2699a == 0) {
                    try {
                        packageInfo = C0480a.a((Context) kVar.f2701c).f1626a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e5) {
                        String strValueOf = String.valueOf(e5);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
                        sb.append("Failed to find package ");
                        sb.append(strValueOf);
                        Log.w("Metadata", sb.toString());
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        kVar.f2699a = packageInfo.versionCode;
                    }
                    i5 = kVar.f2699a;
                } else {
                    i5 = kVar.f2699a;
                }
            }
            if (i5 < 12000000) {
                return aVar.f2673c.a() != 0 ? aVar.a(bundle).h(X0.m.f2704d, new E0.d(aVar, 15, bundle)) : AbstractC0809c.d(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            X0.j jVarB = X0.j.b(aVar.f2672b);
            synchronized (jVarB) {
                i6 = jVarB.f2696d;
                jVarB.f2696d = i6 + 1;
            }
            return jVarB.c(new X0.i(i6, 1, bundle, 1)).g(X0.m.f2704d, X0.l.f2702d);
        } catch (InterruptedException | ExecutionException e6) {
            return AbstractC0809c.d(e6);
        }
    }

    @Override // a4.InterfaceC0110a
    public Object t0(v vVar, G g5, AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("proto", g5);
        return q(vVar, g5, 3, abstractC0438v, b.f737e);
    }

    public void v(V1 v12) {
        String strQ = v12.q();
        byte[] bArrR = v12.p().r();
        int iC = Q0.c(v12.o());
        int i5 = 1;
        if (iC != 1) {
            i5 = 2;
            if (iC != 2) {
                i5 = 3;
                if (iC != 3) {
                    i5 = 4;
                    if (iC != 4) {
                        throw new IllegalArgumentException("Unknown output prefix type");
                    }
                }
            }
        }
        this.f748g = V.a(bArrR, i5, strQ);
    }

    @Override // a4.InterfaceC0112c
    public ArrayList w(W w3, K3.f fVar) {
        AbstractC0219i.e("proto", w3);
        AbstractC0219i.e("nameResolver", fVar);
        Object objK = w3.k(L3.k.f1802h);
        AbstractC0219i.d("proto.getExtension(JvmPr….typeParameterAnnotation)", objK);
        Iterable<C0025g> iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(P2.o.l0(iterable));
        for (C0025g c0025g : iterable) {
            AbstractC0219i.d("it", c0025g);
            arrayList.add(((E0.d) this.f749h).F0(c0025g, fVar));
        }
        return arrayList;
    }

    @Override // a4.InterfaceC0112c
    public ArrayList w0(Q q5, K3.f fVar) {
        AbstractC0219i.e("proto", q5);
        AbstractC0219i.e("nameResolver", fVar);
        Object objK = q5.k(L3.k.f);
        AbstractC0219i.d("proto.getExtension(JvmProtoBuf.typeAnnotation)", objK);
        Iterable<C0025g> iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(P2.o.l0(iterable));
        for (C0025g c0025g : iterable) {
            AbstractC0219i.d("it", c0025g);
            arrayList.add(((E0.d) this.f749h).F0(c0025g, fVar));
        }
        return arrayList;
    }

    public void x(Context context, String str) {
        if (context == null) {
            throw new IllegalArgumentException("need an Android context");
        }
        this.f750i = new C0306n(context, 6, str);
        this.f746d = new C0306n(context, 7, str);
    }

    public synchronized C0306n y() {
        Y y4;
        if (((String) this.f747e) != null) {
            this.f = z();
        }
        try {
            y4 = A();
        } catch (FileNotFoundException e5) {
            Log.i("n", "keyset not found, will generate a new one", e5);
            if (((V) this.f748g) == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            y4 = new Y(C0231a2.o());
            y4.b((V) this.f748g);
            y4.c(AbstractC0289k0.a((C0231a2) y4.a().f5568e).n().m());
            if (((C0307n0) this.f) != null) {
                y4.a().s((C0306n) this.f746d, (C0307n0) this.f);
            } else {
                C0306n c0306nA = y4.a();
                C0306n c0306n = (C0306n) this.f746d;
                C0231a2 c0231a2 = (C0231a2) c0306nA.f5568e;
                c0306n.getClass();
                if (!((SharedPreferences.Editor) c0306n.f5568e).putString("GenericIdpKeyset", AbstractC0335s.j(c0231a2.c())).commit()) {
                    throw new IOException("Failed to write to SharedPreferences");
                }
            }
        }
        this.f749h = y4;
        return new C0306n(this);
    }

    public C0307n0 z() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException, InvalidAlgorithmParameterException {
        G0 g0 = new G0();
        boolean zB = g0.b((String) this.f747e);
        if (!zB) {
            try {
                String str = (String) this.f747e;
                if (new G0().b(str)) {
                    throw new IllegalArgumentException("cannot generate a new key " + str + " because it already exists; please delete it with deleteKey() and try again");
                }
                String strA = E2.a(str);
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(new KeyGenParameterSpec.Builder(strA, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
                keyGenerator.generateKey();
            } catch (GeneralSecurityException | ProviderException e5) {
                Log.w("n", "cannot use Android Keystore, it'll be disabled", e5);
                return null;
            }
        }
        try {
            return g0.a((String) this.f747e);
        } catch (GeneralSecurityException | ProviderException e6) {
            if (zB) {
                throw new KeyStoreException(A3.f.o("the master key ", (String) this.f747e, " exists but is unusable"), e6);
            }
            Log.w("n", "cannot use Android Keystore, it'll be disabled", e6);
            return null;
        }
    }

    public d(Set set, String str, String str2) {
        C0784a c0784a = C0784a.f8445a;
        Set setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f746d = setEmptySet;
        Map mapEmptyMap = Collections.emptyMap();
        this.f = str;
        this.f748g = str2;
        this.f749h = c0784a;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator it = mapEmptyMap.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f747e = Collections.unmodifiableSet(hashSet);
    }
}
