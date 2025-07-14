package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0140c {

    /* renamed from: a, reason: collision with root package name */
    public final int f4011a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f4012b;

    public C0140c(int i5, Method method) throws SecurityException {
        this.f4011a = i5;
        this.f4012b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0140c)) {
            return false;
        }
        C0140c c0140c = (C0140c) obj;
        return this.f4011a == c0140c.f4011a && this.f4012b.getName().equals(c0140c.f4012b.getName());
    }

    public final int hashCode() {
        return this.f4012b.getName().hashCode() + (this.f4011a * 31);
    }
}
