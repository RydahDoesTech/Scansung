package com.google.android.gms.internal.p000firebaseauthapi;

import A.d;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public interface O3 {

    /* renamed from: a, reason: collision with root package name */
    public static final d f5377a = new d("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    Context a();

    Uri.Builder b(Intent intent, String str, String str2);

    String c(String str);

    void d(Status status);

    HttpURLConnection e(URL url);

    void f(Uri uri, String str);
}
