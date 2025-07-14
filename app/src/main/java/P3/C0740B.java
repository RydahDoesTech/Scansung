package p3;

import b3.AbstractC0219i;
import e4.C0427j;
import f3.C0446b;
import f3.C0447c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import q3.C0797g;
import q3.InterfaceC0798h;
import s3.AbstractC0856l;
import s3.C0841Q;
import s3.C0855k;

/* renamed from: p3.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0740B extends AbstractC0856l {

    /* renamed from: j, reason: collision with root package name */
    public final boolean f8387j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f8388k;

    /* renamed from: l, reason: collision with root package name */
    public final C0427j f8389l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0740B(d4.o oVar, InterfaceC0762f interfaceC0762f, N3.f fVar, boolean z4, int i5) {
        super(oVar, interfaceC0762f, fVar, InterfaceC0752N.f8400b);
        AbstractC0219i.e("storageManager", oVar);
        AbstractC0219i.e("container", interfaceC0762f);
        this.f8387j = z4;
        C0447c c0447c = i5 <= Integer.MIN_VALUE ? C0447c.f6734g : new C0447c(0, i5 - 1, 1);
        ArrayList arrayList = new ArrayList(P2.o.l0(c0447c));
        Iterator it = c0447c.iterator();
        while (((C0446b) it).f) {
            int iA = ((C0446b) it).a();
            arrayList.add(C0841Q.R0(this, 1, N3.f.e("T" + iA), iA, oVar));
        }
        this.f8388k = arrayList;
        this.f8389l = new C0427j(this, AbstractC0779w.c(this), V1.a.l0(U3.f.j(this).g().e()), oVar);
    }

    @Override // p3.InterfaceC0764h
    public final boolean A() {
        return this.f8387j;
    }

    @Override // p3.InterfaceC0761e
    public final boolean D0() {
        return false;
    }

    @Override // s3.AbstractC0856l, p3.InterfaceC0780x
    public final boolean E() {
        return false;
    }

    @Override // p3.InterfaceC0763g
    public final e4.J I() {
        return this.f8389l;
    }

    @Override // p3.InterfaceC0761e
    public final int L() {
        return 1;
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
    public final C0855k V() {
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
        return 1;
    }

    @Override // p3.InterfaceC0761e
    public final boolean j() {
        return false;
    }

    @Override // p3.InterfaceC0761e
    public final Collection k() {
        return P2.w.f2165d;
    }

    @Override // p3.InterfaceC0761e, p3.InterfaceC0764h
    public final List r() {
        return this.f8388k;
    }

    @Override // q3.InterfaceC0791a
    public final InterfaceC0798h s() {
        return C0797g.f8481a;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // p3.InterfaceC0761e
    public final boolean v() {
        return false;
    }

    @Override // s3.AbstractC0825A
    public final X3.n x(f4.f fVar) {
        return X3.m.f2791b;
    }

    @Override // p3.InterfaceC0780x
    public final boolean z() {
        return false;
    }

    @Override // p3.InterfaceC0761e
    public final Collection z0() {
        return P2.u.f2163d;
    }
}
