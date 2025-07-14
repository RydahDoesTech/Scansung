package b1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import b0.C0198c;

/* loaded from: classes.dex */
public final class h extends AbstractC0207c {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f5018g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f5019h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, int i5, IBinder iBinder, Bundle bundle) {
        super(kVar, i5, bundle);
        this.f5019h = kVar;
        this.f5018g = iBinder;
    }

    @Override // b1.AbstractC0207c
    public final void b(Y0.a aVar) {
        C0198c c0198c = this.f5019h.n;
        if (c0198c != null) {
            ((Z0.e) c0198c.f5001d).f(aVar);
        }
        System.currentTimeMillis();
    }

    @Override // b1.AbstractC0207c
    public final boolean c() throws RemoteException {
        IBinder iBinder = this.f5018g;
        try {
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            k kVar = this.f5019h;
            if (!kVar.i().equals(interfaceDescriptor)) {
                String strI = kVar.i();
                StringBuilder sb = new StringBuilder(String.valueOf(interfaceDescriptor).length() + strI.length() + 34);
                sb.append("service descriptor mismatch: ");
                sb.append(strI);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.e("GmsClient", sb.toString());
                return false;
            }
            IInterface iInterfaceC = kVar.c(iBinder);
            if (iInterfaceC == null || !(k.n(kVar, 2, 4, iInterfaceC) || k.n(kVar, 3, 4, iInterfaceC))) {
                return false;
            }
            kVar.f5046q = null;
            C0198c c0198c = kVar.f5043m;
            if (c0198c == null) {
                return true;
            }
            ((Z0.d) c0198c.f5001d).p();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
