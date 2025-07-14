package K;

import J.P;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final I0.b f1602a;

    public b(I0.b bVar) {
        this.f1602a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f1602a.equals(((b) obj).f1602a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1602a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z4) {
        R1.k kVar = (R1.k) this.f1602a.f854e;
        AutoCompleteTextView autoCompleteTextView = kVar.f2389h;
        if (autoCompleteTextView == null || V1.a.W(autoCompleteTextView)) {
            return;
        }
        int i5 = z4 ? 2 : 1;
        WeakHashMap weakHashMap = P.f1421a;
        kVar.f2426d.setImportantForAccessibility(i5);
    }
}
