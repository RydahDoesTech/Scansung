package C3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class n extends b3.k implements InterfaceC0107b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f424e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(r rVar, int i5) {
        super(1);
        this.f423d = i5;
        this.f424e = rVar;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        switch (this.f423d) {
            case 0:
                N3.f fVar = (N3.f) obj;
                AbstractC0219i.e("it", fVar);
                return r.v(this.f424e, fVar);
            default:
                N3.f fVar2 = (N3.f) obj;
                AbstractC0219i.e("it", fVar2);
                return r.w(this.f424e, fVar2);
        }
    }
}
