package w2;

import android.content.Context;
import android.content.Intent;
import androidx.preference.Preference;
import androidx.preference.o;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.enabler.ui.userinit.UserInitEntryActivity;
import com.idm.fotaagent.enabler.ui.utagent.IDMUTAgentContract;

/* loaded from: classes.dex */
public final class c implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9299a;

    @Override // androidx.preference.o
    public final boolean a(Preference preference) {
        switch (this.f9299a) {
            case 0:
                IDMApplication.getEnablerFactory().getAdminCommandExecutor(preference.f4601d).execute(IDMUTAgentContract.LOCALTEST);
                break;
            default:
                Context context = preference.f4601d;
                context.startActivity(new Intent(context, (Class<?>) UserInitEntryActivity.class));
                break;
        }
        return true;
    }
}
