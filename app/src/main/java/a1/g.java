package A1;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class g extends R.b {
    public static final Parcelable.Creator<g> CREATOR = new f(0);
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f59g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f60h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f61i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f62j;

    public g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f = parcel.readInt();
        this.f59g = parcel.readInt();
        this.f60h = parcel.readInt() == 1;
        this.f61i = parcel.readInt() == 1;
        this.f62j = parcel.readInt() == 1;
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeInt(this.f);
        parcel.writeInt(this.f59g);
        parcel.writeInt(this.f60h ? 1 : 0);
        parcel.writeInt(this.f61i ? 1 : 0);
        parcel.writeInt(this.f62j ? 1 : 0);
    }

    public g(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f = bottomSheetBehavior.f5749L;
        this.f59g = bottomSheetBehavior.f5772e;
        this.f60h = bottomSheetBehavior.f5766b;
        this.f61i = bottomSheetBehavior.f5746I;
        this.f62j = bottomSheetBehavior.f5747J;
    }
}
