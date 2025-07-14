package Y0;

import android.R;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import b1.v;
import com.google.android.gms.common.api.GoogleApiActivity;
import g1.AbstractC0449a;
import y.p;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f2815b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final e f2816c = new e();

    public final void c(GoogleApiActivity googleApiActivity, int i5, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogCreate;
        v vVar = new v(super.a(googleApiActivity, i5, "d"), googleApiActivity);
        if (i5 == 0) {
            alertDialogCreate = null;
        } else {
            TypedValue typedValue = new TypedValue();
            googleApiActivity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
            AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(googleApiActivity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(googleApiActivity, 5) : null;
            if (builder == null) {
                builder = new AlertDialog.Builder(googleApiActivity);
            }
            builder.setMessage(b1.i.b(googleApiActivity, i5));
            builder.setOnCancelListener(googleApiActivity2);
            Resources resources = googleApiActivity.getResources();
            String string = i5 != 1 ? i5 != 2 ? i5 != 3 ? resources.getString(R.string.ok) : resources.getString(com.wssyncmldm.R.string.common_google_play_services_enable_button) : resources.getString(com.wssyncmldm.R.string.common_google_play_services_update_button) : resources.getString(com.wssyncmldm.R.string.common_google_play_services_install_button);
            if (string != null) {
                builder.setPositiveButton(string, vVar);
            }
            String strC = b1.i.c(googleApiActivity, i5);
            if (strC != null) {
                builder.setTitle(strC);
            }
            alertDialogCreate = builder.create();
        }
        if (alertDialogCreate == null) {
            return;
        }
        FragmentManager fragmentManager = googleApiActivity.getFragmentManager();
        b bVar = new b();
        alertDialogCreate.setOnCancelListener(null);
        alertDialogCreate.setOnDismissListener(null);
        bVar.f2809d = alertDialogCreate;
        bVar.f2810e = googleApiActivity2;
        bVar.show(fragmentManager, "GooglePlayServicesErrorDialog");
    }

    public final void d(Context context, int i5, PendingIntent pendingIntent) throws Resources.NotFoundException {
        int i6;
        if (i5 == 18) {
            new d(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i5 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strD = i5 == 6 ? b1.i.d(context, "common_google_play_services_resolution_required_title") : b1.i.c(context, i5);
        if (strD == null) {
            strD = context.getResources().getString(com.wssyncmldm.R.string.common_google_play_services_notification_ticker);
        }
        String strE = (i5 == 6 || i5 == 19) ? b1.i.e(context, "common_google_play_services_resolution_required_text", b1.i.a(context)) : b1.i.b(context, i5);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        p pVar = new p(context, null);
        pVar.f9340m = true;
        pVar.f9345s.flags |= 16;
        pVar.f9333e = p.b(strD);
        y.n nVar = new y.n();
        nVar.f9328e = p.b(strE);
        pVar.c(nVar);
        if (AbstractC0449a.f6767b == null) {
            AbstractC0449a.f6767b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        if (AbstractC0449a.f6767b.booleanValue()) {
            pVar.f9345s.icon = context.getApplicationInfo().icon;
            pVar.f9337j = 2;
            AbstractC0449a.d(context);
            pVar.f9334g = pendingIntent;
        } else {
            pVar.f9345s.icon = R.drawable.stat_sys_warning;
            pVar.f9345s.tickerText = p.b(resources.getString(com.wssyncmldm.R.string.common_google_play_services_notification_ticker));
            pVar.f9345s.when = System.currentTimeMillis();
            pVar.f9334g = pendingIntent;
            pVar.f = p.b(strE);
        }
        synchronized (f2815b) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.wssyncmldm.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        pVar.f9343q = "com.google.android.gms.availability";
        Notification notificationA = pVar.a();
        if (i5 == 1 || i5 == 2 || i5 == 3) {
            g.f2818a.set(false);
            i6 = 10436;
        } else {
            i6 = 39789;
        }
        notificationManager.notify(i6, notificationA);
    }
}
