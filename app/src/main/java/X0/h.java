package X0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.p000firebaseauthapi.R1;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class h implements ServiceConnection {

    /* renamed from: c, reason: collision with root package name */
    public E0.d f2687c;
    public final /* synthetic */ j f;

    /* renamed from: a, reason: collision with root package name */
    public int f2685a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Messenger f2686b = new Messenger(new R1(Looper.getMainLooper(), new Q1.f(1, this)));

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f2688d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f2689e = new SparseArray();

    public h(j jVar) {
        this.f = jVar;
    }

    public final synchronized void a(int i5, String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String strValueOf = String.valueOf(str);
                Log.d("MessengerIpcClient", strValueOf.length() != 0 ? "Disconnected: ".concat(strValueOf) : new String("Disconnected: "));
            }
            int i5 = this.f2685a;
            if (i5 == 0) {
                throw new IllegalStateException();
            }
            if (i5 != 1 && i5 != 2) {
                if (i5 != 3) {
                    return;
                }
                this.f2685a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f2685a = 4;
            f1.a aVarA = f1.a.a();
            Context context = (Context) this.f.f2697e;
            aVarA.getClass();
            context.unbindService(this);
            V1.h hVar = new V1.h(str, securityException);
            Iterator it = this.f2688d.iterator();
            while (it.hasNext()) {
                ((i) it.next()).b(hVar);
            }
            this.f2688d.clear();
            for (int i6 = 0; i6 < this.f2689e.size(); i6++) {
                ((i) this.f2689e.valueAt(i6)).b(hVar);
            }
            this.f2689e.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f2685a == 2 && this.f2688d.isEmpty() && this.f2689e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f2685a = 3;
                f1.a aVarA = f1.a.a();
                Context context = (Context) this.f.f2697e;
                aVarA.getClass();
                context.unbindService(this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(i iVar) {
        int i5 = this.f2685a;
        if (i5 != 0) {
            if (i5 == 1) {
                this.f2688d.add(iVar);
                return true;
            }
            if (i5 != 2) {
                return false;
            }
            this.f2688d.add(iVar);
            ((ScheduledExecutorService) this.f.f).execute(new g(this, 1));
            return true;
        }
        this.f2688d.add(iVar);
        if (this.f2685a != 0) {
            throw new IllegalStateException();
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f2685a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            f1.a aVarA = f1.a.a();
            Context context = (Context) this.f.f2697e;
            aVarA.getClass();
            context.getClass();
            if (f1.a.b(context, intent, this, 1)) {
                ((ScheduledExecutorService) this.f.f).schedule(new g(this, 2), 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e5) {
            b("Unable to bind to service", e5);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f.f).execute(new G.a(this, 2, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f.f).execute(new g(this, 0));
    }
}
