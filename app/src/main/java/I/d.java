package I;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: c, reason: collision with root package name */
    public final Object f847c;

    public d(int i5) {
        super(i5);
        this.f847c = new Object();
    }

    @Override // I.c
    public final Object a() {
        Object objA;
        synchronized (this.f847c) {
            objA = super.a();
        }
        return objA;
    }

    @Override // I.c
    public final boolean c(Object obj) {
        boolean zC;
        synchronized (this.f847c) {
            zC = super.c(obj);
        }
        return zC;
    }
}
