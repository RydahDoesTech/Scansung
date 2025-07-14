package com.google.android.material.chip;

import E1.b;
import E1.c;
import E1.d;
import E1.e;
import E1.f;
import E1.k;
import I1.g;
import I1.m;
import J.H;
import J.P;
import O1.u;
import T1.a;
import Y0.j;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import e1.AbstractC0415a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import k.C0646p;
import v1.C0887b;
import z.AbstractC0941d;

/* loaded from: classes.dex */
public class Chip extends C0646p implements e, u, g {

    /* renamed from: A, reason: collision with root package name */
    public static final Rect f5818A = new Rect();

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f5819B = {R.attr.state_selected};

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f5820C = {R.attr.state_checkable};

    /* renamed from: h, reason: collision with root package name */
    public f f5821h;

    /* renamed from: i, reason: collision with root package name */
    public InsetDrawable f5822i;

    /* renamed from: j, reason: collision with root package name */
    public RippleDrawable f5823j;

    /* renamed from: k, reason: collision with root package name */
    public View.OnClickListener f5824k;

    /* renamed from: l, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f5825l;

    /* renamed from: m, reason: collision with root package name */
    public I1.f f5826m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5827o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5828p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5829q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5830r;

    /* renamed from: s, reason: collision with root package name */
    public int f5831s;

    /* renamed from: t, reason: collision with root package name */
    public int f5832t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f5833u;

    /* renamed from: v, reason: collision with root package name */
    public final d f5834v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5835w;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f5836x;

    /* renamed from: y, reason: collision with root package name */
    public final RectF f5837y;

    /* renamed from: z, reason: collision with root package name */
    public final b f5838z;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(a.a(context, attributeSet, com.wssyncmldm.R.attr.chipStyle, com.wssyncmldm.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.wssyncmldm.R.attr.chipStyle);
        this.f5836x = new Rect();
        this.f5837y = new RectF();
        this.f5838z = new b(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        f fVar = new f(context2, attributeSet);
        int[] iArr = u1.a.f9160c;
        TypedArray typedArrayF = m.f(fVar.f576h0, attributeSet, iArr, com.wssyncmldm.R.attr.chipStyle, com.wssyncmldm.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        fVar.f553H0 = typedArrayF.hasValue(37);
        Context context3 = fVar.f576h0;
        ColorStateList colorStateListZ = V1.a.z(context3, typedArrayF, 24);
        if (fVar.f585y != colorStateListZ) {
            fVar.f585y = colorStateListZ;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList colorStateListZ2 = V1.a.z(context3, typedArrayF, 11);
        if (fVar.f587z != colorStateListZ2) {
            fVar.f587z = colorStateListZ2;
            fVar.onStateChange(fVar.getState());
        }
        float dimension = typedArrayF.getDimension(19, 0.0f);
        if (fVar.f540A != dimension) {
            fVar.f540A = dimension;
            fVar.invalidateSelf();
            fVar.t();
        }
        if (typedArrayF.hasValue(12)) {
            fVar.z(typedArrayF.getDimension(12, 0.0f));
        }
        fVar.E(V1.a.z(context3, typedArrayF, 22));
        fVar.F(typedArrayF.getDimension(23, 0.0f));
        fVar.O(V1.a.z(context3, typedArrayF, 36));
        String text = typedArrayF.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(fVar.f548F, text)) {
            fVar.f548F = text;
            fVar.n0.f945d = true;
            fVar.invalidateSelf();
            fVar.t();
        }
        L1.d dVar = (!typedArrayF.hasValue(0) || (resourceId3 = typedArrayF.getResourceId(0, 0)) == 0) ? null : new L1.d(context3, resourceId3);
        dVar.f1728k = typedArrayF.getDimension(1, dVar.f1728k);
        fVar.P(dVar);
        int i5 = typedArrayF.getInt(3, 0);
        if (i5 == 1) {
            fVar.f547E0 = TextUtils.TruncateAt.START;
        } else if (i5 == 2) {
            fVar.f547E0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i5 == 3) {
            fVar.f547E0 = TextUtils.TruncateAt.END;
        }
        fVar.D(typedArrayF.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.D(typedArrayF.getBoolean(15, false));
        }
        fVar.A(V1.a.C(context3, typedArrayF, 14));
        if (typedArrayF.hasValue(17)) {
            fVar.C(V1.a.z(context3, typedArrayF, 17));
        }
        fVar.B(typedArrayF.getDimension(16, -1.0f));
        fVar.L(typedArrayF.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.L(typedArrayF.getBoolean(26, false));
        }
        fVar.G(V1.a.C(context3, typedArrayF, 25));
        fVar.K(V1.a.z(context3, typedArrayF, 30));
        fVar.I(typedArrayF.getDimension(28, 0.0f));
        fVar.v(typedArrayF.getBoolean(6, false));
        fVar.y(typedArrayF.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.y(typedArrayF.getBoolean(8, false));
        }
        fVar.w(V1.a.C(context3, typedArrayF, 7));
        if (typedArrayF.hasValue(9)) {
            fVar.x(V1.a.z(context3, typedArrayF, 9));
        }
        fVar.f567X = (!typedArrayF.hasValue(39) || (resourceId2 = typedArrayF.getResourceId(39, 0)) == 0) ? null : C0887b.a(context3, resourceId2);
        fVar.f568Y = (!typedArrayF.hasValue(33) || (resourceId = typedArrayF.getResourceId(33, 0)) == 0) ? null : C0887b.a(context3, resourceId);
        float dimension2 = typedArrayF.getDimension(21, 0.0f);
        if (fVar.f569Z != dimension2) {
            fVar.f569Z = dimension2;
            fVar.invalidateSelf();
            fVar.t();
        }
        fVar.N(typedArrayF.getDimension(35, 0.0f));
        fVar.M(typedArrayF.getDimension(34, 0.0f));
        float dimension3 = typedArrayF.getDimension(41, 0.0f);
        if (fVar.f572c0 != dimension3) {
            fVar.f572c0 = dimension3;
            fVar.invalidateSelf();
            fVar.t();
        }
        float dimension4 = typedArrayF.getDimension(40, 0.0f);
        if (fVar.f573d0 != dimension4) {
            fVar.f573d0 = dimension4;
            fVar.invalidateSelf();
            fVar.t();
        }
        fVar.J(typedArrayF.getDimension(29, 0.0f));
        fVar.H(typedArrayF.getDimension(27, 0.0f));
        float dimension5 = typedArrayF.getDimension(13, 0.0f);
        if (fVar.g0 != dimension5) {
            fVar.g0 = dimension5;
            fVar.invalidateSelf();
            fVar.t();
        }
        fVar.f551G0 = typedArrayF.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayF.recycle();
        m.a(context2, attributeSet, com.wssyncmldm.R.attr.chipStyle, com.wssyncmldm.R.style.Widget_MaterialComponents_Chip_Action);
        m.b(context2, attributeSet, iArr, com.wssyncmldm.R.attr.chipStyle, com.wssyncmldm.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.wssyncmldm.R.attr.chipStyle, com.wssyncmldm.R.style.Widget_MaterialComponents_Chip_Action);
        this.f5830r = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f5832t = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(fVar);
        WeakHashMap weakHashMap = P.f1421a;
        fVar.h(H.i(this));
        m.a(context2, attributeSet, com.wssyncmldm.R.attr.chipStyle, com.wssyncmldm.R.style.Widget_MaterialComponents_Chip_Action);
        m.b(context2, attributeSet, iArr, com.wssyncmldm.R.attr.chipStyle, com.wssyncmldm.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.wssyncmldm.R.attr.chipStyle, com.wssyncmldm.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f5834v = new d(this, this);
        f();
        if (!zHasValue) {
            setOutlineProvider(new c(this));
        }
        setChecked(this.n);
        setText(fVar.f548F);
        setEllipsize(fVar.f547E0);
        i();
        if (!this.f5821h.f549F0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        h();
        if (this.f5830r) {
            setMinHeight(this.f5832t);
        }
        this.f5831s = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: E1.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                Chip chip = this.f533a;
                I1.f fVar2 = chip.f5826m;
                if (fVar2 != null) {
                    F3.p pVar = (F3.p) ((B.g) fVar2).f95e;
                    if (!z4 ? pVar.k(chip, pVar.f666b) : pVar.a(chip)) {
                        pVar.i();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f5825l;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z4);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f5837y;
        rectF.setEmpty();
        if (d() && this.f5824k != null) {
            f fVar = this.f5821h;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.S()) {
                float f = fVar.g0 + fVar.f575f0 + fVar.f561Q + fVar.f574e0 + fVar.f573d0;
                if (C.b.a(fVar) == 0) {
                    float f5 = bounds.right;
                    rectF.right = f5;
                    rectF.left = f5 - f;
                } else {
                    float f6 = bounds.left;
                    rectF.left = f6;
                    rectF.right = f6 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i5 = (int) closeIconTouchBounds.left;
        int i6 = (int) closeIconTouchBounds.top;
        int i7 = (int) closeIconTouchBounds.right;
        int i8 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f5836x;
        rect.set(i5, i6, i7, i8);
        return rect;
    }

    private L1.d getTextAppearance() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return fVar.n0.f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z4) {
        if (this.f5828p != z4) {
            this.f5828p = z4;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z4) {
        if (this.f5827o != z4) {
            this.f5827o = z4;
            refreshDrawableState();
        }
    }

    public final void c(int i5) {
        this.f5832t = i5;
        if (!this.f5830r) {
            InsetDrawable insetDrawable = this.f5822i;
            if (insetDrawable == null) {
                g();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f5822i = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    g();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i5 - ((int) this.f5821h.f540A));
        int iMax2 = Math.max(0, i5 - this.f5821h.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f5822i;
            if (insetDrawable2 == null) {
                g();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f5822i = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    g();
                    return;
                }
                return;
            }
        }
        int i6 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i7 = iMax > 0 ? iMax / 2 : 0;
        if (this.f5822i != null) {
            Rect rect = new Rect();
            this.f5822i.getPadding(rect);
            if (rect.top == i7 && rect.bottom == i7 && rect.left == i6 && rect.right == i6) {
                g();
                return;
            }
        }
        if (getMinHeight() != i5) {
            setMinHeight(i5);
        }
        if (getMinWidth() != i5) {
            setMinWidth(i5);
        }
        this.f5822i = new InsetDrawable((Drawable) this.f5821h, i6, i7, i6, i7);
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() {
        /*
            r1 = this;
            E1.f r1 = r1.f5821h
            if (r1 == 0) goto L13
            android.graphics.drawable.Drawable r1 = r1.f558M
            if (r1 == 0) goto Le
            boolean r0 = r1 instanceof C.g
            if (r0 == 0) goto Lf
            C.g r1 = (C.g) r1
        Le:
            r1 = 0
        Lf:
            if (r1 == 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.d():boolean");
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f5835w ? super.dispatchHoverEvent(motionEvent) : this.f5834v.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f5835w
            if (r0 != 0) goto L9
            boolean r9 = super.dispatchKeyEvent(r10)
            return r9
        L9:
            E1.d r0 = r9.f5834v
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 0
            if (r1 == r2) goto L85
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L6f
            r5 = 66
            if (r1 == r5) goto L57
            switch(r1) {
                case 19: goto L29;
                case 20: goto L29;
                case 21: goto L29;
                case 22: goto L29;
                case 23: goto L57;
                default: goto L28;
            }
        L28:
            goto L85
        L29:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L85
            r7 = 19
            if (r1 == r7) goto L41
            r7 = 21
            if (r1 == r7) goto L3e
            r7 = 22
            if (r1 == r7) goto L43
            r5 = 130(0x82, float:1.82E-43)
            goto L43
        L3e:
            r5 = 17
            goto L43
        L41:
            r5 = 33
        L43:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r2
            r7 = r4
        L49:
            if (r4 >= r1) goto L55
            boolean r8 = r0.q(r5, r6)
            if (r8 == 0) goto L55
            int r4 = r4 + 1
            r7 = r2
            goto L49
        L55:
            r4 = r7
            goto L85
        L57:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L85
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L85
            int r1 = r0.f2500l
            if (r1 == r3) goto L6d
            r4 = 16
            boolean r1 = r0.s(r1, r4)
        L6d:
            r4 = r2
            goto L85
        L6f:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L7b
            r1 = 2
            boolean r4 = r0.q(r1, r6)
            goto L85
        L7b:
            boolean r1 = r10.hasModifiers(r2)
            if (r1 == 0) goto L85
            boolean r4 = r0.q(r2, r6)
        L85:
            if (r4 == 0) goto L8c
            int r0 = r0.f2500l
            if (r0 == r3) goto L8c
            return r2
        L8c:
            boolean r9 = super.dispatchKeyEvent(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // k.C0646p, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i5;
        super.drawableStateChanged();
        f fVar = this.f5821h;
        boolean zU = false;
        if (fVar != null && f.s(fVar.f558M)) {
            f fVar2 = this.f5821h;
            ?? IsEnabled = isEnabled();
            int i6 = IsEnabled;
            if (this.f5829q) {
                i6 = IsEnabled + 1;
            }
            int i7 = i6;
            if (this.f5828p) {
                i7 = i6 + 1;
            }
            int i8 = i7;
            if (this.f5827o) {
                i8 = i7 + 1;
            }
            int i9 = i8;
            if (isChecked()) {
                i9 = i8 + 1;
            }
            int[] iArr = new int[i9];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (this.f5829q) {
                iArr[i5] = 16842908;
                i5++;
            }
            if (this.f5828p) {
                iArr[i5] = 16843623;
                i5++;
            }
            if (this.f5827o) {
                iArr[i5] = 16842919;
                i5++;
            }
            if (isChecked()) {
                iArr[i5] = 16842913;
            }
            if (!Arrays.equals(fVar2.f542B0, iArr)) {
                fVar2.f542B0 = iArr;
                if (fVar2.S()) {
                    zU = fVar2.u(fVar2.getState(), iArr);
                }
            }
        }
        if (zU) {
            invalidate();
        }
    }

    public final boolean e() {
        f fVar = this.f5821h;
        return fVar != null && fVar.f563T;
    }

    public final void f() {
        f fVar;
        if (!d() || (fVar = this.f5821h) == null || !fVar.f557L || this.f5824k == null) {
            P.h(this, null);
            this.f5835w = false;
        } else {
            P.h(this, this.f5834v);
            this.f5835w = true;
        }
    }

    public final void g() {
        ColorStateList colorStateListValueOf = this.f5821h.E;
        if (colorStateListValueOf == null) {
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        this.f5823j = new RippleDrawable(colorStateListValueOf, getBackgroundDrawable(), null);
        this.f5821h.getClass();
        RippleDrawable rippleDrawable = this.f5823j;
        WeakHashMap weakHashMap = P.f1421a;
        setBackground(rippleDrawable);
        h();
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f5833u)) {
            return this.f5833u;
        }
        if (!e()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof k) && ((k) parent).f594j.f665a) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f5822i;
        return insetDrawable == null ? this.f5821h : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return fVar.f565V;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return fVar.f566W;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return fVar.f587z;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return Math.max(0.0f, fVar.q());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f5821h;
    }

    public float getChipEndPadding() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return fVar.g0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.f5821h;
        if (fVar == null || (drawable = fVar.f552H) == 0) {
            return null;
        }
        boolean z4 = drawable instanceof C.g;
        Drawable drawable2 = drawable;
        if (z4) {
            drawable2 = null;
        }
        return drawable2;
    }

    public float getChipIconSize() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return fVar.f555J;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return fVar.f554I;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return fVar.f540A;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return fVar.f569Z;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return fVar.f543C;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return fVar.f545D;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.f5821h;
        if (fVar == null || (drawable = fVar.f558M) == 0) {
            return null;
        }
        boolean z4 = drawable instanceof C.g;
        Drawable drawable2 = drawable;
        if (z4) {
            drawable2 = null;
        }
        return drawable2;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return fVar.f562R;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return fVar.f575f0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return fVar.f561Q;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return fVar.f574e0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return fVar.f560O;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return fVar.f547E0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f5835w) {
            d dVar = this.f5834v;
            if (dVar.f2500l == 1 || dVar.f2499k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C0887b getHideMotionSpec() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return fVar.f568Y;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return fVar.f571b0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return fVar.f570a0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return fVar.E;
        }
        return null;
    }

    public O1.k getShapeAppearanceModel() {
        return this.f5821h.f1931d.f1916a;
    }

    public C0887b getShowMotionSpec() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return fVar.f567X;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return fVar.f573d0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.f5821h;
        if (fVar != null) {
            return fVar.f572c0;
        }
        return 0.0f;
    }

    public final void h() {
        f fVar;
        if (TextUtils.isEmpty(getText()) || (fVar = this.f5821h) == null) {
            return;
        }
        int iP = (int) (fVar.p() + fVar.g0 + fVar.f573d0);
        f fVar2 = this.f5821h;
        int iO = (int) (fVar2.o() + fVar2.f569Z + fVar2.f572c0);
        if (this.f5822i != null) {
            Rect rect = new Rect();
            this.f5822i.getPadding(rect);
            iO += rect.left;
            iP += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = P.f1421a;
        setPaddingRelative(iO, paddingTop, iP, paddingBottom);
    }

    public final void i() {
        TextPaint paint = getPaint();
        f fVar = this.f5821h;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        L1.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f5838z);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        j.Q(this, this.f5821h);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i5) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i5 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5819B);
        }
        if (e()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5820C);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z4, int i5, Rect rect) {
        super.onFocusChanged(z4, i5, rect);
        if (this.f5835w) {
            d dVar = this.f5834v;
            int i6 = dVar.f2500l;
            if (i6 != Integer.MIN_VALUE) {
                dVar.j(i6);
            }
            if (z4) {
                dVar.q(i5, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i5;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(e());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof k) {
            k kVar = (k) getParent();
            if (kVar.f) {
                i5 = 0;
                for (int i6 = 0; i6 < kVar.getChildCount(); i6++) {
                    View childAt = kVar.getChildAt(i6);
                    if ((childAt instanceof Chip) && kVar.getChildAt(i6).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                i5 = -1;
            } else {
                i5 = -1;
            }
            Object tag = getTag(com.wssyncmldm.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo(K.g.a(isChecked(), tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i5, 1).f1614a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i5) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), IDMCallbackStatusInterface.IDM_STATUS_INITIALIZED) : super.onResolvePointerIcon(motionEvent, i5);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i5) {
        super.onRtlPropertiesChanged(i5);
        if (this.f5831s != i5) {
            this.f5831s = i5;
            h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4a
            if (r0 == r3) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.f5827o
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r2)
        L2a:
            r0 = r3
            goto L51
        L2c:
            boolean r0 = r5.f5827o
            if (r0 == 0) goto L45
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f5824k
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f5835w
            if (r0 == 0) goto L43
            E1.d r0 = r5.f5834v
            r0.y(r3, r3)
        L43:
            r0 = r3
            goto L46
        L45:
            r0 = r2
        L46:
            r5.setCloseIconPressed(r2)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r3)
            goto L2a
        L50:
            r0 = r2
        L51:
            if (r0 != 0) goto L59
            boolean r5 = super.onTouchEvent(r6)
            if (r5 == 0) goto L5a
        L59:
            r2 = r3
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f5833u = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f5823j) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i5) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // k.C0646p, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f5823j) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // k.C0646p, android.view.View
    public void setBackgroundResource(int i5) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z4) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.v(z4);
        }
    }

    public void setCheckableResource(int i5) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.v(fVar.f576h0.getResources().getBoolean(i5));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) {
        f fVar = this.f5821h;
        if (fVar == null) {
            this.n = z4;
        } else if (fVar.f563T) {
            super.setChecked(z4);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.w(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z4) {
        setCheckedIconVisible(z4);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i5) {
        setCheckedIconVisible(i5);
    }

    public void setCheckedIconResource(int i5) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.w(AbstractC0415a.r(fVar.f576h0, i5));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.x(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i5) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.x(AbstractC0941d.b(fVar.f576h0, i5));
        }
    }

    public void setCheckedIconVisible(int i5) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.y(fVar.f576h0.getResources().getBoolean(i5));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.f5821h;
        if (fVar == null || fVar.f587z == colorStateList) {
            return;
        }
        fVar.f587z = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    public void setChipBackgroundColorResource(int i5) {
        ColorStateList colorStateListB;
        f fVar = this.f5821h;
        if (fVar == null || fVar.f587z == (colorStateListB = AbstractC0941d.b(fVar.f576h0, i5))) {
            return;
        }
        fVar.f587z = colorStateListB;
        fVar.onStateChange(fVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.z(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i5) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.z(fVar.f576h0.getResources().getDimension(i5));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.f5821h;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.f546D0 = new WeakReference(null);
            }
            this.f5821h = fVar;
            fVar.f549F0 = false;
            fVar.f546D0 = new WeakReference(this);
            c(this.f5832t);
        }
    }

    public void setChipEndPadding(float f) {
        f fVar = this.f5821h;
        if (fVar == null || fVar.g0 == f) {
            return;
        }
        fVar.g0 = f;
        fVar.invalidateSelf();
        fVar.t();
    }

    public void setChipEndPaddingResource(int i5) throws Resources.NotFoundException {
        f fVar = this.f5821h;
        if (fVar != null) {
            float dimension = fVar.f576h0.getResources().getDimension(i5);
            if (fVar.g0 != dimension) {
                fVar.g0 = dimension;
                fVar.invalidateSelf();
                fVar.t();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.A(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z4) {
        setChipIconVisible(z4);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i5) {
        setChipIconVisible(i5);
    }

    public void setChipIconResource(int i5) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.A(AbstractC0415a.r(fVar.f576h0, i5));
        }
    }

    public void setChipIconSize(float f) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.B(f);
        }
    }

    public void setChipIconSizeResource(int i5) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.B(fVar.f576h0.getResources().getDimension(i5));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.C(colorStateList);
        }
    }

    public void setChipIconTintResource(int i5) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.C(AbstractC0941d.b(fVar.f576h0, i5));
        }
    }

    public void setChipIconVisible(int i5) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.D(fVar.f576h0.getResources().getBoolean(i5));
        }
    }

    public void setChipMinHeight(float f) {
        f fVar = this.f5821h;
        if (fVar == null || fVar.f540A == f) {
            return;
        }
        fVar.f540A = f;
        fVar.invalidateSelf();
        fVar.t();
    }

    public void setChipMinHeightResource(int i5) throws Resources.NotFoundException {
        f fVar = this.f5821h;
        if (fVar != null) {
            float dimension = fVar.f576h0.getResources().getDimension(i5);
            if (fVar.f540A != dimension) {
                fVar.f540A = dimension;
                fVar.invalidateSelf();
                fVar.t();
            }
        }
    }

    public void setChipStartPadding(float f) {
        f fVar = this.f5821h;
        if (fVar == null || fVar.f569Z == f) {
            return;
        }
        fVar.f569Z = f;
        fVar.invalidateSelf();
        fVar.t();
    }

    public void setChipStartPaddingResource(int i5) throws Resources.NotFoundException {
        f fVar = this.f5821h;
        if (fVar != null) {
            float dimension = fVar.f576h0.getResources().getDimension(i5);
            if (fVar.f569Z != dimension) {
                fVar.f569Z = dimension;
                fVar.invalidateSelf();
                fVar.t();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.E(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i5) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.E(AbstractC0941d.b(fVar.f576h0, i5));
        }
    }

    public void setChipStrokeWidth(float f) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.F(f);
        }
    }

    public void setChipStrokeWidthResource(int i5) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.F(fVar.f576h0.getResources().getDimension(i5));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i5) {
        setText(getResources().getString(i5));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.G(drawable);
        }
        f();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        f fVar = this.f5821h;
        if (fVar == null || fVar.f562R == charSequence) {
            return;
        }
        String str = H.b.f790b;
        H.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? H.b.f793e : H.b.f792d;
        bVar.getClass();
        A1.c cVar = H.g.f800a;
        fVar.f562R = bVar.c(charSequence);
        fVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z4) {
        setCloseIconVisible(z4);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i5) {
        setCloseIconVisible(i5);
    }

    public void setCloseIconEndPadding(float f) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.H(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i5) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.H(fVar.f576h0.getResources().getDimension(i5));
        }
    }

    public void setCloseIconResource(int i5) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.G(AbstractC0415a.r(fVar.f576h0, i5));
        }
        f();
    }

    public void setCloseIconSize(float f) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.I(f);
        }
    }

    public void setCloseIconSizeResource(int i5) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.I(fVar.f576h0.getResources().getDimension(i5));
        }
    }

    public void setCloseIconStartPadding(float f) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.J(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i5) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.J(fVar.f576h0.getResources().getDimension(i5));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.K(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i5) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.K(AbstractC0941d.b(fVar.f576h0, i5));
        }
    }

    public void setCloseIconVisible(int i5) {
        setCloseIconVisible(getResources().getBoolean(i5));
    }

    @Override // k.C0646p, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // k.C0646p, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i5, int i6, int i7, int i8) {
        if (i5 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i7 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i5, i6, i7, i8);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i5, int i6, int i7, int i8) {
        if (i5 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i7 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i5, i6, i7, i8);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.h(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f5821h == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.f547E0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z4) {
        this.f5830r = z4;
        c(this.f5832t);
    }

    @Override // android.widget.TextView
    public void setGravity(int i5) {
        if (i5 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i5);
        }
    }

    public void setHideMotionSpec(C0887b c0887b) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.f568Y = c0887b;
        }
    }

    public void setHideMotionSpecResource(int i5) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.f568Y = C0887b.a(fVar.f576h0, i5);
        }
    }

    public void setIconEndPadding(float f) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.M(f);
        }
    }

    public void setIconEndPaddingResource(int i5) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.M(fVar.f576h0.getResources().getDimension(i5));
        }
    }

    public void setIconStartPadding(float f) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.N(f);
        }
    }

    public void setIconStartPaddingResource(int i5) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.N(fVar.f576h0.getResources().getDimension(i5));
        }
    }

    @Override // I1.g
    public void setInternalOnCheckedChangeListener(I1.f fVar) {
        this.f5826m = fVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i5) {
        if (this.f5821h == null) {
            return;
        }
        super.setLayoutDirection(i5);
    }

    @Override // android.widget.TextView
    public void setLines(int i5) {
        if (i5 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i5);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i5) {
        if (i5 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i5);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i5) {
        super.setMaxWidth(i5);
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.f551G0 = i5;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i5) {
        if (i5 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i5);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f5825l = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f5824k = onClickListener;
        f();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.O(colorStateList);
        }
        this.f5821h.getClass();
        g();
    }

    public void setRippleColorResource(int i5) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.O(AbstractC0941d.b(fVar.f576h0, i5));
            this.f5821h.getClass();
            g();
        }
    }

    @Override // O1.u
    public void setShapeAppearanceModel(O1.k kVar) {
        this.f5821h.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C0887b c0887b) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.f567X = c0887b;
        }
    }

    public void setShowMotionSpecResource(int i5) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.f567X = C0887b.a(fVar.f576h0, i5);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z4) {
        if (!z4) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z4);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        f fVar = this.f5821h;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(fVar.f549F0 ? null : charSequence, bufferType);
        f fVar2 = this.f5821h;
        if (fVar2 == null || TextUtils.equals(fVar2.f548F, charSequence)) {
            return;
        }
        fVar2.f548F = charSequence;
        fVar2.n0.f945d = true;
        fVar2.invalidateSelf();
        fVar2.t();
    }

    public void setTextAppearance(L1.d dVar) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.P(dVar);
        }
        i();
    }

    public void setTextAppearanceResource(int i5) {
        setTextAppearance(getContext(), i5);
    }

    public void setTextEndPadding(float f) {
        f fVar = this.f5821h;
        if (fVar == null || fVar.f573d0 == f) {
            return;
        }
        fVar.f573d0 = f;
        fVar.invalidateSelf();
        fVar.t();
    }

    public void setTextEndPaddingResource(int i5) throws Resources.NotFoundException {
        f fVar = this.f5821h;
        if (fVar != null) {
            float dimension = fVar.f576h0.getResources().getDimension(i5);
            if (fVar.f573d0 != dimension) {
                fVar.f573d0 = dimension;
                fVar.invalidateSelf();
                fVar.t();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i5, float f) {
        super.setTextSize(i5, f);
        f fVar = this.f5821h;
        if (fVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i5, f, getResources().getDisplayMetrics());
            I1.k kVar = fVar.n0;
            L1.d dVar = kVar.f;
            if (dVar != null) {
                dVar.f1728k = fApplyDimension;
                kVar.f942a.setTextSize(fApplyDimension);
                fVar.t();
                fVar.invalidateSelf();
            }
        }
        i();
    }

    public void setTextStartPadding(float f) {
        f fVar = this.f5821h;
        if (fVar == null || fVar.f572c0 == f) {
            return;
        }
        fVar.f572c0 = f;
        fVar.invalidateSelf();
        fVar.t();
    }

    public void setTextStartPaddingResource(int i5) throws Resources.NotFoundException {
        f fVar = this.f5821h;
        if (fVar != null) {
            float dimension = fVar.f576h0.getResources().getDimension(i5);
            if (fVar.f572c0 != dimension) {
                fVar.f572c0 = dimension;
                fVar.invalidateSelf();
                fVar.t();
            }
        }
    }

    public void setCloseIconVisible(boolean z4) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.L(z4);
        }
        f();
    }

    public void setCheckedIconVisible(boolean z4) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.y(z4);
        }
    }

    public void setChipIconVisible(boolean z4) {
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.D(z4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i5) {
        super.setTextAppearance(context, i5);
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.P(new L1.d(fVar.f576h0, i5));
        }
        i();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i5) {
        super.setTextAppearance(i5);
        f fVar = this.f5821h;
        if (fVar != null) {
            fVar.P(new L1.d(fVar.f576h0, i5));
        }
        i();
    }
}
