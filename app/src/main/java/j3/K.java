package j3;

import a3.InterfaceC0109d;
import b3.AbstractC0219i;
import com.idm.fotaagent.database.room.data.entity.Property;
import e4.AbstractC0438v;
import g3.InterfaceC0466p;

/* loaded from: classes.dex */
public final class K extends i0 implements InterfaceC0109d {

    /* renamed from: h, reason: collision with root package name */
    public final L f7339h;

    public K(L l4) {
        AbstractC0219i.e(Property.TABLE_NAME, l4);
        this.f7339h = l4;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [O2.c, java.lang.Object] */
    @Override // a3.InterfaceC0109d
    public final Object b(AbstractC0438v abstractC0438v, Object obj, G3.r rVar) throws V1.h {
        ((K) this.f7339h.f7340m.getValue()).i(abstractC0438v, obj, rVar);
        return O2.l.f2016a;
    }

    @Override // g3.InterfaceC0462l
    public final InterfaceC0466p getProperty() {
        return this.f7339h;
    }

    @Override // j3.e0
    public final k0 q() {
        return this.f7339h;
    }
}
