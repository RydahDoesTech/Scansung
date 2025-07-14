package L1;

import Y0.j;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class c extends j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f1716c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextPaint f1717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f1718e;
    public final /* synthetic */ d f;

    public c(d dVar, Context context, TextPaint textPaint, j jVar) {
        super(8);
        this.f = dVar;
        this.f1716c = context;
        this.f1717d = textPaint;
        this.f1718e = jVar;
    }

    @Override // Y0.j
    public final void E(int i5) {
        this.f1718e.E(i5);
    }

    @Override // Y0.j
    public final void F(Typeface typeface, boolean z4) {
        this.f.g(this.f1716c, this.f1717d, typeface);
        this.f1718e.F(typeface, z4);
    }
}
