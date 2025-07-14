package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new D0.a(9);

    /* renamed from: d, reason: collision with root package name */
    public final IntentSender f3162d;

    /* renamed from: e, reason: collision with root package name */
    public final Intent f3163e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3164g;

    public j(IntentSender intentSender, Intent intent, int i5, int i6) {
        AbstractC0219i.e("intentSender", intentSender);
        this.f3162d = intentSender;
        this.f3163e = intent;
        this.f = i5;
        this.f3164g = i6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        AbstractC0219i.e("dest", parcel);
        parcel.writeParcelable(this.f3162d, i5);
        parcel.writeParcelable(this.f3163e, i5);
        parcel.writeInt(this.f);
        parcel.writeInt(this.f3164g);
    }
}
