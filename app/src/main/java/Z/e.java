package Z;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class e extends i {

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f2850e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Fragment fragment, ViewGroup viewGroup, int i5) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        switch (i5) {
            case 1:
                AbstractC0219i.e("fragment", fragment);
                super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
                this.f2850e = viewGroup;
                break;
            default:
                this.f2850e = viewGroup;
                break;
        }
    }
}
