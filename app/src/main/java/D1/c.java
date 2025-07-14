package D1;

import A.k;
import A.r;
import B0.q;
import C0.d;
import C0.e;
import C0.f;
import I1.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.wssyncmldm.R;
import e1.AbstractC0415a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k.C0646p;

/* loaded from: classes.dex */
public final class c extends C0646p {

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f470B = {R.attr.state_indeterminate};

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f471C = {R.attr.state_error};

    /* renamed from: D, reason: collision with root package name */
    public static final int[][] f472D = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int E = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: A, reason: collision with root package name */
    public final a f473A;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f474h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f475i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f476j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f477k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f478l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f479m;
    public CharSequence n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f480o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f481p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f482q;

    /* renamed from: r, reason: collision with root package name */
    public ColorStateList f483r;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f484s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f485t;

    /* renamed from: u, reason: collision with root package name */
    public int f486u;

    /* renamed from: v, reason: collision with root package name */
    public int[] f487v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f488w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f489x;

    /* renamed from: y, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f490y;

    /* renamed from: z, reason: collision with root package name */
    public final f f491z;

    public c(Context context, AttributeSet attributeSet) {
        super(T1.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f474h = new LinkedHashSet();
        this.f475i = new LinkedHashSet();
        Context context2 = getContext();
        f fVar = new f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = r.f34a;
        Drawable drawableA = k.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        fVar.f281d = drawableA;
        drawableA.setCallback(fVar.f280i);
        new e(fVar.f281d.getConstantState());
        this.f491z = fVar;
        this.f473A = new a(this);
        Context context3 = getContext();
        this.f480o = O.c.a(this);
        this.f483r = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = u1.a.f9171p;
        m.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        m.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        D3.c cVar = new D3.c(context3, typedArrayObtainStyledAttributes);
        this.f481p = cVar.g(2);
        if (this.f480o != null && J2.b.S(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == E && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f480o = AbstractC0415a.r(context3, R.drawable.mtrl_checkbox_button);
                this.f482q = true;
                if (this.f481p == null) {
                    this.f481p = AbstractC0415a.r(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f484s = V1.a.y(context3, cVar, 3);
        this.f485t = m.g(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f477k = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.f478l = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f479m = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.n = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        cVar.m();
        a();
    }

    private String getButtonStateDescription() {
        int i5 = this.f486u;
        return i5 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i5 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f476j == null) {
            int iN = AbstractC0415a.n(R.attr.colorControlActivated, this);
            int iN2 = AbstractC0415a.n(R.attr.colorError, this);
            int iN3 = AbstractC0415a.n(R.attr.colorSurface, this);
            int iN4 = AbstractC0415a.n(R.attr.colorOnSurface, this);
            this.f476j = new ColorStateList(f472D, new int[]{AbstractC0415a.I(iN3, 1.0f, iN2), AbstractC0415a.I(iN3, 1.0f, iN), AbstractC0415a.I(iN3, 0.54f, iN4), AbstractC0415a.I(iN3, 0.38f, iN4), AbstractC0415a.I(iN3, 0.38f, iN4)});
        }
        return this.f476j;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f483r;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        q qVar;
        Drawable drawableMutate = this.f480o;
        ColorStateList colorStateList3 = this.f483r;
        PorterDuff.Mode modeB = O.b.b(this);
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (modeB != null) {
                C.a.i(drawableMutate, modeB);
            }
        }
        this.f480o = drawableMutate;
        Drawable drawableMutate2 = this.f481p;
        ColorStateList colorStateList4 = this.f484s;
        PorterDuff.Mode mode = this.f485t;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                C.a.i(drawableMutate2, mode);
            }
        }
        this.f481p = drawableMutate2;
        if (this.f482q) {
            f fVar = this.f491z;
            if (fVar != null) {
                Drawable drawable = fVar.f281d;
                a aVar = this.f473A;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (aVar.f467a == null) {
                        aVar.f467a = new C0.b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f467a);
                }
                ArrayList arrayList = fVar.f279h;
                d dVar = fVar.f277e;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (fVar.f279h.size() == 0 && (qVar = fVar.f278g) != null) {
                        dVar.f272b.removeListener(qVar);
                        fVar.f278g = null;
                    }
                }
                Drawable drawable2 = fVar.f281d;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (aVar.f467a == null) {
                        aVar.f467a = new C0.b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f467a);
                } else if (aVar != null) {
                    if (fVar.f279h == null) {
                        fVar.f279h = new ArrayList();
                    }
                    if (!fVar.f279h.contains(aVar)) {
                        fVar.f279h.add(aVar);
                        if (fVar.f278g == null) {
                            fVar.f278g = new q(1, fVar);
                        }
                        dVar.f272b.addListener(fVar.f278g);
                    }
                }
            }
            Drawable drawable3 = this.f480o;
            if ((drawable3 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, fVar, false);
                ((AnimatedStateListDrawable) this.f480o).addTransition(R.id.indeterminate, R.id.unchecked, fVar, false);
            }
        }
        Drawable drawable4 = this.f480o;
        if (drawable4 != null && (colorStateList2 = this.f483r) != null) {
            C.a.h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f481p;
        if (drawable5 != null && (colorStateList = this.f484s) != null) {
            C.a.h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.f480o;
        Drawable drawable7 = this.f481p;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f480o;
    }

    public Drawable getButtonIconDrawable() {
        return this.f481p;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f484s;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f485t;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f483r;
    }

    public int getCheckedState() {
        return this.f486u;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.n;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f486u == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f477k && this.f483r == null && this.f484s == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i5) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i5 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f470B);
        }
        if (this.f479m) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f471C);
        }
        int i6 = 0;
        while (true) {
            if (i6 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i7 = iArrOnCreateDrawableState[i6];
            if (i7 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i7 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i6] = 16842912;
                break;
            }
            i6++;
        }
        this.f487v = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f478l || !TextUtils.isEmpty(getText()) || (drawableA = O.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (m.e(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            C.a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f479m) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.n));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f469d);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f469d = getCheckedState();
        return bVar;
    }

    @Override // k.C0646p, android.widget.CompoundButton
    public void setButtonDrawable(int i5) {
        setButtonDrawable(AbstractC0415a.r(getContext(), i5));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f481p = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i5) {
        setButtonIconDrawable(AbstractC0415a.r(getContext(), i5));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f484s == colorStateList) {
            return;
        }
        this.f484s = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f485t == mode) {
            return;
        }
        this.f485t = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f483r == colorStateList) {
            return;
        }
        this.f483r = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z4) {
        this.f478l = z4;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) {
        setCheckedState(z4 ? 1 : 0);
    }

    public void setCheckedState(int i5) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f486u != i5) {
            this.f486u = i5;
            super.setChecked(i5 == 1);
            refreshDrawableState();
            if (this.f489x == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f488w) {
                return;
            }
            this.f488w = true;
            LinkedHashSet linkedHashSet = this.f475i;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f486u != 2 && (onCheckedChangeListener = this.f490y) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f488w = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.n = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i5) {
        setErrorAccessibilityLabel(i5 != 0 ? getResources().getText(i5) : null);
    }

    public void setErrorShown(boolean z4) {
        if (this.f479m == z4) {
            return;
        }
        this.f479m = z4;
        refreshDrawableState();
        Iterator it = this.f474h.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f490y = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f489x = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else if (charSequence == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z4) {
        this.f477k = z4;
        if (z4) {
            O.b.c(this, getMaterialThemeColorsTintList());
        } else {
            O.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // k.C0646p, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f480o = drawable;
        this.f482q = false;
        a();
    }
}
