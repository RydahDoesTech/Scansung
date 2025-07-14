package e4;

import a3.InterfaceC0107b;

/* loaded from: classes.dex */
public final class T implements InterfaceC0107b {
    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        if (((N3.c) obj) != null) {
            return Boolean.valueOf(!r1.equals(m3.m.f8140y));
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
    }
}
