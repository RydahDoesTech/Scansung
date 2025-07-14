package k;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class I0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SearchView f7506e;

    public /* synthetic */ I0(SearchView searchView, int i5) {
        this.f7505d = i5;
        this.f7506e = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7505d) {
            case 0:
                this.f7506e.v();
                break;
            default:
                P.b bVar = this.f7506e.f3347T;
                if (bVar instanceof s1) {
                    bVar.b(null);
                    break;
                }
                break;
        }
    }
}
