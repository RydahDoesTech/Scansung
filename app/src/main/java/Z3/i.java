package z3;

import P2.v;
import P2.z;
import a3.InterfaceC0106a;
import g3.y;
import java.util.Map;
import m3.m;
import q3.EnumC0803m;
import v3.t;

/* loaded from: classes.dex */
public final class i extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f9500e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(b bVar, int i5) {
        super(0);
        this.f9499d = i5;
        this.f9500e = bVar;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
    @Override // a3.InterfaceC0106a
    public final Object a() {
        Map mapH0;
        EnumC0803m enumC0803m;
        S3.b bVarA;
        v vVar = v.f2164d;
        b bVar = this.f9500e;
        switch (this.f9499d) {
            case 0:
                Object obj = e.f9492a;
                E3.a aVar = ((j) bVar).f9486d;
                t tVar = aVar instanceof t ? (t) aVar : null;
                S3.i iVar = (tVar == null || (enumC0803m = (EnumC0803m) e.f9493b.get(N3.f.e(tVar.f9263b.name()).b())) == null) ? null : new S3.i(N3.b.j(m.f8137v), N3.f.e(enumC0803m.name()));
                mapH0 = iVar != null ? z.h0(new O2.f(c.f9489c, iVar)) : null;
                if (mapH0 != null) {
                    break;
                }
                break;
            default:
                E3.a aVar2 = ((k) bVar).f9486d;
                if (aVar2 instanceof v3.h) {
                    Object obj2 = e.f9492a;
                    bVarA = e.a(((v3.h) aVar2).a());
                } else if (aVar2 instanceof t) {
                    Object obj3 = e.f9492a;
                    bVarA = e.a(y.N(aVar2));
                } else {
                    bVarA = null;
                }
                mapH0 = bVarA != null ? z.h0(new O2.f(c.f9488b, bVarA)) : null;
                if (mapH0 != null) {
                    break;
                }
                break;
        }
        return mapH0;
    }
}
