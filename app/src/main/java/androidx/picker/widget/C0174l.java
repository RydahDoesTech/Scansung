package androidx.picker.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: androidx.picker.widget.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174l extends View.BaseSavedState {
    public static final Parcelable.Creator<C0174l> CREATOR = new D0.a(15);

    /* renamed from: d, reason: collision with root package name */
    public final int f4480d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4481e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4482g;

    /* renamed from: h, reason: collision with root package name */
    public final long f4483h;

    public C0174l(Parcelable parcelable, int i5, int i6, int i7, long j5, long j6) {
        super(parcelable);
        this.f4480d = i5;
        this.f4481e = i6;
        this.f = i7;
        this.f4482g = j5;
        this.f4483h = j6;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeInt(this.f4480d);
        parcel.writeInt(this.f4481e);
        parcel.writeInt(this.f);
        parcel.writeLong(this.f4482g);
        parcel.writeLong(this.f4483h);
    }

    public C0174l(Parcel parcel) {
        super(parcel);
        this.f4480d = parcel.readInt();
        this.f4481e = parcel.readInt();
        this.f = parcel.readInt();
        this.f4482g = parcel.readLong();
        this.f4483h = parcel.readLong();
    }
}
