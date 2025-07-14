package f2;

import d2.f;
import d2.g;
import e2.InterfaceC0416a;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d implements InterfaceC0416a {
    public static final b f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f6718g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6720a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6721b;

    /* renamed from: c, reason: collision with root package name */
    public final C0444a f6722c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6723d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0444a f6717e = new C0444a();

    /* renamed from: h, reason: collision with root package name */
    public static final c f6719h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [f2.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [f2.b] */
    static {
        final int i5 = 0;
        f = new f() { // from class: f2.b
            @Override // d2.InterfaceC0392a
            public final void a(Object obj, Object obj2) {
                switch (i5) {
                    case 0:
                        ((g) obj2).a((String) obj);
                        break;
                    default:
                        ((g) obj2).b(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i6 = 1;
        f6718g = new f() { // from class: f2.b
            @Override // d2.InterfaceC0392a
            public final void a(Object obj, Object obj2) {
                switch (i6) {
                    case 0:
                        ((g) obj2).a((String) obj);
                        break;
                    default:
                        ((g) obj2).b(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap map = new HashMap();
        this.f6720a = map;
        HashMap map2 = new HashMap();
        this.f6721b = map2;
        this.f6722c = f6717e;
        this.f6723d = false;
        map2.put(String.class, f);
        map.remove(String.class);
        map2.put(Boolean.class, f6718g);
        map.remove(Boolean.class);
        map2.put(Date.class, f6719h);
        map.remove(Date.class);
    }

    public final InterfaceC0416a a(Class cls, d2.d dVar) {
        this.f6720a.put(cls, dVar);
        this.f6721b.remove(cls);
        return this;
    }
}
