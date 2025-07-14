package J0;

import com.samsung.android.knox.ex.KnoxContract;
import com.samsung.android.lib.episode.EternalContract;

/* loaded from: classes.dex */
public final class b implements d2.d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1501a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final d2.c f1502b = d2.c.a("sdkVersion");

    /* renamed from: c, reason: collision with root package name */
    public static final d2.c f1503c = d2.c.a("model");

    /* renamed from: d, reason: collision with root package name */
    public static final d2.c f1504d = d2.c.a("hardware");

    /* renamed from: e, reason: collision with root package name */
    public static final d2.c f1505e = d2.c.a(KnoxContract.Config.Device.ID);
    public static final d2.c f = d2.c.a("product");

    /* renamed from: g, reason: collision with root package name */
    public static final d2.c f1506g = d2.c.a("osBuild");

    /* renamed from: h, reason: collision with root package name */
    public static final d2.c f1507h = d2.c.a(EternalContract.EXTRA_MANUFACTURER);

    /* renamed from: i, reason: collision with root package name */
    public static final d2.c f1508i = d2.c.a("fingerprint");

    /* renamed from: j, reason: collision with root package name */
    public static final d2.c f1509j = d2.c.a("locale");

    /* renamed from: k, reason: collision with root package name */
    public static final d2.c f1510k = d2.c.a("country");

    /* renamed from: l, reason: collision with root package name */
    public static final d2.c f1511l = d2.c.a("mccMnc");

    /* renamed from: m, reason: collision with root package name */
    public static final d2.c f1512m = d2.c.a("applicationBuild");

    @Override // d2.InterfaceC0392a
    public final void a(Object obj, Object obj2) {
        d2.e eVar = (d2.e) obj2;
        h hVar = (h) ((a) obj);
        eVar.e(f1502b, hVar.f1535a);
        eVar.e(f1503c, hVar.f1536b);
        eVar.e(f1504d, hVar.f1537c);
        eVar.e(f1505e, hVar.f1538d);
        eVar.e(f, hVar.f1539e);
        eVar.e(f1506g, hVar.f);
        eVar.e(f1507h, hVar.f1540g);
        eVar.e(f1508i, hVar.f1541h);
        eVar.e(f1509j, hVar.f1542i);
        eVar.e(f1510k, hVar.f1543j);
        eVar.e(f1511l, hVar.f1544k);
        eVar.e(f1512m, hVar.f1545l);
    }
}
