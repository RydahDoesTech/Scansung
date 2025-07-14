package J;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import v1.AbstractC0886a;

/* loaded from: classes.dex */
public final class c0 extends WindowInsetsAnimation.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final A1.j f1446a;

    /* renamed from: b, reason: collision with root package name */
    public List f1447b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f1448c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1449d;

    public c0(A1.j jVar) {
        super(0);
        this.f1449d = new HashMap();
        this.f1446a = jVar;
    }

    public final d0 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.f1449d;
        d0 d0Var = (d0) map.get(windowInsetsAnimation);
        if (d0Var != null) {
            return d0Var;
        }
        d0 d0Var2 = new d0();
        d0Var2.f1451a = new B.g(12, new WindowInsetsAnimation(0, null, 0L));
        d0Var2.f1451a = new B.g(12, windowInsetsAnimation);
        map.put(windowInsetsAnimation, d0Var2);
        return d0Var2;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        d0 d0VarA = a(windowInsetsAnimation);
        A1.j jVar = this.f1446a;
        jVar.getClass();
        if ((((WindowInsetsAnimation) d0VarA.f1451a.f95e).getTypeMask() & 8) != 0) {
            ((View) jVar.f72c).setTranslationY(0.0f);
        }
        this.f1449d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        d0 d0VarA = a(windowInsetsAnimation);
        A1.j jVar = this.f1446a;
        jVar.getClass();
        if ((((WindowInsetsAnimation) d0VarA.f1451a.f95e).getTypeMask() & 8) != 0) {
            View view = (View) jVar.f72c;
            int[] iArr = (int[]) jVar.f73d;
            view.getLocationOnScreen(iArr);
            jVar.f70a = iArr[1];
        }
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f1448c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f1448c = arrayList2;
            this.f1447b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            d0 d0VarA = a(windowInsetsAnimation);
            ((WindowInsetsAnimation) d0VarA.f1451a.f95e).setFraction(windowInsetsAnimation.getFraction());
            this.f1448c.add(d0VarA);
        }
        p0 p0VarF = p0.f(windowInsets, null);
        List list2 = this.f1447b;
        A1.j jVar = this.f1446a;
        jVar.getClass();
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((WindowInsetsAnimation) ((d0) it.next()).f1451a.f95e).getTypeMask() & 8) != 0) {
                ((View) jVar.f72c).setTranslationY(AbstractC0886a.c(jVar.f71b, ((WindowInsetsAnimation) r0.f1451a.f95e).getInterpolatedFraction(), 0));
                break;
            }
        }
        return p0VarF.e();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        d0 d0VarA = a(windowInsetsAnimation);
        B.c cVarC = B.c.c(bounds.getLowerBound());
        B.c cVarC2 = B.c.c(bounds.getUpperBound());
        A1.j jVar = this.f1446a;
        jVar.getClass();
        if ((((WindowInsetsAnimation) d0VarA.f1451a.f95e).getTypeMask() & 8) != 0) {
            View view = (View) jVar.f72c;
            int[] iArr = (int[]) jVar.f73d;
            view.getLocationOnScreen(iArr);
            int i5 = jVar.f70a - iArr[1];
            jVar.f71b = i5;
            view.setTranslationY(i5);
        }
        return new WindowInsetsAnimation.Bounds(cVarC.d(), cVarC2.d());
    }
}
