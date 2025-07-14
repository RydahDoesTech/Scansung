package a4;

import O3.C0077i;
import b3.AbstractC0219i;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;
import e4.C0429l;
import java.util.List;
import java.util.Set;
import p3.InterfaceC0742D;
import p3.InterfaceC0746H;
import p3.InterfaceC0761e;
import p3.InterfaceC0781y;
import r3.C0815a;
import r3.InterfaceC0816b;
import r3.InterfaceC0818d;
import x3.C0914a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final d4.o f3037a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0781y f3038b;

    /* renamed from: c, reason: collision with root package name */
    public final j f3039c;

    /* renamed from: d, reason: collision with root package name */
    public final e f3040d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0110a f3041e;
    public final InterfaceC0746H f;

    /* renamed from: g, reason: collision with root package name */
    public final j f3042g;

    /* renamed from: h, reason: collision with root package name */
    public final l f3043h;

    /* renamed from: i, reason: collision with root package name */
    public final C0914a f3044i;

    /* renamed from: j, reason: collision with root package name */
    public final m f3045j;

    /* renamed from: k, reason: collision with root package name */
    public final Iterable f3046k;

    /* renamed from: l, reason: collision with root package name */
    public final com.google.firebase.messaging.q f3047l;

    /* renamed from: m, reason: collision with root package name */
    public final j f3048m;
    public final InterfaceC0816b n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0818d f3049o;

    /* renamed from: p, reason: collision with root package name */
    public final C0077i f3050p;

    /* renamed from: q, reason: collision with root package name */
    public final f4.k f3051q;

    /* renamed from: r, reason: collision with root package name */
    public final C0815a f3052r;

    /* renamed from: s, reason: collision with root package name */
    public final List f3053s;

    /* renamed from: t, reason: collision with root package name */
    public final g f3054t;

    public i(d4.o oVar, InterfaceC0781y interfaceC0781y, e eVar, InterfaceC0110a interfaceC0110a, InterfaceC0746H interfaceC0746H, l lVar, m mVar, Iterable iterable, com.google.firebase.messaging.q qVar, InterfaceC0816b interfaceC0816b, InterfaceC0818d interfaceC0818d, C0077i c0077i, f4.l lVar2, b4.d dVar, List list, int i5) {
        f4.l lVar3;
        j jVar = j.f3055b;
        j jVar2 = j.f3057d;
        C0914a c0914a = C0914a.f9314a;
        j jVar3 = h.f3036a;
        if ((i5 & NetworkAnalyticsConstants.DataPoints.FLAG_DNS_UID) != 0) {
            f4.k.f6754b.getClass();
            lVar3 = f4.j.f6753b;
        } else {
            lVar3 = lVar2;
        }
        C0815a c0815a = C0815a.f8583e;
        List listN = (i5 & NetworkAnalyticsConstants.DataPoints.FLAG_INTERFACE_NAME) != 0 ? g3.y.N(C0429l.f6688a) : list;
        AbstractC0219i.e("storageManager", oVar);
        AbstractC0219i.e("moduleDescriptor", interfaceC0781y);
        AbstractC0219i.e("fictitiousClassDescriptorFactories", iterable);
        AbstractC0219i.e("additionalClassPartsProvider", interfaceC0816b);
        AbstractC0219i.e("platformDependentDeclarationFilter", interfaceC0818d);
        AbstractC0219i.e("extensionRegistryLite", c0077i);
        AbstractC0219i.e("kotlinTypeChecker", lVar3);
        AbstractC0219i.e("typeAttributeTranslators", listN);
        this.f3037a = oVar;
        this.f3038b = interfaceC0781y;
        this.f3039c = jVar;
        this.f3040d = eVar;
        this.f3041e = interfaceC0110a;
        this.f = interfaceC0746H;
        this.f3042g = jVar2;
        this.f3043h = lVar;
        this.f3044i = c0914a;
        this.f3045j = mVar;
        this.f3046k = iterable;
        this.f3047l = qVar;
        this.f3048m = jVar3;
        this.n = interfaceC0816b;
        this.f3049o = interfaceC0818d;
        this.f3050p = c0077i;
        this.f3051q = lVar3;
        this.f3052r = c0815a;
        this.f3053s = listN;
        this.f3054t = new g(this);
    }

    public final k a(InterfaceC0742D interfaceC0742D, K3.f fVar, K3.g gVar, K3.h hVar, K3.a aVar, G3.h hVar2) {
        AbstractC0219i.e("descriptor", interfaceC0742D);
        AbstractC0219i.e("nameResolver", fVar);
        AbstractC0219i.e("metadataVersion", aVar);
        return new k(this, fVar, interfaceC0742D, gVar, hVar, aVar, hVar2, null, P2.u.f2163d);
    }

    public final InterfaceC0761e b(N3.b bVar) {
        AbstractC0219i.e("classId", bVar);
        Set set = g.f3033c;
        return this.f3054t.a(bVar, null);
    }
}
