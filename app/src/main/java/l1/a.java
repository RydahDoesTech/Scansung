package L1;

import B.g;
import Y0.j;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class a extends j {

    /* renamed from: c, reason: collision with root package name */
    public final Typeface f1712c;

    /* renamed from: d, reason: collision with root package name */
    public final g f1713d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1714e;

    public a(g gVar, Typeface typeface) {
        super(8);
        this.f1712c = typeface;
        this.f1713d = gVar;
    }

    @Override // Y0.j
    public final void E(int i5) {
        if (this.f1714e) {
            return;
        }
        I1.b bVar = (I1.b) this.f1713d.f95e;
        if (bVar.j(this.f1712c)) {
            bVar.h(false);
        }
    }

    @Override // Y0.j
    public final void F(Typeface typeface, boolean z4) {
        if (this.f1714e) {
            return;
        }
        I1.b bVar = (I1.b) this.f1713d.f95e;
        if (bVar.j(typeface)) {
            bVar.h(false);
        }
    }
}
