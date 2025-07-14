package Z1;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import b1.AbstractC0203C;
import c1.AbstractC0224a;
import com.google.android.gms.internal.p000firebaseauthapi.B4;
import com.google.android.gms.internal.p000firebaseauthapi.C0364w4;
import com.google.android.gms.internal.p000firebaseauthapi.G2;
import e1.AbstractC0415a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r extends AbstractC0224a implements X1.n {
    public static final Parcelable.Creator<r> CREATOR = new b(4);

    /* renamed from: d, reason: collision with root package name */
    public final String f2889d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2890e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2891g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2892h;

    /* renamed from: i, reason: collision with root package name */
    public final String f2893i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2894j;

    /* renamed from: k, reason: collision with root package name */
    public final String f2895k;

    public r(C0364w4 c0364w4) {
        AbstractC0203C.e(c0364w4);
        AbstractC0203C.c("firebase");
        String str = c0364w4.f5665d;
        AbstractC0203C.c(str);
        this.f2889d = str;
        this.f2890e = "firebase";
        this.f2892h = c0364w4.f5666e;
        this.f = c0364w4.f5667g;
        Uri uri = !TextUtils.isEmpty(c0364w4.f5668h) ? Uri.parse(c0364w4.f5668h) : null;
        if (uri != null) {
            this.f2891g = uri.toString();
        }
        this.f2894j = c0364w4.f;
        this.f2895k = null;
        this.f2893i = c0364w4.f5671k;
    }

    @Override // X1.n
    public final String c() {
        return this.f2890e;
    }

    public final String d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f2889d);
            jSONObject.putOpt("providerId", this.f2890e);
            jSONObject.putOpt("displayName", this.f);
            jSONObject.putOpt("photoUrl", this.f2891g);
            jSONObject.putOpt("email", this.f2892h);
            jSONObject.putOpt("phoneNumber", this.f2893i);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f2894j));
            jSONObject.putOpt("rawUserInfo", this.f2895k);
            return jSONObject.toString();
        } catch (JSONException e5) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new G2(e5);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f2889d);
        AbstractC0415a.a0(parcel, 2, this.f2890e);
        AbstractC0415a.a0(parcel, 3, this.f);
        AbstractC0415a.a0(parcel, 4, this.f2891g);
        AbstractC0415a.a0(parcel, 5, this.f2892h);
        AbstractC0415a.a0(parcel, 6, this.f2893i);
        AbstractC0415a.h0(parcel, 7, 4);
        parcel.writeInt(this.f2894j ? 1 : 0);
        AbstractC0415a.a0(parcel, 8, this.f2895k);
        AbstractC0415a.g0(parcel, iE0);
    }

    public r(B4 b42) {
        AbstractC0203C.e(b42);
        this.f2889d = b42.f5268d;
        String str = b42.f5270g;
        AbstractC0203C.c(str);
        this.f2890e = str;
        this.f = b42.f5269e;
        String str2 = b42.f;
        Uri uri = !TextUtils.isEmpty(str2) ? Uri.parse(str2) : null;
        if (uri != null) {
            this.f2891g = uri.toString();
        }
        this.f2892h = b42.f5273j;
        this.f2893i = b42.f5272i;
        this.f2894j = false;
        this.f2895k = b42.f5271h;
    }

    public r(String str, String str2, String str3, String str4, String str5, String str6, boolean z4, String str7) {
        this.f2889d = str;
        this.f2890e = str2;
        this.f2892h = str3;
        this.f2893i = str4;
        this.f = str5;
        this.f2891g = str6;
        if (!TextUtils.isEmpty(str6)) {
            Uri.parse(str6);
        }
        this.f2894j = z4;
        this.f2895k = str7;
    }
}
