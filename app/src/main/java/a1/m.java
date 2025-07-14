package a1;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0096d f2964e;

    public /* synthetic */ m(C0096d c0096d, int i5) {
        this.f2963d = i5;
        this.f2964e = c0096d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2963d) {
            case 0:
                this.f2964e.d();
                break;
            default:
                this.f2964e.e();
                break;
        }
    }
}
