package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import b1.AbstractC0203C;
import g1.AbstractC0449a;
import java.security.NoSuchAlgorithmException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.f4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0263f4 implements Y3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5476d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5477e;
    public final String f;

    public C0263f4(int i5, String str, String str2) {
        this.f5476d = i5;
        switch (i5) {
            case 2:
                AbstractC0203C.c(str);
                this.f5477e = str;
                AbstractC0203C.c(str2);
                this.f = str2;
                break;
            default:
                AbstractC0203C.c(str);
                this.f5477e = str;
                this.f = str2;
                break;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Y3
    public String a() throws JSONException {
        switch (this.f5476d) {
            case 1:
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", this.f5477e);
                jSONObject.put("returnSecureToken", true);
                String str = this.f;
                if (str != null) {
                    jSONObject.put("tenantId", str);
                }
                return jSONObject.toString();
            default:
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("idToken", this.f5477e);
                jSONObject2.put("mfaEnrollmentId", this.f);
                return jSONObject2.toString();
        }
    }

    public C0263f4(Context context, String str) throws NoSuchAlgorithmException {
        this.f5476d = 0;
        AbstractC0203C.e(context);
        AbstractC0203C.c(str);
        this.f5477e = str;
        try {
            byte[] bArrC = AbstractC0449a.c(context, str);
            if (bArrC == null) {
                String strValueOf = String.valueOf(str);
                Log.e("FBA-PackageInfo", strValueOf.length() != 0 ? "single cert required: ".concat(strValueOf) : new String("single cert required: "));
                this.f = null;
                return;
            }
            this.f = AbstractC0449a.a(bArrC);
        } catch (PackageManager.NameNotFoundException unused) {
            String strValueOf2 = String.valueOf(str);
            Log.e("FBA-PackageInfo", strValueOf2.length() != 0 ? "no pkg: ".concat(strValueOf2) : new String("no pkg: "));
            this.f = null;
        }
    }
}
