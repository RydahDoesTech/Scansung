package b1;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class t extends AbstractC0224a {
    public static final Parcelable.Creator<t> CREATOR = new D0.a(24);

    /* renamed from: d, reason: collision with root package name */
    public final int f5060d;

    /* renamed from: e, reason: collision with root package name */
    public final Account f5061e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final GoogleSignInAccount f5062g;

    public t(int i5, Account account, int i6, GoogleSignInAccount googleSignInAccount) {
        this.f5060d = i5;
        this.f5061e = account;
        this.f = i6;
        this.f5062g = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.h0(parcel, 1, 4);
        parcel.writeInt(this.f5060d);
        AbstractC0415a.Z(parcel, 2, this.f5061e, i5);
        AbstractC0415a.h0(parcel, 3, 4);
        parcel.writeInt(this.f);
        AbstractC0415a.Z(parcel, 4, this.f5062g, i5);
        AbstractC0415a.g0(parcel, iE0);
    }
}
