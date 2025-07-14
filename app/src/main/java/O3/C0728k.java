package o3;

import b3.AbstractC0219i;
import p3.InterfaceC0781y;
import s3.AbstractC0828D;

/* renamed from: o3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0728k extends AbstractC0828D {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8276j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0728k(InterfaceC0781y interfaceC0781y, N3.c cVar, int i5) {
        super(interfaceC0781y, cVar);
        this.f8276j = i5;
        switch (i5) {
            case 1:
                AbstractC0219i.e("module", interfaceC0781y);
                AbstractC0219i.e("fqName", cVar);
                super(interfaceC0781y, cVar);
                break;
            default:
                break;
        }
    }

    @Override // p3.InterfaceC0742D
    public final /* bridge */ /* synthetic */ X3.n p0() {
        switch (this.f8276j) {
        }
        return X3.m.f2791b;
    }
}
