package R1;

import android.view.View;

/* renamed from: R1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0089a implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2365a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f2366b;

    public /* synthetic */ ViewOnFocusChangeListenerC0089a(p pVar, int i5) {
        this.f2365a = i5;
        this.f2366b = pVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        switch (this.f2365a) {
            case 0:
                d dVar = (d) this.f2366b;
                dVar.t(dVar.u());
                break;
            default:
                k kVar = (k) this.f2366b;
                kVar.f2393l = z4;
                kVar.q();
                if (!z4) {
                    kVar.t(false);
                    kVar.f2394m = false;
                    break;
                }
                break;
        }
    }
}
