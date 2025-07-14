package k4;

/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final m f7964d = new m("must be a member function", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final m f7965e = new m("must be a member or an extension function", 1);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7966c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(String str, int i5) {
        super(str, 0);
        this.f7966c = i5;
    }

    @Override // k4.e
    public final boolean a(A3.g gVar) {
        switch (this.f7966c) {
            case 0:
                return gVar.f8882m != null;
            default:
                return (gVar.f8882m == null && gVar.f8881l == null) ? false : true;
        }
    }
}
