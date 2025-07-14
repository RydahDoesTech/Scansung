package androidx.appcompat.graphics.drawable;

import B.a;
import R1.h;
import android.R;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BlendMode;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import b0.C0198c;
import c.AbstractC0220a;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class SeslRecoilDrawable extends LayerDrawable {
    public static final LinearInterpolator n = new LinearInterpolator();

    /* renamed from: o, reason: collision with root package name */
    public static final PathInterpolator f3177o = new PathInterpolator(0.17f, 0.17f, 0.67f, 1.0f);

    /* renamed from: d, reason: collision with root package name */
    public boolean f3178d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3179e;
    public final ValueAnimator f;

    /* renamed from: g, reason: collision with root package name */
    public long f3180g;

    /* renamed from: h, reason: collision with root package name */
    public long f3181h;

    /* renamed from: i, reason: collision with root package name */
    public int f3182i;

    /* renamed from: j, reason: collision with root package name */
    public int f3183j;

    /* renamed from: k, reason: collision with root package name */
    public float f3184k;

    /* renamed from: l, reason: collision with root package name */
    public float f3185l;

    /* renamed from: m, reason: collision with root package name */
    public C0198c f3186m;

    public SeslRecoilDrawable() {
        super(new Drawable[0]);
        this.f3178d = false;
        this.f3179e = false;
        this.f = ValueAnimator.ofFloat(0.0f);
        this.f3186m = null;
        b();
    }

    public final int a() {
        return a.c(this.f3182i, (int) (((Float) this.f.getAnimatedValue()).floatValue() * Color.valueOf(this.f3182i).alpha() * 255.0f));
    }

    public final void b() {
        this.f3180g = 100L;
        this.f3181h = 350L;
        this.f.addUpdateListener(new h(2, this));
        setPaddingMode(1);
    }

    public final void c(float f) {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), f);
        valueAnimator.setInterpolator(n);
        valueAnimator.setDuration(this.f3180g);
        valueAnimator.start();
    }

    public final void d(TypedArray typedArray) {
        Drawable drawable;
        for (int i5 = 0; i5 < typedArray.getIndexCount(); i5++) {
            int index = typedArray.getIndex(i5);
            if (index == 0) {
                this.f3182i = typedArray.getColor(index, 419430400);
            } else if (index == 2) {
                this.f3183j = typedArray.getDimensionPixelSize(index, -1);
            } else if (index == 1 && (drawable = typedArray.getDrawable(index)) != null) {
                setId(addLayer(drawable), R.id.mask);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0039 A[PHI: r4
  0x0039: PHI (r4v7 int) = (r4v2 int), (r4v5 int) binds: [B:8:0x0037, B:11:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r6) {
        /*
            r5 = this;
            int r0 = r6.getSaveCount()
            int r1 = r5.getNumberOfLayers()
            if (r1 > 0) goto L61
            float r1 = r5.f3184k
            float r2 = r5.f3185l
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r5.getHotspotBounds(r3)
            int r4 = r3.height()
            if (r4 <= 0) goto L26
            int r1 = r3.centerX()
            float r1 = (float) r1
            int r2 = r3.centerY()
            float r2 = (float) r2
        L26:
            r6.translate(r1, r2)
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            int r4 = r5.a()
            r3.setColor(r4)
            int r4 = r5.f3183j
            if (r4 <= 0) goto L3b
        L39:
            float r5 = (float) r4
            goto L57
        L3b:
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r5.getHotspotBounds(r4)
            int r4 = r4.height()
            int r4 = r4 / 2
            if (r4 <= 0) goto L4c
            goto L39
        L4c:
            android.graphics.Rect r5 = r5.getBounds()
            int r5 = r5.height()
            int r5 = r5 / 2
            float r5 = (float) r5
        L57:
            r4 = 0
            r6.drawCircle(r4, r4, r5, r3)
            float r5 = -r1
            float r1 = -r2
            r6.translate(r5, r1)
            goto L64
        L61:
            super.draw(r6)
        L64:
            r6.restoreToCount(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.SeslRecoilDrawable.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return null;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        return true;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AbstractC0220a.f5133x);
        try {
            try {
                d(typedArrayObtainAttributes);
            } catch (XmlPullParserException e5) {
                Log.e("SeslRecoilDrawable", "Failed to parse!!", e5);
            }
            super.inflate(resources, xmlPullParser, attributeSet, theme);
            Drawable drawableFindDrawableByLayerId = findDrawableByLayerId(R.id.mask);
            if (drawableFindDrawableByLayerId != null) {
                drawableFindDrawableByLayerId.setTint(0);
                drawableFindDrawableByLayerId.setTintBlendMode(BlendMode.SRC_IN);
            }
        } finally {
            typedArrayObtainAttributes.recycle();
        }
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return getNumberOfLayers() <= 0;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator.isRunning()) {
            valueAnimator.end();
        }
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        for (int i5 : iArr) {
            if (i5 == 16842908) {
                z4 = true;
            } else if (i5 == 16842919) {
                z6 = true;
            } else if (i5 == 16843623) {
                z5 = true;
            }
        }
        boolean z7 = z4 || z5 || z6;
        if (z6) {
            this.f3179e = true;
            c(1.0f);
        } else if (z5) {
            c(0.6f);
        } else if (z4) {
            c(0.8f);
        } else if (this.f3178d && !z7) {
            ValueAnimator valueAnimator = this.f;
            if (valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            valueAnimator.setFloatValues(this.f3179e ? 1.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            valueAnimator.setInterpolator(f3177o);
            valueAnimator.setDuration(this.f3181h);
            valueAnimator.start();
            C0198c c0198c = this.f3186m;
            if (c0198c != null) {
                C0198c c0198c2 = (C0198c) c0198c.f5001d;
                SeslRecoilDrawable seslRecoilDrawable = (SeslRecoilDrawable) c0198c2.f5001d;
                if (seslRecoilDrawable.f3186m != null) {
                    seslRecoilDrawable.f3186m = null;
                }
                c0198c2.f5001d = null;
            }
        }
        this.f3178d = z7;
        this.f3179e = z6;
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f5) {
        super.setHotspot(f, f5);
        this.f3184k = f;
        this.f3185l = f5;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        super.setTintBlendMode(blendMode);
        Drawable drawableFindDrawableByLayerId = findDrawableByLayerId(R.id.mask);
        if (drawableFindDrawableByLayerId != null) {
            drawableFindDrawableByLayerId.setTintBlendMode(BlendMode.SRC_IN);
        }
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
        Drawable drawableFindDrawableByLayerId = findDrawableByLayerId(R.id.mask);
        if (drawableFindDrawableByLayerId != null) {
            drawableFindDrawableByLayerId.setTint(a());
        }
    }

    public SeslRecoilDrawable(Drawable[] drawableArr) {
        super(drawableArr);
        this.f3178d = false;
        this.f3179e = false;
        this.f = ValueAnimator.ofFloat(0.0f);
        this.f3186m = null;
        b();
    }

    public SeslRecoilDrawable(int i5, Drawable[] drawableArr, Drawable drawable) {
        this(drawableArr);
        b();
        this.f3182i = i5;
        if (drawable != null) {
            setId(addLayer(drawable), R.id.mask);
        }
    }
}
