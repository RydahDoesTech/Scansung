package K;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final B.g f1617a;

    public i(B.g gVar) {
        this.f1617a = gVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i5, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f1617a.getClass();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i5) {
        h hVarD = this.f1617a.d(i5);
        if (hVarD == null) {
            return null;
        }
        return hVarD.f1615a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i5) {
        this.f1617a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i5) {
        h hVarH = this.f1617a.h(i5);
        if (hVarH == null) {
            return null;
        }
        return hVarH.f1615a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i5, int i6, Bundle bundle) {
        return this.f1617a.i(i5, i6, bundle);
    }
}
