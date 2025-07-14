package j3;

import b3.AbstractC0219i;
import com.idm.fotaagent.database.room.data.entity.Property;
import g3.InterfaceC0458h;
import g3.InterfaceC0466p;

/* loaded from: classes.dex */
public final class I extends i0 implements InterfaceC0458h {

    /* renamed from: h, reason: collision with root package name */
    public final J f7337h;

    public I(J j5) {
        AbstractC0219i.e(Property.TABLE_NAME, j5);
        this.f7337h = j5;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [O2.c, java.lang.Object] */
    @Override // a3.InterfaceC0108c
    public final Object c(Object obj, Object obj2) throws V1.h {
        ((I) this.f7337h.f7338m.getValue()).i(obj, obj2);
        return O2.l.f2016a;
    }

    @Override // g3.InterfaceC0462l
    public final InterfaceC0466p getProperty() {
        return this.f7337h;
    }

    @Override // j3.e0
    public final k0 q() {
        return this.f7337h;
    }
}
