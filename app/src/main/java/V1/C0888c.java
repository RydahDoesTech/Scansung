package v1;

import android.animation.TimeInterpolator;

/* renamed from: v1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0888c {

    /* renamed from: a, reason: collision with root package name */
    public long f9223a;

    /* renamed from: b, reason: collision with root package name */
    public long f9224b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f9225c;

    /* renamed from: d, reason: collision with root package name */
    public int f9226d;

    /* renamed from: e, reason: collision with root package name */
    public int f9227e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f9225c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0886a.f9218b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0888c)) {
            return false;
        }
        C0888c c0888c = (C0888c) obj;
        if (this.f9223a == c0888c.f9223a && this.f9224b == c0888c.f9224b && this.f9226d == c0888c.f9226d && this.f9227e == c0888c.f9227e) {
            return a().getClass().equals(c0888c.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f9223a;
        long j6 = this.f9224b;
        return ((((a().getClass().hashCode() + (((((int) (j5 ^ (j5 >>> 32))) * 31) + ((int) ((j6 >>> 32) ^ j6))) * 31)) * 31) + this.f9226d) * 31) + this.f9227e;
    }

    public final String toString() {
        return "\n" + C0888c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f9223a + " duration: " + this.f9224b + " interpolator: " + a().getClass() + " repeatCount: " + this.f9226d + " repeatMode: " + this.f9227e + "}\n";
    }
}
