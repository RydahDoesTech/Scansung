package K0;

import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f1623a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1624b;

    /* renamed from: c, reason: collision with root package name */
    public final H0.c f1625c;

    public b(String str, byte[] bArr, H0.c cVar) {
        this.f1623a = str;
        this.f1624b = bArr;
        this.f1625c = cVar;
    }

    public static D3.c a() {
        D3.c cVar = new D3.c(1);
        cVar.f508g = H0.c.f806d;
        return cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1623a.equals(bVar.f1623a) && Arrays.equals(this.f1624b, bVar.f1624b) && this.f1625c.equals(bVar.f1625c);
    }

    public final int hashCode() {
        return this.f1625c.hashCode() ^ ((((this.f1623a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f1624b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.f1624b;
        return "TransportContext(" + this.f1623a + ", " + this.f1625c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
