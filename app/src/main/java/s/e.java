package s;

import com.google.android.gms.internal.p000firebaseauthapi.a5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import t.C0870b;
import t.C0871c;
import t.o;

/* loaded from: classes.dex */
public final class e extends C0822d {
    public WeakReference A0;

    /* renamed from: B0, reason: collision with root package name */
    public WeakReference f8667B0;

    /* renamed from: C0, reason: collision with root package name */
    public WeakReference f8668C0;

    /* renamed from: D0, reason: collision with root package name */
    public final C0870b f8669D0;
    public ArrayList k0 = new ArrayList();
    public final D3.c l0 = new D3.c(this);
    public final t.e m0;
    public a5 n0;
    public boolean o0;
    public final r.c p0;
    public int q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f8670r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f8671s0;
    public int t0;

    /* renamed from: u0, reason: collision with root package name */
    public C0820b[] f8672u0;

    /* renamed from: v0, reason: collision with root package name */
    public C0820b[] f8673v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f8674w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f8675x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f8676y0;

    /* renamed from: z0, reason: collision with root package name */
    public WeakReference f8677z0;

    public e() {
        t.e eVar = new t.e();
        eVar.f8921b = true;
        eVar.f8922c = true;
        eVar.f8924e = new ArrayList();
        new ArrayList();
        eVar.f = null;
        eVar.f8925g = new C0870b();
        eVar.f8926h = new ArrayList();
        eVar.f8920a = this;
        eVar.f8923d = this;
        this.m0 = eVar;
        this.n0 = null;
        this.o0 = false;
        this.p0 = new r.c();
        this.f8671s0 = 0;
        this.t0 = 0;
        this.f8672u0 = new C0820b[4];
        this.f8673v0 = new C0820b[4];
        this.f8674w0 = 257;
        this.f8675x0 = false;
        this.f8676y0 = false;
        this.f8677z0 = null;
        this.A0 = null;
        this.f8667B0 = null;
        this.f8668C0 = null;
        this.f8669D0 = new C0870b();
    }

    public static void P(C0822d c0822d, a5 a5Var, C0870b c0870b) {
        int i5;
        int i6;
        if (a5Var == null) {
            return;
        }
        int[] iArr = c0822d.f8651j0;
        c0870b.f8909a = iArr[0];
        c0870b.f8910b = iArr[1];
        c0870b.f8911c = c0822d.n();
        c0870b.f8912d = c0822d.k();
        c0870b.f8916i = false;
        c0870b.f8917j = 0;
        boolean z4 = c0870b.f8909a == 3;
        boolean z5 = c0870b.f8910b == 3;
        boolean z6 = z4 && c0822d.f8624Q > 0.0f;
        boolean z7 = z5 && c0822d.f8624Q > 0.0f;
        if (z4 && c0822d.q(0) && c0822d.f8653l == 0 && !z6) {
            c0870b.f8909a = 2;
            if (z5 && c0822d.f8654m == 0) {
                c0870b.f8909a = 1;
            }
            z4 = false;
        }
        if (z5 && c0822d.q(1) && c0822d.f8654m == 0 && !z7) {
            c0870b.f8910b = 2;
            if (z4 && c0822d.f8653l == 0) {
                c0870b.f8910b = 1;
            }
            z5 = false;
        }
        if (c0822d.w()) {
            c0870b.f8909a = 1;
            z4 = false;
        }
        if (c0822d.x()) {
            c0870b.f8910b = 1;
            z5 = false;
        }
        int[] iArr2 = c0822d.n;
        if (z6) {
            if (iArr2[0] == 4) {
                c0870b.f8909a = 1;
            } else if (!z5) {
                if (c0870b.f8910b == 1) {
                    i6 = c0870b.f8912d;
                } else {
                    c0870b.f8909a = 2;
                    a5Var.b(c0822d, c0870b);
                    i6 = c0870b.f;
                }
                c0870b.f8909a = 1;
                int i7 = c0822d.f8625R;
                if (i7 == 0 || i7 == -1) {
                    c0870b.f8911c = (int) (c0822d.f8624Q * i6);
                } else {
                    c0870b.f8911c = (int) (c0822d.f8624Q / i6);
                }
            }
        }
        if (z7) {
            if (iArr2[1] == 4) {
                c0870b.f8910b = 1;
            } else if (!z4) {
                if (c0870b.f8909a == 1) {
                    i5 = c0870b.f8911c;
                } else {
                    c0870b.f8910b = 2;
                    a5Var.b(c0822d, c0870b);
                    i5 = c0870b.f8913e;
                }
                c0870b.f8910b = 1;
                int i8 = c0822d.f8625R;
                if (i8 == 0 || i8 == -1) {
                    c0870b.f8912d = (int) (i5 / c0822d.f8624Q);
                } else {
                    c0870b.f8912d = (int) (i5 * c0822d.f8624Q);
                }
            }
        }
        a5Var.b(c0822d, c0870b);
        c0822d.H(c0870b.f8913e);
        c0822d.E(c0870b.f);
        c0822d.f8665y = c0870b.f8915h;
        c0822d.B(c0870b.f8914g);
        c0870b.f8917j = 0;
    }

    @Override // s.C0822d
    public final void A(D3.c cVar) {
        super.A(cVar);
        int size = this.k0.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((C0822d) this.k0.get(i5)).A(cVar);
        }
    }

    @Override // s.C0822d
    public final void I(boolean z4, boolean z5) {
        super.I(z4, z5);
        int size = this.k0.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((C0822d) this.k0.get(i5)).I(z4, z5);
        }
    }

    public final void K(C0822d c0822d, int i5) {
        if (i5 == 0) {
            int i6 = this.f8671s0 + 1;
            C0820b[] c0820bArr = this.f8673v0;
            if (i6 >= c0820bArr.length) {
                this.f8673v0 = (C0820b[]) Arrays.copyOf(c0820bArr, c0820bArr.length * 2);
            }
            C0820b[] c0820bArr2 = this.f8673v0;
            int i7 = this.f8671s0;
            c0820bArr2[i7] = new C0820b(c0822d, 0, this.o0);
            this.f8671s0 = i7 + 1;
            return;
        }
        if (i5 == 1) {
            int i8 = this.t0 + 1;
            C0820b[] c0820bArr3 = this.f8672u0;
            if (i8 >= c0820bArr3.length) {
                this.f8672u0 = (C0820b[]) Arrays.copyOf(c0820bArr3, c0820bArr3.length * 2);
            }
            C0820b[] c0820bArr4 = this.f8672u0;
            int i9 = this.t0;
            c0820bArr4[i9] = new C0820b(c0822d, 1, this.o0);
            this.t0 = i9 + 1;
        }
    }

    public final void L(r.c cVar) {
        boolean zQ = Q(64);
        b(cVar, zQ);
        int size = this.k0.size();
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            C0822d c0822d = (C0822d) this.k0.get(i5);
            boolean[] zArr = c0822d.f8620M;
            zArr[0] = false;
            zArr[1] = false;
            if (c0822d instanceof C0819a) {
                z4 = true;
            }
        }
        if (z4) {
            for (int i6 = 0; i6 < size; i6++) {
                C0822d c0822d2 = (C0822d) this.k0.get(i6);
                if (c0822d2 instanceof C0819a) {
                    C0819a c0819a = (C0819a) c0822d2;
                    for (int i7 = 0; i7 < c0819a.l0; i7++) {
                        C0822d c0822d3 = c0819a.k0[i7];
                        int i8 = c0819a.m0;
                        if (i8 == 0 || i8 == 1) {
                            c0822d3.f8620M[0] = true;
                        } else if (i8 == 2 || i8 == 3) {
                            c0822d3.f8620M[1] = true;
                        }
                    }
                }
            }
        }
        for (int i9 = 0; i9 < size; i9++) {
            C0822d c0822d4 = (C0822d) this.k0.get(i9);
            c0822d4.getClass();
            if ((c0822d4 instanceof g) || (c0822d4 instanceof h)) {
                c0822d4.b(cVar, zQ);
            }
        }
        if (r.c.f8530p) {
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < size; i10++) {
                C0822d c0822d5 = (C0822d) this.k0.get(i10);
                c0822d5.getClass();
                if (!(c0822d5 instanceof g) && !(c0822d5 instanceof h)) {
                    hashSet.add(c0822d5);
                }
            }
            a(this, cVar, hashSet, this.f8651j0[0] == 2 ? 0 : 1, false);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0822d c0822d6 = (C0822d) it.next();
                j.b(this, cVar, c0822d6);
                c0822d6.b(cVar, zQ);
            }
        } else {
            for (int i11 = 0; i11 < size; i11++) {
                C0822d c0822d7 = (C0822d) this.k0.get(i11);
                if (c0822d7 instanceof e) {
                    int[] iArr = c0822d7.f8651j0;
                    int i12 = iArr[0];
                    int i13 = iArr[1];
                    if (i12 == 2) {
                        c0822d7.F(1);
                    }
                    if (i13 == 2) {
                        c0822d7.G(1);
                    }
                    c0822d7.b(cVar, zQ);
                    if (i12 == 2) {
                        c0822d7.F(i12);
                    }
                    if (i13 == 2) {
                        c0822d7.G(i13);
                    }
                } else {
                    j.b(this, cVar, c0822d7);
                    if (!(c0822d7 instanceof g) && !(c0822d7 instanceof h)) {
                        c0822d7.b(cVar, zQ);
                    }
                }
            }
        }
        if (this.f8671s0 > 0) {
            j.a(this, cVar, null, 0);
        }
        if (this.t0 > 0) {
            j.a(this, cVar, null, 1);
        }
    }

    public final void M(C0821c c0821c) {
        WeakReference weakReference = this.f8677z0;
        if (weakReference == null || weakReference.get() == null || c0821c.d() > ((C0821c) this.f8677z0.get()).d()) {
            this.f8677z0 = new WeakReference(c0821c);
        }
    }

    public final boolean N(int i5, boolean z4) {
        boolean z5;
        t.e eVar = this.m0;
        e eVar2 = eVar.f8920a;
        boolean z6 = false;
        int iJ = eVar2.j(0);
        int iJ2 = eVar2.j(1);
        int iO = eVar2.o();
        int iP = eVar2.p();
        ArrayList arrayList = eVar.f8924e;
        if (z4 && (iJ == 2 || iJ2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o oVar = (o) it.next();
                if (oVar.f == i5 && !oVar.k()) {
                    z4 = false;
                    break;
                }
            }
            if (i5 == 0) {
                if (z4 && iJ == 2) {
                    eVar2.F(1);
                    eVar2.H(eVar.d(eVar2, 0));
                    eVar2.f8640d.f8954e.d(eVar2.n());
                }
            } else if (z4 && iJ2 == 2) {
                eVar2.G(1);
                eVar2.E(eVar.d(eVar2, 1));
                eVar2.f8642e.f8954e.d(eVar2.k());
            }
        }
        int[] iArr = eVar2.f8651j0;
        if (i5 == 0) {
            int i6 = iArr[0];
            if (i6 == 1 || i6 == 4) {
                int iN = eVar2.n() + iO;
                eVar2.f8640d.f8957i.d(iN);
                eVar2.f8640d.f8954e.d(iN - iO);
                z5 = true;
            }
            z5 = false;
        } else {
            int i7 = iArr[1];
            if (i7 == 1 || i7 == 4) {
                int iK = eVar2.k() + iP;
                eVar2.f8642e.f8957i.d(iK);
                eVar2.f8642e.f8954e.d(iK - iP);
                z5 = true;
            }
            z5 = false;
        }
        eVar.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            o oVar2 = (o) it2.next();
            if (oVar2.f == i5 && (oVar2.f8951b != eVar2 || oVar2.f8955g)) {
                oVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z6 = true;
                break;
            }
            o oVar3 = (o) it3.next();
            if (oVar3.f == i5 && (z5 || oVar3.f8951b != eVar2)) {
                if (!oVar3.f8956h.f8935j || !oVar3.f8957i.f8935j || (!(oVar3 instanceof C0871c) && !oVar3.f8954e.f8935j)) {
                    break;
                }
            }
        }
        eVar2.F(iJ);
        eVar2.G(iJ2);
        return z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x06a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0904  */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O() {
        /*
            Method dump skipped, instructions count: 2320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s.e.O():void");
    }

    public final boolean Q(int i5) {
        return (this.f8674w0 & i5) == i5;
    }

    @Override // s.C0822d
    public final void y() {
        this.p0.t();
        this.q0 = 0;
        this.f8670r0 = 0;
        this.k0.clear();
        super.y();
    }
}
