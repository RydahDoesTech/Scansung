package k;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: k.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0601P extends A.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7535e;
    public final /* synthetic */ int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WeakReference f7536g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ V f7537h;

    public C0601P(V v2, int i5, int i6, WeakReference weakReference) {
        this.f7537h = v2;
        this.f7535e = i5;
        this.f = i6;
        this.f7536g = weakReference;
    }

    @Override // A.b
    public final void h(int i5) {
    }

    @Override // A.b
    public final void i(Typeface typeface) {
        int i5 = this.f7535e;
        if (i5 != -1) {
            typeface = U.a(typeface, i5, (this.f & 2) != 0);
        }
        V v2 = this.f7537h;
        if (v2.f7571m) {
            v2.f7570l = typeface;
            TextView textView = (TextView) this.f7536g.get();
            if (textView != null) {
                WeakHashMap weakHashMap = J.P.f1421a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new A1.a(textView, typeface, v2.f7568j));
                } else {
                    textView.setTypeface(typeface, v2.f7568j);
                }
            }
        }
    }
}
