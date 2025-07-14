package Z1;

import android.os.Looper;
import com.google.android.gms.internal.p000firebaseauthapi.R1;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i implements Executor {

    /* renamed from: e, reason: collision with root package name */
    public static final i f2874e = new i();

    /* renamed from: d, reason: collision with root package name */
    public final R1 f2875d = new R1(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f2875d.post(runnable);
    }
}
