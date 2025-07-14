package j3;

import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import g3.InterfaceC0461k;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3.InterfaceC0748J;
import p3.InterfaceC0755Q;
import p3.InterfaceC0759c;
import s3.C0843T;
import s3.C0867w;

/* renamed from: j3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0575o extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f7425e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0575o(r rVar, int i5) {
        super(0);
        this.f7424d = i5;
        this.f7425e = rVar;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() throws NegativeArraySizeException {
        int i5;
        Type[] lowerBounds;
        Type type = null;
        int i6 = 3;
        int i7 = 0;
        r rVar = this.f7425e;
        switch (this.f7424d) {
            case 0:
                int size = (rVar.h() ? 1 : 0) + rVar.m().size();
                int size2 = (rVar.m().size() + 31) / 32;
                Object[] objArr = new Object[size + size2 + 1];
                Iterator it = rVar.m().iterator();
                while (it.hasNext()) {
                    U u4 = (U) ((InterfaceC0461k) it.next());
                    InterfaceC0748J interfaceC0748JA = u4.a();
                    C0843T c0843t = interfaceC0748JA instanceof C0843T ? (C0843T) interfaceC0748JA : null;
                    boolean zA = c0843t != null ? U3.f.a(c0843t) : false;
                    int i8 = u4.f7357b;
                    if (zA) {
                        m0 m0VarC = u4.c();
                        N3.c cVar = x0.f7455a;
                        AbstractC0438v abstractC0438v = m0VarC.f7416a;
                        if (abstractC0438v == null || !Q3.j.c(abstractC0438v)) {
                            m0 m0VarC2 = u4.c();
                            q0 q0Var = m0VarC2.f7417b;
                            Type typeJ = q0Var != null ? (Type) q0Var.a() : null;
                            if (typeJ == null) {
                                Type type2 = q0Var != null ? (Type) q0Var.a() : null;
                                typeJ = type2 != null ? type2 : g3.y.j(m0VarC2, false);
                            }
                            objArr[i8] = x0.e(typeJ);
                        }
                    }
                    InterfaceC0748J interfaceC0748JA2 = u4.a();
                    if ((interfaceC0748JA2 instanceof C0843T) && ((C0843T) interfaceC0748JA2).f8804m != null) {
                        Class clsZ = g3.y.z(g3.y.D(u4.c()));
                        if (!clsZ.isArray()) {
                            throw new O2.e("Cannot instantiate the default empty array of type " + clsZ.getSimpleName() + ", because it is not an array type", 2);
                        }
                        Object objNewInstance = Array.newInstance(clsZ.getComponentType(), 0);
                        AbstractC0219i.d("type.jvmErasure.java.run…\"\n            )\n        }", objNewInstance);
                        objArr[i8] = objNewInstance;
                    }
                }
                for (int i9 = 0; i9 < size2; i9++) {
                    objArr[size + i9] = 0;
                }
                return objArr;
            case 1:
                return x0.d(rVar.l());
            case 2:
                InterfaceC0759c interfaceC0759cL = rVar.l();
                ArrayList arrayList = new ArrayList();
                if (rVar.o()) {
                    i5 = 0;
                } else {
                    C0867w c0867wG = x0.g(interfaceC0759cL);
                    if (c0867wG != null) {
                        arrayList.add(new U(rVar, 0, 1, new C0576p(c0867wG, 0)));
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    C0867w c0867wB0 = interfaceC0759cL.b0();
                    if (c0867wB0 != null) {
                        arrayList.add(new U(rVar, i5, 2, new C0576p(c0867wB0, 1)));
                        i5++;
                    }
                }
                int size3 = interfaceC0759cL.v0().size();
                while (i7 < size3) {
                    arrayList.add(new U(rVar, i5, 3, new C0577q(interfaceC0759cL, i7)));
                    i7++;
                    i5++;
                }
                if (rVar.n() && (interfaceC0759cL instanceof A3.a) && arrayList.size() > 1) {
                    P2.r.m0(arrayList, new E0.b(5));
                }
                arrayList.trimToSize();
                return arrayList;
            case 3:
                if (rVar.h()) {
                    Object objD0 = P2.m.D0(rVar.g().p());
                    ParameterizedType parameterizedType = objD0 instanceof ParameterizedType ? (ParameterizedType) objD0 : null;
                    if (AbstractC0219i.a(parameterizedType != null ? parameterizedType.getRawType() : null, S2.a.class)) {
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        AbstractC0219i.d("continuationType.actualTypeArguments", actualTypeArguments);
                        Object objV0 = P2.i.v0(actualTypeArguments);
                        WildcardType wildcardType = objV0 instanceof WildcardType ? (WildcardType) objV0 : null;
                        if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                            type = (Type) P2.i.o0(lowerBounds);
                        }
                    }
                }
                return type == null ? rVar.g().o() : type;
            case 4:
                AbstractC0438v abstractC0438vO = rVar.l().o();
                AbstractC0219i.b(abstractC0438vO);
                return new m0(abstractC0438vO, new C0575o(rVar, i6));
            default:
                List<InterfaceC0755Q> listU = rVar.l().u();
                AbstractC0219i.d("descriptor.typeParameters", listU);
                ArrayList arrayList2 = new ArrayList(P2.o.l0(listU));
                for (InterfaceC0755Q interfaceC0755Q : listU) {
                    AbstractC0219i.d("descriptor", interfaceC0755Q);
                    arrayList2.add(new n0(rVar, interfaceC0755Q));
                }
                return arrayList2;
        }
    }
}
