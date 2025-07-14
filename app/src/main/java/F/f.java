package F;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f618a;

    /* renamed from: b, reason: collision with root package name */
    public e f619b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f620c;

    public final void a(e eVar) {
        synchronized (this) {
            while (this.f620c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f619b == eVar) {
                return;
            }
            this.f619b = eVar;
            if (this.f618a) {
                eVar.onCancel();
            }
        }
    }
}
