package r;

import java.util.ArrayList;

/* renamed from: r.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0806b {

    /* renamed from: d, reason: collision with root package name */
    public final C0805a f8528d;

    /* renamed from: a, reason: collision with root package name */
    public f f8525a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f8526b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f8527c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f8529e = false;

    public C0806b(D3.c cVar) {
        this.f8528d = new C0805a(this, cVar);
    }

    public final void a(c cVar, int i5) {
        this.f8528d.g(cVar.j(i5), 1.0f);
        this.f8528d.g(cVar.j(i5), -1.0f);
    }

    public final void b(f fVar, f fVar2, f fVar3, int i5) {
        boolean z4 = false;
        if (i5 != 0) {
            if (i5 < 0) {
                i5 *= -1;
                z4 = true;
            }
            this.f8526b = i5;
        }
        if (z4) {
            this.f8528d.g(fVar, 1.0f);
            this.f8528d.g(fVar2, -1.0f);
            this.f8528d.g(fVar3, -1.0f);
        } else {
            this.f8528d.g(fVar, -1.0f);
            this.f8528d.g(fVar2, 1.0f);
            this.f8528d.g(fVar3, 1.0f);
        }
    }

    public final void c(f fVar, f fVar2, f fVar3, int i5) {
        boolean z4 = false;
        if (i5 != 0) {
            if (i5 < 0) {
                i5 *= -1;
                z4 = true;
            }
            this.f8526b = i5;
        }
        if (z4) {
            this.f8528d.g(fVar, 1.0f);
            this.f8528d.g(fVar2, -1.0f);
            this.f8528d.g(fVar3, 1.0f);
        } else {
            this.f8528d.g(fVar, -1.0f);
            this.f8528d.g(fVar2, 1.0f);
            this.f8528d.g(fVar3, -1.0f);
        }
    }

    public f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f8525a == null && this.f8526b == 0.0f && this.f8528d.d() == 0;
    }

    public final f f(boolean[] zArr, f fVar) {
        int i5;
        int iD = this.f8528d.d();
        f fVar2 = null;
        float f = 0.0f;
        for (int i6 = 0; i6 < iD; i6++) {
            float f5 = this.f8528d.f(i6);
            if (f5 < 0.0f) {
                f fVarE = this.f8528d.e(i6);
                if ((zArr == null || !zArr[fVarE.f8551b]) && fVarE != fVar && (((i5 = fVarE.f8560l) == 3 || i5 == 4) && f5 < f)) {
                    f = f5;
                    fVar2 = fVarE;
                }
            }
        }
        return fVar2;
    }

    public final void g(f fVar) {
        f fVar2 = this.f8525a;
        if (fVar2 != null) {
            this.f8528d.g(fVar2, -1.0f);
            this.f8525a.f8552c = -1;
            this.f8525a = null;
        }
        float fH = this.f8528d.h(fVar, true) * (-1.0f);
        this.f8525a = fVar;
        if (fH == 1.0f) {
            return;
        }
        this.f8526b /= fH;
        C0805a c0805a = this.f8528d;
        int i5 = c0805a.f8522h;
        for (int i6 = 0; i5 != -1 && i6 < c0805a.f8516a; i6++) {
            float[] fArr = c0805a.f8521g;
            fArr[i5] = fArr[i5] / fH;
            i5 = c0805a.f[i5];
        }
    }

    public final void h(c cVar, f fVar, boolean z4) {
        if (fVar.f) {
            float fC = this.f8528d.c(fVar);
            this.f8526b = (fVar.f8554e * fC) + this.f8526b;
            this.f8528d.h(fVar, z4);
            if (z4) {
                fVar.b(this);
            }
            if (this.f8528d.d() == 0) {
                this.f8529e = true;
                cVar.f8532a = true;
            }
        }
    }

    public void i(c cVar, C0806b c0806b, boolean z4) {
        C0805a c0805a = this.f8528d;
        c0805a.getClass();
        float fC = c0805a.c(c0806b.f8525a);
        c0805a.h(c0806b.f8525a, z4);
        C0805a c0805a2 = c0806b.f8528d;
        int iD = c0805a2.d();
        for (int i5 = 0; i5 < iD; i5++) {
            f fVarE = c0805a2.e(i5);
            c0805a.a(fVarE, c0805a2.c(fVarE) * fC, z4);
        }
        this.f8526b = (c0806b.f8526b * fC) + this.f8526b;
        if (z4) {
            c0806b.f8525a.b(this);
        }
        if (this.f8525a == null || this.f8528d.d() != 0) {
            return;
        }
        this.f8529e = true;
        cVar.f8532a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            r.f r0 = r10.f8525a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            r.f r1 = r10.f8525a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = g4.f.c(r0, r1)
            float r1 = r10.f8526b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f8526b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r3
            goto L3a
        L39:
            r1 = r4
        L3a:
            r.a r5 = r10.f8528d
            int r5 = r5.d()
        L40:
            if (r4 >= r5) goto La0
            r.a r6 = r10.f8528d
            r.f r6 = r6.e(r4)
            if (r6 != 0) goto L4b
            goto L9d
        L4b:
            r.a r7 = r10.f8528d
            float r7 = r7.f(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L56
            goto L9d
        L56:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L6a
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L7a
            java.lang.String r1 = "- "
            java.lang.String r0 = g4.f.c(r0, r1)
        L68:
            float r7 = r7 * r9
            goto L7a
        L6a:
            if (r8 <= 0) goto L73
            java.lang.String r1 = " + "
            java.lang.String r0 = g4.f.c(r0, r1)
            goto L7a
        L73:
            java.lang.String r1 = " - "
            java.lang.String r0 = g4.f.c(r0, r1)
            goto L68
        L7a:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L85
            java.lang.String r0 = g4.f.c(r0, r6)
            goto L9c
        L85:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L9c:
            r1 = r3
        L9d:
            int r4 = r4 + 1
            goto L40
        La0:
            if (r1 != 0) goto La8
            java.lang.String r10 = "0.0"
            java.lang.String r0 = g4.f.c(r0, r10)
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C0806b.toString():java.lang.String");
    }
}
