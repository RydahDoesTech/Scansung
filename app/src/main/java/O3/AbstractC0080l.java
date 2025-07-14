package O3;

import java.util.Iterator;
import java.util.Map;

/* renamed from: O3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0080l extends AbstractC0079k implements x {

    /* renamed from: e, reason: collision with root package name */
    public C0078j f2082e = C0078j.f2078c;
    public boolean f;

    public final void f(AbstractC0081m abstractC0081m) {
        C c2;
        if (!this.f) {
            this.f2082e = this.f2082e.clone();
            this.f = true;
        }
        C0078j c0078j = this.f2082e;
        C0078j c0078j2 = abstractC0081m.f2083d;
        c0078j.getClass();
        int i5 = 0;
        while (true) {
            int size = c0078j2.f2079a.f2029e.size();
            c2 = c0078j2.f2079a;
            if (i5 >= size) {
                break;
            }
            c0078j.g((Map.Entry) c2.f2029e.get(i5));
            i5++;
        }
        Iterator it = c2.c().iterator();
        while (it.hasNext()) {
            c0078j.g((Map.Entry) it.next());
        }
    }
}
