package j0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: j0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0554w extends androidx.emoji2.text.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7314d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0554w(AbstractC0519J abstractC0519J, int i5) {
        super(abstractC0519J);
        this.f7314d = i5;
    }

    @Override // androidx.emoji2.text.f
    public final int b(View view) {
        switch (this.f7314d) {
            case 0:
                C0520K c0520k = (C0520K) view.getLayoutParams();
                ((AbstractC0519J) this.f3651b).getClass();
                return view.getRight() + ((C0520K) view.getLayoutParams()).f7076b.right + ((ViewGroup.MarginLayoutParams) c0520k).rightMargin;
            default:
                C0520K c0520k2 = (C0520K) view.getLayoutParams();
                ((AbstractC0519J) this.f3651b).getClass();
                return view.getBottom() + ((C0520K) view.getLayoutParams()).f7076b.bottom + ((ViewGroup.MarginLayoutParams) c0520k2).bottomMargin;
        }
    }

    @Override // androidx.emoji2.text.f
    public final int c(View view) {
        switch (this.f7314d) {
            case 0:
                C0520K c0520k = (C0520K) view.getLayoutParams();
                ((AbstractC0519J) this.f3651b).getClass();
                Rect rect = ((C0520K) view.getLayoutParams()).f7076b;
                return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0520k).leftMargin + ((ViewGroup.MarginLayoutParams) c0520k).rightMargin;
            default:
                C0520K c0520k2 = (C0520K) view.getLayoutParams();
                ((AbstractC0519J) this.f3651b).getClass();
                Rect rect2 = ((C0520K) view.getLayoutParams()).f7076b;
                return view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0520k2).topMargin + ((ViewGroup.MarginLayoutParams) c0520k2).bottomMargin;
        }
    }

    @Override // androidx.emoji2.text.f
    public final int d(View view) {
        switch (this.f7314d) {
            case 0:
                C0520K c0520k = (C0520K) view.getLayoutParams();
                ((AbstractC0519J) this.f3651b).getClass();
                Rect rect = ((C0520K) view.getLayoutParams()).f7076b;
                return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0520k).topMargin + ((ViewGroup.MarginLayoutParams) c0520k).bottomMargin;
            default:
                C0520K c0520k2 = (C0520K) view.getLayoutParams();
                ((AbstractC0519J) this.f3651b).getClass();
                Rect rect2 = ((C0520K) view.getLayoutParams()).f7076b;
                return view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0520k2).leftMargin + ((ViewGroup.MarginLayoutParams) c0520k2).rightMargin;
        }
    }

    @Override // androidx.emoji2.text.f
    public final int e(View view) {
        switch (this.f7314d) {
            case 0:
                C0520K c0520k = (C0520K) view.getLayoutParams();
                ((AbstractC0519J) this.f3651b).getClass();
                return (view.getLeft() - ((C0520K) view.getLayoutParams()).f7076b.left) - ((ViewGroup.MarginLayoutParams) c0520k).leftMargin;
            default:
                C0520K c0520k2 = (C0520K) view.getLayoutParams();
                ((AbstractC0519J) this.f3651b).getClass();
                return (view.getTop() - ((C0520K) view.getLayoutParams()).f7076b.top) - ((ViewGroup.MarginLayoutParams) c0520k2).topMargin;
        }
    }

    @Override // androidx.emoji2.text.f
    public final int f() {
        switch (this.f7314d) {
            case 0:
                return ((AbstractC0519J) this.f3651b).n;
            default:
                return ((AbstractC0519J) this.f3651b).f7074o;
        }
    }

    @Override // androidx.emoji2.text.f
    public final int g() {
        switch (this.f7314d) {
            case 0:
                AbstractC0519J abstractC0519J = (AbstractC0519J) this.f3651b;
                return abstractC0519J.n - abstractC0519J.D();
            default:
                AbstractC0519J abstractC0519J2 = (AbstractC0519J) this.f3651b;
                return abstractC0519J2.f7074o - abstractC0519J2.B();
        }
    }

    @Override // androidx.emoji2.text.f
    public final int h() {
        switch (this.f7314d) {
            case 0:
                return ((AbstractC0519J) this.f3651b).D();
            default:
                return ((AbstractC0519J) this.f3651b).B();
        }
    }

    @Override // androidx.emoji2.text.f
    public final int i() {
        switch (this.f7314d) {
            case 0:
                return ((AbstractC0519J) this.f3651b).f7072l;
            default:
                return ((AbstractC0519J) this.f3651b).f7073m;
        }
    }

    @Override // androidx.emoji2.text.f
    public final int j() {
        switch (this.f7314d) {
            case 0:
                return ((AbstractC0519J) this.f3651b).f7073m;
            default:
                return ((AbstractC0519J) this.f3651b).f7072l;
        }
    }

    @Override // androidx.emoji2.text.f
    public final int k() {
        switch (this.f7314d) {
            case 0:
                return ((AbstractC0519J) this.f3651b).C();
            default:
                return ((AbstractC0519J) this.f3651b).E();
        }
    }

    @Override // androidx.emoji2.text.f
    public final int l() {
        switch (this.f7314d) {
            case 0:
                AbstractC0519J abstractC0519J = (AbstractC0519J) this.f3651b;
                return (abstractC0519J.n - abstractC0519J.C()) - abstractC0519J.D();
            default:
                AbstractC0519J abstractC0519J2 = (AbstractC0519J) this.f3651b;
                return (abstractC0519J2.f7074o - abstractC0519J2.E()) - abstractC0519J2.B();
        }
    }

    @Override // androidx.emoji2.text.f
    public final int n(View view) {
        switch (this.f7314d) {
            case 0:
                AbstractC0519J abstractC0519J = (AbstractC0519J) this.f3651b;
                Rect rect = (Rect) this.f3652c;
                abstractC0519J.I(rect, view);
                return rect.right;
            default:
                AbstractC0519J abstractC0519J2 = (AbstractC0519J) this.f3651b;
                Rect rect2 = (Rect) this.f3652c;
                abstractC0519J2.I(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.f
    public final int o(View view) {
        switch (this.f7314d) {
            case 0:
                AbstractC0519J abstractC0519J = (AbstractC0519J) this.f3651b;
                Rect rect = (Rect) this.f3652c;
                abstractC0519J.I(rect, view);
                return rect.left;
            default:
                AbstractC0519J abstractC0519J2 = (AbstractC0519J) this.f3651b;
                Rect rect2 = (Rect) this.f3652c;
                abstractC0519J2.I(rect2, view);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.f
    public final void p(int i5) {
        switch (this.f7314d) {
            case 0:
                ((AbstractC0519J) this.f3651b).M(i5);
                break;
            default:
                ((AbstractC0519J) this.f3651b).N(i5);
                break;
        }
    }
}
