package L3;

import I3.C0019a;
import O3.AbstractC0073e;
import O3.AbstractC0079k;
import O3.AbstractC0084p;
import O3.C0072d;
import O3.C0074f;
import O3.C0077i;
import O3.C0086s;
import java.io.IOException;

/* loaded from: classes.dex */
public final class e extends AbstractC0084p {

    /* renamed from: m, reason: collision with root package name */
    public static final e f1756m;
    public static final C0019a n = new C0019a(26);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0073e f1757d;

    /* renamed from: e, reason: collision with root package name */
    public int f1758e;
    public b f;

    /* renamed from: g, reason: collision with root package name */
    public c f1759g;

    /* renamed from: h, reason: collision with root package name */
    public c f1760h;

    /* renamed from: i, reason: collision with root package name */
    public c f1761i;

    /* renamed from: j, reason: collision with root package name */
    public c f1762j;

    /* renamed from: k, reason: collision with root package name */
    public byte f1763k;

    /* renamed from: l, reason: collision with root package name */
    public int f1764l;

    static {
        e eVar = new e();
        f1756m = eVar;
        eVar.f = b.f1737j;
        c cVar = c.f1744j;
        eVar.f1759g = cVar;
        eVar.f1760h = cVar;
        eVar.f1761i = cVar;
        eVar.f1762j = cVar;
    }

    public e() {
        this.f1763k = (byte) -1;
        this.f1764l = -1;
        this.f1757d = AbstractC0073e.f2065d;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.f1763k;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.f1763k = (byte) 1;
        return true;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.f1764l;
        if (i5 != -1) {
            return i5;
        }
        int iD = (this.f1758e & 1) == 1 ? A1.j.d(1, this.f) : 0;
        if ((this.f1758e & 2) == 2) {
            iD += A1.j.d(2, this.f1759g);
        }
        if ((this.f1758e & 4) == 4) {
            iD += A1.j.d(3, this.f1760h);
        }
        if ((this.f1758e & 8) == 8) {
            iD += A1.j.d(4, this.f1761i);
        }
        if ((this.f1758e & 16) == 16) {
            iD += A1.j.d(5, this.f1762j);
        }
        int size = this.f1757d.size() + iD;
        this.f1764l = size;
        return size;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        return d.g();
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        d dVarG = d.g();
        dVarG.h(this);
        return dVarG;
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        if ((this.f1758e & 1) == 1) {
            jVar.o(1, this.f);
        }
        if ((this.f1758e & 2) == 2) {
            jVar.o(2, this.f1759g);
        }
        if ((this.f1758e & 4) == 4) {
            jVar.o(3, this.f1760h);
        }
        if ((this.f1758e & 8) == 8) {
            jVar.o(4, this.f1761i);
        }
        if ((this.f1758e & 16) == 16) {
            jVar.o(5, this.f1762j);
        }
        jVar.r(this.f1757d);
    }

    public e(C0074f c0074f, C0077i c0077i) {
        this.f1763k = (byte) -1;
        this.f1764l = -1;
        this.f = b.f1737j;
        c cVar = c.f1744j;
        this.f1759g = cVar;
        this.f1760h = cVar;
        this.f1761i = cVar;
        this.f1762j = cVar;
        C0072d c0072d = new C0072d();
        A1.j jVarJ = A1.j.j(c0072d, 1);
        boolean z4 = false;
        while (!z4) {
            try {
                try {
                    int iN = c0074f.n();
                    if (iN != 0) {
                        a aVarI = null;
                        if (iN == 10) {
                            if ((this.f1758e & 1) == 1) {
                                b bVar = this.f;
                                bVar.getClass();
                                aVarI = new a(0);
                                aVarI.h(bVar);
                            }
                            b bVar2 = (b) c0074f.g(b.f1738k, c0077i);
                            this.f = bVar2;
                            if (aVarI != null) {
                                aVarI.h(bVar2);
                                this.f = aVarI.f();
                            }
                            this.f1758e |= 1;
                        } else if (iN == 18) {
                            if ((this.f1758e & 2) == 2) {
                                c cVar2 = this.f1759g;
                                cVar2.getClass();
                                aVarI = c.i(cVar2);
                            }
                            c cVar3 = (c) c0074f.g(c.f1745k, c0077i);
                            this.f1759g = cVar3;
                            if (aVarI != null) {
                                aVarI.i(cVar3);
                                this.f1759g = aVarI.g();
                            }
                            this.f1758e |= 2;
                        } else if (iN == 26) {
                            if ((this.f1758e & 4) == 4) {
                                c cVar4 = this.f1760h;
                                cVar4.getClass();
                                aVarI = c.i(cVar4);
                            }
                            c cVar5 = (c) c0074f.g(c.f1745k, c0077i);
                            this.f1760h = cVar5;
                            if (aVarI != null) {
                                aVarI.i(cVar5);
                                this.f1760h = aVarI.g();
                            }
                            this.f1758e |= 4;
                        } else if (iN == 34) {
                            if ((this.f1758e & 8) == 8) {
                                c cVar6 = this.f1761i;
                                cVar6.getClass();
                                aVarI = c.i(cVar6);
                            }
                            c cVar7 = (c) c0074f.g(c.f1745k, c0077i);
                            this.f1761i = cVar7;
                            if (aVarI != null) {
                                aVarI.i(cVar7);
                                this.f1761i = aVarI.g();
                            }
                            this.f1758e |= 8;
                        } else if (iN != 42) {
                            if (!c0074f.q(iN, jVarJ)) {
                            }
                        } else {
                            if ((this.f1758e & 16) == 16) {
                                c cVar8 = this.f1762j;
                                cVar8.getClass();
                                aVarI = c.i(cVar8);
                            }
                            c cVar9 = (c) c0074f.g(c.f1745k, c0077i);
                            this.f1762j = cVar9;
                            if (aVarI != null) {
                                aVarI.i(cVar9);
                                this.f1762j = aVarI.g();
                            }
                            this.f1758e |= 16;
                        }
                    }
                    z4 = true;
                } catch (C0086s e5) {
                    e5.f2092d = this;
                    throw e5;
                } catch (IOException e6) {
                    C0086s c0086s = new C0086s(e6.getMessage());
                    c0086s.f2092d = this;
                    throw c0086s;
                }
            } catch (Throwable th) {
                try {
                    jVarJ.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1757d = c0072d.l();
                    throw th2;
                }
                this.f1757d = c0072d.l();
                throw th;
            }
        }
        try {
            jVarJ.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1757d = c0072d.l();
            throw th3;
        }
        this.f1757d = c0072d.l();
    }

    public e(d dVar) {
        this.f1763k = (byte) -1;
        this.f1764l = -1;
        this.f1757d = dVar.f2081d;
    }
}
