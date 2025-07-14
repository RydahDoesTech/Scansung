package androidx.lifecycle;

import b0.C0199d;

/* loaded from: classes.dex */
public interface a0 {
    default X c(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    default X u(Class cls, C0199d c0199d) {
        return c(cls);
    }
}
