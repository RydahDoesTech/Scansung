package m3;

import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import java.util.ServiceLoader;

/* renamed from: m3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0688a extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0688a f8055d = new C0688a(0);

    @Override // a3.InterfaceC0106a
    public final Object a() {
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(InterfaceC0690c.class, InterfaceC0690c.class.getClassLoader());
        AbstractC0219i.d("implementations", serviceLoaderLoad);
        InterfaceC0690c interfaceC0690c = (InterfaceC0690c) P2.m.v0(serviceLoaderLoad);
        if (interfaceC0690c != null) {
            return interfaceC0690c;
        }
        throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
    }
}
