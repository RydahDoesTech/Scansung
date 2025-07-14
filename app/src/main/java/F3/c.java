package F3;

import J.a0;
import androidx.appcompat.widget.ActionBarContextView;
import e4.AbstractC0442z;

/* loaded from: classes.dex */
public final class c implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f632a;

    /* renamed from: b, reason: collision with root package name */
    public int f633b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f634c;

    public c(AbstractC0442z abstractC0442z, int i5, boolean z4) {
        this.f634c = abstractC0442z;
        this.f633b = i5;
        this.f632a = z4;
    }

    @Override // J.a0
    public void a() {
        if (this.f632a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f634c;
        actionBarContextView.f3241i = null;
        super/*android.view.View*/.setVisibility(this.f633b);
    }

    @Override // J.a0
    public void b() {
        this.f632a = true;
    }

    @Override // J.a0
    public void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f632a = false;
    }

    public c(ActionBarContextView actionBarContextView) {
        this.f634c = actionBarContextView;
        this.f632a = false;
    }
}
