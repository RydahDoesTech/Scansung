package g4;

import X3.n;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.G;
import e4.J;
import e4.Z;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends AbstractC0442z {

    /* renamed from: e, reason: collision with root package name */
    public final J f6799e;
    public final e f;

    /* renamed from: g, reason: collision with root package name */
    public final i f6800g;

    /* renamed from: h, reason: collision with root package name */
    public final List f6801h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6802i;

    /* renamed from: j, reason: collision with root package name */
    public final String[] f6803j;

    /* renamed from: k, reason: collision with root package name */
    public final String f6804k;

    public g(J j5, e eVar, i iVar, List list, boolean z4, String... strArr) {
        AbstractC0219i.e("kind", iVar);
        AbstractC0219i.e("arguments", list);
        AbstractC0219i.e("formatParams", strArr);
        this.f6799e = j5;
        this.f = eVar;
        this.f6800g = iVar;
        this.f6801h = list;
        this.f6802i = z4;
        this.f6803j = strArr;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f6804k = String.format(iVar.f6835d, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // e4.AbstractC0438v
    public final G H0() {
        G.f6646e.getClass();
        return G.f;
    }

    @Override // e4.AbstractC0438v
    public final J I0() {
        return this.f6799e;
    }

    @Override // e4.AbstractC0438v
    public final boolean J0() {
        return this.f6802i;
    }

    @Override // e4.AbstractC0438v
    /* renamed from: K0 */
    public final AbstractC0438v N0(f4.f fVar) {
        AbstractC0219i.e("kotlinTypeRefiner", fVar);
        return this;
    }

    @Override // e4.Z
    public final Z N0(f4.f fVar) {
        AbstractC0219i.e("kotlinTypeRefiner", fVar);
        return this;
    }

    @Override // e4.AbstractC0442z, e4.Z
    public final Z O0(G g5) {
        AbstractC0219i.e("newAttributes", g5);
        return this;
    }

    @Override // e4.AbstractC0442z
    /* renamed from: P0 */
    public final AbstractC0442z M0(boolean z4) {
        String[] strArr = this.f6803j;
        return new g(this.f6799e, this.f, this.f6800g, this.f6801h, z4, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // e4.AbstractC0442z
    /* renamed from: Q0 */
    public final AbstractC0442z O0(G g5) {
        AbstractC0219i.e("newAttributes", g5);
        return this;
    }

    @Override // e4.AbstractC0438v
    public final n p0() {
        return this.f;
    }

    @Override // e4.AbstractC0438v
    public final List s0() {
        return this.f6801h;
    }
}
