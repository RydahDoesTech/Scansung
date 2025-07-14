package m;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public c f8031d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8032e = true;
    public final /* synthetic */ f f;

    public d(f fVar) {
        this.f = fVar;
    }

    @Override // m.e
    public final void a(c cVar) {
        c cVar2 = this.f8031d;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f8030g;
            this.f8031d = cVar3;
            this.f8032e = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8032e) {
            return this.f.f8033d != null;
        }
        c cVar = this.f8031d;
        return (cVar == null || cVar.f == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f8032e) {
            this.f8032e = false;
            this.f8031d = this.f.f8033d;
        } else {
            c cVar = this.f8031d;
            this.f8031d = cVar != null ? cVar.f : null;
        }
        return this.f8031d;
    }
}
