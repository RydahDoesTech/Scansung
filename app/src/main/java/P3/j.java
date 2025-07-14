package P3;

import b3.AbstractC0219i;
import com.idm.fotaagent.database.room.data.entity.Property;
import g3.InterfaceC0466p;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public Object f2214a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f2215b;

    public j(Object obj, k kVar) {
        this.f2215b = kVar;
        this.f2214a = obj;
    }

    public final Object a(InterfaceC0466p interfaceC0466p, Object obj) {
        AbstractC0219i.e(Property.TABLE_NAME, interfaceC0466p);
        return this.f2214a;
    }

    public final void b(InterfaceC0466p interfaceC0466p, Object obj) {
        AbstractC0219i.e(Property.TABLE_NAME, interfaceC0466p);
        if (this.f2215b.f2238a) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
        this.f2214a = obj;
    }
}
