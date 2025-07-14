package O;

import J.C0045b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class j extends C0045b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1897d;

    public /* synthetic */ j(int i5) {
        this.f1897d = i5;
    }

    @Override // J.C0045b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1897d) {
            case 0:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // J.C0045b
    public final void d(View view, K.h hVar) {
        int scrollRange;
        switch (this.f1897d) {
            case 0:
                this.f1437a.onInitializeAccessibilityNodeInfo(view, hVar.f1615a);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                hVar.g(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    hVar.i(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        hVar.b(K.c.f1604g);
                        hVar.b(K.c.f1608k);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        hVar.b(K.c.f);
                        hVar.b(K.c.f1609l);
                        break;
                    }
                }
                break;
            case 1:
                View.AccessibilityDelegate accessibilityDelegate = this.f1437a;
                AccessibilityNodeInfo accessibilityNodeInfo = hVar.f1615a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                break;
            default:
                this.f1437a.onInitializeAccessibilityNodeInfo(view, hVar.f1615a);
                hVar.i(false);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    @Override // J.C0045b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            int r0 = r3.f1897d
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r3 = super.g(r4, r5, r6)
            return r3
        La:
            boolean r3 = super.g(r4, r5, r6)
            r6 = 1
            if (r3 == 0) goto L13
            goto L8b
        L13:
            androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
            boolean r3 = r4.isEnabled()
            r0 = 0
            if (r3 != 0) goto L1e
        L1c:
            r6 = r0
            goto L8b
        L1e:
            int r3 = r4.getHeight()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.graphics.Matrix r2 = r4.getMatrix()
            boolean r2 = r2.isIdentity()
            if (r2 == 0) goto L3b
            boolean r2 = r4.getGlobalVisibleRect(r1)
            if (r2 == 0) goto L3b
            int r3 = r1.height()
        L3b:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r5 == r1) goto L6b
            r1 = 8192(0x2000, float:1.148E-41)
            if (r5 == r1) goto L4e
            r1 = 16908344(0x1020038, float:2.3877386E-38)
            if (r5 == r1) goto L4e
            r1 = 16908346(0x102003a, float:2.3877392E-38)
            if (r5 == r1) goto L6b
            goto L1c
        L4e:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 - r3
            int r3 = java.lang.Math.max(r5, r0)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto L1c
            r4.scrollTo(r0, r3)
            goto L8b
        L6b:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 + r3
            int r3 = r4.getScrollRange()
            int r3 = java.lang.Math.min(r5, r3)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto L1c
            r4.scrollTo(r0, r3)
        L8b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: O.j.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
