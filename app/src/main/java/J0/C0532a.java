package j0;

import androidx.preference.Preference;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0532a {

    /* renamed from: a, reason: collision with root package name */
    public int f7112a;

    /* renamed from: b, reason: collision with root package name */
    public int f7113b;

    /* renamed from: c, reason: collision with root package name */
    public Preference f7114c;

    /* renamed from: d, reason: collision with root package name */
    public int f7115d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0532a)) {
            return false;
        }
        C0532a c0532a = (C0532a) obj;
        int i5 = this.f7112a;
        if (i5 != c0532a.f7112a) {
            return false;
        }
        if (i5 == 8 && Math.abs(this.f7115d - this.f7113b) == 1 && this.f7115d == c0532a.f7113b && this.f7113b == c0532a.f7115d) {
            return true;
        }
        if (this.f7115d != c0532a.f7115d || this.f7113b != c0532a.f7113b) {
            return false;
        }
        Preference preference = this.f7114c;
        if (preference != null) {
            if (!preference.equals(c0532a.f7114c)) {
                return false;
            }
        } else if (c0532a.f7114c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f7112a * 31) + this.f7113b) * 31) + this.f7115d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i5 = this.f7112a;
        sb.append(i5 != 1 ? i5 != 2 ? i5 != 4 ? i5 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f7113b);
        sb.append("c:");
        sb.append(this.f7115d);
        sb.append(",p:");
        sb.append(this.f7114c);
        sb.append("]");
        return sb.toString();
    }
}
