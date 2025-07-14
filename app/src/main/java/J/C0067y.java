package J;

import android.graphics.Rect;
import android.graphics.Region;
import android.util.ArrayMap;
import android.util.Log;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: J.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0067y extends TouchDelegate {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1496c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f1497a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1498b;

    public C0067y(View view) {
        super(new Rect(), view);
        this.f1497a = new HashSet();
        this.f1498b = view;
    }

    public static Rect b(View view, View view2) {
        Rect rect = new Rect(0, 0, view2.getWidth(), view2.getHeight());
        Rect rect2 = new Rect();
        while (!view2.equals(view)) {
            view2.getHitRect(rect2);
            rect.left += rect2.left;
            rect.right += rect2.left;
            rect.top += rect2.top;
            rect.bottom += rect2.top;
            Object parent = view2.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view2 = (View) parent;
        }
        if (view2.equals(view)) {
            return rect;
        }
        throw new C0066x("TouchTargetDelegate's delegateView must be child of anchorView");
    }

    public final void a(View view, C0065w c0065w) {
        try {
            Rect rectB = b(this.f1498b, view);
            if (c0065w != null) {
                rectB.left -= c0065w.f1494c;
                rectB.top -= c0065w.f1492a;
                rectB.right += c0065w.f1495d;
                rectB.bottom += c0065w.f1493b;
            }
            this.f1497a.add(new C0064v(rectB, view));
        } catch (C0066x e5) {
            Log.w("SeslTouchTargetDelegate", "delegateView must be child of anchorView");
            e5.printStackTrace();
        }
    }

    @Override // android.view.TouchDelegate
    public final AccessibilityNodeInfo.TouchDelegateInfo getTouchDelegateInfo() {
        Log.i("SeslTouchTargetDelegate", "SeslTouchTargetDelegate does not support accessibility because it cannot support multi-touch delegation with AOSP View");
        ArrayMap arrayMap = new ArrayMap(1);
        arrayMap.put(new Region(), this.f1498b);
        return new AccessibilityNodeInfo.TouchDelegateInfo(arrayMap);
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Iterator it = this.f1497a.iterator();
        while (it.hasNext()) {
            C0064v c0064v = (C0064v) it.next();
            if (c0064v.f1490a.getParent() == null) {
                Log.w("SeslTouchTargetDelegate", "delegate view(" + c0064v.f1490a + ")'s getParent() is null");
            } else if (c0064v.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchExplorationHoverEvent(MotionEvent motionEvent) {
        Log.i("SeslTouchTargetDelegate", "SeslTouchTargetDelegate does not support accessibility because it cannot support multi-touch delegation with AOSP View");
        return false;
    }
}
