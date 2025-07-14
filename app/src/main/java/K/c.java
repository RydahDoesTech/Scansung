package K;

import android.R;
import android.view.accessibility.AccessibilityNodeInfo;
import com.idm.agent.dm.IDMDmInterface;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f1603e;
    public static final c f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f1604g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f1605h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f1606i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f1607j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f1608k;

    /* renamed from: l, reason: collision with root package name */
    public static final c f1609l;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1610a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1611b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f1612c;

    /* renamed from: d, reason: collision with root package name */
    public final q f1613d;

    static {
        new c(1);
        new c(2);
        new c(4);
        new c(8);
        f1603e = new c(16);
        new c(32);
        new c(64);
        new c(128);
        new c(256, j.class);
        new c(512, j.class);
        new c(1024, k.class);
        new c(2048, k.class);
        f = new c(4096);
        f1604g = new c(8192);
        new c(NetworkAnalyticsConstants.DataPoints.FLAG_SOURCE_PORT);
        new c(NetworkAnalyticsConstants.DataPoints.FLAG_UID);
        new c(NetworkAnalyticsConstants.DataPoints.FLAG_DNS_UID);
        new c(NetworkAnalyticsConstants.DataPoints.FLAG_PPID, o.class);
        f1605h = new c(NetworkAnalyticsConstants.DataPoints.FLAG_PARENT_PROCESS_HASH);
        f1606i = new c(NetworkAnalyticsConstants.DataPoints.FLAG_INTERFACE_NAME);
        f1607j = new c(IDMDmInterface.IDM_MAX_OBJ_SIZE);
        new c(2097152, p.class);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, m.class);
        f1608k = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f1609l = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, n.class);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, l.class);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD, R.id.accessibilityActionPressAndHold, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER, R.id.accessibilityActionImeEnter, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START, R.id.accessibilityActionDragStart, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP, R.id.accessibilityActionDragDrop, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL, R.id.accessibilityActionDragCancel, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new c(f.a(), R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public c(int i5) {
        this(null, i5, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f1610a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        Object obj2 = ((c) obj).f1610a;
        Object obj3 = this.f1610a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f1610a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strD = h.d(this.f1611b);
        if (strD.equals("ACTION_UNKNOWN")) {
            Object obj = this.f1610a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strD);
        return sb.toString();
    }

    public c(int i5, Class cls) {
        this(null, i5, null, null, cls);
    }

    public c(Object obj, int i5, String str, q qVar, Class cls) {
        this.f1611b = i5;
        this.f1613d = qVar;
        if (obj == null) {
            this.f1610a = new AccessibilityNodeInfo.AccessibilityAction(i5, str);
        } else {
            this.f1610a = obj;
        }
        this.f1612c = cls;
    }
}
