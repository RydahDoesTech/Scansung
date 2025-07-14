package p;

/* loaded from: classes.dex */
public final class e extends V1.a {
    @Override // V1.a
    public final boolean d(g gVar, C0735c c0735c) {
        C0735c c0735c2 = C0735c.f8328b;
        synchronized (gVar) {
            try {
                if (gVar.f8342b != c0735c) {
                    return false;
                }
                gVar.f8342b = c0735c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // V1.a
    public final boolean e(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f8341a != obj) {
                    return false;
                }
                gVar.f8341a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // V1.a
    public final boolean f(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f8343c != fVar) {
                    return false;
                }
                gVar.f8343c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // V1.a
    public final void g0(f fVar, f fVar2) {
        fVar.f8337b = fVar2;
    }

    @Override // V1.a
    public final void h0(f fVar, Thread thread) {
        fVar.f8336a = thread;
    }
}
