package androidx.fragment.app;

import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0128p implements DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0130s f3906d;

    public DialogInterfaceOnDismissListenerC0128p(DialogInterfaceOnCancelListenerC0130s dialogInterfaceOnCancelListenerC0130s) {
        this.f3906d = dialogInterfaceOnCancelListenerC0130s;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0130s dialogInterfaceOnCancelListenerC0130s = this.f3906d;
        if (dialogInterfaceOnCancelListenerC0130s.mDialog != null) {
            dialogInterfaceOnCancelListenerC0130s.onDismiss(dialogInterfaceOnCancelListenerC0130s.mDialog);
        }
    }
}
