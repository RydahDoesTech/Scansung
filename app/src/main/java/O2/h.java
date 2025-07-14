package O2;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class h implements c, Serializable {
    public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "e");

    /* renamed from: d, reason: collision with root package name */
    public volatile b3.k f2009d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f2010e;

    /* JADX WARN: Type inference failed for: r0v1, types: [a3.a, b3.k] */
    @Override // O2.c
    public final Object getValue() {
        Object obj = this.f2010e;
        k kVar = k.f2015a;
        if (obj != kVar) {
            return obj;
        }
        ?? r02 = this.f2009d;
        if (r02 != 0) {
            Object objA = r02.a();
            if (f.compareAndSet(this, kVar, objA)) {
                this.f2009d = null;
                return objA;
            }
        }
        return this.f2010e;
    }

    public final String toString() {
        return this.f2010e != k.f2015a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
