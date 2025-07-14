package I1;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public float f944c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f946e;
    public L1.d f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f942a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final E1.b f943b = new E1.b(1, this);

    /* renamed from: d, reason: collision with root package name */
    public boolean f945d = true;

    public k(E1.f fVar) {
        this.f946e = new WeakReference(null);
        this.f946e = new WeakReference(fVar);
    }

    public final float a(String str) {
        if (!this.f945d) {
            return this.f944c;
        }
        TextPaint textPaint = this.f942a;
        this.f944c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f945d = false;
        return this.f944c;
    }
}
