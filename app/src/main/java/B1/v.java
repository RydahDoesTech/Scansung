package b1;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
public final class v implements DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Intent f5067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GoogleApiActivity f5068e;

    public v(Intent intent, GoogleApiActivity googleApiActivity) {
        this.f5067d = intent;
        this.f5068e = googleApiActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        try {
            Intent intent = this.f5067d;
            if (intent != null) {
                this.f5068e.startActivityForResult(intent, 2);
            }
        } catch (ActivityNotFoundException e5) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e5);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
