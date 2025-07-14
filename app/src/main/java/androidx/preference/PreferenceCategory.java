package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, A.b.b(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle));
    }

    @Override // androidx.preference.Preference
    public final boolean A() {
        return !super.h();
    }

    @Override // androidx.preference.Preference
    public final boolean h() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void n(H h3) {
        super.n(h3);
        h3.f7128a.setAccessibilityHeading(true);
    }
}
