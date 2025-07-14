package O;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import k.C0637l0;

/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: u, reason: collision with root package name */
    public static final int f1877u = ViewConfiguration.getTapTimeout();

    /* renamed from: d, reason: collision with root package name */
    public final a f1878d;

    /* renamed from: e, reason: collision with root package name */
    public final AccelerateInterpolator f1879e;
    public final ListView f;

    /* renamed from: g, reason: collision with root package name */
    public A1.h f1880g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f1881h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f1882i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1883j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1884k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f1885l;

    /* renamed from: m, reason: collision with root package name */
    public final float[] f1886m;
    public final float[] n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1887o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1888p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1889q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1890r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1891s;

    /* renamed from: t, reason: collision with root package name */
    public final C0637l0 f1892t;

    public g(C0637l0 c0637l0) {
        a aVar = new a();
        aVar.f1873e = Long.MIN_VALUE;
        aVar.f1874g = -1L;
        aVar.f = 0L;
        this.f1878d = aVar;
        this.f1879e = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f1881h = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1882i = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f1885l = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f1886m = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.n = fArr5;
        this.f = c0637l0;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f5 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f5;
        fArr5[1] = f5;
        float f6 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f6;
        fArr4[1] = f6;
        this.f1883j = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f1884k = f1877u;
        aVar.f1869a = 500;
        aVar.f1870b = 500;
        this.f1892t = c0637l0;
    }

    public static float b(float f, float f5, float f6) {
        return f > f6 ? f6 : f < f5 ? f5 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f1881h
            r0 = r0[r4]
            float[] r1 = r3.f1882i
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f1879e
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f1885l
            r0 = r0[r4]
            float[] r1 = r3.f1886m
            r1 = r1[r4]
            float[] r3 = r3.n
            r3 = r3[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r3 = b(r5, r1, r3)
            return r3
        L51:
            float r4 = -r5
            float r4 = r4 * r0
            float r3 = b(r4, r1, r3)
            float r3 = -r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: O.g.a(int, float, float, float):float");
    }

    public final float c(float f, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        int i5 = this.f1883j;
        if (i5 == 0 || i5 == 1) {
            if (f < f5) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f5);
                }
                if (this.f1890r && i5 == 1) {
                    return 1.0f;
                }
            }
        } else if (i5 == 2 && f < 0.0f) {
            return f / (-f5);
        }
        return 0.0f;
    }

    public final void d() {
        int i5 = 0;
        if (this.f1888p) {
            this.f1890r = false;
            return;
        }
        a aVar = this.f1878d;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i6 = (int) (jCurrentAnimationTimeMillis - aVar.f1873e);
        int i7 = aVar.f1870b;
        if (i6 > i7) {
            i5 = i7;
        } else if (i6 >= 0) {
            i5 = i6;
        }
        aVar.f1876i = i5;
        aVar.f1875h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f1874g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        C0637l0 c0637l0;
        int count;
        a aVar = this.f1878d;
        float f = aVar.f1872d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(aVar.f1871c);
        if (iAbs == 0 || (count = (c0637l0 = this.f1892t).getCount()) == 0) {
            return false;
        }
        int childCount = c0637l0.getChildCount();
        int firstVisiblePosition = c0637l0.getFirstVisiblePosition();
        int i5 = firstVisiblePosition + childCount;
        if (iAbs > 0) {
            if (i5 >= count && c0637l0.getChildAt(childCount - 1).getBottom() <= c0637l0.getHeight()) {
                return false;
            }
        } else {
            if (iAbs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && c0637l0.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            r0 = 3
            boolean r1 = r7.f1891s
            r2 = 0
            if (r1 != 0) goto L7
            return r2
        L7:
            int r1 = r9.getActionMasked()
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L16
            r4 = 2
            if (r1 == r4) goto L1e
            if (r1 == r0) goto L16
            goto L7b
        L16:
            r7.d()
            goto L7b
        L1a:
            r7.f1889q = r3
            r7.f1887o = r2
        L1e:
            float r1 = r9.getX()
            int r4 = r8.getWidth()
            float r4 = (float) r4
            android.widget.ListView r5 = r7.f
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r1 = r7.a(r2, r1, r4, r6)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r8 = r7.a(r3, r9, r8, r4)
            O.a r9 = r7.f1878d
            r9.f1871c = r1
            r9.f1872d = r8
            boolean r8 = r7.f1890r
            if (r8 != 0) goto L7b
            boolean r8 = r7.e()
            if (r8 == 0) goto L7b
            A1.h r8 = r7.f1880g
            if (r8 != 0) goto L5f
            A1.h r8 = new A1.h
            r8.<init>(r0, r7)
            r7.f1880g = r8
        L5f:
            r7.f1890r = r3
            r7.f1888p = r3
            boolean r8 = r7.f1887o
            if (r8 != 0) goto L74
            int r8 = r7.f1884k
            if (r8 <= 0) goto L74
            A1.h r9 = r7.f1880g
            long r0 = (long) r8
            java.util.WeakHashMap r8 = J.P.f1421a
            r5.postOnAnimationDelayed(r9, r0)
            goto L79
        L74:
            A1.h r8 = r7.f1880g
            r8.run()
        L79:
            r7.f1887o = r3
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: O.g.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
