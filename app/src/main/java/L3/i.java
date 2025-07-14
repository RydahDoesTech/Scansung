package L3;

import I3.C0019a;
import O3.AbstractC0073e;
import O3.AbstractC0079k;
import O3.AbstractC0084p;
import O3.C0072d;
import O3.C0074f;
import O3.C0086s;
import O3.w;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends AbstractC0084p {

    /* renamed from: p, reason: collision with root package name */
    public static final i f1777p;

    /* renamed from: q, reason: collision with root package name */
    public static final C0019a f1778q = new C0019a(28);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0073e f1779d;

    /* renamed from: e, reason: collision with root package name */
    public int f1780e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f1781g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1782h;

    /* renamed from: i, reason: collision with root package name */
    public h f1783i;

    /* renamed from: j, reason: collision with root package name */
    public List f1784j;

    /* renamed from: k, reason: collision with root package name */
    public int f1785k;

    /* renamed from: l, reason: collision with root package name */
    public List f1786l;

    /* renamed from: m, reason: collision with root package name */
    public int f1787m;
    public byte n;

    /* renamed from: o, reason: collision with root package name */
    public int f1788o;

    static {
        i iVar = new i();
        f1777p = iVar;
        iVar.f = 1;
        iVar.f1781g = 0;
        iVar.f1782h = "";
        iVar.f1783i = h.NONE;
        iVar.f1784j = Collections.emptyList();
        iVar.f1786l = Collections.emptyList();
    }

    public i() {
        this.f1785k = -1;
        this.f1787m = -1;
        this.n = (byte) -1;
        this.f1788o = -1;
        this.f1779d = AbstractC0073e.f2065d;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.n;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.n = (byte) 1;
        return true;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        AbstractC0073e wVar;
        int i5 = this.f1788o;
        if (i5 != -1) {
            return i5;
        }
        int iB = (this.f1780e & 1) == 1 ? A1.j.b(1, this.f) : 0;
        if ((this.f1780e & 2) == 2) {
            iB += A1.j.b(2, this.f1781g);
        }
        if ((this.f1780e & 8) == 8) {
            iB += A1.j.a(3, this.f1783i.f1776d);
        }
        int iC = 0;
        for (int i6 = 0; i6 < this.f1784j.size(); i6++) {
            iC += A1.j.c(((Integer) this.f1784j.get(i6)).intValue());
        }
        int iC2 = iB + iC;
        if (!this.f1784j.isEmpty()) {
            iC2 = iC2 + 1 + A1.j.c(iC);
        }
        this.f1785k = iC;
        int iC3 = 0;
        for (int i7 = 0; i7 < this.f1786l.size(); i7++) {
            iC3 += A1.j.c(((Integer) this.f1786l.get(i7)).intValue());
        }
        int size = iC2 + iC3;
        if (!this.f1786l.isEmpty()) {
            size = size + 1 + A1.j.c(iC3);
        }
        this.f1787m = iC3;
        if ((this.f1780e & 4) == 4) {
            Object obj = this.f1782h;
            if (obj instanceof String) {
                try {
                    wVar = new w(((String) obj).getBytes("UTF-8"));
                    this.f1782h = wVar;
                } catch (UnsupportedEncodingException e5) {
                    throw new RuntimeException("UTF-8 not supported?", e5);
                }
            } else {
                wVar = (AbstractC0073e) obj;
            }
            size += wVar.size() + A1.j.f(wVar.size()) + A1.j.h(6);
        }
        int size2 = this.f1779d.size() + size;
        this.f1788o = size2;
        return size2;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        return g.g();
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        g gVarG = g.g();
        gVarG.h(this);
        return gVarG;
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        AbstractC0073e wVar;
        c();
        if ((this.f1780e & 1) == 1) {
            jVar.m(1, this.f);
        }
        if ((this.f1780e & 2) == 2) {
            jVar.m(2, this.f1781g);
        }
        if ((this.f1780e & 8) == 8) {
            jVar.l(3, this.f1783i.f1776d);
        }
        if (this.f1784j.size() > 0) {
            jVar.v(34);
            jVar.v(this.f1785k);
        }
        for (int i5 = 0; i5 < this.f1784j.size(); i5++) {
            jVar.n(((Integer) this.f1784j.get(i5)).intValue());
        }
        if (this.f1786l.size() > 0) {
            jVar.v(42);
            jVar.v(this.f1787m);
        }
        for (int i6 = 0; i6 < this.f1786l.size(); i6++) {
            jVar.n(((Integer) this.f1786l.get(i6)).intValue());
        }
        if ((this.f1780e & 4) == 4) {
            Object obj = this.f1782h;
            if (obj instanceof String) {
                try {
                    wVar = new w(((String) obj).getBytes("UTF-8"));
                    this.f1782h = wVar;
                } catch (UnsupportedEncodingException e5) {
                    throw new RuntimeException("UTF-8 not supported?", e5);
                }
            } else {
                wVar = (AbstractC0073e) obj;
            }
            jVar.x(6, 2);
            jVar.v(wVar.size());
            jVar.r(wVar);
        }
        jVar.r(this.f1779d);
    }

    public i(C0074f c0074f) {
        h hVar;
        this.f1785k = -1;
        this.f1787m = -1;
        this.n = (byte) -1;
        this.f1788o = -1;
        this.f = 1;
        boolean z4 = false;
        this.f1781g = 0;
        this.f1782h = "";
        h hVar2 = h.NONE;
        this.f1783i = hVar2;
        this.f1784j = Collections.emptyList();
        this.f1786l = Collections.emptyList();
        C0072d c0072d = new C0072d();
        A1.j jVarJ = A1.j.j(c0072d, 1);
        int i5 = 0;
        while (!z4) {
            try {
                try {
                    int iN = c0074f.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f1780e |= 1;
                            this.f = c0074f.k();
                        } else if (iN == 16) {
                            this.f1780e |= 2;
                            this.f1781g = c0074f.k();
                        } else if (iN == 24) {
                            int iK = c0074f.k();
                            if (iK == 0) {
                                hVar = hVar2;
                            } else if (iK != 1) {
                                hVar = iK != 2 ? null : h.DESC_TO_CLASS_ID;
                            } else {
                                hVar = h.INTERNAL_TO_CLASS_ID;
                            }
                            if (hVar == null) {
                                jVarJ.v(iN);
                                jVarJ.v(iK);
                            } else {
                                this.f1780e |= 8;
                                this.f1783i = hVar;
                            }
                        } else if (iN == 32) {
                            if ((i5 & 16) != 16) {
                                this.f1784j = new ArrayList();
                                i5 |= 16;
                            }
                            this.f1784j.add(Integer.valueOf(c0074f.k()));
                        } else if (iN == 34) {
                            int iD = c0074f.d(c0074f.k());
                            if ((i5 & 16) != 16 && c0074f.b() > 0) {
                                this.f1784j = new ArrayList();
                                i5 |= 16;
                            }
                            while (c0074f.b() > 0) {
                                this.f1784j.add(Integer.valueOf(c0074f.k()));
                            }
                            c0074f.c(iD);
                        } else if (iN == 40) {
                            if ((i5 & 32) != 32) {
                                this.f1786l = new ArrayList();
                                i5 |= 32;
                            }
                            this.f1786l.add(Integer.valueOf(c0074f.k()));
                        } else if (iN == 42) {
                            int iD2 = c0074f.d(c0074f.k());
                            if ((i5 & 32) != 32 && c0074f.b() > 0) {
                                this.f1786l = new ArrayList();
                                i5 |= 32;
                            }
                            while (c0074f.b() > 0) {
                                this.f1786l.add(Integer.valueOf(c0074f.k()));
                            }
                            c0074f.c(iD2);
                        } else if (iN != 50) {
                            if (!c0074f.q(iN, jVarJ)) {
                            }
                        } else {
                            w wVarE = c0074f.e();
                            this.f1780e |= 4;
                            this.f1782h = wVarE;
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
                if ((i5 & 16) == 16) {
                    this.f1784j = Collections.unmodifiableList(this.f1784j);
                }
                if ((i5 & 32) == 32) {
                    this.f1786l = Collections.unmodifiableList(this.f1786l);
                }
                try {
                    jVarJ.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1779d = c0072d.l();
                    throw th2;
                }
                this.f1779d = c0072d.l();
                throw th;
            }
        }
        if ((i5 & 16) == 16) {
            this.f1784j = Collections.unmodifiableList(this.f1784j);
        }
        if ((i5 & 32) == 32) {
            this.f1786l = Collections.unmodifiableList(this.f1786l);
        }
        try {
            jVarJ.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1779d = c0072d.l();
            throw th3;
        }
        this.f1779d = c0072d.l();
    }

    public i(g gVar) {
        this.f1785k = -1;
        this.f1787m = -1;
        this.n = (byte) -1;
        this.f1788o = -1;
        this.f1779d = gVar.f2081d;
    }
}
