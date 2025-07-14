package R1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.picker.widget.D;

/* loaded from: classes.dex */
public final class r extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2432a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2433b;

    public /* synthetic */ r(int i5, Object obj) {
        this.f2432a = i5;
        this.f2433b = obj;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f2432a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                EditText editText = ((s) this.f2433b).f2442h.getEditText();
                if (editText != null) {
                    accessibilityNodeInfo.setLabeledBy(editText);
                    break;
                }
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean performAccessibilityAction(View view, int i5, Bundle bundle) {
        switch (this.f2432a) {
            case 1:
                if (i5 == 16) {
                    D d5 = (D) this.f2433b;
                    d5.f4105e.selectAll();
                    d5.x();
                }
                break;
        }
        return super.performAccessibilityAction(view, i5, bundle);
    }
}
