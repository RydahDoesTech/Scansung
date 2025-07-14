package a1;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class s extends l {

    /* renamed from: a, reason: collision with root package name */
    public final t1.i f2979a;

    public s(t1.i iVar) {
        this.f2979a = iVar;
    }

    @Override // a1.l
    public final /* bridge */ /* synthetic */ void a(E0.d dVar, boolean z4) {
    }

    @Override // a1.l
    public final void b(Status status) {
        this.f2979a.c(new V1.h(status));
    }

    @Override // a1.l
    public final void c(RuntimeException runtimeException) {
        this.f2979a.c(runtimeException);
    }

    @Override // a1.l
    public final Y0.c[] d(C0096d c0096d) {
        if (c0096d.f.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // a1.l
    public final boolean f(C0096d c0096d) {
        if (c0096d.f.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // a1.l
    public final void g(C0096d c0096d) throws DeadObjectException {
        try {
            h(c0096d);
        } catch (DeadObjectException e5) {
            b(l.e(e5));
            throw e5;
        } catch (RemoteException e6) {
            b(l.e(e6));
        } catch (RuntimeException e7) {
            c(e7);
        }
    }

    public final void h(C0096d c0096d) {
        if (c0096d.f.remove(null) != null) {
            throw new ClassCastException();
        }
        this.f2979a.d(Boolean.FALSE);
    }
}
