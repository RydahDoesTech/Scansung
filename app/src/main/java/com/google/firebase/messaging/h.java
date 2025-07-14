package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import b1.AbstractC0203C;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import r0.AbstractC0809c;
import t1.InterfaceC0873a;
import z.AbstractC0938a;

/* loaded from: classes.dex */
public final class h implements t1.e, InterfaceC0873a, t1.c {
    public static final Object f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static E f6148g;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6149d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6150e;

    public /* synthetic */ h(int i5) {
        this.f6149d = i5;
    }

    public static t1.n a(Context context, Intent intent) {
        E e5;
        t1.n nVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f) {
            try {
                if (f6148g == null) {
                    f6148g = new E(context);
                }
                e5 = f6148g;
            } finally {
            }
        }
        synchronized (e5) {
            try {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
                }
                D d5 = new D(intent);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = e5.f6120c;
                r rVar = new r(1);
                rVar.f6172e = d5;
                ScheduledFuture<?> scheduledFutureSchedule = scheduledThreadPoolExecutor.schedule(rVar, 9000L, TimeUnit.MILLISECONDS);
                t1.n nVar2 = d5.f6117b.f8959a;
                h hVar = new h(7);
                hVar.f6150e = scheduledFutureSchedule;
                nVar2.a(scheduledThreadPoolExecutor, hVar);
                e5.f6121d.add(d5);
                e5.a();
                nVar = d5.f6117b.f8959a;
            } finally {
            }
        }
        return nVar.g(ExecutorC0386c.f, f.f6143e);
    }

    public static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|*");
        return sb.toString();
    }

    public static boolean h(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String k(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    @Override // t1.e
    public void L(Object obj) {
        boolean z4;
        y yVar = (y) obj;
        if (!((FirebaseMessaging) this.f6150e).f6131e.b() || yVar.f6200h.a() == null) {
            return;
        }
        synchronized (yVar) {
            z4 = yVar.f6199g;
        }
        if (z4) {
            return;
        }
        yVar.f(0L);
    }

    public boolean c(String str) {
        String strG = g(str);
        return "1".equals(strG) || Boolean.parseBoolean(strG);
    }

    public Integer d(String str) {
        String strG = g(str);
        if (TextUtils.isEmpty(strG)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strG));
        } catch (NumberFormatException unused) {
            String strK = k(str);
            StringBuilder sb = new StringBuilder(String.valueOf(strK).length() + 38 + String.valueOf(strG).length());
            sb.append("Couldn't parse value of ");
            sb.append(strK);
            sb.append("(");
            sb.append(strG);
            sb.append(") into an int");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public JSONArray e(String str) {
        String strG = g(str);
        if (TextUtils.isEmpty(strG)) {
            return null;
        }
        try {
            return new JSONArray(strG);
        } catch (JSONException unused) {
            String strK = k(str);
            StringBuilder sb = new StringBuilder(String.valueOf(strK).length() + 50 + String.valueOf(strG).length());
            sb.append("Malformed JSON for key ");
            sb.append(strK);
            sb.append(": ");
            sb.append(strG);
            sb.append(", falling back to default");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public String f(Resources resources, String str, String str2) {
        String[] strArr;
        String strG = g(str2);
        if (!TextUtils.isEmpty(strG)) {
            return strG;
        }
        String strG2 = g(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strG2)) {
            return null;
        }
        int identifier = resources.getIdentifier(strG2, "string", str);
        if (identifier == 0) {
            String strK = k(str2.concat("_loc_key"));
            StringBuilder sb = new StringBuilder(String.valueOf(strK).length() + 49 + str2.length());
            sb.append(strK);
            sb.append(" resource not found: ");
            sb.append(str2);
            sb.append(" Default value will be used.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
        JSONArray jSONArrayE = e(str2.concat("_loc_args"));
        if (jSONArrayE == null) {
            strArr = null;
        } else {
            int length = jSONArrayE.length();
            strArr = new String[length];
            for (int i5 = 0; i5 < length; i5++) {
                strArr[i5] = jSONArrayE.optString(i5);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e5) {
            String strK2 = k(str2);
            String string = Arrays.toString(strArr);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strK2).length() + 58 + String.valueOf(string).length());
            sb2.append("Missing format argument for ");
            sb2.append(strK2);
            sb2.append(": ");
            sb2.append(string);
            sb2.append(" Default value will be used.");
            Log.w("NotificationParams", sb2.toString(), e5);
            return null;
        }
    }

    public String g(String str) {
        Bundle bundle = (Bundle) this.f6150e;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public Bundle i() {
        Bundle bundle = (Bundle) this.f6150e;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public t1.n j(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.f6150e;
        boolean z4 = context.getApplicationInfo().targetSdkVersion >= 26;
        int flags = intent.getFlags() & 268435456;
        if (z4 && flags == 0) {
            return a(context, intent);
        }
        ExecutorC0386c executorC0386c = ExecutorC0386c.f;
        g gVar = new g();
        gVar.f6146a = context;
        gVar.f6147b = intent;
        t1.n nVarC = AbstractC0809c.c(executorC0386c, gVar);
        C0388e c0388e = new C0388e(0, false);
        c0388e.f6142e = context;
        c0388e.f = intent;
        return nVarC.h(executorC0386c, c0388e);
    }

    @Override // t1.InterfaceC0873a
    public Object n0(t1.h hVar) throws IOException {
        Object obj;
        ((G3.d) this.f6150e).getClass();
        t1.n nVar = (t1.n) hVar;
        synchronized (nVar.f8968a) {
            AbstractC0203C.g("Task is not yet complete", nVar.f8970c);
            if (nVar.f8971d) {
                throw new CancellationException("Task is already canceled.");
            }
            if (IOException.class.isInstance(nVar.f)) {
                throw ((Throwable) IOException.class.cast(nVar.f));
            }
            if (nVar.f != null) {
                throw new t1.f(nVar.f);
            }
            obj = nVar.f8972e;
        }
        Bundle bundle = (Bundle) obj;
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null || (string = bundle.getString("unregistered")) != null) {
            return string;
        }
        String string2 = bundle.getString("error");
        if ("RST".equals(string2)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string2 != null) {
            throw new IOException(string2);
        }
        Log.w("FirebaseMessaging", "Unexpected response: ".concat(bundle.toString()), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    @Override // t1.c
    public void onComplete(t1.h hVar) {
        switch (this.f6149d) {
            case 6:
                ((D) this.f6150e).f6117b.d(null);
                break;
            default:
                ((ScheduledFuture) this.f6150e).cancel(false);
                break;
        }
    }

    public /* synthetic */ h(Context context, int i5) {
        this.f6149d = i5;
        this.f6150e = context;
    }

    public h(Context context) {
        boolean zIsEmpty;
        this.f6149d = 5;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f6150e = sharedPreferences;
        File file = new File(AbstractC0938a.c(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e5) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String strValueOf = String.valueOf(e5.getMessage());
                Log.d("FirebaseMessaging", strValueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(strValueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    public h(Bundle bundle) {
        this.f6149d = 4;
        this.f6150e = new Bundle(bundle);
    }
}
