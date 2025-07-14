package androidx.picker.widget;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class B implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4044d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4045e;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f4044d) {
            case 0:
                this.f4045e = false;
                break;
            default:
                this.f4045e = false;
                break;
        }
        return true;
    }
}
