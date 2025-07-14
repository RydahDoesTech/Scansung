package Y0;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c extends AbstractC0224a {
    public static final Parcelable.Creator<c> CREATOR = new D0.a(5);

    /* renamed from: d, reason: collision with root package name */
    public final String f2811d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2812e;
    public final long f;

    public c(long j5, int i5, String str) {
        this.f2811d = str;
        this.f2812e = i5;
        this.f = j5;
    }

    public final long d() {
        long j5 = this.f;
        return j5 == -1 ? this.f2812e : j5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = this.f2811d;
            if (((str != null && str.equals(cVar.f2811d)) || (str == null && cVar.f2811d == null)) && d() == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2811d, Long.valueOf(d())});
    }

    public final String toString() {
        E0.d dVar = new E0.d(this);
        dVar.C0("name", this.f2811d);
        dVar.C0("version", Long.valueOf(d()));
        return dVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f2811d);
        AbstractC0415a.h0(parcel, 2, 4);
        parcel.writeInt(this.f2812e);
        long jD = d();
        AbstractC0415a.h0(parcel, 3, 8);
        parcel.writeLong(jD);
        AbstractC0415a.g0(parcel, iE0);
    }

    public c(String str, long j5) {
        this.f2811d = str;
        this.f = j5;
        this.f2812e = -1;
    }
}
