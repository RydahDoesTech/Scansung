package G3;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: k, reason: collision with root package name */
    public static final r f775k = new r(false, false, false, false, false, new r(false, false, false, false, false, null, false, null, null, false, 1023), false, null, null, false, 988);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f776a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f777b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f778c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f779d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f780e;
    public final r f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f781g;

    /* renamed from: h, reason: collision with root package name */
    public final r f782h;

    /* renamed from: i, reason: collision with root package name */
    public final r f783i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f784j;

    public r(boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, r rVar, boolean z9, r rVar2, r rVar3, boolean z10, int i5) {
        z4 = (i5 & 1) != 0 ? true : z4;
        z5 = (i5 & 2) != 0 ? true : z5;
        z6 = (i5 & 4) != 0 ? false : z6;
        z7 = (i5 & 8) != 0 ? false : z7;
        z8 = (i5 & 16) != 0 ? false : z8;
        rVar = (i5 & 32) != 0 ? null : rVar;
        z9 = (i5 & 64) != 0 ? true : z9;
        rVar2 = (i5 & 128) != 0 ? rVar : rVar2;
        rVar3 = (i5 & 256) != 0 ? rVar : rVar3;
        z10 = (i5 & 512) != 0 ? false : z10;
        this.f776a = z4;
        this.f777b = z5;
        this.f778c = z6;
        this.f779d = z7;
        this.f780e = z8;
        this.f = rVar;
        this.f781g = z9;
        this.f782h = rVar2;
        this.f783i = rVar3;
        this.f784j = z10;
    }
}
