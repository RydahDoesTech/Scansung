package J;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.wssyncmldm.R;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: J.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044a extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final C0045b f1435a;

    public C0044a(C0045b c0045b) {
        this.f1435a = c0045b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1435a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        B.g gVarB = this.f1435a.b(view);
        if (gVarB != null) {
            return (AccessibilityNodeProvider) gVarB.f95e;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f1435a.c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        K.h hVar = new K.h(accessibilityNodeInfo);
        WeakHashMap weakHashMap = P.f1421a;
        accessibilityNodeInfo.setScreenReaderFocusable(Boolean.valueOf(L.d(view)).booleanValue());
        accessibilityNodeInfo.setHeading(Boolean.valueOf(L.c(view)).booleanValue());
        accessibilityNodeInfo.setPaneTitle(L.b(view));
        K.d.c(accessibilityNodeInfo, N.b(view));
        this.f1435a.d(view, hVar);
        accessibilityNodeInfo.getText();
        List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        for (int i5 = 0; i5 < listEmptyList.size(); i5++) {
            hVar.b((K.c) listEmptyList.get(i5));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f1435a.e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1435a.f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i5, Bundle bundle) {
        return this.f1435a.g(view, i5, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i5) {
        this.f1435a.h(view, i5);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f1435a.i(view, accessibilityEvent);
    }
}
