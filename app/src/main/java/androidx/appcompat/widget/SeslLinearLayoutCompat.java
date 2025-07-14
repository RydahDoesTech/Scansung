package androidx.appcompat.widget;

import J.M;
import J.P;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import c.AbstractC0220a;
import com.google.firebase.messaging.C0388e;
import java.util.WeakHashMap;
import k.AbstractC0649q0;
import k.C0586A;

/* loaded from: classes.dex */
public class SeslLinearLayoutCompat extends AbstractC0649q0 {

    /* renamed from: s, reason: collision with root package name */
    public final C0586A f3373s;

    /* renamed from: t, reason: collision with root package name */
    public final C0388e f3374t;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.appcompat.util.b f3375u;

    public SeslLinearLayoutCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int[] iArr = AbstractC0220a.f5132w;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        WeakHashMap weakHashMap = P.f1421a;
        M.d(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        int i5 = typedArrayObtainStyledAttributes.getInt(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        androidx.appcompat.util.b bVar = new androidx.appcompat.util.b(context);
        this.f3375u = bVar;
        bVar.setRoundedCorners(i5);
        C0586A c0586a = new C0586A();
        c0586a.f7468d = null;
        this.f3373s = c0586a;
        this.f3374t = new C0388e(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f3375u.drawRoundedCorner(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 66) {
            int action = keyEvent.getAction();
            C0388e c0388e = this.f3374t;
            if (action == 0) {
                View focusedChild = getFocusedChild();
                if (focusedChild != null) {
                    c0388e.F(focusedChild);
                }
            } else {
                c0388e.G();
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getAction()
            r1 = 0
            r2 = 0
            com.google.firebase.messaging.e r3 = r12.f3374t
            k.A r4 = r12.f3373s
            if (r0 == 0) goto L4c
            r5 = 1
            if (r0 == r5) goto L3a
            r5 = 3
            if (r0 == r5) goto L1c
            r5 = 211(0xd3, float:2.96E-43)
            if (r0 == r5) goto L4c
            r5 = 212(0xd4, float:2.97E-43)
            if (r0 == r5) goto L3a
            goto Lc2
        L1c:
            java.lang.Object r0 = r4.f7468d
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            if (r0 == 0) goto L35
            boolean r5 = r0 instanceof androidx.appcompat.graphics.drawable.SeslRecoilDrawable
            if (r5 == 0) goto L2e
            androidx.appcompat.graphics.drawable.SeslRecoilDrawable r0 = (androidx.appcompat.graphics.drawable.SeslRecoilDrawable) r0
            int[] r2 = new int[r2]
            r0.setState(r2)
            goto L33
        L2e:
            int[] r2 = new int[r2]
            r0.setState(r2)
        L33:
            r4.f7468d = r1
        L35:
            r3.G()
            goto Lc2
        L3a:
            java.lang.Object r0 = r4.f7468d
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            if (r0 == 0) goto L47
            int[] r2 = new int[r2]
            r0.setState(r2)
            r4.f7468d = r1
        L47:
            r3.G()
            goto Lc2
        L4c:
            r0 = r2
        L4d:
            int r5 = r12.getChildCount()
            if (r0 >= r5) goto L6b
            android.view.View r5 = r12.getChildAt(r0)
            float r6 = r13.getX()
            int r6 = (int) r6
            float r7 = r13.getY()
            int r7 = (int) r7
            boolean r6 = r12.m(r5, r6, r7)
            if (r6 == 0) goto L68
            goto L6c
        L68:
            int r0 = r0 + 1
            goto L4d
        L6b:
            r5 = r1
        L6c:
            if (r5 != 0) goto L70
        L6e:
            r0 = r1
            goto L9e
        L70:
            float r0 = r13.getX()
            int r0 = (int) r0
            float r6 = r13.getY()
            int r6 = (int) r6
            android.view.View r0 = r12.l(r5, r0, r6)
            if (r0 == 0) goto L9e
            if (r0 == r5) goto L9e
            int r6 = r5.getWidth()
            int r5 = r5.getHeight()
            int r5 = r5 * r6
            int r6 = r0.getWidth()
            int r7 = r0.getHeight()
            int r7 = r7 * r6
            double r6 = (double) r7
            double r8 = (double) r5
            r10 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r8 = r8 * r10
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 >= 0) goto L9e
            goto L6e
        L9e:
            if (r0 == 0) goto Lc2
            java.lang.Object r5 = r4.f7468d
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            if (r5 == 0) goto Lad
            int[] r2 = new int[r2]
            r5.setState(r2)
            r4.f7468d = r1
        Lad:
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            r4.f7468d = r1
            if (r1 == 0) goto Lbf
            r2 = 16843623(0x1010367, float:2.3696E-38)
            int[] r2 = new int[]{r2}
            r1.setState(r2)
        Lbf:
            r3.F(r0)
        Lc2:
            boolean r12 = super.dispatchTouchEvent(r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SeslLinearLayoutCompat.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public androidx.appcompat.util.b getRoundedCorner() {
        return this.f3375u;
    }

    public final View l(View view, int i5, int i6) {
        View viewL = null;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (m(childAt, i5, i6) && (viewL = l(childAt, i5, i6)) != null) {
                    break;
                }
            }
        }
        return (viewL == null && view.isClickable() && view.getVisibility() == 0 && view.isEnabled()) ? view : viewL;
    }

    public final boolean m(View view, int i5, int i6) {
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        view.getGlobalVisibleRect(rect2);
        getGlobalVisibleRect(rect);
        return rect2.contains(rect.width() + ((i5 + rect.left) - getWidth()), rect.height() + ((i6 + rect.top) - getHeight()));
    }
}
