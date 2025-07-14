package j0;

import android.view.View;
import java.util.List;

/* renamed from: j0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0551t {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7287a;

    /* renamed from: b, reason: collision with root package name */
    public int f7288b;

    /* renamed from: c, reason: collision with root package name */
    public int f7289c;

    /* renamed from: d, reason: collision with root package name */
    public int f7290d;

    /* renamed from: e, reason: collision with root package name */
    public int f7291e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f7292g;

    /* renamed from: h, reason: collision with root package name */
    public int f7293h;

    /* renamed from: i, reason: collision with root package name */
    public int f7294i;

    /* renamed from: j, reason: collision with root package name */
    public int f7295j;

    /* renamed from: k, reason: collision with root package name */
    public List f7296k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7297l;

    public final void a(View view) {
        int iB;
        int size = this.f7296k.size();
        View view2 = null;
        int i5 = Integer.MAX_VALUE;
        for (int i6 = 0; i6 < size; i6++) {
            View view3 = ((b0) this.f7296k.get(i6)).f7128a;
            C0520K c0520k = (C0520K) view3.getLayoutParams();
            if (view3 != view && !c0520k.f7075a.i() && (iB = (c0520k.f7075a.b() - this.f7290d) * this.f7291e) >= 0 && iB < i5) {
                view2 = view3;
                if (iB == 0) {
                    break;
                } else {
                    i5 = iB;
                }
            }
        }
        if (view2 == null) {
            this.f7290d = -1;
        } else {
            this.f7290d = ((C0520K) view2.getLayoutParams()).f7075a.b();
        }
    }

    public final View b(C0525P c0525p) {
        List list = this.f7296k;
        if (list == null) {
            View view = c0525p.k(this.f7290d, Long.MAX_VALUE).f7128a;
            this.f7290d += this.f7291e;
            return view;
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = ((b0) this.f7296k.get(i5)).f7128a;
            C0520K c0520k = (C0520K) view2.getLayoutParams();
            if (!c0520k.f7075a.i() && this.f7290d == c0520k.f7075a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
