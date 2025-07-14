package C3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import java.lang.reflect.Modifier;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import s3.C0837M;

/* loaded from: classes.dex */
public final class l extends b3.k implements InterfaceC0107b {

    /* renamed from: e, reason: collision with root package name */
    public static final l f417e = new l(1, 0);
    public static final l f = new l(1, 1);

    /* renamed from: g, reason: collision with root package name */
    public static final l f418g = new l(1, 2);

    /* renamed from: h, reason: collision with root package name */
    public static final l f419h = new l(1, 3);

    /* renamed from: i, reason: collision with root package name */
    public static final l f420i = new l(1, 4);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f421d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i5, int i6) {
        super(i5);
        this.f421d = i6;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        switch (this.f421d) {
            case 0:
                AbstractC0219i.e("it", (v3.w) obj);
                return Boolean.valueOf(!Modifier.isStatic(r1.a().getModifiers()));
            case 1:
                C0837M c0837m = (C0837M) obj;
                AbstractC0219i.e("$this$selectMostSpecificInEachOverridableGroup", c0837m);
                return c0837m;
            case 2:
                v3.w wVar = (v3.w) obj;
                AbstractC0219i.e("it", wVar);
                return Boolean.valueOf(Modifier.isStatic(wVar.a().getModifiers()));
            case 3:
                X3.n nVar = (X3.n) obj;
                AbstractC0219i.e("it", nVar);
                return nVar.b();
            default:
                InterfaceC0763g interfaceC0763gI = ((AbstractC0438v) obj).I0().i();
                if (interfaceC0763gI instanceof InterfaceC0761e) {
                    return (InterfaceC0761e) interfaceC0763gI;
                }
                return null;
        }
    }
}
