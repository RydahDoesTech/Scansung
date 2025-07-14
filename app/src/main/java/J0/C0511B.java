package j0;

import android.database.Observable;
import androidx.preference.Preference;

/* renamed from: j0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0511B extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC0512C) ((Observable) this).mObservers.get(size)).a();
        }
    }

    public final void c(int i5, int i6, Preference preference) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC0512C) ((Observable) this).mObservers.get(size)).b(i5, i6, preference);
        }
    }
}
