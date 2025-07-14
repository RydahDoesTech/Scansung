package I3;

import O3.AbstractC0070b;
import O3.AbstractC0073e;
import O3.AbstractC0079k;
import O3.AbstractC0081m;
import O3.C0072d;
import O3.C0074f;
import O3.C0077i;
import O3.C0086s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: I3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0030l extends AbstractC0081m {

    /* renamed from: l, reason: collision with root package name */
    public static final C0030l f1311l;

    /* renamed from: m, reason: collision with root package name */
    public static final C0019a f1312m = new C0019a(4);

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0073e f1313e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f1314g;

    /* renamed from: h, reason: collision with root package name */
    public List f1315h;

    /* renamed from: i, reason: collision with root package name */
    public List f1316i;

    /* renamed from: j, reason: collision with root package name */
    public byte f1317j;

    /* renamed from: k, reason: collision with root package name */
    public int f1318k;

    static {
        C0030l c0030l = new C0030l();
        f1311l = c0030l;
        c0030l.f1314g = 6;
        c0030l.f1315h = Collections.emptyList();
        c0030l.f1316i = Collections.emptyList();
    }

    public C0030l(C0029k c0029k) {
        super(c0029k);
        this.f1317j = (byte) -1;
        this.f1318k = -1;
        this.f1313e = c0029k.f2081d;
    }

    @Override // O3.x
    public final AbstractC0070b a() {
        return f1311l;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.f1317j;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i5 = 0; i5 < this.f1315h.size(); i5++) {
            if (!((Z) this.f1315h.get(i5)).b()) {
                this.f1317j = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.f1317j = (byte) 1;
            return true;
        }
        this.f1317j = (byte) 0;
        return false;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.f1318k;
        if (i5 != -1) {
            return i5;
        }
        int iB = (this.f & 1) == 1 ? A1.j.b(1, this.f1314g) : 0;
        for (int i6 = 0; i6 < this.f1315h.size(); i6++) {
            iB += A1.j.d(2, (AbstractC0070b) this.f1315h.get(i6));
        }
        int iC = 0;
        for (int i7 = 0; i7 < this.f1316i.size(); i7++) {
            iC += A1.j.c(((Integer) this.f1316i.get(i7)).intValue());
        }
        int size = this.f1313e.size() + j() + (this.f1316i.size() * 2) + iB + iC;
        this.f1318k = size;
        return size;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        return C0029k.h();
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        C0029k c0029kH = C0029k.h();
        c0029kH.i(this);
        return c0029kH;
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        E0.d dVar = new E0.d((AbstractC0081m) this);
        if ((this.f & 1) == 1) {
            jVar.m(1, this.f1314g);
        }
        for (int i5 = 0; i5 < this.f1315h.size(); i5++) {
            jVar.o(2, (AbstractC0070b) this.f1315h.get(i5));
        }
        for (int i6 = 0; i6 < this.f1316i.size(); i6++) {
            jVar.m(31, ((Integer) this.f1316i.get(i6)).intValue());
        }
        dVar.P0(19000, jVar);
        jVar.r(this.f1313e);
    }

    public C0030l() {
        this.f1317j = (byte) -1;
        this.f1318k = -1;
        this.f1313e = AbstractC0073e.f2065d;
    }

    public C0030l(C0074f c0074f, C0077i c0077i) {
        this.f1317j = (byte) -1;
        this.f1318k = -1;
        this.f1314g = 6;
        this.f1315h = Collections.emptyList();
        this.f1316i = Collections.emptyList();
        C0072d c0072d = new C0072d();
        A1.j jVarJ = A1.j.j(c0072d, 1);
        boolean z4 = false;
        int i5 = 0;
        while (!z4) {
            try {
                try {
                    int iN = c0074f.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f |= 1;
                            this.f1314g = c0074f.k();
                        } else if (iN == 18) {
                            if ((i5 & 2) != 2) {
                                this.f1315h = new ArrayList();
                                i5 |= 2;
                            }
                            this.f1315h.add(c0074f.g(Z.f1149p, c0077i));
                        } else if (iN == 248) {
                            if ((i5 & 4) != 4) {
                                this.f1316i = new ArrayList();
                                i5 |= 4;
                            }
                            this.f1316i.add(Integer.valueOf(c0074f.k()));
                        } else if (iN != 250) {
                            if (!n(c0074f, jVarJ, c0077i, iN)) {
                            }
                        } else {
                            int iD = c0074f.d(c0074f.k());
                            if ((i5 & 4) != 4 && c0074f.b() > 0) {
                                this.f1316i = new ArrayList();
                                i5 |= 4;
                            }
                            while (c0074f.b() > 0) {
                                this.f1316i.add(Integer.valueOf(c0074f.k()));
                            }
                            c0074f.c(iD);
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
                if ((i5 & 2) == 2) {
                    this.f1315h = Collections.unmodifiableList(this.f1315h);
                }
                if ((i5 & 4) == 4) {
                    this.f1316i = Collections.unmodifiableList(this.f1316i);
                }
                try {
                    jVarJ.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1313e = c0072d.l();
                    throw th2;
                }
                this.f1313e = c0072d.l();
                m();
                throw th;
            }
        }
        if ((i5 & 2) == 2) {
            this.f1315h = Collections.unmodifiableList(this.f1315h);
        }
        if ((i5 & 4) == 4) {
            this.f1316i = Collections.unmodifiableList(this.f1316i);
        }
        try {
            jVarJ.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1313e = c0072d.l();
            throw th3;
        }
        this.f1313e = c0072d.l();
        m();
    }
}
