package b1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.p000firebaseauthapi.R1;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class z implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5079a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f5080b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5081c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f5082d;

    /* renamed from: e, reason: collision with root package name */
    public final l f5083e;
    public ComponentName f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x f5084g;

    public z(x xVar, l lVar) {
        this.f5084g = xVar;
        this.f5083e = lVar;
    }

    public final void a() {
        this.f5080b = 3;
        x xVar = this.f5084g;
        f1.a aVar = xVar.f5076d;
        l lVar = this.f5083e;
        Context context = xVar.f5074b;
        Intent intentA = lVar.a(context);
        aVar.getClass();
        boolean zB = f1.a.b(context, intentA, this, lVar.f5053c);
        this.f5081c = zB;
        if (zB) {
            R1 r12 = xVar.f5075c;
            r12.sendMessageDelayed(r12.obtainMessage(1, lVar), xVar.f);
        } else {
            this.f5080b = 2;
            try {
                xVar.f5076d.getClass();
                context.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f5084g.f5073a) {
            try {
                this.f5084g.f5075c.removeMessages(1, this.f5083e);
                this.f5082d = iBinder;
                this.f = componentName;
                Iterator it = this.f5079a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f5080b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f5084g.f5073a) {
            try {
                this.f5084g.f5075c.removeMessages(1, this.f5083e);
                this.f5082d = null;
                this.f = componentName;
                Iterator it = this.f5079a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f5080b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
