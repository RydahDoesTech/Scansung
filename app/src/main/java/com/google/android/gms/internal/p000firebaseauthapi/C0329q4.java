package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.q4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0329q4 extends AbstractC0224a implements Z3 {
    public static final Parcelable.Creator<C0329q4> CREATOR = new C0310n3(4);

    /* renamed from: d, reason: collision with root package name */
    public String f5603d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5604e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5605g;

    /* renamed from: h, reason: collision with root package name */
    public M4 f5606h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f5607i;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Z3
    public final /* bridge */ /* synthetic */ Z3 b(String str) throws C0369x3 {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f5603d = jSONObject.optString("authUri", null);
            this.f5604e = jSONObject.optBoolean("registered", false);
            this.f = jSONObject.optString("providerId", null);
            this.f5605g = jSONObject.optBoolean("forExistingProvider", false);
            if (jSONObject.has("allProviders")) {
                this.f5606h = new M4(AbstractC0335s.r(jSONObject.optJSONArray("allProviders")), 1);
            } else {
                this.f5606h = new M4(null);
            }
            this.f5607i = AbstractC0335s.r(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw AbstractC0335s.d(e5, "q4", str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 2, this.f5603d);
        boolean z4 = this.f5604e;
        AbstractC0415a.h0(parcel, 3, 4);
        parcel.writeInt(z4 ? 1 : 0);
        AbstractC0415a.a0(parcel, 4, this.f);
        boolean z5 = this.f5605g;
        AbstractC0415a.h0(parcel, 5, 4);
        parcel.writeInt(z5 ? 1 : 0);
        AbstractC0415a.Z(parcel, 6, this.f5606h, i5);
        AbstractC0415a.b0(parcel, 7, this.f5607i);
        AbstractC0415a.g0(parcel, iE0);
    }
}
