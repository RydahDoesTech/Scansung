package j3;

import a3.InterfaceC0108c;
import b3.AbstractC0219i;
import com.idm.fotaagent.database.room.data.entity.Property;
import g3.InterfaceC0466p;

/* loaded from: classes.dex */
public final class b0 extends g0 implements InterfaceC0108c {

    /* renamed from: h, reason: collision with root package name */
    public final d0 f7378h;

    public b0(d0 d0Var) {
        AbstractC0219i.e(Property.TABLE_NAME, d0Var);
        this.f7378h = d0Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [O2.c, java.lang.Object] */
    @Override // a3.InterfaceC0108c
    public final Object c(Object obj, Object obj2) {
        return ((b0) this.f7378h.f7384l.getValue()).i(obj, obj2);
    }

    @Override // g3.InterfaceC0462l
    public final InterfaceC0466p getProperty() {
        return this.f7378h;
    }

    @Override // j3.e0
    public final k0 q() {
        return this.f7378h;
    }
}
