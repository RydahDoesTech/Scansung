package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.EnumC0153p;

/* loaded from: classes.dex */
public final /* synthetic */ class D implements w0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3711b;

    public /* synthetic */ D(int i5, Object obj) {
        this.f3710a = i5;
        this.f3711b = obj;
    }

    @Override // w0.c
    public final Bundle a() {
        switch (this.f3710a) {
            case 0:
                H h3 = (H) this.f3711b;
                h3.markFragmentsCreated();
                h3.mFragmentLifecycleRegistry.e(EnumC0153p.ON_STOP);
                return new Bundle();
            default:
                return ((a0) this.f3711b).R();
        }
    }
}
