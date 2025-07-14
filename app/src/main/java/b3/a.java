package B3;

import C3.C0012d;
import C3.t;
import I3.C0037t;
import I3.Q;
import P2.m;
import P2.n;
import P2.o;
import P2.w;
import a3.InterfaceC0106a;
import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import b3.k;
import com.google.firebase.messaging.q;
import d4.l;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.C0440x;
import e4.N;
import e4.V;
import e4.Z;
import g3.s;
import j3.C0562b;
import j3.D;
import j3.F;
import j3.l0;
import j3.m0;
import j3.v0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k.Q0;
import k3.C0671c;
import o3.C0718a;
import o3.C0724g;
import o3.C0726i;
import o3.C0730m;
import p3.AbstractC0779w;
import p3.InterfaceC0752N;
import p3.InterfaceC0761e;
import p3.InterfaceC0762f;
import p3.InterfaceC0766j;
import p3.InterfaceC0776t;
import q3.InterfaceC0798h;
import s3.C0826B;
import s3.C0840P;
import s3.C0855k;
import s3.C0857m;
import s3.C0867w;
import u3.C0880b;
import v3.y;
import y3.u;

/* loaded from: classes.dex */
public final class a extends k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f222e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, int i5, Object obj2) {
        super(0);
        this.f221d = i5;
        this.f222e = obj;
        this.f = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [a3.a, b3.k] */
    /* JADX WARN: Type inference failed for: r0v39, types: [O2.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [O2.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [O2.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [O2.c, java.lang.Object] */
    @Override // a3.InterfaceC0106a
    public final Object a() {
        s sVar;
        switch (this.f221d) {
            case 0:
                InterfaceC0798h interfaceC0798hS = ((InterfaceC0762f) this.f).s();
                g gVar = (g) this.f222e;
                AbstractC0219i.e("<this>", gVar);
                AbstractC0219i.e("additionalAnnotations", interfaceC0798hS);
                return ((b) gVar.f255e).f237q.b((u) gVar.f257h.getValue(), interfaceC0798hS);
            case 1:
                g gVar2 = (g) this.f222e;
                AbstractC0219i.e("<this>", gVar2);
                InterfaceC0798h interfaceC0798h = (InterfaceC0798h) this.f;
                AbstractC0219i.e("additionalAnnotations", interfaceC0798h);
                return ((b) gVar2.f255e).f237q.b((u) gVar2.f257h.getValue(), interfaceC0798h);
            case 2:
                return new t(((f) this.f222e).f252a, (y) this.f);
            case 3:
                C0880b c0880b = ((b) ((g) this.f222e).f255e).f224b;
                N3.c cVar = ((C3.y) this.f).f451o.f8745h;
                c0880b.getClass();
                AbstractC0219i.e("packageFqName", cVar);
                return null;
            case 4:
                a4.k kVar = (a4.k) ((G3.c) this.f222e).f740e;
                return ((a4.i) kVar.f3058d).f3041e.w0((Q) this.f, (K3.f) kVar.f3059e);
            case 5:
                c4.i iVar = (c4.i) this.f222e;
                return m.O0(((a4.i) iVar.f5165o.f3058d).f3041e.j(iVar.f5175y, (C0037t) this.f));
            case 6:
                h4.c cVar2 = (h4.c) ((C0440x) this.f).f.a();
                ((f4.f) this.f222e).getClass();
                AbstractC0219i.e("type", cVar2);
                return (AbstractC0438v) cVar2;
            case 7:
                Iterable iterable = (List) ((f4.i) this.f222e).f6751e.getValue();
                if (iterable == null) {
                    iterable = P2.u.f2163d;
                }
                ArrayList arrayList = new ArrayList(o.l0(iterable));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Z) it.next()).K0((f4.f) this.f));
                }
                return arrayList;
            case 8:
                F f = (F) this.f222e;
                D d5 = f.f7330e;
                d5.getClass();
                String str = (String) this.f;
                String str2 = f.f;
                AbstractC0219i.e("signature", str2);
                Collection collectionO0 = str.equals("<init>") ? m.O0(d5.d()) : d5.e(N3.f.e(str));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionO0) {
                    if (AbstractC0219i.a(v0.c((InterfaceC0776t) obj).d(), str2)) {
                        arrayList2.add(obj);
                    }
                }
                if (arrayList2.size() == 1) {
                    return (InterfaceC0776t) m.J0(arrayList2);
                }
                String strA0 = m.A0(collectionO0, "\n", null, null, C0562b.f7372i, 30);
                StringBuilder sb = new StringBuilder("Function '");
                sb.append(str);
                sb.append("' (JVM signature: ");
                sb.append(str2);
                sb.append(") not resolved in ");
                sb.append(d5);
                sb.append(':');
                sb.append(strA0.length() == 0 ? " no members found" : "\n".concat(strA0));
                throw new O2.e(sb.toString(), 2);
            case 9:
                m0 m0Var = (m0) this.f222e;
                List listS0 = m0Var.f7416a.s0();
                if (listS0.isEmpty()) {
                    return P2.u.f2163d;
                }
                O2.c cVarM = g3.y.M(2, new l0(0, m0Var));
                ArrayList arrayList3 = new ArrayList(o.l0(listS0));
                int i5 = 0;
                for (Object obj2 : listS0) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        n.k0();
                        throw null;
                    }
                    N n = (N) obj2;
                    if (n.c()) {
                        sVar = s.f6781c;
                    } else {
                        AbstractC0438v abstractC0438vB = n.b();
                        AbstractC0219i.d("typeProjection.type", abstractC0438vB);
                        m0 m0Var2 = new m0(abstractC0438vB, ((InterfaceC0106a) this.f) != null ? new a4.o(m0Var, i5, cVarM) : null);
                        int iC = Q0.c(n.a());
                        if (iC == 0) {
                            sVar = new s(1, m0Var2);
                        } else if (iC == 1) {
                            sVar = new s(2, m0Var2);
                        } else {
                            if (iC != 2) {
                                throw new O2.d();
                            }
                            sVar = new s(3, m0Var2);
                        }
                    }
                    arrayList3.add(sVar);
                    i5 = i6;
                }
                return arrayList3;
            case 10:
                StringBuilder sb2 = new StringBuilder();
                sb2.append('@');
                sb2.append(((Class) this.f222e).getCanonicalName());
                m.z0(((Map) this.f).entrySet(), sb2, "(", ")", C0671c.f7914d, 48);
                String string = sb2.toString();
                AbstractC0219i.d("StringBuilder().apply(builderAction).toString()", string);
                return string;
            case 11:
                C0724g c0724g = (C0724g) this.f222e;
                InterfaceC0107b interfaceC0107b = c0724g.f8267b;
                C0826B c0826b = c0724g.f8266a;
                InterfaceC0766j interfaceC0766j = (InterfaceC0766j) interfaceC0107b.d(c0826b);
                N3.f fVar = C0724g.f8264g;
                List listN = g3.y.N(c0826b.f8732g.e());
                l lVar = (l) this.f;
                C0857m c0857m = new C0857m(interfaceC0766j, fVar, 4, 2, listN, lVar);
                c0857m.s0(new C0718a(lVar, c0857m), w.f2165d, null);
                return c0857m;
            case 12:
                C0726i c0726i = (C0726i) this.f222e;
                C0826B c0826bK = c0726i.k();
                AbstractC0219i.d("builtInsModule", c0826bK);
                return new C0730m(c0826bK, (l) this.f, new C0012d(25, c0726i));
            case 13:
                C0730m c0730m = (C0730m) this.f222e;
                C0826B c0826b2 = c0730m.g().f8269a;
                C0724g.f8262d.getClass();
                return AbstractC0779w.f(c0826b2, C0724g.f8265h, new q((l) this.f, c0730m.g().f8269a)).q();
            case 14:
                C3.k kVar2 = (C3.k) this.f222e;
                g gVar3 = kVar2.f405m;
                b bVar = (b) gVar3.f255e;
                g gVar4 = new g(new b(bVar.f223a, bVar.f224b, bVar.f225c, bVar.f226d, bVar.f227e, bVar.f, bVar.f229h, bVar.f230i, bVar.f231j, bVar.f232k, bVar.f233l, bVar.f234m, bVar.n, bVar.f235o, bVar.f236p, bVar.f237q, bVar.f238r, bVar.f239s, bVar.f240t, bVar.f241u, bVar.f242v, bVar.f243w), (i) gVar3.f, gVar3.f256g);
                InterfaceC0766j interfaceC0766jL = kVar2.l();
                AbstractC0219i.d("containingDeclaration", interfaceC0766jL);
                return new C3.k(gVar4, interfaceC0766jL, kVar2.f403k, (InterfaceC0761e) this.f);
            case 15:
                C0840P c0840p = (C0840P) this.f222e;
                d4.o oVar = c0840p.f8795G;
                C0855k c0855k = (C0855k) this.f;
                InterfaceC0798h interfaceC0798hS2 = c0855k.s();
                C0855k c0855k2 = (C0855k) this.f;
                int iI0 = c0855k2.i0();
                A3.f.u(iI0, "underlyingConstructorDescriptor.kind");
                c4.s sVar2 = c0840p.f8796H;
                InterfaceC0752N interfaceC0752NN = sVar2.n();
                AbstractC0219i.d("typeAliasDescriptor.source", interfaceC0752NN);
                C0840P c0840p2 = new C0840P(oVar, c0840p.f8796H, c0855k, c0840p, interfaceC0798hS2, iI0, interfaceC0752NN);
                C0840P.f8794J.getClass();
                V vD = sVar2.O0() == null ? null : V.d(sVar2.P0());
                if (vD == null) {
                    return null;
                }
                C0867w c0867w = c0855k2.f8882m;
                C0867w c0867wC = c0867w != null ? c0867w.c(vD) : null;
                List listU0 = c0855k2.u0();
                AbstractC0219i.d("underlyingConstructorDes…contextReceiverParameters", listU0);
                ArrayList arrayList4 = new ArrayList(o.l0(listU0));
                Iterator it2 = listU0.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((C0867w) it2.next()).c(vD));
                }
                List listR = sVar2.r();
                List listV0 = c0840p.v0();
                AbstractC0438v abstractC0438v = c0840p.f8879j;
                AbstractC0219i.b(abstractC0438v);
                c0840p2.T0(null, c0867wC, arrayList4, listR, listV0, abstractC0438v, 1, sVar2.f5206h);
                return c0840p2;
            default:
                AbstractC0442z abstractC0442zQ = ((b) ((g) this.f222e).f255e).f235o.f8732g.i(((z3.b) this.f).f9483a).q();
                AbstractC0219i.d("c.module.builtIns.getBui…qName(fqName).defaultType", abstractC0442zQ);
                return abstractC0442zQ;
        }
    }
}
