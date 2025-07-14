package androidx.fragment.app;

import android.os.Handler;

/* loaded from: classes.dex */
public abstract class M extends K {

    /* renamed from: d, reason: collision with root package name */
    public final H f3727d;

    /* renamed from: e, reason: collision with root package name */
    public final H f3728e;
    public final Handler f;

    /* renamed from: g, reason: collision with root package name */
    public final b0 f3729g;

    public M(H h3) {
        Handler handler = new Handler();
        this.f3729g = new b0();
        this.f3727d = h3;
        this.f3728e = h3;
        this.f = handler;
    }
}
