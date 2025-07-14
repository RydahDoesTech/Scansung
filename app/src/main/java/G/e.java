package G;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f681b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f682c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B3.g f683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f684e;

    public /* synthetic */ e(String str, Context context, B3.g gVar, int i5, int i6) {
        this.f680a = i6;
        this.f681b = str;
        this.f682c = context;
        this.f683d = gVar;
        this.f684e = i5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f680a) {
            case 0:
                return h.a(this.f681b, this.f682c, this.f683d, this.f684e);
            default:
                try {
                    return h.a(this.f681b, this.f682c, this.f683d, this.f684e);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
