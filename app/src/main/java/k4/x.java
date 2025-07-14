package k4;

/* loaded from: classes.dex */
public final class x extends n {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7998c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final int f7999d;

    public x(int i5) {
        StringBuilder sb = new StringBuilder("must have at least ");
        sb.append(i5);
        sb.append(" value parameter");
        sb.append(i5 > 1 ? "s" : "");
        super(sb.toString(), 1);
        this.f7999d = i5;
    }

    @Override // k4.e
    public final boolean a(A3.g gVar) {
        switch (this.f7998c) {
            case 0:
                if (gVar.v0().size() >= this.f7999d) {
                }
                break;
            default:
                if (gVar.v0().size() == this.f7999d) {
                }
                break;
        }
        return false;
    }

    public x() {
        super("must have exactly 2 value parameters", 1);
        this.f7999d = 2;
    }
}
