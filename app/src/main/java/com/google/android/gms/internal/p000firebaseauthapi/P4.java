package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;
import g1.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class P4 extends AbstractC0224a implements Z3 {
    public static final Parcelable.Creator<P4> CREATOR = new C0310n3(16);

    /* renamed from: d, reason: collision with root package name */
    public String f5382d;

    /* renamed from: e, reason: collision with root package name */
    public String f5383e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5384g;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Z3
    public final /* bridge */ /* synthetic */ Z3 b(String str) throws C0369x3 {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f5382d = b.a(jSONObject.optString("idToken", null));
            this.f5383e = b.a(jSONObject.optString("refreshToken", null));
            this.f = jSONObject.optLong("expiresIn", 0L);
            this.f5384g = jSONObject.optBoolean("isNewUser", false);
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw AbstractC0335s.d(e5, "P4", str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 2, this.f5382d);
        AbstractC0415a.a0(parcel, 3, this.f5383e);
        long j5 = this.f;
        AbstractC0415a.h0(parcel, 4, 8);
        parcel.writeLong(j5);
        boolean z4 = this.f5384g;
        AbstractC0415a.h0(parcel, 5, 4);
        parcel.writeInt(z4 ? 1 : 0);
        AbstractC0415a.g0(parcel, iE0);
    }
}
