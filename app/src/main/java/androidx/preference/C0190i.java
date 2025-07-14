package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: androidx.preference.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190i extends C0194m {
    public static final Parcelable.Creator<C0190i> CREATOR = new D0.a(19);

    /* renamed from: d, reason: collision with root package name */
    public HashSet f4665d;

    public C0190i(Parcel parcel) {
        super(parcel);
        int i5 = parcel.readInt();
        this.f4665d = new HashSet();
        String[] strArr = new String[i5];
        parcel.readStringArray(strArr);
        Collections.addAll(this.f4665d, strArr);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeInt(this.f4665d.size());
        HashSet hashSet = this.f4665d;
        parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
    }

    public C0190i(AbsSavedState absSavedState) {
        super(absSavedState);
    }
}
