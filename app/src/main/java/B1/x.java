package b1;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.R1;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class x implements Handler.Callback {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f5071g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static x f5072h;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5074b;

    /* renamed from: c, reason: collision with root package name */
    public final R1 f5075c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5073a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final f1.a f5076d = f1.a.a();

    /* renamed from: e, reason: collision with root package name */
    public final long f5077e = 5000;
    public final long f = 300000;

    public x(Context context) {
        this.f5074b = context.getApplicationContext();
        this.f5075c = new R1(context.getMainLooper(), this);
    }

    public final void a(String str, String str2, ServiceConnection serviceConnection) {
        l lVar = new l(str, str2);
        AbstractC0203C.f("ServiceConnection must not be null", serviceConnection);
        synchronized (this.f5073a) {
            try {
                z zVar = (z) this.f5073a.get(lVar);
                if (zVar == null) {
                    String strValueOf = String.valueOf(lVar);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(strValueOf);
                    throw new IllegalStateException(sb.toString());
                }
                if (!zVar.f5079a.containsKey(serviceConnection)) {
                    String strValueOf2 = String.valueOf(lVar);
                    StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(strValueOf2);
                    throw new IllegalStateException(sb2.toString());
                }
                f1.a aVar = zVar.f5084g.f5076d;
                zVar.f5079a.remove(serviceConnection);
                if (zVar.f5079a.isEmpty()) {
                    this.f5075c.sendMessageDelayed(this.f5075c.obtainMessage(0, lVar), this.f5077e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(l lVar, ServiceConnection serviceConnection) {
        boolean z4;
        AbstractC0203C.f("ServiceConnection must not be null", serviceConnection);
        synchronized (this.f5073a) {
            try {
                z zVar = (z) this.f5073a.get(lVar);
                if (zVar == null) {
                    zVar = new z(this, lVar);
                    lVar.a(this.f5074b);
                    zVar.f5079a.put(serviceConnection, serviceConnection);
                    zVar.a();
                    this.f5073a.put(lVar, zVar);
                } else {
                    this.f5075c.removeMessages(0, lVar);
                    if (zVar.f5079a.containsKey(serviceConnection)) {
                        String strValueOf = String.valueOf(lVar);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(strValueOf);
                        throw new IllegalStateException(sb.toString());
                    }
                    x xVar = zVar.f5084g;
                    f1.a aVar = xVar.f5076d;
                    zVar.f5083e.a(xVar.f5074b);
                    zVar.f5079a.put(serviceConnection, serviceConnection);
                    int i5 = zVar.f5080b;
                    if (i5 == 1) {
                        serviceConnection.onServiceConnected(zVar.f, zVar.f5082d);
                    } else if (i5 == 2) {
                        zVar.a();
                    }
                }
                z4 = zVar.f5081c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i5 = message.what;
        if (i5 == 0) {
            synchronized (this.f5073a) {
                try {
                    l lVar = (l) message.obj;
                    z zVar = (z) this.f5073a.get(lVar);
                    if (zVar != null && zVar.f5079a.isEmpty()) {
                        if (zVar.f5081c) {
                            x xVar = zVar.f5084g;
                            xVar.f5075c.removeMessages(1, zVar.f5083e);
                            f1.a aVar = xVar.f5076d;
                            Context context = xVar.f5074b;
                            aVar.getClass();
                            context.unbindService(zVar);
                            zVar.f5081c = false;
                            zVar.f5080b = 2;
                        }
                        this.f5073a.remove(lVar);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i5 != 1) {
            return false;
        }
        synchronized (this.f5073a) {
            try {
                l lVar2 = (l) message.obj;
                z zVar2 = (z) this.f5073a.get(lVar2);
                if (zVar2 != null && zVar2.f5080b == 3) {
                    String strValueOf = String.valueOf(lVar2);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = zVar2.f;
                    if (componentName == null) {
                        lVar2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        componentName = new ComponentName(lVar2.f5052b, "unknown");
                    }
                    zVar2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
