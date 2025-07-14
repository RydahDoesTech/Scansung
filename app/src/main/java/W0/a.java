package W0;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f2644c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static a f2645d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f2646a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f2647b;

    public a(Context context) {
        this.f2647b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        ReentrantLock reentrantLock = this.f2646a;
        reentrantLock.lock();
        try {
            return this.f2647b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
