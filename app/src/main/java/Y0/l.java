package Y0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l extends k {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2831c;

    public l(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f2831c = bArr;
    }

    @Override // Y0.k
    public final byte[] z() {
        return this.f2831c;
    }
}
