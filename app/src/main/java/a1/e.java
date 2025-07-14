package A1;

import K.q;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class e implements q {

    /* renamed from: d, reason: collision with root package name */
    public final int f56d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f57e;

    public /* synthetic */ e(int i5, Object obj) {
        this.f57e = obj;
        this.f56d = i5;
    }

    @Override // K.q
    public boolean h(View view) {
        ((BottomSheetBehavior) this.f57e).C(this.f56d);
        return true;
    }

    public e(int i5, G.i[] iVarArr) {
        this.f56d = i5;
        this.f57e = iVarArr;
    }
}
