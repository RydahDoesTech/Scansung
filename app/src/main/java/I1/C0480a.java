package i1;

import K0.c;
import android.content.Context;

/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0480a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0480a f6918b;

    /* renamed from: a, reason: collision with root package name */
    public c f6919a;

    static {
        C0480a c0480a = new C0480a();
        c0480a.f6919a = null;
        f6918b = c0480a;
    }

    public static c a(Context context) {
        c cVar;
        C0480a c0480a = f6918b;
        synchronized (c0480a) {
            try {
                if (c0480a.f6919a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    c0480a.f6919a = new c(context, 2);
                }
                cVar = c0480a.f6919a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }
}
