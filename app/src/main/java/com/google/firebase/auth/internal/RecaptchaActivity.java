package com.google.firebase.auth.internal;

import E0.d;
import V1.a;
import V1.g;
import Z1.k;
import Z1.l;
import Z1.o;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.H;
import b1.AbstractC0203C;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.AbstractC0305m4;
import com.google.android.gms.internal.p000firebaseauthapi.AbstractC0335s;
import com.google.android.gms.internal.p000firebaseauthapi.N3;
import com.google.android.gms.internal.p000firebaseauthapi.O3;
import com.google.firebase.auth.FirebaseAuth;
import d0.C0391a;
import g1.AbstractC0449a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class RecaptchaActivity extends H implements O3 {

    /* renamed from: e, reason: collision with root package name */
    public static final ExecutorService f6101e;
    public static long f;

    /* renamed from: g, reason: collision with root package name */
    public static final l f6102g;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6103d = false;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f6101e = Executors.unconfigurableExecutorService(threadPoolExecutor);
        f = 0L;
        f6102g = l.f2877b;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.O3
    public final Uri.Builder b(Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String string = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        g gVarE = g.e(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(gVarE);
        o oVar = o.f2883a;
        Context applicationContext = getApplicationContext();
        synchronized (oVar) {
            AbstractC0203C.c(str);
            AbstractC0203C.c(string);
            SharedPreferences sharedPreferencesB = o.b(applicationContext, str);
            o.a(sharedPreferencesB);
            SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string + ".OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string + ".FIREBASE_APP_NAME", stringExtra3);
            editorEdit.apply();
        }
        String strT0 = d.R0(getApplicationContext(), gVarE.f()).T0();
        String strF = null;
        if (TextUtils.isEmpty(strT0)) {
            Log.e("RecaptchaActivity", "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            k(a.q0("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        synchronized (firebaseAuth.f6091g) {
        }
        if (TextUtils.isEmpty(null)) {
            strF = AbstractC0335s.f();
        }
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", strF).appendQueryParameter("eventId", string);
        String strValueOf = String.valueOf(stringExtra2);
        return builderAppendQueryParameter.appendQueryParameter("v", strValueOf.length() != 0 ? "X".concat(strValueOf) : new String("X")).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strT0);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.O3
    public final String c(String str) {
        return AbstractC0305m4.a(str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.O3
    public final void d(Status status) {
        k(status);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.O3
    public final HttpURLConnection e(URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            O3.f5377a.e("Error generating connection", new Object[0]);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.O3
    public final void f(Uri uri, String str) {
        if (getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
            Log.e("RecaptchaActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
            j();
            return;
        }
        List<ResolveInfo> listQueryIntentServices = getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.putExtra("com.android.browser.application_id", str);
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            startActivity(intent);
            return;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        Bundle bundle = new Bundle();
        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
        intent2.putExtras(bundle);
        intent2.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent2.addFlags(1073741824);
        intent2.addFlags(268435456);
        intent2.setData(uri);
        startActivity(intent2, null);
    }

    public final void j() {
        f = 0L;
        this.f6103d = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C0391a.a(this).b(intent);
        f6102g.f2878a.getClass();
        Z1.g.a(getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        finish();
    }

    public final void k(Status status) {
        f = 0L;
        this.f6103d = false;
        Intent intent = new Intent();
        HashMap map = k.f2876a;
        Parcel parcelObtain = Parcel.obtain();
        status.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", bArrMarshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C0391a.a(this).b(intent);
        f6102g.f2878a.getClass();
        Z1.g.a(getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        finish();
    }

    @Override // androidx.fragment.app.H, androidx.activity.ComponentActivity, y.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            String strValueOf = String.valueOf(action);
            Log.e("RecaptchaActivity", strValueOf.length() != 0 ? "Could not do operation - unknown action: ".concat(strValueOf) : new String("Could not do operation - unknown action: "));
            j();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f < 30000) {
            Log.e("RecaptchaActivity", "Could not start operation - already in progress");
            return;
        }
        f = jCurrentTimeMillis;
        if (bundle != null) {
            this.f6103d = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.H, android.app.Activity
    public final void onResume() {
        String string;
        boolean zIsEmpty;
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f6103d) {
                j();
                return;
            }
            String packageName = getPackageName();
            try {
                new N3(packageName, AbstractC0449a.a(AbstractC0449a.c(this, packageName)).toLowerCase(Locale.US), getIntent(), this).executeOnExecutor(f6101e, new Void[0]);
            } catch (PackageManager.NameNotFoundException e5) {
                String strValueOf = String.valueOf(e5);
                StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 34 + strValueOf.length());
                sb.append("Could not get package signature: ");
                sb.append(packageName);
                sb.append(" ");
                sb.append(strValueOf);
                Log.e("RecaptchaActivity", sb.toString());
                j();
            }
            this.f6103d = true;
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("firebaseError")) {
            k(k.a(intent.getStringExtra("firebaseError")));
            return;
        }
        if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
            j();
            return;
        }
        String stringExtra = intent.getStringExtra("link");
        o oVar = o.f2883a;
        Context applicationContext = getApplicationContext();
        String packageName2 = getPackageName();
        String stringExtra2 = intent.getStringExtra("eventId");
        synchronized (oVar) {
            AbstractC0203C.c(packageName2);
            AbstractC0203C.c(stringExtra2);
            SharedPreferences sharedPreferencesB = o.b(applicationContext, packageName2);
            String str = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
            String string2 = sharedPreferencesB.getString(str, null);
            String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
            string = sharedPreferencesB.getString(str2, null);
            SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
            editorEdit.remove(str);
            editorEdit.remove(str2);
            editorEdit.apply();
            zIsEmpty = TextUtils.isEmpty(string2);
        }
        String str3 = zIsEmpty ? null : string;
        if (TextUtils.isEmpty(str3)) {
            Log.e("RecaptchaActivity", "Failed to find registration for this event - failing to prevent session injection.");
            k(a.q0("Failed to find registration for this reCAPTCHA event"));
        }
        if (intent.getBooleanExtra("encryptionEnabled", true)) {
            stringExtra = d.R0(getApplicationContext(), g.e(str3).f()).S0(stringExtra);
        }
        String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
        f = 0L;
        this.f6103d = false;
        Intent intent2 = new Intent();
        intent2.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
        intent2.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C0391a.a(this).b(intent2);
        SharedPreferences.Editor editorEdit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit2.putString("recaptchaToken", queryParameter);
        editorEdit2.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        editorEdit2.putLong("timestamp", System.currentTimeMillis());
        editorEdit2.commit();
        finish();
    }

    @Override // androidx.activity.ComponentActivity, y.h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f6103d);
    }
}
