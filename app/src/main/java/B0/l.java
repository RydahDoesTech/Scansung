package B0;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f136a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f137b;

    public l(View view, ArrayList arrayList) {
        this.f136a = view;
        this.f137b = arrayList;
    }

    @Override // B0.s
    public final void a() {
    }

    @Override // B0.s
    public final void b(t tVar) {
        tVar.w(this);
        tVar.a(this);
    }

    @Override // B0.s
    public final void c() {
    }

    @Override // B0.s
    public final void d(t tVar) {
        tVar.w(this);
        this.f136a.setVisibility(8);
        ArrayList arrayList = this.f137b;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((View) arrayList.get(i5)).setVisibility(0);
        }
    }

    @Override // B0.s
    public final void e() {
    }
}
