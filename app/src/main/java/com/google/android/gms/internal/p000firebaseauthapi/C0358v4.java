package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;
import g1.b;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.v4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0358v4 extends AbstractC0224a implements Z3 {
    public static final Parcelable.Creator<C0358v4> CREATOR = new C0310n3(5);

    /* renamed from: d, reason: collision with root package name */
    public C0370x4 f5656d;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Z3
    public final Z3 b(String str) throws JSONException, C0369x3 {
        C0370x4 c0370x4;
        int i5;
        C0364w4 c0364w4;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("users");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    c0370x4 = new C0370x4(new ArrayList());
                } else {
                    ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                    boolean z4 = false;
                    int i6 = 0;
                    while (i6 < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i6);
                        if (jSONObject2 == null) {
                            c0364w4 = new C0364w4();
                            c0364w4.f5669i = new C4();
                            i5 = i6;
                        } else {
                            i5 = i6;
                            c0364w4 = new C0364w4(b.a(jSONObject2.optString("localId", null)), b.a(jSONObject2.optString("email", null)), jSONObject2.optBoolean("emailVerified", z4), b.a(jSONObject2.optString("displayName", null)), b.a(jSONObject2.optString("photoUrl", null)), C4.d(jSONObject2.optJSONArray("providerUserInfo")), b.a(jSONObject2.optString("rawPassword", null)), b.a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, A4.e(jSONObject2.optJSONArray("mfaInfo")));
                        }
                        arrayList.add(c0364w4);
                        i6 = i5 + 1;
                        z4 = false;
                    }
                    c0370x4 = new C0370x4(arrayList);
                }
                this.f5656d = c0370x4;
            } else {
                this.f5656d = new C0370x4();
            }
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw AbstractC0335s.d(e5, "v4", str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.Z(parcel, 2, this.f5656d, i5);
        AbstractC0415a.g0(parcel, iE0);
    }
}
