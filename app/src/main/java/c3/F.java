package C3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import x3.EnumC0915b;

/* loaded from: classes.dex */
public final class F extends b3.k implements InterfaceC0107b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N3.f f369e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(N3.f fVar, int i5) {
        super(1);
        this.f368d = i5;
        this.f369e = fVar;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        switch (this.f368d) {
            case 0:
                X3.n nVar = (X3.n) obj;
                AbstractC0219i.e("it", nVar);
                return nVar.c(this.f369e, EnumC0915b.f9318h);
            default:
                X3.n nVar2 = (X3.n) obj;
                AbstractC0219i.e("it", nVar2);
                return nVar2.e(this.f369e, EnumC0915b.f9315d);
        }
    }
}
