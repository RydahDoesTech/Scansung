package O3;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class C extends AbstractMap {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f2027i = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f2028d;

    /* renamed from: e, reason: collision with root package name */
    public List f2029e = Collections.emptyList();
    public Map f = Collections.emptyMap();

    /* renamed from: g, reason: collision with root package name */
    public boolean f2030g;

    /* renamed from: h, reason: collision with root package name */
    public volatile I f2031h;

    public C(int i5) {
        this.f2028d = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f2029e
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f2029e
            java.lang.Object r2 = r2.get(r1)
            O3.G r2 = (O3.G) r2
            java.lang.Comparable r2 = r2.f2034d
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r4 = -r0
            return r4
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L43
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f2029e
            java.lang.Object r3 = r3.get(r2)
            O3.G r3 = (O3.G) r3
            java.lang.Comparable r3 = r3.f2034d
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            return r2
        L43:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.f2030g) {
            throw new UnsupportedOperationException();
        }
    }

    public final Iterable c() {
        return this.f.isEmpty() ? F.f2033b : this.f.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f2029e.isEmpty()) {
            this.f2029e.clear();
        }
        if (this.f.isEmpty()) {
            return;
        }
        this.f.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f.containsKey(comparable);
    }

    public final SortedMap d() {
        b();
        if (this.f.isEmpty() && !(this.f instanceof TreeMap)) {
            this.f = new TreeMap();
        }
        return (SortedMap) this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((G) this.f2029e.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.f2029e.isEmpty();
        int i5 = this.f2028d;
        if (zIsEmpty && !(this.f2029e instanceof ArrayList)) {
            this.f2029e = new ArrayList(i5);
        }
        int i6 = -(iA + 1);
        if (i6 >= i5) {
            return d().put(comparable, obj);
        }
        if (this.f2029e.size() == i5) {
            G g5 = (G) this.f2029e.remove(i5 - 1);
            d().put(g5.f2034d, g5.f2035e);
        }
        this.f2029e.add(i6, new G(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f2031h == null) {
            this.f2031h = new I(this);
        }
        return this.f2031h;
    }

    public final Object f(int i5) {
        b();
        Object obj = ((G) this.f2029e.remove(i5)).f2035e;
        if (!this.f.isEmpty()) {
            Iterator it = d().entrySet().iterator();
            List list = this.f2029e;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new G(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((G) this.f2029e.get(iA)).f2035e : this.f.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return f(iA);
        }
        if (this.f.isEmpty()) {
            return null;
        }
        return this.f.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f.size() + this.f2029e.size();
    }
}
