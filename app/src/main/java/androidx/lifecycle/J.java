package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import b3.AbstractC0219i;
import com.samsung.android.knox.ex.KnoxContract;

/* loaded from: classes.dex */
public final class J extends AbstractC0147j {
    final /* synthetic */ K this$0;

    public static final class a extends AbstractC0147j {
        final /* synthetic */ K this$0;

        public a(K k5) {
            this.this$0 = k5;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC0219i.e(KnoxContract.Config.Settings.PARAM_HWKEY_ACTION_ACTIVITY, activity);
            K k5 = this.this$0;
            int i5 = k5.f3968e + 1;
            k5.f3968e = i5;
            if (i5 == 1) {
                if (k5.f) {
                    k5.f3971i.e(EnumC0153p.ON_RESUME);
                    k5.f = false;
                } else {
                    Handler handler = k5.f3970h;
                    AbstractC0219i.b(handler);
                    handler.removeCallbacks(k5.f3972j);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC0219i.e(KnoxContract.Config.Settings.PARAM_HWKEY_ACTION_ACTIVITY, activity);
            K k5 = this.this$0;
            int i5 = k5.f3967d + 1;
            k5.f3967d = i5;
            if (i5 == 1 && k5.f3969g) {
                k5.f3971i.e(EnumC0153p.ON_START);
                k5.f3969g = false;
            }
        }
    }

    public J(K k5) {
        this.this$0 = k5;
    }

    @Override // androidx.lifecycle.AbstractC0147j, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC0219i.e(KnoxContract.Config.Settings.PARAM_HWKEY_ACTION_ACTIVITY, activity);
    }

    @Override // androidx.lifecycle.AbstractC0147j, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC0219i.e(KnoxContract.Config.Settings.PARAM_HWKEY_ACTION_ACTIVITY, activity);
        K k5 = this.this$0;
        int i5 = k5.f3968e - 1;
        k5.f3968e = i5;
        if (i5 == 0) {
            Handler handler = k5.f3970h;
            AbstractC0219i.b(handler);
            handler.postDelayed(k5.f3972j, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC0219i.e(KnoxContract.Config.Settings.PARAM_HWKEY_ACTION_ACTIVITY, activity);
        I.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0147j, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC0219i.e(KnoxContract.Config.Settings.PARAM_HWKEY_ACTION_ACTIVITY, activity);
        K k5 = this.this$0;
        int i5 = k5.f3967d - 1;
        k5.f3967d = i5;
        if (i5 == 0 && k5.f) {
            k5.f3971i.e(EnumC0153p.ON_STOP);
            k5.f3969g = true;
        }
    }
}
