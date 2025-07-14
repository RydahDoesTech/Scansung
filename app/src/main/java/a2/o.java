package a2;

import j2.InterfaceC0558a;

/* loaded from: classes.dex */
public final class o implements InterfaceC0558a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3009c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f3010a = f3009c;

    /* renamed from: b, reason: collision with root package name */
    public volatile InterfaceC0558a f3011b;

    public o(InterfaceC0558a interfaceC0558a) {
        this.f3011b = interfaceC0558a;
    }

    @Override // j2.InterfaceC0558a
    public final Object get() {
        Object obj = this.f3010a;
        Object obj2 = f3009c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f3010a;
                    if (obj == obj2) {
                        obj = this.f3011b.get();
                        this.f3010a = obj;
                        this.f3011b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
