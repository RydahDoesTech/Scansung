package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.preference.J;
import androidx.preference.SeekBarPreference;
import k.X0;
import k.o1;
import k.p1;

/* loaded from: classes.dex */
public class SeslSeekBar extends X0 {

    /* renamed from: g1, reason: collision with root package name */
    public int f3425g1;

    /* renamed from: h1, reason: collision with root package name */
    public o1 f3426h1;

    public SeslSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // k.X0
    public final void D() {
        int progress;
        super.D();
        o1 o1Var = this.f3426h1;
        if (o1Var != null) {
            SeekBarPreference seekBarPreference = ((J) o1Var).f4567a;
            seekBarPreference.f4633d0 = false;
            int progress2 = getProgress();
            int i5 = seekBarPreference.f4630a0;
            if (progress2 + i5 == seekBarPreference.f4629Z || (progress = getProgress() + i5) == seekBarPreference.f4629Z) {
                return;
            }
            seekBarPreference.a(Integer.valueOf(progress));
            seekBarPreference.C(progress, false);
        }
    }

    @Override // k.X0, androidx.appcompat.widget.SeslProgressBar, android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @Override // k.X0, androidx.appcompat.widget.SeslProgressBar
    public final void j(float f, boolean z4, int i5) {
        super.j(f, z4, i5);
        if (!this.d1) {
            o1 o1Var = this.f3426h1;
            if (o1Var != null) {
                SeekBarPreference seekBarPreference = ((J) o1Var).f4567a;
                if (z4 && (seekBarPreference.g0 || !seekBarPreference.f4633d0)) {
                    int progress = getProgress() + seekBarPreference.f4630a0;
                    if (progress != seekBarPreference.f4629Z) {
                        seekBarPreference.a(Integer.valueOf(progress));
                        seekBarPreference.C(progress, false);
                    }
                }
                seekBarPreference.getClass();
                return;
            }
            return;
        }
        int iRound = Math.round(i5 / 1000.0f);
        if (this.f3425g1 != iRound) {
            this.f3425g1 = iRound;
            o1 o1Var2 = this.f3426h1;
            if (o1Var2 != null) {
                SeekBarPreference seekBarPreference2 = ((J) o1Var2).f4567a;
                if (z4 && (seekBarPreference2.g0 || !seekBarPreference2.f4633d0)) {
                    int progress2 = getProgress() + seekBarPreference2.f4630a0;
                    if (progress2 != seekBarPreference2.f4629Z) {
                        seekBarPreference2.a(Integer.valueOf(progress2));
                        seekBarPreference2.C(progress2, false);
                    }
                }
                seekBarPreference2.getClass();
            }
        }
    }

    @Override // k.X0, androidx.appcompat.widget.SeslProgressBar, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z4;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        synchronized (this) {
            z4 = this.f3379A;
        }
        if (z4 || !isEnabled()) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS);
    }

    public void setOnSeekBarChangeListener(o1 o1Var) {
        this.f3426h1 = o1Var;
    }

    public void setOnSeekBarHoverListener(p1 p1Var) {
    }
}
