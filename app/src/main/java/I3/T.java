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

/* loaded from: classes.dex */
public final class T extends AbstractC0081m {

    /* renamed from: r, reason: collision with root package name */
    public static final T f1099r;

    /* renamed from: s, reason: collision with root package name */
    public static final C0019a f1100s = new C0019a(18);

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0073e f1101e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f1102g;

    /* renamed from: h, reason: collision with root package name */
    public int f1103h;

    /* renamed from: i, reason: collision with root package name */
    public List f1104i;

    /* renamed from: j, reason: collision with root package name */
    public Q f1105j;

    /* renamed from: k, reason: collision with root package name */
    public int f1106k;

    /* renamed from: l, reason: collision with root package name */
    public Q f1107l;

    /* renamed from: m, reason: collision with root package name */
    public int f1108m;
    public List n;

    /* renamed from: o, reason: collision with root package name */
    public List f1109o;

    /* renamed from: p, reason: collision with root package name */
    public byte f1110p;

    /* renamed from: q, reason: collision with root package name */
    public int f1111q;

    static {
        T t4 = new T();
        f1099r = t4;
        t4.p();
    }

    public T(S s2) {
        super(s2);
        this.f1110p = (byte) -1;
        this.f1111q = -1;
        this.f1101e = s2.f2081d;
    }

    @Override // O3.x
    public final AbstractC0070b a() {
        return f1099r;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.f1110p;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.f & 2) != 2) {
            this.f1110p = (byte) 0;
            return false;
        }
        for (int i5 = 0; i5 < this.f1104i.size(); i5++) {
            if (!((W) this.f1104i.get(i5)).b()) {
                this.f1110p = (byte) 0;
                return false;
            }
        }
        if ((this.f & 4) == 4 && !this.f1105j.b()) {
            this.f1110p = (byte) 0;
            return false;
        }
        if ((this.f & 16) == 16 && !this.f1107l.b()) {
            this.f1110p = (byte) 0;
            return false;
        }
        for (int i6 = 0; i6 < this.n.size(); i6++) {
            if (!((C0025g) this.n.get(i6)).b()) {
                this.f1110p = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.f1110p = (byte) 1;
            return true;
        }
        this.f1110p = (byte) 0;
        return false;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.f1111q;
        if (i5 != -1) {
            return i5;
        }
        int iB = (this.f & 1) == 1 ? A1.j.b(1, this.f1102g) : 0;
        if ((this.f & 2) == 2) {
            iB += A1.j.b(2, this.f1103h);
        }
        for (int i6 = 0; i6 < this.f1104i.size(); i6++) {
            iB += A1.j.d(3, (AbstractC0070b) this.f1104i.get(i6));
        }
        if ((this.f & 4) == 4) {
            iB += A1.j.d(4, this.f1105j);
        }
        if ((this.f & 8) == 8) {
            iB += A1.j.b(5, this.f1106k);
        }
        if ((this.f & 16) == 16) {
            iB += A1.j.d(6, this.f1107l);
        }
        if ((this.f & 32) == 32) {
            iB += A1.j.b(7, this.f1108m);
        }
        for (int i7 = 0; i7 < this.n.size(); i7++) {
            iB += A1.j.d(8, (AbstractC0070b) this.n.get(i7));
        }
        int iC = 0;
        for (int i8 = 0; i8 < this.f1109o.size(); i8++) {
            iC += A1.j.c(((Integer) this.f1109o.get(i8)).intValue());
        }
        int size = this.f1101e.size() + j() + (this.f1109o.size() * 2) + iB + iC;
        this.f1111q = size;
        return size;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        return S.h();
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        S sH = S.h();
        sH.i(this);
        return sH;
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        E0.d dVar = new E0.d((AbstractC0081m) this);
        if ((this.f & 1) == 1) {
            jVar.m(1, this.f1102g);
        }
        if ((this.f & 2) == 2) {
            jVar.m(2, this.f1103h);
        }
        for (int i5 = 0; i5 < this.f1104i.size(); i5++) {
            jVar.o(3, (AbstractC0070b) this.f1104i.get(i5));
        }
        if ((this.f & 4) == 4) {
            jVar.o(4, this.f1105j);
        }
        if ((this.f & 8) == 8) {
            jVar.m(5, this.f1106k);
        }
        if ((this.f & 16) == 16) {
            jVar.o(6, this.f1107l);
        }
        if ((this.f & 32) == 32) {
            jVar.m(7, this.f1108m);
        }
        for (int i6 = 0; i6 < this.n.size(); i6++) {
            jVar.o(8, (AbstractC0070b) this.n.get(i6));
        }
        for (int i7 = 0; i7 < this.f1109o.size(); i7++) {
            jVar.m(31, ((Integer) this.f1109o.get(i7)).intValue());
        }
        dVar.P0(200, jVar);
        jVar.r(this.f1101e);
    }

    public final void p() {
        this.f1102g = 6;
        this.f1103h = 0;
        this.f1104i = Collections.emptyList();
        Q q5 = Q.f1072w;
        this.f1105j = q5;
        this.f1106k = 0;
        this.f1107l = q5;
        this.f1108m = 0;
        this.n = Collections.emptyList();
        this.f1109o = Collections.emptyList();
    }

    public T() {
        this.f1110p = (byte) -1;
        this.f1111q = -1;
        this.f1101e = AbstractC0073e.f2065d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public T(C0074f c0074f, C0077i c0077i) {
        this.f1110p = (byte) -1;
        this.f1111q = -1;
        p();
        C0072d c0072d = new C0072d();
        A1.j jVarJ = A1.j.j(c0072d, 1);
        boolean z4 = false;
        int i5 = 0;
        while (true) {
            ?? N4 = 128;
            if (!z4) {
                try {
                    try {
                        int iN = c0074f.n();
                        P pR = null;
                        switch (iN) {
                            case 0:
                                z4 = true;
                            case 8:
                                this.f |= 1;
                                this.f1102g = c0074f.k();
                            case 16:
                                this.f |= 2;
                                this.f1103h = c0074f.k();
                            case 26:
                                if ((i5 & 4) != 4) {
                                    this.f1104i = new ArrayList();
                                    i5 |= 4;
                                }
                                this.f1104i.add(c0074f.g(W.f1124q, c0077i));
                            case 34:
                                if ((this.f & 4) == 4) {
                                    Q q5 = this.f1105j;
                                    q5.getClass();
                                    pR = Q.r(q5);
                                }
                                Q q6 = (Q) c0074f.g(Q.f1073x, c0077i);
                                this.f1105j = q6;
                                if (pR != null) {
                                    pR.i(q6);
                                    this.f1105j = pR.g();
                                }
                                this.f |= 4;
                            case 40:
                                this.f |= 8;
                                this.f1106k = c0074f.k();
                            case 50:
                                if ((this.f & 16) == 16) {
                                    Q q7 = this.f1107l;
                                    q7.getClass();
                                    pR = Q.r(q7);
                                }
                                Q q8 = (Q) c0074f.g(Q.f1073x, c0077i);
                                this.f1107l = q8;
                                if (pR != null) {
                                    pR.i(q8);
                                    this.f1107l = pR.g();
                                }
                                this.f |= 16;
                            case 56:
                                this.f |= 32;
                                this.f1108m = c0074f.k();
                            case 66:
                                if ((i5 & 128) != 128) {
                                    this.n = new ArrayList();
                                    i5 |= 128;
                                }
                                this.n.add(c0074f.g(C0025g.f1239k, c0077i));
                            case 248:
                                if ((i5 & 256) != 256) {
                                    this.f1109o = new ArrayList();
                                    i5 |= 256;
                                }
                                this.f1109o.add(Integer.valueOf(c0074f.k()));
                            case 250:
                                int iD = c0074f.d(c0074f.k());
                                if ((i5 & 256) != 256 && c0074f.b() > 0) {
                                    this.f1109o = new ArrayList();
                                    i5 |= 256;
                                }
                                while (c0074f.b() > 0) {
                                    this.f1109o.add(Integer.valueOf(c0074f.k()));
                                }
                                c0074f.c(iD);
                                break;
                            default:
                                N4 = n(c0074f, jVarJ, c0077i, iN);
                                if (N4 == 0) {
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
                    if ((i5 & 4) == 4) {
                        this.f1104i = Collections.unmodifiableList(this.f1104i);
                    }
                    if ((i5 & 128) == N4) {
                        this.n = Collections.unmodifiableList(this.n);
                    }
                    if ((i5 & 256) == 256) {
                        this.f1109o = Collections.unmodifiableList(this.f1109o);
                    }
                    try {
                        jVarJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f1101e = c0072d.l();
                        throw th2;
                    }
                    this.f1101e = c0072d.l();
                    m();
                    throw th;
                }
            } else {
                if ((i5 & 4) == 4) {
                    this.f1104i = Collections.unmodifiableList(this.f1104i);
                }
                if ((i5 & 128) == 128) {
                    this.n = Collections.unmodifiableList(this.n);
                }
                if ((i5 & 256) == 256) {
                    this.f1109o = Collections.unmodifiableList(this.f1109o);
                }
                try {
                    jVarJ.i();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f1101e = c0072d.l();
                    throw th3;
                }
                this.f1101e = c0072d.l();
                m();
                return;
            }
        }
    }
}
