package y3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import m3.AbstractC0695h;
import p3.InterfaceC0759c;
import p3.InterfaceC0776t;
import r0.AbstractC0809c;
import s3.C0837M;
import s3.C0843T;

/* renamed from: y3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0936e extends b3.k implements InterfaceC0107b {

    /* renamed from: e, reason: collision with root package name */
    public static final C0936e f9399e = new C0936e(1, 0);
    public static final C0936e f = new C0936e(1, 1);

    /* renamed from: g, reason: collision with root package name */
    public static final C0936e f9400g = new C0936e(1, 2);

    /* renamed from: h, reason: collision with root package name */
    public static final C0936e f9401h = new C0936e(1, 3);

    /* renamed from: i, reason: collision with root package name */
    public static final C0936e f9402i = new C0936e(1, 4);

    /* renamed from: j, reason: collision with root package name */
    public static final C0936e f9403j = new C0936e(1, 5);

    /* renamed from: k, reason: collision with root package name */
    public static final C0936e f9404k = new C0936e(1, 6);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9405d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0936e(int i5, int i6) {
        super(i5);
        this.f9405d = i6;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        InterfaceC0759c interfaceC0759cB;
        String strK;
        boolean z4 = false;
        switch (this.f9405d) {
            case 0:
                InterfaceC0759c interfaceC0759c = (InterfaceC0759c) obj;
                AbstractC0219i.e("it", interfaceC0759c);
                int i5 = C0937f.f9406l;
                return Boolean.valueOf(P2.m.q0(F.f, V1.a.k(interfaceC0759c)));
            case 1:
                InterfaceC0759c interfaceC0759c2 = (InterfaceC0759c) obj;
                AbstractC0219i.e("it", interfaceC0759c2);
                if (interfaceC0759c2 instanceof InterfaceC0776t) {
                    int i6 = C0937f.f9406l;
                    if (P2.m.q0(F.f, V1.a.k(interfaceC0759c2))) {
                        z4 = true;
                    }
                }
                return Boolean.valueOf(z4);
            case 2:
                InterfaceC0759c interfaceC0759c3 = (InterfaceC0759c) obj;
                AbstractC0219i.e("it", interfaceC0759c3);
                return Boolean.valueOf(AbstractC0809c.f(interfaceC0759c3));
            case 3:
                return ((C0843T) obj).d();
            case 4:
                InterfaceC0759c interfaceC0759c4 = (InterfaceC0759c) obj;
                AbstractC0219i.e("it", interfaceC0759c4);
                return Boolean.valueOf(AbstractC0809c.f(U3.f.k(interfaceC0759c4)));
            case 5:
                InterfaceC0759c interfaceC0759c5 = (InterfaceC0759c) obj;
                AbstractC0219i.e("it", interfaceC0759c5);
                int i7 = AbstractC0935d.f9398l;
                C0837M c0837m = (C0837M) interfaceC0759c5;
                if (AbstractC0695h.y(c0837m) && U3.f.b(c0837m, new B3.d(24, c0837m)) != null) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            default:
                InterfaceC0759c interfaceC0759c6 = (InterfaceC0759c) obj;
                AbstractC0219i.e("it", interfaceC0759c6);
                if (AbstractC0695h.y(interfaceC0759c6)) {
                    int i8 = C0937f.f9406l;
                    if (F.f9377e.contains(interfaceC0759c6.getName()) && (interfaceC0759cB = U3.f.b(interfaceC0759c6, f)) != null && (strK = V1.a.k(interfaceC0759cB)) != null) {
                        if (!F.f9374b.contains(strK)) {
                        }
                        z4 = true;
                    }
                }
                return Boolean.valueOf(z4);
        }
    }
}
