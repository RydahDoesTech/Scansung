package j3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import com.idm.fotaagent.database.room.data.entity.Property;
import g3.InterfaceC0466p;

/* loaded from: classes.dex */
public final class G extends i0 implements InterfaceC0107b {

    /* renamed from: h, reason: collision with root package name */
    public final H f7335h;

    public G(H h3) {
        AbstractC0219i.e(Property.TABLE_NAME, h3);
        this.f7335h = h3;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [O2.c, java.lang.Object] */
    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) throws V1.h {
        ((G) this.f7335h.f7336m.getValue()).i(obj);
        return O2.l.f2016a;
    }

    @Override // g3.InterfaceC0462l
    public final InterfaceC0466p getProperty() {
        return this.f7335h;
    }

    @Override // j3.e0
    public final k0 q() {
        return this.f7335h;
    }
}
