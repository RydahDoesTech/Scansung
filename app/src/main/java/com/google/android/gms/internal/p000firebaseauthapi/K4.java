package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import b1.AbstractC0203C;
import com.samsung.android.lib.episode.EternalContract;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class K4 implements Y3 {

    /* renamed from: d, reason: collision with root package name */
    public final String f5329d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5330e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5331g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5332h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5333i;

    /* renamed from: j, reason: collision with root package name */
    public final String f5334j;

    /* renamed from: k, reason: collision with root package name */
    public C0311n4 f5335k;

    public K4(String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC0203C.c(EternalContract.DEVICE_TYPE_PHONE);
        this.f5329d = EternalContract.DEVICE_TYPE_PHONE;
        AbstractC0203C.c(str);
        this.f5330e = str;
        AbstractC0203C.c(str2);
        this.f = str2;
        this.f5332h = str3;
        this.f5331g = str4;
        this.f5333i = str5;
        this.f5334j = str6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Y3
    public final String a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaPendingCredential", this.f5330e);
        jSONObject.put("mfaEnrollmentId", this.f);
        this.f5329d.getClass();
        jSONObject.put("mfaProvider", 1);
        String str = this.f5332h;
        if (str != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", str);
            String str2 = this.f5333i;
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.put("recaptchaToken", str2);
            }
            String str3 = this.f5334j;
            if (!TextUtils.isEmpty(str3)) {
                jSONObject2.put("safetyNetToken", str3);
            }
            C0311n4 c0311n4 = this.f5335k;
            if (c0311n4 != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("appSignatureHash", c0311n4.f5573e);
                jSONObject2.put("autoRetrievalInfo", jSONObject3);
            }
            jSONObject.put("phoneSignInInfo", jSONObject2);
        }
        return jSONObject.toString();
    }
}
