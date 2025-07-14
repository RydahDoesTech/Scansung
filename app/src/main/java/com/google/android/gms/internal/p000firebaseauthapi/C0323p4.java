package com.google.android.gms.internal.p000firebaseauthapi;

import b1.AbstractC0203C;
import com.samsung.android.knox.ex.KnoxContract;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.p4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323p4 implements Y3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5590d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5591e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5592g;

    public C0323p4(String str) {
        this.f5590d = 2;
        this.f5592g = str;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Y3
    public final String a() throws JSONException {
        switch (this.f5590d) {
            case 0:
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("identifier", this.f5591e);
                jSONObject.put("continueUri", this.f);
                String str = this.f5592g;
                if (str != null) {
                    jSONObject.put("tenantId", str);
                }
                return jSONObject.toString();
            case 1:
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("oobCode", this.f5591e);
                String str2 = this.f;
                if (str2 != null) {
                    jSONObject2.put("newPassword", str2);
                }
                String str3 = this.f5592g;
                if (str3 != null) {
                    jSONObject2.put("tenantId", str3);
                }
                return jSONObject2.toString();
            case 2:
                JSONObject jSONObject3 = new JSONObject();
                String str4 = this.f5591e;
                if (str4 != null) {
                    jSONObject3.put("email", str4);
                }
                String str5 = this.f;
                if (str5 != null) {
                    jSONObject3.put(KnoxContract.Config.Settings.PARAM_PASSWORD, str5);
                }
                String str6 = this.f5592g;
                if (str6 != null) {
                    jSONObject3.put("tenantId", str6);
                }
                return jSONObject3.toString();
            default:
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("email", this.f5591e);
                jSONObject4.put(KnoxContract.Config.Settings.PARAM_PASSWORD, this.f);
                jSONObject4.put("returnSecureToken", true);
                String str7 = this.f5592g;
                if (str7 != null) {
                    jSONObject4.put("tenantId", str7);
                }
                return jSONObject4.toString();
        }
    }

    public C0323p4(int i5, String str, String str2, String str3) {
        this.f5590d = i5;
        switch (i5) {
            case 2:
                AbstractC0203C.c(str);
                this.f5591e = str;
                AbstractC0203C.c(str2);
                this.f = str2;
                this.f5592g = str3;
                break;
            case 3:
                AbstractC0203C.c(str);
                this.f5591e = str;
                AbstractC0203C.c(str2);
                this.f = str2;
                this.f5592g = str3;
                break;
            default:
                AbstractC0203C.c(str);
                this.f5591e = str;
                this.f = str2;
                this.f5592g = str3;
                break;
        }
    }

    public C0323p4(String str, String str2) {
        this.f5590d = 0;
        AbstractC0203C.c(str);
        this.f5591e = str;
        this.f = "http://localhost";
        this.f5592g = str2;
    }
}
