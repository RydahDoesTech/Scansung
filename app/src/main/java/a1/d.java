package A1;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import w.AbstractC0899a;

/* loaded from: classes.dex */
public final class d extends V1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0899a f55b;

    public /* synthetic */ d(AbstractC0899a abstractC0899a, int i5) {
        this.f54a = i5;
        this.f55b = abstractC0899a;
    }

    @Override // V1.a
    public int R(View view) {
        switch (this.f54a) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f55b;
                return sideSheetBehavior.f5961l + sideSheetBehavior.f5963o;
            default:
                return super.R(view);
        }
    }

    @Override // V1.a
    public int S() {
        switch (this.f54a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f55b;
                return bottomSheetBehavior.f5746I ? bottomSheetBehavior.f5757T : bottomSheetBehavior.f5744G;
            default:
                return super.S();
        }
    }

    @Override // V1.a
    public final void d0(int i5) {
        switch (this.f54a) {
            case 0:
                if (i5 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f55b;
                    if (bottomSheetBehavior.f5748K) {
                        bottomSheetBehavior.D(1);
                        break;
                    }
                }
                break;
            default:
                if (i5 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f55b;
                    if (sideSheetBehavior.f5956g) {
                        sideSheetBehavior.s(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // V1.a
    public final void e0(View view, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f54a) {
            case 0:
                ((BottomSheetBehavior) this.f55b).v(i6);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f55b;
                WeakReference weakReference = sideSheetBehavior.f5965q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f5951a.p0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f5969u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f5951a.c(i5);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e9  */
    @Override // V1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f0(android.view.View r5, float r6, float r7) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.d.f0(android.view.View, float, float):void");
    }

    @Override // V1.a
    public final int h(int i5, View view) {
        switch (this.f54a) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f55b;
                return Y0.j.g(i5, sideSheetBehavior.f5951a.G(), sideSheetBehavior.f5951a.F());
        }
    }

    @Override // V1.a
    public final int i(int i5, View view) {
        switch (this.f54a) {
            case 0:
                return Y0.j.g(i5, ((BottomSheetBehavior) this.f55b).y(), S());
            default:
                return view.getTop();
        }
    }

    @Override // V1.a
    public final boolean o0(int i5, View view) {
        WeakReference weakReference;
        switch (this.f54a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f55b;
                int i6 = bottomSheetBehavior.f5749L;
                if (i6 != 1 && !bottomSheetBehavior.f5765a0) {
                    if (i6 == 3 && bottomSheetBehavior.f5762Y == i5) {
                        WeakReference weakReference2 = bottomSheetBehavior.f5759V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f5758U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f55b;
                if (sideSheetBehavior.f5957h != 1 && (weakReference = sideSheetBehavior.f5964p) != null && weakReference.get() == view) {
                    break;
                }
                break;
        }
        return true;
    }
}
