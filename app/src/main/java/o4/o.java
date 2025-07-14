package o4;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class o extends b3.k implements InterfaceC0107b {

    /* renamed from: e, reason: collision with root package name */
    public static final o f8317e = new o(1, 0);
    public static final o f = new o(1, 1);

    /* renamed from: g, reason: collision with root package name */
    public static final o f8318g = new o(1, 2);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8319d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i5, int i6) {
        super(i5);
        this.f8319d = i6;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        switch (this.f8319d) {
            case 0:
                k kVar = (k) obj;
                AbstractC0219i.e("it", kVar);
                return kVar.iterator();
            case 1:
                return obj;
            default:
                return Boolean.valueOf(obj == null);
        }
    }
}
