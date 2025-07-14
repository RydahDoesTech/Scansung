package L3;

import I3.C0019a;
import O3.AbstractC0070b;
import O3.AbstractC0073e;
import O3.AbstractC0079k;
import O3.AbstractC0084p;
import O3.C0072d;
import O3.C0074f;
import O3.C0077i;
import O3.C0086s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends AbstractC0084p {

    /* renamed from: j, reason: collision with root package name */
    public static final j f1789j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0019a f1790k = new C0019a(27);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0073e f1791d;

    /* renamed from: e, reason: collision with root package name */
    public List f1792e;
    public List f;

    /* renamed from: g, reason: collision with root package name */
    public int f1793g;

    /* renamed from: h, reason: collision with root package name */
    public byte f1794h;

    /* renamed from: i, reason: collision with root package name */
    public int f1795i;

    static {
        j jVar = new j();
        f1789j = jVar;
        jVar.f1792e = Collections.emptyList();
        jVar.f = Collections.emptyList();
    }

    public j() {
        this.f1793g = -1;
        this.f1794h = (byte) -1;
        this.f1795i = -1;
        this.f1791d = AbstractC0073e.f2065d;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.f1794h;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.f1794h = (byte) 1;
        return true;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.f1795i;
        if (i5 != -1) {
            return i5;
        }
        int iD = 0;
        for (int i6 = 0; i6 < this.f1792e.size(); i6++) {
            iD += A1.j.d(1, (AbstractC0070b) this.f1792e.get(i6));
        }
        int iC = 0;
        for (int i7 = 0; i7 < this.f.size(); i7++) {
            iC += A1.j.c(((Integer) this.f.get(i7)).intValue());
        }
        int iC2 = iD + iC;
        if (!this.f.isEmpty()) {
            iC2 = iC2 + 1 + A1.j.c(iC);
        }
        this.f1793g = iC;
        int size = this.f1791d.size() + iC2;
        this.f1795i = size;
        return size;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        return f.g();
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        f fVarG = f.g();
        fVarG.h(this);
        return fVarG;
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        for (int i5 = 0; i5 < this.f1792e.size(); i5++) {
            jVar.o(1, (AbstractC0070b) this.f1792e.get(i5));
        }
        if (this.f.size() > 0) {
            jVar.v(42);
            jVar.v(this.f1793g);
        }
        for (int i6 = 0; i6 < this.f.size(); i6++) {
            jVar.n(((Integer) this.f.get(i6)).intValue());
        }
        jVar.r(this.f1791d);
    }

    public j(C0074f c0074f, C0077i c0077i) {
        this.f1793g = -1;
        this.f1794h = (byte) -1;
        this.f1795i = -1;
        this.f1792e = Collections.emptyList();
        this.f = Collections.emptyList();
        C0072d c0072d = new C0072d();
        A1.j jVarJ = A1.j.j(c0072d, 1);
        boolean z4 = false;
        int i5 = 0;
        while (!z4) {
            try {
                try {
                    int iN = c0074f.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            if ((i5 & 1) != 1) {
                                this.f1792e = new ArrayList();
                                i5 |= 1;
                            }
                            this.f1792e.add(c0074f.g(i.f1778q, c0077i));
                        } else if (iN == 40) {
                            if ((i5 & 2) != 2) {
                                this.f = new ArrayList();
                                i5 |= 2;
                            }
                            this.f.add(Integer.valueOf(c0074f.k()));
                        } else if (iN != 42) {
                            if (!c0074f.q(iN, jVarJ)) {
                            }
                        } else {
                            int iD = c0074f.d(c0074f.k());
                            if ((i5 & 2) != 2 && c0074f.b() > 0) {
                                this.f = new ArrayList();
                                i5 |= 2;
                            }
                            while (c0074f.b() > 0) {
                                this.f.add(Integer.valueOf(c0074f.k()));
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
                if ((i5 & 1) == 1) {
                    this.f1792e = Collections.unmodifiableList(this.f1792e);
                }
                if ((i5 & 2) == 2) {
                    this.f = Collections.unmodifiableList(this.f);
                }
                try {
                    jVarJ.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1791d = c0072d.l();
                    throw th2;
                }
                this.f1791d = c0072d.l();
                throw th;
            }
        }
        if ((i5 & 1) == 1) {
            this.f1792e = Collections.unmodifiableList(this.f1792e);
        }
        if ((i5 & 2) == 2) {
            this.f = Collections.unmodifiableList(this.f);
        }
        try {
            jVarJ.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1791d = c0072d.l();
            throw th3;
        }
        this.f1791d = c0072d.l();
    }

    public j(f fVar) {
        this.f1793g = -1;
        this.f1794h = (byte) -1;
        this.f1795i = -1;
        this.f1791d = fVar.f2081d;
    }
}
