package j0;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: j0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0517H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0519J f7057b;

    public /* synthetic */ C0517H(AbstractC0519J abstractC0519J, int i5) {
        this.f7056a = i5;
        this.f7057b = abstractC0519J;
    }

    public final int a(View view) {
        switch (this.f7056a) {
            case 0:
                C0520K c0520k = (C0520K) view.getLayoutParams();
                this.f7057b.getClass();
                return view.getRight() + ((C0520K) view.getLayoutParams()).f7076b.right + ((ViewGroup.MarginLayoutParams) c0520k).rightMargin;
            default:
                C0520K c0520k2 = (C0520K) view.getLayoutParams();
                this.f7057b.getClass();
                return view.getBottom() + ((C0520K) view.getLayoutParams()).f7076b.bottom + ((ViewGroup.MarginLayoutParams) c0520k2).bottomMargin;
        }
    }

    public final int b(View view) {
        switch (this.f7056a) {
            case 0:
                C0520K c0520k = (C0520K) view.getLayoutParams();
                this.f7057b.getClass();
                return (view.getLeft() - ((C0520K) view.getLayoutParams()).f7076b.left) - ((ViewGroup.MarginLayoutParams) c0520k).leftMargin;
            default:
                C0520K c0520k2 = (C0520K) view.getLayoutParams();
                this.f7057b.getClass();
                return (view.getTop() - ((C0520K) view.getLayoutParams()).f7076b.top) - ((ViewGroup.MarginLayoutParams) c0520k2).topMargin;
        }
    }

    public final int c() {
        switch (this.f7056a) {
            case 0:
                AbstractC0519J abstractC0519J = this.f7057b;
                return abstractC0519J.n - abstractC0519J.D();
            default:
                AbstractC0519J abstractC0519J2 = this.f7057b;
                return abstractC0519J2.f7074o - abstractC0519J2.B();
        }
    }

    public final int d() {
        switch (this.f7056a) {
            case 0:
                return this.f7057b.C();
            default:
                return this.f7057b.E();
        }
    }
}
