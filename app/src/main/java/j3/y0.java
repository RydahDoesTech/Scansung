package j3;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f7457a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7458b;

    public y0(ClassLoader classLoader) {
        this.f7457a = new WeakReference(classLoader);
        this.f7458b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y0) && this.f7457a.get() == ((y0) obj).f7457a.get();
    }

    public final int hashCode() {
        return this.f7458b;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f7457a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
