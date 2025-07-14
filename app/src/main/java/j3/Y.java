package j3;

import b3.AbstractC0219i;
import com.idm.fotaagent.database.room.data.entity.Property;
import g3.InterfaceC0464n;
import g3.InterfaceC0466p;

/* loaded from: classes.dex */
public final class Y extends g0 implements InterfaceC0464n {

    /* renamed from: h, reason: collision with root package name */
    public final a0 f7364h;

    public Y(a0 a0Var) {
        AbstractC0219i.e(Property.TABLE_NAME, a0Var);
        this.f7364h = a0Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [O2.c, java.lang.Object] */
    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        return ((Y) this.f7364h.f7368l.getValue()).i(obj);
    }

    @Override // g3.InterfaceC0462l
    public final InterfaceC0466p getProperty() {
        return this.f7364h;
    }

    @Override // j3.e0
    public final k0 q() {
        return this.f7364h;
    }
}
