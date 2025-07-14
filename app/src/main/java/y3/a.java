package Y3;

import N3.f;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import p3.InterfaceC0758b;
import p3.InterfaceC0761e;
import p3.InterfaceC0767k;
import s3.AbstractC0860p;

/* loaded from: classes.dex */
public final class a extends H3.c implements d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2837e = 1;
    public final f f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0767k f2838g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(InterfaceC0758b interfaceC0758b, AbstractC0438v abstractC0438v, f fVar) {
        super(abstractC0438v);
        AbstractC0219i.e("receiverType", abstractC0438v);
        this.f2838g = (AbstractC0860p) interfaceC0758b;
        this.f = fVar;
    }

    public final f M0() {
        switch (this.f2837e) {
        }
        return this.f;
    }

    public final String toString() {
        switch (this.f2837e) {
            case 0:
                return d() + ": Ctx { " + ((InterfaceC0761e) this.f2838g) + " }";
            default:
                return "Cxt { " + ((AbstractC0860p) this.f2838g) + " }";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC0761e interfaceC0761e, AbstractC0438v abstractC0438v, f fVar) {
        super(abstractC0438v);
        AbstractC0219i.e("receiverType", abstractC0438v);
        this.f2838g = interfaceC0761e;
        this.f = fVar;
    }
}
