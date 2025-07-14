package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class f implements Iterable {

    /* renamed from: d, reason: collision with root package name */
    public c f8033d;

    /* renamed from: e, reason: collision with root package name */
    public c f8034e;
    public final WeakHashMap f = new WeakHashMap();

    /* renamed from: g, reason: collision with root package name */
    public int f8035g = 0;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((m.b) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof m.f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            m.f r6 = (m.f) r6
            int r1 = r5.f8035g
            int r3 = r6.f8035g
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L1b:
            r1 = r5
            m.b r1 = (m.b) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            r3 = r6
            m.b r3 = (m.b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L3b
            if (r3 != 0) goto L43
        L3b:
            if (r1 == 0) goto L1b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L53
            m.b r6 = (m.b) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f8033d, this.f8034e, 0);
        this.f.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public c l(Object obj) {
        c cVar = this.f8033d;
        while (cVar != null && !cVar.f8028d.equals(obj)) {
            cVar = cVar.f;
        }
        return cVar;
    }

    public Object m(Object obj, Object obj2) {
        c cVarL = l(obj);
        if (cVarL != null) {
            return cVarL.f8029e;
        }
        c cVar = new c(obj, obj2);
        this.f8035g++;
        c cVar2 = this.f8034e;
        if (cVar2 == null) {
            this.f8033d = cVar;
            this.f8034e = cVar;
            return null;
        }
        cVar2.f = cVar;
        cVar.f8030g = cVar2;
        this.f8034e = cVar;
        return null;
    }

    public Object n(Object obj) {
        c cVarL = l(obj);
        if (cVarL == null) {
            return null;
        }
        this.f8035g--;
        WeakHashMap weakHashMap = this.f;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(cVarL);
            }
        }
        c cVar = cVarL.f8030g;
        if (cVar != null) {
            cVar.f = cVarL.f;
        } else {
            this.f8033d = cVarL.f;
        }
        c cVar2 = cVarL.f;
        if (cVar2 != null) {
            cVar2.f8030g = cVar;
        } else {
            this.f8034e = cVar;
        }
        cVarL.f = null;
        cVarL.f8030g = null;
        return cVarL.f8029e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
