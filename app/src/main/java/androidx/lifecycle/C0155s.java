package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import b3.AbstractC0219i;
import com.samsung.android.knox.ex.KnoxContract;

/* renamed from: androidx.lifecycle.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155s extends AbstractC0147j {
    @Override // androidx.lifecycle.AbstractC0147j, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC0219i.e(KnoxContract.Config.Settings.PARAM_HWKEY_ACTION_ACTIVITY, activity);
        int i5 = N.f3976d;
        L.b(activity);
    }
}
