package com.google.android.gms.internal.p000firebaseauthapi;

import V1.g;
import a2.m;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import b1.AbstractC0203C;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.f;
import com.idm.network.IDMNetworkInterface;
import g2.b;
import java.net.HttpURLConnection;
import o2.C0716a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.b4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239b4 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5433a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5434b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5435c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5436d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5437e;

    public C0239b4(FirebaseMessaging firebaseMessaging, b bVar) {
        this.f5437e = firebaseMessaging;
        this.f5434b = bVar;
    }

    public synchronized void a() {
        try {
            if (this.f5433a) {
                return;
            }
            Boolean boolC = c();
            this.f5436d = boolC;
            if (boolC == null) {
                f fVar = new f(3);
                this.f5435c = fVar;
                ((m) ((b) this.f5434b)).a(fVar);
            }
            this.f5433a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean b() {
        boolean z4;
        boolean zBooleanValue;
        try {
            a();
            Boolean bool = (Boolean) this.f5436d;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                g gVar = ((FirebaseMessaging) this.f5437e).f6127a;
                gVar.a();
                C0716a c0716a = (C0716a) gVar.f2615g.get();
                synchronized (c0716a) {
                    z4 = c0716a.f8242a;
                }
                zBooleanValue = z4;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zBooleanValue;
    }

    public Boolean c() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        g gVar = ((FirebaseMessaging) this.f5437e).f6127a;
        gVar.a();
        Context context = gVar.f2610a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public void d(HttpURLConnection httpURLConnection) {
        boolean z4 = this.f5433a;
        String str = (String) this.f5436d;
        String strP = z4 ? A3.f.p(new StringBuilder(String.valueOf(str).length() + 19), str, "/FirebaseUI-Android") : A3.f.p(new StringBuilder(String.valueOf(str).length() + 21), str, "/FirebaseCore-Android");
        if (((C0263f4) this.f5435c) == null) {
            Context context = (Context) this.f5434b;
            this.f5435c = new C0263f4(context, context.getPackageName());
        }
        httpURLConnection.setRequestProperty("X-Android-Package", ((C0263f4) this.f5435c).f5477e);
        httpURLConnection.setRequestProperty("X-Android-Cert", ((C0263f4) this.f5435c).f);
        httpURLConnection.setRequestProperty(IDMNetworkInterface.IDM_HTTP_HEADER_ACCEPT_LANGUAGE, AbstractC0335s.f());
        httpURLConnection.setRequestProperty("X-Client-Version", strP);
        httpURLConnection.setRequestProperty("X-Firebase-Locale", (String) this.f5437e);
        this.f5437e = null;
    }

    public C0239b4(Context context, String str) {
        this.f5433a = false;
        AbstractC0203C.e(context);
        this.f5434b = context.getApplicationContext();
        this.f5436d = "Android/Fallback/".concat(str);
    }
}
