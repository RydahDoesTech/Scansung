package k4;

import e4.C0425h;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q extends a {

    /* renamed from: d, reason: collision with root package name */
    public final C0425h f7972d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7973e;

    public q(int i5, C0425h c0425h) {
        this.f7972d = c0425h;
        this.f7973e = i5;
    }

    @Override // k4.a
    public final Object get(int i5) {
        if (i5 == this.f7973e) {
            return this.f7972d;
        }
        return null;
    }

    @Override // k4.a, java.lang.Iterable
    public final Iterator iterator() {
        return new p(0, this);
    }

    @Override // k4.a
    public final int l() {
        return 1;
    }

    @Override // k4.a
    public final void m(int i5, C0425h c0425h) {
        throw new IllegalStateException();
    }
}
