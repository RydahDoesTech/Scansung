package X0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import o.C0713k;
import t1.n;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static int f2668h;

    /* renamed from: i, reason: collision with root package name */
    public static PendingIntent f2669i;

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f2670j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    public final Context f2672b;

    /* renamed from: c, reason: collision with root package name */
    public final k f2673c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f2674d;
    public Messenger f;

    /* renamed from: g, reason: collision with root package name */
    public e f2676g;

    /* renamed from: a, reason: collision with root package name */
    public final C0713k f2671a = new C0713k();

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f2675e = new Messenger(new b(this, Looper.getMainLooper()));

    public a(Context context) {
        this.f2672b = context;
        this.f2673c = new k(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f2674d = scheduledThreadPoolExecutor;
    }

    public final n a(Bundle bundle) throws RemoteException {
        String string;
        synchronized (a.class) {
            int i5 = f2668h;
            f2668h = i5 + 1;
            string = Integer.toString(i5);
        }
        t1.i iVar = new t1.i();
        synchronized (this.f2671a) {
            this.f2671a.put(string, iVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f2673c.a() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f2672b;
        synchronized (a.class) {
            try {
                if (f2669i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f2669i = PendingIntent.getBroadcast(context, 0, intent2, 33554432);
                }
                intent.putExtra("app", f2669i);
            } finally {
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 5);
        sb.append("|ID|");
        sb.append(string);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String strValueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 8);
            sb2.append("Sending ");
            sb2.append(strValueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.f2675e);
        if (this.f != null || this.f2676g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.f2676g.f2678d;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
        } else if (this.f2673c.a() == 2) {
            this.f2672b.sendBroadcast(intent);
        } else {
            this.f2672b.startService(intent);
        }
        iVar.f8959a.a(m.f2704d, new D3.c(this, string, this.f2674d.schedule(new A1.h(7, iVar), 30L, TimeUnit.SECONDS), 7));
        return iVar.f8959a;
    }

    public final void b(Bundle bundle, String str) {
        synchronized (this.f2671a) {
            try {
                t1.i iVar = (t1.i) this.f2671a.remove(str);
                if (iVar != null) {
                    iVar.b(bundle);
                } else {
                    String strValueOf = String.valueOf(str);
                    Log.w("Rpc", strValueOf.length() != 0 ? "Missing callback for ".concat(strValueOf) : new String("Missing callback for "));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
