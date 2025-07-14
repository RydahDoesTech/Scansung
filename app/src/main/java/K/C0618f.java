package k;

import android.content.Context;
import android.view.View;
import com.wssyncmldm.R;
import j.C0502s;
import j.MenuC0492i;
import j.SubMenuC0483A;
import j.ViewOnKeyListenerC0509z;

/* renamed from: k.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0618f extends C0502s {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f7661m = 0;
    public final /* synthetic */ C0633k n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0618f(C0633k c0633k, Context context, MenuC0492i menuC0492i, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0492i, true);
        this.n = c0633k;
        this.f = 8388613;
        C0586A c0586a = c0633k.f7711z;
        this.f7023h = c0586a;
        ViewOnKeyListenerC0509z viewOnKeyListenerC0509z = this.f7024i;
        if (viewOnKeyListenerC0509z != null) {
            viewOnKeyListenerC0509z.f7043t = c0586a;
        }
    }

    @Override // j.C0502s
    public final void c() {
        switch (this.f7661m) {
            case 0:
                C0633k c0633k = this.n;
                c0633k.f7708w = null;
                c0633k.getClass();
                super.c();
                break;
            default:
                C0633k c0633k2 = this.n;
                MenuC0492i menuC0492i = c0633k2.f;
                if (menuC0492i != null) {
                    menuC0492i.c(true);
                }
                c0633k2.f7707v = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0618f(C0633k c0633k, Context context, SubMenuC0483A subMenuC0483A, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0483A, false);
        this.n = c0633k;
        if (!subMenuC0483A.f6923A.g()) {
            View view2 = c0633k.f7698l;
            this.f7021e = view2 == null ? (View) c0633k.f7697k : view2;
        }
        C0586A c0586a = c0633k.f7711z;
        this.f7023h = c0586a;
        ViewOnKeyListenerC0509z viewOnKeyListenerC0509z = this.f7024i;
        if (viewOnKeyListenerC0509z != null) {
            viewOnKeyListenerC0509z.f7043t = c0586a;
        }
    }
}
