package Y0;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
public class b extends DialogFragment {

    /* renamed from: d, reason: collision with root package name */
    public AlertDialog f2809d = null;

    /* renamed from: e, reason: collision with root package name */
    public GoogleApiActivity f2810e = null;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        GoogleApiActivity googleApiActivity = this.f2810e;
        if (googleApiActivity != null) {
            googleApiActivity.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f2809d == null) {
            setShowsDialog(false);
        }
        return this.f2809d;
    }
}
