package k;

import android.content.Context;
import android.view.View;
import android.view.Window;
import j.C0484a;

/* loaded from: classes.dex */
public final class H1 implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final C0484a f7500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ I1 f7501e;

    public H1(I1 i12) {
        this.f7501e = i12;
        Context context = i12.f7507a.getContext();
        CharSequence charSequence = i12.f7513h;
        C0484a c0484a = new C0484a();
        c0484a.f6929e = 4096;
        c0484a.f6930g = 4096;
        c0484a.f6935l = null;
        c0484a.f6936m = null;
        c0484a.n = false;
        c0484a.f6937o = false;
        c0484a.f6938p = 16;
        c0484a.f6932i = context;
        c0484a.f6925a = charSequence;
        this.f7500d = c0484a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        I1 i12 = this.f7501e;
        Window.Callback callback = i12.f7516k;
        if (callback == null || !i12.f7517l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f7500d);
    }
}
