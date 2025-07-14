package androidx.fragment.app;

import J.InterfaceC0049f;
import J.InterfaceC0055l;
import android.view.View;
import android.view.Window;
import z.InterfaceC0942e;
import z.InterfaceC0943f;

/* loaded from: classes.dex */
public final class G extends M implements InterfaceC0942e, InterfaceC0943f, y.w, y.x, androidx.lifecycle.c0, androidx.activity.w, androidx.activity.result.i, w0.f, e0, InterfaceC0049f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ H f3719h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(H h3) {
        super(h3);
        this.f3719h = h3;
    }

    @Override // androidx.fragment.app.e0
    public final void a(Fragment fragment) {
        this.f3719h.onAttachFragment(fragment);
    }

    @Override // J.InterfaceC0049f
    public final void addMenuProvider(InterfaceC0055l interfaceC0055l) {
        this.f3719h.addMenuProvider(interfaceC0055l);
    }

    @Override // z.InterfaceC0942e
    public final void addOnConfigurationChangedListener(I.a aVar) {
        this.f3719h.addOnConfigurationChangedListener(aVar);
    }

    @Override // y.w
    public final void addOnMultiWindowModeChangedListener(I.a aVar) {
        this.f3719h.addOnMultiWindowModeChangedListener(aVar);
    }

    @Override // y.x
    public final void addOnPictureInPictureModeChangedListener(I.a aVar) {
        this.f3719h.addOnPictureInPictureModeChangedListener(aVar);
    }

    @Override // z.InterfaceC0943f
    public final void addOnTrimMemoryListener(I.a aVar) {
        this.f3719h.addOnTrimMemoryListener(aVar);
    }

    @Override // androidx.fragment.app.K
    public final View b(int i5) {
        return this.f3719h.findViewById(i5);
    }

    @Override // androidx.fragment.app.K
    public final boolean c() {
        Window window = this.f3719h.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.activity.result.i
    public final androidx.activity.result.h getActivityResultRegistry() {
        return this.f3719h.getActivityResultRegistry();
    }

    @Override // androidx.lifecycle.InterfaceC0159w
    public final androidx.lifecycle.r getLifecycle() {
        return this.f3719h.mFragmentLifecycleRegistry;
    }

    @Override // androidx.activity.w
    public final androidx.activity.v getOnBackPressedDispatcher() {
        return this.f3719h.getOnBackPressedDispatcher();
    }

    @Override // w0.f
    public final w0.d getSavedStateRegistry() {
        return this.f3719h.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.c0
    public final androidx.lifecycle.b0 getViewModelStore() {
        return this.f3719h.getViewModelStore();
    }

    @Override // J.InterfaceC0049f
    public final void removeMenuProvider(InterfaceC0055l interfaceC0055l) {
        this.f3719h.removeMenuProvider(interfaceC0055l);
    }

    @Override // z.InterfaceC0942e
    public final void removeOnConfigurationChangedListener(I.a aVar) {
        this.f3719h.removeOnConfigurationChangedListener(aVar);
    }

    @Override // y.w
    public final void removeOnMultiWindowModeChangedListener(I.a aVar) {
        this.f3719h.removeOnMultiWindowModeChangedListener(aVar);
    }

    @Override // y.x
    public final void removeOnPictureInPictureModeChangedListener(I.a aVar) {
        this.f3719h.removeOnPictureInPictureModeChangedListener(aVar);
    }

    @Override // z.InterfaceC0943f
    public final void removeOnTrimMemoryListener(I.a aVar) {
        this.f3719h.removeOnTrimMemoryListener(aVar);
    }
}
