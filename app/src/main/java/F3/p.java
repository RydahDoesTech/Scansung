package F3;

import android.view.View;
import b3.AbstractC0219i;
import com.google.android.material.chip.SeslChipGroup;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.X;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import p3.InterfaceC0767k;
import y3.EnumC0932a;
import y3.u;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f665a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f666b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f667c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f668d;

    /* renamed from: e, reason: collision with root package name */
    public Object f669e;

    public p(InterfaceC0767k interfaceC0767k, boolean z4, B3.g gVar, EnumC0932a enumC0932a, boolean z5) {
        AbstractC0219i.e("containerContext", gVar);
        this.f667c = interfaceC0767k;
        this.f665a = z4;
        this.f668d = gVar;
        this.f669e = enumC0932a;
        this.f666b = z5;
    }

    public static void b(Object obj, ArrayList arrayList, B3.d dVar) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) dVar.d(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                b(it.next(), arrayList, dVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Iterable, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static F3.i c(p3.InterfaceC0755Q r4) {
        /*
            java.lang.String r0 = "<this>"
            b3.AbstractC0219i.e(r0, r4)
            boolean r1 = r4 instanceof C3.J
            r2 = 0
            if (r1 != 0) goto Lb
            return r2
        Lb:
            java.util.List r4 = r4.getUpperBounds()
            java.lang.String r1 = "this.upperBounds"
            b3.AbstractC0219i.d(r1, r4)
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L1c
            goto Lc3
        L1c:
            java.util.Iterator r1 = r4.iterator()
        L20:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lc3
            java.lang.Object r3 = r1.next()
            h4.c r3 = (h4.c) r3
            boolean r3 = f4.g.B(r3)
            if (r3 != 0) goto L20
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L39
            goto L51
        L39:
            java.util.Iterator r1 = r4.iterator()
        L3d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L51
            java.lang.Object r3 = r1.next()
            h4.c r3 = (h4.c) r3
            F3.h r3 = f(r3)
            if (r3 == 0) goto L3d
            r1 = r4
            goto L97
        L51:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L58
            goto Lc3
        L58:
            java.util.Iterator r1 = r4.iterator()
        L5c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lc3
            java.lang.Object r3 = r1.next()
            h4.c r3 = (h4.c) r3
            b3.AbstractC0219i.e(r0, r3)
            e4.v r3 = (e4.AbstractC0438v) r3
            e4.v r3 = e4.AbstractC0420c.e(r3)
            if (r3 == 0) goto L5c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r4.iterator()
        L7c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L97
            java.lang.Object r3 = r2.next()
            h4.c r3 = (h4.c) r3
            b3.AbstractC0219i.e(r0, r3)
            e4.v r3 = (e4.AbstractC0438v) r3
            e4.v r3 = e4.AbstractC0420c.e(r3)
            if (r3 == 0) goto L7c
            r1.add(r3)
            goto L7c
        L97:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L9e
            goto Lb7
        L9e:
            java.util.Iterator r0 = r1.iterator()
        La2:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lb7
            java.lang.Object r2 = r0.next()
            h4.c r2 = (h4.c) r2
            boolean r2 = f4.g.H(r2)
            if (r2 != 0) goto La2
            F3.h r0 = F3.h.f
            goto Lb9
        Lb7:
            F3.h r0 = F3.h.f644e
        Lb9:
            F3.i r2 = new F3.i
            if (r1 == r4) goto Lbf
            r4 = 1
            goto Lc0
        Lbf:
            r4 = 0
        Lc0:
            r2.<init>(r0, r4)
        Lc3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.p.c(p3.Q):F3.i");
    }

    public static N3.e e(AbstractC0442z abstractC0442z) {
        g4.g gVar = X.f6670a;
        InterfaceC0763g interfaceC0763gI = abstractC0442z.I0().i();
        InterfaceC0761e interfaceC0761e = interfaceC0763gI instanceof InterfaceC0761e ? (InterfaceC0761e) interfaceC0763gI : null;
        if (interfaceC0761e != null) {
            return Q3.f.g(interfaceC0761e);
        }
        return null;
    }

    public static h f(h4.c cVar) {
        f4.e eVar = f4.e.f6739e;
        if (f4.g.F(eVar.z(cVar))) {
            return h.f644e;
        }
        if (f4.g.F(eVar.b0(cVar))) {
            return null;
        }
        return h.f;
    }

    public boolean a(I1.g gVar) {
        int id = gVar.getId();
        HashSet hashSet = (HashSet) this.f668d;
        if (hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        I1.g gVar2 = (I1.g) ((HashMap) this.f667c).get(Integer.valueOf(g()));
        if (gVar2 != null) {
            k(gVar2, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id));
        if (!gVar.isChecked()) {
            gVar.setChecked(true);
        }
        return zAdd;
    }

    public ArrayList d(E1.k kVar) {
        HashSet hashSet = new HashSet((HashSet) this.f668d);
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < kVar.getChildCount(); i5++) {
            View childAt = kVar.getChildAt(i5);
            if ((childAt instanceof I1.g) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int g() {
        if (this.f665a) {
            HashSet hashSet = (HashSet) this.f668d;
            if (!hashSet.isEmpty()) {
                return ((Integer) hashSet.iterator().next()).intValue();
            }
        }
        return -1;
    }

    public int[] h() {
        synchronized (this) {
            try {
                if (this.f665a && !this.f666b) {
                    int length = ((long[]) this.f667c).length;
                    int i5 = 0;
                    while (true) {
                        int i6 = 1;
                        if (i5 >= length) {
                            this.f666b = true;
                            this.f665a = false;
                            return (int[]) this.f669e;
                        }
                        boolean z4 = ((long[]) this.f667c)[i5] > 0;
                        boolean[] zArr = (boolean[]) this.f668d;
                        if (z4 != zArr[i5]) {
                            int[] iArr = (int[]) this.f669e;
                            if (!z4) {
                                i6 = 2;
                            }
                            iArr[i5] = i6;
                        } else {
                            ((int[]) this.f669e)[i5] = 0;
                        }
                        zArr[i5] = z4;
                        i5++;
                    }
                }
                return null;
            } finally {
            }
        }
    }

    public void i() {
        B.g gVar = (B.g) this.f669e;
        if (gVar != null) {
            new HashSet((HashSet) this.f668d);
            SeslChipGroup seslChipGroup = (SeslChipGroup) gVar.f95e;
            E1.i iVar = seslChipGroup.f593i;
            if (iVar != null) {
                seslChipGroup.f594j.d(seslChipGroup);
                E1.k kVar = (E1.k) ((B.g) iVar).f95e;
                if (kVar.f594j.f665a) {
                    kVar.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [O2.c, java.lang.Object] */
    public ArrayList j(h4.c cVar) {
        B3.g gVar = (B3.g) this.f668d;
        u uVar = (u) gVar.f257h.getValue();
        B3.b bVar = (B3.b) gVar.f255e;
        AbstractC0219i.e("<this>", cVar);
        a aVar = new a(cVar, bVar.f237q.b(uVar, ((AbstractC0438v) cVar).s()), null);
        B3.d dVar = new B3.d(5, this);
        ArrayList arrayList = new ArrayList(1);
        b(aVar, arrayList, dVar);
        return arrayList;
    }

    public boolean k(I1.g gVar, boolean z4) {
        int id = gVar.getId();
        HashSet hashSet = (HashSet) this.f668d;
        if (!hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z4 && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            gVar.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id));
        if (gVar.isChecked()) {
            gVar.setChecked(false);
        }
        return zRemove;
    }

    public p() {
        this.f667c = new HashMap();
        this.f668d = new HashSet();
    }

    public p(int i5) {
        long[] jArr = new long[i5];
        this.f667c = jArr;
        boolean[] zArr = new boolean[i5];
        this.f668d = zArr;
        this.f669e = new int[i5];
        Arrays.fill(jArr, 0L);
        Arrays.fill(zArr, false);
    }
}
