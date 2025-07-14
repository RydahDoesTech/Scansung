package R1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class B extends R.b {
    public static final Parcelable.Creator<B> CREATOR = new A1.f(7);
    public CharSequence f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2364g;

    public B(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2364g = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f) + "}";
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        TextUtils.writeToParcel(this.f, parcel, i5);
        parcel.writeInt(this.f2364g ? 1 : 0);
    }
}
