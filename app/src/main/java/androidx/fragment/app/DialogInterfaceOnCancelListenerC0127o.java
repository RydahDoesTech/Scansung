package androidx.fragment.app;

import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0127o implements DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0130s f3900d;

    public DialogInterfaceOnCancelListenerC0127o(DialogInterfaceOnCancelListenerC0130s dialogInterfaceOnCancelListenerC0130s) {
        this.f3900d = dialogInterfaceOnCancelListenerC0130s;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0130s dialogInterfaceOnCancelListenerC0130s = this.f3900d;
        if (dialogInterfaceOnCancelListenerC0130s.mDialog != null) {
            dialogInterfaceOnCancelListenerC0130s.onCancel(dialogInterfaceOnCancelListenerC0130s.mDialog);
        }
    }
}
