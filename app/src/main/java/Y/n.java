package y;

import android.app.Notification;

/* loaded from: classes.dex */
public final class n extends H3.c {

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f9328e;

    @Override // H3.c
    public final void J0(com.google.firebase.messaging.q qVar) {
        new Notification.BigTextStyle((Notification.Builder) qVar.f).setBigContentTitle(null).bigText(this.f9328e);
    }

    @Override // H3.c
    public final String K0() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
