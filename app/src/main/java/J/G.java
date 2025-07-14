package J;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class G implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f1419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0060q f1420b;

    public G(View view, InterfaceC0060q interfaceC0060q) {
        this.f1419a = view;
        this.f1420b = interfaceC0060q;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return this.f1420b.Z(view, p0.f(windowInsets, view)).e();
    }
}
