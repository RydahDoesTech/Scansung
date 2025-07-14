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
public final class E extends AbstractC0081m {

    /* renamed from: m, reason: collision with root package name */
    public static final E f976m;
    public static final C0019a n = new C0019a(11);

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0073e f977e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public L f978g;

    /* renamed from: h, reason: collision with root package name */
    public K f979h;

    /* renamed from: i, reason: collision with root package name */
    public C f980i;

    /* renamed from: j, reason: collision with root package name */
    public List f981j;

    /* renamed from: k, reason: collision with root package name */
    public byte f982k;

    /* renamed from: l, reason: collision with root package name */
    public int f983l;

    static {
        E e5 = new E();
        f976m = e5;
        e5.f978g = L.f1037h;
        e5.f979h = K.f1032h;
        e5.f980i = C.n;
        e5.f981j = Collections.emptyList();
    }

    public E(D d5) {
        super(d5);
        this.f982k = (byte) -1;
        this.f983l = -1;
        this.f977e = d5.f2081d;
    }

    @Override // O3.x
    public final AbstractC0070b a() {
        return f976m;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.f982k;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.f & 2) == 2 && !this.f979h.b()) {
            this.f982k = (byte) 0;
            return false;
        }
        if ((this.f & 4) == 4 && !this.f980i.b()) {
            this.f982k = (byte) 0;
            return false;
        }
        for (int i5 = 0; i5 < this.f981j.size(); i5++) {
            if (!((C0028j) this.f981j.get(i5)).b()) {
                this.f982k = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.f982k = (byte) 1;
            return true;
        }
        this.f982k = (byte) 0;
        return false;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.f983l;
        if (i5 != -1) {
            return i5;
        }
        int iD = (this.f & 1) == 1 ? A1.j.d(1, this.f978g) : 0;
        if ((this.f & 2) == 2) {
            iD += A1.j.d(2, this.f979h);
        }
        if ((this.f & 4) == 4) {
            iD += A1.j.d(3, this.f980i);
        }
        for (int i6 = 0; i6 < this.f981j.size(); i6++) {
            iD += A1.j.d(4, (AbstractC0070b) this.f981j.get(i6));
        }
        int size = this.f977e.size() + j() + iD;
        this.f983l = size;
        return size;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        return D.h();
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        D dH = D.h();
        dH.i(this);
        return dH;
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        E0.d dVar = new E0.d((AbstractC0081m) this);
        if ((this.f & 1) == 1) {
            jVar.o(1, this.f978g);
        }
        if ((this.f & 2) == 2) {
            jVar.o(2, this.f979h);
        }
        if ((this.f & 4) == 4) {
            jVar.o(3, this.f980i);
        }
        for (int i5 = 0; i5 < this.f981j.size(); i5++) {
            jVar.o(4, (AbstractC0070b) this.f981j.get(i5));
        }
        dVar.P0(200, jVar);
        jVar.r(this.f977e);
    }

    public E() {
        this.f982k = (byte) -1;
        this.f983l = -1;
        this.f977e = AbstractC0073e.f2065d;
    }

    public E(C0074f c0074f, C0077i c0077i) {
        this.f982k = (byte) -1;
        this.f983l = -1;
        this.f978g = L.f1037h;
        this.f979h = K.f1032h;
        this.f980i = C.n;
        this.f981j = Collections.emptyList();
        C0072d c0072d = new C0072d();
        A1.j jVarJ = A1.j.j(c0072d, 1);
        boolean z4 = false;
        char c2 = 0;
        while (!z4) {
            try {
                try {
                    int iN = c0074f.n();
                    if (iN != 0) {
                        B bH = null;
                        C0031m c0031m = null;
                        C0031m c0031m2 = null;
                        if (iN == 10) {
                            if ((this.f & 1) == 1) {
                                L l4 = this.f978g;
                                l4.getClass();
                                c0031m = new C0031m(3);
                                c0031m.f1320g = O3.t.f2093e;
                                c0031m.l(l4);
                            }
                            L l5 = (L) c0074f.g(L.f1038i, c0077i);
                            this.f978g = l5;
                            if (c0031m != null) {
                                c0031m.l(l5);
                                this.f978g = c0031m.h();
                            }
                            this.f |= 1;
                        } else if (iN == 18) {
                            if ((this.f & 2) == 2) {
                                K k5 = this.f979h;
                                k5.getClass();
                                c0031m2 = new C0031m(1);
                                c0031m2.f1320g = Collections.emptyList();
                                c0031m2.k(k5);
                            }
                            K k6 = (K) c0074f.g(K.f1033i, c0077i);
                            this.f979h = k6;
                            if (c0031m2 != null) {
                                c0031m2.k(k6);
                                this.f979h = c0031m2.g();
                            }
                            this.f |= 2;
                        } else if (iN == 26) {
                            if ((this.f & 4) == 4) {
                                C c5 = this.f980i;
                                c5.getClass();
                                bH = B.h();
                                bH.i(c5);
                            }
                            C c6 = (C) c0074f.g(C.f962o, c0077i);
                            this.f980i = c6;
                            if (bH != null) {
                                bH.i(c6);
                                this.f980i = bH.g();
                            }
                            this.f |= 4;
                        } else if (iN != 34) {
                            if (!n(c0074f, jVarJ, c0077i, iN)) {
                            }
                        } else {
                            int i5 = (c2 == true ? 1 : 0) & '\b';
                            c2 = c2;
                            if (i5 != 8) {
                                this.f981j = new ArrayList();
                                c2 = '\b';
                            }
                            this.f981j.add(c0074f.g(C0028j.f1275N, c0077i));
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
                if (((c2 == true ? 1 : 0) & '\b') == 8) {
                    this.f981j = Collections.unmodifiableList(this.f981j);
                }
                try {
                    jVarJ.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f977e = c0072d.l();
                    throw th2;
                }
                this.f977e = c0072d.l();
                m();
                throw th;
            }
        }
        if (((c2 == true ? 1 : 0) & '\b') == 8) {
            this.f981j = Collections.unmodifiableList(this.f981j);
        }
        try {
            jVarJ.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f977e = c0072d.l();
            throw th3;
        }
        this.f977e = c0072d.l();
        m();
    }
}
