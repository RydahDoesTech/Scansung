package k4;

/* loaded from: classes.dex */
public final class y extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final y f8000d = new y("must have no value parameters", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final y f8001e = new y("must have a single value parameter", 1);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8002c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(String str, int i5) {
        super(str, 1);
        this.f8002c = i5;
    }

    @Override // k4.e
    public final boolean a(A3.g gVar) {
        switch (this.f8002c) {
            case 0:
                return gVar.v0().isEmpty();
            default:
                return gVar.v0().size() == 1;
        }
    }
}
