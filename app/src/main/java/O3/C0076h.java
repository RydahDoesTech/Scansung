package O3;

/* renamed from: O3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0076h {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0070b f2074a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2075b;

    public C0076h(int i5, AbstractC0070b abstractC0070b) {
        this.f2074a = abstractC0070b;
        this.f2075b = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0076h)) {
            return false;
        }
        C0076h c0076h = (C0076h) obj;
        return this.f2074a == c0076h.f2074a && this.f2075b == c0076h.f2075b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f2074a) * 65535) + this.f2075b;
    }
}
