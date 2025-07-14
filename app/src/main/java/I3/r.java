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

/* loaded from: classes.dex */
public final class r extends AbstractC0084p {

    /* renamed from: l, reason: collision with root package name */
    public static final r f1338l;

    /* renamed from: m, reason: collision with root package name */
    public static final C0019a f1339m = new C0019a(6);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0073e f1340d;

    /* renamed from: e, reason: collision with root package name */
    public int f1341e;
    public EnumC0034p f;

    /* renamed from: g, reason: collision with root package name */
    public List f1342g;

    /* renamed from: h, reason: collision with root package name */
    public C0040w f1343h;

    /* renamed from: i, reason: collision with root package name */
    public EnumC0035q f1344i;

    /* renamed from: j, reason: collision with root package name */
    public byte f1345j;

    /* renamed from: k, reason: collision with root package name */
    public int f1346k;

    static {
        r rVar = new r();
        f1338l = rVar;
        rVar.f = EnumC0034p.RETURNS_CONSTANT;
        rVar.f1342g = Collections.emptyList();
        rVar.f1343h = C0040w.f1366o;
        rVar.f1344i = EnumC0035q.AT_MOST_ONCE;
    }

    public r() {
        this.f1345j = (byte) -1;
        this.f1346k = -1;
        this.f1340d = AbstractC0073e.f2065d;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.f1345j;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i5 = 0; i5 < this.f1342g.size(); i5++) {
            if (!((C0040w) this.f1342g.get(i5)).b()) {
                this.f1345j = (byte) 0;
                return false;
            }
        }
        if ((this.f1341e & 2) != 2 || this.f1343h.b()) {
            this.f1345j = (byte) 1;
            return true;
        }
        this.f1345j = (byte) 0;
        return false;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.f1346k;
        if (i5 != -1) {
            return i5;
        }
        int iA = (this.f1341e & 1) == 1 ? A1.j.a(1, this.f.f1333d) : 0;
        for (int i6 = 0; i6 < this.f1342g.size(); i6++) {
            iA += A1.j.d(2, (AbstractC0070b) this.f1342g.get(i6));
        }
        if ((this.f1341e & 2) == 2) {
            iA += A1.j.d(3, this.f1343h);
        }
        if ((this.f1341e & 4) == 4) {
            iA += A1.j.a(4, this.f1344i.f1337d);
        }
        int size = this.f1340d.size() + iA;
        this.f1346k = size;
        return size;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        return C0033o.g();
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        C0033o c0033oG = C0033o.g();
        c0033oG.h(this);
        return c0033oG;
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        if ((this.f1341e & 1) == 1) {
            jVar.l(1, this.f.f1333d);
        }
        for (int i5 = 0; i5 < this.f1342g.size(); i5++) {
            jVar.o(2, (AbstractC0070b) this.f1342g.get(i5));
        }
        if ((this.f1341e & 2) == 2) {
            jVar.o(3, this.f1343h);
        }
        if ((this.f1341e & 4) == 4) {
            jVar.l(4, this.f1344i.f1337d);
        }
        jVar.r(this.f1340d);
    }

    public r(C0074f c0074f, C0077i c0077i) {
        this.f1345j = (byte) -1;
        this.f1346k = -1;
        EnumC0034p enumC0034p = EnumC0034p.RETURNS_CONSTANT;
        this.f = enumC0034p;
        this.f1342g = Collections.emptyList();
        this.f1343h = C0040w.f1366o;
        EnumC0035q enumC0035q = EnumC0035q.AT_MOST_ONCE;
        this.f1344i = enumC0035q;
        C0072d c0072d = new C0072d();
        A1.j jVarJ = A1.j.j(c0072d, 1);
        boolean z4 = false;
        char c2 = 0;
        while (!z4) {
            try {
                try {
                    int iN = c0074f.n();
                    if (iN != 0) {
                        EnumC0035q enumC0035q2 = null;
                        EnumC0034p enumC0034p2 = null;
                        C0038u c0038uG = null;
                        if (iN == 8) {
                            int iK = c0074f.k();
                            if (iK == 0) {
                                enumC0034p2 = enumC0034p;
                            } else if (iK == 1) {
                                enumC0034p2 = EnumC0034p.CALLS;
                            } else if (iK == 2) {
                                enumC0034p2 = EnumC0034p.RETURNS_NOT_NULL;
                            }
                            if (enumC0034p2 == null) {
                                jVarJ.v(iN);
                                jVarJ.v(iK);
                            } else {
                                this.f1341e |= 1;
                                this.f = enumC0034p2;
                            }
                        } else if (iN == 18) {
                            int i5 = (c2 == true ? 1 : 0) & 2;
                            c2 = c2;
                            if (i5 != 2) {
                                this.f1342g = new ArrayList();
                                c2 = 2;
                            }
                            this.f1342g.add(c0074f.g(C0040w.f1367p, c0077i));
                        } else if (iN == 26) {
                            if ((this.f1341e & 2) == 2) {
                                C0040w c0040w = this.f1343h;
                                c0040w.getClass();
                                c0038uG = C0038u.g();
                                c0038uG.h(c0040w);
                            }
                            C0040w c0040w2 = (C0040w) c0074f.g(C0040w.f1367p, c0077i);
                            this.f1343h = c0040w2;
                            if (c0038uG != null) {
                                c0038uG.h(c0040w2);
                                this.f1343h = c0038uG.f();
                            }
                            this.f1341e |= 2;
                        } else if (iN != 32) {
                            if (!c0074f.q(iN, jVarJ)) {
                            }
                        } else {
                            int iK2 = c0074f.k();
                            if (iK2 == 0) {
                                enumC0035q2 = enumC0035q;
                            } else if (iK2 == 1) {
                                enumC0035q2 = EnumC0035q.EXACTLY_ONCE;
                            } else if (iK2 == 2) {
                                enumC0035q2 = EnumC0035q.AT_LEAST_ONCE;
                            }
                            if (enumC0035q2 == null) {
                                jVarJ.v(iN);
                                jVarJ.v(iK2);
                            } else {
                                this.f1341e |= 4;
                                this.f1344i = enumC0035q2;
                            }
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
                if (((c2 == true ? 1 : 0) & 2) == 2) {
                    this.f1342g = Collections.unmodifiableList(this.f1342g);
                }
                try {
                    jVarJ.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1340d = c0072d.l();
                    throw th2;
                }
                this.f1340d = c0072d.l();
                throw th;
            }
        }
        if (((c2 == true ? 1 : 0) & 2) == 2) {
            this.f1342g = Collections.unmodifiableList(this.f1342g);
        }
        try {
            jVarJ.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1340d = c0072d.l();
            throw th3;
        }
        this.f1340d = c0072d.l();
    }

    public r(C0033o c0033o) {
        this.f1345j = (byte) -1;
        this.f1346k = -1;
        this.f1340d = c0033o.f2081d;
    }
}
