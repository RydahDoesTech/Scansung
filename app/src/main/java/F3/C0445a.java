package f3;

import c3.InterfaceC0226a;
import java.util.Iterator;

/* renamed from: f3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0445a implements Iterable, InterfaceC0226a {

    /* renamed from: d, reason: collision with root package name */
    public final int f6729d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6730e;
    public final int f;

    public C0445a(int i5, int i6, int i7) {
        if (i7 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i7 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f6729d = i5;
        this.f6730e = V1.a.K(i5, i6, i7);
        this.f = i7;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0445a) {
            if (!isEmpty() || !((C0445a) obj).isEmpty()) {
                C0445a c0445a = (C0445a) obj;
                if (this.f6729d != c0445a.f6729d || this.f6730e != c0445a.f6730e || this.f != c0445a.f) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return this.f + (((this.f6729d * 31) + this.f6730e) * 31);
    }

    public boolean isEmpty() {
        int i5 = this.f;
        int i6 = this.f6730e;
        int i7 = this.f6729d;
        if (i5 > 0) {
            if (i7 <= i6) {
                return false;
            }
        } else if (i7 >= i6) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0446b(this.f6729d, this.f6730e, this.f);
    }

    public String toString() {
        StringBuilder sb;
        int i5 = this.f6730e;
        int i6 = this.f6729d;
        int i7 = this.f;
        if (i7 > 0) {
            sb = new StringBuilder();
            sb.append(i6);
            sb.append("..");
            sb.append(i5);
            sb.append(" step ");
        } else {
            sb = new StringBuilder();
            sb.append(i6);
            sb.append(" downTo ");
            sb.append(i5);
            sb.append(" step ");
            i7 = -i7;
        }
        sb.append(i7);
        return sb.toString();
    }
}
