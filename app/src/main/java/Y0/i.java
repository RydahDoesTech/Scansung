package Y0;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
public class i extends DialogInterfaceOnCancelListenerC0130s {

    /* renamed from: d, reason: collision with root package name */
    public AlertDialog f2826d = null;

    /* renamed from: e, reason: collision with root package name */
    public GoogleApiActivity f2827e = null;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        GoogleApiActivity googleApiActivity = this.f2827e;
        if (googleApiActivity != null) {
            googleApiActivity.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s
    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f2826d == null) {
            setShowsDialog(false);
        }
        return this.f2826d;
    }
}
