package G;

import android.content.Intent;
import android.os.Handler;
import com.google.firebase.messaging.AbstractServiceC0387d;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f700d;

    /* renamed from: e, reason: collision with root package name */
    public Object f701e;
    public Object f;

    /* renamed from: g, reason: collision with root package name */
    public Object f702g;

    public /* synthetic */ l(int i5) {
        this.f700d = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        switch (this.f700d) {
            case 0:
                try {
                    objCall = ((e) this.f701e).call();
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.f702g).post(new a((f) this.f, 1, objCall));
                break;
            default:
                ((AbstractServiceC0387d) this.f701e).m2x624ce8b2((Intent) this.f, (t1.i) this.f702g);
                break;
        }
    }
}
