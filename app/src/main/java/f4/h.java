package f4;

import P2.u;
import b3.AbstractC0219i;
import e4.AbstractC0442z;
import e4.G;
import e4.J;
import e4.N;
import e4.Z;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends AbstractC0442z implements h4.b {

    /* renamed from: e, reason: collision with root package name */
    public final int f6742e;
    public final i f;

    /* renamed from: g, reason: collision with root package name */
    public final Z f6743g;

    /* renamed from: h, reason: collision with root package name */
    public final G f6744h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6745i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f6746j;

    public h(int i5, i iVar, Z z4, G g5, boolean z5, boolean z6) {
        A3.f.q(i5, "captureStatus");
        AbstractC0219i.e("constructor", iVar);
        AbstractC0219i.e("attributes", g5);
        this.f6742e = i5;
        this.f = iVar;
        this.f6743g = z4;
        this.f6744h = g5;
        this.f6745i = z5;
        this.f6746j = z6;
    }

    @Override // e4.AbstractC0438v
    public final G H0() {
        return this.f6744h;
    }

    @Override // e4.AbstractC0438v
    public final J I0() {
        return this.f;
    }

    @Override // e4.AbstractC0438v
    public final boolean J0() {
        return this.f6745i;
    }

    @Override // e4.AbstractC0442z, e4.Z
    public final Z M0(boolean z4) {
        return new h(this.f6742e, this.f, this.f6743g, this.f6744h, z4, 32);
    }

    @Override // e4.AbstractC0442z
    /* renamed from: P0 */
    public final AbstractC0442z M0(boolean z4) {
        return new h(this.f6742e, this.f, this.f6743g, this.f6744h, z4, 32);
    }

    @Override // e4.AbstractC0442z
    /* renamed from: Q0 */
    public final AbstractC0442z O0(G g5) {
        AbstractC0219i.e("newAttributes", g5);
        return new h(this.f6742e, this.f, this.f6743g, g5, this.f6745i, this.f6746j);
    }

    @Override // e4.Z
    /* renamed from: R0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final h K0(f fVar) {
        AbstractC0219i.e("kotlinTypeRefiner", fVar);
        i iVar = this.f;
        iVar.getClass();
        N nD = iVar.f6747a.d(fVar);
        B3.a aVar = iVar.f6748b != null ? new B3.a(iVar, 7, fVar) : null;
        i iVar2 = iVar.f6749c;
        if (iVar2 == null) {
            iVar2 = iVar;
        }
        i iVar3 = new i(nD, aVar, iVar2, iVar.f6750d);
        Z z4 = this.f6743g;
        return new h(this.f6742e, iVar3, z4 != null ? z4 : null, this.f6744h, this.f6745i, 32);
    }

    @Override // e4.AbstractC0438v
    public final X3.n p0() {
        return g4.j.a(1, true, new String[0]);
    }

    @Override // e4.AbstractC0438v
    public final List s0() {
        return u.f2163d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(int i5, i iVar, Z z4, G g5, boolean z5, int i6) {
        if ((i6 & 8) != 0) {
            G.f6646e.getClass();
            g5 = G.f;
        }
        this(i5, iVar, z4, g5, (i6 & 16) != 0 ? false : z5, false);
    }
}
