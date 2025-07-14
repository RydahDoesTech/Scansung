package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;
import e.C0404g;
import e.C0407j;
import e.DialogInterfaceC0408k;

/* renamed from: j.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0488e implements InterfaceC0504u, AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public Context f6942d;

    /* renamed from: e, reason: collision with root package name */
    public LayoutInflater f6943e;
    public MenuC0492i f;

    /* renamed from: g, reason: collision with root package name */
    public ExpandedMenuView f6944g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0503t f6945h;

    /* renamed from: i, reason: collision with root package name */
    public C0487d f6946i;

    public C0488e(ContextWrapper contextWrapper) {
        this.f6942d = contextWrapper;
        this.f6943e = LayoutInflater.from(contextWrapper);
    }

    @Override // j.InterfaceC0504u
    public final void a(MenuC0492i menuC0492i, boolean z4) {
        InterfaceC0503t interfaceC0503t = this.f6945h;
        if (interfaceC0503t != null) {
            interfaceC0503t.a(menuC0492i, z4);
        }
    }

    @Override // j.InterfaceC0504u
    public final void c(Context context, MenuC0492i menuC0492i) {
        if (this.f6942d != null) {
            this.f6942d = context;
            if (this.f6943e == null) {
                this.f6943e = LayoutInflater.from(context);
            }
        }
        this.f = menuC0492i;
        C0487d c0487d = this.f6946i;
        if (c0487d != null) {
            c0487d.notifyDataSetChanged();
        }
    }

    @Override // j.InterfaceC0504u
    public final boolean d() {
        return false;
    }

    @Override // j.InterfaceC0504u
    public final boolean e(C0494k c0494k) {
        return false;
    }

    @Override // j.InterfaceC0504u
    public final void f() {
        C0487d c0487d = this.f6946i;
        if (c0487d != null) {
            c0487d.notifyDataSetChanged();
        }
    }

    @Override // j.InterfaceC0504u
    public final boolean g(C0494k c0494k) {
        return false;
    }

    @Override // j.InterfaceC0504u
    public final boolean h(SubMenuC0483A subMenuC0483A) {
        if (!subMenuC0483A.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0493j dialogInterfaceOnKeyListenerC0493j = new DialogInterfaceOnKeyListenerC0493j();
        dialogInterfaceOnKeyListenerC0493j.f6977d = subMenuC0483A;
        Context context = subMenuC0483A.f6955a;
        C0407j c0407j = new C0407j(context);
        C0404g c0404g = c0407j.f6601a;
        C0488e c0488e = new C0488e(c0404g.f6549a);
        dialogInterfaceOnKeyListenerC0493j.f = c0488e;
        c0488e.f6945h = dialogInterfaceOnKeyListenerC0493j;
        subMenuC0483A.b(c0488e, context);
        C0488e c0488e2 = dialogInterfaceOnKeyListenerC0493j.f;
        if (c0488e2.f6946i == null) {
            c0488e2.f6946i = new C0487d(c0488e2);
        }
        c0404g.f6561o = c0488e2.f6946i;
        c0404g.f6562p = dialogInterfaceOnKeyListenerC0493j;
        View view = subMenuC0483A.f6967o;
        if (view != null) {
            c0404g.f6553e = view;
        } else {
            c0404g.f6551c = subMenuC0483A.n;
            c0404g.f6552d = subMenuC0483A.f6966m;
        }
        c0404g.f6560m = dialogInterfaceOnKeyListenerC0493j;
        DialogInterfaceC0408k dialogInterfaceC0408kA = c0407j.a();
        dialogInterfaceOnKeyListenerC0493j.f6978e = dialogInterfaceC0408kA;
        dialogInterfaceC0408kA.setOnDismissListener(dialogInterfaceOnKeyListenerC0493j);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0493j.f6978e.getWindow().getAttributes();
        attributes.type = IDMCallbackStatusInterface.IDM_STATUS_START;
        attributes.flags |= NetworkAnalyticsConstants.DataPoints.FLAG_PPID;
        dialogInterfaceOnKeyListenerC0493j.f6978e.show();
        InterfaceC0503t interfaceC0503t = this.f6945h;
        if (interfaceC0503t == null) {
            return true;
        }
        interfaceC0503t.b(subMenuC0483A);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i5, long j5) {
        this.f.q(this.f6946i.getItem(i5), this, 0);
    }
}
