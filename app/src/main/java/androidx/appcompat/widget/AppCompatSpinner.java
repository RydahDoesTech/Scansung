package androidx.appcompat.widget;

import B3.g;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.graphics.drawable.SeslRecoilDrawable;
import e1.AbstractC0415a;
import k.AbstractC0592G;
import k.AbstractC0593H;
import k.C0589D;
import k.C0595J;
import k.C0599N;
import k.InterfaceC0600O;
import k.ViewTreeObserverOnGlobalLayoutListenerC0590E;

/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {
    public static final int[] n = {R.attr.spinnerMode};

    /* renamed from: d, reason: collision with root package name */
    public final g f3305d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f3306e;
    public final C0589D f;

    /* renamed from: g, reason: collision with root package name */
    public SpinnerAdapter f3307g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3308h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0600O f3309i;

    /* renamed from: j, reason: collision with root package name */
    public int f3310j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3311k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f3312l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3313m;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatSpinner(android.content.Context r13, android.util.AttributeSet r14) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = 2130969680(0x7f040450, float:1.7548049E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.f3312l = r1
            android.content.Context r1 = r12.getContext()
            k.v1.a(r12, r1)
            int[] r1 = c.AbstractC0220a.f5134y
            D3.c r2 = D3.c.l(r13, r14, r1, r0)
            B3.g r3 = new B3.g
            r3.<init>(r12)
            r12.f3305d = r3
            java.lang.Object r3 = r2.f
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            i.e r6 = new i.e
            r6.<init>(r13, r4)
            r12.f3306e = r6
            goto L37
        L35:
            r12.f3306e = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = androidx.appcompat.widget.AppCompatSpinner.n     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            if (r8 == 0) goto L50
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            goto L50
        L4a:
            r12 = move-exception
            r6 = r7
            goto Ld2
        L4e:
            r8 = move-exception
            goto L59
        L50:
            r7.recycle()
            goto L63
        L54:
            r12 = move-exception
            goto Ld2
        L57:
            r8 = move-exception
            r7 = r6
        L59:
            java.lang.String r9 = "AppCompatSpinner"
            java.lang.String r10 = "Could not read android:spinnerMode"
            android.util.Log.i(r9, r10, r8)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L63
            goto L50
        L63:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L9a
            if (r4 == r8) goto L6a
            goto La7
        L6a:
            k.M r4 = new k.M
            android.content.Context r9 = r12.f3306e
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.f3306e
            D3.c r1 = D3.c.l(r9, r14, r1, r0)
            r9 = 3
            r10 = -2
            java.lang.Object r11 = r1.f
            android.content.res.TypedArray r11 = (android.content.res.TypedArray) r11
            int r9 = r11.getLayoutDimension(r9, r10)
            r12.f3310j = r9
            int r9 = r4.f7842i
            r12.f3311k = r9
            java.lang.String r7 = r3.getString(r7)
            r4.f7530D = r7
            r1.m()
            r12.f3309i = r4
            k.D r1 = new k.D
            r1.<init>(r12, r12, r4)
            r12.f = r1
            goto La7
        L9a:
            k.I r1 = new k.I
            r1.<init>(r12)
            r12.f3309i = r1
            java.lang.String r4 = r3.getString(r7)
            r1.f = r4
        La7:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lbe
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131558605(0x7f0d00cd, float:1.874253E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lbe:
            r2.m()
            r12.f3308h = r8
            android.widget.SpinnerAdapter r13 = r12.f3307g
            if (r13 == 0) goto Lcc
            r12.setAdapter(r13)
            r12.f3307g = r6
        Lcc:
            B3.g r12 = r12.f3305d
            r12.g(r14, r0)
            return
        Ld2:
            if (r6 == 0) goto Ld7
            r6.recycle()
        Ld7:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i5 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f3312l;
        drawable.getPadding(rect);
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        g gVar = this.f3305d;
        if (gVar != null) {
            gVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0600O interfaceC0600O = this.f3309i;
        return interfaceC0600O != null ? interfaceC0600O.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0600O interfaceC0600O = this.f3309i;
        return interfaceC0600O != null ? interfaceC0600O.f() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f3309i != null ? this.f3310j : super.getDropDownWidth();
    }

    public final InterfaceC0600O getInternalPopup() {
        return this.f3309i;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0600O interfaceC0600O = this.f3309i;
        return interfaceC0600O != null ? interfaceC0600O.g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f3306e;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0600O interfaceC0600O = this.f3309i;
        return interfaceC0600O != null ? interfaceC0600O.h() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        g gVar = this.f3305d;
        if (gVar != null) {
            return gVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        g gVar = this.f3305d;
        if (gVar != null) {
            return gVar.f();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getBackground() instanceof SeslRecoilDrawable) {
            this.f3313m = true;
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0600O interfaceC0600O = this.f3309i;
        if (interfaceC0600O == null || !interfaceC0600O.b()) {
            return;
        }
        interfaceC0600O.dismiss();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        View selectedView = getSelectedView();
        StringBuilder sb = new StringBuilder();
        if (selectedView instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) selectedView;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                View childAt = viewGroup.getChildAt(i5);
                if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    if (sb.length() == 0) {
                        sb = new StringBuilder(textView.getText());
                    } else {
                        sb.append(" ");
                        sb.append(textView.getText());
                    }
                }
            }
        } else if (selectedView instanceof TextView) {
            sb = new StringBuilder(((TextView) selectedView).getText());
        }
        accessibilityNodeInfo.setContentDescription(sb.toString());
        accessibilityNodeInfo.setClassName(Spinner.class.getName());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i5, int i6) {
        int iA;
        super.onMeasure(i5, i6);
        if (this.f3309i == null || View.MeasureSpec.getMode(i5) != Integer.MIN_VALUE) {
            return;
        }
        getMeasuredWidth();
        if (getSelectedItemPosition() <= -1 || getSelectedItemPosition() >= getAdapter().getCount()) {
            iA = a(getAdapter(), getBackground());
        } else {
            SpinnerAdapter adapter = getAdapter();
            Drawable background = getBackground();
            iA = 0;
            if (adapter != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                View view = adapter.getView(getSelectedItemPosition(), null, this);
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                }
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                if (background != null) {
                    Rect rect = this.f3312l;
                    background.getPadding(rect);
                    iA = rect.left + rect.right + measuredWidth;
                } else {
                    iA = measuredWidth;
                }
            }
        }
        setMeasuredDimension(Math.min(iA, View.MeasureSpec.getSize(i5)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0599N c0599n = (C0599N) parcelable;
        super.onRestoreInstanceState(c0599n.getSuperState());
        if (!c0599n.f7534d || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0590E(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0599N c0599n = new C0599N(super.onSaveInstanceState());
        InterfaceC0600O interfaceC0600O = this.f3309i;
        c0599n.f7534d = interfaceC0600O != null && interfaceC0600O.b();
        return c0599n;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0589D c0589d = this.f;
        if (c0589d == null || !c0589d.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0600O interfaceC0600O = this.f3309i;
        if (interfaceC0600O == null) {
            return super.performClick();
        }
        playSoundEffect(0);
        if (interfaceC0600O.b()) {
            return true;
        }
        this.f3309i.e(AbstractC0592G.b(this), AbstractC0592G.a(this));
        return true;
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (!this.f3313m || getStateListAnimator() == null) {
            return;
        }
        getStateListAnimator().jumpToCurrentState();
        this.f3313m = false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        g gVar = this.f3305d;
        if (gVar != null) {
            gVar.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        g gVar = this.f3305d;
        if (gVar != null) {
            gVar.i(i5);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i5) {
        InterfaceC0600O interfaceC0600O = this.f3309i;
        if (interfaceC0600O == null) {
            super.setDropDownHorizontalOffset(i5);
        } else {
            interfaceC0600O.o(i5);
            interfaceC0600O.c(i5);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i5) {
        InterfaceC0600O interfaceC0600O = this.f3309i;
        if (interfaceC0600O != null) {
            interfaceC0600O.m(i5);
        } else {
            super.setDropDownVerticalOffset(i5);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i5) {
        if (this.f3309i != null) {
            this.f3310j = i5;
        } else {
            super.setDropDownWidth(i5);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0600O interfaceC0600O = this.f3309i;
        if (interfaceC0600O != null) {
            interfaceC0600O.l(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i5) {
        setPopupBackgroundDrawable(AbstractC0415a.r(getPopupContext(), i5));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0600O interfaceC0600O = this.f3309i;
        if (interfaceC0600O != null) {
            interfaceC0600O.j(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        g gVar = this.f3305d;
        if (gVar != null) {
            gVar.k(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        g gVar = this.f3305d;
        if (gVar != null) {
            gVar.l(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f3308h) {
            this.f3307g = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0600O interfaceC0600O = this.f3309i;
        if (interfaceC0600O != null) {
            Context context = this.f3306e;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0595J c0595j = new C0595J();
            c0595j.f7520d = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0595j.f7521e = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0593H.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0600O.n(c0595j);
        }
    }
}
