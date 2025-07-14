package X0;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new c();

    /* renamed from: d, reason: collision with root package name */
    public final Messenger f2678d;

    public e(IBinder iBinder) {
        this.f2678d = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.f2678d;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((e) obj).f2678d;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.f2678d;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        Messenger messenger = this.f2678d;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
