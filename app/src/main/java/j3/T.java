package j3;

import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import java.lang.reflect.Type;
import p3.InterfaceC0748J;
import p3.InterfaceC0761e;
import p3.InterfaceC0766j;
import s3.C0867w;

/* loaded from: classes.dex */
public final class T extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ U f7354e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(U u4, int i5) {
        super(0);
        this.f7353d = i5;
        this.f7354e = u4;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        switch (this.f7353d) {
            case 0:
                return x0.d(this.f7354e.a());
            default:
                U u4 = this.f7354e;
                InterfaceC0748J interfaceC0748JA = u4.a();
                boolean z4 = interfaceC0748JA instanceof C0867w;
                r rVar = u4.f7356a;
                if (!z4 || !AbstractC0219i.a(x0.g(rVar.l()), interfaceC0748JA) || rVar.l().i0() != 2) {
                    return (Type) rVar.g().p().get(u4.f7357b);
                }
                InterfaceC0766j interfaceC0766jL = rVar.l().l();
                AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", interfaceC0766jL);
                Class clsJ = x0.j((InterfaceC0761e) interfaceC0766jL);
                if (clsJ != null) {
                    return clsJ;
                }
                throw new O2.e("Cannot determine receiver Java type of inherited declaration: " + interfaceC0748JA, 2);
        }
    }
}
