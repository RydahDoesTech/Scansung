package c4;

import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import g3.InterfaceC0466p;
import java.util.Iterator;
import java.util.List;
import q3.InterfaceC0792b;
import q3.InterfaceC0798h;

/* loaded from: classes.dex */
public class a implements InterfaceC0798h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0466p[] f5140e;

    /* renamed from: d, reason: collision with root package name */
    public final d4.i f5141d;

    static {
        b3.r rVar = b3.q.f5100a;
        f5140e = new InterfaceC0466p[]{rVar.e(new b3.n(rVar.b(a.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public a(d4.o oVar, InterfaceC0106a interfaceC0106a) {
        AbstractC0219i.e("storageManager", oVar);
        this.f5141d = new d4.i((d4.l) oVar, interfaceC0106a);
    }

    @Override // q3.InterfaceC0798h
    public final boolean e(N3.c cVar) {
        return V1.a.T(this, cVar);
    }

    @Override // q3.InterfaceC0798h
    public final InterfaceC0792b h(N3.c cVar) {
        return V1.a.w(this, cVar);
    }

    @Override // q3.InterfaceC0798h
    public boolean isEmpty() {
        return ((List) V1.a.Q(this.f5141d, f5140e[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((List) V1.a.Q(this.f5141d, f5140e[0])).iterator();
    }
}
