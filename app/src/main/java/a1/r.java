package a1;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class r extends l {

    /* renamed from: a, reason: collision with root package name */
    public final E0.d f2976a;

    /* renamed from: b, reason: collision with root package name */
    public final t1.i f2977b;

    /* renamed from: c, reason: collision with root package name */
    public final O1.e f2978c;

    public r(E0.d dVar, t1.i iVar, O1.e eVar) {
        this.f2977b = iVar;
        this.f2976a = dVar;
        this.f2978c = eVar;
    }

    @Override // a1.l
    public final void a(E0.d dVar, boolean z4) {
        Boolean boolValueOf = Boolean.valueOf(z4);
        Map map = (Map) dVar.f;
        t1.i iVar = this.f2977b;
        map.put(iVar, boolValueOf);
        E0.d dVar2 = new E0.d(dVar, iVar, 20, false);
        t1.n nVar = iVar.f8959a;
        nVar.getClass();
        nVar.a(t1.j.f8960a, dVar2);
    }

    @Override // a1.l
    public final void b(Status status) {
        Exception bVar;
        switch (this.f2978c.f1915d) {
            case 6:
                String strB = status.f;
                int i5 = status.f5238e;
                if (i5 != 8) {
                    if (strB == null) {
                        strB = J2.b.B(i5);
                    }
                    bVar = new V1.b(strB);
                    break;
                } else {
                    if (strB == null) {
                        strB = J2.b.B(i5);
                    }
                    bVar = new V1.h(strB);
                    break;
                }
            default:
                if (status.f5239g == null) {
                    bVar = new V1.h(status);
                    break;
                } else {
                    bVar = new Z0.g(status);
                    break;
                }
        }
        this.f2977b.c(bVar);
    }

    @Override // a1.l
    public final void c(RuntimeException runtimeException) {
        this.f2977b.c(runtimeException);
    }

    @Override // a1.l
    public final Y0.c[] d(C0096d c0096d) {
        return (Y0.c[]) this.f2976a.f520e;
    }

    @Override // a1.l
    public final boolean f(C0096d c0096d) {
        this.f2976a.getClass();
        return true;
    }

    @Override // a1.l
    public final void g(C0096d c0096d) throws DeadObjectException {
        try {
            E0.d dVar = this.f2976a;
            ((k) ((E0.d) dVar.f).f520e).accept(c0096d.f2934b, this.f2977b);
        } catch (DeadObjectException e5) {
            throw e5;
        } catch (RemoteException e6) {
            b(l.e(e6));
        } catch (RuntimeException e7) {
            c(e7);
        }
    }
}
