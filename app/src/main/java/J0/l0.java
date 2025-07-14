package j0;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public int f7222a;

    /* renamed from: b, reason: collision with root package name */
    public int f7223b;

    /* renamed from: c, reason: collision with root package name */
    public int f7224c;

    /* renamed from: d, reason: collision with root package name */
    public int f7225d;

    /* renamed from: e, reason: collision with root package name */
    public int f7226e;

    public final boolean a() {
        int i5 = this.f7222a;
        int i6 = 2;
        if ((i5 & 7) != 0) {
            int i7 = this.f7225d;
            int i8 = this.f7223b;
            if (((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) & i5) == 0) {
                return false;
            }
        }
        if ((i5 & 112) != 0) {
            int i9 = this.f7225d;
            int i10 = this.f7224c;
            if ((((i9 > i10 ? 1 : i9 == i10 ? 2 : 4) << 4) & i5) == 0) {
                return false;
            }
        }
        if ((i5 & 1792) != 0) {
            int i11 = this.f7226e;
            int i12 = this.f7223b;
            if ((((i11 > i12 ? 1 : i11 == i12 ? 2 : 4) << 8) & i5) == 0) {
                return false;
            }
        }
        if ((i5 & 28672) != 0) {
            int i13 = this.f7226e;
            int i14 = this.f7224c;
            if (i13 > i14) {
                i6 = 1;
            } else if (i13 != i14) {
                i6 = 4;
            }
            if (((i6 << 12) & i5) == 0) {
                return false;
            }
        }
        return true;
    }
}
