package X1;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import b1.AbstractC0203C;
import c1.AbstractC0224a;
import com.google.android.gms.internal.p000firebaseauthapi.G2;
import com.samsung.android.lib.episode.EternalContract;
import e1.AbstractC0415a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k extends AbstractC0224a {
    public static final Parcelable.Creator<k> CREATOR = new p(2);

    /* renamed from: d, reason: collision with root package name */
    public final String f2731d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2732e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2733g;

    public k(long j5, String str, String str2, String str3) {
        AbstractC0203C.c(str);
        this.f2731d = str;
        this.f2732e = str2;
        this.f = j5;
        AbstractC0203C.c(str3);
        this.f2733g = str3;
    }

    public final JSONObject d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", EternalContract.DEVICE_TYPE_PHONE);
            jSONObject.putOpt("uid", this.f2731d);
            jSONObject.putOpt("displayName", this.f2732e);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f));
            jSONObject.putOpt("phoneNumber", this.f2733g);
            return jSONObject;
        } catch (JSONException e5) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new G2(e5);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f2731d);
        AbstractC0415a.a0(parcel, 2, this.f2732e);
        AbstractC0415a.h0(parcel, 3, 8);
        parcel.writeLong(this.f);
        AbstractC0415a.a0(parcel, 4, this.f2733g);
        AbstractC0415a.g0(parcel, iE0);
    }
}
