package C0;

import B0.q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import e1.AbstractC0415a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class f extends g implements Animatable {
    public final Context f;

    /* renamed from: g, reason: collision with root package name */
    public q f278g = null;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f279h = null;

    /* renamed from: i, reason: collision with root package name */
    public final c f280i = new c(this);

    /* renamed from: e, reason: collision with root package name */
    public final d f277e = new d();

    public f(Context context) {
        this.f = context;
    }

    @Override // C0.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            C.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            return C.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.f277e;
        dVar.f271a.draw(canvas);
        if (dVar.f272b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f281d;
        return drawable != null ? drawable.getAlpha() : this.f277e.f271a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f277e.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f281d;
        return drawable != null ? C.a.c(drawable) : this.f277e.f271a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f281d != null) {
            return new e(this.f281d.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f281d;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f277e.f271a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f281d;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f277e.f271a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f281d;
        return drawable != null ? drawable.getOpacity() : this.f277e.f271a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        if (r3.f272b != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
    
        r3.f272b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        r3.f272b.playTogether(r3.f273c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r10, org.xmlpull.v1.XmlPullParser r11, android.util.AttributeSet r12, android.content.res.Resources.Theme r13) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            r9 = this;
            android.graphics.drawable.Drawable r0 = r9.f281d
            if (r0 == 0) goto L8
            C.a.d(r0, r10, r11, r12, r13)
            return
        L8:
            int r0 = r11.getEventType()
            int r1 = r11.getDepth()
            r2 = 1
            int r1 = r1 + r2
        L12:
            C0.d r3 = r9.f277e
            if (r0 == r2) goto Lc8
            int r4 = r11.getDepth()
            if (r4 >= r1) goto L1f
            r4 = 3
            if (r0 == r4) goto Lc8
        L1f:
            r4 = 2
            if (r0 != r4) goto Lc2
            java.lang.String r0 = r11.getName()
            java.lang.String r4 = "animated-vector"
            boolean r4 = r4.equals(r0)
            r5 = 0
            r6 = 0
            if (r4 == 0) goto L68
            int[] r0 = C0.a.f268e
            android.content.res.TypedArray r0 = A.b.g(r10, r13, r12, r0)
            int r4 = r0.getResourceId(r6, r6)
            if (r4 == 0) goto L64
            C0.p r7 = new C0.p
            r7.<init>()
            java.lang.ThreadLocal r8 = A.r.f34a
            android.graphics.drawable.Drawable r4 = A.k.a(r10, r4, r13)
            r7.f281d = r4
            C0.o r4 = new C0.o
            android.graphics.drawable.Drawable r8 = r7.f281d
            android.graphics.drawable.Drawable$ConstantState r8 = r8.getConstantState()
            r4.<init>(r8)
            r7.f334i = r6
            C0.c r4 = r9.f280i
            r7.setCallback(r4)
            C0.p r4 = r3.f271a
            if (r4 == 0) goto L62
            r4.setCallback(r5)
        L62:
            r3.f271a = r7
        L64:
            r0.recycle()
            goto Lc2
        L68:
            java.lang.String r4 = "target"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lc2
            int[] r0 = C0.a.f
            android.content.res.TypedArray r0 = r10.obtainAttributes(r12, r0)
            java.lang.String r4 = r0.getString(r6)
            int r6 = r0.getResourceId(r2, r6)
            if (r6 == 0) goto Lbf
            android.content.Context r7 = r9.f
            if (r7 == 0) goto Lb4
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r7, r6)
            C0.p r7 = r3.f271a
            C0.n r7 = r7.f331e
            C0.m r7 = r7.f319b
            o.b r7 = r7.f317o
            java.lang.Object r5 = r7.getOrDefault(r4, r5)
            r6.setTarget(r5)
            java.util.ArrayList r5 = r3.f273c
            if (r5 != 0) goto La9
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r3.f273c = r5
            o.b r5 = new o.b
            r5.<init>()
            r3.f274d = r5
        La9:
            java.util.ArrayList r5 = r3.f273c
            r5.add(r6)
            o.b r3 = r3.f274d
            r3.put(r6, r4)
            goto Lbf
        Lb4:
            r0.recycle()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Context can't be null when inflating animators"
            r9.<init>(r10)
            throw r9
        Lbf:
            r0.recycle()
        Lc2:
            int r0 = r11.next()
            goto L12
        Lc8:
            android.animation.AnimatorSet r9 = r3.f272b
            if (r9 != 0) goto Ld3
            android.animation.AnimatorSet r9 = new android.animation.AnimatorSet
            r9.<init>()
            r3.f272b = r9
        Ld3:
            android.animation.AnimatorSet r9 = r3.f272b
            java.util.ArrayList r10 = r3.f273c
            r9.playTogether(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.f.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f281d;
        return drawable != null ? drawable.isAutoMirrored() : this.f277e.f271a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f281d;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f277e.f272b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f281d;
        return drawable != null ? drawable.isStateful() : this.f277e.f271a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f277e.f271a.setBounds(rect);
        }
    }

    @Override // C0.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i5) {
        Drawable drawable = this.f281d;
        return drawable != null ? drawable.setLevel(i5) : this.f277e.f271a.setLevel(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f281d;
        return drawable != null ? drawable.setState(iArr) : this.f277e.f271a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            drawable.setAlpha(i5);
        } else {
            this.f277e.f271a.setAlpha(i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z4) {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            drawable.setAutoMirrored(z4);
        } else {
            this.f277e.f271a.setAutoMirrored(z4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f277e.f271a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i5) {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            AbstractC0415a.V(drawable, i5);
        } else {
            this.f277e.f271a.setTint(i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            C.a.h(drawable, colorStateList);
        } else {
            this.f277e.f271a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            C.a.i(drawable, mode);
        } else {
            this.f277e.f271a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            return drawable.setVisible(z4, z5);
        }
        this.f277e.f271a.setVisible(z4, z5);
        return super.setVisible(z4, z5);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.f277e;
        if (dVar.f272b.isStarted()) {
            return;
        }
        dVar.f272b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f277e.f272b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
