package j0;

import J.C0059p;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class e0 extends AbstractC0515F {

    /* renamed from: d, reason: collision with root package name */
    public boolean f7159d;

    @Override // j0.AbstractC0515F
    public final boolean a(b0 b0Var, b0 b0Var2, C0059p c0059p, C0059p c0059p2) {
        int i5;
        int i6;
        int i7 = c0059p.f1478a;
        int i8 = c0059p.f1479b;
        if (b0Var2.p()) {
            int i9 = c0059p.f1478a;
            i6 = c0059p.f1479b;
            i5 = i9;
        } else {
            i5 = c0059p2.f1478a;
            i6 = c0059p2.f1479b;
        }
        C0542k c0542k = (C0542k) this;
        if (b0Var == b0Var2) {
            return c0542k.g(b0Var, i7, i8, i5, i6);
        }
        View view = b0Var.f7128a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        c0542k.l(b0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        c0542k.l(b0Var2);
        float f = -((int) ((i5 - i7) - translationX));
        View view2 = b0Var2.f7128a;
        view2.setTranslationX(f);
        view2.setTranslationY(-((int) ((i6 - i8) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = c0542k.f7207h;
        C0540i c0540i = new C0540i();
        c0540i.f7181a = b0Var;
        c0540i.f7182b = b0Var2;
        c0540i.f7183c = i7;
        c0540i.f7184d = i8;
        c0540i.f7185e = i5;
        c0540i.f = i6;
        arrayList.add(c0540i);
        int i10 = c0542k.f7214p;
        if ((i10 & 4) == 0) {
            c0542k.f7214p = i10 | 4;
        }
        return true;
    }

    public abstract boolean g(b0 b0Var, int i5, int i6, int i7, int i8);
}
