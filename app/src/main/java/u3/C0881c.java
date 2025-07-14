package u3;

import b3.AbstractC0219i;
import com.idm.core.tnds.IDMTndsXmlWbxmlDefine;
import p4.h;

/* renamed from: u3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0881c {

    /* renamed from: a, reason: collision with root package name */
    public final Class f9187a;

    /* renamed from: b, reason: collision with root package name */
    public final H3.b f9188b;

    public C0881c(Class cls, H3.b bVar) {
        this.f9187a = cls;
        this.f9188b = bVar;
    }

    public final String a() {
        return h.m0(this.f9187a.getName(), '.', IDMTndsXmlWbxmlDefine.XML_SLASH).concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0881c) {
            if (AbstractC0219i.a(this.f9187a, ((C0881c) obj).f9187a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9187a.hashCode();
    }

    public final String toString() {
        return C0881c.class.getName() + ": " + this.f9187a;
    }
}
