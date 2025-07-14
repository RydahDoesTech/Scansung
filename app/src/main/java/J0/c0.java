package j0;

import J.C0045b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c0 extends C0045b {

    /* renamed from: d, reason: collision with root package name */
    public final d0 f7148d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f7149e = new WeakHashMap();

    public c0(d0 d0Var) {
        this.f7148d = d0Var;
    }

    @Override // J.C0045b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0045b c0045b = (C0045b) this.f7149e.get(view);
        return c0045b != null ? c0045b.a(view, accessibilityEvent) : this.f1437a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // J.C0045b
    public final B.g b(View view) {
        C0045b c0045b = (C0045b) this.f7149e.get(view);
        return c0045b != null ? c0045b.b(view) : super.b(view);
    }

    @Override // J.C0045b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0045b c0045b = (C0045b) this.f7149e.get(view);
        if (c0045b != null) {
            c0045b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // J.C0045b
    public final void d(View view, K.h hVar) {
        d0 d0Var = this.f7148d;
        boolean Z2 = d0Var.f7152d.Z();
        View.AccessibilityDelegate accessibilityDelegate = this.f1437a;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f1615a;
        if (!Z2) {
            RecyclerView recyclerView = d0Var.f7152d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().U(view, hVar);
                C0045b c0045b = (C0045b) this.f7149e.get(view);
                if (c0045b != null) {
                    c0045b.d(view, hVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // J.C0045b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0045b c0045b = (C0045b) this.f7149e.get(view);
        if (c0045b != null) {
            c0045b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // J.C0045b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0045b c0045b = (C0045b) this.f7149e.get(viewGroup);
        return c0045b != null ? c0045b.f(viewGroup, view, accessibilityEvent) : this.f1437a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // J.C0045b
    public final boolean g(View view, int i5, Bundle bundle) {
        d0 d0Var = this.f7148d;
        if (!d0Var.f7152d.Z()) {
            RecyclerView recyclerView = d0Var.f7152d;
            if (recyclerView.getLayoutManager() != null) {
                C0045b c0045b = (C0045b) this.f7149e.get(view);
                if (c0045b != null) {
                    if (c0045b.g(view, i5, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i5, bundle)) {
                    return true;
                }
                C0525P c0525p = recyclerView.getLayoutManager().f7063b.f;
                return false;
            }
        }
        return super.g(view, i5, bundle);
    }

    @Override // J.C0045b
    public final void h(View view, int i5) {
        C0045b c0045b = (C0045b) this.f7149e.get(view);
        if (c0045b != null) {
            c0045b.h(view, i5);
        } else {
            super.h(view, i5);
        }
    }

    @Override // J.C0045b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0045b c0045b = (C0045b) this.f7149e.get(view);
        if (c0045b != null) {
            c0045b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
