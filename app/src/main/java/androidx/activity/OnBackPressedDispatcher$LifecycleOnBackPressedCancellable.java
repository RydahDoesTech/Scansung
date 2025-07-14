package androidx.activity;

import androidx.fragment.app.S;
import androidx.lifecycle.EnumC0153p;
import androidx.lifecycle.InterfaceC0157u;
import androidx.lifecycle.InterfaceC0159w;
import b3.AbstractC0219i;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"androidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable", "Landroidx/lifecycle/u;", "Landroidx/activity/c;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements InterfaceC0157u, c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.r f3108a;

    /* renamed from: b, reason: collision with root package name */
    public final S f3109b;

    /* renamed from: c, reason: collision with root package name */
    public t f3110c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f3111d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(v vVar, androidx.lifecycle.r rVar, S s2) {
        AbstractC0219i.e("onBackPressedCallback", s2);
        this.f3111d = vVar;
        this.f3108a = rVar;
        this.f3109b = s2;
        rVar.a(this);
    }

    @Override // androidx.lifecycle.InterfaceC0157u
    public final void a(InterfaceC0159w interfaceC0159w, EnumC0153p enumC0153p) {
        if (enumC0153p != EnumC0153p.ON_START) {
            if (enumC0153p != EnumC0153p.ON_STOP) {
                if (enumC0153p == EnumC0153p.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                t tVar = this.f3110c;
                if (tVar != null) {
                    tVar.cancel();
                    return;
                }
                return;
            }
        }
        v vVar = this.f3111d;
        vVar.getClass();
        S s2 = this.f3109b;
        AbstractC0219i.e("onBackPressedCallback", s2);
        vVar.f3170b.addLast(s2);
        t tVar2 = new t(vVar, s2);
        s2.f3738b.add(tVar2);
        vVar.d();
        s2.f3739c = new u(0, vVar, v.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        this.f3110c = tVar2;
    }

    @Override // androidx.activity.c
    public final void cancel() {
        this.f3108a.b(this);
        this.f3109b.f3738b.remove(this);
        t tVar = this.f3110c;
        if (tVar != null) {
            tVar.cancel();
        }
        this.f3110c = null;
    }
}
