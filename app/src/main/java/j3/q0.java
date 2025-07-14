package j3;

import a3.InterfaceC0106a;
import java.lang.ref.SoftReference;
import p3.InterfaceC0759c;

/* loaded from: classes.dex */
public final class q0 extends s0 implements InterfaceC0106a {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0106a f7431e;
    public volatile SoftReference f;

    public q0(InterfaceC0759c interfaceC0759c, InterfaceC0106a interfaceC0106a) {
        if (interfaceC0106a == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
        }
        this.f = null;
        this.f7431e = interfaceC0106a;
        if (interfaceC0759c != null) {
            this.f = new SoftReference(interfaceC0759c);
        }
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        Object obj;
        SoftReference softReference = this.f;
        Object obj2 = s0.f7436d;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objA = this.f7431e.a();
        if (objA != null) {
            obj2 = objA;
        }
        this.f = new SoftReference(obj2);
        return objA;
    }
}
