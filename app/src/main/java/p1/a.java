package P1;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class a extends V1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2142a;

    /* renamed from: b, reason: collision with root package name */
    public final SideSheetBehavior f2143b;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i5) {
        this.f2142a = i5;
        this.f2143b = sideSheetBehavior;
    }

    @Override // V1.a
    public final int D() {
        switch (this.f2142a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f2143b;
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.f5963o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f2143b;
                return Math.max(0, (sideSheetBehavior2.f5962m - sideSheetBehavior2.f5961l) - sideSheetBehavior2.f5963o);
        }
    }

    @Override // V1.a
    public final int E() {
        switch (this.f2142a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f2143b;
                return (-sideSheetBehavior.f5961l) - sideSheetBehavior.f5963o;
            default:
                return this.f2143b.f5962m;
        }
    }

    @Override // V1.a
    public final int F() {
        switch (this.f2142a) {
            case 0:
                return this.f2143b.f5963o;
            default:
                return this.f2143b.f5962m;
        }
    }

    @Override // V1.a
    public final int G() {
        switch (this.f2142a) {
            case 0:
                return -this.f2143b.f5961l;
            default:
                return D();
        }
    }

    @Override // V1.a
    public final int H(View view) {
        switch (this.f2142a) {
            case 0:
                return view.getRight() + this.f2143b.f5963o;
            default:
                return view.getLeft() - this.f2143b.f5963o;
        }
    }

    @Override // V1.a
    public final int I(CoordinatorLayout coordinatorLayout) {
        switch (this.f2142a) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // V1.a
    public final int O() {
        switch (this.f2142a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // V1.a
    public final boolean X(float f) {
        switch (this.f2142a) {
            case 0:
                if (f > 0.0f) {
                }
                break;
            default:
                if (f < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // V1.a
    public final boolean a0(View view) {
        switch (this.f2142a) {
            case 0:
                if (view.getRight() < (D() - E()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (D() + this.f2143b.f5962m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // V1.a
    public final int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f2142a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // V1.a
    public final boolean b0(float f, float f5) {
        switch (this.f2142a) {
            case 0:
                if (Math.abs(f) > Math.abs(f5)) {
                    float fAbs = Math.abs(f);
                    this.f2143b.getClass();
                    if (fAbs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f) > Math.abs(f5)) {
                    float fAbs2 = Math.abs(f);
                    this.f2143b.getClass();
                    if (fAbs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // V1.a
    public final float c(int i5) {
        switch (this.f2142a) {
            case 0:
                float fE = E();
                return (i5 - fE) / (D() - fE);
            default:
                float f = this.f2143b.f5962m;
                return (f - i5) / (f - D());
        }
    }

    @Override // V1.a
    public final boolean m0(View view, float f) {
        switch (this.f2142a) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f2143b;
                float fAbs = Math.abs((f * sideSheetBehavior.f5960k) + left);
                sideSheetBehavior.getClass();
                if (fAbs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f2143b;
                float fAbs2 = Math.abs((f * sideSheetBehavior2.f5960k) + right);
                sideSheetBehavior2.getClass();
                if (fAbs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // V1.a
    public final void p0(ViewGroup.MarginLayoutParams marginLayoutParams, int i5, int i6) {
        switch (this.f2142a) {
            case 0:
                if (i5 <= this.f2143b.f5962m) {
                    marginLayoutParams.leftMargin = i6;
                    break;
                }
                break;
            default:
                int i7 = this.f2143b.f5962m;
                if (i5 <= i7) {
                    marginLayoutParams.rightMargin = i7 - i5;
                    break;
                }
                break;
        }
    }
}
