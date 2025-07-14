package Z1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c1.InterfaceC0225b;
import e1.AbstractC0415a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q implements InterfaceC0225b {
    public static final Parcelable.Creator<q> CREATOR = new b(3);

    /* renamed from: d, reason: collision with root package name */
    public t f2887d;

    /* renamed from: e, reason: collision with root package name */
    public p f2888e;
    public X1.r f;

    public q(t tVar) {
        this.f2887d = tVar;
        ArrayList arrayList = tVar.f2899h;
        this.f2888e = null;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            if (!TextUtils.isEmpty(((r) arrayList.get(i5)).f2895k)) {
                this.f2888e = new p(((r) arrayList.get(i5)).f2890e, ((r) arrayList.get(i5)).f2895k, tVar.f2904m);
            }
        }
        if (this.f2888e == null) {
            this.f2888e = new p(tVar.f2904m);
        }
        this.f = tVar.n;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.Z(parcel, 1, this.f2887d, i5);
        AbstractC0415a.Z(parcel, 2, this.f2888e, i5);
        AbstractC0415a.Z(parcel, 3, this.f, i5);
        AbstractC0415a.g0(parcel, iE0);
    }
}
