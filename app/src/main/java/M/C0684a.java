package m;

import java.util.HashMap;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0684a extends f {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f8025h = new HashMap();

    @Override // m.f
    public final c l(Object obj) {
        return (c) this.f8025h.get(obj);
    }

    @Override // m.f
    public final Object m(Object obj, Object obj2) {
        c cVarL = l(obj);
        if (cVarL != null) {
            return cVarL.f8029e;
        }
        HashMap map = this.f8025h;
        c cVar = new c(obj, obj2);
        this.f8035g++;
        c cVar2 = this.f8034e;
        if (cVar2 == null) {
            this.f8033d = cVar;
            this.f8034e = cVar;
        } else {
            cVar2.f = cVar;
            cVar.f8030g = cVar2;
            this.f8034e = cVar;
        }
        map.put(obj, cVar);
        return null;
    }

    @Override // m.f
    public final Object n(Object obj) {
        Object objN = super.n(obj);
        this.f8025h.remove(obj);
        return objN;
    }
}
