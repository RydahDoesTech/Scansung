package j;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import e.DialogInterfaceC0408k;

/* renamed from: j.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0493j implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0503t {

    /* renamed from: d, reason: collision with root package name */
    public SubMenuC0483A f6977d;

    /* renamed from: e, reason: collision with root package name */
    public DialogInterfaceC0408k f6978e;
    public C0488e f;

    @Override // j.InterfaceC0503t
    public final void a(MenuC0492i menuC0492i, boolean z4) {
        DialogInterfaceC0408k dialogInterfaceC0408k;
        if ((z4 || menuC0492i == this.f6977d) && (dialogInterfaceC0408k = this.f6978e) != null) {
            dialogInterfaceC0408k.dismiss();
        }
    }

    @Override // j.InterfaceC0503t
    public final boolean b(MenuC0492i menuC0492i) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        C0488e c0488e = this.f;
        if (c0488e.f6946i == null) {
            c0488e.f6946i = new C0487d(c0488e);
        }
        this.f6977d.q(c0488e.f6946i.getItem(i5), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f.a(this.f6977d, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i5, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC0483A subMenuC0483A = this.f6977d;
        if (i5 == 82 || i5 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f6978e.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f6978e.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC0483A.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC0483A.performShortcut(i5, keyEvent, 0);
    }
}
