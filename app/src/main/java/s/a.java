package S;

import B.g;
import K.h;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class a extends g {
    public final /* synthetic */ b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(13);
        this.f = bVar;
    }

    @Override // B.g
    public final h d(int i5) {
        return new h(AccessibilityNodeInfo.obtain(this.f.r(i5).f1615a));
    }

    @Override // B.g
    public final h h(int i5) {
        b bVar = this.f;
        int i6 = i5 == 2 ? bVar.f2499k : bVar.f2500l;
        if (i6 == Integer.MIN_VALUE) {
            return null;
        }
        return d(i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    @Override // B.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(int r6, int r7, android.os.Bundle r8) {
        /*
            r5 = this;
            S.b r5 = r5.f
            android.view.View r0 = r5.f2497i
            r1 = -1
            if (r6 == r1) goto L64
            r8 = 1
            if (r7 == r8) goto L5f
            r1 = 2
            if (r7 == r1) goto L5a
            r1 = 64
            r2 = 0
            r3 = 65536(0x10000, float:9.1835E-41)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r1) goto L2f
            r1 = 128(0x80, float:1.8E-43)
            if (r7 == r1) goto L1f
            boolean r5 = r5.s(r6, r7)
            goto L6a
        L1f:
            int r7 = r5.f2499k
            if (r7 != r6) goto L2c
            r5.f2499k = r4
            r0.invalidate()
            r5.y(r6, r3)
            goto L2d
        L2c:
            r8 = r2
        L2d:
            r5 = r8
            goto L6a
        L2f:
            android.view.accessibility.AccessibilityManager r7 = r5.f2496h
            boolean r1 = r7.isEnabled()
            if (r1 == 0) goto L2c
            boolean r7 = r7.isTouchExplorationEnabled()
            if (r7 != 0) goto L3e
            goto L2c
        L3e:
            int r7 = r5.f2499k
            if (r7 == r6) goto L2c
            if (r7 == r4) goto L4e
            r5.f2499k = r4
            android.view.View r1 = r5.f2497i
            r1.invalidate()
            r5.y(r7, r3)
        L4e:
            r5.f2499k = r6
            r0.invalidate()
            r7 = 32768(0x8000, float:4.5918E-41)
            r5.y(r6, r7)
            goto L2d
        L5a:
            boolean r5 = r5.j(r6)
            goto L6a
        L5f:
            boolean r5 = r5.x(r6)
            goto L6a
        L64:
            java.util.WeakHashMap r5 = J.P.f1421a
            boolean r5 = r0.performAccessibilityAction(r7, r8)
        L6a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: S.a.i(int, int, android.os.Bundle):boolean");
    }
}
