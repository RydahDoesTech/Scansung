package k;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import b3.AbstractC0219i;
import com.wssyncmldm.R;

/* renamed from: k.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0617e1 extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0620f1 f7659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0614d1 f7660b;

    public C0617e1(C0620f1 c0620f1, C0614d1 c0614d1) {
        this.f7659a = c0620f1;
        this.f7660b = c0614d1;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        AbstractC0219i.e("host", view);
        AbstractC0219i.e("info", accessibilityNodeInfo);
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        C0620f1 c0620f1 = this.f7659a;
        accessibilityNodeInfo.setContentDescription(c0620f1.getResources().getString(R.string.sesl_appbar_suggest_pagination, Integer.valueOf(c0620f1.f7662d.indexOf(this.f7660b) + 1), Integer.valueOf(c0620f1.getSize())));
    }
}
