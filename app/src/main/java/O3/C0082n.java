package O3;

/* renamed from: O3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0082n implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f2084d;

    /* renamed from: e, reason: collision with root package name */
    public final Q f2085e;
    public final boolean f;

    public C0082n(int i5, Q q5, boolean z4) {
        this.f2084d = i5;
        this.f2085e = q5;
        this.f = z4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2084d - ((C0082n) obj).f2084d;
    }
}
