package androidx.preference;

import android.view.View;

/* renamed from: androidx.preference.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0193l implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Preference f4673e;

    public /* synthetic */ ViewOnClickListenerC0193l(Preference preference, int i5) {
        this.f4672d = i5;
        this.f4673e = preference;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4672d) {
            case 0:
                this.f4673e.v(view);
                break;
            case 1:
                ((SwitchPreference) this.f4673e).b();
                break;
            default:
                ((SwitchPreferenceCompat) this.f4673e).b();
                break;
        }
    }
}
