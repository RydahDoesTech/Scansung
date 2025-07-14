package androidx.preference;

import J.P;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import androidx.appcompat.widget.SwitchCompat;
import java.util.WeakHashMap;
import r0.AbstractC0808b;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: e0, reason: collision with root package name */
    public final C0182a f4643e0;

    /* renamed from: f0, reason: collision with root package name */
    public final String f4644f0;
    public final String g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f4645h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f4646i0;

    /* renamed from: j0, reason: collision with root package name */
    public final ViewOnClickListenerC0193l f4647j0;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5, 0);
        this.f4643e0 = new C0182a(this, 2);
        this.f4646i0 = 0;
        this.f4647j0 = new ViewOnClickListenerC0193l(this, 2);
        this.f4645h0 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I.f4566m, i5, 0);
        String string = typedArrayObtainStyledAttributes.getString(7);
        this.f4649a0 = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.f4648Z) {
            j();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        this.f4650b0 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.f4648Z) {
            j();
        }
        String string3 = typedArrayObtainStyledAttributes.getString(9);
        this.f4644f0 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        j();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.g0 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        j();
        this.f4652d0 = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static boolean E(boolean z4, View view, SwitchCompat switchCompat) {
        return z4 != switchCompat.isChecked() && view.hasWindowFocus() && AbstractC0808b.i(null, view) && !view.isTemporarilyDetached();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F(View view) {
        boolean z4 = view instanceof SwitchCompat;
        if (z4) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f4648Z);
        }
        if (z4) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f4644f0);
            switchCompat.setTextOff(this.g0);
            switchCompat.setOnCheckedChangeListener(this.f4643e0);
            if (switchCompat.isClickable()) {
                switchCompat.setOnClickListener(this.f4647j0);
            }
            if (!i() || (this instanceof SeslSwitchPreferenceScreen)) {
                return;
            }
            WeakHashMap weakHashMap = P.f1421a;
            switchCompat.setBackground(null);
            switchCompat.setClickable(false);
        }
    }

    @Override // androidx.preference.Preference
    public void n(H h3) {
        super.n(h3);
        if (this.f4645h0 != 1) {
            F(h3.r(R.id.switch_widget));
        }
        D(h3.r(R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void v(View view) {
        super.v(view);
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f4601d.getSystemService("accessibility");
        if (accessibilityManager == null || accessibilityManager.isEnabled()) {
            if (this.f4645h0 != 1) {
                F(view.findViewById(R.id.switch_widget));
            }
            if (i()) {
                return;
            }
            D(view.findViewById(R.id.summary));
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.wssyncmldm.R.attr.switchPreferenceCompatStyle);
    }
}
