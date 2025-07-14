package com.google.android.gms.internal.p000firebaseauthapi;

import A.d;
import A3.f;
import V1.a;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import b1.AbstractC0203C;
import com.idm.network.IDMNetworkInterface;
import com.samsung.android.knox.ex.KnoxContract;
import com.samsung.android.lib.episode.EternalContract;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class N3 extends AsyncTask {
    public static final d f = new d("FirebaseAuth", "GetAuthDomainTask");

    /* renamed from: a, reason: collision with root package name */
    public final String f5356a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5357b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f5358c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri.Builder f5359d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5360e;

    public N3(String str, String str2, Intent intent, O3 o32) {
        AbstractC0203C.c(str);
        this.f5356a = str;
        AbstractC0203C.c(str2);
        AbstractC0203C.e(intent);
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        AbstractC0203C.c(stringExtra);
        Uri.Builder builderBuildUpon = Uri.parse(o32.c(stringExtra)).buildUpon();
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendPath("getProjectConfig").appendQueryParameter(KnoxContract.KEY, stringExtra).appendQueryParameter("androidPackageName", str);
        AbstractC0203C.e(str2);
        builderAppendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.f5357b = builderBuildUpon.build().toString();
        this.f5358c = new WeakReference(o32);
        this.f5359d = o32.b(intent, str, str2);
        this.f5360e = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    public static byte[] b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int i5 = inputStream.read(bArr);
                if (i5 == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i5);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(M3 m32) {
        String str;
        String str2;
        Uri.Builder builder;
        O3 o32 = (O3) this.f5358c.get();
        if (m32 != null) {
            str = m32.f5350a;
            str2 = m32.f5351b;
        } else {
            str = null;
            str2 = null;
        }
        if (o32 == null) {
            f.e("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (TextUtils.isEmpty(str) || (builder = this.f5359d) == null) {
            o32.d(a.q0(str2));
        } else {
            builder.authority(str);
            o32.f(builder.build(), this.f5356a);
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) throws IOException {
        HttpURLConnection httpURLConnectionE;
        int responseCode;
        String str;
        d dVar = f;
        String str2 = this.f5360e;
        if (!TextUtils.isEmpty(str2)) {
            M3 m32 = new M3();
            m32.f5350a = str2;
            return m32;
        }
        try {
            try {
                URL url = new URL(this.f5357b);
                O3 o32 = (O3) this.f5358c.get();
                httpURLConnectionE = o32.e(url);
                httpURLConnectionE.addRequestProperty(IDMNetworkInterface.IDM_HTTP_HEADER_CONTENT_TYPE, "application/json; charset=UTF-8");
                httpURLConnectionE.setConnectTimeout(EternalContract.ONEUI_6_0_0);
                new C0239b4(o32.a(), "X" + Integer.toString(new C0233a4(C0233a4.a()).f5423a)).d(httpURLConnectionE);
                responseCode = httpURLConnectionE.getResponseCode();
            } catch (C0369x3 e5) {
                String strValueOf = String.valueOf(e5);
                dVar.e(f.p(new StringBuilder(strValueOf.length() + 33), "ConversionException encountered: ", strValueOf), new Object[0]);
            } catch (NullPointerException e6) {
                String strValueOf2 = String.valueOf(e6);
                dVar.e(f.p(new StringBuilder(strValueOf2.length() + 26), "Null pointer encountered: ", strValueOf2), new Object[0]);
            }
        } catch (IOException e7) {
            String strValueOf3 = String.valueOf(e7);
            dVar.e(f.p(new StringBuilder(strValueOf3.length() + 22), "IOException occurred: ", strValueOf3), new Object[0]);
        }
        if (responseCode == 200) {
            C0317o4 c0317o4 = new C0317o4(1);
            c0317o4.c(new String(b(httpURLConnectionE.getInputStream())));
            Iterator it = ((ArrayList) c0317o4.f5580e).iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (str3.endsWith("firebaseapp.com") || str3.endsWith("web.app")) {
                    M3 m33 = new M3();
                    m33.f5350a = str3;
                    return m33;
                }
            }
            return null;
        }
        try {
        } catch (IOException e8) {
            String strValueOf4 = String.valueOf(e8);
            StringBuilder sb = new StringBuilder(strValueOf4.length() + 75);
            sb.append("Error parsing error message from response body in getErrorMessageFromBody. ");
            sb.append(strValueOf4);
            Log.w((String) dVar.f11b, dVar.f(sb.toString(), new Object[0]));
        }
        if (httpURLConnectionE.getResponseCode() >= 400) {
            InputStream errorStream = httpURLConnectionE.getErrorStream();
            str = errorStream == null ? "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again." : (String) AbstractC0335s.e(String.class, new String(b(errorStream)));
        } else {
            str = null;
        }
        dVar.e("Error getting project config. Failed with " + str + " " + responseCode, new Object[0]);
        M3 m34 = new M3();
        m34.f5351b = str;
        return m34;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onCancelled(Object obj) {
        onPostExecute(null);
    }
}
