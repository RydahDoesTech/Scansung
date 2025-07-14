package a4;

import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3067a;

    /* renamed from: b, reason: collision with root package name */
    public final M3.f f3068b;

    /* renamed from: c, reason: collision with root package name */
    public final M3.f f3069c;

    /* renamed from: d, reason: collision with root package name */
    public final M3.f f3070d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3071e;
    public final N3.b f;

    public n(Object obj, M3.f fVar, M3.f fVar2, M3.f fVar3, String str, N3.b bVar) {
        AbstractC0219i.e("filePath", str);
        this.f3067a = obj;
        this.f3068b = fVar;
        this.f3069c = fVar2;
        this.f3070d = fVar3;
        this.f3071e = str;
        this.f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f3067a.equals(nVar.f3067a) && AbstractC0219i.a(this.f3068b, nVar.f3068b) && AbstractC0219i.a(this.f3069c, nVar.f3069c) && this.f3070d.equals(nVar.f3070d) && AbstractC0219i.a(this.f3071e, nVar.f3071e) && this.f.equals(nVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f3067a.hashCode() * 31;
        M3.f fVar = this.f3068b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        M3.f fVar2 = this.f3069c;
        return this.f.hashCode() + ((this.f3071e.hashCode() + ((this.f3070d.hashCode() + ((iHashCode2 + (fVar2 != null ? fVar2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f3067a + ", compilerVersion=" + this.f3068b + ", languageVersion=" + this.f3069c + ", expectedVersion=" + this.f3070d + ", filePath=" + this.f3071e + ", classId=" + this.f + ')';
    }
}
