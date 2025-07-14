package r3;

import N3.f;
import P2.u;
import b3.AbstractC0219i;
import c4.r;
import java.util.Collection;
import p3.InterfaceC0761e;

/* renamed from: r3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0815a implements InterfaceC0816b, InterfaceC0818d {

    /* renamed from: b, reason: collision with root package name */
    public static final C0815a f8580b = new C0815a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0815a f8581c = new C0815a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C0815a f8582d = new C0815a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final C0815a f8583e = new C0815a(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8584a;

    public /* synthetic */ C0815a(int i5) {
        this.f8584a = i5;
    }

    @Override // r3.InterfaceC0816b
    public Collection a(f fVar, InterfaceC0761e interfaceC0761e) {
        AbstractC0219i.e("name", fVar);
        AbstractC0219i.e("classDescriptor", interfaceC0761e);
        return u.f2163d;
    }

    @Override // r3.InterfaceC0816b
    public Collection b(InterfaceC0761e interfaceC0761e) {
        AbstractC0219i.e("classDescriptor", interfaceC0761e);
        return u.f2163d;
    }

    @Override // r3.InterfaceC0816b
    public Collection c(InterfaceC0761e interfaceC0761e) {
        AbstractC0219i.e("classDescriptor", interfaceC0761e);
        return u.f2163d;
    }

    @Override // r3.InterfaceC0816b
    public Collection d(InterfaceC0761e interfaceC0761e) {
        AbstractC0219i.e("classDescriptor", interfaceC0761e);
        return u.f2163d;
    }

    @Override // r3.InterfaceC0818d
    public boolean e(InterfaceC0761e interfaceC0761e, r rVar) {
        switch (this.f8584a) {
            case 1:
                AbstractC0219i.e("classDescriptor", interfaceC0761e);
                return true;
            default:
                AbstractC0219i.e("classDescriptor", interfaceC0761e);
                return !rVar.s().e(e.f8585a);
        }
    }
}
