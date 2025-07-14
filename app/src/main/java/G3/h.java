package G3;

import I3.C;
import O3.C0083o;
import b3.AbstractC0219i;
import com.idm.core.tnds.IDMTndsXmlWbxmlDefine;
import e1.AbstractC0415a;
import u3.C0881c;
import v3.AbstractC0897d;

/* loaded from: classes.dex */
public final class h implements c4.j {

    /* renamed from: d, reason: collision with root package name */
    public final V3.b f760d;

    /* renamed from: e, reason: collision with root package name */
    public final V3.b f761e;
    public final C0881c f;

    public h(C0881c c0881c, C c2, M3.g gVar, int i5) {
        AbstractC0219i.e("kotlinClass", c0881c);
        AbstractC0219i.e("packageProto", c2);
        AbstractC0219i.e("nameResolver", gVar);
        A3.f.q(i5, "abiStability");
        V3.b bVarB = V3.b.b(AbstractC0897d.a(c0881c.f9187a));
        H3.b bVar = c0881c.f9188b;
        V3.b bVarD = null;
        String str = ((H3.a) bVar.f825d) == H3.a.MULTIFILE_CLASS_PART ? bVar.f823b : null;
        if (str != null && str.length() > 0) {
            bVarD = V3.b.d(str);
        }
        this.f760d = bVarB;
        this.f761e = bVarD;
        this.f = c0881c;
        C0083o c0083o = L3.k.f1807m;
        AbstractC0219i.d("packageModuleName", c0083o);
        Integer num = (Integer) AbstractC0415a.s(c2, c0083o);
        if (num != null) {
            gVar.s(num.intValue());
        }
    }

    public final N3.b a() {
        N3.c cVar;
        V3.b bVar = this.f760d;
        String str = bVar.f2625a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            cVar = N3.c.f1833c;
            if (cVar == null) {
                V3.b.a(7);
                throw null;
            }
        } else {
            cVar = new N3.c(str.substring(0, iLastIndexOf).replace(IDMTndsXmlWbxmlDefine.XML_SLASH, '.'));
        }
        String strE = bVar.e();
        AbstractC0219i.d("className.internalName", strE);
        return new N3.b(cVar, N3.f.e(p4.h.q0(strE, IDMTndsXmlWbxmlDefine.XML_SLASH)));
    }

    public final String toString() {
        return h.class.getSimpleName() + ": " + this.f760d;
    }
}
