package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import b3.AbstractC0219i;
import com.samsung.android.knox.ex.KnoxContract;

/* loaded from: classes.dex */
public abstract class I {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        AbstractC0219i.e(KnoxContract.Config.Settings.PARAM_HWKEY_ACTION_ACTIVITY, activity);
        AbstractC0219i.e("callback", activityLifecycleCallbacks);
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
