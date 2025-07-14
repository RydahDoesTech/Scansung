package B0;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class j extends t {

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f134B = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: A, reason: collision with root package name */
    public final int f135A;

    public j(int i5) {
        this();
        this.f135A = i5;
    }

    public static void I(z zVar) {
        int visibility = zVar.f187b.getVisibility();
        HashMap map = zVar.f186a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = zVar.f187b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static B0.F K(B0.z r8, B0.z r9) {
        /*
            B0.F r0 = new B0.F
            r0.<init>()
            r1 = 0
            r0.f108a = r1
            r0.f109b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f186a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f110c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f112e = r6
            goto L33
        L2f:
            r0.f110c = r3
            r0.f112e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f186a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f111d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L56
        L52:
            r0.f111d = r3
            r0.f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f110c
            int r9 = r0.f111d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f112e
            android.view.ViewGroup r4 = r0.f
            if (r3 != r4) goto L68
            return r0
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f109b = r1
            r0.f108a = r2
            goto L9f
        L71:
            if (r9 != 0) goto L9f
            r0.f109b = r2
            r0.f108a = r2
            goto L9f
        L78:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L81
            r0.f109b = r1
            r0.f108a = r2
            goto L9f
        L81:
            android.view.ViewGroup r8 = r0.f112e
            if (r8 != 0) goto L9f
            r0.f109b = r2
            r0.f108a = r2
            goto L9f
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f111d
            if (r8 != 0) goto L95
            r0.f109b = r2
            r0.f108a = r2
            goto L9f
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f110c
            if (r8 != 0) goto L9f
            r0.f109b = r1
            r0.f108a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.j.K(B0.z, B0.z):B0.F");
    }

    public final ObjectAnimator J(View view, float f, float f5) {
        if (f == f5) {
            return null;
        }
        C0004c c0004c = A.f98a;
        view.setTransitionAlpha(f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, A.f98a, f5);
        objectAnimatorOfFloat.addListener(new i(view));
        a(new h(0, view));
        return objectAnimatorOfFloat;
    }

    @Override // B0.t
    public final void e(z zVar) {
        I(zVar);
    }

    @Override // B0.t
    public final void h(z zVar) {
        I(zVar);
        HashMap map = zVar.f186a;
        C0004c c0004c = A.f98a;
        map.put("android:fade:transitionAlpha", Float.valueOf(zVar.f187b.getTransitionAlpha()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (K(o(r3, false), r(r3, false)).f108a != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0204  */
    @Override // B0.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator l(android.view.ViewGroup r22, B0.z r23, B0.z r24) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.j.l(android.view.ViewGroup, B0.z, B0.z):android.animation.Animator");
    }

    @Override // B0.t
    public final String[] q() {
        return f134B;
    }

    @Override // B0.t
    public final boolean s(z zVar, z zVar2) {
        if (zVar == null && zVar2 == null) {
            return false;
        }
        if (zVar != null && zVar2 != null && zVar2.f186a.containsKey("android:visibility:visibility") != zVar.f186a.containsKey("android:visibility:visibility")) {
            return false;
        }
        F fK = K(zVar, zVar2);
        if (fK.f108a) {
            return fK.f110c == 0 || fK.f111d == 0;
        }
        return false;
    }

    public j() {
        this.f135A = 3;
    }
}
