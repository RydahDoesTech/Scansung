package R1;

import J.P;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.wssyncmldm.R;
import java.util.WeakHashMap;
import v1.AbstractC0886a;

/* loaded from: classes.dex */
public final class k extends p {

    /* renamed from: e, reason: collision with root package name */
    public final int f2387e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f2388g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f2389h;

    /* renamed from: i, reason: collision with root package name */
    public final E1.u f2390i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0089a f2391j;

    /* renamed from: k, reason: collision with root package name */
    public final I0.b f2392k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2393l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2394m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public long f2395o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f2396p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f2397q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f2398r;

    public k(o oVar) {
        super(oVar);
        this.f2390i = new E1.u(2, this);
        this.f2391j = new ViewOnFocusChangeListenerC0089a(this, 1);
        this.f2392k = new I0.b(3, this);
        this.f2395o = Long.MAX_VALUE;
        this.f = J2.b.T(oVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f2387e = J2.b.T(oVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f2388g = J2.b.U(oVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0886a.f9217a);
    }

    @Override // R1.p
    public final void a() {
        if (this.f2396p.isTouchExplorationEnabled() && V1.a.W(this.f2389h) && !this.f2426d.hasFocus()) {
            this.f2389h.dismissDropDown();
        }
        this.f2389h.post(new C1.b(5, this));
    }

    @Override // R1.p
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // R1.p
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // R1.p
    public final View.OnFocusChangeListener e() {
        return this.f2391j;
    }

    @Override // R1.p
    public final View.OnClickListener f() {
        return this.f2390i;
    }

    @Override // R1.p
    public final I0.b h() {
        return this.f2392k;
    }

    @Override // R1.p
    public final boolean i(int i5) {
        return i5 != 0;
    }

    @Override // R1.p
    public final boolean j() {
        return this.f2393l;
    }

    @Override // R1.p
    public final boolean l() {
        return this.n;
    }

    @Override // R1.p
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f2389h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: R1.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar = this.f2385d;
                kVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - kVar.f2395o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        kVar.f2394m = false;
                    }
                    kVar.u();
                    kVar.f2394m = true;
                    kVar.f2395o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f2389h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: R1.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                k kVar = this.f2386a;
                kVar.f2394m = true;
                kVar.f2395o = System.currentTimeMillis();
                kVar.t(false);
            }
        });
        this.f2389h.setThreshold(0);
        TextInputLayout textInputLayout = this.f2423a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!V1.a.W(editText) && this.f2396p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = P.f1421a;
            this.f2426d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // R1.p
    public final void n(K.h hVar) {
        if (!V1.a.W(this.f2389h)) {
            hVar.g(Spinner.class.getName());
        }
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f1615a;
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // R1.p
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f2396p.isEnabled() || V1.a.W(this.f2389h)) {
            return;
        }
        boolean z4 = accessibilityEvent.getEventType() == 32768 && this.n && !this.f2389h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z4) {
            u();
            this.f2394m = true;
            this.f2395o = System.currentTimeMillis();
        }
    }

    @Override // R1.p
    public final void r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f2388g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new h(0, this));
        this.f2398r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f2387e);
        valueAnimatorOfFloat2.addUpdateListener(new h(0, this));
        this.f2397q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new B0.q(3, this));
        this.f2396p = (AccessibilityManager) this.f2425c.getSystemService("accessibility");
    }

    @Override // R1.p
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f2389h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f2389h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z4) {
        if (this.n != z4) {
            this.n = z4;
            this.f2398r.cancel();
            this.f2397q.start();
        }
    }

    public final void u() {
        if (this.f2389h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f2395o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f2394m = false;
        }
        if (this.f2394m) {
            this.f2394m = false;
            return;
        }
        t(!this.n);
        if (!this.n) {
            this.f2389h.dismissDropDown();
        } else {
            this.f2389h.requestFocus();
            this.f2389h.showDropDown();
        }
    }
}
