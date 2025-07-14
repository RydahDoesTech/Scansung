package e;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.firebase.messaging.C0388e;
import e1.AbstractC0415a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class u extends AbstractC0415a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6620e;

    public /* synthetic */ u(int i5, Object obj) {
        this.f6619d = i5;
        this.f6620e = obj;
    }

    @Override // J.a0
    public final void a() {
        Object obj = this.f6620e;
        switch (this.f6619d) {
            case 0:
                s sVar = (s) obj;
                sVar.f6616e.f6479w.setAlpha(1.0f);
                B b2 = sVar.f6616e;
                b2.f6482z.d(null);
                b2.f6482z = null;
                break;
            case 1:
                B b5 = (B) obj;
                b5.f6479w.setAlpha(1.0f);
                b5.f6482z.d(null);
                b5.f6482z = null;
                break;
            default:
                C0388e c0388e = (C0388e) obj;
                ((B) c0388e.f).f6479w.setVisibility(8);
                B b6 = (B) c0388e.f;
                PopupWindow popupWindow = b6.f6480x;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (b6.f6479w.getParent() instanceof View) {
                    View view = (View) b6.f6479w.getParent();
                    WeakHashMap weakHashMap = J.P.f1421a;
                    J.F.c(view);
                }
                b6.f6479w.e();
                b6.f6482z.d(null);
                b6.f6482z = null;
                ViewGroup viewGroup = b6.f6437B;
                WeakHashMap weakHashMap2 = J.P.f1421a;
                J.F.c(viewGroup);
                break;
        }
    }

    @Override // e1.AbstractC0415a, J.a0
    public void c() {
        Object obj = this.f6620e;
        switch (this.f6619d) {
            case 0:
                ((s) obj).f6616e.f6479w.setVisibility(0);
                break;
            case 1:
                B b2 = (B) obj;
                b2.f6479w.setVisibility(0);
                if (b2.f6479w.getParent() instanceof View) {
                    View view = (View) b2.f6479w.getParent();
                    WeakHashMap weakHashMap = J.P.f1421a;
                    J.F.c(view);
                    break;
                }
                break;
        }
    }
}
