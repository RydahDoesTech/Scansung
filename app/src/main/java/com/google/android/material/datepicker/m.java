package com.google.android.material.datepicker;

import J.C0045b;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public final class m extends C0045b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5889e;

    public /* synthetic */ m(int i5, Object obj) {
        this.f5888d = i5;
        this.f5889e = obj;
    }

    @Override // J.C0045b
    public final void d(View view, K.h hVar) {
        switch (this.f5888d) {
            case 0:
                View.AccessibilityDelegate accessibilityDelegate = this.f1437a;
                AccessibilityNodeInfo accessibilityNodeInfo = hVar.f1615a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                break;
            default:
                View.AccessibilityDelegate accessibilityDelegate2 = this.f1437a;
                AccessibilityNodeInfo accessibilityNodeInfo2 = hVar.f1615a;
                accessibilityDelegate2.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                l lVar = (l) this.f5889e;
                accessibilityNodeInfo2.setHintText(lVar.f5887o.getVisibility() == 0 ? lVar.getString(R.string.mtrl_picker_toggle_to_year_selection) : lVar.getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
        }
    }
}
