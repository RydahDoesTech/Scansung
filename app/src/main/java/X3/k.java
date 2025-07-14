package X3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import p3.InterfaceC0750L;
import p3.InterfaceC0758b;
import s3.C0837M;

/* loaded from: classes.dex */
public final class k extends b3.k implements InterfaceC0107b {

    /* renamed from: e, reason: collision with root package name */
    public static final k f2786e = new k(1, 0);
    public static final k f = new k(1, 1);

    /* renamed from: g, reason: collision with root package name */
    public static final k f2787g = new k(1, 2);

    /* renamed from: h, reason: collision with root package name */
    public static final k f2788h = new k(1, 3);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i5, int i6) {
        super(i5);
        this.f2789d = i6;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        switch (this.f2789d) {
            case 0:
                AbstractC0219i.e("it", (N3.f) obj);
                return Boolean.TRUE;
            case 1:
                InterfaceC0758b interfaceC0758b = (InterfaceC0758b) obj;
                AbstractC0219i.e("$this$selectMostSpecificInEachOverridableGroup", interfaceC0758b);
                return interfaceC0758b;
            case 2:
                C0837M c0837m = (C0837M) obj;
                AbstractC0219i.e("$this$selectMostSpecificInEachOverridableGroup", c0837m);
                return c0837m;
            default:
                InterfaceC0750L interfaceC0750L = (InterfaceC0750L) obj;
                AbstractC0219i.e("$this$selectMostSpecificInEachOverridableGroup", interfaceC0750L);
                return interfaceC0750L;
        }
    }
}
