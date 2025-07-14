package H3;

import G3.m;
import G3.n;

/* loaded from: classes.dex */
public final class e implements m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f832e;

    public /* synthetic */ e(g gVar, int i5) {
        this.f831d = i5;
        this.f832e = gVar;
    }

    private final void a(N3.f fVar, Object obj) {
    }

    private final void b(N3.f fVar, S3.f fVar2) {
    }

    private final void c(N3.f fVar, S3.f fVar2) {
    }

    private final void d(N3.f fVar, S3.f fVar2) {
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h(N3.f fVar, N3.b bVar, N3.f fVar2) {
    }

    private final void i(N3.f fVar, N3.b bVar, N3.f fVar2) {
    }

    private final void j(N3.f fVar, N3.b bVar, N3.f fVar2) {
    }

    @Override // G3.m
    public final void m() {
        int i5 = this.f831d;
    }

    @Override // G3.m
    public final void n(N3.f fVar, Object obj) {
        switch (this.f831d) {
            case 0:
                String strB = fVar.b();
                boolean zEquals = "k".equals(strB);
                g gVar = this.f832e;
                if (!zEquals) {
                    if (!"mv".equals(strB)) {
                        if (!"xs".equals(strB)) {
                            if (!"xi".equals(strB)) {
                                if ("pn".equals(strB) && (obj instanceof String) && !((String) obj).isEmpty()) {
                                    gVar.getClass();
                                    break;
                                }
                            } else if (obj instanceof Integer) {
                                gVar.f838c = ((Integer) obj).intValue();
                                break;
                            }
                        } else if (obj instanceof String) {
                            String str = (String) obj;
                            if (!str.isEmpty()) {
                                gVar.f837b = str;
                                break;
                            }
                        }
                    } else if (obj instanceof int[]) {
                        gVar.f836a = (int[]) obj;
                        break;
                    }
                } else if (obj instanceof Integer) {
                    a aVar = (a) a.f814e.get((Integer) obj);
                    if (aVar == null) {
                        aVar = a.UNKNOWN;
                    }
                    gVar.f841g = aVar;
                    break;
                }
                break;
            case 1:
                break;
            default:
                String strB2 = fVar.b();
                boolean zEquals2 = "version".equals(strB2);
                g gVar2 = this.f832e;
                if (!zEquals2) {
                    if ("multifileClassName".equals(strB2)) {
                        gVar2.f837b = obj instanceof String ? (String) obj : null;
                        break;
                    }
                } else if (obj instanceof int[]) {
                    gVar2.f836a = (int[]) obj;
                    break;
                }
                break;
        }
    }

    @Override // G3.m
    public final void o(N3.f fVar, S3.f fVar2) {
        int i5 = this.f831d;
    }

    @Override // G3.m
    public final m p(N3.b bVar, N3.f fVar) {
        switch (this.f831d) {
        }
        return null;
    }

    @Override // G3.m
    public final void q(N3.f fVar, N3.b bVar, N3.f fVar2) {
        int i5 = this.f831d;
    }

    @Override // G3.m
    public final n r(N3.f fVar) {
        switch (this.f831d) {
            case 0:
                String strB = fVar.b();
                if ("d1".equals(strB)) {
                    return new d(this, 0);
                }
                if ("d2".equals(strB)) {
                    return new d(this, 1);
                }
                return null;
            case 1:
                if ("b".equals(fVar.b())) {
                    return new d(this, 2);
                }
                return null;
            default:
                String strB2 = fVar.b();
                if ("data".equals(strB2) || "filePartClassNames".equals(strB2)) {
                    return new f(this, 0);
                }
                if ("strings".equals(strB2)) {
                    return new f(this, 1);
                }
                return null;
        }
    }
}
