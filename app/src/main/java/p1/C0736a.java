package p1;

import com.samsung.android.knox.ex.KnoxContract;
import com.samsung.android.knox.ucm.core.UniversalCredentialUtil;
import java.util.Collections;
import java.util.HashMap;
import q2.C0789d;
import q2.EnumC0786a;
import q2.EnumC0788c;

/* renamed from: p1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0736a implements d2.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0736a f8344a = new C0736a();

    /* renamed from: b, reason: collision with root package name */
    public static final d2.c f8345b;

    /* renamed from: c, reason: collision with root package name */
    public static final d2.c f8346c;

    /* renamed from: d, reason: collision with root package name */
    public static final d2.c f8347d;

    /* renamed from: e, reason: collision with root package name */
    public static final d2.c f8348e;
    public static final d2.c f;

    /* renamed from: g, reason: collision with root package name */
    public static final d2.c f8349g;

    /* renamed from: h, reason: collision with root package name */
    public static final d2.c f8350h;

    /* renamed from: i, reason: collision with root package name */
    public static final d2.c f8351i;

    /* renamed from: j, reason: collision with root package name */
    public static final d2.c f8352j;

    /* renamed from: k, reason: collision with root package name */
    public static final d2.c f8353k;

    /* renamed from: l, reason: collision with root package name */
    public static final d2.c f8354l;

    /* renamed from: m, reason: collision with root package name */
    public static final d2.c f8355m;
    public static final d2.c n;

    /* renamed from: o, reason: collision with root package name */
    public static final d2.c f8356o;

    /* renamed from: p, reason: collision with root package name */
    public static final d2.c f8357p;

    static {
        i iVar = new i(1);
        HashMap map = new HashMap();
        map.put(m.class, iVar);
        f8345b = new d2.c("projectNumber", Collections.unmodifiableMap(new HashMap(map)));
        i iVar2 = new i(2);
        HashMap map2 = new HashMap();
        map2.put(m.class, iVar2);
        f8346c = new d2.c("messageId", Collections.unmodifiableMap(new HashMap(map2)));
        i iVar3 = new i(3);
        HashMap map3 = new HashMap();
        map3.put(m.class, iVar3);
        f8347d = new d2.c("instanceId", Collections.unmodifiableMap(new HashMap(map3)));
        i iVar4 = new i(4);
        HashMap map4 = new HashMap();
        map4.put(m.class, iVar4);
        f8348e = new d2.c("messageType", Collections.unmodifiableMap(new HashMap(map4)));
        i iVar5 = new i(5);
        HashMap map5 = new HashMap();
        map5.put(m.class, iVar5);
        f = new d2.c("sdkPlatform", Collections.unmodifiableMap(new HashMap(map5)));
        i iVar6 = new i(6);
        HashMap map6 = new HashMap();
        map6.put(m.class, iVar6);
        f8349g = new d2.c(UniversalCredentialUtil.AGENT_PACKAGENAME, Collections.unmodifiableMap(new HashMap(map6)));
        i iVar7 = new i(7);
        HashMap map7 = new HashMap();
        map7.put(m.class, iVar7);
        f8350h = new d2.c("collapseKey", Collections.unmodifiableMap(new HashMap(map7)));
        i iVar8 = new i(8);
        HashMap map8 = new HashMap();
        map8.put(m.class, iVar8);
        f8351i = new d2.c("priority", Collections.unmodifiableMap(new HashMap(map8)));
        i iVar9 = new i(9);
        HashMap map9 = new HashMap();
        map9.put(m.class, iVar9);
        f8352j = new d2.c("ttl", Collections.unmodifiableMap(new HashMap(map9)));
        i iVar10 = new i(10);
        HashMap map10 = new HashMap();
        map10.put(m.class, iVar10);
        f8353k = new d2.c("topic", Collections.unmodifiableMap(new HashMap(map10)));
        i iVar11 = new i(11);
        HashMap map11 = new HashMap();
        map11.put(m.class, iVar11);
        f8354l = new d2.c("bulkId", Collections.unmodifiableMap(new HashMap(map11)));
        i iVar12 = new i(12);
        HashMap map12 = new HashMap();
        map12.put(m.class, iVar12);
        f8355m = new d2.c(KnoxContract.Config.Settings.PARAM_HWKEY_ACTIVITY_EVENT, Collections.unmodifiableMap(new HashMap(map12)));
        i iVar13 = new i(13);
        HashMap map13 = new HashMap();
        map13.put(m.class, iVar13);
        n = new d2.c("analyticsLabel", Collections.unmodifiableMap(new HashMap(map13)));
        i iVar14 = new i(14);
        HashMap map14 = new HashMap();
        map14.put(m.class, iVar14);
        f8356o = new d2.c("campaignId", Collections.unmodifiableMap(new HashMap(map14)));
        i iVar15 = new i(15);
        HashMap map15 = new HashMap();
        map15.put(m.class, iVar15);
        f8357p = new d2.c("composerLabel", Collections.unmodifiableMap(new HashMap(map15)));
    }

    @Override // d2.InterfaceC0392a
    public final void a(Object obj, Object obj2) {
        C0789d c0789d = (C0789d) obj;
        d2.e eVar = (d2.e) obj2;
        eVar.c(f8345b, c0789d.f8454a);
        eVar.e(f8346c, c0789d.f8455b);
        eVar.e(f8347d, c0789d.f8456c);
        eVar.e(f8348e, c0789d.f8457d);
        eVar.e(f, EnumC0788c.ANDROID);
        eVar.e(f8349g, c0789d.f8458e);
        eVar.e(f8350h, c0789d.f);
        eVar.d(f8351i, 0);
        eVar.d(f8352j, c0789d.f8459g);
        eVar.e(f8353k, c0789d.f8460h);
        eVar.c(f8354l, 0L);
        eVar.e(f8355m, EnumC0786a.MESSAGE_DELIVERED);
        eVar.e(n, c0789d.f8461i);
        eVar.c(f8356o, 0L);
        eVar.e(f8357p, c0789d.f8462j);
    }
}
