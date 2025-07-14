package b3;

import g3.InterfaceC0452b;
import g3.InterfaceC0456f;

/* renamed from: b3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0217g extends AbstractC0212b implements InterfaceC0216f, InterfaceC0456f {

    /* renamed from: j, reason: collision with root package name */
    public final int f5093j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5094k;

    public AbstractC0217g(int i5) {
        this(i5, C0211a.f5085d, null, null, null, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0217g) {
            AbstractC0217g abstractC0217g = (AbstractC0217g) obj;
            return getName().equals(abstractC0217g.getName()) && l().equals(abstractC0217g.l()) && this.f5094k == abstractC0217g.f5094k && this.f5093j == abstractC0217g.f5093j && AbstractC0219i.a(this.f5087e, abstractC0217g.f5087e) && AbstractC0219i.a(j(), abstractC0217g.j());
        }
        if (obj instanceof InterfaceC0456f) {
            return obj.equals(b());
        }
        return false;
    }

    @Override // b3.AbstractC0212b
    public final InterfaceC0452b g() {
        return q.f5100a.a(this);
    }

    public final int hashCode() {
        return l().hashCode() + ((getName().hashCode() + (j() == null ? 0 : j().hashCode() * 31)) * 31);
    }

    @Override // b3.AbstractC0212b
    public final InterfaceC0452b k() {
        InterfaceC0452b interfaceC0452bB = b();
        if (interfaceC0452bB != this) {
            return (InterfaceC0456f) interfaceC0452bB;
        }
        throw new O2.e();
    }

    public final String toString() {
        InterfaceC0452b interfaceC0452bB = b();
        if (interfaceC0452bB != this) {
            return interfaceC0452bB.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public AbstractC0217g(int i5, Object obj) {
        this(i5, obj, null, null, null, 0);
    }

    public AbstractC0217g(int i5, Object obj, Class cls, String str, String str2, int i6) {
        super(obj, cls, str, str2, (i6 & 1) == 1);
        this.f5093j = i5;
        this.f5094k = 0;
    }
}
