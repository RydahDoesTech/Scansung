package X1;

import android.os.Parcel;
import android.os.Parcelable;
import b1.AbstractC0203C;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class m extends c {
    public static final Parcelable.Creator<m> CREATOR = new p(4);

    /* renamed from: d, reason: collision with root package name */
    public final String f2735d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2736e;

    public m(String str, String str2) {
        AbstractC0203C.c(str);
        this.f2735d = str;
        AbstractC0203C.c(str2);
        this.f2736e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f2735d);
        AbstractC0415a.a0(parcel, 2, this.f2736e);
        AbstractC0415a.g0(parcel, iE0);
    }
}
