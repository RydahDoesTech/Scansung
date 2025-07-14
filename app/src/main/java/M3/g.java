package M3;

import L3.i;
import L3.j;
import P2.k;
import P2.m;
import P2.n;
import P2.o;
import P2.w;
import P2.x;
import P2.y;
import P2.z;
import b3.AbstractC0219i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class g implements K3.f {

    /* renamed from: g, reason: collision with root package name */
    public static final List f1823g;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f1824d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f1825e;
    public final ArrayList f;

    static {
        String strA0 = m.A0(n.h0('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List listH0 = n.h0(strA0.concat("/Any"), strA0.concat("/Nothing"), strA0.concat("/Unit"), strA0.concat("/Throwable"), strA0.concat("/Number"), strA0.concat("/Byte"), strA0.concat("/Double"), strA0.concat("/Float"), strA0.concat("/Int"), strA0.concat("/Long"), strA0.concat("/Short"), strA0.concat("/Boolean"), strA0.concat("/Char"), strA0.concat("/CharSequence"), strA0.concat("/String"), strA0.concat("/Comparable"), strA0.concat("/Enum"), strA0.concat("/Array"), strA0.concat("/ByteArray"), strA0.concat("/DoubleArray"), strA0.concat("/FloatArray"), strA0.concat("/IntArray"), strA0.concat("/LongArray"), strA0.concat("/ShortArray"), strA0.concat("/BooleanArray"), strA0.concat("/CharArray"), strA0.concat("/Cloneable"), strA0.concat("/Annotation"), strA0.concat("/collections/Iterable"), strA0.concat("/collections/MutableIterable"), strA0.concat("/collections/Collection"), strA0.concat("/collections/MutableCollection"), strA0.concat("/collections/List"), strA0.concat("/collections/MutableList"), strA0.concat("/collections/Set"), strA0.concat("/collections/MutableSet"), strA0.concat("/collections/Map"), strA0.concat("/collections/MutableMap"), strA0.concat("/collections/Map.Entry"), strA0.concat("/collections/MutableMap.MutableEntry"), strA0.concat("/collections/Iterator"), strA0.concat("/collections/MutableIterator"), strA0.concat("/collections/ListIterator"), strA0.concat("/collections/MutableListIterator"));
        f1823g = listH0;
        k kVarS0 = m.S0(listH0);
        int iG0 = z.g0(o.l0(kVarS0));
        if (iG0 < 16) {
            iG0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG0);
        Iterator it = kVarS0.iterator();
        while (true) {
            y yVar = (y) it;
            if (!yVar.f2169e.hasNext()) {
                return;
            }
            x xVar = (x) yVar.next();
            linkedHashMap.put((String) xVar.f2167b, Integer.valueOf(xVar.f2166a));
        }
    }

    public g(j jVar, String[] strArr) {
        AbstractC0219i.e("strings", strArr);
        List list = jVar.f;
        Set setR0 = list.isEmpty() ? w.f2165d : m.R0(list);
        List<i> list2 = jVar.f1792e;
        AbstractC0219i.d("types.recordList", list2);
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (i iVar : list2) {
            int i5 = iVar.f;
            for (int i6 = 0; i6 < i5; i6++) {
                arrayList.add(iVar);
            }
        }
        arrayList.trimToSize();
        this.f1824d = strArr;
        this.f1825e = setR0;
        this.f = arrayList;
    }

    @Override // K3.f
    public final boolean P(int i5) {
        return this.f1825e.contains(Integer.valueOf(i5));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    @Override // K3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String s(int r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = r8.f
            java.lang.Object r0 = r0.get(r9)
            L3.i r0 = (L3.i) r0
            int r1 = r0.f1780e
            r2 = r1 & 4
            r3 = 2
            r4 = 4
            if (r2 != r4) goto L29
            java.lang.Object r8 = r0.f1782h
            boolean r9 = r8 instanceof java.lang.String
            if (r9 == 0) goto L19
            java.lang.String r8 = (java.lang.String) r8
            goto L43
        L19:
            O3.e r8 = (O3.AbstractC0073e) r8
            java.lang.String r9 = r8.x()
            boolean r8 = r8.r()
            if (r8 == 0) goto L27
            r0.f1782h = r9
        L27:
            r8 = r9
            goto L43
        L29:
            r1 = r1 & r3
            if (r1 != r3) goto L3f
            java.util.List r1 = M3.g.f1823g
            int r2 = r1.size()
            int r4 = r0.f1781g
            if (r4 < 0) goto L3f
            if (r4 >= r2) goto L3f
            java.lang.Object r8 = r1.get(r4)
            java.lang.String r8 = (java.lang.String) r8
            goto L43
        L3f:
            java.lang.String[] r8 = r8.f1824d
            r8 = r8[r9]
        L43:
            java.util.List r9 = r0.f1784j
            int r9 = r9.size()
            java.lang.String r1 = "this as java.lang.String…ing(startIndex, endIndex)"
            r2 = 0
            r4 = 1
            if (r9 < r3) goto L95
            java.util.List r9 = r0.f1784j
            java.lang.String r5 = "substringIndexList"
            b3.AbstractC0219i.d(r5, r9)
            java.lang.Object r5 = r9.get(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r9 = r9.get(r4)
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.String r6 = "begin"
            b3.AbstractC0219i.d(r6, r5)
            int r6 = r5.intValue()
            if (r6 < 0) goto L95
            int r6 = r5.intValue()
            java.lang.String r7 = "end"
            b3.AbstractC0219i.d(r7, r9)
            int r7 = r9.intValue()
            if (r6 > r7) goto L95
            int r6 = r9.intValue()
            int r7 = r8.length()
            if (r6 > r7) goto L95
            int r5 = r5.intValue()
            int r9 = r9.intValue()
            java.lang.String r8 = r8.substring(r5, r9)
            b3.AbstractC0219i.d(r1, r8)
        L95:
            java.util.List r9 = r0.f1786l
            int r9 = r9.size()
            java.lang.String r5 = "string"
            if (r9 < r3) goto Lc3
            java.util.List r9 = r0.f1786l
            java.lang.String r6 = "replaceCharList"
            b3.AbstractC0219i.d(r6, r9)
            java.lang.Object r2 = r9.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r9 = r9.get(r4)
            java.lang.Integer r9 = (java.lang.Integer) r9
            b3.AbstractC0219i.d(r5, r8)
            int r2 = r2.intValue()
            char r2 = (char) r2
            int r9 = r9.intValue()
            char r9 = (char) r9
            java.lang.String r8 = p4.h.m0(r8, r2, r9)
        Lc3:
            L3.h r9 = r0.f1783i
            if (r9 != 0) goto Lc9
            L3.h r9 = L3.h.NONE
        Lc9:
            int r9 = r9.ordinal()
            r0 = 46
            r2 = 36
            if (r9 == r4) goto Led
            if (r9 == r3) goto Ld6
            goto Lf4
        Ld6:
            int r9 = r8.length()
            if (r9 < r3) goto Le8
            int r9 = r8.length()
            int r9 = r9 - r4
            java.lang.String r8 = r8.substring(r4, r9)
            b3.AbstractC0219i.d(r1, r8)
        Le8:
            java.lang.String r8 = p4.h.m0(r8, r2, r0)
            goto Lf4
        Led:
            b3.AbstractC0219i.d(r5, r8)
            java.lang.String r8 = p4.h.m0(r8, r2, r0)
        Lf4:
            b3.AbstractC0219i.d(r5, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.g.s(int):java.lang.String");
    }

    @Override // K3.f
    public final String s0(int i5) {
        return s(i5);
    }
}
