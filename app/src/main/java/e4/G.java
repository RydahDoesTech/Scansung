package e4;

import b3.AbstractC0219i;
import com.google.firebase.messaging.C0388e;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class G extends k4.d {

    /* renamed from: e, reason: collision with root package name */
    public static final C0388e f6646e = new C0388e(6);
    public static final G f = new G(P2.u.f2163d);

    public G(List list) {
        this.f7942d = k4.k.f7960d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0425h c0425h = (C0425h) it.next();
            c0425h.getClass();
            int iQ = f6646e.q(b3.q.f5100a.b(C0425h.class));
            int iL = this.f7942d.l();
            if (iL != 0) {
                if (iL == 1) {
                    k4.a aVar = this.f7942d;
                    AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>", aVar);
                    k4.q qVar = (k4.q) aVar;
                    int i5 = qVar.f7973e;
                    if (i5 == iQ) {
                        this.f7942d = new k4.q(iQ, c0425h);
                    } else {
                        k4.c cVar = new k4.c();
                        cVar.f7940d = new Object[20];
                        cVar.f7941e = 0;
                        this.f7942d = cVar;
                        cVar.m(i5, qVar.f7972d);
                    }
                }
                this.f7942d.m(iQ, c0425h);
            } else {
                this.f7942d = new k4.q(iQ, c0425h);
            }
        }
    }
}
