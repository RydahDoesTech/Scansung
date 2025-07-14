package J;

import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.wssyncmldm.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f1421a;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1422b = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: c, reason: collision with root package name */
    public static final D f1423c = new D();

    public static Z a(View view) {
        if (f1421a == null) {
            f1421a = new WeakHashMap();
        }
        Z z4 = (Z) f1421a.get(view);
        if (z4 != null) {
            return z4;
        }
        Z z5 = new Z(view);
        f1421a.put(view, z5);
        return z5;
    }

    public static p0 b(View view, p0 p0Var) {
        WindowInsets windowInsetsE = p0Var.e();
        if (windowInsetsE != null) {
            WindowInsets windowInsetsA = F.a(view, windowInsetsE);
            if (!windowInsetsA.equals(windowInsetsE)) {
                return p0.f(windowInsetsA, view);
            }
        }
        return p0Var;
    }

    public static ArrayList c(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void d(int i5, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z4 = L.b(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z4) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z4 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i5);
                if (z4) {
                    accessibilityEventObtain.getText().add(L.b(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i5 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i5);
                        return;
                    } catch (AbstractMethodError e5) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e5);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i5);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(L.b(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static p0 e(View view, p0 p0Var) {
        WindowInsets windowInsetsE = p0Var.e();
        if (windowInsetsE != null) {
            WindowInsets windowInsetsB = F.b(view, windowInsetsE);
            if (!windowInsetsB.equals(windowInsetsE)) {
                return p0.f(windowInsetsB, view);
            }
        }
        return p0Var;
    }

    public static void f(int i5, View view) {
        ArrayList arrayListC = c(view);
        for (int i6 = 0; i6 < arrayListC.size(); i6++) {
            if (((K.c) arrayListC.get(i6)).a() == i5) {
                arrayListC.remove(i6);
                return;
            }
        }
    }

    public static void g(View view, K.c cVar, K.q qVar) {
        K.c cVar2 = new K.c(null, cVar.f1611b, null, qVar, cVar.f1612c);
        View.AccessibilityDelegate accessibilityDelegateA = M.a(view);
        C0045b c0045b = accessibilityDelegateA == null ? null : accessibilityDelegateA instanceof C0044a ? ((C0044a) accessibilityDelegateA).f1435a : new C0045b(accessibilityDelegateA);
        if (c0045b == null) {
            c0045b = new C0045b();
        }
        h(view, c0045b);
        f(cVar2.a(), view);
        c(view).add(cVar2);
        d(0, view);
    }

    public static void h(View view, C0045b c0045b) {
        if (c0045b == null && (M.a(view) instanceof C0044a)) {
            c0045b = new C0045b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0045b == null ? null : c0045b.f1438b);
    }

    public static void i(View view, CharSequence charSequence) {
        new C(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 0).d(view, charSequence);
        D d5 = f1423c;
        if (charSequence == null) {
            d5.f1414d.remove(view);
            view.removeOnAttachStateChangeListener(d5);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(d5);
        } else {
            d5.f1414d.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(d5);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(d5);
            }
        }
    }
}
