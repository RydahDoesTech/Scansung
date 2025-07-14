package androidx.room;

import F3.p;
import java.lang.ref.WeakReference;
import java.util.Set;
import y0.C0923e;

/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: a, reason: collision with root package name */
    public final g f4893a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f4894b;

    public f(g gVar, d dVar) {
        super(dVar.mTables);
        this.f4893a = gVar;
        this.f4894b = new WeakReference(dVar);
    }

    @Override // androidx.room.d
    public final void onInvalidated(Set set) {
        e eVar;
        boolean z4;
        d dVar = (d) this.f4894b.get();
        if (dVar != null) {
            dVar.onInvalidated(set);
            return;
        }
        g gVar = this.f4893a;
        synchronized (gVar.f4905k) {
            eVar = (e) gVar.f4905k.n(this);
        }
        if (eVar != null) {
            p pVar = gVar.f4904j;
            int[] iArr = eVar.f4888a;
            synchronized (pVar) {
                try {
                    z4 = false;
                    for (int i5 : iArr) {
                        long[] jArr = (long[]) pVar.f667c;
                        long j5 = jArr[i5];
                        jArr[i5] = j5 - 1;
                        if (j5 == 1) {
                            z4 = true;
                            pVar.f665a = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z4) {
                j jVar = gVar.f;
                if (jVar.isOpen()) {
                    gVar.d(((C0923e) jVar.getOpenHelper()).f9355a.h());
                }
            }
        }
    }
}
