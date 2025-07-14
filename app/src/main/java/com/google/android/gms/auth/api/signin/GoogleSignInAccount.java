package com.google.android.gms.auth.api.signin;

import D0.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b1.AbstractC0203C;
import c1.AbstractC0224a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e1.AbstractC0415a;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractC0224a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a(3);

    /* renamed from: d, reason: collision with root package name */
    public final int f5222d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5223e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5224g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5225h;

    /* renamed from: i, reason: collision with root package name */
    public final Uri f5226i;

    /* renamed from: j, reason: collision with root package name */
    public String f5227j;

    /* renamed from: k, reason: collision with root package name */
    public final long f5228k;

    /* renamed from: l, reason: collision with root package name */
    public final String f5229l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f5230m;
    public final String n;

    /* renamed from: o, reason: collision with root package name */
    public final String f5231o;

    /* renamed from: p, reason: collision with root package name */
    public final HashSet f5232p = new HashSet();

    public GoogleSignInAccount(int i5, String str, String str2, String str3, String str4, Uri uri, String str5, long j5, String str6, ArrayList arrayList, String str7, String str8) {
        this.f5222d = i5;
        this.f5223e = str;
        this.f = str2;
        this.f5224g = str3;
        this.f5225h = str4;
        this.f5226i = uri;
        this.f5227j = str5;
        this.f5228k = j5;
        this.f5229l = str6;
        this.f5230m = arrayList;
        this.n = str7;
        this.f5231o = str8;
    }

    public static GoogleSignInAccount d(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl", null);
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j5 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i5 = 0; i5 < length; i5++) {
            hashSet.add(new Scope(1, jSONArray.getString(i5)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.optString("tokenId", null);
        String strOptString4 = jSONObject.optString("email", null);
        String strOptString5 = jSONObject.optString("displayName", null);
        String strOptString6 = jSONObject.optString("givenName", null);
        String strOptString7 = jSONObject.optString("familyName", null);
        String string = jSONObject.getString("obfuscatedIdentifier");
        AbstractC0203C.c(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j5, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f5227j = jSONObject.optString("serverAuthCode", null);
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (googleSignInAccount.f5229l.equals(this.f5229l)) {
            HashSet hashSet = new HashSet(googleSignInAccount.f5230m);
            hashSet.addAll(googleSignInAccount.f5232p);
            HashSet hashSet2 = new HashSet(this.f5230m);
            hashSet2.addAll(this.f5232p);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f5229l.hashCode() + 527) * 31;
        HashSet hashSet = new HashSet(this.f5230m);
        hashSet.addAll(this.f5232p);
        return hashSet.hashCode() + iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.h0(parcel, 1, 4);
        parcel.writeInt(this.f5222d);
        AbstractC0415a.a0(parcel, 2, this.f5223e);
        AbstractC0415a.a0(parcel, 3, this.f);
        AbstractC0415a.a0(parcel, 4, this.f5224g);
        AbstractC0415a.a0(parcel, 5, this.f5225h);
        AbstractC0415a.Z(parcel, 6, this.f5226i, i5);
        AbstractC0415a.a0(parcel, 7, this.f5227j);
        AbstractC0415a.h0(parcel, 8, 8);
        parcel.writeLong(this.f5228k);
        AbstractC0415a.a0(parcel, 9, this.f5229l);
        AbstractC0415a.d0(parcel, 10, this.f5230m);
        AbstractC0415a.a0(parcel, 11, this.n);
        AbstractC0415a.a0(parcel, 12, this.f5231o);
        AbstractC0415a.g0(parcel, iE0);
    }
}
