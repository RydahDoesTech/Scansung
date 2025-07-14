package r;

/* loaded from: classes.dex */
public final class d implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public f f8545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f8546e;

    public d(e eVar) {
        this.f8546e = eVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f8545d.f8551b - ((f) obj).f8551b;
    }

    public final String toString() {
        String str = "[ ";
        if (this.f8545d != null) {
            for (int i5 = 0; i5 < 9; i5++) {
                str = str + this.f8545d.f8556h[i5] + " ";
            }
        }
        return str + "] " + this.f8545d;
    }
}
