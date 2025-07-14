package c4;

import I3.T;
import b3.AbstractC0219i;
import e4.AbstractC0420c;
import e4.AbstractC0442z;
import e4.J;
import e4.V;
import e4.X;
import java.util.List;
import p3.C0770n;
import p3.InterfaceC0752N;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import p3.InterfaceC0764h;
import p3.InterfaceC0766j;
import p3.InterfaceC0767k;
import p3.InterfaceC0768l;
import q3.InterfaceC0798h;
import s3.AbstractC0860p;
import s3.C0848d;
import s3.C0849e;

/* loaded from: classes.dex */
public final class s extends AbstractC0860p implements k, InterfaceC0764h {

    /* renamed from: h, reason: collision with root package name */
    public final C0770n f5206h;

    /* renamed from: i, reason: collision with root package name */
    public List f5207i;

    /* renamed from: j, reason: collision with root package name */
    public final C0849e f5208j;

    /* renamed from: k, reason: collision with root package name */
    public final d4.o f5209k;

    /* renamed from: l, reason: collision with root package name */
    public final T f5210l;

    /* renamed from: m, reason: collision with root package name */
    public final K3.f f5211m;
    public final K3.g n;

    /* renamed from: o, reason: collision with root package name */
    public final K3.h f5212o;

    /* renamed from: p, reason: collision with root package name */
    public final G3.h f5213p;

    /* renamed from: q, reason: collision with root package name */
    public AbstractC0442z f5214q;

    /* renamed from: r, reason: collision with root package name */
    public AbstractC0442z f5215r;

    /* renamed from: s, reason: collision with root package name */
    public List f5216s;

    /* renamed from: t, reason: collision with root package name */
    public AbstractC0442z f5217t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(d4.o oVar, InterfaceC0766j interfaceC0766j, InterfaceC0798h interfaceC0798h, N3.f fVar, C0770n c0770n, T t4, K3.f fVar2, K3.g gVar, K3.h hVar, G3.h hVar2) {
        super(interfaceC0766j, interfaceC0798h, fVar, InterfaceC0752N.f8400b);
        AbstractC0219i.e("storageManager", oVar);
        AbstractC0219i.e("containingDeclaration", interfaceC0766j);
        AbstractC0219i.e("visibility", c0770n);
        AbstractC0219i.e("proto", t4);
        AbstractC0219i.e("nameResolver", fVar2);
        AbstractC0219i.e("typeTable", gVar);
        AbstractC0219i.e("versionRequirementTable", hVar);
        this.f5206h = c0770n;
        this.f5208j = new C0849e(this);
        this.f5209k = oVar;
        this.f5210l = t4;
        this.f5211m = fVar2;
        this.n = gVar;
        this.f5212o = hVar;
        this.f5213p = hVar2;
    }

    @Override // p3.InterfaceC0764h
    public final boolean A() {
        return X.c(Q0(), new C0848d(this, 1), null);
    }

    @Override // c4.k
    public final K3.f A0() {
        throw null;
    }

    @Override // p3.InterfaceC0780x
    public final boolean E() {
        return false;
    }

    @Override // p3.InterfaceC0763g
    public final J I() {
        return this.f5208j;
    }

    @Override // s3.AbstractC0860p
    /* renamed from: N0 */
    public final InterfaceC0767k a() {
        return this;
    }

    public final InterfaceC0761e O0() {
        if (AbstractC0420c.i(P0())) {
            return null;
        }
        InterfaceC0763g interfaceC0763gI = P0().I0().i();
        if (interfaceC0763gI instanceof InterfaceC0761e) {
            return (InterfaceC0761e) interfaceC0763gI;
        }
        return null;
    }

    public final AbstractC0442z P0() {
        AbstractC0442z abstractC0442z = this.f5215r;
        if (abstractC0442z != null) {
            return abstractC0442z;
        }
        AbstractC0219i.g("expandedType");
        throw null;
    }

    public final AbstractC0442z Q0() {
        AbstractC0442z abstractC0442z = this.f5214q;
        if (abstractC0442z != null) {
            return abstractC0442z;
        }
        AbstractC0219i.g("underlyingType");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R0(java.util.List r32, e4.AbstractC0442z r33, e4.AbstractC0442z r34) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.s.R0(java.util.List, e4.z, e4.z):void");
    }

    @Override // p3.InterfaceC0766j
    public final Object U(InterfaceC0768l interfaceC0768l, Object obj) {
        return interfaceC0768l.K(this, obj);
    }

    @Override // c4.k
    public final K3.g Y() {
        throw null;
    }

    @Override // s3.AbstractC0860p, s3.AbstractC0859o, p3.InterfaceC0766j, p3.InterfaceC0763g
    public final InterfaceC0763g a() {
        return this;
    }

    @Override // p3.InterfaceC0780x
    public final C0770n b() {
        return this.f5206h;
    }

    @Override // p3.InterfaceC0754P
    public final InterfaceC0767k c(V v2) {
        AbstractC0219i.e("substitutor", v2);
        if (v2.f6668a.e()) {
            return this;
        }
        InterfaceC0766j interfaceC0766jL = l();
        AbstractC0219i.d("containingDeclaration", interfaceC0766jL);
        InterfaceC0798h interfaceC0798hS = s();
        AbstractC0219i.d("annotations", interfaceC0798hS);
        N3.f name = getName();
        AbstractC0219i.d("name", name);
        s sVar = new s(this.f5209k, interfaceC0766jL, interfaceC0798hS, name, this.f5206h, this.f5210l, this.f5211m, this.n, this.f5212o, this.f5213p);
        sVar.R0(r(), AbstractC0420c.b(v2.g(1, Q0())), AbstractC0420c.b(v2.g(1, P0())));
        return sVar;
    }

    @Override // p3.InterfaceC0780x
    public final boolean h0() {
        return false;
    }

    @Override // p3.InterfaceC0763g
    public final AbstractC0442z q() {
        AbstractC0442z abstractC0442z = this.f5217t;
        if (abstractC0442z != null) {
            return abstractC0442z;
        }
        AbstractC0219i.g("defaultTypeImpl");
        throw null;
    }

    @Override // p3.InterfaceC0764h
    public final List r() {
        List list = this.f5207i;
        if (list != null) {
            return list;
        }
        AbstractC0219i.g("declaredTypeParametersImpl");
        throw null;
    }

    @Override // s3.AbstractC0859o
    public final String toString() {
        return "typealias " + getName().b();
    }

    @Override // c4.k
    public final j y() {
        return this.f5213p;
    }

    @Override // p3.InterfaceC0780x
    public final boolean z() {
        return false;
    }

    @Override // s3.AbstractC0860p, s3.AbstractC0859o, p3.InterfaceC0766j, p3.InterfaceC0763g
    public final InterfaceC0766j a() {
        return this;
    }
}
