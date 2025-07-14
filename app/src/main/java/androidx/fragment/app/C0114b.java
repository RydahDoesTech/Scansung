package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0114b implements Parcelable {
    public static final Parcelable.Creator<C0114b> CREATOR = new D0.a(10);

    /* renamed from: d, reason: collision with root package name */
    public final int[] f3789d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3790e;
    public final int[] f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f3791g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3792h;

    /* renamed from: i, reason: collision with root package name */
    public final String f3793i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3794j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3795k;

    /* renamed from: l, reason: collision with root package name */
    public final CharSequence f3796l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3797m;
    public final CharSequence n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f3798o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f3799p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f3800q;

    public C0114b(C0113a c0113a) {
        int size = c0113a.f3869a.size();
        this.f3789d = new int[size * 6];
        if (!c0113a.f3874g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f3790e = new ArrayList(size);
        this.f = new int[size];
        this.f3791g = new int[size];
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            j0 j0Var = (j0) c0113a.f3869a.get(i6);
            int i7 = i5 + 1;
            this.f3789d[i5] = j0Var.f3856a;
            ArrayList arrayList = this.f3790e;
            Fragment fragment = j0Var.f3857b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f3789d;
            iArr[i7] = j0Var.f3858c ? 1 : 0;
            iArr[i5 + 2] = j0Var.f3859d;
            iArr[i5 + 3] = j0Var.f3860e;
            int i8 = i5 + 5;
            iArr[i5 + 4] = j0Var.f;
            i5 += 6;
            iArr[i8] = j0Var.f3861g;
            this.f[i6] = j0Var.f3862h.ordinal();
            this.f3791g[i6] = j0Var.f3863i.ordinal();
        }
        this.f3792h = c0113a.f;
        this.f3793i = c0113a.f3876i;
        this.f3794j = c0113a.f3752s;
        this.f3795k = c0113a.f3877j;
        this.f3796l = c0113a.f3878k;
        this.f3797m = c0113a.f3879l;
        this.n = c0113a.f3880m;
        this.f3798o = c0113a.n;
        this.f3799p = c0113a.f3881o;
        this.f3800q = c0113a.f3882p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeIntArray(this.f3789d);
        parcel.writeStringList(this.f3790e);
        parcel.writeIntArray(this.f);
        parcel.writeIntArray(this.f3791g);
        parcel.writeInt(this.f3792h);
        parcel.writeString(this.f3793i);
        parcel.writeInt(this.f3794j);
        parcel.writeInt(this.f3795k);
        TextUtils.writeToParcel(this.f3796l, parcel, 0);
        parcel.writeInt(this.f3797m);
        TextUtils.writeToParcel(this.n, parcel, 0);
        parcel.writeStringList(this.f3798o);
        parcel.writeStringList(this.f3799p);
        parcel.writeInt(this.f3800q ? 1 : 0);
    }

    public C0114b(Parcel parcel) {
        this.f3789d = parcel.createIntArray();
        this.f3790e = parcel.createStringArrayList();
        this.f = parcel.createIntArray();
        this.f3791g = parcel.createIntArray();
        this.f3792h = parcel.readInt();
        this.f3793i = parcel.readString();
        this.f3794j = parcel.readInt();
        this.f3795k = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f3796l = (CharSequence) creator.createFromParcel(parcel);
        this.f3797m = parcel.readInt();
        this.n = (CharSequence) creator.createFromParcel(parcel);
        this.f3798o = parcel.createStringArrayList();
        this.f3799p = parcel.createStringArrayList();
        this.f3800q = parcel.readInt() != 0;
    }
}
