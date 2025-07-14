package S;

import B.g;
import J.C0045b;
import J.P;
import K.h;
import O1.e;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class b extends C0045b {
    public static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final b4.d f2491o = new b4.d();

    /* renamed from: p, reason: collision with root package name */
    public static final e f2492p = new e(5);

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f2496h;

    /* renamed from: i, reason: collision with root package name */
    public final View f2497i;

    /* renamed from: j, reason: collision with root package name */
    public a f2498j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f2493d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f2494e = new Rect();
    public final Rect f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f2495g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f2499k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f2500l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f2501m = Integer.MIN_VALUE;

    public b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f2497i = view;
        this.f2496h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = P.f1421a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // J.C0045b
    public final g b(View view) {
        if (this.f2498j == null) {
            this.f2498j = new a(this);
        }
        return this.f2498j;
    }

    @Override // J.C0045b
    public final void d(View view, h hVar) {
        this.f1437a.onInitializeAccessibilityNodeInfo(view, hVar.f1615a);
        u(hVar);
    }

    public final boolean j(int i5) {
        if (this.f2500l != i5) {
            return false;
        }
        this.f2500l = Integer.MIN_VALUE;
        w(i5, false);
        y(i5, 8);
        return true;
    }

    public final AccessibilityEvent k(int i5, int i6) {
        View view = this.f2497i;
        if (i5 == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i6);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i6);
        h hVarR = r(i5);
        accessibilityEventObtain2.getText().add(hVarR.f());
        AccessibilityNodeInfo accessibilityNodeInfo = hVarR.f1615a;
        accessibilityEventObtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityEventObtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityEventObtain2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityEventObtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityEventObtain2.setChecked(accessibilityNodeInfo.isChecked());
        t(i5, accessibilityEventObtain2);
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain2.setClassName(accessibilityNodeInfo.getClassName());
        accessibilityEventObtain2.setSource(view, i5);
        accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    public final h l(int i5) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        h hVar = new h(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        hVar.g("android.view.View");
        Rect rect = n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        View view = this.f2497i;
        accessibilityNodeInfoObtain.setParent(view);
        v(i5, hVar);
        if (hVar.f() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f2494e;
        hVar.e(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        hVar.f1616b = i5;
        accessibilityNodeInfoObtain.setSource(view, i5);
        if (this.f2499k == i5) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            hVar.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            hVar.a(64);
        }
        boolean z4 = this.f2500l == i5;
        if (z4) {
            hVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            hVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z4);
        int[] iArr = this.f2495g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f2493d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            hVar.e(rect3);
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfoObtain.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return hVar;
    }

    public final boolean m(MotionEvent motionEvent) {
        int i5;
        AccessibilityManager accessibilityManager = this.f2496h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iN = n(motionEvent.getX(), motionEvent.getY());
            int i6 = this.f2501m;
            if (i6 != iN) {
                this.f2501m = iN;
                y(iN, 128);
                y(i6, 256);
            }
            return iN != Integer.MIN_VALUE;
        }
        if (action != 10 || (i5 = this.f2501m) == Integer.MIN_VALUE) {
            return false;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f2501m = Integer.MIN_VALUE;
            y(i5, 256);
        }
        return true;
    }

    public abstract int n(float f, float f5);

    public abstract void o(ArrayList arrayList);

    public final void p() {
        View view;
        ViewParent parent;
        if (!this.f2496h.isEnabled() || (parent = (view = this.f2497i).getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventK = k(-1, 2048);
        accessibilityEventK.setContentChangeTypes(1);
        parent.requestSendAccessibilityEvent(view, accessibilityEventK);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S.b.q(int, android.graphics.Rect):boolean");
    }

    public final h r(int i5) {
        if (i5 != -1) {
            return l(i5);
        }
        View view = this.f2497i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        h hVar = new h(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = P.f1421a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            hVar.f1615a.addChild(view, ((Integer) arrayList.get(i6)).intValue());
        }
        return hVar;
    }

    public abstract boolean s(int i5, int i6);

    public void t(int i5, AccessibilityEvent accessibilityEvent) {
    }

    public void u(h hVar) {
    }

    public abstract void v(int i5, h hVar);

    public void w(int i5, boolean z4) {
    }

    public final boolean x(int i5) {
        int i6;
        View view = this.f2497i;
        if ((!view.isFocused() && !view.requestFocus()) || (i6 = this.f2500l) == i5) {
            return false;
        }
        if (i6 != Integer.MIN_VALUE) {
            j(i6);
        }
        if (i5 == Integer.MIN_VALUE) {
            return false;
        }
        this.f2500l = i5;
        w(i5, true);
        y(i5, 8);
        return true;
    }

    public final void y(int i5, int i6) {
        View view;
        ViewParent parent;
        if (i5 == Integer.MIN_VALUE || !this.f2496h.isEnabled() || (parent = (view = this.f2497i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, k(i5, i6));
    }
}
