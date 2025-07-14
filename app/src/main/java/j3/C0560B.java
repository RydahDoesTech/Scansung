package j3;

import a3.InterfaceC0108c;
import p3.AbstractC0771o;
import p3.C0770n;

/* renamed from: j3.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0560B extends b3.k implements InterfaceC0108c {

    /* renamed from: d, reason: collision with root package name */
    public static final C0560B f7325d = new C0560B(2);

    @Override // a3.InterfaceC0108c
    public final Object c(Object obj, Object obj2) {
        Integer numB = AbstractC0771o.b((C0770n) obj, (C0770n) obj2);
        return Integer.valueOf(numB == null ? 0 : numB.intValue());
    }
}
