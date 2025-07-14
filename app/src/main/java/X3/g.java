package X3;

import b3.AbstractC0219i;
import java.util.ArrayList;
import p3.InterfaceC0759c;

/* loaded from: classes.dex */
public final class g extends Q3.q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2778b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f2779c;

    public g(ArrayList arrayList, h hVar) {
        this.f2778b = arrayList;
        this.f2779c = hVar;
    }

    @Override // Q3.q
    public final void b(InterfaceC0759c interfaceC0759c) {
        AbstractC0219i.e("fakeOverride", interfaceC0759c);
        Q3.p.r(interfaceC0759c, null);
        this.f2778b.add(interfaceC0759c);
    }

    @Override // Q3.q
    public final void d(InterfaceC0759c interfaceC0759c, InterfaceC0759c interfaceC0759c2) {
        AbstractC0219i.e("fromCurrent", interfaceC0759c2);
        throw new IllegalStateException(("Conflict in scope of " + this.f2779c.f2781b + ": " + interfaceC0759c + " vs " + interfaceC0759c2).toString());
    }
}
