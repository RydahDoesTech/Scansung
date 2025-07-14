package P3;

import P2.A;
import b3.AbstractC0219i;
import e1.AbstractC0415a;
import java.util.ArrayList;
import p3.InterfaceC0742D;
import p3.InterfaceC0755Q;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import p3.InterfaceC0766j;
import s3.AbstractC0828D;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final b f2173b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f2174c = new b(1);

    /* renamed from: d, reason: collision with root package name */
    public static final b f2175d = new b(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2176a;

    public /* synthetic */ b(int i5) {
        this.f2176a = i5;
    }

    public static String b(InterfaceC0763g interfaceC0763g) {
        String strO;
        N3.f name = interfaceC0763g.getName();
        AbstractC0219i.d("descriptor.name", name);
        String strN = AbstractC0415a.N(name);
        if (interfaceC0763g instanceof InterfaceC0755Q) {
            return strN;
        }
        InterfaceC0766j interfaceC0766jL = interfaceC0763g.l();
        AbstractC0219i.d("descriptor.containingDeclaration", interfaceC0766jL);
        if (interfaceC0766jL instanceof InterfaceC0761e) {
            strO = b((InterfaceC0763g) interfaceC0766jL);
        } else if (interfaceC0766jL instanceof InterfaceC0742D) {
            N3.e eVarI = ((AbstractC0828D) ((InterfaceC0742D) interfaceC0766jL)).f8745h.i();
            AbstractC0219i.d("descriptor.fqName.toUnsafe()", eVarI);
            strO = AbstractC0415a.O(eVarI.e());
        } else {
            strO = null;
        }
        if (strO == null || strO.equals("")) {
            return strN;
        }
        return strO + '.' + strN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [p3.g, p3.j] */
    /* JADX WARN: Type inference failed for: r1v5, types: [p3.j] */
    /* JADX WARN: Type inference failed for: r1v6, types: [p3.j] */
    @Override // P3.c
    public final String a(InterfaceC0763g interfaceC0763g, g gVar) {
        switch (this.f2176a) {
            case 0:
                AbstractC0219i.e("renderer", gVar);
                if (interfaceC0763g instanceof InterfaceC0755Q) {
                    N3.f name = ((InterfaceC0755Q) interfaceC0763g).getName();
                    AbstractC0219i.d("classifier.name", name);
                    return gVar.M(name, false);
                }
                N3.e eVarG = Q3.f.g(interfaceC0763g);
                AbstractC0219i.d("getFqName(classifier)", eVarG);
                return gVar.m(AbstractC0415a.O(eVarG.e()));
            case 1:
                AbstractC0219i.e("renderer", gVar);
                if (interfaceC0763g instanceof InterfaceC0755Q) {
                    N3.f name2 = ((InterfaceC0755Q) interfaceC0763g).getName();
                    AbstractC0219i.d("classifier.name", name2);
                    return gVar.M(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(interfaceC0763g.getName());
                    interfaceC0763g = interfaceC0763g.l();
                } while (interfaceC0763g instanceof InterfaceC0761e);
                return AbstractC0415a.O(new A(arrayList));
            default:
                AbstractC0219i.e("renderer", gVar);
                return b(interfaceC0763g);
        }
    }
}
