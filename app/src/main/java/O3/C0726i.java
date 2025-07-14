package o3;

import b3.AbstractC0219i;
import b3.q;
import b3.r;
import g3.InterfaceC0466p;
import k.Q0;
import m3.AbstractC0695h;
import r3.InterfaceC0816b;
import r3.InterfaceC0818d;
import s3.C0826B;

/* renamed from: o3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0726i extends AbstractC0695h {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0466p[] f8270h;
    public m3.k f;

    /* renamed from: g, reason: collision with root package name */
    public final d4.i f8271g;

    static {
        r rVar = q.f5100a;
        f8270h = new InterfaceC0466p[]{rVar.e(new b3.n(rVar.b(C0726i.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0726i(d4.l lVar) {
        super(lVar);
        A3.f.q(1, "kind");
        this.f8271g = new d4.i(lVar, new B3.a(this, 12, lVar));
        int iC = Q0.c(1);
        if (iC == 1) {
            c(false);
        } else {
            if (iC != 2) {
                return;
            }
            c(true);
        }
    }

    public final C0730m H() {
        return (C0730m) V1.a.Q(this.f8271g, f8270h[0]);
    }

    @Override // m3.AbstractC0695h
    public final InterfaceC0816b d() {
        return H();
    }

    @Override // m3.AbstractC0695h
    public final Iterable l() {
        Iterable iterableL = super.l();
        d4.l lVar = this.f8068d;
        C0826B c0826bK = k();
        AbstractC0219i.d("builtInsModule", c0826bK);
        return P2.m.F0(iterableL, new C0724g(lVar, c0826bK));
    }

    @Override // m3.AbstractC0695h
    public final InterfaceC0818d o() {
        return H();
    }
}
