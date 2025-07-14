package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import j0.AbstractC0519J;
import j0.C0554w;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public int f3650a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3651b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3652c;

    public f(AbstractC0519J abstractC0519J) {
        this.f3650a = Integer.MIN_VALUE;
        this.f3652c = new Rect();
        this.f3651b = abstractC0519J;
    }

    public static f a(AbstractC0519J abstractC0519J, int i5) {
        if (i5 == 0) {
            return new C0554w(abstractC0519J, 0);
        }
        if (i5 == 1) {
            return new C0554w(abstractC0519J, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public int m() {
        if (Integer.MIN_VALUE == this.f3650a) {
            return 0;
        }
        return l() - this.f3650a;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i5);

    public f(h hVar) {
        this.f3650a = 0;
        this.f3652c = new c();
        this.f3651b = hVar;
    }
}
