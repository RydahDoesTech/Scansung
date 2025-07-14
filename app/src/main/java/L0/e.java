package L0;

import Q0.j;
import Y0.h;
import android.content.Context;

/* loaded from: classes.dex */
public final class e implements M0.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1707d;

    /* renamed from: e, reason: collision with root package name */
    public final M0.c f1708e;

    public /* synthetic */ e(M0.c cVar, int i5) {
        this.f1707d = i5;
        this.f1708e = cVar;
    }

    @Override // N2.a
    public final Object get() {
        switch (this.f1707d) {
            case 0:
                return new d((Context) this.f1708e.f1811d, new b4.d(), new h(5));
            default:
                Context context = (Context) this.f1708e.f1811d;
                Q0.d.f2282a.get();
                Integer num = 4;
                return new j(context, num.intValue(), "com.google.android.datatransport.events");
        }
    }
}
