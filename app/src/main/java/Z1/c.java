package Z1;

import android.os.HandlerThread;
import b1.AbstractC0203C;
import com.google.android.gms.internal.p000firebaseauthapi.R1;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final A.d f2862e = new A.d("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a, reason: collision with root package name */
    public volatile long f2863a;

    /* renamed from: b, reason: collision with root package name */
    public volatile long f2864b;

    /* renamed from: c, reason: collision with root package name */
    public final R1 f2865c;

    /* renamed from: d, reason: collision with root package name */
    public final G.a f2866d;

    public c(V1.g gVar) {
        f2862e.i("Initializing TokenRefresher", new Object[0]);
        AbstractC0203C.e(gVar);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        handlerThread.start();
        this.f2865c = new R1(handlerThread.getLooper());
        gVar.a();
        this.f2866d = new G.a(this, gVar.f2611b);
    }
}
