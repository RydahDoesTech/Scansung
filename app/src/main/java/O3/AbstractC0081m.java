package O3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: O3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0081m extends AbstractC0084p {

    /* renamed from: d, reason: collision with root package name */
    public final C0078j f2083d;

    public AbstractC0081m() {
        this.f2083d = new C0078j();
    }

    public final boolean i() {
        int i5 = 0;
        while (true) {
            C c2 = this.f2083d.f2079a;
            if (i5 >= c2.f2029e.size()) {
                Iterator it = c2.c().iterator();
                while (it.hasNext()) {
                    if (!C0078j.e((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!C0078j.e((Map.Entry) c2.f2029e.get(i5))) {
                return false;
            }
            i5++;
        }
    }

    public final int j() {
        C c2;
        int i5 = 0;
        int iD = 0;
        while (true) {
            c2 = this.f2083d.f2079a;
            if (i5 >= c2.f2029e.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c2.f2029e.get(i5);
            iD += C0078j.d((C0082n) entry.getKey(), entry.getValue());
            i5++;
        }
        for (Map.Entry entry2 : c2.c()) {
            iD += C0078j.d((C0082n) entry2.getKey(), entry2.getValue());
        }
        return iD;
    }

    public final Object k(C0083o c0083o) {
        o(c0083o);
        C c2 = this.f2083d.f2079a;
        C0082n c0082n = c0083o.f2089d;
        Object obj = c2.get(c0082n);
        if (obj == null) {
            return c0083o.f2087b;
        }
        if (!c0082n.f) {
            return c0083o.a(obj);
        }
        if (c0082n.f2085e.f2048d != S.ENUM) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(c0083o.a(it.next()));
        }
        return arrayList;
    }

    public final boolean l(C0083o c0083o) {
        o(c0083o);
        C0078j c0078j = this.f2083d;
        c0078j.getClass();
        C0082n c0082n = c0083o.f2089d;
        if (c0082n.f) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return c0078j.f2079a.get(c0082n) != null;
    }

    public final void m() {
        this.f2083d.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(O3.C0074f r9, A1.j r10, O3.C0077i r11, int r12) throws O3.C0086s {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.AbstractC0081m.n(O3.f, A1.j, O3.i, int):boolean");
    }

    public final void o(C0083o c0083o) {
        if (c0083o.f2086a != a()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public AbstractC0081m(AbstractC0080l abstractC0080l) {
        abstractC0080l.f2082e.f();
        abstractC0080l.f = false;
        this.f2083d = abstractC0080l.f2082e;
    }
}
