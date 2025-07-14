package e;

import android.view.View;

/* renamed from: e.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0400c implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f6541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0406i f6542b;

    public ViewOnLayoutChangeListenerC0400c(C0406i c0406i, View view) {
        this.f6542b = c0406i;
        this.f6541a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        view.post(new A1.h(13, this));
    }
}
