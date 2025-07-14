package O1;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.samsung.android.knox.custom.CustomDeviceManager;

/* loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f1916a;

    /* renamed from: b, reason: collision with root package name */
    public H1.a f1917b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f1918c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f1919d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f1920e;
    public PorterDuff.Mode f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f1921g;

    /* renamed from: h, reason: collision with root package name */
    public final float f1922h;

    /* renamed from: i, reason: collision with root package name */
    public float f1923i;

    /* renamed from: j, reason: collision with root package name */
    public float f1924j;

    /* renamed from: k, reason: collision with root package name */
    public int f1925k;

    /* renamed from: l, reason: collision with root package name */
    public float f1926l;

    /* renamed from: m, reason: collision with root package name */
    public float f1927m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public int f1928o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f1929p;

    public f(k kVar) {
        this.f1918c = null;
        this.f1919d = null;
        this.f1920e = null;
        this.f = PorterDuff.Mode.SRC_IN;
        this.f1921g = null;
        this.f1922h = 1.0f;
        this.f1923i = 1.0f;
        this.f1925k = CustomDeviceManager.CALL_SCREEN_ALL;
        this.f1926l = 0.0f;
        this.f1927m = 0.0f;
        this.n = 0;
        this.f1928o = 0;
        this.f1929p = Paint.Style.FILL_AND_STROKE;
        this.f1916a = kVar;
        this.f1917b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f1934h = true;
        return gVar;
    }

    public f(f fVar) {
        this.f1918c = null;
        this.f1919d = null;
        this.f1920e = null;
        this.f = PorterDuff.Mode.SRC_IN;
        this.f1921g = null;
        this.f1922h = 1.0f;
        this.f1923i = 1.0f;
        this.f1925k = CustomDeviceManager.CALL_SCREEN_ALL;
        this.f1926l = 0.0f;
        this.f1927m = 0.0f;
        this.n = 0;
        this.f1928o = 0;
        this.f1929p = Paint.Style.FILL_AND_STROKE;
        this.f1916a = fVar.f1916a;
        this.f1917b = fVar.f1917b;
        this.f1924j = fVar.f1924j;
        this.f1918c = fVar.f1918c;
        this.f1919d = fVar.f1919d;
        this.f = fVar.f;
        this.f1920e = fVar.f1920e;
        this.f1925k = fVar.f1925k;
        this.f1922h = fVar.f1922h;
        this.f1928o = fVar.f1928o;
        this.f1923i = fVar.f1923i;
        this.f1926l = fVar.f1926l;
        this.f1927m = fVar.f1927m;
        this.n = fVar.n;
        this.f1929p = fVar.f1929p;
        if (fVar.f1921g != null) {
            this.f1921g = new Rect(fVar.f1921g);
        }
    }
}
