package O1;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class q extends r {

    /* renamed from: b, reason: collision with root package name */
    public float f1993b;

    /* renamed from: c, reason: collision with root package name */
    public float f1994c;

    @Override // O1.r
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1995a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f1993b, this.f1994c);
        path.transform(matrix);
    }
}
