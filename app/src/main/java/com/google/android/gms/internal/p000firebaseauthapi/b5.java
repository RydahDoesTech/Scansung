package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.recyclerview.widget.RecyclerView;
import j0.AbstractC0519J;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class b5 {

    /* renamed from: a, reason: collision with root package name */
    public int f5438a;

    /* renamed from: b, reason: collision with root package name */
    public int f5439b;

    /* renamed from: c, reason: collision with root package name */
    public int f5440c = 0;

    /* renamed from: d, reason: collision with root package name */
    public Object f5441d;

    public b5(a5 a5Var) {
        Charset charset = AbstractC0246d.f5451a;
        this.f5441d = a5Var;
        a5Var.f5429g = this;
    }

    public void A(List list) throws C0258f {
        int iF;
        int i5 = this.f5438a & 7;
        a5 a5Var = (a5) this.f5441d;
        if (i5 == 0) {
            do {
                list.add(Integer.valueOf(a5Var.e()));
                if (a5Var.j()) {
                    return;
                } else {
                    iF = a5Var.f();
                }
            } while (iF == this.f5438a);
            this.f5440c = iF;
            return;
        }
        if (i5 != 2) {
            throw C0258f.a();
        }
        int iE = a5Var.f5427d + a5Var.e();
        do {
            list.add(Integer.valueOf(a5Var.e()));
        } while (a5Var.f5427d < iE);
        r(iE);
    }

    public void B(List list) throws C0258f {
        int iF;
        int i5 = this.f5438a & 7;
        a5 a5Var = (a5) this.f5441d;
        if (i5 == 2) {
            int iE = a5Var.e();
            if ((iE & 3) != 0) {
                throw C0258f.d();
            }
            int i6 = a5Var.f5427d + iE;
            do {
                list.add(Integer.valueOf(a5Var.d()));
            } while (a5Var.f5427d < i6);
            return;
        }
        if (i5 != 5) {
            throw C0258f.a();
        }
        do {
            list.add(Integer.valueOf(a5Var.d()));
            if (a5Var.j()) {
                return;
            } else {
                iF = a5Var.f();
            }
        } while (iF == this.f5438a);
        this.f5440c = iF;
    }

    public void a(int i5, int i6) {
        if (i5 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i7 = this.f5440c;
        int i8 = i7 * 2;
        int[] iArr = (int[]) this.f5441d;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f5441d = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i8 >= iArr.length) {
            int[] iArr3 = new int[i7 * 4];
            this.f5441d = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.f5441d;
        iArr4[i8] = i5;
        iArr4[i8 + 1] = i6;
        this.f5440c++;
    }

    public void b(RecyclerView recyclerView, boolean z4) {
        this.f5440c = 0;
        int[] iArr = (int[]) this.f5441d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC0519J abstractC0519J = recyclerView.f4833q;
        if (recyclerView.f4831p == null || abstractC0519J == null || !abstractC0519J.f7069i) {
            return;
        }
        if (z4) {
            if (!recyclerView.f4810h.g()) {
                abstractC0519J.i(recyclerView.f4831p.a(), this);
            }
        } else if (!recyclerView.Z()) {
            abstractC0519J.h(this.f5438a, this.f5439b, recyclerView.m0, this);
        }
        int i5 = this.f5440c;
        if (i5 > abstractC0519J.f7070j) {
            abstractC0519J.f7070j = i5;
            abstractC0519J.f7071k = z4;
            recyclerView.f.m();
        }
    }

    public void c(List list) throws C0258f {
        int iF;
        int i5 = this.f5438a & 7;
        a5 a5Var = (a5) this.f5441d;
        if (i5 == 1) {
            do {
                list.add(Long.valueOf(a5Var.g()));
                if (a5Var.j()) {
                    return;
                } else {
                    iF = a5Var.f();
                }
            } while (iF == this.f5438a);
            this.f5440c = iF;
            return;
        }
        if (i5 != 2) {
            throw C0258f.a();
        }
        int iE = a5Var.e();
        if ((iE & 7) != 0) {
            throw C0258f.d();
        }
        int i6 = a5Var.f5427d + iE;
        do {
            list.add(Long.valueOf(a5Var.g()));
        } while (a5Var.f5427d < i6);
    }

    public void d(List list) throws C0258f {
        int iF;
        int i5 = this.f5438a & 7;
        a5 a5Var = (a5) this.f5441d;
        if (i5 == 2) {
            int iE = a5Var.e();
            if ((iE & 3) != 0) {
                throw C0258f.d();
            }
            int i6 = a5Var.f5427d + iE;
            do {
                list.add(Float.valueOf(Float.intBitsToFloat(a5Var.d())));
            } while (a5Var.f5427d < i6);
            return;
        }
        if (i5 != 5) {
            throw C0258f.a();
        }
        do {
            list.add(Float.valueOf(Float.intBitsToFloat(a5Var.d())));
            if (a5Var.j()) {
                return;
            } else {
                iF = a5Var.f();
            }
        } while (iF == this.f5438a);
        this.f5440c = iF;
    }

    public void e(List list, A a5, g5 g5Var) throws C0258f {
        int iF;
        int i5 = this.f5438a;
        if ((i5 & 7) != 3) {
            throw C0258f.a();
        }
        do {
            list.add(p(a5, g5Var));
            a5 a5Var = (a5) this.f5441d;
            if (a5Var.j() || this.f5440c != 0) {
                return;
            } else {
                iF = a5Var.f();
            }
        } while (iF == i5);
        this.f5440c = iF;
    }

    public void f(List list) throws C0258f {
        int iF;
        int i5 = this.f5438a & 7;
        a5 a5Var = (a5) this.f5441d;
        if (i5 == 0) {
            do {
                list.add(Integer.valueOf(a5Var.e()));
                if (a5Var.j()) {
                    return;
                } else {
                    iF = a5Var.f();
                }
            } while (iF == this.f5438a);
            this.f5440c = iF;
            return;
        }
        if (i5 != 2) {
            throw C0258f.a();
        }
        int iE = a5Var.f5427d + a5Var.e();
        do {
            list.add(Integer.valueOf(a5Var.e()));
        } while (a5Var.f5427d < iE);
        r(iE);
    }

    public void g(List list) throws C0258f {
        int iF;
        int i5 = this.f5438a & 7;
        a5 a5Var = (a5) this.f5441d;
        if (i5 == 0) {
            do {
                list.add(Long.valueOf(a5Var.h()));
                if (a5Var.j()) {
                    return;
                } else {
                    iF = a5Var.f();
                }
            } while (iF == this.f5438a);
            this.f5440c = iF;
            return;
        }
        if (i5 != 2) {
            throw C0258f.a();
        }
        int iE = a5Var.f5427d + a5Var.e();
        do {
            list.add(Long.valueOf(a5Var.h()));
        } while (a5Var.f5427d < iE);
        r(iE);
    }

    public void h(List list, A a5, g5 g5Var) throws C0258f {
        int iF;
        int i5 = this.f5438a;
        if ((i5 & 7) != 2) {
            throw C0258f.a();
        }
        do {
            list.add(q(a5, g5Var));
            a5 a5Var = (a5) this.f5441d;
            if (a5Var.j() || this.f5440c != 0) {
                return;
            } else {
                iF = a5Var.f();
            }
        } while (iF == i5);
        this.f5440c = iF;
    }

    public void i(List list) throws C0258f {
        int iF;
        int i5 = this.f5438a & 7;
        a5 a5Var = (a5) this.f5441d;
        if (i5 == 2) {
            int iE = a5Var.e();
            if ((iE & 3) != 0) {
                throw C0258f.d();
            }
            int i6 = a5Var.f5427d + iE;
            do {
                list.add(Integer.valueOf(a5Var.d()));
            } while (a5Var.f5427d < i6);
            return;
        }
        if (i5 != 5) {
            throw C0258f.a();
        }
        do {
            list.add(Integer.valueOf(a5Var.d()));
            if (a5Var.j()) {
                return;
            } else {
                iF = a5Var.f();
            }
        } while (iF == this.f5438a);
        this.f5440c = iF;
    }

    public void j(List list) throws C0258f {
        int iF;
        int i5 = this.f5438a & 7;
        a5 a5Var = (a5) this.f5441d;
        if (i5 == 1) {
            do {
                list.add(Long.valueOf(a5Var.g()));
                if (a5Var.j()) {
                    return;
                } else {
                    iF = a5Var.f();
                }
            } while (iF == this.f5438a);
            this.f5440c = iF;
            return;
        }
        if (i5 != 2) {
            throw C0258f.a();
        }
        int iE = a5Var.e();
        if ((iE & 7) != 0) {
            throw C0258f.d();
        }
        int i6 = a5Var.f5427d + iE;
        do {
            list.add(Long.valueOf(a5Var.g()));
        } while (a5Var.f5427d < i6);
    }

    public void k(List list) throws C0258f {
        int iF;
        int i5 = this.f5438a & 7;
        a5 a5Var = (a5) this.f5441d;
        if (i5 == 0) {
            do {
                list.add(Integer.valueOf(a5.k(a5Var.e())));
                if (a5Var.j()) {
                    return;
                } else {
                    iF = a5Var.f();
                }
            } while (iF == this.f5438a);
            this.f5440c = iF;
            return;
        }
        if (i5 != 2) {
            throw C0258f.a();
        }
        int iE = a5Var.f5427d + a5Var.e();
        do {
            list.add(Integer.valueOf(a5.k(a5Var.e())));
        } while (a5Var.f5427d < iE);
        r(iE);
    }

    public void l(List list) throws C0258f {
        int iF;
        int i5 = this.f5438a & 7;
        a5 a5Var = (a5) this.f5441d;
        if (i5 == 0) {
            do {
                list.add(Long.valueOf(a5.l(a5Var.h())));
                if (a5Var.j()) {
                    return;
                } else {
                    iF = a5Var.f();
                }
            } while (iF == this.f5438a);
            this.f5440c = iF;
            return;
        }
        if (i5 != 2) {
            throw C0258f.a();
        }
        int iE = a5Var.f5427d + a5Var.e();
        do {
            list.add(Long.valueOf(a5.l(a5Var.h())));
        } while (a5Var.f5427d < iE);
        r(iE);
    }

    public void m(List list, boolean z4) throws C0258f {
        int iF;
        int iF2;
        if ((this.f5438a & 7) != 2) {
            throw C0258f.a();
        }
        boolean z5 = list instanceof InterfaceC0276i;
        a5 a5Var = (a5) this.f5441d;
        if (!z5 || z4) {
            do {
                list.add(z4 ? w() : v());
                if (a5Var.j()) {
                    return;
                } else {
                    iF = a5Var.f();
                }
            } while (iF == this.f5438a);
            this.f5440c = iF;
            return;
        }
        InterfaceC0276i interfaceC0276i = (InterfaceC0276i) list;
        do {
            interfaceC0276i.f(u());
            if (a5Var.j()) {
                return;
            } else {
                iF2 = a5Var.f();
            }
        } while (iF2 == this.f5438a);
        this.f5440c = iF2;
    }

    public void n(List list) throws C0258f {
        int iF;
        int i5 = this.f5438a & 7;
        a5 a5Var = (a5) this.f5441d;
        if (i5 == 0) {
            do {
                list.add(Integer.valueOf(a5Var.e()));
                if (a5Var.j()) {
                    return;
                } else {
                    iF = a5Var.f();
                }
            } while (iF == this.f5438a);
            this.f5440c = iF;
            return;
        }
        if (i5 != 2) {
            throw C0258f.a();
        }
        int iE = a5Var.f5427d + a5Var.e();
        do {
            list.add(Integer.valueOf(a5Var.e()));
        } while (a5Var.f5427d < iE);
        r(iE);
    }

    public void o(List list) throws C0258f {
        int iF;
        int i5 = this.f5438a & 7;
        a5 a5Var = (a5) this.f5441d;
        if (i5 == 0) {
            do {
                list.add(Long.valueOf(a5Var.h()));
                if (a5Var.j()) {
                    return;
                } else {
                    iF = a5Var.f();
                }
            } while (iF == this.f5438a);
            this.f5440c = iF;
            return;
        }
        if (i5 != 2) {
            throw C0258f.a();
        }
        int iE = a5Var.f5427d + a5Var.e();
        do {
            list.add(Long.valueOf(a5Var.h()));
        } while (a5Var.f5427d < iE);
        r(iE);
    }

    public Object p(A a5, g5 g5Var) {
        int i5 = this.f5439b;
        this.f5439b = ((this.f5438a >>> 3) << 3) | 4;
        try {
            Object objA = a5.a();
            a5.c(objA, this, g5Var);
            a5.b(objA);
            if (this.f5438a == this.f5439b) {
                return objA;
            }
            throw C0258f.d();
        } finally {
            this.f5439b = i5;
        }
    }

    public Object q(A a5, g5 g5Var) throws C0258f {
        a5 a5Var = (a5) this.f5441d;
        int iE = a5Var.e();
        if (a5Var.f5424a >= 100) {
            throw new C0258f("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iC = a5Var.c(iE);
        Object objA = a5.a();
        a5Var.f5424a++;
        a5.c(objA, this, g5Var);
        a5.b(objA);
        if (a5Var.f5428e != 0) {
            throw new C0258f("Protocol message end-group tag did not match expected tag.");
        }
        a5Var.f5424a--;
        a5Var.f = iC;
        int i5 = a5Var.f5425b + a5Var.f5426c;
        a5Var.f5425b = i5;
        if (i5 > iC) {
            int i6 = i5 - iC;
            a5Var.f5426c = i6;
            a5Var.f5425b = i5 - i6;
        } else {
            a5Var.f5426c = 0;
        }
        return objA;
    }

    public void r(int i5) throws C0258f {
        if (((a5) this.f5441d).f5427d != i5) {
            throw C0258f.e();
        }
    }

    public void s(int i5) throws C0252e {
        if ((this.f5438a & 7) != i5) {
            throw C0258f.a();
        }
    }

    public int t() throws C0258f {
        int iF = this.f5440c;
        if (iF != 0) {
            this.f5438a = iF;
            this.f5440c = 0;
        } else {
            iF = ((a5) this.f5441d).f();
            this.f5438a = iF;
        }
        if (iF == 0 || iF == this.f5439b) {
            return Integer.MAX_VALUE;
        }
        return iF >>> 3;
    }

    public Y4 u() throws C0258f {
        s(2);
        a5 a5Var = (a5) this.f5441d;
        int iE = a5Var.e();
        byte[] bArr = (byte[]) a5Var.f5430h;
        if (iE > 0) {
            int i5 = a5Var.f5425b;
            int i6 = a5Var.f5427d;
            if (iE <= i5 - i6) {
                Y4 y4Q = Z4.q(bArr, i6, iE);
                a5Var.f5427d += iE;
                return y4Q;
            }
        }
        if (iE == 0) {
            return Z4.f5416e;
        }
        if (iE > 0) {
            int i7 = a5Var.f5425b;
            int i8 = a5Var.f5427d;
            if (iE <= i7 - i8) {
                int i9 = iE + i8;
                a5Var.f5427d = i9;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i8, i9);
                Y4 y4 = Z4.f5416e;
                return new Y4(bArrCopyOfRange);
            }
        }
        if (iE <= 0) {
            throw C0258f.c();
        }
        throw C0258f.e();
    }

    public String v() throws C0258f {
        s(2);
        a5 a5Var = (a5) this.f5441d;
        int iE = a5Var.e();
        if (iE > 0) {
            int i5 = a5Var.f5425b;
            int i6 = a5Var.f5427d;
            if (iE <= i5 - i6) {
                String str = new String((byte[]) a5Var.f5430h, i6, iE, AbstractC0246d.f5451a);
                a5Var.f5427d += iE;
                return str;
            }
        }
        if (iE == 0) {
            return "";
        }
        if (iE < 0) {
            throw C0258f.c();
        }
        throw C0258f.e();
    }

    public String w() throws C0258f {
        s(2);
        a5 a5Var = (a5) this.f5441d;
        int iE = a5Var.e();
        if (iE > 0) {
            int i5 = a5Var.f5425b;
            int i6 = a5Var.f5427d;
            if (iE <= i5 - i6) {
                String strD = O.d((byte[]) a5Var.f5430h, i6, iE);
                a5Var.f5427d += iE;
                return strD;
            }
        }
        if (iE == 0) {
            return "";
        }
        if (iE <= 0) {
            throw C0258f.c();
        }
        throw C0258f.e();
    }

    public void x(List list) throws C0258f {
        int iF;
        int i5 = this.f5438a & 7;
        a5 a5Var = (a5) this.f5441d;
        if (i5 != 0) {
            if (i5 != 2) {
                throw C0258f.a();
            }
            int iE = a5Var.f5427d + a5Var.e();
            do {
                list.add(Boolean.valueOf(a5Var.h() != 0));
            } while (a5Var.f5427d < iE);
            r(iE);
            return;
        }
        do {
            list.add(Boolean.valueOf(a5Var.h() != 0));
            if (a5Var.j()) {
                return;
            } else {
                iF = a5Var.f();
            }
        } while (iF == this.f5438a);
        this.f5440c = iF;
    }

    public void y(List list) throws C0258f {
        int iF;
        if ((this.f5438a & 7) != 2) {
            throw C0258f.a();
        }
        do {
            list.add(u());
            a5 a5Var = (a5) this.f5441d;
            if (a5Var.j()) {
                return;
            } else {
                iF = a5Var.f();
            }
        } while (iF == this.f5438a);
        this.f5440c = iF;
    }

    public void z(List list) throws C0258f {
        int iF;
        int i5 = this.f5438a & 7;
        a5 a5Var = (a5) this.f5441d;
        if (i5 == 1) {
            do {
                list.add(Double.valueOf(Double.longBitsToDouble(a5Var.g())));
                if (a5Var.j()) {
                    return;
                } else {
                    iF = a5Var.f();
                }
            } while (iF == this.f5438a);
            this.f5440c = iF;
            return;
        }
        if (i5 != 2) {
            throw C0258f.a();
        }
        int iE = a5Var.e();
        if ((iE & 7) != 0) {
            throw C0258f.d();
        }
        int i6 = a5Var.f5427d + iE;
        do {
            list.add(Double.valueOf(Double.longBitsToDouble(a5Var.g())));
        } while (a5Var.f5427d < i6);
    }
}
