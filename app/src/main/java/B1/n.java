package b1;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.internal.p000firebaseauthapi.AbstractC0228a;
import o1.AbstractC0715a;

/* loaded from: classes.dex */
public final class n extends AbstractC0228a implements o {
    public final Account y() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f5420c);
        parcelObtain = Parcel.obtain();
        try {
            this.f5419b.transact(2, parcelObtain, parcelObtain, 0);
            parcelObtain.readException();
            parcelObtain.recycle();
            return (Account) AbstractC0715a.a(parcelObtain, Account.CREATOR);
        } catch (RuntimeException e5) {
            throw e5;
        } finally {
            parcelObtain.recycle();
        }
    }
}
