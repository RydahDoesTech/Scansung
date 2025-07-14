package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: e0, reason: collision with root package name */
    public final C0182a f4513e0;

    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iB = A.b.b(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iB, 0);
        this.f4513e0 = new C0182a(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I.f4555a, iB, 0);
        String string = typedArrayObtainStyledAttributes.getString(5);
        this.f4649a0 = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.f4648Z) {
            j();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(4);
        this.f4650b0 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.f4648Z) {
            j();
        }
        this.f4652d0 = typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E(View view) {
        boolean z4 = view instanceof CompoundButton;
        if (z4) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f4648Z);
        }
        if (z4) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f4513e0);
        }
    }

    @Override // androidx.preference.Preference
    public final void n(H h3) {
        super.n(h3);
        E(h3.r(android.R.id.checkbox));
        D(h3.r(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void v(View view) {
        super.v(view);
        if (((AccessibilityManager) this.f4601d.getSystemService("accessibility")).isEnabled()) {
            E(view.findViewById(android.R.id.checkbox));
            if (i()) {
                return;
            }
            D(view.findViewById(android.R.id.summary));
        }
    }
}
