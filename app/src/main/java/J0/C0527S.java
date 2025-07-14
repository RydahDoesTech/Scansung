package j0;

import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: j0.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0527S extends AbstractC0512C {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f7093a;

    public C0527S(RecyclerView recyclerView) {
        this.f7093a = recyclerView;
    }

    @Override // j0.AbstractC0512C
    public final void a() {
        RecyclerView recyclerView = this.f7093a;
        recyclerView.n(null);
        recyclerView.m0.f = true;
        recyclerView.n0(true);
        if (!recyclerView.f4810h.g()) {
            recyclerView.requestLayout();
        }
        recyclerView.getClass();
        recyclerView.getClass();
    }

    @Override // j0.AbstractC0512C
    public final void b(int i5, int i6, Preference preference) {
        RecyclerView recyclerView = this.f7093a;
        recyclerView.n(null);
        C0533b c0533b = recyclerView.f4810h;
        if (i6 < 1) {
            c0533b.getClass();
            return;
        }
        ArrayList arrayList = c0533b.f7123b;
        arrayList.add(c0533b.h(4, i5, i6, preference));
        c0533b.f |= 4;
        if (arrayList.size() == 1) {
            if (RecyclerView.f4722q2 && recyclerView.f4849w && recyclerView.f4846v) {
                WeakHashMap weakHashMap = J.P.f1421a;
                recyclerView.postOnAnimation(recyclerView.f4825l);
            } else {
                recyclerView.f4734D = true;
                recyclerView.requestLayout();
            }
        }
    }
}
