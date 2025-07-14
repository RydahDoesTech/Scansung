package Z;

import androidx.fragment.app.Fragment;
import b3.AbstractC0219i;

/* loaded from: classes.dex */
public abstract class i extends RuntimeException {

    /* renamed from: d, reason: collision with root package name */
    public final Fragment f2851d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Fragment fragment, String str) {
        super(str);
        AbstractC0219i.e("fragment", fragment);
        this.f2851d = fragment;
    }
}
