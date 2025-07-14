package j0;

import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import b0.C0198c;
import java.util.ArrayList;

/* renamed from: j0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0533b {

    /* renamed from: d, reason: collision with root package name */
    public final C0556y f7125d;

    /* renamed from: a, reason: collision with root package name */
    public final I.c f7122a = new I.c(30);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7123b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7124c = new ArrayList();
    public int f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final C0198c f7126e = new C0198c(this);

    public C0533b(C0556y c0556y) {
        this.f7125d = c0556y;
    }

    public final boolean a(int i5) {
        ArrayList arrayList = this.f7124c;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            C0532a c0532a = (C0532a) arrayList.get(i6);
            int i7 = c0532a.f7112a;
            if (i7 == 8) {
                if (f(c0532a.f7115d, i6 + 1) == i5) {
                    return true;
                }
            } else if (i7 == 1) {
                int i8 = c0532a.f7113b;
                int i9 = c0532a.f7115d + i8;
                while (i8 < i9) {
                    if (f(i8, i6 + 1) == i5) {
                        return true;
                    }
                    i8++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.f7124c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f7125d.a((C0532a) arrayList.get(i5));
        }
        k(arrayList);
        this.f = 0;
    }

    public final void c() {
        b();
        ArrayList arrayList = this.f7123b;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0532a c0532a = (C0532a) arrayList.get(i5);
            int i6 = c0532a.f7112a;
            C0556y c0556y = this.f7125d;
            if (i6 == 1) {
                c0556y.a(c0532a);
                c0556y.d(c0532a.f7113b, c0532a.f7115d);
            } else if (i6 == 2) {
                c0556y.a(c0532a);
                int i7 = c0532a.f7113b;
                int i8 = c0532a.f7115d;
                RecyclerView recyclerView = c0556y.f7319a;
                recyclerView.g0(i7, true, i8);
                recyclerView.p0 = true;
                recyclerView.m0.f7102c += i8;
            } else if (i6 == 4) {
                c0556y.a(c0532a);
                c0556y.c(c0532a.f7113b, c0532a.f7115d, c0532a.f7114c);
            } else if (i6 == 8) {
                c0556y.a(c0532a);
                c0556y.e(c0532a.f7113b, c0532a.f7115d);
            }
        }
        k(arrayList);
        this.f = 0;
    }

    public final void d(C0532a c0532a) {
        int i5;
        I.c cVar;
        int i6 = c0532a.f7112a;
        if (i6 == 1 || i6 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iL = l(c0532a.f7113b, i6);
        int i7 = c0532a.f7113b;
        int i8 = c0532a.f7112a;
        if (i8 == 2) {
            i5 = 0;
        } else {
            if (i8 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0532a);
            }
            i5 = 1;
        }
        int i9 = 1;
        int i10 = 1;
        while (true) {
            int i11 = c0532a.f7115d;
            cVar = this.f7122a;
            if (i9 >= i11) {
                break;
            }
            int iL2 = l((i5 * i9) + c0532a.f7113b, c0532a.f7112a);
            int i12 = c0532a.f7112a;
            if (i12 == 2 ? iL2 != iL : !(i12 == 4 && iL2 == iL + 1)) {
                C0532a c0532aH = h(i12, iL, i10, c0532a.f7114c);
                e(c0532aH, i7);
                c0532aH.f7114c = null;
                cVar.c(c0532aH);
                if (c0532a.f7112a == 4) {
                    i7 += i10;
                }
                i10 = 1;
                iL = iL2;
            } else {
                i10++;
            }
            i9++;
        }
        Preference preference = c0532a.f7114c;
        c0532a.f7114c = null;
        cVar.c(c0532a);
        if (i10 > 0) {
            C0532a c0532aH2 = h(c0532a.f7112a, iL, i10, preference);
            e(c0532aH2, i7);
            c0532aH2.f7114c = null;
            cVar.c(c0532aH2);
        }
    }

    public final void e(C0532a c0532a, int i5) {
        C0556y c0556y = this.f7125d;
        c0556y.a(c0532a);
        int i6 = c0532a.f7112a;
        if (i6 != 2) {
            if (i6 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0556y.c(i5, c0532a.f7115d, c0532a.f7114c);
        } else {
            int i7 = c0532a.f7115d;
            RecyclerView recyclerView = c0556y.f7319a;
            recyclerView.g0(i5, true, i7);
            recyclerView.p0 = true;
            recyclerView.m0.f7102c += i7;
        }
    }

    public final int f(int i5, int i6) {
        ArrayList arrayList = this.f7124c;
        int size = arrayList.size();
        while (i6 < size) {
            C0532a c0532a = (C0532a) arrayList.get(i6);
            int i7 = c0532a.f7112a;
            if (i7 == 8) {
                int i8 = c0532a.f7113b;
                if (i8 == i5) {
                    i5 = c0532a.f7115d;
                } else {
                    if (i8 < i5) {
                        i5--;
                    }
                    if (c0532a.f7115d <= i5) {
                        i5++;
                    }
                }
            } else {
                int i9 = c0532a.f7113b;
                if (i9 > i5) {
                    continue;
                } else if (i7 == 2) {
                    int i10 = c0532a.f7115d;
                    if (i5 < i9 + i10) {
                        return -1;
                    }
                    i5 -= i10;
                } else if (i7 == 1) {
                    i5 += c0532a.f7115d;
                }
            }
            i6++;
        }
        return i5;
    }

    public final boolean g() {
        return this.f7123b.size() > 0;
    }

    public final C0532a h(int i5, int i6, int i7, Preference preference) {
        C0532a c0532a = (C0532a) this.f7122a.a();
        if (c0532a != null) {
            c0532a.f7112a = i5;
            c0532a.f7113b = i6;
            c0532a.f7115d = i7;
            c0532a.f7114c = preference;
            return c0532a;
        }
        C0532a c0532a2 = new C0532a();
        c0532a2.f7112a = i5;
        c0532a2.f7113b = i6;
        c0532a2.f7115d = i7;
        c0532a2.f7114c = preference;
        return c0532a2;
    }

    public final void i(C0532a c0532a) {
        this.f7124c.add(c0532a);
        int i5 = c0532a.f7112a;
        C0556y c0556y = this.f7125d;
        if (i5 == 1) {
            c0556y.d(c0532a.f7113b, c0532a.f7115d);
            return;
        }
        if (i5 == 2) {
            int i6 = c0532a.f7113b;
            int i7 = c0532a.f7115d;
            RecyclerView recyclerView = c0556y.f7319a;
            recyclerView.g0(i6, false, i7);
            recyclerView.p0 = true;
            return;
        }
        if (i5 == 4) {
            c0556y.c(c0532a.f7113b, c0532a.f7115d, c0532a.f7114c);
        } else if (i5 == 8) {
            c0556y.e(c0532a.f7113b, c0532a.f7115d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0532a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.C0533b.j():void");
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0532a c0532a = (C0532a) arrayList.get(i5);
            c0532a.f7114c = null;
            this.f7122a.c(c0532a);
        }
        arrayList.clear();
    }

    public final int l(int i5, int i6) {
        int i7;
        int i8;
        ArrayList arrayList = this.f7124c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0532a c0532a = (C0532a) arrayList.get(size);
            int i9 = c0532a.f7112a;
            if (i9 == 8) {
                int i10 = c0532a.f7113b;
                int i11 = c0532a.f7115d;
                if (i10 < i11) {
                    i8 = i10;
                    i7 = i11;
                } else {
                    i7 = i10;
                    i8 = i11;
                }
                if (i5 < i8 || i5 > i7) {
                    if (i5 < i10) {
                        if (i6 == 1) {
                            c0532a.f7113b = i10 + 1;
                            c0532a.f7115d = i11 + 1;
                        } else if (i6 == 2) {
                            c0532a.f7113b = i10 - 1;
                            c0532a.f7115d = i11 - 1;
                        }
                    }
                } else if (i8 == i10) {
                    if (i6 == 1) {
                        c0532a.f7115d = i11 + 1;
                    } else if (i6 == 2) {
                        c0532a.f7115d = i11 - 1;
                    }
                    i5++;
                } else {
                    if (i6 == 1) {
                        c0532a.f7113b = i10 + 1;
                    } else if (i6 == 2) {
                        c0532a.f7113b = i10 - 1;
                    }
                    i5--;
                }
            } else {
                int i12 = c0532a.f7113b;
                if (i12 <= i5) {
                    if (i9 == 1) {
                        i5 -= c0532a.f7115d;
                    } else if (i9 == 2) {
                        i5 += c0532a.f7115d;
                    }
                } else if (i6 == 1) {
                    c0532a.f7113b = i12 + 1;
                } else if (i6 == 2) {
                    c0532a.f7113b = i12 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0532a c0532a2 = (C0532a) arrayList.get(size2);
            int i13 = c0532a2.f7112a;
            I.c cVar = this.f7122a;
            if (i13 == 8) {
                int i14 = c0532a2.f7115d;
                if (i14 == c0532a2.f7113b || i14 < 0) {
                    arrayList.remove(size2);
                    c0532a2.f7114c = null;
                    cVar.c(c0532a2);
                }
            } else if (c0532a2.f7115d <= 0) {
                arrayList.remove(size2);
                c0532a2.f7114c = null;
                cVar.c(c0532a2);
            }
        }
        return i5;
    }
}
