package r;

import java.util.Arrays;
import s.C0821c;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f8530p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f8531q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final e f8534c;
    public C0806b[] f;

    /* renamed from: l, reason: collision with root package name */
    public final D3.c f8542l;

    /* renamed from: o, reason: collision with root package name */
    public C0806b f8544o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f8532a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f8533b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f8535d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f8536e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8537g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean[] f8538h = new boolean[32];

    /* renamed from: i, reason: collision with root package name */
    public int f8539i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f8540j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f8541k = 32;

    /* renamed from: m, reason: collision with root package name */
    public f[] f8543m = new f[f8531q];
    public int n = 0;

    public c() {
        this.f = null;
        this.f = new C0806b[32];
        s();
        D3.c cVar = new D3.c(17);
        cVar.f507e = new I.c();
        cVar.f = new I.c();
        cVar.f508g = new f[32];
        this.f8542l = cVar;
        e eVar = new e(cVar);
        eVar.f = new f[128];
        eVar.f8547g = new f[128];
        eVar.f8548h = 0;
        eVar.f8549i = new d(eVar);
        this.f8534c = eVar;
        this.f8544o = new C0806b(cVar);
    }

    public static int n(Object obj) {
        f fVar = ((C0821c) obj).f8608i;
        if (fVar != null) {
            return (int) (fVar.f8554e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final f a(int i5) {
        I.c cVar = (I.c) this.f8542l.f;
        int i6 = cVar.f846b;
        f fVar = null;
        if (i6 > 0) {
            int i7 = i6 - 1;
            ?? r32 = cVar.f845a;
            ?? r4 = r32[i7];
            r32[i7] = 0;
            cVar.f846b = i7;
            fVar = r4;
        }
        f fVar2 = fVar;
        if (fVar2 == null) {
            fVar2 = new f(i5);
            fVar2.f8560l = i5;
        } else {
            fVar2.c();
            fVar2.f8560l = i5;
        }
        int i8 = this.n;
        int i9 = f8531q;
        if (i8 >= i9) {
            int i10 = i9 * 2;
            f8531q = i10;
            this.f8543m = (f[]) Arrays.copyOf(this.f8543m, i10);
        }
        f[] fVarArr = this.f8543m;
        int i11 = this.n;
        this.n = i11 + 1;
        fVarArr[i11] = fVar2;
        return fVar2;
    }

    public final void b(f fVar, f fVar2, int i5, float f, f fVar3, f fVar4, int i6, int i7) {
        C0806b c0806bL = l();
        if (fVar2 == fVar3) {
            c0806bL.f8528d.g(fVar, 1.0f);
            c0806bL.f8528d.g(fVar4, 1.0f);
            c0806bL.f8528d.g(fVar2, -2.0f);
        } else if (f == 0.5f) {
            c0806bL.f8528d.g(fVar, 1.0f);
            c0806bL.f8528d.g(fVar2, -1.0f);
            c0806bL.f8528d.g(fVar3, -1.0f);
            c0806bL.f8528d.g(fVar4, 1.0f);
            if (i5 > 0 || i6 > 0) {
                c0806bL.f8526b = (-i5) + i6;
            }
        } else if (f <= 0.0f) {
            c0806bL.f8528d.g(fVar, -1.0f);
            c0806bL.f8528d.g(fVar2, 1.0f);
            c0806bL.f8526b = i5;
        } else if (f >= 1.0f) {
            c0806bL.f8528d.g(fVar4, -1.0f);
            c0806bL.f8528d.g(fVar3, 1.0f);
            c0806bL.f8526b = -i6;
        } else {
            float f5 = 1.0f - f;
            c0806bL.f8528d.g(fVar, f5 * 1.0f);
            c0806bL.f8528d.g(fVar2, f5 * (-1.0f));
            c0806bL.f8528d.g(fVar3, (-1.0f) * f);
            c0806bL.f8528d.g(fVar4, 1.0f * f);
            if (i5 > 0 || i6 > 0) {
                c0806bL.f8526b = (i6 * f) + ((-i5) * f5);
            }
        }
        if (i7 != 8) {
            c0806bL.a(this, i7);
        }
        c(c0806bL);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(r.C0806b r17) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r.c.c(r.b):void");
    }

    public final void d(f fVar, int i5) {
        int i6 = fVar.f8552c;
        if (i6 == -1) {
            fVar.d(this, i5);
            for (int i7 = 0; i7 < this.f8533b + 1; i7++) {
                f fVar2 = ((f[]) this.f8542l.f508g)[i7];
            }
            return;
        }
        if (i6 == -1) {
            C0806b c0806bL = l();
            c0806bL.f8525a = fVar;
            float f = i5;
            fVar.f8554e = f;
            c0806bL.f8526b = f;
            c0806bL.f8529e = true;
            c(c0806bL);
            return;
        }
        C0806b c0806b = this.f[i6];
        if (c0806b.f8529e) {
            c0806b.f8526b = i5;
            return;
        }
        if (c0806b.f8528d.d() == 0) {
            c0806b.f8529e = true;
            c0806b.f8526b = i5;
            return;
        }
        C0806b c0806bL2 = l();
        if (i5 < 0) {
            c0806bL2.f8526b = i5 * (-1);
            c0806bL2.f8528d.g(fVar, 1.0f);
        } else {
            c0806bL2.f8526b = i5;
            c0806bL2.f8528d.g(fVar, -1.0f);
        }
        c(c0806bL2);
    }

    public final void e(f fVar, f fVar2, int i5, int i6) {
        if (i6 == 8 && fVar2.f && fVar.f8552c == -1) {
            fVar.d(this, fVar2.f8554e + i5);
            return;
        }
        C0806b c0806bL = l();
        boolean z4 = false;
        if (i5 != 0) {
            if (i5 < 0) {
                i5 *= -1;
                z4 = true;
            }
            c0806bL.f8526b = i5;
        }
        if (z4) {
            c0806bL.f8528d.g(fVar, 1.0f);
            c0806bL.f8528d.g(fVar2, -1.0f);
        } else {
            c0806bL.f8528d.g(fVar, -1.0f);
            c0806bL.f8528d.g(fVar2, 1.0f);
        }
        if (i6 != 8) {
            c0806bL.a(this, i6);
        }
        c(c0806bL);
    }

    public final void f(f fVar, f fVar2, int i5, int i6) {
        C0806b c0806bL = l();
        f fVarM = m();
        fVarM.f8553d = 0;
        c0806bL.b(fVar, fVar2, fVarM, i5);
        if (i6 != 8) {
            c0806bL.f8528d.g(j(i6), (int) (c0806bL.f8528d.c(fVarM) * (-1.0f)));
        }
        c(c0806bL);
    }

    public final void g(f fVar, f fVar2, int i5, int i6) {
        C0806b c0806bL = l();
        f fVarM = m();
        fVarM.f8553d = 0;
        c0806bL.c(fVar, fVar2, fVarM, i5);
        if (i6 != 8) {
            c0806bL.f8528d.g(j(i6), (int) (c0806bL.f8528d.c(fVarM) * (-1.0f)));
        }
        c(c0806bL);
    }

    public final void h(C0806b c0806b) {
        int i5;
        if (c0806b.f8529e) {
            c0806b.f8525a.d(this, c0806b.f8526b);
        } else {
            C0806b[] c0806bArr = this.f;
            int i6 = this.f8540j;
            c0806bArr[i6] = c0806b;
            f fVar = c0806b.f8525a;
            fVar.f8552c = i6;
            this.f8540j = i6 + 1;
            fVar.e(this, c0806b);
        }
        if (this.f8532a) {
            int i7 = 0;
            while (i7 < this.f8540j) {
                if (this.f[i7] == null) {
                    System.out.println("WTF");
                }
                C0806b c0806b2 = this.f[i7];
                if (c0806b2 != null && c0806b2.f8529e) {
                    c0806b2.f8525a.d(this, c0806b2.f8526b);
                    ((I.c) this.f8542l.f507e).b(c0806b2);
                    this.f[i7] = null;
                    int i8 = i7 + 1;
                    int i9 = i8;
                    while (true) {
                        i5 = this.f8540j;
                        if (i8 >= i5) {
                            break;
                        }
                        C0806b[] c0806bArr2 = this.f;
                        int i10 = i8 - 1;
                        C0806b c0806b3 = c0806bArr2[i8];
                        c0806bArr2[i10] = c0806b3;
                        f fVar2 = c0806b3.f8525a;
                        if (fVar2.f8552c == i8) {
                            fVar2.f8552c = i10;
                        }
                        i9 = i8;
                        i8++;
                    }
                    if (i9 < i5) {
                        this.f[i9] = null;
                    }
                    this.f8540j = i5 - 1;
                    i7--;
                }
                i7++;
            }
            this.f8532a = false;
        }
    }

    public final void i() {
        for (int i5 = 0; i5 < this.f8540j; i5++) {
            C0806b c0806b = this.f[i5];
            c0806b.f8525a.f8554e = c0806b.f8526b;
        }
    }

    public final f j(int i5) {
        if (this.f8539i + 1 >= this.f8536e) {
            o();
        }
        f fVarA = a(4);
        int i6 = this.f8533b + 1;
        this.f8533b = i6;
        this.f8539i++;
        fVarA.f8551b = i6;
        fVarA.f8553d = i5;
        ((f[]) this.f8542l.f508g)[i6] = fVarA;
        e eVar = this.f8534c;
        eVar.f8549i.f8545d = fVarA;
        float[] fArr = fVarA.f8556h;
        Arrays.fill(fArr, 0.0f);
        fArr[fVarA.f8553d] = 1.0f;
        eVar.j(fVarA);
        return fVarA;
    }

    public final f k(Object obj) {
        f fVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f8539i + 1 >= this.f8536e) {
            o();
        }
        if (obj instanceof C0821c) {
            C0821c c0821c = (C0821c) obj;
            fVar = c0821c.f8608i;
            if (fVar == null) {
                c0821c.k();
                fVar = c0821c.f8608i;
            }
            int i5 = fVar.f8551b;
            D3.c cVar = this.f8542l;
            if (i5 == -1 || i5 > this.f8533b || ((f[]) cVar.f508g)[i5] == null) {
                if (i5 != -1) {
                    fVar.c();
                }
                int i6 = this.f8533b + 1;
                this.f8533b = i6;
                this.f8539i++;
                fVar.f8551b = i6;
                fVar.f8560l = 1;
                ((f[]) cVar.f508g)[i6] = fVar;
            }
        }
        return fVar;
    }

    public final C0806b l() {
        Object obj;
        D3.c cVar = this.f8542l;
        I.c cVar2 = (I.c) cVar.f507e;
        int i5 = cVar2.f846b;
        if (i5 > 0) {
            int i6 = i5 - 1;
            Object[] objArr = cVar2.f845a;
            obj = objArr[i6];
            objArr[i6] = null;
            cVar2.f846b = i6;
        } else {
            obj = null;
        }
        C0806b c0806b = (C0806b) obj;
        if (c0806b == null) {
            return new C0806b(cVar);
        }
        c0806b.f8525a = null;
        c0806b.f8528d.b();
        c0806b.f8526b = 0.0f;
        c0806b.f8529e = false;
        return c0806b;
    }

    public final f m() {
        if (this.f8539i + 1 >= this.f8536e) {
            o();
        }
        f fVarA = a(3);
        int i5 = this.f8533b + 1;
        this.f8533b = i5;
        this.f8539i++;
        fVarA.f8551b = i5;
        ((f[]) this.f8542l.f508g)[i5] = fVarA;
        return fVarA;
    }

    public final void o() {
        int i5 = this.f8535d * 2;
        this.f8535d = i5;
        this.f = (C0806b[]) Arrays.copyOf(this.f, i5);
        D3.c cVar = this.f8542l;
        cVar.f508g = (f[]) Arrays.copyOf((f[]) cVar.f508g, this.f8535d);
        int i6 = this.f8535d;
        this.f8538h = new boolean[i6];
        this.f8536e = i6;
        this.f8541k = i6;
    }

    public final void p() {
        e eVar = this.f8534c;
        if (eVar.e()) {
            i();
            return;
        }
        if (!this.f8537g) {
            q(eVar);
            return;
        }
        for (int i5 = 0; i5 < this.f8540j; i5++) {
            if (!this.f[i5].f8529e) {
                q(eVar);
                return;
            }
        }
        i();
    }

    public final void q(e eVar) {
        int i5 = 0;
        while (true) {
            if (i5 >= this.f8540j) {
                break;
            }
            C0806b c0806b = this.f[i5];
            int i6 = 1;
            if (c0806b.f8525a.f8560l != 1) {
                float f = 0.0f;
                if (c0806b.f8526b < 0.0f) {
                    boolean z4 = false;
                    int i7 = 0;
                    while (!z4) {
                        i7 += i6;
                        float f5 = Float.MAX_VALUE;
                        int i8 = -1;
                        int i9 = -1;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < this.f8540j) {
                            C0806b c0806b2 = this.f[i10];
                            if (c0806b2.f8525a.f8560l != i6 && !c0806b2.f8529e && c0806b2.f8526b < f) {
                                int iD = c0806b2.f8528d.d();
                                int i12 = 0;
                                while (i12 < iD) {
                                    f fVarE = c0806b2.f8528d.e(i12);
                                    float fC = c0806b2.f8528d.c(fVarE);
                                    if (fC > f) {
                                        for (int i13 = 0; i13 < 9; i13++) {
                                            float f6 = fVarE.f8555g[i13] / fC;
                                            if ((f6 < f5 && i13 == i11) || i13 > i11) {
                                                i11 = i13;
                                                i9 = fVarE.f8551b;
                                                i8 = i10;
                                                f5 = f6;
                                            }
                                        }
                                    }
                                    i12++;
                                    f = 0.0f;
                                }
                            }
                            i10++;
                            f = 0.0f;
                            i6 = 1;
                        }
                        if (i8 != -1) {
                            C0806b c0806b3 = this.f[i8];
                            c0806b3.f8525a.f8552c = -1;
                            c0806b3.g(((f[]) this.f8542l.f508g)[i9]);
                            f fVar = c0806b3.f8525a;
                            fVar.f8552c = i8;
                            fVar.e(this, c0806b3);
                        } else {
                            z4 = true;
                        }
                        if (i7 > this.f8539i / 2) {
                            z4 = true;
                        }
                        f = 0.0f;
                        i6 = 1;
                    }
                }
            }
            i5++;
        }
        r(eVar);
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0090 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(r.C0806b r17) {
        /*
            Method dump skipped, instructions count: 175
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r.c.r(r.b):void");
    }

    public final void s() {
        for (int i5 = 0; i5 < this.f8540j; i5++) {
            C0806b c0806b = this.f[i5];
            if (c0806b != null) {
                ((I.c) this.f8542l.f507e).b(c0806b);
            }
            this.f[i5] = null;
        }
    }

    public final void t() {
        D3.c cVar;
        int i5 = 0;
        while (true) {
            cVar = this.f8542l;
            f[] fVarArr = (f[]) cVar.f508g;
            if (i5 >= fVarArr.length) {
                break;
            }
            f fVar = fVarArr[i5];
            if (fVar != null) {
                fVar.c();
            }
            i5++;
        }
        I.c cVar2 = (I.c) cVar.f;
        f[] fVarArr2 = this.f8543m;
        int length = this.n;
        cVar2.getClass();
        if (length > fVarArr2.length) {
            length = fVarArr2.length;
        }
        for (int i6 = 0; i6 < length; i6++) {
            f fVar2 = fVarArr2[i6];
            int i7 = cVar2.f846b;
            Object[] objArr = cVar2.f845a;
            if (i7 < objArr.length) {
                objArr[i7] = fVar2;
                cVar2.f846b = i7 + 1;
            }
        }
        this.n = 0;
        Arrays.fill((f[]) cVar.f508g, (Object) null);
        this.f8533b = 0;
        e eVar = this.f8534c;
        eVar.f8548h = 0;
        eVar.f8526b = 0.0f;
        this.f8539i = 1;
        for (int i8 = 0; i8 < this.f8540j; i8++) {
            C0806b c0806b = this.f[i8];
        }
        s();
        this.f8540j = 0;
        this.f8544o = new C0806b(cVar);
    }
}
