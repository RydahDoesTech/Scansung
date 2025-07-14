package Q3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import com.samsung.android.knox.ex.KnoxContract;
import p3.InterfaceC0759c;

/* loaded from: classes.dex */
public final class n implements InterfaceC0107b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f2353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0759c f2354e;

    public n(q qVar, InterfaceC0759c interfaceC0759c) {
        this.f2353d = qVar;
        this.f2354e = interfaceC0759c;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        InterfaceC0759c interfaceC0759c = (InterfaceC0759c) obj;
        q qVar = this.f2353d;
        InterfaceC0759c interfaceC0759c2 = this.f2354e;
        AbstractC0219i.e(KnoxContract.Config.DateTime.PARAM_SECOND, interfaceC0759c);
        qVar.d(interfaceC0759c2, interfaceC0759c);
        return O2.l.f2016a;
    }
}
