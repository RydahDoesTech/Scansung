package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;
import g1.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class C4 extends AbstractC0224a {
    public static final Parcelable.Creator<C4> CREATOR = new C0310n3(11);

    /* renamed from: d, reason: collision with root package name */
    public final List f5282d;

    public C4() {
        this.f5282d = new ArrayList();
    }

    public static C4 d(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new C4(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i5);
            arrayList.add(jSONObject == null ? new B4() : new B4(b.a(jSONObject.optString("federatedId", null)), b.a(jSONObject.optString("displayName", null)), b.a(jSONObject.optString("photoUrl", null)), b.a(jSONObject.optString("providerId", null)), null, b.a(jSONObject.optString("phoneNumber", null)), b.a(jSONObject.optString("email", null))));
        }
        return new C4(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.d0(parcel, 2, this.f5282d);
        AbstractC0415a.g0(parcel, iE0);
    }

    public C4(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f5282d = Collections.unmodifiableList(arrayList);
        } else {
            this.f5282d = Collections.emptyList();
        }
    }
}
