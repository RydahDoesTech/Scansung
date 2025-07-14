package f3;

/* renamed from: f3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0447c extends C0445a {

    /* renamed from: g, reason: collision with root package name */
    public static final C0447c f6734g = new C0447c(1, 0, 1);

    @Override // f3.C0445a
    public final boolean equals(Object obj) {
        if (obj instanceof C0447c) {
            if (!isEmpty() || !((C0447c) obj).isEmpty()) {
                C0447c c0447c = (C0447c) obj;
                if (this.f6729d == c0447c.f6729d) {
                    if (this.f6730e == c0447c.f6730e) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // f3.C0445a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return this.f6730e + (this.f6729d * 31);
    }

    @Override // f3.C0445a
    public final boolean isEmpty() {
        return this.f6729d > this.f6730e;
    }

    public final boolean l(int i5) {
        return this.f6729d <= i5 && i5 <= this.f6730e;
    }

    @Override // f3.C0445a
    public final String toString() {
        return this.f6729d + ".." + this.f6730e;
    }
}
