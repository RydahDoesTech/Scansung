package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.InterfaceC0159w;

/* renamed from: androidx.fragment.app.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129q implements androidx.lifecycle.G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0130s f3908a;

    public C0129q(DialogInterfaceOnCancelListenerC0130s dialogInterfaceOnCancelListenerC0130s) {
        this.f3908a = dialogInterfaceOnCancelListenerC0130s;
    }

    @Override // androidx.lifecycle.G
    public final void c(Object obj) {
        if (((InterfaceC0159w) obj) != null) {
            DialogInterfaceOnCancelListenerC0130s dialogInterfaceOnCancelListenerC0130s = this.f3908a;
            if (dialogInterfaceOnCancelListenerC0130s.mShowsDialog) {
                View viewRequireView = dialogInterfaceOnCancelListenerC0130s.requireView();
                if (viewRequireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (dialogInterfaceOnCancelListenerC0130s.mDialog != null) {
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("SeslDialogFragment", "DialogFragment " + this + " setting the content view on " + dialogInterfaceOnCancelListenerC0130s.mDialog);
                    }
                    dialogInterfaceOnCancelListenerC0130s.mDialog.setContentView(viewRequireView);
                }
            }
        }
    }
}
