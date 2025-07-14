package w2;

import androidx.fragment.app.H;
import androidx.preference.Preference;
import androidx.preference.o;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0903a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final H f9298a;

    public C0903a(H h3) {
        if (h3 == null) {
            throw new IllegalArgumentException("activity should not be null");
        }
        this.f9298a = h3;
    }

    @Override // androidx.preference.o
    public final boolean a(Preference preference) {
        new Thread(new A.o(this, 19, preference)).start();
        return true;
    }
}
