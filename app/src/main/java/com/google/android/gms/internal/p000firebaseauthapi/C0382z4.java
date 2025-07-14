package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import c1.AbstractC0224a;
import e1.AbstractC0415a;
import g1.b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.z4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0382z4 extends AbstractC0224a implements Z3 {
    public static final Parcelable.Creator<C0382z4> CREATOR = new C0310n3(8);

    /* renamed from: d, reason: collision with root package name */
    public String f5702d;

    /* renamed from: e, reason: collision with root package name */
    public String f5703e;
    public Long f;

    /* renamed from: g, reason: collision with root package name */
    public String f5704g;

    /* renamed from: h, reason: collision with root package name */
    public Long f5705h;

    public C0382z4(String str, String str2, Long l4, String str3, Long l5) {
        this.f5702d = str;
        this.f5703e = str2;
        this.f = l4;
        this.f5704g = str3;
        this.f5705h = l5;
    }

    public static C0382z4 d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C0382z4 c0382z4 = new C0382z4();
            c0382z4.f5705h = Long.valueOf(System.currentTimeMillis());
            c0382z4.f5702d = jSONObject.optString("refresh_token", null);
            c0382z4.f5703e = jSONObject.optString("access_token", null);
            c0382z4.f = Long.valueOf(jSONObject.optLong("expires_in"));
            c0382z4.f5704g = jSONObject.optString("token_type", null);
            c0382z4.f5705h = Long.valueOf(jSONObject.optLong("issued_at"));
            return c0382z4;
        } catch (JSONException e5) {
            Log.d("z4", "Failed to read GetTokenResponse from JSONObject");
            throw new G2(e5);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Z3
    public final /* bridge */ /* synthetic */ Z3 b(String str) throws C0369x3 {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f5702d = b.a(jSONObject.optString("refresh_token"));
            this.f5703e = b.a(jSONObject.optString("access_token"));
            this.f = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.f5704g = b.a(jSONObject.optString("token_type"));
            this.f5705h = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw AbstractC0335s.d(e5, "z4", str);
        }
    }

    public final String e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.f5702d);
            jSONObject.put("access_token", this.f5703e);
            jSONObject.put("expires_in", this.f);
            jSONObject.put("token_type", this.f5704g);
            jSONObject.put("issued_at", this.f5705h);
            return jSONObject.toString();
        } catch (JSONException e5) {
            Log.d("z4", "Failed to convert GetTokenResponse to JSON");
            throw new G2(e5);
        }
    }

    public final boolean f() {
        return System.currentTimeMillis() + 300000 < (this.f.longValue() * 1000) + this.f5705h.longValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 2, this.f5702d);
        AbstractC0415a.a0(parcel, 3, this.f5703e);
        Long l4 = this.f;
        long jLongValue = l4 == null ? 0L : l4.longValue();
        AbstractC0415a.h0(parcel, 4, 8);
        parcel.writeLong(jLongValue);
        AbstractC0415a.a0(parcel, 5, this.f5704g);
        Long l5 = this.f5705h;
        l5.getClass();
        AbstractC0415a.h0(parcel, 6, 8);
        parcel.writeLong(l5.longValue());
        AbstractC0415a.g0(parcel, iE0);
    }
}
