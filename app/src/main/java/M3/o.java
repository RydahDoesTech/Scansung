package m3;

import e4.C0427j;
import g3.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o3.C0728k;
import p3.AbstractC0771o;
import p3.C0770n;
import p3.InterfaceC0776t;
import s3.C0827C;
import s3.C0841Q;
import s3.C0855k;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final C0827C f8155a;

    static {
        g4.j jVar = g4.j.f6837a;
        C0728k c0728k = new C0728k(g4.j.f6838b, n.f8146e, 1);
        N3.f fVarF = n.f.f();
        d4.b bVar = d4.l.f6418e;
        C0827C c0827c = new C0827C(c0728k, fVarF, bVar);
        c0827c.f8740k = 4;
        C0770n c0770n = AbstractC0771o.f8423e;
        if (c0770n == null) {
            C0827C.G(9);
            throw null;
        }
        c0827c.f8741l = c0770n;
        List listN = y.N(C0841Q.R0(c0827c, 2, N3.f.e("T"), 0, bVar));
        if (c0827c.n != null) {
            throw new IllegalStateException("Type parameters are already set for " + c0827c.getName());
        }
        ArrayList arrayList = new ArrayList(listN);
        c0827c.n = arrayList;
        c0827c.f8742m = new C0427j(c0827c, arrayList, c0827c.f8743o, c0827c.f8744p);
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            C0827C.G(13);
            throw null;
        }
        Iterator it = setEmptySet.iterator();
        while (it.hasNext()) {
            ((C0855k) ((InterfaceC0776t) it.next())).f8879j = c0827c.q();
        }
        f8155a = c0827c;
    }
}
