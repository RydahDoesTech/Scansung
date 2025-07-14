package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0115c implements Parcelable {
    public static final Parcelable.Creator<C0115c> CREATOR = new D0.a(11);

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3801d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3802e;

    public C0115c(Parcel parcel) {
        this.f3801d = parcel.createStringArrayList();
        this.f3802e = parcel.createTypedArrayList(C0114b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeStringList(this.f3801d);
        parcel.writeTypedList(this.f3802e);
    }
}
