package O2;

import b3.AbstractC0219i;
import com.samsung.android.knox.custom.CustomDeviceManager;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;
import f3.C0447c;

/* loaded from: classes.dex */
public final class b implements Comparable {

    /* renamed from: h, reason: collision with root package name */
    public static final b f2002h = new b(8, 22);

    /* renamed from: d, reason: collision with root package name */
    public final int f2003d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final int f2004e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2005g;

    public b(int i5, int i6) {
        this.f2004e = i5;
        this.f = i6;
        if (new C0447c(0, CustomDeviceManager.CALL_SCREEN_ALL, 1).l(1) && new C0447c(0, CustomDeviceManager.CALL_SCREEN_ALL, 1).l(i5) && new C0447c(0, CustomDeviceManager.CALL_SCREEN_ALL, 1).l(i6)) {
            this.f2005g = NetworkAnalyticsConstants.DataPoints.FLAG_DNS_UID + (i5 << 8) + i6;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: 1." + i5 + '.' + i6).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        AbstractC0219i.e("other", bVar);
        return this.f2005g - bVar.f2005g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && this.f2005g == bVar.f2005g;
    }

    public final int hashCode() {
        return this.f2005g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2003d);
        sb.append('.');
        sb.append(this.f2004e);
        sb.append('.');
        sb.append(this.f);
        return sb.toString();
    }
}
