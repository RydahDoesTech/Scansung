package e;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.samsung.android.knox.custom.CustomDeviceManager;
import com.wssyncmldm.R;
import i.AbstractC0476b;
import i.InterfaceC0475a;
import java.lang.reflect.InvocationTargetException;

/* renamed from: e.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceC0408k extends androidx.activity.l implements DialogInterface, InterfaceC0412o {

    /* renamed from: g, reason: collision with root package name */
    public B f6603g;

    /* renamed from: h, reason: collision with root package name */
    public final C f6604h;

    /* renamed from: i, reason: collision with root package name */
    public final C0406i f6605i;

    public DialogInterfaceC0408k(ContextThemeWrapper contextThemeWrapper, int i5) {
        int i6;
        int iG = g(contextThemeWrapper, i5);
        if (iG == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i6 = typedValue.resourceId;
        } else {
            i6 = iG;
        }
        super(contextThemeWrapper, i6);
        this.f6604h = new C(this);
        r rVarE = e();
        if (iG == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iG = typedValue2.resourceId;
        }
        ((B) rVarE).f6455W = iG;
        rVarE.f();
        this.f6605i = new C0406i(getContext(), this, getWindow());
    }

    public static int g(Context context, int i5) {
        if (((i5 >>> 24) & CustomDeviceManager.CALL_SCREEN_ALL) >= 1) {
            return i5;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.l, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        B b2 = (B) e();
        b2.x();
        ((ViewGroup) b2.f6437B.findViewById(android.R.id.content)).addView(view, layoutParams);
        b2.n.a(b2.f6470m.getCallback());
    }

    public final Button d(int i5) {
        C0406i c0406i = this.f6605i;
        if (i5 == -3) {
            return c0406i.f6589o;
        }
        if (i5 == -2) {
            return c0406i.f6587l;
        }
        if (i5 == -1) {
            return c0406i.f6584i;
        }
        c0406i.getClass();
        return null;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        e().g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        C c2 = this.f6604h;
        if (c2 == null) {
            return false;
        }
        return c2.f6483d.i(keyEvent);
    }

    public final r e() {
        if (this.f6603g == null) {
            H h3 = r.f6609d;
            this.f6603g = new B(getContext(), getWindow(), this, this);
        }
        return this.f6603g;
    }

    public final void f(Bundle bundle) {
        e().a();
        super.onCreate(bundle);
        e().f();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i5) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        B b2 = (B) e();
        b2.x();
        return b2.f6470m.findViewById(i5);
    }

    public final void h(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().n(charSequence);
    }

    public final boolean i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        e().b();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0279  */
    @Override // androidx.activity.l, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 1266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.DialogInterfaceC0408k.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i5, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f6605i.f6592r;
        if (nestedScrollView == null || !nestedScrollView.l(keyEvent)) {
            return super.onKeyDown(i5, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i5, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f6605i.f6592r;
        if (nestedScrollView == null || !nestedScrollView.l(keyEvent)) {
            return super.onKeyUp(i5, keyEvent);
        }
        return true;
    }

    @Override // androidx.activity.l, android.app.Dialog
    public final void onStop() {
        super.onStop();
        e().h();
    }

    @Override // e.InterfaceC0412o
    public final void onSupportActionModeFinished(AbstractC0476b abstractC0476b) {
    }

    @Override // e.InterfaceC0412o
    public final void onSupportActionModeStarted(AbstractC0476b abstractC0476b) {
    }

    @Override // e.InterfaceC0412o
    public final AbstractC0476b onWindowStartingSupportActionMode(InterfaceC0475a interfaceC0475a) {
        return null;
    }

    @Override // androidx.activity.l, android.app.Dialog
    public final void setContentView(int i5) {
        e().k(i5);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i5) {
        super.setTitle(i5);
        e().n(getContext().getString(i5));
    }

    @Override // androidx.activity.l, android.app.Dialog
    public final void setContentView(View view) {
        e().l(view);
    }

    @Override // androidx.activity.l, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e().m(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        h(charSequence);
        C0406i c0406i = this.f6605i;
        c0406i.f6580d = charSequence;
        TextView textView = c0406i.f6595u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
