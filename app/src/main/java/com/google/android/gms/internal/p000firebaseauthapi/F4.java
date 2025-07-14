package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import b1.AbstractC0203C;
import c1.AbstractC0224a;
import e1.AbstractC0415a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class F4 extends AbstractC0224a implements Y3 {
    public static final Parcelable.Creator<F4> CREATOR = new C0310n3(13);

    /* renamed from: d, reason: collision with root package name */
    public final String f5298d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5299e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5300g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5301h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5302i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f5303j;

    /* renamed from: k, reason: collision with root package name */
    public final String f5304k;

    /* renamed from: l, reason: collision with root package name */
    public C0311n4 f5305l;

    public F4(String str, long j5, boolean z4, String str2, String str3, String str4, boolean z5, String str5) {
        AbstractC0203C.c(str);
        this.f5298d = str;
        this.f5299e = j5;
        this.f = z4;
        this.f5300g = str2;
        this.f5301h = str3;
        this.f5302i = str4;
        this.f5303j = z5;
        this.f5304k = str5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Y3
    public final String a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phoneNumber", this.f5298d);
        String str = this.f5301h;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.f5302i;
        if (str2 != null) {
            jSONObject.put("recaptchaToken", str2);
        }
        C0311n4 c0311n4 = this.f5305l;
        if (c0311n4 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("appSignatureHash", c0311n4.f5573e);
            jSONObject.put("autoRetrievalInfo", jSONObject2);
        }
        String str3 = this.f5304k;
        if (str3 != null) {
            jSONObject.put("safetyNetToken", str3);
        }
        return jSONObject.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f5298d);
        AbstractC0415a.h0(parcel, 2, 8);
        parcel.writeLong(this.f5299e);
        AbstractC0415a.h0(parcel, 3, 4);
        parcel.writeInt(this.f ? 1 : 0);
        AbstractC0415a.a0(parcel, 4, this.f5300g);
        AbstractC0415a.a0(parcel, 5, this.f5301h);
        AbstractC0415a.a0(parcel, 6, this.f5302i);
        AbstractC0415a.h0(parcel, 7, 4);
        parcel.writeInt(this.f5303j ? 1 : 0);
        AbstractC0415a.a0(parcel, 8, this.f5304k);
        AbstractC0415a.g0(parcel, iE0);
    }
}
