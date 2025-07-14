package k;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.AppCompatSpinner;
import e.C0404g;
import e.C0407j;
import e.DialogInterfaceC0408k;

/* renamed from: k.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0594I implements InterfaceC0600O, DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public DialogInterfaceC0408k f7502d;

    /* renamed from: e, reason: collision with root package name */
    public C0595J f7503e;
    public CharSequence f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f7504g;

    public DialogInterfaceOnClickListenerC0594I(AppCompatSpinner appCompatSpinner) {
        this.f7504g = appCompatSpinner;
    }

    @Override // k.InterfaceC0600O
    public final boolean b() {
        DialogInterfaceC0408k dialogInterfaceC0408k = this.f7502d;
        if (dialogInterfaceC0408k != null) {
            return dialogInterfaceC0408k.isShowing();
        }
        return false;
    }

    @Override // k.InterfaceC0600O
    public final void c(int i5) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // k.InterfaceC0600O
    public final int d() {
        return 0;
    }

    @Override // k.InterfaceC0600O
    public final void dismiss() {
        DialogInterfaceC0408k dialogInterfaceC0408k = this.f7502d;
        if (dialogInterfaceC0408k != null) {
            dialogInterfaceC0408k.dismiss();
            this.f7502d = null;
        }
    }

    @Override // k.InterfaceC0600O
    public final void e(int i5, int i6) {
        if (this.f7503e == null) {
            return;
        }
        AppCompatSpinner appCompatSpinner = this.f7504g;
        C0407j c0407j = new C0407j(appCompatSpinner.getPopupContext());
        CharSequence charSequence = this.f;
        C0404g c0404g = c0407j.f6601a;
        if (charSequence != null) {
            c0404g.f6552d = charSequence;
        }
        C0595J c0595j = this.f7503e;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        c0404g.f6561o = c0595j;
        c0404g.f6562p = this;
        c0404g.f6567u = selectedItemPosition;
        c0404g.f6566t = true;
        DialogInterfaceC0408k dialogInterfaceC0408kA = c0407j.a();
        this.f7502d = dialogInterfaceC0408kA;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC0408kA.f6605i.f;
        AbstractC0592G.d(alertController$RecycleListView, i5);
        AbstractC0592G.c(alertController$RecycleListView, i6);
        this.f7502d.show();
    }

    @Override // k.InterfaceC0600O
    public final int f() {
        return 0;
    }

    @Override // k.InterfaceC0600O
    public final Drawable g() {
        return null;
    }

    @Override // k.InterfaceC0600O
    public final CharSequence h() {
        return this.f;
    }

    @Override // k.InterfaceC0600O
    public final void j(CharSequence charSequence) {
        this.f = charSequence;
    }

    @Override // k.InterfaceC0600O
    public final void l(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // k.InterfaceC0600O
    public final void m(int i5) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // k.InterfaceC0600O
    public final void n(ListAdapter listAdapter) {
        this.f7503e = (C0595J) listAdapter;
    }

    @Override // k.InterfaceC0600O
    public final void o(int i5) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        AppCompatSpinner appCompatSpinner = this.f7504g;
        appCompatSpinner.setSelection(i5);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick(null, i5, this.f7503e.getItemId(i5));
        }
        dismiss();
    }
}
