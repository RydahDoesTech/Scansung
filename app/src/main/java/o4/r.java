package o4;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class r implements k {

    /* renamed from: a, reason: collision with root package name */
    public final k f8323a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0107b f8324b;

    public r(k kVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("transformer", interfaceC0107b);
        this.f8323a = kVar;
        this.f8324b = interfaceC0107b;
    }

    @Override // o4.k
    public final Iterator iterator() {
        return new q(this);
    }
}
