package X1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b1.AbstractC0203C;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class j extends c implements Cloneable {
    public static final Parcelable.Creator<j> CREATOR = new p(1);

    /* renamed from: d, reason: collision with root package name */
    public final String f2725d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2726e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2727g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2728h;

    /* renamed from: i, reason: collision with root package name */
    public final String f2729i;

    /* renamed from: j, reason: collision with root package name */
    public final String f2730j;

    public j(String str, String str2, boolean z4, String str3, boolean z5, String str4, String str5) {
        boolean z6 = true;
        if ((!z4 || TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str5)) && ((!z4 || !TextUtils.isEmpty(str3) || TextUtils.isEmpty(str5)) && ((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))))) {
            z6 = false;
        }
        AbstractC0203C.a("Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID.", z6);
        this.f2725d = str;
        this.f2726e = str2;
        this.f = z4;
        this.f2727g = str3;
        this.f2728h = z5;
        this.f2729i = str4;
        this.f2730j = str5;
    }

    public final Object clone() {
        return new j(this.f2725d, this.f2726e, this.f, this.f2727g, this.f2728h, this.f2729i, this.f2730j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f2725d);
        AbstractC0415a.a0(parcel, 2, this.f2726e);
        AbstractC0415a.h0(parcel, 3, 4);
        parcel.writeInt(this.f ? 1 : 0);
        AbstractC0415a.a0(parcel, 4, this.f2727g);
        boolean z4 = this.f2728h;
        AbstractC0415a.h0(parcel, 5, 4);
        parcel.writeInt(z4 ? 1 : 0);
        AbstractC0415a.a0(parcel, 6, this.f2729i);
        AbstractC0415a.a0(parcel, 7, this.f2730j);
        AbstractC0415a.g0(parcel, iE0);
    }
}
