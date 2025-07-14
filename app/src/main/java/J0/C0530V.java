package j0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: j0.V, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0530V {

    /* renamed from: a, reason: collision with root package name */
    public int f7094a;

    /* renamed from: b, reason: collision with root package name */
    public int f7095b;

    /* renamed from: c, reason: collision with root package name */
    public int f7096c;

    /* renamed from: d, reason: collision with root package name */
    public int f7097d;

    /* renamed from: e, reason: collision with root package name */
    public BaseInterpolator f7098e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public int f7099g;

    public final void a(RecyclerView recyclerView) {
        int i5 = this.f7097d;
        if (i5 >= 0) {
            this.f7097d = -1;
            recyclerView.c0(i5);
            this.f = false;
            return;
        }
        if (!this.f) {
            this.f7099g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f7098e;
        if (baseInterpolator != null && this.f7096c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i6 = this.f7096c;
        if (i6 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f4819j0.c(this.f7094a, this.f7095b, i6, baseInterpolator);
        int i7 = this.f7099g + 1;
        this.f7099g = i7;
        if (i7 > 10) {
            Log.e("SeslRecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f = false;
    }
}
