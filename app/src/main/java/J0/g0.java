package j0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public int f7169a;

    /* renamed from: b, reason: collision with root package name */
    public int f7170b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7171c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7172d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7173e;
    public int[] f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f7174g;

    public g0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f7174g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f7169a = -1;
        this.f7170b = Integer.MIN_VALUE;
        this.f7171c = false;
        this.f7172d = false;
        this.f7173e = false;
        int[] iArr = this.f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
