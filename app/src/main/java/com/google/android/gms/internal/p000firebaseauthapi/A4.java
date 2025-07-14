package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import b1.AbstractC0203C;
import c1.AbstractC0224a;
import e1.AbstractC0415a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class A4 extends AbstractC0224a {
    public static final Parcelable.Creator<A4> CREATOR = new C0310n3(9);

    /* renamed from: d, reason: collision with root package name */
    public final String f5259d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5260e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5261g;

    public A4(long j5, String str, String str2, String str3) {
        this.f5259d = str;
        AbstractC0203C.c(str2);
        this.f5260e = str2;
        this.f = str3;
        this.f5261g = j5;
    }

    public static A4 d(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        A4 a42 = new A4((jSONObject.has("enrolledAt") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("enrolledAt")) != null && jSONObjectOptJSONObject.has("seconds")) ? jSONObjectOptJSONObject.optLong("seconds", 0L) : 0L, jSONObject.optString("phoneInfo", null), jSONObject.optString("mfaEnrollmentId", null), jSONObject.optString("displayName", null));
        jSONObject.optString("unobfuscatedPhoneInfo");
        return a42;
    }

    public static ArrayList e(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            arrayList.add(d(jSONArray.getJSONObject(i5)));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f5259d);
        AbstractC0415a.a0(parcel, 2, this.f5260e);
        AbstractC0415a.a0(parcel, 3, this.f);
        AbstractC0415a.h0(parcel, 4, 8);
        parcel.writeLong(this.f5261g);
        AbstractC0415a.g0(parcel, iE0);
    }
}
