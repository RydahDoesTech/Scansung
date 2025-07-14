package y;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class m extends H3.c {

    /* renamed from: e, reason: collision with root package name */
    public IconCompat f9326e;
    public IconCompat f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9327g;

    @Override // H3.c
    public final void J0(com.google.firebase.messaging.q qVar) {
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) qVar.f).setBigContentTitle(null);
        IconCompat iconCompat = this.f9326e;
        Context context = (Context) qVar.f6168e;
        if (iconCompat != null) {
            l.a(bigContentTitle, C.c.c(iconCompat, context));
        }
        if (this.f9327g) {
            IconCompat iconCompat2 = this.f;
            if (iconCompat2 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                k.a(bigContentTitle, C.c.c(iconCompat2, context));
            }
        }
        l.c(bigContentTitle, false);
        l.b(bigContentTitle, null);
    }

    @Override // H3.c
    public final String K0() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
