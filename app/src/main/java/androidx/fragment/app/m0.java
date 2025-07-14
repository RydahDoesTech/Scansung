package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes.dex */
public final class m0 extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3894a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rect f3895b;

    public /* synthetic */ m0(int i5, Rect rect) {
        this.f3894a = i5;
        this.f3895b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        switch (this.f3894a) {
            case 0:
                return this.f3895b;
            default:
                Rect rect = this.f3895b;
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
