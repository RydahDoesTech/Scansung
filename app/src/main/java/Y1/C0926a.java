package y1;

import J.P;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0926a extends V1.a {

    /* renamed from: a, reason: collision with root package name */
    public int f9358a;

    /* renamed from: b, reason: collision with root package name */
    public int f9359b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f9360c;

    public C0926a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f9360c = swipeDismissBehavior;
    }

    @Override // V1.a
    public final int R(View view) {
        return view.getWidth();
    }

    @Override // V1.a
    public final void c0(int i5, View view) {
        this.f9359b = i5;
        this.f9358a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f9360c;
            swipeDismissBehavior.f5735c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f5735c = false;
        }
    }

    @Override // V1.a
    public final void d0(int i5) {
        this.f9360c.getClass();
    }

    @Override // V1.a
    public final void e0(View view, int i5, int i6) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f9360c;
        float f = width * swipeDismissBehavior.f5737e;
        float width2 = view.getWidth() * swipeDismissBehavior.f;
        float fAbs = Math.abs(i5 - this.f9358a);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    @Override // V1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f0(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f9359b = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f9360c
            r4 = 0
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = J.P.f1421a
            int r5 = r9.getLayoutDirection()
            if (r5 != r2) goto L1a
            r5 = r2
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r3.f5736d
            r7 = 2
            if (r6 != r7) goto L21
            goto L55
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L69
            goto L55
        L2a:
            if (r1 <= 0) goto L69
            goto L55
        L2d:
            if (r6 != r2) goto L69
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L69
            goto L55
        L34:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L69
            goto L55
        L39:
            int r1 = r9.getLeft()
            int r5 = r8.f9358a
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r3.getClass()
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L69
        L55:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L64
            int r10 = r9.getLeft()
            int r0 = r8.f9358a
            if (r10 >= r0) goto L62
            goto L64
        L62:
            int r0 = r0 + r11
            goto L6c
        L64:
            int r8 = r8.f9358a
            int r0 = r8 - r11
            goto L6c
        L69:
            int r0 = r8.f9358a
            r2 = r4
        L6c:
            S.d r8 = r3.f5733a
            int r10 = r9.getTop()
            boolean r8 = r8.o(r0, r10)
            if (r8 == 0) goto L82
            G.a r8 = new G.a
            r8.<init>(r3, r9, r2)
            java.util.WeakHashMap r10 = J.P.f1421a
            r9.postOnAnimation(r8)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.C0926a.f0(android.view.View, float, float):void");
    }

    @Override // V1.a
    public final int h(int i5, View view) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = P.f1421a;
        boolean z4 = view.getLayoutDirection() == 1;
        int i6 = this.f9360c.f5736d;
        if (i6 == 0) {
            if (z4) {
                width = this.f9358a - view.getWidth();
                width2 = this.f9358a;
            } else {
                width = this.f9358a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i6 != 1) {
            width = this.f9358a - view.getWidth();
            width2 = this.f9358a + view.getWidth();
        } else if (z4) {
            width = this.f9358a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f9358a - view.getWidth();
            width2 = this.f9358a;
        }
        return Math.min(Math.max(width, i5), width2);
    }

    @Override // V1.a
    public final int i(int i5, View view) {
        return view.getTop();
    }

    @Override // V1.a
    public final boolean o0(int i5, View view) {
        int i6 = this.f9359b;
        return (i6 == -1 || i6 == i5) && this.f9360c.s(view);
    }
}
