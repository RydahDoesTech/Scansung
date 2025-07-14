package A1;

import J.P;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import w.AbstractC0899a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65a;

    /* renamed from: b, reason: collision with root package name */
    public int f66b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f67c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f68d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0899a f69e;

    public i(SideSheetBehavior sideSheetBehavior) {
        this.f65a = 1;
        this.f69e = sideSheetBehavior;
        this.f68d = new C1.b(3, this);
    }

    public final void a(int i5) {
        Runnable runnable = this.f68d;
        AbstractC0899a abstractC0899a = this.f69e;
        switch (this.f65a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0899a;
                WeakReference weakReference = bottomSheetBehavior.f5758U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f66b = i5;
                    if (!this.f67c) {
                        WeakHashMap weakHashMap = P.f1421a;
                        ((View) bottomSheetBehavior.f5758U.get()).postOnAnimation((h) runnable);
                        this.f67c = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0899a;
                WeakReference weakReference2 = sideSheetBehavior.f5964p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f66b = i5;
                    if (!this.f67c) {
                        WeakHashMap weakHashMap2 = P.f1421a;
                        ((View) sideSheetBehavior.f5964p.get()).postOnAnimation((C1.b) runnable);
                        this.f67c = true;
                        break;
                    }
                }
                break;
        }
    }

    public i(BottomSheetBehavior bottomSheetBehavior) {
        this.f65a = 0;
        this.f69e = bottomSheetBehavior;
        this.f68d = new h(0, this);
    }
}
