package j;

import android.widget.PopupWindow;

/* renamed from: j.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0500q implements PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0502s f7016d;

    public C0500q(C0502s c0502s) {
        this.f7016d = c0502s;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f7016d.c();
    }
}
