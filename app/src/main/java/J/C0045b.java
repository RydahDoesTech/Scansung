package J;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.wssyncmldm.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: J.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0045b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f1436c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f1437a;

    /* renamed from: b, reason: collision with root package name */
    public final C0044a f1438b;

    public C0045b() {
        this(f1436c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1437a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public B.g b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f1437a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new B.g(13, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f1437a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, K.h hVar) {
        this.f1437a.onInitializeAccessibilityNodeInfo(view, hVar.f1615a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f1437a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1437a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i5, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        boolean z4 = false;
        int i6 = 0;
        while (true) {
            if (i6 >= listEmptyList.size()) {
                break;
            }
            K.c cVar = (K.c) listEmptyList.get(i6);
            if (cVar.a() == i5) {
                K.q qVar = cVar.f1613d;
                if (qVar != null) {
                    Class cls = cVar.f1612c;
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e5) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e5);
                        }
                    }
                    zPerformAccessibilityAction = qVar.h(view);
                }
            } else {
                i6++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f1437a.performAccessibilityAction(view, i5, bundle);
        }
        if (zPerformAccessibilityAction || i5 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i7 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i7)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i8 = 0;
            while (true) {
                if (clickableSpanArr == null || i8 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i8])) {
                    clickableSpan.onClick(view);
                    z4 = true;
                    break;
                }
                i8++;
            }
        }
        return z4;
    }

    public void h(View view, int i5) {
        this.f1437a.sendAccessibilityEvent(view, i5);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f1437a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0045b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1437a = accessibilityDelegate;
        this.f1438b = new C0044a(this);
    }
}
