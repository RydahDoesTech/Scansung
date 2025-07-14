package s3;

import a3.InterfaceC0106a;
import e4.AbstractC0438v;
import e4.V;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p3.C0753O;
import p3.C0770n;
import p3.InterfaceC0749K;
import p3.InterfaceC0750L;
import p3.InterfaceC0752N;
import p3.InterfaceC0757a;
import p3.InterfaceC0761e;
import p3.InterfaceC0766j;
import p3.InterfaceC0768l;
import p3.InterfaceC0776t;
import q3.C0796f;
import q3.C0797g;
import q3.InterfaceC0798h;

/* renamed from: s3.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0834J extends AbstractC0844U implements InterfaceC0750L {

    /* renamed from: A, reason: collision with root package name */
    public C0836L f8768A;

    /* renamed from: B, reason: collision with root package name */
    public C0864t f8769B;

    /* renamed from: C, reason: collision with root package name */
    public C0864t f8770C;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8771i;

    /* renamed from: j, reason: collision with root package name */
    public d4.h f8772j;

    /* renamed from: k, reason: collision with root package name */
    public b3.k f8773k;

    /* renamed from: l, reason: collision with root package name */
    public final int f8774l;

    /* renamed from: m, reason: collision with root package name */
    public C0770n f8775m;
    public Collection n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0750L f8776o;

    /* renamed from: p, reason: collision with root package name */
    public final int f8777p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f8778q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f8779r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f8780s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f8781t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f8782u;

    /* renamed from: v, reason: collision with root package name */
    public List f8783v;

    /* renamed from: w, reason: collision with root package name */
    public C0867w f8784w;

    /* renamed from: x, reason: collision with root package name */
    public C0867w f8785x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f8786y;

    /* renamed from: z, reason: collision with root package name */
    public C0835K f8787z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0834J(InterfaceC0766j interfaceC0766j, InterfaceC0750L interfaceC0750L, InterfaceC0798h interfaceC0798h, int i5, C0770n c0770n, boolean z4, N3.f fVar, int i6, InterfaceC0752N interfaceC0752N, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        super(interfaceC0766j, interfaceC0798h, fVar, null, interfaceC0752N);
        if (interfaceC0766j == null) {
            H0(0);
            throw null;
        }
        if (interfaceC0798h == null) {
            H0(1);
            throw null;
        }
        if (i5 == 0) {
            H0(2);
            throw null;
        }
        if (c0770n == null) {
            H0(3);
            throw null;
        }
        if (fVar == null) {
            H0(4);
            throw null;
        }
        if (i6 == 0) {
            H0(5);
            throw null;
        }
        if (interfaceC0752N == null) {
            H0(6);
            throw null;
        }
        this.f8771i = z4;
        this.n = null;
        this.f8783v = Collections.emptyList();
        this.f8774l = i5;
        this.f8775m = c0770n;
        this.f8776o = interfaceC0750L == null ? this : interfaceC0750L;
        this.f8777p = i6;
        this.f8778q = z5;
        this.f8779r = z6;
        this.f8780s = z7;
        this.f8781t = z8;
        this.f8782u = z9;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void H0(int r11) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C0834J.H0(int):void");
    }

    public static C0834J P0(InterfaceC0761e interfaceC0761e, int i5, C0770n c0770n, boolean z4, N3.f fVar, int i6, InterfaceC0752N interfaceC0752N) {
        C0796f c0796f = C0797g.f8481a;
        if (interfaceC0761e == null) {
            H0(7);
            throw null;
        }
        if (i5 == 0) {
            H0(9);
            throw null;
        }
        if (c0770n == null) {
            H0(10);
            throw null;
        }
        if (fVar == null) {
            H0(11);
            throw null;
        }
        if (i6 == 0) {
            H0(12);
            throw null;
        }
        if (interfaceC0752N != null) {
            return new C0834J(interfaceC0761e, null, c0796f, i5, c0770n, z4, fVar, i6, interfaceC0752N, false, false, false, false, false);
        }
        H0(13);
        throw null;
    }

    public static InterfaceC0776t R0(V v2, InterfaceC0749K interfaceC0749K) {
        if (interfaceC0749K == null) {
            H0(31);
            throw null;
        }
        InterfaceC0776t interfaceC0776t = ((AbstractC0832H) interfaceC0749K).f8757o;
        if (interfaceC0776t != null) {
            return interfaceC0776t.c(v2);
        }
        return null;
    }

    public Object B0(InterfaceC0757a interfaceC0757a) {
        return null;
    }

    @Override // p3.U
    public final boolean C0() {
        return this.f8778q;
    }

    public boolean E() {
        return this.f8781t;
    }

    @Override // s3.AbstractC0844U, p3.InterfaceC0758b
    public final C0867w F() {
        return this.f8784w;
    }

    @Override // p3.InterfaceC0750L
    public final boolean H() {
        return this.f8782u;
    }

    @Override // p3.InterfaceC0759c
    public final void M(Collection collection) {
        if (collection != null) {
            this.n = collection;
        } else {
            H0(40);
            throw null;
        }
    }

    @Override // p3.InterfaceC0759c
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final C0834J a0(InterfaceC0761e interfaceC0761e, int i5, C0770n c0770n) {
        C0833I c0833i = new C0833I(this);
        if (interfaceC0761e == null) {
            C0833I.a(0);
            throw null;
        }
        c0833i.f8758a = interfaceC0761e;
        c0833i.f8761d = null;
        if (i5 == 0) {
            C0833I.a(6);
            throw null;
        }
        c0833i.f8759b = i5;
        if (c0770n == null) {
            C0833I.a(8);
            throw null;
        }
        c0833i.f8760c = c0770n;
        c0833i.f8762e = 2;
        c0833i.f8763g = false;
        C0834J c0834jB = c0833i.b();
        if (c0834jB != null) {
            return c0834jB;
        }
        H0(42);
        throw null;
    }

    public boolean P() {
        return this.f8779r;
    }

    public C0834J Q0(InterfaceC0766j interfaceC0766j, int i5, C0770n c0770n, InterfaceC0750L interfaceC0750L, int i6, N3.f fVar) {
        C0753O c0753o = InterfaceC0752N.f8400b;
        if (interfaceC0766j == null) {
            H0(32);
            throw null;
        }
        if (i5 == 0) {
            H0(33);
            throw null;
        }
        if (c0770n == null) {
            H0(34);
            throw null;
        }
        if (i6 == 0) {
            H0(35);
            throw null;
        }
        if (fVar == null) {
            H0(36);
            throw null;
        }
        InterfaceC0798h interfaceC0798hS = s();
        boolean zP = P();
        boolean zE = E();
        return new C0834J(interfaceC0766j, interfaceC0750L, interfaceC0798hS, i5, c0770n, this.f8771i, fVar, i6, c0753o, this.f8778q, zP, this.f8780s, zE, this.f8782u);
    }

    public final void S0(C0835K c0835k, C0836L c0836l, C0864t c0864t, C0864t c0864t2) {
        this.f8787z = c0835k;
        this.f8768A = c0836l;
        this.f8769B = c0864t;
        this.f8770C = c0864t2;
    }

    @Override // p3.U
    public final boolean T() {
        return this.f8771i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T0(d4.h hVar, InterfaceC0106a interfaceC0106a) {
        if (interfaceC0106a == 0) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"));
        }
        this.f8773k = (b3.k) interfaceC0106a;
        if (hVar == null) {
            hVar = (d4.h) interfaceC0106a.a();
        }
        this.f8772j = hVar;
    }

    @Override // p3.InterfaceC0766j
    public final Object U(InterfaceC0768l interfaceC0768l, Object obj) {
        return interfaceC0768l.w(this, obj);
    }

    public void U0(AbstractC0438v abstractC0438v) {
    }

    public final void V0(AbstractC0438v abstractC0438v, List list, C0867w c0867w, C0867w c0867w2, List list2) {
        if (abstractC0438v == null) {
            H0(17);
            throw null;
        }
        if (list == null) {
            H0(18);
            throw null;
        }
        if (list2 == null) {
            H0(19);
            throw null;
        }
        this.f8805h = abstractC0438v;
        this.f8786y = new ArrayList(list);
        this.f8785x = c0867w2;
        this.f8784w = c0867w;
        this.f8783v = list2;
    }

    @Override // p3.InterfaceC0769m, p3.InterfaceC0780x
    public final C0770n b() {
        C0770n c0770n = this.f8775m;
        if (c0770n != null) {
            return c0770n;
        }
        H0(25);
        throw null;
    }

    @Override // s3.AbstractC0844U, p3.InterfaceC0758b
    public final C0867w b0() {
        return this.f8785x;
    }

    @Override // p3.InterfaceC0750L
    public final C0836L e() {
        return this.f8768A;
    }

    @Override // p3.U
    public final S3.g e0() {
        d4.h hVar = this.f8772j;
        if (hVar != null) {
            return (S3.g) hVar.a();
        }
        return null;
    }

    @Override // p3.InterfaceC0750L
    public final C0835K f() {
        return this.f8787z;
    }

    @Override // p3.InterfaceC0750L
    public final C0864t g0() {
        return this.f8770C;
    }

    @Override // p3.InterfaceC0780x
    public final boolean h0() {
        return false;
    }

    @Override // p3.InterfaceC0780x
    public final int i() {
        int i5 = this.f8774l;
        if (i5 != 0) {
            return i5;
        }
        H0(24);
        throw null;
    }

    @Override // p3.InterfaceC0759c
    public final int i0() {
        int i5 = this.f8777p;
        if (i5 != 0) {
            return i5;
        }
        H0(39);
        throw null;
    }

    @Override // s3.AbstractC0844U, p3.InterfaceC0758b
    public final AbstractC0438v o() {
        AbstractC0438v abstractC0438vD = d();
        if (abstractC0438vD != null) {
            return abstractC0438vD;
        }
        H0(23);
        throw null;
    }

    @Override // p3.InterfaceC0758b
    public final Collection p() {
        Collection collectionEmptyList = this.n;
        if (collectionEmptyList == null) {
            collectionEmptyList = Collections.emptyList();
        }
        if (collectionEmptyList != null) {
            return collectionEmptyList;
        }
        H0(41);
        throw null;
    }

    @Override // p3.InterfaceC0750L
    public final C0864t q0() {
        return this.f8769B;
    }

    @Override // s3.AbstractC0844U, p3.InterfaceC0758b
    public final List u() {
        ArrayList arrayList = this.f8786y;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for ".concat(AbstractC0859o.M0(this)));
    }

    @Override // p3.InterfaceC0758b
    public final List u0() {
        List list = this.f8783v;
        if (list != null) {
            return list;
        }
        H0(22);
        throw null;
    }

    @Override // p3.InterfaceC0750L
    public final ArrayList w() {
        ArrayList arrayList = new ArrayList(2);
        C0835K c0835k = this.f8787z;
        if (c0835k != null) {
            arrayList.add(c0835k);
        }
        C0836L c0836l = this.f8768A;
        if (c0836l != null) {
            arrayList.add(c0836l);
        }
        return arrayList;
    }

    @Override // p3.InterfaceC0780x
    public final boolean z() {
        return this.f8780s;
    }

    @Override // p3.InterfaceC0754P
    public final InterfaceC0750L c(V v2) {
        if (v2 == null) {
            H0(27);
            throw null;
        }
        if (v2.f6668a.e()) {
            return this;
        }
        C0833I c0833i = new C0833I(this);
        e4.S sF = v2.f();
        if (sF == null) {
            C0833I.a(15);
            throw null;
        }
        c0833i.f = sF;
        c0833i.f8761d = a();
        return c0833i.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [p3.L] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // s3.AbstractC0860p, s3.AbstractC0859o, p3.InterfaceC0766j, p3.InterfaceC0763g
    public final InterfaceC0750L a() {
        InterfaceC0750L interfaceC0750L = this.f8776o;
        ?? A4 = this;
        if (interfaceC0750L != this) {
            A4 = interfaceC0750L.a();
        }
        if (A4 != 0) {
            return A4;
        }
        H0(38);
        throw null;
    }
}
