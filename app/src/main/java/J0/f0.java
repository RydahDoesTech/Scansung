package j0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class f0 extends AbstractC0522M {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7162a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0555x f7163b;

    public f0(C0555x c0555x) {
        this.f7163b = c0555x;
    }

    @Override // j0.AbstractC0522M
    public final void a(RecyclerView recyclerView, int i5) {
        if (i5 == 0 && this.f7162a) {
            this.f7162a = false;
            this.f7163b.h();
        }
    }

    @Override // j0.AbstractC0522M
    public final void b(RecyclerView recyclerView, int i5, int i6) {
        if (i5 == 0 && i6 == 0) {
            return;
        }
        this.f7162a = true;
    }
}
