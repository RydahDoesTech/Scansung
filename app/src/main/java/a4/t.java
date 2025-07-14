package a4;

import I3.C0028j;
import I3.EnumC0027i;
import b3.AbstractC0219i;
import e1.AbstractC0415a;
import p3.InterfaceC0752N;

/* loaded from: classes.dex */
public final class t extends v {

    /* renamed from: e, reason: collision with root package name */
    public final C0028j f3087e;
    public final t f;

    /* renamed from: g, reason: collision with root package name */
    public final N3.b f3088g;

    /* renamed from: h, reason: collision with root package name */
    public final EnumC0027i f3089h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3090i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(C0028j c0028j, K3.f fVar, K3.g gVar, InterfaceC0752N interfaceC0752N, t tVar) {
        super(fVar, gVar, interfaceC0752N);
        AbstractC0219i.e("classProto", c0028j);
        AbstractC0219i.e("nameResolver", fVar);
        AbstractC0219i.e("typeTable", gVar);
        this.f3087e = c0028j;
        this.f = tVar;
        this.f3088g = AbstractC0415a.m(fVar, c0028j.f1289h);
        EnumC0027i enumC0027i = (EnumC0027i) K3.e.f.c(c0028j.f1288g);
        this.f3089h = enumC0027i == null ? EnumC0027i.CLASS : enumC0027i;
        this.f3090i = K3.e.f1677g.c(c0028j.f1288g).booleanValue();
    }

    @Override // a4.v
    public final N3.c j() {
        return this.f3088g.b();
    }
}
