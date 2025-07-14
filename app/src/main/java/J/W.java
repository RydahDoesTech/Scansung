package J;

import a3.InterfaceC0108c;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class W extends U2.c implements InterfaceC0108c {

    /* renamed from: e, reason: collision with root package name */
    public int f1430e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View f1431g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(View view, S2.a aVar) {
        super(aVar);
        this.f1431g = view;
    }

    @Override // a3.InterfaceC0108c
    public final Object c(Object obj, Object obj2) {
        return ((W) d((o4.l) obj, (S2.a) obj2)).e(O2.l.f2016a);
    }

    @Override // U2.c
    public final S2.a d(Object obj, S2.a aVar) {
        W w3 = new W(this.f1431g, aVar);
        w3.f = obj;
        return w3;
    }

    @Override // U2.c
    public final Object e(Object obj) throws Throwable {
        Object obj2;
        Object obj3 = T2.a.f2554d;
        int i5 = this.f1430e;
        View view = this.f1431g;
        if (i5 == 0) {
            J2.b.a0(obj);
            o4.l lVar = (o4.l) this.f;
            this.f = lVar;
            this.f1430e = 1;
            lVar.f8315e = view;
            lVar.f8314d = 3;
            lVar.f8316g = this;
            return obj3;
        }
        Object obj4 = O2.l.f2016a;
        if (i5 == 1) {
            o4.l lVar2 = (o4.l) this.f;
            J2.b.a0(obj);
            if (view instanceof ViewGroup) {
                V v2 = new V((ViewGroup) view, null);
                this.f = null;
                this.f1430e = 2;
                lVar2.getClass();
                o4.l lVar3 = new o4.l();
                lVar3.f8316g = v2.d(lVar3, lVar3);
                if (lVar3.hasNext()) {
                    lVar2.f = lVar3;
                    lVar2.f8314d = 2;
                    lVar2.f8316g = this;
                    obj2 = obj3;
                } else {
                    obj2 = obj4;
                }
                if (obj2 != obj3) {
                    obj2 = obj4;
                }
                if (obj2 == obj3) {
                    return obj3;
                }
            }
        } else {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J2.b.a0(obj);
        }
        return obj4;
    }
}
