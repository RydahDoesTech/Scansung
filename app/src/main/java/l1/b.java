package L1;

import Y0.j;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class b extends A.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f1715e;
    public final /* synthetic */ d f;

    public b(d dVar, j jVar) {
        this.f = dVar;
        this.f1715e = jVar;
    }

    @Override // A.b
    public final void h(int i5) {
        this.f.f1730m = true;
        this.f1715e.E(i5);
    }

    @Override // A.b
    public final void i(Typeface typeface) {
        d dVar = this.f;
        dVar.n = Typeface.create(typeface, dVar.f1721c);
        dVar.f1730m = true;
        this.f1715e.F(dVar.n, false);
    }
}
