package V1;

import a1.InterfaceC0094b;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d implements InterfaceC0094b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f2603a = new AtomicReference();

    @Override // a1.InterfaceC0094b
    public final void a(boolean z4) {
        synchronized (g.f2607i) {
            try {
                Iterator it = new ArrayList(g.f2609k.values()).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    if (gVar.f2614e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = gVar.f2616h.iterator();
                        if (it2.hasNext()) {
                            if (it2.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
