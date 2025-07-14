package androidx.fragment.app;

import android.view.View;
import b3.AbstractC0219i;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0116d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3810d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0125m f3811e;
    public final /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3812g;

    public /* synthetic */ RunnableC0116d(C0125m c0125m, View view, C0120h c0120h) {
        this.f3811e = c0125m;
        this.f = view;
        this.f3812g = c0120h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3810d) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f;
                v0 v0Var = (v0) this.f3812g;
                AbstractC0219i.e("this$0", this.f3811e);
                if (arrayList.contains(v0Var)) {
                    arrayList.remove(v0Var);
                    View view = v0Var.f3929c.mView;
                    int i5 = v0Var.f3927a;
                    AbstractC0219i.d("view", view);
                    A3.f.a(i5, view);
                    break;
                }
                break;
            default:
                C0125m c0125m = this.f3811e;
                AbstractC0219i.e("this$0", c0125m);
                C0120h c0120h = (C0120h) this.f3812g;
                AbstractC0219i.e("$animationInfo", c0120h);
                c0125m.f3889a.endViewTransition((View) this.f);
                c0120h.a();
                break;
        }
    }

    public /* synthetic */ RunnableC0116d(ArrayList arrayList, v0 v0Var, C0125m c0125m) {
        this.f = arrayList;
        this.f3812g = v0Var;
        this.f3811e = c0125m;
    }
}
