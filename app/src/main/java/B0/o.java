package B0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.RunnableC0119g;
import androidx.fragment.app.s0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class o extends s0 {
    @Override // androidx.fragment.app.s0
    public final void a(View view, Object obj) {
        ((t) obj).b(view);
    }

    @Override // androidx.fragment.app.s0
    public final void b(Object obj, ArrayList arrayList) {
        t tVar = (t) obj;
        if (tVar == null) {
            return;
        }
        int i5 = 0;
        if (tVar instanceof y) {
            y yVar = (y) tVar;
            int size = yVar.f182A.size();
            while (i5 < size) {
                b((i5 < 0 || i5 >= yVar.f182A.size()) ? null : (t) yVar.f182A.get(i5), arrayList);
                i5++;
            }
            return;
        }
        if (s0.h(tVar.f160h) && s0.h(tVar.f161i)) {
            int size2 = arrayList.size();
            while (i5 < size2) {
                tVar.b((View) arrayList.get(i5));
                i5++;
            }
        }
    }

    @Override // androidx.fragment.app.s0
    public final void c(ViewGroup viewGroup, Object obj) {
        x.a(viewGroup, (t) obj);
    }

    @Override // androidx.fragment.app.s0
    public final boolean e(Object obj) {
        return obj instanceof t;
    }

    @Override // androidx.fragment.app.s0
    public final Object f(Object obj) {
        if (obj != null) {
            return ((t) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.s0
    public final Object i(Object obj, Object obj2, Object obj3) {
        t tVar = (t) obj;
        t tVar2 = (t) obj2;
        t tVar3 = (t) obj3;
        if (tVar != null && tVar2 != null) {
            y yVar = new y();
            yVar.I(tVar);
            yVar.I(tVar2);
            yVar.f183B = false;
            tVar = yVar;
        } else if (tVar == null) {
            tVar = tVar2 != null ? tVar2 : null;
        }
        if (tVar3 == null) {
            return tVar;
        }
        y yVar2 = new y();
        if (tVar != null) {
            yVar2.I(tVar);
        }
        yVar2.I(tVar3);
        return yVar2;
    }

    @Override // androidx.fragment.app.s0
    public final Object j(Object obj, Object obj2) {
        y yVar = new y();
        if (obj != null) {
            yVar.I((t) obj);
        }
        yVar.I((t) obj2);
        return yVar;
    }

    @Override // androidx.fragment.app.s0
    public final void k(Object obj, View view, ArrayList arrayList) {
        ((t) obj).a(new l(view, arrayList));
    }

    @Override // androidx.fragment.app.s0
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((t) obj).a(new m(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.s0
    public final void m(View view, Object obj) {
        if (view != null) {
            s0.g(new Rect(), view);
            ((t) obj).B(new k());
        }
    }

    @Override // androidx.fragment.app.s0
    public final void n(Object obj, Rect rect) {
        ((t) obj).B(new k());
    }

    @Override // androidx.fragment.app.s0
    public final void o(Object obj, F.f fVar, RunnableC0119g runnableC0119g) {
        t tVar = (t) obj;
        fVar.a(new B.g(1, tVar));
        tVar.a(new n(runnableC0119g));
    }

    @Override // androidx.fragment.app.s0
    public final void p(Object obj, View view, ArrayList arrayList) {
        y yVar = (y) obj;
        ArrayList arrayList2 = yVar.f161i;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            s0.d((View) arrayList.get(i5), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(yVar, arrayList);
    }

    @Override // androidx.fragment.app.s0
    public final void q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        y yVar = (y) obj;
        if (yVar != null) {
            ArrayList arrayList3 = yVar.f161i;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            s(yVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.s0
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        y yVar = new y();
        yVar.I((t) obj);
        return yVar;
    }

    public final void s(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        t tVar = (t) obj;
        int i5 = 0;
        if (tVar instanceof y) {
            y yVar = (y) tVar;
            int size = yVar.f182A.size();
            while (i5 < size) {
                s((i5 < 0 || i5 >= yVar.f182A.size()) ? null : (t) yVar.f182A.get(i5), arrayList, arrayList2);
                i5++;
            }
            return;
        }
        if (s0.h(tVar.f160h)) {
            ArrayList arrayList3 = tVar.f161i;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i5 < size2) {
                    tVar.b((View) arrayList2.get(i5));
                    i5++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    tVar.x((View) arrayList.get(size3));
                }
            }
        }
    }
}
