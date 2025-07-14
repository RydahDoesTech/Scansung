package j3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import java.lang.reflect.Method;
import p3.InterfaceC0750L;
import p3.InterfaceC0776t;
import s3.C0843T;
import v3.AbstractC0897d;

/* renamed from: j3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0562b extends b3.k implements InterfaceC0107b {

    /* renamed from: e, reason: collision with root package name */
    public static final C0562b f7369e = new C0562b(1, 0);
    public static final C0562b f = new C0562b(1, 1);

    /* renamed from: g, reason: collision with root package name */
    public static final C0562b f7370g = new C0562b(1, 2);

    /* renamed from: h, reason: collision with root package name */
    public static final C0562b f7371h = new C0562b(1, 3);

    /* renamed from: i, reason: collision with root package name */
    public static final C0562b f7372i = new C0562b(1, 4);

    /* renamed from: j, reason: collision with root package name */
    public static final C0562b f7373j = new C0562b(1, 5);

    /* renamed from: k, reason: collision with root package name */
    public static final C0562b f7374k = new C0562b(1, 6);

    /* renamed from: l, reason: collision with root package name */
    public static final C0562b f7375l = new C0562b(1, 7);

    /* renamed from: m, reason: collision with root package name */
    public static final C0562b f7376m = new C0562b(1, 8);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7377d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0562b(int i5, int i6) {
        super(i5);
        this.f7377d = i6;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        switch (this.f7377d) {
            case 0:
                Class cls = (Class) obj;
                AbstractC0219i.e("it", cls);
                return new C0585z(cls);
            case 1:
                Class cls2 = (Class) obj;
                AbstractC0219i.e("it", cls2);
                return new S(cls2);
            case 2:
                Class<?> returnType = ((Method) obj).getReturnType();
                AbstractC0219i.d("it.returnType", returnType);
                return AbstractC0897d.b(returnType);
            case 3:
                Class cls3 = (Class) obj;
                AbstractC0219i.d("it", cls3);
                return AbstractC0897d.b(cls3);
            case 4:
                InterfaceC0776t interfaceC0776t = (InterfaceC0776t) obj;
                AbstractC0219i.e("descriptor", interfaceC0776t);
                return P3.g.f2195e.u(interfaceC0776t) + " | " + v0.c(interfaceC0776t).d();
            case 5:
                InterfaceC0750L interfaceC0750L = (InterfaceC0750L) obj;
                AbstractC0219i.e("descriptor", interfaceC0750L);
                return P3.g.f2195e.u(interfaceC0750L) + " | " + v0.b(interfaceC0750L).d();
            case 6:
                P3.g gVar = u0.f7441a;
                AbstractC0438v abstractC0438vD = ((C0843T) obj).d();
                AbstractC0219i.d("it.type", abstractC0438vD);
                return u0.d(abstractC0438vD);
            case 7:
                P3.g gVar2 = u0.f7441a;
                AbstractC0438v abstractC0438vD2 = ((C0843T) obj).d();
                AbstractC0219i.d("it.type", abstractC0438vD2);
                return u0.d(abstractC0438vD2);
            default:
                Class cls4 = (Class) obj;
                AbstractC0219i.d("it", cls4);
                return AbstractC0897d.b(cls4);
        }
    }
}
