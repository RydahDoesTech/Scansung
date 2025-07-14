package n3;

import P2.m;
import P2.o;
import P2.u;
import b3.AbstractC0219i;
import d4.l;
import e4.J;
import f3.C0446b;
import f3.C0447c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m3.n;
import p3.AbstractC0756S;
import p3.AbstractC0771o;
import p3.C0770n;
import p3.InterfaceC0752N;
import p3.InterfaceC0766j;
import q3.C0797g;
import q3.InterfaceC0798h;
import s3.AbstractC0846b;
import s3.C0841Q;
import s3.C0855k;

/* renamed from: n3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0698c extends AbstractC0846b {

    /* renamed from: o, reason: collision with root package name */
    public static final N3.b f8171o = new N3.b(n.f8150j, N3.f.e("Function"));

    /* renamed from: p, reason: collision with root package name */
    public static final N3.b f8172p = new N3.b(n.f8148h, N3.f.e("KFunction"));

    /* renamed from: h, reason: collision with root package name */
    public final l f8173h;

    /* renamed from: i, reason: collision with root package name */
    public final b4.c f8174i;

    /* renamed from: j, reason: collision with root package name */
    public final EnumC0700e f8175j;

    /* renamed from: k, reason: collision with root package name */
    public final int f8176k;

    /* renamed from: l, reason: collision with root package name */
    public final C0697b f8177l;

    /* renamed from: m, reason: collision with root package name */
    public final C0701f f8178m;
    public final List n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0698c(l lVar, b4.c cVar, EnumC0700e enumC0700e, int i5) {
        super(lVar, enumC0700e.a(i5));
        AbstractC0219i.e("containingDeclaration", cVar);
        this.f8173h = lVar;
        this.f8174i = cVar;
        this.f8175j = enumC0700e;
        this.f8176k = i5;
        this.f8177l = new C0697b(this);
        this.f8178m = new C0701f(lVar, this);
        ArrayList arrayList = new ArrayList();
        C0447c c0447c = new C0447c(1, i5, 1);
        ArrayList arrayList2 = new ArrayList(o.l0(c0447c));
        Iterator it = c0447c.iterator();
        while (((C0446b) it).f) {
            arrayList.add(C0841Q.R0(this, 2, N3.f.e("P" + ((C0446b) it).a()), arrayList.size(), this.f8173h));
            arrayList2.add(O2.l.f2016a);
        }
        arrayList.add(C0841Q.R0(this, 3, N3.f.e("R"), arrayList.size(), this.f8173h));
        this.n = m.O0(arrayList);
    }

    @Override // p3.InterfaceC0764h
    public final boolean A() {
        return false;
    }

    @Override // p3.InterfaceC0761e
    public final boolean D0() {
        return false;
    }

    @Override // p3.InterfaceC0780x
    public final boolean E() {
        return false;
    }

    @Override // p3.InterfaceC0763g
    public final J I() {
        return this.f8177l;
    }

    @Override // p3.InterfaceC0761e
    public final int L() {
        return 2;
    }

    @Override // p3.InterfaceC0761e
    public final boolean N() {
        return false;
    }

    @Override // p3.InterfaceC0761e
    public final AbstractC0756S S() {
        return null;
    }

    @Override // p3.InterfaceC0761e
    public final /* bridge */ /* synthetic */ C0855k V() {
        return null;
    }

    @Override // p3.InterfaceC0761e
    public final /* bridge */ /* synthetic */ X3.n W() {
        return X3.m.f2791b;
    }

    @Override // p3.InterfaceC0761e, p3.InterfaceC0769m, p3.InterfaceC0780x
    public final C0770n b() {
        C0770n c0770n = AbstractC0771o.f8423e;
        AbstractC0219i.d("PUBLIC", c0770n);
        return c0770n;
    }

    @Override // p3.InterfaceC0761e
    public final boolean f0() {
        return false;
    }

    @Override // p3.InterfaceC0780x
    public final boolean h0() {
        return false;
    }

    @Override // p3.InterfaceC0761e, p3.InterfaceC0780x
    public final int i() {
        return 4;
    }

    @Override // p3.InterfaceC0761e
    public final boolean j() {
        return false;
    }

    @Override // p3.InterfaceC0761e
    public final /* bridge */ /* synthetic */ Collection k() {
        return u.f2163d;
    }

    @Override // p3.InterfaceC0766j
    public final InterfaceC0766j l() {
        return this.f8174i;
    }

    @Override // p3.InterfaceC0767k
    public final InterfaceC0752N n() {
        return InterfaceC0752N.f8400b;
    }

    @Override // p3.InterfaceC0761e, p3.InterfaceC0764h
    public final List r() {
        return this.n;
    }

    @Override // q3.InterfaceC0791a
    public final InterfaceC0798h s() {
        return C0797g.f8481a;
    }

    public final String toString() {
        String strB = getName().b();
        AbstractC0219i.d("name.asString()", strB);
        return strB;
    }

    @Override // p3.InterfaceC0761e
    public final boolean v() {
        return false;
    }

    @Override // s3.AbstractC0825A
    public final X3.n x(f4.f fVar) {
        return this.f8178m;
    }

    @Override // p3.InterfaceC0780x
    public final boolean z() {
        return false;
    }

    @Override // p3.InterfaceC0761e
    public final /* bridge */ /* synthetic */ Collection z0() {
        return u.f2163d;
    }
}
