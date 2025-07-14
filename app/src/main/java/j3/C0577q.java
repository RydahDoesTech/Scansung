package j3;

import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import p3.InterfaceC0748J;
import p3.InterfaceC0759c;

/* renamed from: j3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0577q extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0759c f7429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7430e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0577q(InterfaceC0759c interfaceC0759c, int i5) {
        super(0);
        this.f7429d = interfaceC0759c;
        this.f7430e = i5;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        Object obj = this.f7429d.v0().get(this.f7430e);
        AbstractC0219i.d("descriptor.valueParameters[i]", obj);
        return (InterfaceC0748J) obj;
    }
}
