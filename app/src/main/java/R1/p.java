package R1;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f2423a;

    /* renamed from: b, reason: collision with root package name */
    public final o f2424b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2425c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f2426d;

    public p(o oVar) {
        this.f2423a = oVar.f2403d;
        this.f2424b = oVar;
        this.f2425c = oVar.getContext();
        this.f2426d = oVar.f2408j;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public I0.b h() {
        return null;
    }

    public boolean i(int i5) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof k;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(K.h hVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z4) {
    }

    public final void q() {
        this.f2424b.f(false);
    }

    public void r() {
    }

    public void s() {
    }
}
