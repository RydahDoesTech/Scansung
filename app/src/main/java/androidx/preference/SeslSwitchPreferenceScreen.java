package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.wssyncmldm.R;
import r0.AbstractC0807a;
import r0.AbstractC0808b;

/* loaded from: classes.dex */
public class SeslSwitchPreferenceScreen extends SwitchPreferenceCompat {
    public final K k0;

    public SeslSwitchPreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceStyle);
        this.k0 = new K(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I.f, R.attr.switchPreferenceStyle, 0);
        String string = typedArrayObtainStyledAttributes.getString(13);
        if (string == null || string.equals("")) {
            Log.w("SwitchPreferenceScreen", "SwitchPreferenceScreen should getfragment property. Fragment property does not exsit in SwitchPreferenceScreen");
        }
        this.f4585H = R.layout.sesl_preference_switch_screen;
        this.f4586I = R.layout.sesl_switch_preference_screen_widget_divider;
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void b() {
    }

    @Override // androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public final void n(H h3) {
        super.n(h3);
        h3.f7128a.setOnKeyListener(this.k0);
        TextView textView = (TextView) h3.r(android.R.id.title);
        View viewR = h3.r(android.R.id.switch_widget);
        View viewR2 = h3.r(R.id.switch_widget);
        if (textView == null || viewR == null || viewR2 == null) {
            return;
        }
        AbstractC0808b.m(AbstractC0807a.b(), viewR);
        viewR.setContentDescription(textView.getText().toString());
        viewR2.setContentDescription(textView.getText().toString());
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    public final void o() {
    }
}
