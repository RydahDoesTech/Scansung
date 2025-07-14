package o4;

import P2.y;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements k, c {

    /* renamed from: a, reason: collision with root package name */
    public final k f8295a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8296b;

    public b(k kVar, int i5) {
        this.f8295a = kVar;
        this.f8296b = i5;
        if (i5 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i5 + '.').toString());
    }

    @Override // o4.c
    public final k a() {
        int i5 = this.f8296b + 1;
        return i5 < 0 ? new b(this, 1) : new b(this.f8295a, i5);
    }

    @Override // o4.k
    public final Iterator iterator() {
        return new y(this);
    }
}
