package K0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final H0.b f1631a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1632b;

    public e(H0.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f1631a = bVar;
        this.f1632b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f1631a.equals(eVar.f1631a)) {
            return Arrays.equals(this.f1632b, eVar.f1632b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1632b) ^ ((this.f1631a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f1631a + ", bytes=[...]}";
    }
}
