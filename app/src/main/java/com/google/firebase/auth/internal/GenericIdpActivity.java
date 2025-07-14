package com.google.firebase.auth.internal;

import E0.d;
import V1.a;
import V1.g;
import Z1.k;
import Z1.l;
import Z1.n;
import Z1.o;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import androidx.fragment.app.H;
import b1.AbstractC0203C;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.AbstractC0305m4;
import com.google.android.gms.internal.p000firebaseauthapi.N3;
import com.google.android.gms.internal.p000firebaseauthapi.N4;
import com.google.android.gms.internal.p000firebaseauthapi.O3;
import d0.C0391a;
import g1.AbstractC0449a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.C0704b;

/* loaded from: classes.dex */
public class GenericIdpActivity extends H implements O3 {
    public static long f;

    /* renamed from: g, reason: collision with root package name */
    public static final l f6098g = l.f2877b;

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f6099d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6100e;

    public GenericIdpActivity() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f6099d = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f6100e = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:
    
        r13 = r13.toCharArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c5, code lost:
    
        if (r14 >= r11) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:
    
        r15 = r13[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c9, code lost:
    
        if (r15 < 'A') goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cb, code lost:
    
        if (r15 > 'Z') goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cd, code lost:
    
        r13[r14] = (char) (r15 ^ ' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d2, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d5, code lost:
    
        r13 = java.lang.String.valueOf(r13);
     */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.O3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.net.Uri.Builder b(android.content.Intent r19, java.lang.String r20, java.lang.String r21) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.GenericIdpActivity.b(android.content.Intent, java.lang.String, java.lang.String):android.net.Uri$Builder");
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
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.O3
    public final void f(Uri uri, String str) {
        if (getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
            Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
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
        this.f6100e = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C0391a.a(this).b(intent);
        Status statusQ0 = a.q0("WEB_CONTEXT_CANCELED");
        f6098g.getClass();
        l.a(this, statusQ0);
        finish();
    }

    public final void k(Status status) {
        f = 0L;
        this.f6100e = false;
        Intent intent = new Intent();
        HashMap map = k.f2876a;
        Parcel parcelObtain = Parcel.obtain();
        status.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", bArrMarshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C0391a.a(this).b(intent);
        Context applicationContext = getApplicationContext();
        f6098g.getClass();
        l.a(applicationContext, status);
        finish();
    }

    @Override // androidx.fragment.app.H, androidx.activity.ComponentActivity, y.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            String strValueOf = String.valueOf(action);
            Log.e("GenericIdpActivity", strValueOf.length() != 0 ? "Could not do operation - unknown action: ".concat(strValueOf) : new String("Could not do operation - unknown action: "));
            j();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        f = jCurrentTimeMillis;
        if (bundle != null) {
            this.f6100e = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.H, android.app.Activity
    public final void onResume() {
        String lowerCase;
        g gVarE;
        C0704b c0704b;
        n nVar;
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f6100e) {
                j();
                return;
            }
            String packageName = getPackageName();
            try {
                lowerCase = AbstractC0449a.a(AbstractC0449a.c(this, packageName)).toLowerCase(Locale.US);
                gVarE = g.e(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                c0704b = AbstractC0305m4.f5564a;
                gVarE.a();
            } catch (PackageManager.NameNotFoundException e5) {
                String strValueOf = String.valueOf(e5);
                StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 34 + strValueOf.length());
                sb.append("Could not get package signature: ");
                sb.append(packageName);
                sb.append(" ");
                sb.append(strValueOf);
                Log.e("GenericIdpActivity", sb.toString());
                j();
            }
            if (!c0704b.containsKey(gVarE.f2612c.f2617a)) {
                new N3(packageName, lowerCase, getIntent(), this).executeOnExecutor(this.f6099d, new Void[0]);
                this.f6100e = true;
                return;
            }
            gVarE.a();
            String str = gVarE.f2612c.f2617a;
            synchronized (c0704b) {
                if (c0704b.getOrDefault(str, null) != null) {
                    throw new ClassCastException();
                }
            }
            throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
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
        String stringExtra2 = intent.getStringExtra("eventId");
        String packageName2 = getPackageName();
        boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
        synchronized (o.f2883a) {
            AbstractC0203C.c(packageName2);
            AbstractC0203C.c(stringExtra2);
            SharedPreferences sharedPreferencesB = o.b(this, packageName2);
            String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".SESSION_ID";
            String str3 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
            String str4 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".PROVIDER_ID";
            String str5 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
            String string = sharedPreferencesB.getString(str2, null);
            String string2 = sharedPreferencesB.getString(str3, null);
            String string3 = sharedPreferencesB.getString(str4, null);
            String string4 = sharedPreferencesB.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
            String string5 = sharedPreferencesB.getString(str5, null);
            SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
            editorEdit.remove(str2);
            editorEdit.remove(str3);
            editorEdit.remove(str4);
            editorEdit.remove(str5);
            editorEdit.apply();
            nVar = (string == null || string2 == null || string3 == null) ? null : new n(string, string2, string3, string4, string5);
        }
        if (nVar == null) {
            j();
        }
        if (booleanExtra) {
            stringExtra = d.R0(getApplicationContext(), g.e(nVar.f2882h).f()).S0(stringExtra);
        }
        N4 n42 = new N4();
        AbstractC0203C.e(nVar);
        String str6 = nVar.f2879d;
        AbstractC0203C.c(str6);
        n42.f5370o = str6;
        AbstractC0203C.c(stringExtra);
        n42.f5371p = stringExtra;
        String str7 = nVar.f;
        AbstractC0203C.c(str7);
        n42.f5364h = str7;
        n42.f5368l = true;
        n42.f5366j = "providerId=".concat(str7);
        String str8 = nVar.f2881g;
        String str9 = nVar.f2880e;
        n42.f5372q = str8;
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(str9) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(str9) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(str9)) {
            Log.e("GenericIdpActivity", str9.length() != 0 ? "unsupported operation: ".concat(str9) : new String("unsupported operation: "));
            j();
            return;
        }
        f = 0L;
        this.f6100e = false;
        Intent intent2 = new Intent();
        Parcel parcelObtain = Parcel.obtain();
        n42.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        intent2.putExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", bArrMarshall);
        intent2.putExtra("com.google.firebase.auth.internal.OPERATION", str9);
        intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C0391a.a(this).b(intent2);
        SharedPreferences.Editor editorEdit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        Parcel parcelObtain2 = Parcel.obtain();
        n42.writeToParcel(parcelObtain2, 0);
        byte[] bArrMarshall2 = parcelObtain2.marshall();
        parcelObtain2.recycle();
        editorEdit2.putString("verifyAssertionRequest", bArrMarshall2 != null ? Base64.encodeToString(bArrMarshall2, 10) : null);
        editorEdit2.putString("operation", str9);
        editorEdit2.putString("tenantId", str8);
        editorEdit2.putLong("timestamp", System.currentTimeMillis());
        editorEdit2.commit();
        finish();
    }

    @Override // androidx.activity.ComponentActivity, y.h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f6100e);
    }
}
