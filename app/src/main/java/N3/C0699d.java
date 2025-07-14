package n3;

/* renamed from: n3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0699d {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0700e f8179a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8180b;

    public C0699d(EnumC0700e enumC0700e, int i5) {
        this.f8179a = enumC0700e;
        this.f8180b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0699d)) {
            return false;
        }
        C0699d c0699d = (C0699d) obj;
        return this.f8179a == c0699d.f8179a && this.f8180b == c0699d.f8180b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8180b) + (this.f8179a.hashCode() * 31);
    }

    public final String toString() {
        return "KindWithArity(kind=" + this.f8179a + ", arity=" + this.f8180b + ')';
    }
}
