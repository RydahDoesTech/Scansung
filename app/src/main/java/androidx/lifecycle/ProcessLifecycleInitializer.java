package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import b3.AbstractC0219i;
import java.util.List;
import kotlin.Metadata;
import z0.C0944a;
import z0.InterfaceC0945b;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lz0/b;", "Landroidx/lifecycle/w;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0945b {
    @Override // z0.InterfaceC0945b
    public final List a() {
        return P2.u.f2163d;
    }

    @Override // z0.InterfaceC0945b
    public final Object b(Context context) {
        AbstractC0219i.e("context", context);
        C0944a c0944aC = C0944a.c(context);
        AbstractC0219i.d("getInstance(context)", c0944aC);
        if (!c0944aC.f9476b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0156t.f4026a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            AbstractC0219i.c("null cannot be cast to non-null type android.app.Application", applicationContext);
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0155s());
        }
        K k5 = K.f3966k;
        k5.getClass();
        k5.f3970h = new Handler();
        k5.f3971i.e(EnumC0153p.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC0219i.c("null cannot be cast to non-null type android.app.Application", applicationContext2);
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new J(k5));
        return k5;
    }
}
