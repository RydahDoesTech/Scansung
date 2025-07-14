package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0161y;
import androidx.lifecycle.EnumC0153p;
import androidx.lifecycle.InterfaceC0159w;
import androidx.lifecycle.Q;
import b3.AbstractC0219i;
import com.wssyncmldm.R;
import s0.AbstractC0823a;

/* loaded from: classes.dex */
public class l extends Dialog implements InterfaceC0159w, w, w0.f {

    /* renamed from: d, reason: collision with root package name */
    public C0161y f3127d;

    /* renamed from: e, reason: collision with root package name */
    public final w0.e f3128e;
    public final v f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, int i5) {
        super(context, i5);
        AbstractC0219i.e("context", context);
        this.f3128e = new w0.e(this);
        this.f = new v(new C1.b(9, this));
    }

    public static void a(l lVar) {
        AbstractC0219i.e("this$0", lVar);
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC0219i.e("view", view);
        c();
        super.addContentView(view, layoutParams);
    }

    public final C0161y b() {
        C0161y c0161y = this.f3127d;
        if (c0161y != null) {
            return c0161y;
        }
        C0161y c0161y2 = new C0161y(this);
        this.f3127d = c0161y2;
        return c0161y2;
    }

    public final void c() {
        Window window = getWindow();
        AbstractC0219i.b(window);
        View decorView = window.getDecorView();
        AbstractC0219i.d("window!!.decorView", decorView);
        Q.f(decorView, this);
        Window window2 = getWindow();
        AbstractC0219i.b(window2);
        View decorView2 = window2.getDecorView();
        AbstractC0219i.d("window!!.decorView", decorView2);
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        AbstractC0219i.b(window3);
        View decorView3 = window3.getDecorView();
        AbstractC0219i.d("window!!.decorView", decorView3);
        AbstractC0823a.d(decorView3, this);
    }

    @Override // androidx.lifecycle.InterfaceC0159w
    public final androidx.lifecycle.r getLifecycle() {
        return b();
    }

    @Override // androidx.activity.w
    public final v getOnBackPressedDispatcher() {
        return this.f;
    }

    @Override // w0.f
    public final w0.d getSavedStateRegistry() {
        return this.f3128e.f9293b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        AbstractC0219i.d("onBackInvokedDispatcher", onBackInvokedDispatcher);
        v vVar = this.f;
        vVar.getClass();
        vVar.f3173e = onBackInvokedDispatcher;
        vVar.c(vVar.f3174g);
        this.f3128e.b(bundle);
        b().e(EnumC0153p.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC0219i.d("super.onSaveInstanceState()", bundleOnSaveInstanceState);
        this.f3128e.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        b().e(EnumC0153p.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().e(EnumC0153p.ON_DESTROY);
        this.f3127d = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i5) {
        c();
        super.setContentView(i5);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        AbstractC0219i.e("view", view);
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC0219i.e("view", view);
        c();
        super.setContentView(view, layoutParams);
    }
}
