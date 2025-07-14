package O;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;

/* loaded from: classes.dex */
public final class i implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1896b;

    public /* synthetic */ i(int i5, Object obj) {
        this.f1895a = i5;
        this.f1896b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        switch (this.f1895a) {
            case 0:
                NestedScrollView nestedScrollView = (NestedScrollView) this.f1896b;
                nestedScrollView.post(nestedScrollView.f3603h0);
                return;
            default:
                ((BottomAppBar$Behavior) this.f1896b).getClass();
                throw null;
        }
    }
}
