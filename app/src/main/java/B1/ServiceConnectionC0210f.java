package b1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: b1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC0210f implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f5015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f5016b;

    public ServiceConnectionC0210f(k kVar, int i5) {
        this.f5016b = kVar;
        this.f5015a = i5;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z4;
        int i5;
        if (iBinder == null) {
            k kVar = this.f5016b;
            synchronized (kVar.f5036e) {
                z4 = kVar.f5042l == 3;
            }
            if (z4) {
                kVar.f5047r = true;
                i5 = 5;
            } else {
                i5 = 4;
            }
            HandlerC0208d handlerC0208d = kVar.f5035d;
            handlerC0208d.sendMessage(handlerC0208d.obtainMessage(i5, kVar.f5049t.get(), 16));
            return;
        }
        synchronized (this.f5016b.f) {
            try {
                k kVar2 = this.f5016b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                kVar2.f5037g = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof r)) ? new q(iBinder) : (r) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        k kVar3 = this.f5016b;
        int i6 = this.f5015a;
        kVar3.getClass();
        g gVar = new g(kVar3, 0);
        HandlerC0208d handlerC0208d2 = kVar3.f5035d;
        handlerC0208d2.sendMessage(handlerC0208d2.obtainMessage(7, i6, -1, gVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        k kVar;
        synchronized (this.f5016b.f) {
            kVar = this.f5016b;
            kVar.f5037g = null;
        }
        HandlerC0208d handlerC0208d = kVar.f5035d;
        handlerC0208d.sendMessage(handlerC0208d.obtainMessage(6, this.f5015a, 1));
    }
}
