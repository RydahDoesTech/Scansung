package t;

import com.google.android.gms.internal.p000firebaseauthapi.a5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.C0822d;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public s.e f8920a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8921b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8922c;

    /* renamed from: d, reason: collision with root package name */
    public s.e f8923d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f8924e;
    public a5 f;

    /* renamed from: g, reason: collision with root package name */
    public C0870b f8925g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f8926h;

    public final void a(f fVar, int i5, ArrayList arrayList, l lVar) {
        o oVar = fVar.f8930d;
        if (oVar.f8952c == null) {
            s.e eVar = this.f8920a;
            if (oVar == eVar.f8640d || oVar == eVar.f8642e) {
                return;
            }
            if (lVar == null) {
                lVar = new l();
                lVar.f8941a = null;
                lVar.f8942b = new ArrayList();
                lVar.f8941a = oVar;
                arrayList.add(lVar);
            }
            oVar.f8952c = lVar;
            lVar.f8942b.add(oVar);
            f fVar2 = oVar.f8956h;
            Iterator it = fVar2.f8936k.iterator();
            while (it.hasNext()) {
                InterfaceC0872d interfaceC0872d = (InterfaceC0872d) it.next();
                if (interfaceC0872d instanceof f) {
                    a((f) interfaceC0872d, i5, arrayList, lVar);
                }
            }
            f fVar3 = oVar.f8957i;
            Iterator it2 = fVar3.f8936k.iterator();
            while (it2.hasNext()) {
                InterfaceC0872d interfaceC0872d2 = (InterfaceC0872d) it2.next();
                if (interfaceC0872d2 instanceof f) {
                    a((f) interfaceC0872d2, i5, arrayList, lVar);
                }
            }
            if (i5 == 1 && (oVar instanceof m)) {
                Iterator it3 = ((m) oVar).f8943k.f8936k.iterator();
                while (it3.hasNext()) {
                    InterfaceC0872d interfaceC0872d3 = (InterfaceC0872d) it3.next();
                    if (interfaceC0872d3 instanceof f) {
                        a((f) interfaceC0872d3, i5, arrayList, lVar);
                    }
                }
            }
            Iterator it4 = fVar2.f8937l.iterator();
            while (it4.hasNext()) {
                a((f) it4.next(), i5, arrayList, lVar);
            }
            Iterator it5 = fVar3.f8937l.iterator();
            while (it5.hasNext()) {
                a((f) it5.next(), i5, arrayList, lVar);
            }
            if (i5 == 1 && (oVar instanceof m)) {
                Iterator it6 = ((m) oVar).f8943k.f8937l.iterator();
                while (it6.hasNext()) {
                    a((f) it6.next(), i5, arrayList, lVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(s.e r17) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.e.b(s.e):void");
    }

    public final void c() {
        ArrayList arrayList = this.f8924e;
        arrayList.clear();
        s.e eVar = this.f8923d;
        eVar.f8640d.f();
        eVar.f8642e.f();
        arrayList.add(eVar.f8640d);
        arrayList.add(eVar.f8642e);
        Iterator it = eVar.k0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C0822d c0822d = (C0822d) it.next();
            if (c0822d instanceof s.h) {
                i iVar = new i(c0822d);
                c0822d.f8640d.f();
                c0822d.f8642e.f();
                iVar.f = ((s.h) c0822d).o0;
                arrayList.add(iVar);
            } else {
                if (c0822d.t()) {
                    if (c0822d.f8636b == null) {
                        c0822d.f8636b = new C0871c(c0822d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0822d.f8636b);
                } else {
                    arrayList.add(c0822d.f8640d);
                }
                if (c0822d.u()) {
                    if (c0822d.f8638c == null) {
                        c0822d.f8638c = new C0871c(c0822d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0822d.f8638c);
                } else {
                    arrayList.add(c0822d.f8642e);
                }
                if (c0822d instanceof s.i) {
                    arrayList.add(new j(c0822d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((o) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            o oVar = (o) it3.next();
            if (oVar.f8951b != eVar) {
                oVar.d();
            }
        }
        ArrayList arrayList2 = this.f8926h;
        arrayList2.clear();
        s.e eVar2 = this.f8920a;
        e(eVar2.f8640d, 0, arrayList2);
        e(eVar2.f8642e, 1, arrayList2);
        this.f8921b = false;
    }

    public final int d(s.e eVar, int i5) {
        ArrayList arrayList;
        int i6;
        long jMax;
        float f;
        s.e eVar2 = eVar;
        ArrayList arrayList2 = this.f8926h;
        int size = arrayList2.size();
        long j5 = 0;
        int i7 = 0;
        long jMax2 = 0;
        while (i7 < size) {
            o oVar = ((l) arrayList2.get(i7)).f8941a;
            if (!(oVar instanceof C0871c) ? !(i5 != 0 ? (oVar instanceof m) : (oVar instanceof k)) : ((C0871c) oVar).f != i5) {
                f fVar = (i5 == 0 ? eVar2.f8640d : eVar2.f8642e).f8956h;
                f fVar2 = (i5 == 0 ? eVar2.f8640d : eVar2.f8642e).f8957i;
                boolean zContains = oVar.f8956h.f8937l.contains(fVar);
                f fVar3 = oVar.f8957i;
                boolean zContains2 = fVar3.f8937l.contains(fVar2);
                long j6 = oVar.j();
                f fVar4 = oVar.f8956h;
                if (zContains && zContains2) {
                    long jB = l.b(fVar4, j5);
                    arrayList = arrayList2;
                    long jA = l.a(fVar3, j5);
                    long j7 = jB - j6;
                    int i8 = fVar3.f;
                    i6 = i7;
                    if (j7 >= (-i8)) {
                        j7 += i8;
                    }
                    long j8 = fVar4.f;
                    long j9 = ((-jA) - j6) - j8;
                    if (j9 >= j8) {
                        j9 -= j8;
                    }
                    C0822d c0822d = oVar.f8951b;
                    if (i5 == 0) {
                        f = c0822d.f8631X;
                    } else if (i5 == 1) {
                        f = c0822d.f8632Y;
                    } else {
                        c0822d.getClass();
                        f = -1.0f;
                    }
                    float f5 = f > 0.0f ? (long) ((j7 / (1.0f - f)) + (j9 / f)) : 0L;
                    jMax = (fVar4.f + ((((long) ((f5 * f) + 0.5f)) + j6) + ((long) (((1.0f - f) * f5) + 0.5f)))) - fVar3.f;
                } else {
                    arrayList = arrayList2;
                    i6 = i7;
                    jMax = zContains ? Math.max(l.b(fVar4, fVar4.f), fVar4.f + j6) : zContains2 ? Math.max(-l.a(fVar3, fVar3.f), (-fVar3.f) + j6) : (oVar.j() + fVar4.f) - fVar3.f;
                }
            } else {
                arrayList = arrayList2;
                jMax = j5;
                i6 = i7;
            }
            jMax2 = Math.max(jMax2, jMax);
            i7 = i6 + 1;
            arrayList2 = arrayList;
            eVar2 = eVar;
            j5 = 0;
        }
        return (int) jMax2;
    }

    public final void e(o oVar, int i5, ArrayList arrayList) {
        f fVar;
        Iterator it = oVar.f8956h.f8936k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            fVar = oVar.f8957i;
            if (!zHasNext) {
                break;
            }
            InterfaceC0872d interfaceC0872d = (InterfaceC0872d) it.next();
            if (interfaceC0872d instanceof f) {
                a((f) interfaceC0872d, i5, arrayList, null);
            } else if (interfaceC0872d instanceof o) {
                a(((o) interfaceC0872d).f8956h, i5, arrayList, null);
            }
        }
        Iterator it2 = fVar.f8936k.iterator();
        while (it2.hasNext()) {
            InterfaceC0872d interfaceC0872d2 = (InterfaceC0872d) it2.next();
            if (interfaceC0872d2 instanceof f) {
                a((f) interfaceC0872d2, i5, arrayList, null);
            } else if (interfaceC0872d2 instanceof o) {
                a(((o) interfaceC0872d2).f8957i, i5, arrayList, null);
            }
        }
        if (i5 == 1) {
            Iterator it3 = ((m) oVar).f8943k.f8936k.iterator();
            while (it3.hasNext()) {
                InterfaceC0872d interfaceC0872d3 = (InterfaceC0872d) it3.next();
                if (interfaceC0872d3 instanceof f) {
                    a((f) interfaceC0872d3, i5, arrayList, null);
                }
            }
        }
    }

    public final void f(int i5, int i6, int i7, int i8, C0822d c0822d) {
        C0870b c0870b = this.f8925g;
        c0870b.f8909a = i5;
        c0870b.f8910b = i7;
        c0870b.f8911c = i6;
        c0870b.f8912d = i8;
        this.f.b(c0822d, c0870b);
        c0822d.H(c0870b.f8913e);
        c0822d.E(c0870b.f);
        c0822d.f8665y = c0870b.f8915h;
        c0822d.B(c0870b.f8914g);
    }

    public final void g() {
        C0869a c0869a;
        Iterator it = this.f8920a.k0.iterator();
        while (it.hasNext()) {
            C0822d c0822d = (C0822d) it.next();
            if (!c0822d.f8634a) {
                int[] iArr = c0822d.f8651j0;
                boolean z4 = false;
                int i5 = iArr[0];
                int i6 = iArr[1];
                int i7 = c0822d.f8653l;
                int i8 = c0822d.f8654m;
                boolean z5 = i5 == 2 || (i5 == 3 && i7 == 1);
                if (i6 == 2 || (i6 == 3 && i8 == 1)) {
                    z4 = true;
                }
                g gVar = c0822d.f8640d.f8954e;
                boolean z6 = gVar.f8935j;
                g gVar2 = c0822d.f8642e.f8954e;
                boolean z7 = gVar2.f8935j;
                if (z6 && z7) {
                    f(1, gVar.f8932g, 1, gVar2.f8932g, c0822d);
                    c0822d.f8634a = true;
                } else if (z6 && z4) {
                    f(1, gVar.f8932g, 2, gVar2.f8932g, c0822d);
                    if (i6 == 3) {
                        c0822d.f8642e.f8954e.f8938m = c0822d.k();
                    } else {
                        c0822d.f8642e.f8954e.d(c0822d.k());
                        c0822d.f8634a = true;
                    }
                } else if (z7 && z5) {
                    f(2, gVar.f8932g, 1, gVar2.f8932g, c0822d);
                    if (i5 == 3) {
                        c0822d.f8640d.f8954e.f8938m = c0822d.n();
                    } else {
                        c0822d.f8640d.f8954e.d(c0822d.n());
                        c0822d.f8634a = true;
                    }
                }
                if (c0822d.f8634a && (c0869a = c0822d.f8642e.f8944l) != null) {
                    c0869a.d(c0822d.f8628U);
                }
            }
        }
    }
}
