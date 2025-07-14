package N3;

import b3.AbstractC0219i;
import com.idm.core.tnds.IDMTndsXmlWbxmlDefine;
import com.samsung.android.knox.ucm.core.UniversalCredentialUtil;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c f1828a;

    /* renamed from: b, reason: collision with root package name */
    public final f f1829b;

    static {
        c.j(h.f);
    }

    public a(c cVar, f fVar) {
        AbstractC0219i.e(UniversalCredentialUtil.AGENT_PACKAGENAME, cVar);
        this.f1828a = cVar;
        this.f1829b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC0219i.a(this.f1828a, aVar.f1828a) && AbstractC0219i.a(null, null) && this.f1829b.equals(aVar.f1829b) && AbstractC0219i.a(null, null);
    }

    public final int hashCode() {
        return (this.f1829b.hashCode() + (this.f1828a.hashCode() * 961)) * 31;
    }

    public final String toString() {
        String str = p4.h.m0(this.f1828a.b(), '.', IDMTndsXmlWbxmlDefine.XML_SLASH) + "/" + this.f1829b;
        AbstractC0219i.d("StringBuilder().apply(builderAction).toString()", str);
        return str;
    }
}
