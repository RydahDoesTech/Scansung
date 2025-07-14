package c4;

import I3.C;
import I3.X;
import I3.e0;
import P2.w;
import a3.InterfaceC0106a;
import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p3.InterfaceC0742D;
import p3.InterfaceC0763g;
import r0.AbstractC0807a;
import r3.InterfaceC0817c;
import s3.AbstractC0828D;
import x3.EnumC0915b;

/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0742D f5194g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5195h;

    /* renamed from: i, reason: collision with root package name */
    public final N3.c f5196i;

    public p(InterfaceC0742D interfaceC0742D, C c2, K3.f fVar, K3.a aVar, G3.h hVar, a4.i iVar, String str, InterfaceC0106a interfaceC0106a) {
        K3.h hVar2;
        AbstractC0219i.e("packageDescriptor", interfaceC0742D);
        AbstractC0219i.e("proto", c2);
        AbstractC0219i.e("nameResolver", fVar);
        AbstractC0219i.e("metadataVersion", aVar);
        AbstractC0219i.e("components", iVar);
        AbstractC0219i.e("debugName", str);
        X x4 = c2.f967j;
        AbstractC0219i.d("proto.typeTable", x4);
        K3.g gVar = new K3.g(x4);
        e0 e0Var = c2.f968k;
        AbstractC0219i.d("proto.versionRequirementTable", e0Var);
        if (e0Var.f1231e.size() == 0) {
            hVar2 = K3.h.f1697a;
        } else {
            AbstractC0219i.d("table.requirementList", e0Var.f1231e);
            hVar2 = new K3.h();
        }
        a4.k kVarA = iVar.a(interfaceC0742D, fVar, gVar, hVar2, aVar, hVar);
        List list = c2.f964g;
        AbstractC0219i.d("proto.functionList", list);
        List list2 = c2.f965h;
        AbstractC0219i.d("proto.propertyList", list2);
        List list3 = c2.f966i;
        AbstractC0219i.d("proto.typeAliasList", list3);
        super(kVarA, list, list2, list3, interfaceC0106a);
        this.f5194g = interfaceC0742D;
        this.f5195h = str;
        this.f5196i = ((AbstractC0828D) interfaceC0742D).f8745h;
    }

    @Override // X3.o, X3.p
    public final Collection d(X3.f fVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("kindFilter", fVar);
        AbstractC0219i.e("nameFilter", interfaceC0107b);
        List listI = i(fVar, interfaceC0107b);
        Iterable iterable = ((a4.i) this.f5190b.f3058d).f3046k;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            P2.s.n0(arrayList, ((InterfaceC0817c) it.next()).c(this.f5196i));
        }
        return P2.m.G0(listI, arrayList);
    }

    @Override // c4.o, X3.o, X3.p
    public final InterfaceC0763g g(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        AbstractC0219i.e("location", enumC0915b);
        AbstractC0807a.e(((a4.i) this.f5190b.f3058d).f3044i, enumC0915b, this.f5194g, fVar);
        return super.g(fVar, enumC0915b);
    }

    @Override // c4.o
    public final void h(ArrayList arrayList, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("nameFilter", interfaceC0107b);
    }

    @Override // c4.o
    public final N3.b l(N3.f fVar) {
        AbstractC0219i.e("name", fVar);
        return new N3.b(this.f5196i, fVar);
    }

    @Override // c4.o
    public final Set n() {
        return w.f2165d;
    }

    @Override // c4.o
    public final Set o() {
        return w.f2165d;
    }

    @Override // c4.o
    public final Set p() {
        return w.f2165d;
    }

    @Override // c4.o
    public final boolean q(N3.f fVar) {
        AbstractC0219i.e("name", fVar);
        if (!super.q(fVar)) {
            Iterable iterable = ((a4.i) this.f5190b.f3058d).f3046k;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC0817c) it.next()).a(this.f5196i, fVar)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.f5195h;
    }
}
