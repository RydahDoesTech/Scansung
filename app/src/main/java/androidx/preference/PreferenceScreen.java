package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: f0, reason: collision with root package name */
    public final boolean f4628f0;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, A.b.b(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
        this.f4628f0 = true;
    }

    @Override // androidx.preference.Preference
    public final void o() {
        z zVar;
        if (this.f4611p != null || this.f4612q != null || this.f4623a0.size() == 0 || (zVar = this.f4602e.f4544j) == null) {
            return;
        }
        zVar.onNavigateToScreen(this);
    }
}
