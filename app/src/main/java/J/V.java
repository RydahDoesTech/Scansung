package J;

import a3.InterfaceC0108c;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class V extends U2.c implements InterfaceC0108c {

    /* renamed from: e, reason: collision with root package name */
    public ViewGroup f1424e;
    public View f;

    /* renamed from: g, reason: collision with root package name */
    public int f1425g;

    /* renamed from: h, reason: collision with root package name */
    public int f1426h;

    /* renamed from: i, reason: collision with root package name */
    public int f1427i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f1428j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1429k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(ViewGroup viewGroup, S2.a aVar) {
        super(aVar);
        this.f1429k = viewGroup;
    }

    @Override // a3.InterfaceC0108c
    public final Object c(Object obj, Object obj2) {
        return ((V) d((o4.l) obj, (S2.a) obj2)).e(O2.l.f2016a);
    }

    @Override // U2.c
    public final S2.a d(Object obj, S2.a aVar) {
        V v2 = new V(this.f1429k, aVar);
        v2.f1428j = obj;
        return v2;
    }

    @Override // U2.c
    public final Object e(Object obj) throws Throwable {
        o4.l lVar;
        ViewGroup viewGroup;
        int childCount;
        int i5;
        int i6;
        Object obj2;
        int i7;
        ViewGroup viewGroup2;
        o4.l lVar2;
        Object obj3 = T2.a.f2554d;
        int i8 = this.f1427i;
        Object obj4 = O2.l.f2016a;
        if (i8 != 0) {
            if (i8 == 1) {
                childCount = this.f1426h;
                i6 = this.f1425g;
                View view = this.f;
                viewGroup = this.f1424e;
                lVar = (o4.l) this.f1428j;
                J2.b.a0(obj);
                if (view instanceof ViewGroup) {
                    V v2 = new V((ViewGroup) view, null);
                    this.f1428j = lVar;
                    this.f1424e = viewGroup;
                    this.f = null;
                    this.f1425g = i6;
                    this.f1426h = childCount;
                    this.f1427i = 2;
                    lVar.getClass();
                    o4.l lVar3 = new o4.l();
                    lVar3.f8316g = v2.d(lVar3, lVar3);
                    if (lVar3.hasNext()) {
                        lVar.f = lVar3;
                        lVar.f8314d = 2;
                        lVar.f8316g = this;
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
                    i7 = i6;
                    viewGroup2 = viewGroup;
                    lVar2 = lVar;
                }
                i5 = i6 + 1;
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                childCount = this.f1426h;
                i7 = this.f1425g;
                viewGroup2 = this.f1424e;
                lVar2 = (o4.l) this.f1428j;
                J2.b.a0(obj);
            }
            viewGroup = viewGroup2;
            lVar = lVar2;
            i6 = i7;
            i5 = i6 + 1;
        } else {
            J2.b.a0(obj);
            lVar = (o4.l) this.f1428j;
            viewGroup = this.f1429k;
            childCount = viewGroup.getChildCount();
            i5 = 0;
        }
        if (i5 >= childCount) {
            return obj4;
        }
        View childAt = viewGroup.getChildAt(i5);
        this.f1428j = lVar;
        this.f1424e = viewGroup;
        this.f = childAt;
        this.f1425g = i5;
        this.f1426h = childCount;
        this.f1427i = 1;
        lVar.f8315e = childAt;
        lVar.f8314d = 3;
        lVar.f8316g = this;
        return obj3;
    }
}
