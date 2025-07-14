package o4;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public final k f8307a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0107b f8308b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8309c;

    public h(k kVar, InterfaceC0107b interfaceC0107b, InterfaceC0107b interfaceC0107b2) {
        AbstractC0219i.e("transformer", interfaceC0107b);
        this.f8307a = kVar;
        this.f8308b = interfaceC0107b;
        this.f8309c = interfaceC0107b2;
    }

    @Override // o4.k
    public final Iterator iterator() {
        return new g(this);
    }
}
