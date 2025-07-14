package X1;

import android.os.Parcel;
import android.os.Parcelable;
import b1.AbstractC0203C;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class h extends c {
    public static final Parcelable.Creator<h> CREATOR = new p(10);

    /* renamed from: d, reason: collision with root package name */
    public final String f2722d;

    public h(String str) {
        AbstractC0203C.c(str);
        this.f2722d = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f2722d);
        AbstractC0415a.g0(parcel, iE0);
    }
}
