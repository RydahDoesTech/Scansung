package j;

import androidx.appcompat.view.menu.ActionMenuItemView;
import k.AbstractViewOnTouchListenerC0645o0;
import k.C0618f;
import k.C0621g;

/* renamed from: j.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0485b extends AbstractViewOnTouchListenerC0645o0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ActionMenuItemView f6939m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0485b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f6939m = actionMenuItemView;
    }

    @Override // k.AbstractViewOnTouchListenerC0645o0
    public final InterfaceC0508y b() {
        C0618f c0618f;
        AbstractC0486c abstractC0486c = this.f6939m.f3198p;
        if (abstractC0486c == null || (c0618f = ((C0621g) abstractC0486c).f7666a.f7708w) == null) {
            return null;
        }
        return c0618f.a();
    }

    @Override // k.AbstractViewOnTouchListenerC0645o0
    public final boolean c() {
        InterfaceC0508y interfaceC0508yB;
        ActionMenuItemView actionMenuItemView = this.f6939m;
        InterfaceC0491h interfaceC0491h = actionMenuItemView.n;
        return interfaceC0491h != null && interfaceC0491h.b(actionMenuItemView.f3194k) && (interfaceC0508yB = b()) != null && ((ViewOnKeyListenerC0509z) interfaceC0508yB).b();
    }
}
