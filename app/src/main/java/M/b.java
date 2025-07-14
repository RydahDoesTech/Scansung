package m;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public c f8026d;

    /* renamed from: e, reason: collision with root package name */
    public c f8027e;
    public final /* synthetic */ int f;

    public b(c cVar, c cVar2, int i5) {
        this.f = i5;
        this.f8026d = cVar2;
        this.f8027e = cVar;
    }

    @Override // m.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f8026d == cVar && cVar == this.f8027e) {
            this.f8027e = null;
            this.f8026d = null;
        }
        c cVar3 = this.f8026d;
        if (cVar3 == cVar) {
            switch (this.f) {
                case 0:
                    cVar2 = cVar3.f8030g;
                    break;
                default:
                    cVar2 = cVar3.f;
                    break;
            }
            this.f8026d = cVar2;
        }
        c cVar4 = this.f8027e;
        if (cVar4 == cVar) {
            c cVar5 = this.f8026d;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f8027e = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.f) {
            case 0:
                return cVar.f;
            default:
                return cVar.f8030g;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8027e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f8027e;
        c cVar2 = this.f8026d;
        this.f8027e = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
