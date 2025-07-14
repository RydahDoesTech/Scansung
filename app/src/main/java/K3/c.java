package K3;

import O3.InterfaceC0085q;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0085q[] f1657c;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(int i5, InterfaceC0085q[] interfaceC0085qArr) {
        if (interfaceC0085qArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
        }
        int i6 = 1;
        int length = interfaceC0085qArr.length - 1;
        if (length != 0) {
            for (int i7 = 31; i7 >= 0; i7--) {
                if (((1 << i7) & length) != 0) {
                    i6 = 1 + i7;
                }
            }
            throw new IllegalStateException("Empty enum: " + interfaceC0085qArr.getClass());
        }
        super(i5, i6);
        this.f1657c = interfaceC0085qArr;
    }

    public final Object c(int i5) {
        int i6 = (1 << this.f1659b) - 1;
        int i7 = this.f1658a;
        int i8 = (i5 & (i6 << i7)) >> i7;
        for (InterfaceC0085q interfaceC0085q : this.f1657c) {
            if (interfaceC0085q.a() == i8) {
                return interfaceC0085q;
            }
        }
        return null;
    }
}
