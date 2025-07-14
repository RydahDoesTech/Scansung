package com.google.android.gms.internal.p000firebaseauthapi;

import b1.AbstractC0203C;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.n4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311n4 implements Y3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5572d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5573e;

    public C0311n4(String str, int i5) {
        this.f5572d = i5;
        switch (i5) {
            case 1:
                AbstractC0203C.c(str);
                this.f5573e = str;
                break;
            case 2:
                AbstractC0203C.c(str);
                this.f5573e = str;
                break;
            case 3:
                AbstractC0203C.c(str);
                this.f5573e = str;
                break;
            default:
                AbstractC0203C.c(str);
                this.f5573e = str;
                break;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Y3
    public String a() throws JSONException {
        switch (this.f5572d) {
            case 1:
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("idToken", this.f5573e);
                return jSONObject.toString();
            case 2:
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("grantType", "refresh_token");
                jSONObject2.put("refreshToken", this.f5573e);
                return jSONObject2.toString();
            default:
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("idToken", this.f5573e);
                return jSONObject3.toString();
        }
    }
}
