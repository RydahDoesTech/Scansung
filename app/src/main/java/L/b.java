package l;

import Y0.j;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k2.c;

/* loaded from: classes.dex */
public final class b extends j {

    /* renamed from: c, reason: collision with root package name */
    public final Object f8006c;

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f8007d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Handler f8008e;

    public b() {
        super(25);
        this.f8006c = new Object();
        this.f8007d = Executors.newFixedThreadPool(4, new c(1));
    }
}
