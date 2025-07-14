package P3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import e4.N;

/* loaded from: classes.dex */
public final class f extends b3.k implements InterfaceC0107b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f2192e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, int i5) {
        super(1);
        this.f2191d = i5;
        this.f2192e = gVar;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        switch (this.f2191d) {
            case 0:
                N n = (N) obj;
                AbstractC0219i.e("it", n);
                if (n.c()) {
                    return "*";
                }
                AbstractC0438v abstractC0438vB = n.b();
                AbstractC0219i.d("it.type", abstractC0438vB);
                String strW = this.f2192e.W(abstractC0438vB);
                if (n.a() == 1) {
                    return strW;
                }
                return A3.f.v(n.a()) + ' ' + strW;
            case 1:
                S3.g gVar = (S3.g) obj;
                AbstractC0219i.e("it", gVar);
                return this.f2192e.z(gVar);
            default:
                AbstractC0438v abstractC0438v = (AbstractC0438v) obj;
                AbstractC0219i.d("it", abstractC0438v);
                return this.f2192e.W(abstractC0438v);
        }
    }
}
