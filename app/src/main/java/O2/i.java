package O2;

import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class i implements c, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0106a f2011d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f2012e = k.f2015a;
    public final Object f = this;

    public i(InterfaceC0106a interfaceC0106a) {
        this.f2011d = interfaceC0106a;
    }

    @Override // O2.c
    public final Object getValue() {
        Object objA;
        Object obj = this.f2012e;
        k kVar = k.f2015a;
        if (obj != kVar) {
            return obj;
        }
        synchronized (this.f) {
            objA = this.f2012e;
            if (objA == kVar) {
                InterfaceC0106a interfaceC0106a = this.f2011d;
                AbstractC0219i.b(interfaceC0106a);
                objA = interfaceC0106a.a();
                this.f2012e = objA;
                this.f2011d = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.f2012e != k.f2015a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
