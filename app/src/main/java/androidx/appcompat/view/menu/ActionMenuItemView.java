package androidx.appcompat.view.menu;

import C.a;
import J2.b;
import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import c.AbstractC0220a;
import j.AbstractC0486c;
import j.C0485b;
import j.C0494k;
import j.InterfaceC0491h;
import j.InterfaceC0505v;
import j.MenuC0492i;
import k.InterfaceC0636l;
import k.J1;
import r0.AbstractC0808b;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements InterfaceC0505v, View.OnClickListener, InterfaceC0636l, View.OnLongClickListener {

    /* renamed from: k, reason: collision with root package name */
    public C0494k f3194k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f3195l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f3196m;
    public InterfaceC0491h n;

    /* renamed from: o, reason: collision with root package name */
    public C0485b f3197o;

    /* renamed from: p, reason: collision with root package name */
    public AbstractC0486c f3198p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3199q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3200r;

    /* renamed from: s, reason: collision with root package name */
    public final int f3201s;

    /* renamed from: t, reason: collision with root package name */
    public int f3202t;

    /* renamed from: u, reason: collision with root package name */
    public final int f3203u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3204v;

    /* renamed from: w, reason: collision with root package name */
    public final float f3205w;

    /* renamed from: x, reason: collision with root package name */
    public final Drawable f3206x;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException, NoSuchMethodException, SecurityException {
        super(context, attributeSet, 0);
        this.f3204v = false;
        this.f3205w = 0.0f;
        Resources resources = context.getResources();
        this.f3199q = h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0220a.f5114c, 0, 0);
        this.f3201s = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f3203u = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        setOnLongClickListener(this);
        this.f3202t = -1;
        setSaveEnabled(false);
        Resources.Theme theme = context.getTheme();
        int[] iArr = AbstractC0220a.f5120j;
        TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(null, iArr, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(26, 0);
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(resourceId, AbstractC0220a.f5108A);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes3.peekValue(0);
        typedArrayObtainStyledAttributes3.recycle();
        if (typedValuePeekValue != null) {
            this.f3205w = TypedValue.complexToFloat(typedValuePeekValue.data);
        }
        AbstractC0808b.k(this, true);
        TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(null, iArr, 0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes4.getResourceId(24, 0);
        typedArrayObtainStyledAttributes4.recycle();
        TypedArray typedArrayObtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(resourceId2, new int[]{R.attr.background});
        this.f3206x = typedArrayObtainStyledAttributes5.getDrawable(0);
        typedArrayObtainStyledAttributes5.recycle();
    }

    @Override // k.InterfaceC0636l
    public final boolean a() {
        return g();
    }

    @Override // k.InterfaceC0636l
    public final boolean b() {
        return g() && this.f3194k.getIcon() == null;
    }

    @Override // j.InterfaceC0505v
    public final void d(C0494k c0494k) {
        this.f3194k = c0494k;
        setIcon(c0494k.getIcon());
        setTitle(c0494k.getTitleCondensed());
        setId(c0494k.f6982a);
        setVisibility(c0494k.isVisible() ? 0 : 8);
        setEnabled(c0494k.isEnabled());
        if (c0494k.hasSubMenu() && this.f3197o == null) {
            this.f3197o = new C0485b(this);
        }
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public final boolean g() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // j.InterfaceC0505v
    public C0494k getItemData() {
        return this.f3194k;
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i5 = configuration.screenWidthDp;
        return i5 >= 480 || (i5 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void i() {
        boolean z4 = (!TextUtils.isEmpty(this.f3195l)) & (this.f3196m == null || ((this.f3194k.f7004y & 4) == 4 && (this.f3199q || this.f3200r)));
        setText(z4 ? this.f3195l : null);
        if (z4) {
            setBackgroundResource(b.I(getContext()) ? com.wssyncmldm.R.drawable.sesl_action_bar_item_text_background_light : com.wssyncmldm.R.drawable.sesl_action_bar_item_text_background_dark);
        } else {
            setBackground(this.f3206x);
        }
        CharSequence charSequence = this.f3194k.f6996q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.f3194k.f6986e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f3194k.f6997r;
        if (TextUtils.isEmpty(charSequence2)) {
            J1.a(this, z4 ? null : this.f3194k.f6986e);
        } else {
            J1.a(this, charSequence2);
        }
        float f = this.f3205w;
        if (f > 0.0f) {
            setTextSize(1, f * Math.min(getResources().getConfiguration().fontScale, 1.2f));
        }
        setText(z4 ? this.f3195l : null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0491h interfaceC0491h = this.n;
        if (interfaceC0491h != null) {
            interfaceC0491h.b(this.f3194k);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3199q = h();
        i();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return false;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i5, int i6) {
        int i7;
        boolean zG = g();
        if (zG && (i7 = this.f3202t) >= 0) {
            super.setPadding(i7, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i5, i6);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int measuredWidth = getMeasuredWidth();
        int i8 = this.f3201s;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i8) : i8;
        if (mode != 1073741824 && i8 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i6);
        }
        if (zG || this.f3196m == null) {
            return;
        }
        int measuredWidth2 = getMeasuredWidth();
        int iWidth = this.f3196m.getBounds().width();
        if (this.f3204v) {
            return;
        }
        super.setPadding((measuredWidth2 - iWidth) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence contentDescription = getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            return;
        }
        accessibilityEvent.getText().add(contentDescription);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0485b c0485b;
        if (this.f3194k.hasSubMenu() && (c0485b = this.f3197o) != null && c0485b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean performLongClick() {
        if (this.f3196m == null) {
            return true;
        }
        return super.performLongClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
    }

    public void setCheckable(boolean z4) {
    }

    public void setChecked(boolean z4) {
    }

    public void setExpandedFormat(boolean z4) {
        if (this.f3200r != z4) {
            this.f3200r = z4;
            C0494k c0494k = this.f3194k;
            if (c0494k != null) {
                MenuC0492i menuC0492i = c0494k.n;
                menuC0492i.f6964k = true;
                menuC0492i.p(true);
            }
        }
    }

    @Override // android.widget.TextView
    public final boolean setFrame(int i5, int i6, int i7, int i8) {
        boolean frame = super.setFrame(i5, i6, i7, i8);
        if (!this.f3204v) {
            return frame;
        }
        Drawable background = getBackground();
        if (this.f3196m != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int paddingLeft = (getPaddingLeft() - getPaddingRight()) / 2;
            a.f(background, paddingLeft, 0, width + paddingLeft, height);
        } else if (background != null) {
            a.f(background, 0, 0, getWidth(), getHeight());
        }
        return frame;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setIcon(android.graphics.drawable.Drawable r5) {
        /*
            r4 = this;
            r4.f3196m = r5
            if (r5 == 0) goto L25
            int r0 = r5.getIntrinsicWidth()
            int r1 = r5.getIntrinsicHeight()
            int r2 = r4.f3203u
            if (r0 <= r2) goto L17
            float r3 = (float) r2
            float r0 = (float) r0
            float r3 = r3 / r0
            float r0 = (float) r1
            float r0 = r0 * r3
            int r1 = (int) r0
            r0 = r2
        L17:
            if (r1 <= r2) goto L20
            float r3 = (float) r2
            float r1 = (float) r1
            float r3 = r3 / r1
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (int) r0
            goto L21
        L20:
            r2 = r1
        L21:
            r1 = 0
            r5.setBounds(r1, r1, r0, r2)
        L25:
            r0 = 0
            r4.setCompoundDrawables(r5, r0, r0, r0)
            boolean r1 = r4.g()
            if (r1 == 0) goto L3c
            java.util.WeakHashMap r1 = J.P.f1421a
            int r1 = r4.getLayoutDirection()
            r2 = 1
            if (r1 != r2) goto L3c
            r4.setCompoundDrawables(r0, r0, r5, r0)
            goto L3f
        L3c:
            r4.setCompoundDrawables(r5, r0, r0, r0)
        L3f:
            r4.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.setIcon(android.graphics.drawable.Drawable):void");
    }

    public void setIsLastItem(boolean z4) {
    }

    public void setItemInvoker(InterfaceC0491h interfaceC0491h) {
        this.n = interfaceC0491h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i5, int i6, int i7, int i8) {
        this.f3202t = i5;
        super.setPadding(i5, i6, i7, i8);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i5, int i6, int i7, int i8) {
        this.f3202t = i5;
        this.f3204v = true;
        super.setPaddingRelative(i5, i6, i7, i8);
    }

    public void setPopupCallback(AbstractC0486c abstractC0486c) {
        this.f3198p = abstractC0486c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f3195l = charSequence;
        setContentDescription(charSequence);
        i();
    }
}
