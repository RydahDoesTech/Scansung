package s3;

import a3.InterfaceC0106a;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: s3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0851g implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8817e;

    public /* synthetic */ C0851g(int i5, Object obj) {
        this.f8816d = i5;
        this.f8817e = obj;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        switch (this.f8816d) {
            case 0:
                StringBuilder sb = new StringBuilder("Scope for type parameter ");
                C0852h c0852h = (C0852h) this.f8817e;
                sb.append(((N3.f) c0852h.f8819e).b());
                return Y0.j.p(sb.toString(), ((AbstractC0854j) c0852h.f).getUpperBounds());
            case 1:
                C0862r c0862r = (C0862r) this.f8817e;
                c0862r.getClass();
                HashSet hashSet = new HashSet();
                for (N3.f fVar : (Set) c0862r.f8845e.f8848l.a()) {
                    if (fVar == null) {
                        C0862r.h(5);
                        throw null;
                    }
                    hashSet.addAll((Collection) c0862r.f8842b.d(fVar));
                    hashSet.addAll((Collection) c0862r.f8843c.d(fVar));
                }
                return hashSet;
            default:
                return (List) this.f8817e;
        }
    }
}
