package com.google.android.gms.internal.p000firebaseauthapi;

import A3.f;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b1.AbstractC0203C;
import c1.AbstractC0224a;
import e1.AbstractC0415a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class N4 extends AbstractC0224a implements Y3 {
    public static final Parcelable.Creator<N4> CREATOR = new C0310n3(15);

    /* renamed from: e, reason: collision with root package name */
    public String f5362e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public String f5363g;

    /* renamed from: h, reason: collision with root package name */
    public String f5364h;

    /* renamed from: i, reason: collision with root package name */
    public String f5365i;

    /* renamed from: j, reason: collision with root package name */
    public String f5366j;

    /* renamed from: k, reason: collision with root package name */
    public String f5367k;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5369m;
    public String n;

    /* renamed from: o, reason: collision with root package name */
    public String f5370o;

    /* renamed from: p, reason: collision with root package name */
    public String f5371p;

    /* renamed from: q, reason: collision with root package name */
    public String f5372q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5373r;

    /* renamed from: s, reason: collision with root package name */
    public String f5374s;

    /* renamed from: d, reason: collision with root package name */
    public String f5361d = "http://localhost";

    /* renamed from: l, reason: collision with root package name */
    public boolean f5368l = true;

    public N4(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f = str;
        this.f5363g = str2;
        this.f5367k = str4;
        this.n = str5;
        this.f5372q = str6;
        this.f5374s = str7;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str5)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        AbstractC0203C.c(str3);
        this.f5364h = str3;
        this.f5365i = null;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append("id_token=");
            sb.append(str);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append("access_token=");
            sb.append(str2);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(null)) {
            sb.append("identifier=null&");
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append("oauth_token_secret=");
            sb.append(str4);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(str5)) {
            sb.append("code=");
            sb.append(str5);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(str8)) {
            sb.append("nonce=");
            sb.append(str8);
            sb.append("&");
        }
        this.f5366j = f.p(sb, "providerId=", str3);
        this.f5369m = true;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Y3
    public final String a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.f5369m);
        jSONObject.put("returnSecureToken", this.f5368l);
        String str = this.f5362e;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.f5366j;
        if (str2 != null) {
            jSONObject.put("postBody", str2);
        }
        String str3 = this.f5372q;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.f5374s;
        if (str4 != null) {
            jSONObject.put("pendingToken", str4);
        }
        String str5 = this.f5370o;
        if (!TextUtils.isEmpty(str5)) {
            jSONObject.put("sessionId", str5);
        }
        String str6 = this.f5371p;
        if (TextUtils.isEmpty(str6)) {
            String str7 = this.f5361d;
            if (str7 != null) {
                jSONObject.put("requestUri", str7);
            }
        } else {
            jSONObject.put("requestUri", str6);
        }
        jSONObject.put("returnIdpCredential", this.f5373r);
        return jSONObject.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 2, this.f5361d);
        AbstractC0415a.a0(parcel, 3, this.f5362e);
        AbstractC0415a.a0(parcel, 4, this.f);
        AbstractC0415a.a0(parcel, 5, this.f5363g);
        AbstractC0415a.a0(parcel, 6, this.f5364h);
        AbstractC0415a.a0(parcel, 7, this.f5365i);
        AbstractC0415a.a0(parcel, 8, this.f5366j);
        AbstractC0415a.a0(parcel, 9, this.f5367k);
        AbstractC0415a.h0(parcel, 10, 4);
        parcel.writeInt(this.f5368l ? 1 : 0);
        boolean z4 = this.f5369m;
        AbstractC0415a.h0(parcel, 11, 4);
        parcel.writeInt(z4 ? 1 : 0);
        AbstractC0415a.a0(parcel, 12, this.n);
        AbstractC0415a.a0(parcel, 13, this.f5370o);
        AbstractC0415a.a0(parcel, 14, this.f5371p);
        AbstractC0415a.a0(parcel, 15, this.f5372q);
        boolean z5 = this.f5373r;
        AbstractC0415a.h0(parcel, 16, 4);
        parcel.writeInt(z5 ? 1 : 0);
        AbstractC0415a.a0(parcel, 17, this.f5374s);
        AbstractC0415a.g0(parcel, iE0);
    }
}
