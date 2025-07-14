package Y0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.R1;
import com.samsung.android.knox.ucm.plugin.agent.UcmAgentService;

/* loaded from: classes.dex */
public final class d extends R1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f2814b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f2814b = eVar;
        this.f2813a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        int i5 = message.what;
        if (i5 != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i5);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i6 = f.f2817a;
        e eVar = this.f2814b;
        Context context = this.f2813a;
        int iB = eVar.b(context, i6);
        int i7 = g.f2820c;
        if (iB == 1 || iB == 2 || iB == 3 || iB == 9) {
            Intent intentA = eVar.a(context, iB, "n");
            eVar.d(context, iB, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, UcmAgentService.ERROR_APPLET_UNKNOWN));
        }
    }
}
