package Y0;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import b1.AbstractC0203C;
import c1.AbstractC0224a;
import e1.AbstractC0415a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends AbstractC0224a {

    /* renamed from: d, reason: collision with root package name */
    public final int f2806d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2807e;
    public final PendingIntent f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2808g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f2805h = new a(0);
    public static final Parcelable.Creator<a> CREATOR = new D0.a(4);

    public a(int i5, int i6, PendingIntent pendingIntent, String str) {
        this.f2806d = i5;
        this.f2807e = i6;
        this.f = pendingIntent;
        this.f2808g = str;
    }

    public static String d(int i5) {
        if (i5 == 99) {
            return "UNFINISHED";
        }
        if (i5 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i5) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i5) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i5);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2807e == aVar.f2807e && AbstractC0203C.h(this.f, aVar.f) && AbstractC0203C.h(this.f2808g, aVar.f2808g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2807e), this.f, this.f2808g});
    }

    public final String toString() {
        E0.d dVar = new E0.d(this);
        dVar.C0("statusCode", d(this.f2807e));
        dVar.C0("resolution", this.f);
        dVar.C0("message", this.f2808g);
        return dVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.h0(parcel, 1, 4);
        parcel.writeInt(this.f2806d);
        AbstractC0415a.h0(parcel, 2, 4);
        parcel.writeInt(this.f2807e);
        AbstractC0415a.Z(parcel, 3, this.f, i5);
        AbstractC0415a.a0(parcel, 4, this.f2808g);
        AbstractC0415a.g0(parcel, iE0);
    }

    public a(int i5) {
        this(1, i5, null, null);
    }

    public a(int i5, PendingIntent pendingIntent) {
        this(1, i5, pendingIntent, null);
    }
}
