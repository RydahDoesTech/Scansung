package X1;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import o2.C0717b;

/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2748d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f2749e;

    public s(FirebaseAuth firebaseAuth) {
        this.f2749e = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2748d) {
            case 0:
                FirebaseAuth firebaseAuth = this.f2749e;
                Iterator it = firebaseAuth.f6088c.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                Iterator it2 = firebaseAuth.f6087b.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
                return;
            default:
                Iterator it3 = this.f2749e.f6089d.iterator();
                if (it3.hasNext()) {
                    it3.next().getClass();
                    throw new ClassCastException();
                }
                return;
        }
    }

    public s(FirebaseAuth firebaseAuth, C0717b c0717b) {
        this.f2749e = firebaseAuth;
    }
}
