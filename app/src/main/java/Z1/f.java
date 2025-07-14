package Z1;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends AbstractC0224a {
    public static final Parcelable.Creator<f> CREATOR = new b(1);

    /* renamed from: d, reason: collision with root package name */
    public final List f2869d;

    public f(ArrayList arrayList) {
        this.f2869d = arrayList == null ? new ArrayList() : arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.d0(parcel, 1, this.f2869d);
        AbstractC0415a.g0(parcel, iE0);
    }
}
