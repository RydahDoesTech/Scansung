package P3;

import P2.w;
import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import s3.C0843T;

/* loaded from: classes.dex */
public final class d extends b3.k implements InterfaceC0107b {

    /* renamed from: e, reason: collision with root package name */
    public static final d f2177e = new d(1, 0);
    public static final d f = new d(1, 1);

    /* renamed from: g, reason: collision with root package name */
    public static final d f2178g = new d(1, 2);

    /* renamed from: h, reason: collision with root package name */
    public static final d f2179h = new d(1, 3);

    /* renamed from: i, reason: collision with root package name */
    public static final d f2180i = new d(1, 4);

    /* renamed from: j, reason: collision with root package name */
    public static final d f2181j = new d(1, 5);

    /* renamed from: k, reason: collision with root package name */
    public static final d f2182k = new d(1, 6);

    /* renamed from: l, reason: collision with root package name */
    public static final d f2183l = new d(1, 7);

    /* renamed from: m, reason: collision with root package name */
    public static final d f2184m = new d(1, 8);
    public static final d n = new d(1, 9);

    /* renamed from: o, reason: collision with root package name */
    public static final d f2185o = new d(1, 10);

    /* renamed from: p, reason: collision with root package name */
    public static final d f2186p = new d(1, 11);

    /* renamed from: q, reason: collision with root package name */
    public static final d f2187q = new d(1, 12);

    /* renamed from: r, reason: collision with root package name */
    public static final d f2188r = new d(1, 13);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2189d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i5, int i6) {
        super(i5);
        this.f2189d = i6;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        switch (this.f2189d) {
            case 0:
                i iVar = (i) obj;
                AbstractC0219i.e("$this$withOptions", iVar);
                iVar.f();
                iVar.k(w.f2165d);
                return O2.l.f2016a;
            case 1:
                i iVar2 = (i) obj;
                AbstractC0219i.e("$this$withOptions", iVar2);
                iVar2.f();
                iVar2.k(w.f2165d);
                iVar2.j();
                return O2.l.f2016a;
            case 2:
                i iVar3 = (i) obj;
                AbstractC0219i.e("$this$withOptions", iVar3);
                iVar3.f();
                return O2.l.f2016a;
            case 3:
                i iVar4 = (i) obj;
                AbstractC0219i.e("$this$withOptions", iVar4);
                iVar4.k(w.f2165d);
                iVar4.b(b.f2174c);
                iVar4.g(o.f2267e);
                return O2.l.f2016a;
            case 4:
                i iVar5 = (i) obj;
                AbstractC0219i.e("$this$withOptions", iVar5);
                iVar5.c();
                iVar5.b(b.f2173b);
                iVar5.k(h.f);
                return O2.l.f2016a;
            case 5:
                i iVar6 = (i) obj;
                AbstractC0219i.e("$this$withOptions", iVar6);
                iVar6.k(h.f2198e);
                return O2.l.f2016a;
            case 6:
                i iVar7 = (i) obj;
                AbstractC0219i.e("$this$withOptions", iVar7);
                iVar7.k(h.f);
                return O2.l.f2016a;
            case 7:
                i iVar8 = (i) obj;
                AbstractC0219i.e("$this$withOptions", iVar8);
                iVar8.i();
                iVar8.k(h.f);
                return O2.l.f2016a;
            case 8:
                i iVar9 = (i) obj;
                AbstractC0219i.e("$this$withOptions", iVar9);
                iVar9.f();
                iVar9.k(w.f2165d);
                iVar9.b(b.f2174c);
                iVar9.h();
                iVar9.g(o.f);
                iVar9.a();
                iVar9.d();
                iVar9.j();
                iVar9.e();
                return O2.l.f2016a;
            case 9:
                i iVar10 = (i) obj;
                AbstractC0219i.e("$this$withOptions", iVar10);
                iVar10.b(b.f2174c);
                iVar10.g(o.f2267e);
                return O2.l.f2016a;
            case 10:
                return "";
            case 11:
                AbstractC0438v abstractC0438v = (AbstractC0438v) obj;
                AbstractC0219i.e("it", abstractC0438v);
                return abstractC0438v;
            case 12:
                AbstractC0219i.e("it", (C0843T) obj);
                return "...";
            default:
                AbstractC0438v abstractC0438v2 = (AbstractC0438v) obj;
                AbstractC0219i.e("it", abstractC0438v2);
                return abstractC0438v2;
        }
    }
}
