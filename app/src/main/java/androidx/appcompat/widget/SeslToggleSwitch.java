package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import k.q1;

/* loaded from: classes.dex */
public class SeslToggleSwitch extends SwitchCompat {
    public SeslToggleSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) throws Resources.NotFoundException {
        super.setChecked(z4);
    }

    public void setCheckedInternal(boolean z4) throws Resources.NotFoundException {
        super.setChecked(z4);
    }

    public void setOnBeforeCheckedChangeListener(q1 q1Var) {
    }
}
