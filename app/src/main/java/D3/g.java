package D3;

import P2.m;
import P2.o;
import X3.n;
import b3.AbstractC0219i;
import com.idm.core.tnds.IDMTndsXmlWbxmlDefine;
import e4.AbstractC0434q;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.G;
import e4.N;
import e4.Z;
import g3.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import p4.h;

/* loaded from: classes.dex */
public final class g extends AbstractC0434q {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AbstractC0442z abstractC0442z, AbstractC0442z abstractC0442z2) {
        super(abstractC0442z, abstractC0442z2);
        AbstractC0219i.e("lowerBound", abstractC0442z);
        AbstractC0219i.e("upperBound", abstractC0442z2);
        f4.d.f6737a.b(abstractC0442z, abstractC0442z2);
    }

    public static final ArrayList R0(P3.g gVar, AbstractC0438v abstractC0438v) {
        List<N> listS0 = abstractC0438v.s0();
        ArrayList arrayList = new ArrayList(o.l0(listS0));
        for (N n : listS0) {
            gVar.getClass();
            AbstractC0219i.e("typeProjection", n);
            StringBuilder sb = new StringBuilder();
            m.z0(y.N(n), sb, null, null, new P3.f(gVar, 0), 60);
            String string = sb.toString();
            AbstractC0219i.d("StringBuilder().apply(builderAction).toString()", string);
            arrayList.add(string);
        }
        return arrayList;
    }

    public static final String S0(String str, String str2) {
        String strSubstring;
        AbstractC0219i.e("<this>", str);
        if (h.k0(str, IDMTndsXmlWbxmlDefine.XML_OPEN_TAG, 0, false, 2) < 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        AbstractC0219i.e("<this>", str);
        AbstractC0219i.e("missingDelimiterValue", str);
        int iK0 = h.k0(str, IDMTndsXmlWbxmlDefine.XML_OPEN_TAG, 0, false, 6);
        if (iK0 == -1) {
            strSubstring = str;
        } else {
            strSubstring = str.substring(0, iK0);
            AbstractC0219i.d("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        }
        sb.append(strSubstring);
        sb.append(IDMTndsXmlWbxmlDefine.XML_OPEN_TAG);
        sb.append(str2);
        sb.append(IDMTndsXmlWbxmlDefine.XML_CLOSE_TAG);
        sb.append(h.q0(str, IDMTndsXmlWbxmlDefine.XML_CLOSE_TAG));
        return sb.toString();
    }

    @Override // e4.AbstractC0438v
    public final AbstractC0438v K0(f4.f fVar) {
        AbstractC0219i.e("kotlinTypeRefiner", fVar);
        AbstractC0442z abstractC0442z = this.f6693e;
        AbstractC0219i.e("type", abstractC0442z);
        AbstractC0442z abstractC0442z2 = this.f;
        AbstractC0219i.e("type", abstractC0442z2);
        return new g(abstractC0442z, abstractC0442z2);
    }

    @Override // e4.Z
    public final Z M0(boolean z4) {
        return new g(this.f6693e.M0(z4), this.f.M0(z4));
    }

    @Override // e4.Z
    /* renamed from: N0 */
    public final Z K0(f4.f fVar) {
        AbstractC0219i.e("kotlinTypeRefiner", fVar);
        AbstractC0442z abstractC0442z = this.f6693e;
        AbstractC0219i.e("type", abstractC0442z);
        AbstractC0442z abstractC0442z2 = this.f;
        AbstractC0219i.e("type", abstractC0442z2);
        return new g(abstractC0442z, abstractC0442z2);
    }

    @Override // e4.Z
    public final Z O0(G g5) {
        AbstractC0219i.e("newAttributes", g5);
        return new g(this.f6693e.O0(g5), this.f.O0(g5));
    }

    @Override // e4.AbstractC0434q
    public final AbstractC0442z P0() {
        return this.f6693e;
    }

    @Override // e4.AbstractC0434q
    public final String Q0(P3.g gVar, P3.g gVar2) {
        AbstractC0219i.e("renderer", gVar);
        AbstractC0442z abstractC0442z = this.f6693e;
        String strW = gVar.W(abstractC0442z);
        AbstractC0442z abstractC0442z2 = this.f;
        String strW2 = gVar.W(abstractC0442z2);
        if (gVar2.f2196a.l()) {
            return "raw (" + strW + ".." + strW2 + ')';
        }
        if (abstractC0442z2.s0().isEmpty()) {
            return gVar.D(strW, strW2, V1.a.x(this));
        }
        ArrayList arrayListR0 = R0(gVar, abstractC0442z);
        ArrayList arrayListR02 = R0(gVar, abstractC0442z2);
        String strA0 = m.A0(arrayListR0, ", ", null, null, f.f513d, 30);
        ArrayList arrayListT0 = m.T0(arrayListR0, arrayListR02);
        if (arrayListT0.isEmpty()) {
            strW2 = S0(strW2, strA0);
        } else {
            Iterator it = arrayListT0.iterator();
            while (it.hasNext()) {
                O2.f fVar = (O2.f) it.next();
                String str = (String) fVar.f2006d;
                String str2 = (String) fVar.f2007e;
                if (!AbstractC0219i.a(str, h.l0(str2, "out ")) && !str2.equals("*")) {
                    break;
                }
            }
            strW2 = S0(strW2, strA0);
        }
        String strS0 = S0(strW, strA0);
        return AbstractC0219i.a(strS0, strW2) ? strS0 : gVar.D(strS0, strW2, V1.a.x(this));
    }

    @Override // e4.AbstractC0434q, e4.AbstractC0438v
    public final n p0() {
        InterfaceC0763g interfaceC0763gI = I0().i();
        InterfaceC0761e interfaceC0761e = interfaceC0763gI instanceof InterfaceC0761e ? (InterfaceC0761e) interfaceC0763gI : null;
        if (interfaceC0761e != null) {
            n nVarE0 = interfaceC0761e.E0(new e());
            AbstractC0219i.d("classDescriptor.getMemberScope(RawSubstitution())", nVarE0);
            return nVarE0;
        }
        throw new IllegalStateException(("Incorrect classifier: " + I0().i()).toString());
    }
}
