package o3;

import P2.w;
import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import b3.q;
import b3.r;
import g3.InterfaceC0466p;
import java.util.Collection;
import p3.InterfaceC0761e;
import r3.InterfaceC0817c;
import s3.C0826B;
import s3.C0857m;

/* renamed from: o3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0724g implements InterfaceC0817c {

    /* renamed from: d, reason: collision with root package name */
    public static final C0722e f8262d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0466p[] f8263e;
    public static final N3.c f;

    /* renamed from: g, reason: collision with root package name */
    public static final N3.f f8264g;

    /* renamed from: h, reason: collision with root package name */
    public static final N3.b f8265h;

    /* renamed from: a, reason: collision with root package name */
    public final C0826B f8266a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0107b f8267b;

    /* renamed from: c, reason: collision with root package name */
    public final d4.i f8268c;

    static {
        r rVar = q.f5100a;
        f8263e = new InterfaceC0466p[]{rVar.e(new b3.n(rVar.b(C0724g.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
        f8262d = new C0722e();
        f = m3.n.f8150j;
        N3.e eVar = m3.m.f8119c;
        N3.f fVarF = eVar.f();
        AbstractC0219i.d("cloneable.shortName()", fVarF);
        f8264g = fVarF;
        f8265h = N3.b.j(eVar.g());
    }

    public C0724g(d4.l lVar, C0826B c0826b) {
        C0723f c0723f = C0723f.f8261d;
        this.f8266a = c0826b;
        this.f8267b = c0723f;
        this.f8268c = new d4.i(lVar, new B3.a(this, 11, lVar));
    }

    @Override // r3.InterfaceC0817c
    public final boolean a(N3.c cVar, N3.f fVar) {
        AbstractC0219i.e("packageFqName", cVar);
        AbstractC0219i.e("name", fVar);
        return fVar.equals(f8264g) && cVar.equals(f);
    }

    @Override // r3.InterfaceC0817c
    public final InterfaceC0761e b(N3.b bVar) {
        AbstractC0219i.e("classId", bVar);
        if (bVar.equals(f8265h)) {
            return (C0857m) V1.a.Q(this.f8268c, f8263e[0]);
        }
        return null;
    }

    @Override // r3.InterfaceC0817c
    public final Collection c(N3.c cVar) {
        AbstractC0219i.e("packageFqName", cVar);
        return cVar.equals(f) ? V1.a.l0((C0857m) V1.a.Q(this.f8268c, f8263e[0])) : w.f2165d;
    }
}
