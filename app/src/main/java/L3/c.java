package L3;

import I3.C0019a;
import O3.AbstractC0073e;
import O3.AbstractC0079k;
import O3.AbstractC0084p;
import O3.C0072d;
import O3.C0074f;
import O3.C0086s;
import java.io.IOException;

/* loaded from: classes.dex */
public final class c extends AbstractC0084p {

    /* renamed from: j, reason: collision with root package name */
    public static final c f1744j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0019a f1745k = new C0019a(25);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0073e f1746d;

    /* renamed from: e, reason: collision with root package name */
    public int f1747e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f1748g;

    /* renamed from: h, reason: collision with root package name */
    public byte f1749h;

    /* renamed from: i, reason: collision with root package name */
    public int f1750i;

    static {
        c cVar = new c();
        f1744j = cVar;
        cVar.f = 0;
        cVar.f1748g = 0;
    }

    public c() {
        this.f1749h = (byte) -1;
        this.f1750i = -1;
        this.f1746d = AbstractC0073e.f2065d;
    }

    public static a i(c cVar) {
        a aVar = new a(1);
        aVar.i(cVar);
        return aVar;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.f1749h;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.f1749h = (byte) 1;
        return true;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.f1750i;
        if (i5 != -1) {
            return i5;
        }
        int iB = (this.f1747e & 1) == 1 ? A1.j.b(1, this.f) : 0;
        if ((this.f1747e & 2) == 2) {
            iB += A1.j.b(2, this.f1748g);
        }
        int size = this.f1746d.size() + iB;
        this.f1750i = size;
        return size;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        return new a(1);
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        return i(this);
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        if ((this.f1747e & 1) == 1) {
            jVar.m(1, this.f);
        }
        if ((this.f1747e & 2) == 2) {
            jVar.m(2, this.f1748g);
        }
        jVar.r(this.f1746d);
    }

    public c(C0074f c0074f) {
        this.f1749h = (byte) -1;
        this.f1750i = -1;
        boolean z4 = false;
        this.f = 0;
        this.f1748g = 0;
        C0072d c0072d = new C0072d();
        A1.j jVarJ = A1.j.j(c0072d, 1);
        while (!z4) {
            try {
                try {
                    int iN = c0074f.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f1747e |= 1;
                            this.f = c0074f.k();
                        } else if (iN != 16) {
                            if (!c0074f.q(iN, jVarJ)) {
                            }
                        } else {
                            this.f1747e |= 2;
                            this.f1748g = c0074f.k();
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
                    this.f1746d = c0072d.l();
                    throw th2;
                }
                this.f1746d = c0072d.l();
                throw th;
            }
        }
        try {
            jVarJ.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1746d = c0072d.l();
            throw th3;
        }
        this.f1746d = c0072d.l();
    }

    public c(a aVar) {
        this.f1749h = (byte) -1;
        this.f1750i = -1;
        this.f1746d = aVar.f2081d;
    }
}
