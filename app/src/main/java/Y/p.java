package y;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9329a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f9333e;
    public CharSequence f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f9334g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f9335h;

    /* renamed from: i, reason: collision with root package name */
    public int f9336i;

    /* renamed from: j, reason: collision with root package name */
    public int f9337j;

    /* renamed from: l, reason: collision with root package name */
    public H3.c f9339l;
    public Bundle n;

    /* renamed from: q, reason: collision with root package name */
    public String f9343q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f9344r;

    /* renamed from: s, reason: collision with root package name */
    public final Notification f9345s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f9346t;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9330b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9331c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9332d = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f9338k = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9340m = false;

    /* renamed from: o, reason: collision with root package name */
    public int f9341o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f9342p = 0;

    public p(Context context, String str) {
        Notification notification = new Notification();
        this.f9345s = notification;
        this.f9329a = context;
        this.f9343q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f9337j = 0;
        this.f9346t = new ArrayList();
        this.f9344r = true;
    }

    public static CharSequence b(String str) {
        return (str != null && str.length() > 5120) ? str.subSequence(0, 5120) : str;
    }

    public final Notification a() {
        Bundle bundle;
        com.google.firebase.messaging.q qVar = new com.google.firebase.messaging.q(this);
        p pVar = (p) qVar.f6169g;
        H3.c cVar = pVar.f9339l;
        if (cVar != null) {
            cVar.J0(qVar);
        }
        Notification notificationBuild = ((Notification.Builder) qVar.f).build();
        if (cVar != null) {
            pVar.f9339l.getClass();
        }
        if (cVar != null && (bundle = notificationBuild.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", cVar.K0());
        }
        return notificationBuild;
    }

    public final void c(H3.c cVar) {
        if (this.f9339l != cVar) {
            this.f9339l = cVar;
            if (((p) cVar.f829d) != this) {
                cVar.f829d = this;
                c(cVar);
            }
        }
    }
}
