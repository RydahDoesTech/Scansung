package I3;

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

/* renamed from: I3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0022d extends AbstractC0084p {

    /* renamed from: s, reason: collision with root package name */
    public static final C0022d f1196s;

    /* renamed from: t, reason: collision with root package name */
    public static final C0019a f1197t = new C0019a(2);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0073e f1198d;

    /* renamed from: e, reason: collision with root package name */
    public int f1199e;
    public EnumC0021c f;

    /* renamed from: g, reason: collision with root package name */
    public long f1200g;

    /* renamed from: h, reason: collision with root package name */
    public float f1201h;

    /* renamed from: i, reason: collision with root package name */
    public double f1202i;

    /* renamed from: j, reason: collision with root package name */
    public int f1203j;

    /* renamed from: k, reason: collision with root package name */
    public int f1204k;

    /* renamed from: l, reason: collision with root package name */
    public int f1205l;

    /* renamed from: m, reason: collision with root package name */
    public C0025g f1206m;
    public List n;

    /* renamed from: o, reason: collision with root package name */
    public int f1207o;

    /* renamed from: p, reason: collision with root package name */
    public int f1208p;

    /* renamed from: q, reason: collision with root package name */
    public byte f1209q;

    /* renamed from: r, reason: collision with root package name */
    public int f1210r;

    static {
        C0022d c0022d = new C0022d();
        f1196s = c0022d;
        c0022d.i();
    }

    public C0022d() {
        this.f1209q = (byte) -1;
        this.f1210r = -1;
        this.f1198d = AbstractC0073e.f2065d;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.f1209q;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.f1199e & 128) == 128 && !this.f1206m.b()) {
            this.f1209q = (byte) 0;
            return false;
        }
        for (int i5 = 0; i5 < this.n.size(); i5++) {
            if (!((C0022d) this.n.get(i5)).b()) {
                this.f1209q = (byte) 0;
                return false;
            }
        }
        this.f1209q = (byte) 1;
        return true;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.f1210r;
        if (i5 != -1) {
            return i5;
        }
        int iA = (this.f1199e & 1) == 1 ? A1.j.a(1, this.f.f1191d) : 0;
        if ((this.f1199e & 2) == 2) {
            long j5 = this.f1200g;
            iA += A1.j.g((j5 >> 63) ^ (j5 << 1)) + A1.j.h(2);
        }
        if ((this.f1199e & 4) == 4) {
            iA += A1.j.h(3) + 4;
        }
        if ((this.f1199e & 8) == 8) {
            iA += A1.j.h(4) + 8;
        }
        if ((this.f1199e & 16) == 16) {
            iA += A1.j.b(5, this.f1203j);
        }
        if ((this.f1199e & 32) == 32) {
            iA += A1.j.b(6, this.f1204k);
        }
        if ((this.f1199e & 64) == 64) {
            iA += A1.j.b(7, this.f1205l);
        }
        if ((this.f1199e & 128) == 128) {
            iA += A1.j.d(8, this.f1206m);
        }
        for (int i6 = 0; i6 < this.n.size(); i6++) {
            iA += A1.j.d(9, (AbstractC0070b) this.n.get(i6));
        }
        if ((this.f1199e & 512) == 512) {
            iA += A1.j.b(10, this.f1208p);
        }
        if ((this.f1199e & 256) == 256) {
            iA += A1.j.b(11, this.f1207o);
        }
        int size = this.f1198d.size() + iA;
        this.f1210r = size;
        return size;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        return C0020b.g();
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        C0020b c0020bG = C0020b.g();
        c0020bG.h(this);
        return c0020bG;
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        if ((this.f1199e & 1) == 1) {
            jVar.l(1, this.f.f1191d);
        }
        if ((this.f1199e & 2) == 2) {
            long j5 = this.f1200g;
            jVar.x(2, 0);
            jVar.w((j5 >> 63) ^ (j5 << 1));
        }
        if ((this.f1199e & 4) == 4) {
            float f = this.f1201h;
            jVar.x(3, 5);
            jVar.t(Float.floatToRawIntBits(f));
        }
        if ((this.f1199e & 8) == 8) {
            double d5 = this.f1202i;
            jVar.x(4, 1);
            jVar.u(Double.doubleToRawLongBits(d5));
        }
        if ((this.f1199e & 16) == 16) {
            jVar.m(5, this.f1203j);
        }
        if ((this.f1199e & 32) == 32) {
            jVar.m(6, this.f1204k);
        }
        if ((this.f1199e & 64) == 64) {
            jVar.m(7, this.f1205l);
        }
        if ((this.f1199e & 128) == 128) {
            jVar.o(8, this.f1206m);
        }
        for (int i5 = 0; i5 < this.n.size(); i5++) {
            jVar.o(9, (AbstractC0070b) this.n.get(i5));
        }
        if ((this.f1199e & 512) == 512) {
            jVar.m(10, this.f1208p);
        }
        if ((this.f1199e & 256) == 256) {
            jVar.m(11, this.f1207o);
        }
        jVar.r(this.f1198d);
    }

    public final void i() {
        this.f = EnumC0021c.BYTE;
        this.f1200g = 0L;
        this.f1201h = 0.0f;
        this.f1202i = 0.0d;
        this.f1203j = 0;
        this.f1204k = 0;
        this.f1205l = 0;
        this.f1206m = C0025g.f1238j;
        this.n = Collections.emptyList();
        this.f1207o = 0;
        this.f1208p = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public C0022d(C0074f c0074f, C0077i c0077i) {
        C0024f c0024f;
        this.f1209q = (byte) -1;
        this.f1210r = -1;
        i();
        C0072d c0072d = new C0072d();
        A1.j jVarJ = A1.j.j(c0072d, 1);
        boolean z4 = false;
        char c2 = 0;
        while (true) {
            ?? Q4 = 256;
            if (!z4) {
                try {
                    try {
                        int iN = c0074f.n();
                        switch (iN) {
                            case 0:
                                z4 = true;
                            case 8:
                                int iK = c0074f.k();
                                EnumC0021c enumC0021cB = EnumC0021c.b(iK);
                                if (enumC0021cB == null) {
                                    jVarJ.v(iN);
                                    jVarJ.v(iK);
                                } else {
                                    this.f1199e |= 1;
                                    this.f = enumC0021cB;
                                }
                            case 16:
                                this.f1199e |= 2;
                                long jL = c0074f.l();
                                this.f1200g = (-(jL & 1)) ^ (jL >>> 1);
                            case 29:
                                this.f1199e |= 4;
                                this.f1201h = Float.intBitsToFloat(c0074f.i());
                            case 33:
                                this.f1199e |= 8;
                                this.f1202i = Double.longBitsToDouble(c0074f.j());
                            case 40:
                                this.f1199e |= 16;
                                this.f1203j = c0074f.k();
                            case 48:
                                this.f1199e |= 32;
                                this.f1204k = c0074f.k();
                            case 56:
                                this.f1199e |= 64;
                                this.f1205l = c0074f.k();
                            case 66:
                                if ((this.f1199e & 128) == 128) {
                                    C0025g c0025g = this.f1206m;
                                    c0025g.getClass();
                                    c0024f = new C0024f(0);
                                    c0024f.f1234g = Collections.emptyList();
                                    c0024f.k(c0025g);
                                } else {
                                    c0024f = null;
                                }
                                C0025g c0025g2 = (C0025g) c0074f.g(C0025g.f1239k, c0077i);
                                this.f1206m = c0025g2;
                                if (c0024f != null) {
                                    c0024f.k(c0025g2);
                                    this.f1206m = c0024f.g();
                                }
                                this.f1199e |= 128;
                            case 74:
                                if ((c2 & 256) != 256) {
                                    this.n = new ArrayList();
                                    c2 = 256;
                                }
                                this.n.add(c0074f.g(f1197t, c0077i));
                            case 80:
                                this.f1199e |= 512;
                                this.f1208p = c0074f.k();
                            case 88:
                                this.f1199e |= 256;
                                this.f1207o = c0074f.k();
                            default:
                                Q4 = c0074f.q(iN, jVarJ);
                                if (Q4 == 0) {
                                    z4 = true;
                                }
                        }
                    } catch (C0086s e5) {
                        e5.f2092d = this;
                        throw e5;
                    } catch (IOException e6) {
                        C0086s c0086s = new C0086s(e6.getMessage());
                        c0086s.f2092d = this;
                        throw c0086s;
                    }
                } catch (Throwable th) {
                    if ((c2 & 256) == Q4) {
                        this.n = Collections.unmodifiableList(this.n);
                    }
                    try {
                        jVarJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f1198d = c0072d.l();
                        throw th2;
                    }
                    this.f1198d = c0072d.l();
                    throw th;
                }
            } else {
                if ((c2 & 256) == 256) {
                    this.n = Collections.unmodifiableList(this.n);
                }
                try {
                    jVarJ.i();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f1198d = c0072d.l();
                    throw th3;
                }
                this.f1198d = c0072d.l();
                return;
            }
        }
    }

    public C0022d(C0020b c0020b) {
        this.f1209q = (byte) -1;
        this.f1210r = -1;
        this.f1198d = c0020b.f2081d;
    }
}
