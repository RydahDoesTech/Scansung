package e4;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.util.List;

/* renamed from: e4.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0439w extends b3.k implements InterfaceC0107b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6703d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ J f6704e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0439w(X3.n nVar, G g5, J j5, List list, boolean z4) {
        super(1);
        this.f6704e = j5;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        switch (this.f6703d) {
            case 0:
                AbstractC0219i.e("refiner", (f4.f) obj);
                this.f6704e.i();
                break;
            default:
                AbstractC0219i.e("kotlinTypeRefiner", (f4.f) obj);
                this.f6704e.i();
                break;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0439w(G g5, J j5, List list, boolean z4) {
        super(1);
        this.f6704e = j5;
    }
}
