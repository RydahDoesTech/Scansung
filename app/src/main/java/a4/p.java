package a4;

import I3.G;
import a3.InterfaceC0106a;
import java.util.List;
import p3.InterfaceC0766j;

/* loaded from: classes.dex */
public final class p extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f3075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f3076e;
    public final /* synthetic */ G f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, boolean z4, G g5) {
        super(0);
        this.f3075d = sVar;
        this.f3076e = z4;
        this.f = g5;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        List listO0;
        s sVar = this.f3075d;
        v vVarA = sVar.a((InterfaceC0766j) sVar.f3085a.f);
        if (vVarA != null) {
            k kVar = sVar.f3085a;
            boolean z4 = this.f3076e;
            G g5 = this.f;
            listO0 = z4 ? P2.m.O0(((i) kVar.f3058d).f3041e.R(vVarA, g5)) : P2.m.O0(((i) kVar.f3058d).f3041e.S(vVarA, g5));
        } else {
            listO0 = null;
        }
        return listO0 == null ? P2.u.f2163d : listO0;
    }
}
