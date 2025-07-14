package O1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class p extends r {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f1987h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f1988b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1989c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1990d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1991e;
    public float f;

    /* renamed from: g, reason: collision with root package name */
    public float f1992g;

    public p(float f, float f5, float f6, float f7) {
        this.f1988b = f;
        this.f1989c = f5;
        this.f1990d = f6;
        this.f1991e = f7;
    }

    @Override // O1.r
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1995a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f1987h;
        rectF.set(this.f1988b, this.f1989c, this.f1990d, this.f1991e);
        path.arcTo(rectF, this.f, this.f1992g, false);
        path.transform(matrix);
    }
}
