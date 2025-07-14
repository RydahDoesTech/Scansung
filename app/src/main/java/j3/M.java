package j3;

import a3.InterfaceC0106a;
import r0.AbstractC0807a;

/* loaded from: classes.dex */
public final class M extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S f7342e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(S s2, int i5) {
        super(0);
        this.f7341d = i5;
        this.f7342e = s2;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        switch (this.f7341d) {
            case 0:
                return AbstractC0807a.a(this.f7342e.f7352e);
            default:
                return new P(this.f7342e);
        }
    }
}
