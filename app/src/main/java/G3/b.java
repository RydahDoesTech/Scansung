package G3;

import a3.InterfaceC0108c;
import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class b extends b3.k implements InterfaceC0108c {

    /* renamed from: e, reason: collision with root package name */
    public static final b f737e = new b(2, 0);
    public static final b f = new b(2, 1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f738d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i5, int i6) {
        super(i5);
        this.f738d = i6;
    }

    @Override // a3.InterfaceC0108c
    public final Object c(Object obj, Object obj2) {
        switch (this.f738d) {
            case 0:
                a aVar = (a) obj;
                p pVar = (p) obj2;
                AbstractC0219i.e("$this$loadConstantFromProperty", aVar);
                AbstractC0219i.e("it", pVar);
                return aVar.f736c.get(pVar);
            default:
                a aVar2 = (a) obj;
                p pVar2 = (p) obj2;
                AbstractC0219i.e("$this$loadConstantFromProperty", aVar2);
                AbstractC0219i.e("it", pVar2);
                return aVar2.f735b.get(pVar2);
        }
    }
}
