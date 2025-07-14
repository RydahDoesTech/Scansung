package R3;

import P2.u;
import X3.n;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.G;
import e4.J;
import e4.N;
import e4.Z;
import f4.f;
import g4.j;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends AbstractC0442z implements h4.b {

    /* renamed from: e, reason: collision with root package name */
    public final N f2484e;
    public final b f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2485g;

    /* renamed from: h, reason: collision with root package name */
    public final G f2486h;

    public a(N n, b bVar, boolean z4, G g5) {
        AbstractC0219i.e("typeProjection", n);
        AbstractC0219i.e("constructor", bVar);
        AbstractC0219i.e("attributes", g5);
        this.f2484e = n;
        this.f = bVar;
        this.f2485g = z4;
        this.f2486h = g5;
    }

    @Override // e4.AbstractC0438v
    public final G H0() {
        return this.f2486h;
    }

    @Override // e4.AbstractC0438v
    public final J I0() {
        return this.f;
    }

    @Override // e4.AbstractC0438v
    public final boolean J0() {
        return this.f2485g;
    }

    @Override // e4.AbstractC0438v
    public final AbstractC0438v K0(f fVar) {
        AbstractC0219i.e("kotlinTypeRefiner", fVar);
        return new a(this.f2484e.d(fVar), this.f, this.f2485g, this.f2486h);
    }

    @Override // e4.AbstractC0442z, e4.Z
    public final Z M0(boolean z4) {
        if (z4 == this.f2485g) {
            return this;
        }
        return new a(this.f2484e, this.f, z4, this.f2486h);
    }

    @Override // e4.Z
    /* renamed from: N0 */
    public final Z K0(f fVar) {
        AbstractC0219i.e("kotlinTypeRefiner", fVar);
        return new a(this.f2484e.d(fVar), this.f, this.f2485g, this.f2486h);
    }

    @Override // e4.AbstractC0442z
    /* renamed from: P0 */
    public final AbstractC0442z M0(boolean z4) {
        if (z4 == this.f2485g) {
            return this;
        }
        return new a(this.f2484e, this.f, z4, this.f2486h);
    }

    @Override // e4.AbstractC0442z
    /* renamed from: Q0 */
    public final AbstractC0442z O0(G g5) {
        AbstractC0219i.e("newAttributes", g5);
        return new a(this.f2484e, this.f, this.f2485g, g5);
    }

    @Override // e4.AbstractC0438v
    public final n p0() {
        return j.a(1, true, new String[0]);
    }

    @Override // e4.AbstractC0438v
    public final List s0() {
        return u.f2163d;
    }

    @Override // e4.AbstractC0442z
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.f2484e);
        sb.append(')');
        sb.append(this.f2485g ? "?" : "");
        return sb.toString();
    }
}
