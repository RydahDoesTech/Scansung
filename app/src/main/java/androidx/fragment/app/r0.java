package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3912e;
    public final /* synthetic */ ArrayList f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3913g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3914h;

    public r0(int i5, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f3911d = i5;
        this.f3912e = arrayList;
        this.f = arrayList2;
        this.f3913g = arrayList3;
        this.f3914h = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i5 = 0; i5 < this.f3911d; i5++) {
            View view = (View) this.f3912e.get(i5);
            String str = (String) this.f.get(i5);
            WeakHashMap weakHashMap = J.P.f1421a;
            J.H.v(view, str);
            J.H.v((View) this.f3913g.get(i5), (String) this.f3914h.get(i5));
        }
    }
}
