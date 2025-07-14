package j;

import android.view.ActionProvider;
import android.view.View;
import b0.C0198c;

/* renamed from: j.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0495l implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public final ActionProvider f7006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0499p f7007b;

    /* renamed from: c, reason: collision with root package name */
    public C0198c f7008c;

    public ActionProviderVisibilityListenerC0495l(MenuItemC0499p menuItemC0499p, ActionProvider actionProvider) {
        this.f7007b = menuItemC0499p;
        this.f7006a = actionProvider;
    }

    public final View a(C0494k c0494k) {
        return this.f7006a.onCreateActionView(c0494k);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z4) {
        C0198c c0198c = this.f7008c;
        if (c0198c != null) {
            MenuC0492i menuC0492i = ((C0494k) c0198c.f5001d).n;
            menuC0492i.f6961h = true;
            menuC0492i.p(true);
        }
    }
}
