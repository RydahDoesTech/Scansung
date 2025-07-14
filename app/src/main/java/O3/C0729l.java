package o3;

import P2.u;
import P2.z;
import S3.v;
import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import g3.y;
import java.util.List;
import m3.AbstractC0695h;
import q3.AbstractC0795e;
import q3.C0797g;
import q3.C0799i;
import q3.C0800j;
import s3.C0826B;

/* renamed from: o3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0729l extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0730m f8278e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0729l(C0730m c0730m, int i5) {
        super(0);
        this.f8277d = i5;
        this.f8278e = c0730m;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        C0730m c0730m = this.f8278e;
        switch (this.f8277d) {
            case 0:
                return c0730m.f8280a.f8732g.e();
            default:
                C0826B c0826b = c0730m.f8280a;
                N3.f fVar = AbstractC0795e.f8476a;
                AbstractC0695h abstractC0695h = c0826b.f8732g;
                AbstractC0219i.e("<this>", abstractC0695h);
                List listN = y.N(new C0800j(abstractC0695h, m3.m.f8129m, z.i0(new O2.f(AbstractC0795e.f8476a, new v("This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version")), new O2.f(AbstractC0795e.f8477b, new S3.a((Object) new C0800j(abstractC0695h, m3.m.f8130o, z.i0(new O2.f(AbstractC0795e.f8479d, new v("")), new O2.f(AbstractC0795e.f8480e, new S3.b(u.f2163d, new B3.d(21, abstractC0695h))))))), new O2.f(AbstractC0795e.f8478c, new S3.i(N3.b.j(m3.m.n), N3.f.e("WARNING"))))));
                return listN.isEmpty() ? C0797g.f8481a : new C0799i(0, listN);
        }
    }
}
