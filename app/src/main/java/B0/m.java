package B0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m extends u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f139b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f140c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f142e;

    public m(o oVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f142e = oVar;
        this.f138a = obj;
        this.f139b = arrayList;
        this.f140c = obj2;
        this.f141d = arrayList2;
    }

    @Override // B0.u, B0.s
    public final void b(t tVar) {
        o oVar = this.f142e;
        Object obj = this.f138a;
        if (obj != null) {
            oVar.s(obj, this.f139b, null);
        }
        Object obj2 = this.f140c;
        if (obj2 != null) {
            oVar.s(obj2, this.f141d, null);
        }
    }

    @Override // B0.s
    public final void d(t tVar) {
        tVar.w(this);
    }
}
