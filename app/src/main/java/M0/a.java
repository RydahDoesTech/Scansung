package M0;

/* loaded from: classes.dex */
public final class a implements N2.a {
    public static final Object f = new Object();

    /* renamed from: d, reason: collision with root package name */
    public volatile b f1808d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1809e;

    public static N2.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f1809e = f;
        aVar.f1808d = bVar;
        return aVar;
    }

    @Override // N2.a
    public final Object get() {
        Object obj = this.f1809e;
        Object obj2 = f;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f1809e;
                    if (obj == obj2) {
                        obj = this.f1808d.get();
                        Object obj3 = this.f1809e;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f1809e = obj;
                        this.f1808d = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
