package c4;

import C3.C0017i;
import I3.A;
import I3.C0028j;
import I3.EnumC0027i;
import I3.Q;
import I3.X;
import I3.e0;
import I3.f0;
import a4.w;
import b3.AbstractC0219i;
import e1.AbstractC0415a;
import e4.AbstractC0442z;
import e4.J;
import g3.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p3.AbstractC0756S;
import p3.C0751M;
import p3.C0753O;
import p3.C0770n;
import p3.InterfaceC0750L;
import p3.InterfaceC0752N;
import p3.InterfaceC0766j;
import q3.C0797g;
import q3.InterfaceC0798h;
import s3.AbstractC0846b;
import s3.C0855k;
import s3.C0867w;
import x3.EnumC0915b;

/* loaded from: classes.dex */
public final class i extends AbstractC0846b implements InterfaceC0766j {

    /* renamed from: h, reason: collision with root package name */
    public final C0028j f5159h;

    /* renamed from: i, reason: collision with root package name */
    public final K3.a f5160i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC0752N f5161j;

    /* renamed from: k, reason: collision with root package name */
    public final N3.b f5162k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5163l;

    /* renamed from: m, reason: collision with root package name */
    public final C0770n f5164m;
    public final int n;

    /* renamed from: o, reason: collision with root package name */
    public final a4.k f5165o;

    /* renamed from: p, reason: collision with root package name */
    public final X3.o f5166p;

    /* renamed from: q, reason: collision with root package name */
    public final C0017i f5167q;

    /* renamed from: r, reason: collision with root package name */
    public final C0751M f5168r;

    /* renamed from: s, reason: collision with root package name */
    public final com.google.firebase.messaging.q f5169s;

    /* renamed from: t, reason: collision with root package name */
    public final InterfaceC0766j f5170t;

    /* renamed from: u, reason: collision with root package name */
    public final d4.h f5171u;

    /* renamed from: v, reason: collision with root package name */
    public final d4.i f5172v;

    /* renamed from: w, reason: collision with root package name */
    public final d4.i f5173w;

    /* renamed from: x, reason: collision with root package name */
    public final d4.h f5174x;

    /* renamed from: y, reason: collision with root package name */
    public final a4.t f5175y;

    /* renamed from: z, reason: collision with root package name */
    public final InterfaceC0798h f5176z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a4.k kVar, C0028j c0028j, K3.f fVar, K3.a aVar, InterfaceC0752N interfaceC0752N) {
        int i5;
        K3.h hVar;
        super(((a4.i) kVar.f3058d).f3037a, AbstractC0415a.m(fVar, c0028j.f1289h).i());
        AbstractC0219i.e("outerContext", kVar);
        AbstractC0219i.e("classProto", c0028j);
        AbstractC0219i.e("nameResolver", fVar);
        AbstractC0219i.e("sourceElement", interfaceC0752N);
        this.f5159h = c0028j;
        this.f5160i = aVar;
        this.f5161j = interfaceC0752N;
        this.f5162k = AbstractC0415a.m(fVar, c0028j.f1289h);
        this.f5163l = a4.j.e((A) K3.e.f1676e.c(c0028j.f1288g));
        this.f5164m = y.q((f0) K3.e.f1675d.c(c0028j.f1288g));
        EnumC0027i enumC0027i = (EnumC0027i) K3.e.f.c(c0028j.f1288g);
        int i6 = 1;
        switch (enumC0027i == null ? -1 : w.f3097b[enumC0027i.ordinal()]) {
            case 2:
                i5 = 2;
                break;
            case 3:
                i5 = 3;
                break;
            case 4:
                i5 = 4;
                break;
            case 5:
                i5 = 5;
                break;
            case 6:
            case 7:
                i5 = 6;
                break;
            default:
                i5 = 1;
                break;
        }
        this.n = i5;
        List list = c0028j.f1291j;
        AbstractC0219i.d("classProto.typeParameterList", list);
        X x4 = c0028j.f1282H;
        AbstractC0219i.d("classProto.typeTable", x4);
        K3.g gVar = new K3.g(x4);
        e0 e0Var = c0028j.f1284J;
        AbstractC0219i.d("classProto.versionRequirementTable", e0Var);
        if (e0Var.f1231e.size() == 0) {
            hVar = K3.h.f1697a;
        } else {
            AbstractC0219i.d("table.requirementList", e0Var.f1231e);
            hVar = new K3.h();
        }
        a4.k kVarB = kVar.b(this, list, fVar, gVar, hVar, aVar);
        this.f5165o = kVarB;
        a4.i iVar = (a4.i) kVarB.f3058d;
        this.f5166p = i5 == 3 ? new X3.r(iVar.f3037a, this) : X3.m.f2791b;
        this.f5167q = new C0017i(this);
        C0753O c0753o = C0751M.f8395d;
        d4.o oVar = iVar.f3037a;
        ((f4.l) iVar.f3051q).getClass();
        C3.m mVar = new C3.m(i6, this, 2);
        c0753o.getClass();
        AbstractC0219i.e("storageManager", oVar);
        this.f5168r = new C0751M(this, oVar, mVar);
        this.f5169s = i5 == 3 ? new com.google.firebase.messaging.q(this) : null;
        InterfaceC0766j interfaceC0766j = (InterfaceC0766j) kVar.f;
        this.f5170t = interfaceC0766j;
        h hVar2 = new h(this, 4);
        d4.o oVar2 = iVar.f3037a;
        d4.l lVar = (d4.l) oVar2;
        lVar.getClass();
        this.f5171u = new d4.h(lVar, hVar2);
        h hVar3 = new h(this, 3);
        d4.l lVar2 = (d4.l) oVar2;
        lVar2.getClass();
        this.f5172v = new d4.i(lVar2, hVar3);
        h hVar4 = new h(this, 2);
        d4.l lVar3 = (d4.l) oVar2;
        lVar3.getClass();
        new d4.h(lVar3, hVar4);
        h hVar5 = new h(this, 5);
        d4.l lVar4 = (d4.l) oVar2;
        lVar4.getClass();
        this.f5173w = new d4.i(lVar4, hVar5);
        h hVar6 = new h(this, 6);
        d4.l lVar5 = (d4.l) oVar2;
        lVar5.getClass();
        this.f5174x = new d4.h(lVar5, hVar6);
        i iVar2 = interfaceC0766j instanceof i ? (i) interfaceC0766j : null;
        this.f5175y = new a4.t(c0028j, (K3.f) kVarB.f3059e, (K3.g) kVarB.f3060g, interfaceC0752N, iVar2 != null ? iVar2.f5175y : null);
        this.f5176z = !K3.e.f1674c.c(c0028j.f1288g).booleanValue() ? C0797g.f8481a : new u(oVar2, new h(this, 1));
    }

    @Override // p3.InterfaceC0764h
    public final boolean A() {
        return K3.e.f1677g.c(this.f5159h.f1288g).booleanValue();
    }

    @Override // p3.InterfaceC0761e
    public final boolean D0() {
        return K3.e.f1678h.c(this.f5159h.f1288g).booleanValue();
    }

    @Override // p3.InterfaceC0780x
    public final boolean E() {
        return K3.e.f1679i.c(this.f5159h.f1288g).booleanValue();
    }

    public final AbstractC0442z H0(N3.f fVar) {
        Iterator it = s0().c(fVar, EnumC0915b.f9320j).iterator();
        boolean z4 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z4) {
                    break;
                }
            } else {
                Object next = it.next();
                if (((InterfaceC0750L) next).b0() == null) {
                    if (z4) {
                        break;
                    }
                    z4 = true;
                    obj = next;
                }
            }
        }
        obj = null;
        InterfaceC0750L interfaceC0750L = (InterfaceC0750L) obj;
        return (AbstractC0442z) (interfaceC0750L != null ? interfaceC0750L.d() : null);
    }

    @Override // p3.InterfaceC0763g
    public final J I() {
        return this.f5167q;
    }

    @Override // p3.InterfaceC0761e
    public final int L() {
        return this.n;
    }

    @Override // p3.InterfaceC0761e
    public final boolean N() {
        return K3.e.f.c(this.f5159h.f1288g) == EnumC0027i.COMPANION_OBJECT;
    }

    @Override // p3.InterfaceC0761e
    public final AbstractC0756S S() {
        return (AbstractC0756S) this.f5174x.a();
    }

    @Override // p3.InterfaceC0761e
    public final C0855k V() {
        return (C0855k) this.f5171u.a();
    }

    @Override // p3.InterfaceC0761e
    public final X3.n W() {
        return this.f5166p;
    }

    @Override // p3.InterfaceC0761e, p3.InterfaceC0769m, p3.InterfaceC0780x
    public final C0770n b() {
        return this.f5164m;
    }

    @Override // p3.InterfaceC0761e
    public final boolean f0() {
        return K3.e.f1682l.c(this.f5159h.f1288g).booleanValue();
    }

    @Override // p3.InterfaceC0780x
    public final boolean h0() {
        return false;
    }

    @Override // p3.InterfaceC0761e, p3.InterfaceC0780x
    public final int i() {
        return this.f5163l;
    }

    @Override // p3.InterfaceC0761e
    public final boolean j() {
        if (K3.e.f1681k.c(this.f5159h.f1288g).booleanValue()) {
            K3.a aVar = this.f5160i;
            int i5 = aVar.f1653b;
            if (i5 < 1) {
                return true;
            }
            if (i5 <= 1) {
                int i6 = aVar.f1654c;
                if (i6 < 4) {
                    return true;
                }
                if (i6 <= 4 && aVar.f1655d <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p3.InterfaceC0761e
    public final Collection k() {
        return (Collection) this.f5172v.a();
    }

    @Override // p3.InterfaceC0766j
    public final InterfaceC0766j l() {
        return this.f5170t;
    }

    @Override // p3.InterfaceC0767k
    public final InterfaceC0752N n() {
        return this.f5161j;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    @Override // p3.InterfaceC0761e, p3.InterfaceC0764h
    public final List r() {
        return P2.m.O0(((G3.c) this.f5165o.f3064k).f745k.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Iterable] */
    @Override // s3.AbstractC0846b, p3.InterfaceC0761e
    public final List r0() {
        a4.k kVar = this.f5165o;
        K3.g gVar = (K3.g) kVar.f3060g;
        C0028j c0028j = this.f5159h;
        AbstractC0219i.e("<this>", c0028j);
        AbstractC0219i.e("typeTable", gVar);
        List list = c0028j.f1296p;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List<Integer> list2 = c0028j.f1297q;
            AbstractC0219i.d("contextReceiverTypeIdList", list2);
            arrayList = new ArrayList(P2.o.l0(list2));
            for (Integer num : list2) {
                AbstractC0219i.d("it", num);
                arrayList.add(gVar.a(num.intValue()));
            }
        }
        ArrayList arrayList2 = new ArrayList(P2.o.l0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C0867w(G0(), new Y3.a(this, ((G3.c) kVar.f3064k).g((Q) it.next()), (N3.f) null), C0797g.f8481a));
        }
        return arrayList2;
    }

    @Override // q3.InterfaceC0791a
    public final InterfaceC0798h s() {
        return this.f5176z;
    }

    public final g s0() {
        ((f4.l) ((a4.i) this.f5165o.f3058d).f3051q).getClass();
        C0751M c0751m = this.f5168r;
        U3.f.j(c0751m.f8397a);
        return (g) ((X3.n) V1.a.Q(c0751m.f8399c, C0751M.f8396e[0]));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(z() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // p3.InterfaceC0761e
    public final boolean v() {
        return K3.e.f1681k.c(this.f5159h.f1288g).booleanValue() && this.f5160i.a(1, 4, 2);
    }

    @Override // s3.AbstractC0825A
    public final X3.n x(f4.f fVar) {
        C0751M c0751m = this.f5168r;
        U3.f.j(c0751m.f8397a);
        return (X3.n) V1.a.Q(c0751m.f8399c, C0751M.f8396e[0]);
    }

    @Override // p3.InterfaceC0780x
    public final boolean z() {
        return K3.e.f1680j.c(this.f5159h.f1288g).booleanValue();
    }

    @Override // p3.InterfaceC0761e
    public final Collection z0() {
        return (Collection) this.f5173w.a();
    }
}
