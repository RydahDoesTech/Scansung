package S3;

import b3.AbstractC0219i;
import e4.AbstractC0438v;
import p3.InterfaceC0781y;

/* loaded from: classes.dex */
public final class j extends g {

    /* renamed from: b, reason: collision with root package name */
    public final String f2535b;

    public j(String str) {
        super(O2.l.f2016a);
        this.f2535b = str;
    }

    @Override // S3.g
    public final AbstractC0438v a(InterfaceC0781y interfaceC0781y) {
        AbstractC0219i.e("module", interfaceC0781y);
        return g4.j.c(g4.i.f6831w, this.f2535b);
    }

    @Override // S3.g
    public final Object b() {
        throw new UnsupportedOperationException();
    }

    @Override // S3.g
    public final String toString() {
        return this.f2535b;
    }
}
