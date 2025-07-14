package K;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo.CollectionItemInfo f1614a;

    public g(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f1614a = collectionItemInfo;
    }

    public static g a(boolean z4, int i5, int i6, int i7, int i8) {
        return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i5, i6, i7, i8, false, z4));
    }
}
