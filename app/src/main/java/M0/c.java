package M0;

import Q1.f;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: e, reason: collision with root package name */
    public static c f1810e;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1811d;

    @Override // N2.a
    public Object get() {
        return this.f1811d;
    }

    public c() {
        this.f1811d = new Object();
        new Handler(Looper.getMainLooper(), new f(0, this));
    }
}
