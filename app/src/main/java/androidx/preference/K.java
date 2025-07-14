package androidx.preference;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SeslSeekBar;

/* loaded from: classes.dex */
public final class K implements View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Preference f4569e;

    public /* synthetic */ K(Preference preference, int i5) {
        this.f4568d = i5;
        this.f4569e = preference;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i5, KeyEvent keyEvent) {
        switch (this.f4568d) {
            case 0:
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                SeekBarPreference seekBarPreference = (SeekBarPreference) this.f4569e;
                if ((!seekBarPreference.f4635f0 && (i5 == 21 || i5 == 22)) || i5 == 23 || i5 == 66) {
                    return false;
                }
                SeslSeekBar seslSeekBar = seekBarPreference.f4634e0;
                if (seslSeekBar != null) {
                    return seslSeekBar.onKeyDown(i5, keyEvent);
                }
                Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                return false;
            default:
                int keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                SeslSwitchPreferenceScreen seslSwitchPreferenceScreen = (SeslSwitchPreferenceScreen) this.f4569e;
                if (keyCode != 21) {
                    if (keyCode != 22 || seslSwitchPreferenceScreen.f4648Z) {
                        return false;
                    }
                    seslSwitchPreferenceScreen.a(Boolean.TRUE);
                    seslSwitchPreferenceScreen.C(true);
                } else {
                    if (!seslSwitchPreferenceScreen.f4648Z) {
                        return false;
                    }
                    seslSwitchPreferenceScreen.a(Boolean.FALSE);
                    seslSwitchPreferenceScreen.C(false);
                }
                return true;
        }
    }
}
