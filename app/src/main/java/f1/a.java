package f1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import i1.C0480a;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f6712a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f6713b;

    public static a a() {
        if (f6713b == null) {
            synchronized (f6712a) {
                try {
                    if (f6713b == null) {
                        a aVar = new a();
                        List list = Collections.EMPTY_LIST;
                        f6713b = aVar;
                    }
                } finally {
                }
            }
        }
        return f6713b;
    }

    public static boolean b(Context context, Intent intent, ServiceConnection serviceConnection, int i5) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C0480a.a(context).f1626a.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return context.bindService(intent, serviceConnection, i5);
    }
}
