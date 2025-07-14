package b3;

import g3.InterfaceC0452b;
import g3.InterfaceC0466p;

/* loaded from: classes.dex */
public abstract class o extends AbstractC0212b implements InterfaceC0466p {

    /* renamed from: j, reason: collision with root package name */
    public final boolean f5097j;

    public o(Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, (i5 & 1) == 1);
        this.f5097j = (i5 & 2) == 2;
    }

    @Override // b3.AbstractC0212b
    public final InterfaceC0452b b() {
        return this.f5097j ? this : super.b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return j().equals(oVar.j()) && this.f5088g.equals(oVar.f5088g) && this.f5089h.equals(oVar.f5089h) && AbstractC0219i.a(this.f5087e, oVar.f5087e);
        }
        if (obj instanceof InterfaceC0466p) {
            return obj.equals(b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f5089h.hashCode() + ((this.f5088g.hashCode() + (j().hashCode() * 31)) * 31);
    }

    @Override // b3.AbstractC0212b
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0466p k() {
        if (this.f5097j) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        InterfaceC0452b interfaceC0452bB = b();
        if (interfaceC0452bB != this) {
            return (InterfaceC0466p) interfaceC0452bB;
        }
        throw new O2.e();
    }

    public final String toString() {
        InterfaceC0452b interfaceC0452bB = b();
        return interfaceC0452bB != this ? interfaceC0452bB.toString() : A3.f.p(new StringBuilder("property "), this.f5088g, " (Kotlin reflection is not available)");
    }
}
