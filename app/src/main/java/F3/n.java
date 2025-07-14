package F3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import e4.Z;
import o3.C0721d;
import p3.InterfaceC0759c;
import p3.InterfaceC0763g;
import s3.C0867w;

/* loaded from: classes.dex */
public final class n extends b3.k implements InterfaceC0107b {

    /* renamed from: e, reason: collision with root package name */
    public static final n f658e = new n(1, 0);
    public static final n f = new n(1, 1);

    /* renamed from: g, reason: collision with root package name */
    public static final n f659g = new n(1, 2);

    /* renamed from: h, reason: collision with root package name */
    public static final n f660h = new n(1, 3);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f661d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i5, int i6) {
        super(i5);
        this.f661d = i6;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        switch (this.f661d) {
            case 0:
                InterfaceC0763g interfaceC0763gI = ((Z) obj).I0().i();
                if (interfaceC0763gI == null) {
                    return Boolean.FALSE;
                }
                N3.f name = interfaceC0763gI.getName();
                N3.c cVar = C0721d.f;
                return Boolean.valueOf(AbstractC0219i.a(name, cVar.f()) && AbstractC0219i.a(U3.f.c(interfaceC0763gI), cVar));
            case 1:
                InterfaceC0759c interfaceC0759c = (InterfaceC0759c) obj;
                AbstractC0219i.e("it", interfaceC0759c);
                C0867w c0867wB0 = interfaceC0759c.b0();
                AbstractC0219i.b(c0867wB0);
                return c0867wB0.d();
            case 2:
                InterfaceC0759c interfaceC0759c2 = (InterfaceC0759c) obj;
                AbstractC0219i.e("it", interfaceC0759c2);
                AbstractC0438v abstractC0438vO = interfaceC0759c2.o();
                AbstractC0219i.b(abstractC0438vO);
                return abstractC0438vO;
            case 3:
                Z z4 = (Z) obj;
                AbstractC0219i.e("it", z4);
                return Boolean.valueOf(z4 instanceof D3.g);
            default:
                o oVar = (o) obj;
                AbstractC0219i.e("$this$function", oVar);
                String strConcat = "java/util/".concat("Spliterator");
                e eVar = l.f653b;
                oVar.c(strConcat, eVar, eVar);
                return O2.l.f2016a;
        }
    }
}
