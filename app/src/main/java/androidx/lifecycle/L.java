package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import androidx.lifecycle.N;
import b3.AbstractC0219i;
import com.samsung.android.knox.ex.KnoxContract;

/* loaded from: classes.dex */
public abstract class L {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0153p enumC0153p) {
        AbstractC0219i.e(KnoxContract.Config.Settings.PARAM_HWKEY_ACTION_ACTIVITY, activity);
        AbstractC0219i.e(KnoxContract.Config.Settings.PARAM_HWKEY_ACTIVITY_EVENT, enumC0153p);
        if (activity instanceof InterfaceC0159w) {
            r lifecycle = ((InterfaceC0159w) activity).getLifecycle();
            if (lifecycle instanceof C0161y) {
                ((C0161y) lifecycle).e(enumC0153p);
            }
        }
    }

    public static void b(Activity activity) {
        AbstractC0219i.e(KnoxContract.Config.Settings.PARAM_HWKEY_ACTION_ACTIVITY, activity);
        N.a.Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new N.a());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new N(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
