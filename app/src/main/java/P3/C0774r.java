package p3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.util.List;
import s3.AbstractC0828D;

/* renamed from: p3.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0774r extends b3.k implements InterfaceC0107b {

    /* renamed from: e, reason: collision with root package name */
    public static final C0774r f8434e = new C0774r(1, 0);
    public static final C0774r f = new C0774r(1, 1);

    /* renamed from: g, reason: collision with root package name */
    public static final C0774r f8435g = new C0774r(1, 2);

    /* renamed from: h, reason: collision with root package name */
    public static final C0774r f8436h = new C0774r(1, 3);

    /* renamed from: i, reason: collision with root package name */
    public static final C0774r f8437i = new C0774r(1, 4);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8438d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0774r(int i5, int i6) {
        super(i5);
        this.f8438d = i6;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        switch (this.f8438d) {
            case 0:
                AbstractC0219i.e("it", (N3.b) obj);
                return 0;
            case 1:
                InterfaceC0742D interfaceC0742D = (InterfaceC0742D) obj;
                AbstractC0219i.e("it", interfaceC0742D);
                return ((AbstractC0828D) interfaceC0742D).f8745h;
            case 2:
                InterfaceC0766j interfaceC0766j = (InterfaceC0766j) obj;
                AbstractC0219i.e("it", interfaceC0766j);
                return Boolean.valueOf(interfaceC0766j instanceof InterfaceC0758b);
            case 3:
                AbstractC0219i.e("it", (InterfaceC0766j) obj);
                return Boolean.valueOf(!(r1 instanceof InterfaceC0765i));
            default:
                InterfaceC0766j interfaceC0766j2 = (InterfaceC0766j) obj;
                AbstractC0219i.e("it", interfaceC0766j2);
                List listU = ((InterfaceC0758b) interfaceC0766j2).u();
                AbstractC0219i.d("it as CallableDescriptor).typeParameters", listU);
                return P2.m.p0(listU);
        }
    }
}
