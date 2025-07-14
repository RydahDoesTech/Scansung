package X;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class h extends androidx.emoji2.text.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2663a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f2664b;

    public h(EditText editText) {
        this.f2664b = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.g
    public void a() {
        switch (this.f2663a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.f2664b.get();
                if (switchCompat != null) {
                    switchCompat.d();
                    break;
                }
                break;
        }
    }

    @Override // androidx.emoji2.text.g
    public final void b() {
        switch (this.f2663a) {
            case 0:
                i.a((EditText) this.f2664b.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.f2664b.get();
                if (switchCompat != null) {
                    switchCompat.d();
                    break;
                }
                break;
        }
    }

    public h(SwitchCompat switchCompat) {
        this.f2664b = new WeakReference(switchCompat);
    }
}
