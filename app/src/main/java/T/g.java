package t;

import java.util.Iterator;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f8938m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.f8931e = 2;
        } else {
            this.f8931e = 3;
        }
    }

    @Override // t.f
    public final void d(int i5) {
        if (this.f8935j) {
            return;
        }
        this.f8935j = true;
        this.f8932g = i5;
        Iterator it = this.f8936k.iterator();
        while (it.hasNext()) {
            InterfaceC0872d interfaceC0872d = (InterfaceC0872d) it.next();
            interfaceC0872d.a(interfaceC0872d);
        }
    }
}
