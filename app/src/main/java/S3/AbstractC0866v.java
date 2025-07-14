package s3;

import b3.AbstractC0219i;
import e4.AbstractC0420c;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.V;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p3.AbstractC0771o;
import p3.C0770n;
import p3.InterfaceC0752N;
import p3.InterfaceC0755Q;
import p3.InterfaceC0757a;
import p3.InterfaceC0761e;
import p3.InterfaceC0766j;
import p3.InterfaceC0768l;
import p3.InterfaceC0775s;
import p3.InterfaceC0776t;
import q3.InterfaceC0798h;

/* renamed from: s3.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0866v extends AbstractC0860p implements InterfaceC0776t {

    /* renamed from: A, reason: collision with root package name */
    public Collection f8872A;

    /* renamed from: B, reason: collision with root package name */
    public volatile C0852h f8873B;

    /* renamed from: C, reason: collision with root package name */
    public final InterfaceC0776t f8874C;

    /* renamed from: D, reason: collision with root package name */
    public final int f8875D;
    public InterfaceC0776t E;

    /* renamed from: F, reason: collision with root package name */
    public Map f8876F;

    /* renamed from: h, reason: collision with root package name */
    public List f8877h;

    /* renamed from: i, reason: collision with root package name */
    public List f8878i;

    /* renamed from: j, reason: collision with root package name */
    public AbstractC0438v f8879j;

    /* renamed from: k, reason: collision with root package name */
    public List f8880k;

    /* renamed from: l, reason: collision with root package name */
    public C0867w f8881l;

    /* renamed from: m, reason: collision with root package name */
    public C0867w f8882m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public C0770n f8883o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8884p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8885q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8886r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8887s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8888t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8889u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8890v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8891w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8892x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8893y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8894z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0866v(int i5, N3.f fVar, InterfaceC0766j interfaceC0766j, InterfaceC0776t interfaceC0776t, InterfaceC0752N interfaceC0752N, InterfaceC0798h interfaceC0798h) {
        super(interfaceC0766j, interfaceC0798h, fVar, interfaceC0752N);
        if (interfaceC0766j == null) {
            H0(0);
            throw null;
        }
        if (interfaceC0798h == null) {
            H0(1);
            throw null;
        }
        if (fVar == null) {
            H0(2);
            throw null;
        }
        if (i5 == 0) {
            H0(3);
            throw null;
        }
        if (interfaceC0752N == null) {
            H0(4);
            throw null;
        }
        this.f8883o = AbstractC0771o.f8426i;
        this.f8884p = false;
        this.f8885q = false;
        this.f8886r = false;
        this.f8887s = false;
        this.f8888t = false;
        this.f8889u = false;
        this.f8890v = false;
        this.f8891w = false;
        this.f8892x = false;
        this.f8893y = true;
        this.f8894z = false;
        this.f8872A = null;
        this.f8873B = null;
        this.E = null;
        this.f8876F = null;
        this.f8874C = interfaceC0776t == null ? this : interfaceC0776t;
        this.f8875D = i5;
    }

    public static /* synthetic */ void H0(int i5) {
        String str;
        int i6;
        switch (i5) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i5) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i6 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i6 = 3;
                break;
        }
        Object[] objArr = new Object[i6];
        switch (i5) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i5) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i5) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i5) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v2, types: [s3.T] */
    public static ArrayList S0(InterfaceC0776t interfaceC0776t, List list, V v2, boolean z4, boolean z5, boolean[] zArr) {
        if (list == null) {
            H0(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0843T c0843t = (C0843T) it.next();
            C0843T c0843t2 = c0843t;
            AbstractC0438v abstractC0438vI = v2.i(2, c0843t2.d());
            AbstractC0438v abstractC0438v = c0843t.f8804m;
            AbstractC0438v abstractC0438vI2 = abstractC0438v == null ? null : v2.i(2, abstractC0438v);
            if (abstractC0438vI == null) {
                return null;
            }
            if ((abstractC0438vI != c0843t2.d() || abstractC0438v != abstractC0438vI2) && zArr != null) {
                zArr[0] = true;
            }
            C0851g c0851g = c0843t instanceof C0842S ? new C0851g(2, (List) ((C0842S) c0843t).f8799o.getValue()) : null;
            C0843T c0843t3 = z4 ? null : c0843t;
            InterfaceC0798h interfaceC0798hS = c0843t.s();
            N3.f name = c0843t.getName();
            boolean zP0 = c0843t.P0();
            InterfaceC0752N interfaceC0752NN = z5 ? c0843t.n() : InterfaceC0752N.f8400b;
            AbstractC0219i.e("annotations", interfaceC0798hS);
            AbstractC0219i.e("name", name);
            AbstractC0219i.e("source", interfaceC0752NN);
            int i5 = c0843t.f8800i;
            boolean z6 = c0843t.f8802k;
            boolean z7 = c0843t.f8803l;
            arrayList.add(c0851g == null ? new C0843T(interfaceC0776t, c0843t3, i5, interfaceC0798hS, name, abstractC0438vI, zP0, z6, z7, abstractC0438vI2, interfaceC0752NN) : new C0842S(interfaceC0776t, c0843t3, i5, interfaceC0798hS, name, abstractC0438vI, zP0, z6, z7, abstractC0438vI2, interfaceC0752NN, c0851g));
        }
        return arrayList;
    }

    public Object B0(InterfaceC0757a interfaceC0757a) {
        Map map = this.f8876F;
        if (map == null) {
            return null;
        }
        return map.get(interfaceC0757a);
    }

    @Override // p3.InterfaceC0776t
    public final InterfaceC0776t C() {
        return this.E;
    }

    public boolean E() {
        return this.f8886r;
    }

    @Override // p3.InterfaceC0758b
    public final C0867w F() {
        return this.f8882m;
    }

    @Override // p3.InterfaceC0776t
    public final boolean J() {
        return this.f8890v;
    }

    public void M(Collection collection) {
        if (collection == null) {
            H0(17);
            throw null;
        }
        this.f8872A = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((InterfaceC0776t) it.next()).Z()) {
                this.f8891w = true;
                return;
            }
        }
    }

    public boolean O() {
        return this.f8888t;
    }

    public final InterfaceC0776t O0(InterfaceC0761e interfaceC0761e, int i5, C0770n c0770n) {
        InterfaceC0776t interfaceC0776tI = c0().r(interfaceC0761e).x(i5).n(c0770n).a(2).e().i();
        if (interfaceC0776tI != null) {
            return interfaceC0776tI;
        }
        H0(26);
        throw null;
    }

    @Override // p3.InterfaceC0759c
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public C0837M a0(InterfaceC0761e interfaceC0761e, int i5, C0770n c0770n) {
        return (C0837M) O0(interfaceC0761e, i5, c0770n);
    }

    @Override // p3.InterfaceC0776t
    public final boolean Q() {
        if (this.f8884p) {
            return true;
        }
        Iterator it = a().p().iterator();
        while (it.hasNext()) {
            if (((InterfaceC0776t) it.next()).Q()) {
                return true;
            }
        }
        return false;
    }

    public abstract AbstractC0866v Q0(int i5, N3.f fVar, InterfaceC0766j interfaceC0766j, InterfaceC0776t interfaceC0776t, InterfaceC0752N interfaceC0752N, InterfaceC0798h interfaceC0798h);

    public AbstractC0866v R0(C0865u c0865u) {
        C0867w c0867w;
        C0867w c0867w2;
        AbstractC0438v abstractC0438vI;
        if (c0865u == null) {
            H0(25);
            throw null;
        }
        boolean[] zArr = new boolean[1];
        InterfaceC0798h interfaceC0798hH = c0865u.f8867v != null ? Y0.j.h(s(), c0865u.f8867v) : s();
        InterfaceC0766j interfaceC0766j = c0865u.f8852e;
        InterfaceC0776t interfaceC0776t = c0865u.f8854h;
        int i5 = c0865u.f8855i;
        N3.f fVar = c0865u.f8860o;
        InterfaceC0752N interfaceC0752NN = c0865u.f8863r ? ((AbstractC0860p) (interfaceC0776t != null ? interfaceC0776t : a())).n() : InterfaceC0752N.f8400b;
        if (interfaceC0752NN == null) {
            H0(27);
            throw null;
        }
        AbstractC0866v abstractC0866vQ0 = Q0(i5, fVar, interfaceC0766j, interfaceC0776t, interfaceC0752NN, interfaceC0798hH);
        List listU = c0865u.f8866u;
        if (listU == null) {
            listU = u();
        }
        zArr[0] = zArr[0] | (!listU.isEmpty());
        ArrayList arrayList = new ArrayList(listU.size());
        V v2 = AbstractC0420c.v(listU, c0865u.f8851d, abstractC0866vQ0, arrayList, zArr);
        if (v2 == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!c0865u.f8857k.isEmpty()) {
            int i6 = 0;
            for (C0867w c0867w3 : c0865u.f8857k) {
                AbstractC0438v abstractC0438vI2 = v2.i(2, c0867w3.d());
                if (abstractC0438vI2 == null) {
                    return null;
                }
                int i7 = i6 + 1;
                arrayList2.add(Q3.q.e(abstractC0866vQ0, abstractC0438vI2, ((Y3.a) c0867w3.O0()).M0(), c0867w3.s(), i6));
                zArr[0] = zArr[0] | (abstractC0438vI2 != c0867w3.d());
                i6 = i7;
            }
        }
        C0867w c0867w4 = c0865u.f8858l;
        if (c0867w4 != null) {
            AbstractC0438v abstractC0438vI3 = v2.i(2, c0867w4.d());
            if (abstractC0438vI3 == null) {
                return null;
            }
            c0865u.f8858l.O0();
            C0867w c0867w5 = new C0867w(abstractC0866vQ0, new Y3.b(abstractC0866vQ0, abstractC0438vI3), c0865u.f8858l.s());
            zArr[0] = (abstractC0438vI3 != c0865u.f8858l.d()) | zArr[0];
            c0867w = c0867w5;
        } else {
            c0867w = null;
        }
        C0867w c0867w6 = c0865u.f8859m;
        if (c0867w6 != null) {
            C0867w c0867wC = c0867w6.c(v2);
            if (c0867wC == null) {
                return null;
            }
            zArr[0] = zArr[0] | (c0867wC != c0865u.f8859m);
            c0867w2 = c0867wC;
        } else {
            c0867w2 = null;
        }
        ArrayList arrayListS0 = S0(abstractC0866vQ0, c0865u.f8856j, v2, c0865u.f8864s, c0865u.f8863r, zArr);
        if (arrayListS0 == null || (abstractC0438vI = v2.i(3, c0865u.n)) == null) {
            return null;
        }
        boolean z4 = zArr[0] | (abstractC0438vI != c0865u.n);
        zArr[0] = z4;
        if (!z4 && c0865u.f8871z) {
            return this;
        }
        abstractC0866vQ0.T0(c0867w, c0867w2, arrayList2, arrayList, arrayListS0, abstractC0438vI, c0865u.f, c0865u.f8853g);
        abstractC0866vQ0.f8884p = this.f8884p;
        abstractC0866vQ0.f8885q = this.f8885q;
        abstractC0866vQ0.f8886r = this.f8886r;
        abstractC0866vQ0.f8887s = this.f8887s;
        abstractC0866vQ0.f8888t = this.f8888t;
        abstractC0866vQ0.f8892x = this.f8892x;
        abstractC0866vQ0.f8889u = this.f8889u;
        abstractC0866vQ0.W0(this.f8893y);
        abstractC0866vQ0.f8890v = c0865u.f8865t;
        abstractC0866vQ0.f8891w = c0865u.f8868w;
        Boolean bool = c0865u.f8870y;
        abstractC0866vQ0.X0(bool != null ? bool.booleanValue() : this.f8894z);
        if (!c0865u.f8869x.isEmpty() || this.f8876F != null) {
            LinkedHashMap linkedHashMap = c0865u.f8869x;
            Map map = this.f8876F;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!linkedHashMap.containsKey(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (linkedHashMap.size() == 1) {
                abstractC0866vQ0.f8876F = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
            } else {
                abstractC0866vQ0.f8876F = linkedHashMap;
            }
        }
        if (c0865u.f8862q || this.E != null) {
            InterfaceC0776t interfaceC0776t2 = this.E;
            if (interfaceC0776t2 == null) {
                interfaceC0776t2 = this;
            }
            abstractC0866vQ0.E = interfaceC0776t2.c(v2);
        }
        if (c0865u.f8861p && !a().p().isEmpty()) {
            if (c0865u.f8851d.e()) {
                C0852h c0852h = this.f8873B;
                if (c0852h != null) {
                    abstractC0866vQ0.f8873B = c0852h;
                } else {
                    abstractC0866vQ0.M(p());
                }
            } else {
                abstractC0866vQ0.f8873B = new C0852h(this, v2, 1);
            }
        }
        return abstractC0866vQ0;
    }

    public void T0(C0867w c0867w, C0867w c0867w2, List list, List list2, List list3, AbstractC0438v abstractC0438v, int i5, C0770n c0770n) {
        if (list == null) {
            H0(5);
            throw null;
        }
        if (list2 == null) {
            H0(6);
            throw null;
        }
        if (list3 == null) {
            H0(7);
            throw null;
        }
        if (c0770n == null) {
            H0(8);
            throw null;
        }
        this.f8877h = P2.m.O0(list2);
        this.f8878i = P2.m.O0(list3);
        this.f8879j = abstractC0438v;
        this.n = i5;
        this.f8883o = c0770n;
        this.f8881l = c0867w;
        this.f8882m = c0867w2;
        this.f8880k = list;
        for (int i6 = 0; i6 < list2.size(); i6++) {
            InterfaceC0755Q interfaceC0755Q = (InterfaceC0755Q) list2.get(i6);
            if (interfaceC0755Q.x0() != i6) {
                throw new IllegalStateException(interfaceC0755Q + " index is " + interfaceC0755Q.x0() + " but position is " + i6);
            }
        }
        for (int i7 = 0; i7 < list3.size(); i7++) {
            C0843T c0843t = (C0843T) list3.get(i7);
            if (c0843t.f8800i != i7) {
                throw new IllegalStateException(c0843t + "index is " + c0843t.f8800i + " but position is " + i7);
            }
        }
    }

    public Object U(InterfaceC0768l interfaceC0768l, Object obj) {
        return interfaceC0768l.H(this, obj);
    }

    public final C0865u U0(V v2) {
        if (v2 != null) {
            return new C0865u(this, v2.f(), l(), i(), b(), i0(), v0(), u0(), this.f8881l, o());
        }
        H0(24);
        throw null;
    }

    public final void V0(InterfaceC0757a interfaceC0757a, Object obj) {
        if (this.f8876F == null) {
            this.f8876F = new LinkedHashMap();
        }
        this.f8876F.put(interfaceC0757a, obj);
    }

    public void W0(boolean z4) {
        this.f8893y = z4;
    }

    public void X0(boolean z4) {
        this.f8894z = z4;
    }

    public final void Y0(AbstractC0442z abstractC0442z) {
        if (abstractC0442z != null) {
            this.f8879j = abstractC0442z;
        } else {
            H0(11);
            throw null;
        }
    }

    @Override // p3.InterfaceC0776t
    public final boolean Z() {
        return this.f8891w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [p3.t] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // s3.AbstractC0860p, s3.AbstractC0859o, p3.InterfaceC0766j, p3.InterfaceC0763g
    public InterfaceC0776t a() {
        InterfaceC0776t interfaceC0776t = this.f8874C;
        ?? A4 = this;
        if (interfaceC0776t != this) {
            A4 = interfaceC0776t.a();
        }
        if (A4 != 0) {
            return A4;
        }
        H0(20);
        throw null;
    }

    @Override // p3.InterfaceC0769m, p3.InterfaceC0780x
    public final C0770n b() {
        C0770n c0770n = this.f8883o;
        if (c0770n != null) {
            return c0770n;
        }
        H0(16);
        throw null;
    }

    @Override // p3.InterfaceC0758b
    public final C0867w b0() {
        return this.f8881l;
    }

    public InterfaceC0775s c0() {
        return U0(V.f6667b);
    }

    public boolean h() {
        return this.f8892x;
    }

    @Override // p3.InterfaceC0780x
    public final boolean h0() {
        return false;
    }

    @Override // p3.InterfaceC0780x
    public final int i() {
        int i5 = this.n;
        if (i5 != 0) {
            return i5;
        }
        H0(15);
        throw null;
    }

    @Override // p3.InterfaceC0759c
    public final int i0() {
        int i5 = this.f8875D;
        if (i5 != 0) {
            return i5;
        }
        H0(21);
        throw null;
    }

    public boolean j() {
        return this.f8887s;
    }

    public AbstractC0438v o() {
        return this.f8879j;
    }

    public boolean o0() {
        return this.f8894z;
    }

    public Collection p() {
        C0852h c0852h = this.f8873B;
        if (c0852h != null) {
            this.f8872A = (Collection) c0852h.a();
            this.f8873B = null;
        }
        Collection collectionEmptyList = this.f8872A;
        if (collectionEmptyList == null) {
            collectionEmptyList = Collections.emptyList();
        }
        if (collectionEmptyList != null) {
            return collectionEmptyList;
        }
        H0(14);
        throw null;
    }

    @Override // p3.InterfaceC0758b
    public final List u() {
        List list = this.f8877h;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // p3.InterfaceC0758b
    public final List u0() {
        List list = this.f8880k;
        if (list != null) {
            return list;
        }
        H0(13);
        throw null;
    }

    @Override // p3.InterfaceC0758b
    public final List v0() {
        List list = this.f8878i;
        if (list != null) {
            return list;
        }
        H0(19);
        throw null;
    }

    @Override // p3.InterfaceC0776t
    public final boolean w0() {
        if (this.f8885q) {
            return true;
        }
        Iterator it = a().p().iterator();
        while (it.hasNext()) {
            if (((InterfaceC0776t) it.next()).w0()) {
                return true;
            }
        }
        return false;
    }

    @Override // p3.InterfaceC0780x
    public final boolean z() {
        return this.f8889u;
    }

    @Override // p3.InterfaceC0754P
    public InterfaceC0776t c(V v2) {
        if (v2 == null) {
            H0(22);
            throw null;
        }
        if (v2.f6668a.e()) {
            return this;
        }
        C0865u c0865uU0 = U0(v2);
        c0865uU0.f8854h = a();
        c0865uU0.f8863r = true;
        c0865uU0.f8871z = true;
        return c0865uU0.f8850A.R0(c0865uU0);
    }
}
