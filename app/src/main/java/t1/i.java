package t1;

import b1.AbstractC0203C;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final n f8959a = new n();

    public final void a(Exception exc) {
        this.f8959a.j(exc);
    }

    public final void b(Object obj) {
        this.f8959a.k(obj);
    }

    public final boolean c(Exception exc) {
        n nVar = this.f8959a;
        nVar.getClass();
        AbstractC0203C.f("Exception must not be null", exc);
        synchronized (nVar.f8968a) {
            try {
                if (nVar.f8970c) {
                    return false;
                }
                nVar.f8970c = true;
                nVar.f = exc;
                nVar.f8969b.b(nVar);
                return true;
            } finally {
            }
        }
    }

    public final void d(Object obj) {
        n nVar = this.f8959a;
        synchronized (nVar.f8968a) {
            try {
                if (nVar.f8970c) {
                    return;
                }
                nVar.f8970c = true;
                nVar.f8972e = obj;
                nVar.f8969b.b(nVar);
            } finally {
            }
        }
    }
}
