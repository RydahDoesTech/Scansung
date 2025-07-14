package o1;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0715a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8241a = 0;

    static {
        AbstractC0715a.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
