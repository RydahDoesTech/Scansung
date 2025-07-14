package n3;

import P2.m;
import P2.o;
import b3.AbstractC0219i;
import e1.AbstractC0415a;
import e4.AbstractC0438v;
import e4.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k4.s;
import p3.InterfaceC0752N;
import p3.InterfaceC0766j;
import p3.InterfaceC0776t;
import q3.C0797g;
import q3.InterfaceC0798h;
import s3.AbstractC0866v;
import s3.C0837M;
import s3.C0843T;
import s3.C0865u;

/* renamed from: n3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0702g extends C0837M {
    public C0702g(InterfaceC0766j interfaceC0766j, C0702g c0702g, int i5, boolean z4) {
        super(interfaceC0766j, c0702g, C0797g.f8481a, s.f7980g, i5, InterfaceC0752N.f8400b);
        this.f8884p = true;
        this.f8892x = z4;
        this.f8893y = false;
    }

    @Override // s3.AbstractC0866v, p3.InterfaceC0780x
    public final boolean E() {
        return false;
    }

    @Override // s3.AbstractC0866v, p3.InterfaceC0776t
    public final boolean O() {
        return false;
    }

    @Override // s3.C0837M, s3.AbstractC0866v
    public final AbstractC0866v Q0(int i5, N3.f fVar, InterfaceC0766j interfaceC0766j, InterfaceC0776t interfaceC0776t, InterfaceC0752N interfaceC0752N, InterfaceC0798h interfaceC0798h) {
        AbstractC0219i.e("newOwner", interfaceC0766j);
        A3.f.q(i5, "kind");
        AbstractC0219i.e("annotations", interfaceC0798h);
        return new C0702g(interfaceC0766j, (C0702g) interfaceC0776t, i5, this.f8892x);
    }

    @Override // s3.AbstractC0866v
    public final AbstractC0866v R0(C0865u c0865u) {
        N3.f fVar;
        AbstractC0219i.e("configuration", c0865u);
        C0702g c0702g = (C0702g) super.R0(c0865u);
        if (c0702g == null) {
            return null;
        }
        List listV0 = c0702g.v0();
        AbstractC0219i.d("substituted.valueParameters", listV0);
        if (listV0.isEmpty()) {
            return c0702g;
        }
        Iterator it = listV0.iterator();
        while (it.hasNext()) {
            AbstractC0438v abstractC0438vD = ((C0843T) it.next()).d();
            AbstractC0219i.d("it.type", abstractC0438vD);
            if (AbstractC0415a.j(abstractC0438vD) != null) {
                List listV02 = c0702g.v0();
                AbstractC0219i.d("substituted.valueParameters", listV02);
                ArrayList arrayList = new ArrayList(o.l0(listV02));
                Iterator it2 = listV02.iterator();
                while (it2.hasNext()) {
                    AbstractC0438v abstractC0438vD2 = ((C0843T) it2.next()).d();
                    AbstractC0219i.d("it.type", abstractC0438vD2);
                    arrayList.add(AbstractC0415a.j(abstractC0438vD2));
                }
                int size = c0702g.v0().size() - arrayList.size();
                boolean z4 = true;
                if (size == 0) {
                    List listV03 = c0702g.v0();
                    AbstractC0219i.d("valueParameters", listV03);
                    ArrayList arrayListT0 = m.T0(arrayList, listV03);
                    if (arrayListT0.isEmpty()) {
                        return c0702g;
                    }
                    Iterator it3 = arrayListT0.iterator();
                    while (it3.hasNext()) {
                        O2.f fVar2 = (O2.f) it3.next();
                        if (!AbstractC0219i.a((N3.f) fVar2.f2006d, ((C0843T) fVar2.f2007e).getName())) {
                        }
                    }
                    return c0702g;
                }
                List<C0843T> listV04 = c0702g.v0();
                AbstractC0219i.d("valueParameters", listV04);
                ArrayList arrayList2 = new ArrayList(o.l0(listV04));
                for (C0843T c0843t : listV04) {
                    N3.f name = c0843t.getName();
                    AbstractC0219i.d("it.name", name);
                    int i5 = c0843t.f8800i;
                    int i6 = i5 - size;
                    if (i6 >= 0 && (fVar = (N3.f) arrayList.get(i6)) != null) {
                        name = fVar;
                    }
                    arrayList2.add(c0843t.O0(c0702g, name, i5));
                }
                C0865u c0865uU0 = c0702g.U0(V.f6667b);
                if (arrayList.isEmpty()) {
                    z4 = false;
                } else {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        if (((N3.f) it4.next()) == null) {
                            break;
                        }
                    }
                    z4 = false;
                }
                c0865uU0.f8870y = Boolean.valueOf(z4);
                c0865uU0.f8856j = arrayList2;
                c0865uU0.f8854h = c0702g.a();
                AbstractC0866v abstractC0866vR0 = super.R0(c0865uU0);
                AbstractC0219i.b(abstractC0866vR0);
                return abstractC0866vR0;
            }
        }
        return c0702g;
    }

    @Override // s3.AbstractC0866v, p3.InterfaceC0776t
    public final boolean j() {
        return false;
    }
}
