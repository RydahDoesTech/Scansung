package O1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final t[] f1973a = new t[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f1974b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f1975c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f1976d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f1977e = new Path();
    public final Path f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final t f1978g = new t();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f1979h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f1980i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f1981j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f1982k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1983l = true;

    public m() {
        for (int i5 = 0; i5 < 4; i5++) {
            this.f1973a[i5] = new t();
            this.f1974b[i5] = new Matrix();
            this.f1975c[i5] = new Matrix();
        }
    }

    public final void a(k kVar, float f, RectF rectF, B.g gVar, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        t[] tVarArr;
        int i5;
        float[] fArr;
        int i6;
        m mVar = this;
        path.rewind();
        Path path2 = mVar.f1977e;
        path2.rewind();
        Path path3 = mVar.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i7 = 0;
        while (true) {
            matrixArr = mVar.f1975c;
            matrixArr2 = mVar.f1974b;
            tVarArr = mVar.f1973a;
            i5 = 4;
            fArr = mVar.f1979h;
            if (i7 >= 4) {
                break;
            }
            c cVar = i7 != 1 ? i7 != 2 ? i7 != 3 ? kVar.f : kVar.f1965e : kVar.f1967h : kVar.f1966g;
            V1.a aVar = i7 != 1 ? i7 != 2 ? i7 != 3 ? kVar.f1962b : kVar.f1961a : kVar.f1964d : kVar.f1963c;
            t tVar = tVarArr[i7];
            aVar.getClass();
            aVar.B(tVar, f, cVar.a(rectF));
            int i8 = i7 + 1;
            float f5 = (i8 % 4) * 90;
            matrixArr2[i7].reset();
            PointF pointF = mVar.f1976d;
            if (i7 == 1) {
                i6 = i8;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i7 == 2) {
                i6 = i8;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i7 != 3) {
                i6 = i8;
                pointF.set(rectF.right, rectF.top);
            } else {
                i6 = i8;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i7].setTranslate(pointF.x, pointF.y);
            matrixArr2[i7].preRotate(f5);
            t tVar2 = tVarArr[i7];
            fArr[0] = tVar2.f1997b;
            fArr[1] = tVar2.f1998c;
            matrixArr2[i7].mapPoints(fArr);
            matrixArr[i7].reset();
            matrixArr[i7].setTranslate(fArr[0], fArr[1]);
            matrixArr[i7].preRotate(f5);
            i7 = i6;
        }
        int i9 = 0;
        while (i9 < i5) {
            t tVar3 = tVarArr[i9];
            tVar3.getClass();
            fArr[0] = 0.0f;
            fArr[1] = tVar3.f1996a;
            matrixArr2[i9].mapPoints(fArr);
            if (i9 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            tVarArr[i9].b(matrixArr2[i9], path);
            if (gVar != null) {
                t tVar4 = tVarArr[i9];
                Matrix matrix = matrixArr2[i9];
                g gVar2 = (g) gVar.f95e;
                BitSet bitSet = gVar2.f1933g;
                tVar4.getClass();
                bitSet.set(i9, false);
                tVar4.a(tVar4.f2000e);
                gVar2.f1932e[i9] = new n(new ArrayList(tVar4.f2001g), new Matrix(matrix));
            }
            int i10 = i9 + 1;
            int i11 = i10 % 4;
            t tVar5 = tVarArr[i9];
            fArr[0] = tVar5.f1997b;
            fArr[1] = tVar5.f1998c;
            matrixArr2[i9].mapPoints(fArr);
            t tVar6 = tVarArr[i11];
            tVar6.getClass();
            float[] fArr2 = mVar.f1980i;
            fArr2[0] = 0.0f;
            fArr2[1] = tVar6.f1996a;
            matrixArr2[i11].mapPoints(fArr2);
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            t tVar7 = tVarArr[i9];
            fArr[0] = tVar7.f1997b;
            fArr[1] = tVar7.f1998c;
            matrixArr2[i9].mapPoints(fArr);
            if (i9 == 1 || i9 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            t tVar8 = mVar.f1978g;
            tVar8.d(0.0f, 270.0f, 0.0f);
            (i9 != 1 ? i9 != 2 ? i9 != 3 ? kVar.f1969j : kVar.f1968i : kVar.f1971l : kVar.f1970k).getClass();
            tVar8.c(fMax, 0.0f);
            Path path4 = mVar.f1981j;
            path4.reset();
            tVar8.b(matrixArr[i9], path4);
            if (mVar.f1983l && (mVar.b(path4, i9) || mVar.b(path4, i11))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = tVar8.f1996a;
                matrixArr[i9].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                tVar8.b(matrixArr[i9], path2);
            } else {
                tVar8.b(matrixArr[i9], path);
            }
            if (gVar != null) {
                Matrix matrix2 = matrixArr[i9];
                g gVar3 = (g) gVar.f95e;
                gVar3.f1933g.set(i9 + 4, false);
                tVar8.a(tVar8.f2000e);
                gVar3.f[i9] = new n(new ArrayList(tVar8.f2001g), new Matrix(matrix2));
            }
            i5 = 4;
            mVar = this;
            i9 = i10;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean b(Path path, int i5) {
        Path path2 = this.f1982k;
        path2.reset();
        this.f1973a[i5].b(this.f1974b[i5], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
