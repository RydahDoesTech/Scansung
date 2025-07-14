package p;

import java.util.concurrent.CancellationException;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0733a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0733a f8325b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0733a f8326c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f8327a;

    static {
        if (g.f8338d) {
            f8326c = null;
            f8325b = null;
        } else {
            f8326c = new C0733a(false, null);
            f8325b = new C0733a(true, null);
        }
    }

    public C0733a(boolean z4, CancellationException cancellationException) {
        this.f8327a = cancellationException;
    }
}
