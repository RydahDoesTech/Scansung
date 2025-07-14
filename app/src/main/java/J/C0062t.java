package J;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.wssyncmldm.R;
import e.C0406i;

/* renamed from: J.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0062t implements I.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1486a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1487b;

    public /* synthetic */ C0062t(int i5, Object obj) {
        this.f1486a = i5;
        this.f1487b = obj;
    }

    @Override // I.a
    public final void accept(Object obj) {
        LinearLayout linearLayout;
        switch (this.f1486a) {
            case 0:
                ((View) this.f1487b).setTouchDelegate((C0067y) obj);
                break;
            default:
                ViewGroup viewGroup = (ViewGroup) obj;
                ((C0406i) this.f1487b).getClass();
                if (viewGroup != null && (linearLayout = (LinearLayout) viewGroup.findViewById(R.id.buttonBarLayout)) != null) {
                    linearLayout.post(new C1.b(23, linearLayout));
                    break;
                }
                break;
        }
    }
}
