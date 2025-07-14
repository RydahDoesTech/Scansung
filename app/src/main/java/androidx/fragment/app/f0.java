package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new D0.a(14);

    /* renamed from: d, reason: collision with root package name */
    public final String f3824d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3825e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3826g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3827h;

    /* renamed from: i, reason: collision with root package name */
    public final String f3828i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3829j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3830k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3831l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f3832m;
    public final int n;

    /* renamed from: o, reason: collision with root package name */
    public final String f3833o;

    /* renamed from: p, reason: collision with root package name */
    public final int f3834p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f3835q;

    public f0(Fragment fragment) {
        this.f3824d = fragment.getClass().getName();
        this.f3825e = fragment.mWho;
        this.f = fragment.mFromLayout;
        this.f3826g = fragment.mFragmentId;
        this.f3827h = fragment.mContainerId;
        this.f3828i = fragment.mTag;
        this.f3829j = fragment.mRetainInstance;
        this.f3830k = fragment.mRemoving;
        this.f3831l = fragment.mDetached;
        this.f3832m = fragment.mHidden;
        this.n = fragment.mMaxState.ordinal();
        this.f3833o = fragment.mTargetWho;
        this.f3834p = fragment.mTargetRequestCode;
        this.f3835q = fragment.mUserVisibleHint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f3824d);
        sb.append(" (");
        sb.append(this.f3825e);
        sb.append(")}:");
        if (this.f) {
            sb.append(" fromLayout");
        }
        int i5 = this.f3827h;
        if (i5 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i5));
        }
        String str = this.f3828i;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f3829j) {
            sb.append(" retainInstance");
        }
        if (this.f3830k) {
            sb.append(" removing");
        }
        if (this.f3831l) {
            sb.append(" detached");
        }
        if (this.f3832m) {
            sb.append(" hidden");
        }
        String str2 = this.f3833o;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f3834p);
        }
        if (this.f3835q) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f3824d);
        parcel.writeString(this.f3825e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.f3826g);
        parcel.writeInt(this.f3827h);
        parcel.writeString(this.f3828i);
        parcel.writeInt(this.f3829j ? 1 : 0);
        parcel.writeInt(this.f3830k ? 1 : 0);
        parcel.writeInt(this.f3831l ? 1 : 0);
        parcel.writeInt(this.f3832m ? 1 : 0);
        parcel.writeInt(this.n);
        parcel.writeString(this.f3833o);
        parcel.writeInt(this.f3834p);
        parcel.writeInt(this.f3835q ? 1 : 0);
    }

    public f0(Parcel parcel) {
        this.f3824d = parcel.readString();
        this.f3825e = parcel.readString();
        this.f = parcel.readInt() != 0;
        this.f3826g = parcel.readInt();
        this.f3827h = parcel.readInt();
        this.f3828i = parcel.readString();
        this.f3829j = parcel.readInt() != 0;
        this.f3830k = parcel.readInt() != 0;
        this.f3831l = parcel.readInt() != 0;
        this.f3832m = parcel.readInt() != 0;
        this.n = parcel.readInt();
        this.f3833o = parcel.readString();
        this.f3834p = parcel.readInt();
        this.f3835q = parcel.readInt() != 0;
    }
}
