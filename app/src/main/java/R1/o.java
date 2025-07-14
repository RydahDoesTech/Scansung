package R1;

import J.P;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.wssyncmldm.R;
import e1.AbstractC0415a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f2403d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f2404e;
    public final CheckableImageButton f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2405g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f2406h;

    /* renamed from: i, reason: collision with root package name */
    public View.OnLongClickListener f2407i;

    /* renamed from: j, reason: collision with root package name */
    public final CheckableImageButton f2408j;

    /* renamed from: k, reason: collision with root package name */
    public final A1.j f2409k;

    /* renamed from: l, reason: collision with root package name */
    public int f2410l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f2411m;
    public ColorStateList n;

    /* renamed from: o, reason: collision with root package name */
    public PorterDuff.Mode f2412o;

    /* renamed from: p, reason: collision with root package name */
    public int f2413p;

    /* renamed from: q, reason: collision with root package name */
    public ImageView.ScaleType f2414q;

    /* renamed from: r, reason: collision with root package name */
    public View.OnLongClickListener f2415r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f2416s;

    /* renamed from: t, reason: collision with root package name */
    public final AppCompatTextView f2417t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2418u;

    /* renamed from: v, reason: collision with root package name */
    public EditText f2419v;

    /* renamed from: w, reason: collision with root package name */
    public final AccessibilityManager f2420w;

    /* renamed from: x, reason: collision with root package name */
    public I0.b f2421x;

    /* renamed from: y, reason: collision with root package name */
    public final l f2422y;

    public o(TextInputLayout textInputLayout, D3.c cVar) throws Resources.NotFoundException {
        CharSequence text;
        super(textInputLayout.getContext());
        int i5 = 0;
        this.f2410l = 0;
        this.f2411m = new LinkedHashSet();
        this.f2422y = new l(this);
        m mVar = new m(this);
        this.f2420w = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f2403d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f2404e = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f2408j = checkableImageButtonA2;
        this.f2409k = new A1.j(this, cVar);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f2417t = appCompatTextView;
        TypedArray typedArray = (TypedArray) cVar.f;
        if (typedArray.hasValue(38)) {
            this.f2405g = V1.a.y(getContext(), cVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f2406h = I1.m.g(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(cVar.g(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = P.f1421a;
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.n = V1.a.y(getContext(), cVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f2412o = I1.m.g(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.n = V1.a.y(getContext(), cVar, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f2412o = I1.m.g(typedArray.getInt(55, -1), null);
            }
            g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f2413p) {
            this.f2413p = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeM = Y0.j.m(typedArray.getInt(31, -1));
            this.f2414q = scaleTypeM;
            checkableImageButtonA2.setScaleType(scaleTypeM);
            checkableImageButtonA.setScaleType(scaleTypeM);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            appCompatTextView.setTextColor(cVar.f(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f2416s = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.f6023j0.add(mVar);
        if (textInputLayout.f6017g != null) {
            mVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new n(i5, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i5) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i5);
        if (V1.a.Y(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final p b() {
        p eVar;
        int i5 = this.f2410l;
        A1.j jVar = this.f2409k;
        SparseArray sparseArray = (SparseArray) jVar.f72c;
        p wVar = (p) sparseArray.get(i5);
        if (wVar == null) {
            o oVar = (o) jVar.f73d;
            if (i5 == -1) {
                eVar = new e(oVar, 0);
            } else if (i5 == 0) {
                eVar = new e(oVar, 1);
            } else if (i5 == 1) {
                wVar = new w(oVar, jVar.f71b);
                sparseArray.append(i5, wVar);
            } else if (i5 == 2) {
                eVar = new d(oVar);
            } else {
                if (i5 != 3) {
                    throw new IllegalArgumentException(A3.f.l(i5, "Invalid end icon mode: "));
                }
                eVar = new k(oVar);
            }
            wVar = eVar;
            sparseArray.append(i5, wVar);
        }
        return wVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f2408j;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = P.f1421a;
        return this.f2417t.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f2404e.getVisibility() == 0 && this.f2408j.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f.getVisibility() == 0;
    }

    public final void f(boolean z4) {
        boolean z5;
        boolean zIsActivated;
        boolean z6;
        p pVarB = b();
        boolean zK = pVarB.k();
        CheckableImageButton checkableImageButton = this.f2408j;
        boolean z7 = true;
        if (!zK || (z6 = checkableImageButton.f5936h) == pVarB.l()) {
            z5 = false;
        } else {
            checkableImageButton.setChecked(!z6);
            z5 = true;
        }
        if (!(pVarB instanceof k) || (zIsActivated = checkableImageButton.isActivated()) == pVarB.j()) {
            z7 = z5;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z4 || z7) {
            Y0.j.L(this.f2403d, checkableImageButton, this.n);
        }
    }

    public final void g(int i5) throws Resources.NotFoundException {
        if (this.f2410l == i5) {
            return;
        }
        p pVarB = b();
        I0.b bVar = this.f2421x;
        AccessibilityManager accessibilityManager = this.f2420w;
        if (bVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new K.b(bVar));
        }
        this.f2421x = null;
        pVarB.s();
        this.f2410l = i5;
        Iterator it = this.f2411m.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        h(i5 != 0);
        p pVarB2 = b();
        int iD = this.f2409k.f70a;
        if (iD == 0) {
            iD = pVarB2.d();
        }
        Drawable drawableR = iD != 0 ? AbstractC0415a.r(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.f2408j;
        checkableImageButton.setImageDrawable(drawableR);
        TextInputLayout textInputLayout = this.f2403d;
        if (drawableR != null) {
            Y0.j.a(textInputLayout, checkableImageButton, this.n, this.f2412o);
            Y0.j.L(textInputLayout, checkableImageButton, this.n);
        }
        int iC = pVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(pVarB2.k());
        if (!pVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i5);
        }
        pVarB2.r();
        I0.b bVarH = pVarB2.h();
        this.f2421x = bVarH;
        if (bVarH != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = P.f1421a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new K.b(this.f2421x));
            }
        }
        View.OnClickListener onClickListenerF = pVarB2.f();
        View.OnLongClickListener onLongClickListener = this.f2415r;
        checkableImageButton.setOnClickListener(onClickListenerF);
        Y0.j.P(checkableImageButton, onLongClickListener);
        EditText editText = this.f2419v;
        if (editText != null) {
            pVarB2.m(editText);
            j(pVarB2);
        }
        Y0.j.a(textInputLayout, checkableImageButton, this.n, this.f2412o);
        f(true);
    }

    public final void h(boolean z4) throws Resources.NotFoundException {
        if (d() != z4) {
            this.f2408j.setVisibility(z4 ? 0 : 8);
            k();
            m();
            this.f2403d.q();
        }
    }

    public final void i(Drawable drawable) throws Resources.NotFoundException {
        CheckableImageButton checkableImageButton = this.f;
        checkableImageButton.setImageDrawable(drawable);
        l();
        Y0.j.a(this.f2403d, checkableImageButton, this.f2405g, this.f2406h);
    }

    public final void j(p pVar) {
        if (this.f2419v == null) {
            return;
        }
        if (pVar.e() != null) {
            this.f2419v.setOnFocusChangeListener(pVar.e());
        }
        if (pVar.g() != null) {
            this.f2408j.setOnFocusChangeListener(pVar.g());
        }
    }

    public final void k() {
        this.f2404e.setVisibility((this.f2408j.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f2416s == null || this.f2418u) ? 8 : false)) ? 0 : 8);
    }

    public final void l() throws Resources.NotFoundException {
        CheckableImageButton checkableImageButton = this.f;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f2403d;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f6026m.f2450q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.f2410l != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() throws Resources.NotFoundException {
        int paddingEnd;
        TextInputLayout textInputLayout = this.f2403d;
        if (textInputLayout.f6017g == null) {
            return;
        }
        if (d() || e()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.f6017g;
            WeakHashMap weakHashMap = P.f1421a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f6017g.getPaddingTop();
        int paddingBottom = textInputLayout.f6017g.getPaddingBottom();
        WeakHashMap weakHashMap2 = P.f1421a;
        this.f2417t.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void n() {
        AppCompatTextView appCompatTextView = this.f2417t;
        int visibility = appCompatTextView.getVisibility();
        int i5 = (this.f2416s == null || this.f2418u) ? 8 : 0;
        if (visibility != i5) {
            b().p(i5 == 0);
        }
        k();
        appCompatTextView.setVisibility(i5);
        this.f2403d.q();
    }
}
