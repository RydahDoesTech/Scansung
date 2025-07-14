package e;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.firebase.messaging.C0388e;
import e1.AbstractC0415a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class N extends AbstractC0415a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P f6512e;

    public /* synthetic */ N(P p2, int i5) {
        this.f6511d = i5;
        this.f6512e = p2;
    }

    @Override // J.a0
    public final void a() {
        View view;
        P p2 = this.f6512e;
        switch (this.f6511d) {
            case 0:
                if (p2.f6531o && (view = p2.f6524g) != null) {
                    view.setTranslationY(0.0f);
                    p2.f6522d.setTranslationY(0.0f);
                }
                p2.f6522d.setVisibility(8);
                p2.f6522d.setTransitioning(false);
                p2.f6535s = null;
                C0388e c0388e = p2.f6528k;
                if (c0388e != null) {
                    c0388e.i(p2.f6527j);
                    p2.f6527j = null;
                    p2.f6528k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = p2.f6521c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = J.P.f1421a;
                    J.F.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                p2.f6535s = null;
                p2.f6522d.requestLayout();
                break;
        }
    }
}
