package j3;

import O3.C0083o;
import b3.AbstractC0219i;
import com.idm.core.tnds.IDMTndsXmlWbxmlDefine;
import e1.AbstractC0415a;
import java.util.regex.Pattern;
import p3.AbstractC0771o;
import p3.InterfaceC0742D;
import p3.InterfaceC0750L;
import p3.InterfaceC0766j;

/* renamed from: j3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0573m extends s0 {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0750L f7410e;
    public final I3.G f;

    /* renamed from: g, reason: collision with root package name */
    public final L3.e f7411g;

    /* renamed from: h, reason: collision with root package name */
    public final K3.f f7412h;

    /* renamed from: i, reason: collision with root package name */
    public final K3.g f7413i;

    /* renamed from: j, reason: collision with root package name */
    public final String f7414j;

    public C0573m(InterfaceC0750L interfaceC0750L, I3.G g5, L3.e eVar, K3.f fVar, K3.g gVar) {
        String string;
        G3.h hVar;
        String string2;
        AbstractC0219i.e("proto", g5);
        AbstractC0219i.e("nameResolver", fVar);
        AbstractC0219i.e("typeTable", gVar);
        this.f7410e = interfaceC0750L;
        this.f = g5;
        this.f7411g = eVar;
        this.f7412h = fVar;
        this.f7413i = gVar;
        if ((eVar.f1758e & 4) == 4) {
            string2 = fVar.s(eVar.f1760h.f).concat(fVar.s(eVar.f1760h.f1748g));
        } else {
            M3.d dVarB = M3.h.b(g5, fVar, gVar, true);
            if (dVarB == null) {
                throw new O2.e("No field signature for property: " + interfaceC0750L, 2);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(y3.w.a(dVarB.f1817c));
            InterfaceC0766j interfaceC0766jL = interfaceC0750L.l();
            AbstractC0219i.d("descriptor.containingDeclaration", interfaceC0766jL);
            if (AbstractC0219i.a(interfaceC0750L.b(), AbstractC0771o.f8422d) && (interfaceC0766jL instanceof c4.i)) {
                C0083o c0083o = L3.k.f1803i;
                AbstractC0219i.d("classModuleName", c0083o);
                Integer num = (Integer) AbstractC0415a.s(((c4.i) interfaceC0766jL).f5159h, c0083o);
                String strS = num != null ? fVar.s(num.intValue()) : "main";
                b3.p pVar = N3.g.f1844a;
                pVar.getClass();
                String strReplaceAll = ((Pattern) pVar.f5099e).matcher(strS).replaceAll("_");
                AbstractC0219i.d("nativePattern.matcher(in…).replaceAll(replacement)", strReplaceAll);
                string = "$".concat(strReplaceAll);
            } else if (!AbstractC0219i.a(interfaceC0750L.b(), AbstractC0771o.f8419a) || !(interfaceC0766jL instanceof InterfaceC0742D) || (hVar = ((c4.q) interfaceC0750L).f5200H) == null || hVar.f761e == null) {
                string = "";
            } else {
                StringBuilder sb2 = new StringBuilder("$");
                String strE = hVar.f760d.e();
                AbstractC0219i.d("className.internalName", strE);
                sb2.append(N3.f.e(p4.h.q0(strE, IDMTndsXmlWbxmlDefine.XML_SLASH)).b());
                string = sb2.toString();
            }
            sb.append(string);
            sb.append("()");
            sb.append(dVarB.f1818d);
            string2 = sb.toString();
        }
        this.f7414j = string2;
    }

    @Override // j3.s0
    public final String d() {
        return this.f7414j;
    }
}
