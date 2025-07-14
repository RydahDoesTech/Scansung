package t;

import com.google.android.gms.internal.p000firebaseauthapi.a5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.C0821c;
import s.C0822d;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0870b f8939a = new C0870b();

    public static boolean a(C0822d c0822d) {
        int[] iArr = c0822d.f8651j0;
        int i5 = iArr[0];
        int i6 = iArr[1];
        C0822d c0822d2 = c0822d.f8621N;
        s.e eVar = c0822d2 != null ? (s.e) c0822d2 : null;
        if (eVar != null) {
            int i7 = eVar.f8651j0[0];
        }
        if (eVar != null) {
            int i8 = eVar.f8651j0[1];
        }
        boolean z4 = i5 == 1 || i5 == 2 || (i5 == 3 && c0822d.f8653l == 0 && c0822d.f8624Q == 0.0f && c0822d.q(0)) || c0822d.w();
        boolean z5 = i6 == 1 || i6 == 2 || (i6 == 3 && c0822d.f8654m == 0 && c0822d.f8624Q == 0.0f && c0822d.q(1)) || c0822d.x();
        if (c0822d.f8624Q <= 0.0f || !(z4 || z5)) {
            return z4 && z5;
        }
        return true;
    }

    public static n b(C0822d c0822d, int i5, ArrayList arrayList, n nVar) {
        int i6;
        int i7 = i5 == 0 ? c0822d.f8647h0 : c0822d.f8649i0;
        if (i7 != -1 && (nVar == null || i7 != nVar.f8946b)) {
            int i8 = 0;
            while (true) {
                if (i8 >= arrayList.size()) {
                    break;
                }
                n nVar2 = (n) arrayList.get(i8);
                if (nVar2.f8946b == i7) {
                    if (nVar != null) {
                        nVar.c(i5, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                } else {
                    i8++;
                }
            }
        } else if (i7 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if (c0822d instanceof s.i) {
                s.i iVar = (s.i) c0822d;
                int i9 = 0;
                while (true) {
                    if (i9 >= iVar.l0) {
                        i6 = -1;
                        break;
                    }
                    C0822d c0822d2 = iVar.k0[i9];
                    if ((i5 == 0 && (i6 = c0822d2.f8647h0) != -1) || (i5 == 1 && (i6 = c0822d2.f8649i0) != -1)) {
                        break;
                    }
                    i9++;
                }
                if (i6 != -1) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        }
                        n nVar3 = (n) arrayList.get(i10);
                        if (nVar3.f8946b == i6) {
                            nVar = nVar3;
                            break;
                        }
                        i10++;
                    }
                }
            }
            if (nVar == null) {
                nVar = new n();
                nVar.f8945a = new ArrayList();
                nVar.f8948d = null;
                nVar.f8949e = -1;
                int i11 = n.f;
                n.f = i11 + 1;
                nVar.f8946b = i11;
                nVar.f8947c = i5;
            }
            arrayList.add(nVar);
        }
        ArrayList arrayList2 = nVar.f8945a;
        if (!arrayList2.contains(c0822d)) {
            arrayList2.add(c0822d);
            if (c0822d instanceof s.h) {
                s.h hVar = (s.h) c0822d;
                hVar.n0.c(hVar.o0 == 0 ? 1 : 0, arrayList, nVar);
            }
            int i12 = nVar.f8946b;
            if (i5 == 0) {
                c0822d.f8647h0 = i12;
                c0822d.f8611C.c(i5, arrayList, nVar);
                c0822d.E.c(i5, arrayList, nVar);
            } else {
                c0822d.f8649i0 = i12;
                c0822d.f8612D.c(i5, arrayList, nVar);
                c0822d.f8614G.c(i5, arrayList, nVar);
                c0822d.f8613F.c(i5, arrayList, nVar);
            }
            c0822d.f8617J.c(i5, arrayList, nVar);
        }
        return nVar;
    }

    public static void c(a5 a5Var, C0822d c0822d, boolean z4) {
        HashSet hashSet;
        C0821c c0821c;
        C0821c c0821c2;
        C0821c c0821c3;
        C0821c c0821c4;
        C0821c c0821c5;
        if (!(c0822d instanceof s.e) && c0822d.v() && a(c0822d)) {
            s.e.P(c0822d, a5Var, new C0870b());
        }
        C0821c c0821cI = c0822d.i(2);
        C0821c c0821cI2 = c0822d.i(4);
        int iD = c0821cI.d();
        int iD2 = c0821cI2.d();
        HashSet hashSet2 = c0821cI.f8601a;
        char c2 = 0;
        if (hashSet2 != null && c0821cI.f8603c) {
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                C0821c c0821c6 = (C0821c) it.next();
                C0822d c0822d2 = c0821c6.f8604d;
                boolean zA = a(c0822d2);
                if (c0822d2.v() && zA) {
                    s.e.P(c0822d2, a5Var, new C0870b());
                }
                int i5 = c0822d2.f8651j0[c2];
                C0821c c0821c7 = c0822d2.f8611C;
                C0821c c0821c8 = c0822d2.E;
                if (i5 != 3 || zA) {
                    if (!c0822d2.v()) {
                        if (c0821c6 == c0821c7 && c0821c8.f == null) {
                            int iE = c0821c7.e() + iD;
                            c0822d2.C(iE, c0822d2.n() + iE);
                            c(a5Var, c0822d2, z4);
                        } else if (c0821c6 == c0821c8 && c0821c7.f == null) {
                            int iE2 = iD - c0821c8.e();
                            c0822d2.C(iE2 - c0822d2.n(), iE2);
                            c(a5Var, c0822d2, z4);
                        } else if (c0821c6 == c0821c7 && (c0821c3 = c0821c8.f) != null && c0821c3.f8603c && !c0822d2.t()) {
                            d(a5Var, c0822d2, z4);
                        }
                    }
                } else if (i5 == 3 && c0822d2.f8656p >= 0 && c0822d2.f8655o >= 0 && ((c0822d2.f8635a0 == 8 || (c0822d2.f8653l == 0 && c0822d2.f8624Q == 0.0f)) && !c0822d2.t() && !c0822d2.f8666z && (((c0821c6 == c0821c7 && (c0821c5 = c0821c8.f) != null && c0821c5.f8603c) || (c0821c6 == c0821c8 && (c0821c4 = c0821c7.f) != null && c0821c4.f8603c)) && !c0822d2.t()))) {
                    e(c0822d, a5Var, c0822d2, z4);
                }
                c2 = 0;
            }
        }
        if ((c0822d instanceof s.h) || (hashSet = c0821cI2.f8601a) == null || !c0821cI2.f8603c) {
            return;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            C0821c c0821c9 = (C0821c) it2.next();
            C0822d c0822d3 = c0821c9.f8604d;
            boolean zA2 = a(c0822d3);
            if (c0822d3.v() && zA2) {
                s.e.P(c0822d3, a5Var, new C0870b());
            }
            C0821c c0821c10 = c0822d3.f8611C;
            C0821c c0821c11 = c0822d3.E;
            boolean z5 = (c0821c9 == c0821c10 && (c0821c2 = c0821c11.f) != null && c0821c2.f8603c) || (c0821c9 == c0821c11 && (c0821c = c0821c10.f) != null && c0821c.f8603c);
            int i6 = c0822d3.f8651j0[0];
            if (i6 != 3 || zA2) {
                if (!c0822d3.v()) {
                    if (c0821c9 == c0821c10 && c0821c11.f == null) {
                        int iE3 = c0821c10.e() + iD2;
                        c0822d3.C(iE3, c0822d3.n() + iE3);
                        c(a5Var, c0822d3, z4);
                    } else if (c0821c9 == c0821c11 && c0821c10.f == null) {
                        int iE4 = iD2 - c0821c11.e();
                        c0822d3.C(iE4 - c0822d3.n(), iE4);
                        c(a5Var, c0822d3, z4);
                    } else if (z5 && !c0822d3.t()) {
                        d(a5Var, c0822d3, z4);
                    }
                }
            } else if (i6 == 3 && c0822d3.f8656p >= 0 && c0822d3.f8655o >= 0 && (c0822d3.f8635a0 == 8 || (c0822d3.f8653l == 0 && c0822d3.f8624Q == 0.0f))) {
                if (!c0822d3.t() && !c0822d3.f8666z && z5 && !c0822d3.t()) {
                    e(c0822d, a5Var, c0822d3, z4);
                }
            }
        }
    }

    public static void d(a5 a5Var, C0822d c0822d, boolean z4) {
        float f = c0822d.f8631X;
        C0821c c0821c = c0822d.f8611C;
        int iD = c0821c.f.d();
        C0821c c0821c2 = c0822d.E;
        int iD2 = c0821c2.f.d();
        int iE = c0821c.e() + iD;
        int iE2 = iD2 - c0821c2.e();
        if (iD == iD2) {
            f = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iN = c0822d.n();
        int i5 = (iD2 - iD) - iN;
        if (iD > iD2) {
            i5 = (iD - iD2) - iN;
        }
        int i6 = ((int) ((f * i5) + 0.5f)) + iD;
        int i7 = i6 + iN;
        if (iD > iD2) {
            i7 = i6 - iN;
        }
        c0822d.C(i6, i7);
        c(a5Var, c0822d, z4);
    }

    public static void e(C0822d c0822d, a5 a5Var, C0822d c0822d2, boolean z4) {
        float f = c0822d2.f8631X;
        C0821c c0821c = c0822d2.f8611C;
        int iE = c0821c.e() + c0821c.f.d();
        C0821c c0821c2 = c0822d2.E;
        int iD = c0821c2.f.d() - c0821c2.e();
        if (iD >= iE) {
            int iN = c0822d2.n();
            if (c0822d2.f8635a0 != 8) {
                int i5 = c0822d2.f8653l;
                if (i5 == 2) {
                    iN = (int) (c0822d2.f8631X * 0.5f * (c0822d instanceof s.e ? c0822d.n() : c0822d.f8621N.n()));
                } else if (i5 == 0) {
                    iN = iD - iE;
                }
                iN = Math.max(c0822d2.f8655o, iN);
                int i6 = c0822d2.f8656p;
                if (i6 > 0) {
                    iN = Math.min(i6, iN);
                }
            }
            int i7 = iE + ((int) ((f * ((iD - iE) - iN)) + 0.5f));
            c0822d2.C(i7, iN + i7);
            c(a5Var, c0822d2, z4);
        }
    }

    public static void f(a5 a5Var, C0822d c0822d) {
        float f = c0822d.f8632Y;
        C0821c c0821c = c0822d.f8612D;
        int iD = c0821c.f.d();
        C0821c c0821c2 = c0822d.f8613F;
        int iD2 = c0821c2.f.d();
        int iE = c0821c.e() + iD;
        int iE2 = iD2 - c0821c2.e();
        if (iD == iD2) {
            f = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = c0822d.k();
        int i5 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i5 = (iD - iD2) - iK;
        }
        int i6 = (int) ((f * i5) + 0.5f);
        int i7 = iD + i6;
        int i8 = i7 + iK;
        if (iD > iD2) {
            i7 = iD - i6;
            i8 = i7 - iK;
        }
        c0822d.D(i7, i8);
        i(a5Var, c0822d);
    }

    public static void g(C0822d c0822d, a5 a5Var, C0822d c0822d2) {
        float f = c0822d2.f8632Y;
        C0821c c0821c = c0822d2.f8612D;
        int iE = c0821c.e() + c0821c.f.d();
        C0821c c0821c2 = c0822d2.f8613F;
        int iD = c0821c2.f.d() - c0821c2.e();
        if (iD >= iE) {
            int iK = c0822d2.k();
            if (c0822d2.f8635a0 != 8) {
                int i5 = c0822d2.f8654m;
                if (i5 == 2) {
                    iK = (int) (f * 0.5f * (c0822d instanceof s.e ? c0822d.k() : c0822d.f8621N.k()));
                } else if (i5 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(c0822d2.f8658r, iK);
                int i6 = c0822d2.f8659s;
                if (i6 > 0) {
                    iK = Math.min(i6, iK);
                }
            }
            int i7 = iE + ((int) ((f * ((iD - iE) - iK)) + 0.5f));
            c0822d2.D(i7, iK + i7);
            i(a5Var, c0822d2);
        }
    }

    public static boolean h(int i5, int i6, int i7, int i8) {
        return (i7 == 1 || i7 == 2 || (i7 == 4 && i5 != 2)) || (i8 == 1 || i8 == 2 || (i8 == 4 && i6 != 2));
    }

    public static void i(a5 a5Var, C0822d c0822d) {
        C0821c c0821c;
        C0821c c0821c2;
        C0821c c0821c3;
        C0821c c0821c4;
        C0821c c0821c5;
        C0821c c0821c6;
        if (!(c0822d instanceof s.e) && c0822d.v() && a(c0822d)) {
            s.e.P(c0822d, a5Var, new C0870b());
        }
        C0821c c0821cI = c0822d.i(3);
        C0821c c0821cI2 = c0822d.i(5);
        int iD = c0821cI.d();
        int iD2 = c0821cI2.d();
        HashSet hashSet = c0821cI.f8601a;
        if (hashSet != null && c0821cI.f8603c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0821c c0821c7 = (C0821c) it.next();
                C0822d c0822d2 = c0821c7.f8604d;
                boolean zA = a(c0822d2);
                if (c0822d2.v() && zA) {
                    s.e.P(c0822d2, a5Var, new C0870b());
                }
                int i5 = c0822d2.f8651j0[1];
                C0821c c0821c8 = c0822d2.f8612D;
                C0821c c0821c9 = c0822d2.f8613F;
                if (i5 != 3 || zA) {
                    if (!c0822d2.v()) {
                        if (c0821c7 == c0821c8 && c0821c9.f == null) {
                            int iE = c0821c8.e() + iD;
                            c0822d2.D(iE, c0822d2.k() + iE);
                            i(a5Var, c0822d2);
                        } else if (c0821c7 == c0821c9 && c0821c9.f == null) {
                            int iE2 = iD - c0821c9.e();
                            c0822d2.D(iE2 - c0822d2.k(), iE2);
                            i(a5Var, c0822d2);
                        } else if (c0821c7 == c0821c8 && (c0821c4 = c0821c9.f) != null && c0821c4.f8603c) {
                            f(a5Var, c0822d2);
                        }
                    }
                } else if (i5 == 3 && c0822d2.f8659s >= 0 && c0822d2.f8658r >= 0 && (c0822d2.f8635a0 == 8 || (c0822d2.f8654m == 0 && c0822d2.f8624Q == 0.0f))) {
                    if (!c0822d2.u() && !c0822d2.f8666z && ((c0821c7 == c0821c8 && (c0821c6 = c0821c9.f) != null && c0821c6.f8603c) || (c0821c7 == c0821c9 && (c0821c5 = c0821c8.f) != null && c0821c5.f8603c))) {
                        if (!c0822d2.u()) {
                            g(c0822d, a5Var, c0822d2);
                        }
                    }
                }
            }
        }
        if (c0822d instanceof s.h) {
            return;
        }
        HashSet hashSet2 = c0821cI2.f8601a;
        if (hashSet2 != null && c0821cI2.f8603c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0821c c0821c10 = (C0821c) it2.next();
                C0822d c0822d3 = c0821c10.f8604d;
                boolean zA2 = a(c0822d3);
                if (c0822d3.v() && zA2) {
                    s.e.P(c0822d3, a5Var, new C0870b());
                }
                C0821c c0821c11 = c0822d3.f8612D;
                C0821c c0821c12 = c0822d3.f8613F;
                boolean z4 = (c0821c10 == c0821c11 && (c0821c3 = c0821c12.f) != null && c0821c3.f8603c) || (c0821c10 == c0821c12 && (c0821c2 = c0821c11.f) != null && c0821c2.f8603c);
                int i6 = c0822d3.f8651j0[1];
                if (i6 != 3 || zA2) {
                    if (!c0822d3.v()) {
                        if (c0821c10 == c0821c11 && c0821c12.f == null) {
                            int iE3 = c0821c11.e() + iD2;
                            c0822d3.D(iE3, c0822d3.k() + iE3);
                            i(a5Var, c0822d3);
                        } else if (c0821c10 == c0821c12 && c0821c11.f == null) {
                            int iE4 = iD2 - c0821c12.e();
                            c0822d3.D(iE4 - c0822d3.k(), iE4);
                            i(a5Var, c0822d3);
                        } else if (z4 && !c0822d3.u()) {
                            f(a5Var, c0822d3);
                        }
                    }
                } else if (i6 == 3 && c0822d3.f8659s >= 0 && c0822d3.f8658r >= 0 && (c0822d3.f8635a0 == 8 || (c0822d3.f8654m == 0 && c0822d3.f8624Q == 0.0f))) {
                    if (!c0822d3.u() && !c0822d3.f8666z && z4 && !c0822d3.u()) {
                        g(c0822d, a5Var, c0822d3);
                    }
                }
            }
        }
        C0821c c0821cI3 = c0822d.i(6);
        if (c0821cI3.f8601a == null || !c0821cI3.f8603c) {
            return;
        }
        int iD3 = c0821cI3.d();
        Iterator it3 = c0821cI3.f8601a.iterator();
        while (it3.hasNext()) {
            C0821c c0821c13 = (C0821c) it3.next();
            C0822d c0822d4 = c0821c13.f8604d;
            boolean zA3 = a(c0822d4);
            if (c0822d4.v() && zA3) {
                s.e.P(c0822d4, a5Var, new C0870b());
            }
            if (c0822d4.f8651j0[1] != 3 || zA3) {
                if (!c0822d4.v() && c0821c13 == (c0821c = c0822d4.f8614G)) {
                    if (c0822d4.f8665y) {
                        int i7 = iD3 - c0822d4.f8628U;
                        int i8 = c0822d4.f8623P + i7;
                        c0822d4.f8627T = i7;
                        c0822d4.f8612D.l(i7);
                        c0822d4.f8613F.l(i8);
                        c0821c.l(iD3);
                        c0822d4.f8648i = true;
                    }
                    i(a5Var, c0822d4);
                }
            }
        }
    }
}
