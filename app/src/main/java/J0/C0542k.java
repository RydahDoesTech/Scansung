package j0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;

/* renamed from: j0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0542k extends e0 {

    /* renamed from: r, reason: collision with root package name */
    public static TimeInterpolator f7203r;

    /* renamed from: s, reason: collision with root package name */
    public static final PathInterpolator f7204s = new PathInterpolator(0.4f, 0.6f, 0.0f, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f7205e;
    public ArrayList f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f7206g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f7207h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f7208i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f7209j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f7210k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f7211l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f7212m;
    public ArrayList n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f7213o;

    /* renamed from: p, reason: collision with root package name */
    public int f7214p;

    /* renamed from: q, reason: collision with root package name */
    public int f7215q;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((b0) arrayList.get(size)).f7128a.animate().cancel();
        }
    }

    @Override // j0.AbstractC0515F
    public final void d(b0 b0Var) {
        View view = b0Var.f7128a;
        view.animate().cancel();
        ArrayList arrayList = this.f7206g;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0541j) arrayList.get(size)).f7189a == b0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(b0Var);
                arrayList.remove(size);
            }
        }
        j(this.f7207h, b0Var);
        if (this.f7205e.remove(b0Var)) {
            view.setAlpha(1.0f);
            c(b0Var);
        }
        if (this.f.remove(b0Var)) {
            view.setAlpha(1.0f);
            c(b0Var);
        }
        ArrayList arrayList2 = this.f7210k;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, b0Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f7209j;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0541j) arrayList5.get(size4)).f7189a == b0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(b0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f7208i;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(b0Var)) {
                view.setAlpha(1.0f);
                c(b0Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.n.remove(b0Var);
        this.f7211l.remove(b0Var);
        this.f7213o.remove(b0Var);
        this.f7212m.remove(b0Var);
        i();
    }

    @Override // j0.AbstractC0515F
    public final void e() {
        ArrayList arrayList = this.f7206g;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0541j c0541j = (C0541j) arrayList.get(size);
            View view = c0541j.f7189a.f7128a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c0541j.f7189a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f7205e;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((b0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            b0 b0Var = (b0) arrayList3.get(size3);
            b0Var.f7128a.setAlpha(1.0f);
            c(b0Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f7207h;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0540i c0540i = (C0540i) arrayList4.get(size4);
            b0 b0Var2 = c0540i.f7181a;
            if (b0Var2 != null) {
                k(c0540i, b0Var2);
            }
            b0 b0Var3 = c0540i.f7182b;
            if (b0Var3 != null) {
                k(c0540i, b0Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f7209j;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0541j c0541j2 = (C0541j) arrayList6.get(size6);
                    View view2 = c0541j2.f7189a.f7128a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(c0541j2.f7189a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f7208i;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    b0 b0Var4 = (b0) arrayList8.get(size8);
                    b0Var4.f7128a.setAlpha(1.0f);
                    c(b0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f7210k;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0540i c0540i2 = (C0540i) arrayList10.get(size10);
                    b0 b0Var5 = c0540i2.f7181a;
                    if (b0Var5 != null) {
                        k(c0540i2, b0Var5);
                    }
                    b0 b0Var6 = c0540i2.f7182b;
                    if (b0Var6 != null) {
                        k(c0540i2, b0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.n);
            h(this.f7212m);
            h(this.f7211l);
            h(this.f7213o);
            ArrayList arrayList11 = this.f7054b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // j0.AbstractC0515F
    public final boolean f() {
        return (this.f.isEmpty() && this.f7207h.isEmpty() && this.f7206g.isEmpty() && this.f7205e.isEmpty() && this.f7212m.isEmpty() && this.n.isEmpty() && this.f7211l.isEmpty() && this.f7213o.isEmpty() && this.f7209j.isEmpty() && this.f7208i.isEmpty() && this.f7210k.isEmpty()) ? false : true;
    }

    @Override // j0.e0
    public final boolean g(b0 b0Var, int i5, int i6, int i7, int i8) {
        View view = b0Var.f7128a;
        int translationX = i5 + ((int) view.getTranslationX());
        int translationY = i6 + ((int) b0Var.f7128a.getTranslationY());
        l(b0Var);
        int i9 = i7 - translationX;
        int i10 = i8 - translationY;
        if (i9 == 0 && i10 == 0) {
            c(b0Var);
            return false;
        }
        if (i9 != 0) {
            view.setTranslationX(-i9);
        }
        if (i10 != 0) {
            view.setTranslationY(-i10);
        }
        ArrayList arrayList = this.f7206g;
        C0541j c0541j = new C0541j();
        c0541j.f7189a = b0Var;
        c0541j.f7190b = translationX;
        c0541j.f7191c = translationY;
        c0541j.f7192d = i7;
        c0541j.f7193e = i8;
        arrayList.add(c0541j);
        int i11 = this.f7214p;
        if ((i11 & 2) != 0) {
            return true;
        }
        this.f7214p = i11 | 2;
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f7054b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, b0 b0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0540i c0540i = (C0540i) arrayList.get(size);
            if (k(c0540i, b0Var) && c0540i.f7181a == null && c0540i.f7182b == null) {
                arrayList.remove(c0540i);
            }
        }
    }

    public final boolean k(C0540i c0540i, b0 b0Var) {
        if (c0540i.f7182b == b0Var) {
            c0540i.f7182b = null;
        } else {
            if (c0540i.f7181a != b0Var) {
                return false;
            }
            c0540i.f7181a = null;
        }
        b0Var.f7128a.setAlpha(1.0f);
        View view = b0Var.f7128a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(b0Var);
        return true;
    }

    public final void l(b0 b0Var) {
        if (f7203r == null) {
            f7203r = new ValueAnimator().getInterpolator();
        }
        b0Var.f7128a.animate().setInterpolator(f7203r);
        d(b0Var);
    }
}
