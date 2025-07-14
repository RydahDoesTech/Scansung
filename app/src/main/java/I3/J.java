package I3;

import O3.AbstractC0073e;
import O3.AbstractC0079k;
import O3.AbstractC0084p;
import O3.C0072d;
import O3.C0074f;
import O3.C0086s;
import java.io.IOException;

/* loaded from: classes.dex */
public final class J extends AbstractC0084p {

    /* renamed from: k, reason: collision with root package name */
    public static final J f1024k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0019a f1025l = new C0019a(14);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0073e f1026d;

    /* renamed from: e, reason: collision with root package name */
    public int f1027e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f1028g;

    /* renamed from: h, reason: collision with root package name */
    public I f1029h;

    /* renamed from: i, reason: collision with root package name */
    public byte f1030i;

    /* renamed from: j, reason: collision with root package name */
    public int f1031j;

    static {
        J j5 = new J();
        f1024k = j5;
        j5.f = -1;
        j5.f1028g = 0;
        j5.f1029h = I.PACKAGE;
    }

    public J() {
        this.f1030i = (byte) -1;
        this.f1031j = -1;
        this.f1026d = AbstractC0073e.f2065d;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.f1030i;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.f1027e & 2) == 2) {
            this.f1030i = (byte) 1;
            return true;
        }
        this.f1030i = (byte) 0;
        return false;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.f1031j;
        if (i5 != -1) {
            return i5;
        }
        int iB = (this.f1027e & 1) == 1 ? A1.j.b(1, this.f) : 0;
        if ((this.f1027e & 2) == 2) {
            iB += A1.j.b(2, this.f1028g);
        }
        if ((this.f1027e & 4) == 4) {
            iB += A1.j.a(3, this.f1029h.f1023d);
        }
        int size = this.f1026d.size() + iB;
        this.f1031j = size;
        return size;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        return H.g();
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        H hG = H.g();
        hG.h(this);
        return hG;
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        if ((this.f1027e & 1) == 1) {
            jVar.m(1, this.f);
        }
        if ((this.f1027e & 2) == 2) {
            jVar.m(2, this.f1028g);
        }
        if ((this.f1027e & 4) == 4) {
            jVar.l(3, this.f1029h.f1023d);
        }
        jVar.r(this.f1026d);
    }

    public J(C0074f c0074f) {
        I i5;
        this.f1030i = (byte) -1;
        this.f1031j = -1;
        this.f = -1;
        boolean z4 = false;
        this.f1028g = 0;
        I i6 = I.PACKAGE;
        this.f1029h = i6;
        C0072d c0072d = new C0072d();
        A1.j jVarJ = A1.j.j(c0072d, 1);
        while (!z4) {
            try {
                try {
                    int iN = c0074f.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f1027e |= 1;
                            this.f = c0074f.k();
                        } else if (iN == 16) {
                            this.f1027e |= 2;
                            this.f1028g = c0074f.k();
                        } else if (iN != 24) {
                            if (!c0074f.q(iN, jVarJ)) {
                            }
                        } else {
                            int iK = c0074f.k();
                            if (iK == 0) {
                                i5 = I.CLASS;
                            } else if (iK != 1) {
                                i5 = iK != 2 ? null : I.LOCAL;
                            } else {
                                i5 = i6;
                            }
                            if (i5 == null) {
                                jVarJ.v(iN);
                                jVarJ.v(iK);
                            } else {
                                this.f1027e |= 4;
                                this.f1029h = i5;
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
                try {
                    jVarJ.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1026d = c0072d.l();
                    throw th2;
                }
                this.f1026d = c0072d.l();
                throw th;
            }
        }
        try {
            jVarJ.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1026d = c0072d.l();
            throw th3;
        }
        this.f1026d = c0072d.l();
    }

    public J(H h3) {
        this.f1030i = (byte) -1;
        this.f1031j = -1;
        this.f1026d = h3.f2081d;
    }
}
