package p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends V1.a {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8330a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8331b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8332c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8333d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8334e;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f8330a = atomicReferenceFieldUpdater;
        this.f8331b = atomicReferenceFieldUpdater2;
        this.f8332c = atomicReferenceFieldUpdater3;
        this.f8333d = atomicReferenceFieldUpdater4;
        this.f8334e = atomicReferenceFieldUpdater5;
    }

    @Override // V1.a
    public final boolean d(g gVar, C0735c c0735c) {
        return this.f8333d.compareAndSet(gVar, c0735c, C0735c.f8328b);
    }

    @Override // V1.a
    public final boolean e(g gVar, Object obj, Object obj2) {
        return this.f8334e.compareAndSet(gVar, obj, obj2);
    }

    @Override // V1.a
    public final boolean f(g gVar, f fVar, f fVar2) {
        return this.f8332c.compareAndSet(gVar, fVar, fVar2);
    }

    @Override // V1.a
    public final void g0(f fVar, f fVar2) {
        this.f8331b.lazySet(fVar, fVar2);
    }

    @Override // V1.a
    public final void h0(f fVar, Thread thread) {
        this.f8330a.lazySet(fVar, thread);
    }
}
