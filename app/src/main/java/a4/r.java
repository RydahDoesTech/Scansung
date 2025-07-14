package a4;

import I3.Z;
import O3.AbstractC0081m;
import a3.InterfaceC0106a;

/* loaded from: classes.dex */
public final class r extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f3080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f3081e;
    public final /* synthetic */ AbstractC0081m f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3082g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3083h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Z f3084i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, v vVar, AbstractC0081m abstractC0081m, int i5, int i6, Z z4) {
        super(0);
        this.f3080d = sVar;
        this.f3081e = vVar;
        this.f = abstractC0081m;
        this.f3082g = i5;
        this.f3083h = i6;
        this.f3084i = z4;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        return P2.m.O0(((i) this.f3080d.f3085a.f3058d).f3041e.d(this.f3081e, this.f, this.f3082g, this.f3083h, this.f3084i));
    }
}
