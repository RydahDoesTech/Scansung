package k;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: k.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0650r0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7789e;

    public /* synthetic */ C0650r0(int i5, Object obj) {
        this.f7788d = i5;
        this.f7789e = obj;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i5, long j5) {
        C0637l0 c0637l0;
        switch (this.f7788d) {
            case 0:
                if (i5 != -1 && (c0637l0 = ((C0662x0) this.f7789e).f) != null) {
                    c0637l0.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f7789e).p(i5);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i5 = this.f7788d;
    }
}
