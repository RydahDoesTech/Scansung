package G0;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import j0.AbstractC0522M;

/* loaded from: classes.dex */
public final class d extends AbstractC0522M {

    /* renamed from: a, reason: collision with root package name */
    public f f707a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewPager2 f708b;

    /* renamed from: c, reason: collision with root package name */
    public final n f709c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayoutManager f710d;

    /* renamed from: e, reason: collision with root package name */
    public int f711e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public final c f712g;

    /* renamed from: h, reason: collision with root package name */
    public int f713h;

    /* renamed from: i, reason: collision with root package name */
    public int f714i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f715j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f716k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f717l;

    public d(ViewPager2 viewPager2) {
        this.f708b = viewPager2;
        n nVar = viewPager2.f4986m;
        this.f709c = nVar;
        this.f710d = (LinearLayoutManager) nVar.getLayoutManager();
        this.f712g = new c();
        d();
    }

    @Override // j0.AbstractC0522M
    public final void a(RecyclerView recyclerView, int i5) {
        f fVar;
        f fVar2;
        int i6 = this.f711e;
        boolean z4 = true;
        if (!(i6 == 1 && this.f == 1) && i5 == 1) {
            this.f711e = 1;
            int i7 = this.f714i;
            if (i7 != -1) {
                this.f713h = i7;
                this.f714i = -1;
            } else if (this.f713h == -1) {
                this.f713h = this.f710d.L0();
            }
            c(1);
            return;
        }
        if ((i6 == 1 || i6 == 4) && i5 == 2) {
            if (this.f716k) {
                c(2);
                this.f715j = true;
                return;
            }
            return;
        }
        if (i6 != 1 && i6 != 4) {
            z4 = false;
        }
        c cVar = this.f712g;
        if (z4 && i5 == 0) {
            e();
            if (!this.f716k) {
                int i8 = cVar.f704a;
                if (i8 != -1 && (fVar2 = this.f707a) != null) {
                    fVar2.b(i8, 0.0f, 0);
                }
            } else if (cVar.f706c == 0) {
                int i9 = this.f713h;
                int i10 = cVar.f704a;
                if (i9 != i10 && (fVar = this.f707a) != null) {
                    fVar.c(i10);
                }
            }
            c(0);
            d();
        }
        if (this.f711e == 2 && i5 == 0 && this.f717l) {
            e();
            if (cVar.f706c == 0) {
                int i11 = this.f714i;
                int i12 = cVar.f704a;
                if (i11 != i12) {
                    if (i12 == -1) {
                        i12 = 0;
                    }
                    f fVar3 = this.f707a;
                    if (fVar3 != null) {
                        fVar3.c(i12);
                    }
                }
                c(0);
                d();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    @Override // j0.AbstractC0522M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f716k = r6
            r5.e()
            boolean r0 = r5.f715j
            G0.c r1 = r5.f712g
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L40
            r5.f715j = r3
            if (r8 > 0) goto L28
            if (r8 != 0) goto L30
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.f708b
            G0.i r8 = r8.f4983j
            int r8 = r8.A()
            if (r8 != r6) goto L25
            r8 = r6
            goto L26
        L25:
            r8 = r3
        L26:
            if (r7 != r8) goto L30
        L28:
            int r7 = r1.f706c
            if (r7 == 0) goto L30
            int r7 = r1.f704a
            int r7 = r7 + r6
            goto L32
        L30:
            int r7 = r1.f704a
        L32:
            r5.f714i = r7
            int r8 = r5.f713h
            if (r8 == r7) goto L50
            G0.f r8 = r5.f707a
            if (r8 == 0) goto L50
            r8.c(r7)
            goto L50
        L40:
            int r7 = r5.f711e
            if (r7 != 0) goto L50
            int r7 = r1.f704a
            if (r7 != r2) goto L49
            r7 = r3
        L49:
            G0.f r8 = r5.f707a
            if (r8 == 0) goto L50
            r8.c(r7)
        L50:
            int r7 = r1.f704a
            if (r7 != r2) goto L55
            r7 = r3
        L55:
            float r8 = r1.f705b
            int r0 = r1.f706c
            G0.f r4 = r5.f707a
            if (r4 == 0) goto L60
            r4.b(r7, r8, r0)
        L60:
            int r7 = r1.f704a
            int r8 = r5.f714i
            if (r7 == r8) goto L68
            if (r8 != r2) goto L76
        L68:
            int r7 = r1.f706c
            if (r7 != 0) goto L76
            int r7 = r5.f
            if (r7 == r6) goto L76
            r5.c(r3)
            r5.d()
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.d.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i5) {
        if ((this.f711e == 3 && this.f == 0) || this.f == i5) {
            return;
        }
        this.f = i5;
        f fVar = this.f707a;
        if (fVar != null) {
            fVar.a(i5);
        }
    }

    public final void d() {
        this.f711e = 0;
        this.f = 0;
        c cVar = this.f712g;
        cVar.f704a = -1;
        cVar.f705b = 0.0f;
        cVar.f706c = 0;
        this.f713h = -1;
        this.f714i = -1;
        this.f715j = false;
        this.f716k = false;
        this.f717l = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.d.e():void");
    }
}
