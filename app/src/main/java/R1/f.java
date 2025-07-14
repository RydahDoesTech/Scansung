package R1;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class f extends O1.f {

    /* renamed from: q, reason: collision with root package name */
    public final RectF f2380q;

    public f(O1.k kVar, RectF rectF) {
        super(kVar);
        this.f2380q = rectF;
    }

    @Override // O1.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f2382y = this;
        gVar.invalidateSelf();
        return gVar;
    }

    public f(f fVar) {
        super(fVar);
        this.f2380q = fVar.f2380q;
    }
}
