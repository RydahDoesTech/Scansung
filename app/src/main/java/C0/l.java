package C0;

/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public B.f[] f301a;

    /* renamed from: b, reason: collision with root package name */
    public String f302b;

    /* renamed from: c, reason: collision with root package name */
    public int f303c;

    public l() {
        this.f301a = null;
        this.f303c = 0;
    }

    public B.f[] getPathData() {
        return this.f301a;
    }

    public String getPathName() {
        return this.f302b;
    }

    public void setPathData(B.f[] fVarArr) {
        B.f[] fVarArr2 = this.f301a;
        boolean z4 = false;
        if (fVarArr2 != null && fVarArr != null && fVarArr2.length == fVarArr.length) {
            int i5 = 0;
            while (true) {
                if (i5 >= fVarArr2.length) {
                    z4 = true;
                    break;
                }
                B.f fVar = fVarArr2[i5];
                char c2 = fVar.f92a;
                B.f fVar2 = fVarArr[i5];
                if (c2 != fVar2.f92a || fVar.f93b.length != fVar2.f93b.length) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        if (!z4) {
            this.f301a = Y0.j.y(fVarArr);
            return;
        }
        B.f[] fVarArr3 = this.f301a;
        for (int i6 = 0; i6 < fVarArr.length; i6++) {
            fVarArr3[i6].f92a = fVarArr[i6].f92a;
            int i7 = 0;
            while (true) {
                float[] fArr = fVarArr[i6].f93b;
                if (i7 < fArr.length) {
                    fVarArr3[i6].f93b[i7] = fArr[i7];
                    i7++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f301a = null;
        this.f303c = 0;
        this.f302b = lVar.f302b;
        this.f301a = Y0.j.y(lVar.f301a);
    }
}
