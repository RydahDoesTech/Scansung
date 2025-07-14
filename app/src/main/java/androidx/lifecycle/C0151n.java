package androidx.lifecycle;

import b3.AbstractC0219i;

/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0151n {
    public static EnumC0153p a(EnumC0154q enumC0154q) {
        AbstractC0219i.e("state", enumC0154q);
        int iOrdinal = enumC0154q.ordinal();
        if (iOrdinal == 2) {
            return EnumC0153p.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return EnumC0153p.ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return EnumC0153p.ON_PAUSE;
    }

    public static EnumC0153p b(EnumC0154q enumC0154q) {
        AbstractC0219i.e("state", enumC0154q);
        int iOrdinal = enumC0154q.ordinal();
        if (iOrdinal == 1) {
            return EnumC0153p.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return EnumC0153p.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return EnumC0153p.ON_RESUME;
    }

    public static EnumC0153p c(EnumC0154q enumC0154q) {
        AbstractC0219i.e("state", enumC0154q);
        int iOrdinal = enumC0154q.ordinal();
        if (iOrdinal == 2) {
            return EnumC0153p.ON_CREATE;
        }
        if (iOrdinal == 3) {
            return EnumC0153p.ON_START;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return EnumC0153p.ON_RESUME;
    }
}
