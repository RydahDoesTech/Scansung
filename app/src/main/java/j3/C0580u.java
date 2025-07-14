package j3;

import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m3.AbstractC0695h;
import p3.InterfaceC0755Q;
import p3.InterfaceC0761e;

/* renamed from: j3.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0580u extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0582w f7440e;
    public final /* synthetic */ C0585z f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0580u(C0582w c0582w, C0585z c0585z, int i5) {
        super(0);
        this.f7439d = i5;
        this.f7440e = c0582w;
        this.f = c0585z;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        int i5 = 2;
        C0585z c0585z = this.f;
        C0582w c0582w = this.f7440e;
        switch (this.f7439d) {
            case 0:
                if (c0585z.f7460e.isAnonymousClass()) {
                    return null;
                }
                N3.b bVarQ = c0585z.q();
                if (!bVarQ.f1832c) {
                    String strB = bVarQ.i().b();
                    AbstractC0219i.d("classId.shortClassName.asString()", strB);
                    return strB;
                }
                c0582w.getClass();
                Class cls = c0585z.f7460e;
                String simpleName = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    return p4.h.p0(simpleName, enclosingMethod.getName() + '$', simpleName);
                }
                Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                if (enclosingConstructor != null) {
                    return p4.h.p0(simpleName, enclosingConstructor.getName() + '$', simpleName);
                }
                int iK0 = p4.h.k0(simpleName, '$', 0, false, 6);
                if (iK0 != -1) {
                    simpleName = simpleName.substring(iK0 + 1, simpleName.length());
                    AbstractC0219i.d("this as java.lang.String…ing(startIndex, endIndex)", simpleName);
                }
                return simpleName;
            case 1:
                Collection<AbstractC0438v> collectionJ = c0582w.a().I().j();
                AbstractC0219i.d("descriptor.typeConstructor.supertypes", collectionJ);
                ArrayList arrayList = new ArrayList(collectionJ.size());
                for (AbstractC0438v abstractC0438v : collectionJ) {
                    AbstractC0219i.d("kotlinType", abstractC0438v);
                    arrayList.add(new m0(abstractC0438v, new C3.C(abstractC0438v, c0582w, c0585z, i5)));
                }
                InterfaceC0761e interfaceC0761eA = c0582w.a();
                N3.f fVar = AbstractC0695h.f8064e;
                if (!AbstractC0695h.b(interfaceC0761eA, m3.m.f8115a) && !AbstractC0695h.b(interfaceC0761eA, m3.m.f8117b)) {
                    if (arrayList.isEmpty()) {
                        arrayList.add(new m0(U3.f.e(c0582w.a()).e(), C0581v.f7442d));
                    } else {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            int iL = Q3.f.c(((m0) it.next()).f7416a).L();
                            A3.f.u(iL, "getClassDescriptorForType(it.type).kind");
                            if (iL == 2 || iL == 5) {
                            }
                        }
                        arrayList.add(new m0(U3.f.e(c0582w.a()).e(), C0581v.f7442d));
                    }
                }
                return n4.k.d(arrayList);
            default:
                List<InterfaceC0755Q> listR = c0582w.a().r();
                AbstractC0219i.d("descriptor.declaredTypeParameters", listR);
                ArrayList arrayList2 = new ArrayList(P2.o.l0(listR));
                for (InterfaceC0755Q interfaceC0755Q : listR) {
                    AbstractC0219i.d("descriptor", interfaceC0755Q);
                    arrayList2.add(new n0(c0585z, interfaceC0755Q));
                }
                return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0580u(C0585z c0585z, C0582w c0582w) {
        super(0);
        this.f7439d = 0;
        this.f = c0585z;
        this.f7440e = c0582w;
    }
}
