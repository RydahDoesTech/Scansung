package P3;

/* loaded from: classes.dex */
public enum a {
    NO_ARGUMENTS((boolean) (0 == true ? 1 : 0), 3),
    /* JADX INFO: Fake field, exist only in values array */
    UNLESS_EMPTY(true ? 1 : 0, 2),
    /* JADX INFO: Fake field, exist only in values array */
    ALWAYS_PARENTHESIZED(true, true);


    /* renamed from: d, reason: collision with root package name */
    public final boolean f2171d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2172e;

    /* synthetic */ a(boolean z4, int i5) {
        this((i5 & 1) != 0 ? false : z4, false);
    }

    a(boolean z4, boolean z5) {
        this.f2171d = z4;
        this.f2172e = z5;
    }
}
