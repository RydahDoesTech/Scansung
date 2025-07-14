package u;

import android.view.ViewGroup;
import s.C0822d;

/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public float f8993A;

    /* renamed from: B, reason: collision with root package name */
    public String f8994B;

    /* renamed from: C, reason: collision with root package name */
    public int f8995C;

    /* renamed from: D, reason: collision with root package name */
    public float f8996D;
    public float E;

    /* renamed from: F, reason: collision with root package name */
    public int f8997F;

    /* renamed from: G, reason: collision with root package name */
    public int f8998G;

    /* renamed from: H, reason: collision with root package name */
    public int f8999H;

    /* renamed from: I, reason: collision with root package name */
    public int f9000I;

    /* renamed from: J, reason: collision with root package name */
    public int f9001J;

    /* renamed from: K, reason: collision with root package name */
    public int f9002K;

    /* renamed from: L, reason: collision with root package name */
    public int f9003L;

    /* renamed from: M, reason: collision with root package name */
    public int f9004M;

    /* renamed from: N, reason: collision with root package name */
    public float f9005N;

    /* renamed from: O, reason: collision with root package name */
    public float f9006O;

    /* renamed from: P, reason: collision with root package name */
    public int f9007P;

    /* renamed from: Q, reason: collision with root package name */
    public int f9008Q;

    /* renamed from: R, reason: collision with root package name */
    public int f9009R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f9010S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f9011T;

    /* renamed from: U, reason: collision with root package name */
    public String f9012U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f9013V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f9014W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f9015X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f9016Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f9017Z;

    /* renamed from: a, reason: collision with root package name */
    public int f9018a;

    /* renamed from: a0, reason: collision with root package name */
    public int f9019a0;

    /* renamed from: b, reason: collision with root package name */
    public int f9020b;

    /* renamed from: b0, reason: collision with root package name */
    public int f9021b0;

    /* renamed from: c, reason: collision with root package name */
    public float f9022c;

    /* renamed from: c0, reason: collision with root package name */
    public int f9023c0;

    /* renamed from: d, reason: collision with root package name */
    public int f9024d;

    /* renamed from: d0, reason: collision with root package name */
    public int f9025d0;

    /* renamed from: e, reason: collision with root package name */
    public int f9026e;

    /* renamed from: e0, reason: collision with root package name */
    public int f9027e0;
    public int f;

    /* renamed from: f0, reason: collision with root package name */
    public int f9028f0;

    /* renamed from: g, reason: collision with root package name */
    public int f9029g;
    public float g0;

    /* renamed from: h, reason: collision with root package name */
    public int f9030h;

    /* renamed from: h0, reason: collision with root package name */
    public int f9031h0;

    /* renamed from: i, reason: collision with root package name */
    public int f9032i;

    /* renamed from: i0, reason: collision with root package name */
    public int f9033i0;

    /* renamed from: j, reason: collision with root package name */
    public int f9034j;

    /* renamed from: j0, reason: collision with root package name */
    public float f9035j0;

    /* renamed from: k, reason: collision with root package name */
    public int f9036k;
    public C0822d k0;

    /* renamed from: l, reason: collision with root package name */
    public int f9037l;

    /* renamed from: m, reason: collision with root package name */
    public int f9038m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public float f9039o;

    /* renamed from: p, reason: collision with root package name */
    public int f9040p;

    /* renamed from: q, reason: collision with root package name */
    public int f9041q;

    /* renamed from: r, reason: collision with root package name */
    public int f9042r;

    /* renamed from: s, reason: collision with root package name */
    public int f9043s;

    /* renamed from: t, reason: collision with root package name */
    public int f9044t;

    /* renamed from: u, reason: collision with root package name */
    public int f9045u;

    /* renamed from: v, reason: collision with root package name */
    public int f9046v;

    /* renamed from: w, reason: collision with root package name */
    public int f9047w;

    /* renamed from: x, reason: collision with root package name */
    public int f9048x;

    /* renamed from: y, reason: collision with root package name */
    public int f9049y;

    /* renamed from: z, reason: collision with root package name */
    public float f9050z;

    public final void a() {
        this.f9016Y = false;
        this.f9013V = true;
        this.f9014W = true;
        int i5 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i5 == -2 && this.f9010S) {
            this.f9013V = false;
            if (this.f8999H == 0) {
                this.f8999H = 1;
            }
        }
        int i6 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i6 == -2 && this.f9011T) {
            this.f9014W = false;
            if (this.f9000I == 0) {
                this.f9000I = 1;
            }
        }
        if (i5 == 0 || i5 == -1) {
            this.f9013V = false;
            if (i5 == 0 && this.f8999H == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f9010S = true;
            }
        }
        if (i6 == 0 || i6 == -1) {
            this.f9014W = false;
            if (i6 == 0 && this.f9000I == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f9011T = true;
            }
        }
        if (this.f9022c == -1.0f && this.f9018a == -1 && this.f9020b == -1) {
            return;
        }
        this.f9016Y = true;
        this.f9013V = true;
        this.f9014W = true;
        if (!(this.k0 instanceof s.h)) {
            this.k0 = new s.h();
        }
        ((s.h) this.k0).L(this.f9009R);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void resolveLayoutDirection(int r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u.e.resolveLayoutDirection(int):void");
    }
}
