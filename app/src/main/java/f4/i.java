package f4;

import C3.C0012d;
import P2.u;
import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import e4.N;
import g3.y;
import java.util.Collection;
import java.util.List;
import m3.AbstractC0695h;
import p3.InterfaceC0755Q;
import p3.InterfaceC0763g;

/* loaded from: classes.dex */
public final class i implements R3.b {

    /* renamed from: a, reason: collision with root package name */
    public final N f6747a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0106a f6748b;

    /* renamed from: c, reason: collision with root package name */
    public final i f6749c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0755Q f6750d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6751e;

    public i(N n, InterfaceC0106a interfaceC0106a, i iVar, InterfaceC0755Q interfaceC0755Q) {
        AbstractC0219i.e("projection", n);
        this.f6747a = n;
        this.f6748b = interfaceC0106a;
        this.f6749c = iVar;
        this.f6750d = interfaceC0755Q;
        this.f6751e = y.M(2, new C0012d(18, this));
    }

    @Override // R3.b
    public final N a() {
        return this.f6747a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor", obj);
        i iVar = (i) obj;
        i iVar2 = this.f6749c;
        if (iVar2 != null) {
            this = iVar2;
        }
        i iVar3 = iVar.f6749c;
        if (iVar3 != null) {
            iVar = iVar3;
        }
        return this == iVar;
    }

    @Override // e4.J
    public final AbstractC0695h g() {
        AbstractC0438v abstractC0438vB = this.f6747a.b();
        AbstractC0219i.d("projection.type", abstractC0438vB);
        return V1.a.x(abstractC0438vB);
    }

    @Override // e4.J
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        i iVar = this.f6749c;
        return iVar != null ? iVar.hashCode() : super.hashCode();
    }

    @Override // e4.J
    public final InterfaceC0763g i() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O2.c, java.lang.Object] */
    @Override // e4.J
    public final Collection j() {
        List list = (List) this.f6751e.getValue();
        return list == null ? u.f2163d : list;
    }

    @Override // e4.J
    public final List k() {
        return u.f2163d;
    }

    public final String toString() {
        return "CapturedType(" + this.f6747a + ')';
    }

    public /* synthetic */ i(N n, c4.d dVar, i iVar, InterfaceC0755Q interfaceC0755Q, int i5) {
        this(n, (i5 & 2) != 0 ? null : dVar, (i5 & 4) != 0 ? null : iVar, (i5 & 8) != 0 ? null : interfaceC0755Q);
    }
}
