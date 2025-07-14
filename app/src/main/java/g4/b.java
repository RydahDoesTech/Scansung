package g4;

import b0.C0198c;
import b3.AbstractC0219i;
import java.util.Collection;
import p3.C0770n;
import p3.InterfaceC0752N;
import p3.InterfaceC0757a;
import p3.InterfaceC0759c;
import p3.InterfaceC0761e;
import p3.InterfaceC0766j;
import p3.InterfaceC0775s;
import p3.InterfaceC0776t;
import q3.InterfaceC0798h;
import s3.AbstractC0866v;
import s3.C0837M;

/* loaded from: classes.dex */
public final class b extends C0837M {
    @Override // s3.AbstractC0866v, p3.InterfaceC0758b
    public final Object B0(InterfaceC0757a interfaceC0757a) {
        return null;
    }

    @Override // s3.AbstractC0866v, p3.InterfaceC0759c
    public final void M(Collection collection) {
        AbstractC0219i.e("overriddenDescriptors", collection);
    }

    @Override // s3.AbstractC0866v
    /* renamed from: P0 */
    public final C0837M a0(InterfaceC0761e interfaceC0761e, int i5, C0770n c0770n) {
        AbstractC0219i.e("newOwner", interfaceC0761e);
        A3.f.q(i5, "modality");
        AbstractC0219i.e("visibility", c0770n);
        A3.f.q(2, "kind");
        return this;
    }

    @Override // s3.C0837M, s3.AbstractC0866v
    public final AbstractC0866v Q0(int i5, N3.f fVar, InterfaceC0766j interfaceC0766j, InterfaceC0776t interfaceC0776t, InterfaceC0752N interfaceC0752N, InterfaceC0798h interfaceC0798h) {
        AbstractC0219i.e("newOwner", interfaceC0766j);
        A3.f.q(i5, "kind");
        AbstractC0219i.e("annotations", interfaceC0798h);
        return this;
    }

    @Override // s3.AbstractC0866v, p3.InterfaceC0759c
    public final /* bridge */ /* synthetic */ InterfaceC0759c a0(InterfaceC0761e interfaceC0761e, int i5, C0770n c0770n) {
        a0(interfaceC0761e, i5, c0770n);
        return this;
    }

    @Override // s3.C0837M, s3.AbstractC0866v, p3.InterfaceC0776t
    public final InterfaceC0775s c0() {
        return new C0198c(this);
    }

    @Override // s3.AbstractC0866v, p3.InterfaceC0776t
    public final boolean h() {
        return false;
    }
}
