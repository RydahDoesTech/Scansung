package k;

import androidx.appcompat.widget.AppCompatSpinner;
import j.InterfaceC0508y;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589D extends AbstractViewOnTouchListenerC0645o0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0598M f7479m;
    public final /* synthetic */ AppCompatSpinner n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0589D(AppCompatSpinner appCompatSpinner, AppCompatSpinner appCompatSpinner2, C0598M c0598m) {
        super(appCompatSpinner2);
        this.n = appCompatSpinner;
        this.f7479m = c0598m;
    }

    @Override // k.AbstractViewOnTouchListenerC0645o0
    public final InterfaceC0508y b() {
        return this.f7479m;
    }

    @Override // k.AbstractViewOnTouchListenerC0645o0
    public final boolean c() {
        AppCompatSpinner appCompatSpinner = this.n;
        if (appCompatSpinner.getInternalPopup().b()) {
            return true;
        }
        appCompatSpinner.f3309i.e(AbstractC0592G.b(appCompatSpinner), AbstractC0592G.a(appCompatSpinner));
        return true;
    }
}
