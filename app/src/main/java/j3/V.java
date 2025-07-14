package j3;

import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import com.idm.fotaagent.database.room.data.entity.Property;
import g3.InterfaceC0466p;

/* loaded from: classes.dex */
public final class V extends g0 implements InterfaceC0106a {

    /* renamed from: h, reason: collision with root package name */
    public final X f7360h;

    public V(X x4) {
        AbstractC0219i.e(Property.TABLE_NAME, x4);
        this.f7360h = x4;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [O2.c, java.lang.Object] */
    @Override // a3.InterfaceC0106a
    public final Object a() {
        return ((V) this.f7360h.f7363l.getValue()).i(new Object[0]);
    }

    @Override // g3.InterfaceC0462l
    public final InterfaceC0466p getProperty() {
        return this.f7360h;
    }

    @Override // j3.e0
    public final k0 q() {
        return this.f7360h;
    }
}
