package e4;

import b3.AbstractC0219i;
import p3.InterfaceC0755Q;
import p3.InterfaceC0763g;

/* renamed from: e4.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0436t extends S {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0755Q[] f6696b;

    /* renamed from: c, reason: collision with root package name */
    public final N[] f6697c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6698d;

    public C0436t(InterfaceC0755Q[] interfaceC0755QArr, N[] nArr, boolean z4) {
        AbstractC0219i.e("parameters", interfaceC0755QArr);
        AbstractC0219i.e("arguments", nArr);
        this.f6696b = interfaceC0755QArr;
        this.f6697c = nArr;
        this.f6698d = z4;
    }

    @Override // e4.S
    public final boolean b() {
        return this.f6698d;
    }

    @Override // e4.S
    public final N d(AbstractC0438v abstractC0438v) {
        InterfaceC0763g interfaceC0763gI = abstractC0438v.I0().i();
        InterfaceC0755Q interfaceC0755Q = interfaceC0763gI instanceof InterfaceC0755Q ? (InterfaceC0755Q) interfaceC0763gI : null;
        if (interfaceC0755Q == null) {
            return null;
        }
        int iX0 = interfaceC0755Q.x0();
        InterfaceC0755Q[] interfaceC0755QArr = this.f6696b;
        if (iX0 >= interfaceC0755QArr.length || !AbstractC0219i.a(interfaceC0755QArr[iX0].I(), interfaceC0755Q.I())) {
            return null;
        }
        return this.f6697c[iX0];
    }

    @Override // e4.S
    public final boolean e() {
        return this.f6697c.length == 0;
    }
}
