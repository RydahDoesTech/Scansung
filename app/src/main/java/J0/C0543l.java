package j0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: j0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0543l extends AbstractC0522M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0544m f7221a;

    public C0543l(C0544m c0544m) {
        this.f7221a = c0544m;
    }

    @Override // j0.AbstractC0522M
    public final void b(RecyclerView recyclerView, int i5, int i6) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0544m c0544m = this.f7221a;
        int iComputeVerticalScrollRange = c0544m.f7247s.computeVerticalScrollRange();
        int i7 = c0544m.f7246r;
        int i8 = iComputeVerticalScrollRange - i7;
        int i9 = c0544m.f7231a;
        c0544m.f7248t = i8 > 0 && i7 >= i9;
        int iComputeHorizontalScrollRange = c0544m.f7247s.computeHorizontalScrollRange();
        int i10 = c0544m.f7245q;
        boolean z4 = iComputeHorizontalScrollRange - i10 > 0 && i10 >= i9;
        c0544m.f7249u = z4;
        boolean z5 = c0544m.f7248t;
        if (!z5 && !z4) {
            if (c0544m.f7250v != 0) {
                c0544m.g(0);
                return;
            }
            return;
        }
        if (z5) {
            float f = i7;
            c0544m.f7241l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            c0544m.f7240k = Math.min(i7, (i7 * i7) / iComputeVerticalScrollRange);
        }
        if (c0544m.f7249u) {
            float f5 = iComputeHorizontalScrollOffset;
            float f6 = i10;
            c0544m.f7243o = (int) ((((f6 / 2.0f) + f5) * f6) / iComputeHorizontalScrollRange);
            c0544m.n = Math.min(i10, (i10 * i10) / iComputeHorizontalScrollRange);
        }
        int i11 = c0544m.f7250v;
        if (i11 == 0 || i11 == 1) {
            c0544m.g(1);
        }
    }
}
