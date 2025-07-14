package K2;

import I2.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.samsung.context.sdk.samsunganalytics.internal.util.Preferences;
import g3.y;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: d, reason: collision with root package name */
    public final long f1649d = TimeUnit.HOURS.toMillis(6);

    /* renamed from: e, reason: collision with root package name */
    public final Context f1650e;
    public final J2.a f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f1651g;

    public a(J2.a aVar, Bundle bundle) {
        this.f1650e = aVar.f1570a;
        this.f = aVar;
        this.f1651g = bundle;
    }

    @Override // I2.b
    public final int onFinish() {
        return 0;
    }

    @Override // I2.b
    public final void run() {
        Context context = this.f1650e;
        int iA = L2.a.a(context);
        if (iA == 0) {
            J2.b.c0("Not installed DMA");
            J2.b.c0("SetConfiguration is aborted");
            return;
        }
        boolean z4 = false;
        J2.a aVar = this.f;
        if (iA == 1) {
            if (TextUtils.isEmpty(aVar.f1571b)) {
                J2.b.c0("Service ID has to be set");
            } else {
                if (L2.a.a(aVar.f1570a) == 1 ? aVar.f1575g.f53e : aVar.f1574e) {
                    z4 = true;
                } else {
                    J2.b.c0("You have to agree to terms and conditions");
                }
            }
            if (!z4) {
                J2.b.c0("Invalid DiagMonConfiguration");
                J2.b.c0("SetConfiguration is aborted");
                return;
            }
            try {
                String strConcat = "com.sec.android.log.".concat(aVar.f1571b);
                Bundle bundle = new Bundle();
                bundle.putString(Preferences.PREFS_KEY_DID, aVar.f);
                bundle.putBoolean("serviceAgreeType", L2.a.a(aVar.f1570a) == 1 ? aVar.f1575g.f53e : aVar.f1574e);
                bundle.putString("serviceId", strConcat);
                context.getContentResolver().call(Uri.parse("content://" + strConcat), "service_registration", (String) null, bundle);
            } catch (Exception e5) {
                J2.b.c0("fail to send SR obj: " + e5.getMessage());
            }
            J2.b.C("Valid DiagMonConfiguration");
            return;
        }
        if (iA != 2) {
            J2.b.c0("Exceptional case");
            J2.b.c0("SetConfiguration is aborted");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j5 = context.getSharedPreferences("diagmon_pref", 0).getLong("diagmon_timestamp", 0L);
        if ((("com.samsung.diagmonagenttest".equals(context.getPackageName()) || "com.samsung.context.sdk.sampleapp".equals(context.getPackageName())) && Build.TYPE.equals("eng")) || jCurrentTimeMillis > j5 + this.f1649d) {
            String str = aVar.f1571b;
            if (iA == 2) {
                try {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("serviceId", str);
                    context.getContentResolver().call(L2.a.f1732b, "request_deviceid", "request_deviceid", bundle2);
                } catch (Exception unused) {
                    J2.b.c0("Authority check got failed");
                    return;
                }
            }
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("diagmon_pref", 0).edit();
            editorEdit.putLong("diagmon_timestamp", jCurrentTimeMillis);
            editorEdit.apply();
            Bundle bundle3 = this.f1651g;
            if (!y.L(bundle3)) {
                Log.w(L2.a.f1731a, "Invalid SR object");
                return;
            }
            try {
                J2.b.C("Request Service Registration");
                L2.a.c(context.getContentResolver().call(L2.a.f1732b, "register_service", "registration", bundle3));
            } catch (Exception unused2) {
                J2.b.c0("fail to send SR obj");
            }
        }
    }
}
