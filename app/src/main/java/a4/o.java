package a4;

import O3.AbstractC0081m;
import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import j3.m0;
import j3.q0;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import p3.InterfaceC0766j;

/* loaded from: classes.dex */
public final class o extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3073e;
    public final /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3074g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(s sVar, AbstractC0081m abstractC0081m, int i5, int i6) {
        super(0);
        this.f3072d = i6;
        this.f3073e = sVar;
        this.f = abstractC0081m;
        this.f3074g = i5;
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [O2.c, java.lang.Object] */
    @Override // a3.InterfaceC0106a
    public final Object a() {
        switch (this.f3072d) {
            case 0:
                s sVar = (s) this.f3073e;
                v vVarA = sVar.a((InterfaceC0766j) sVar.f3085a.f);
                List listO0 = vVarA != null ? P2.m.O0(((i) sVar.f3085a.f3058d).f3041e.k(vVarA, (AbstractC0081m) this.f, this.f3074g)) : null;
                return listO0 == null ? P2.u.f2163d : listO0;
            case 1:
                s sVar2 = (s) this.f3073e;
                v vVarA2 = sVar2.a((InterfaceC0766j) sVar2.f3085a.f);
                List listL = vVarA2 != null ? ((i) sVar2.f3085a.f3058d).f3041e.L(vVarA2, (AbstractC0081m) this.f, this.f3074g) : null;
                return listL == null ? P2.u.f2163d : listL;
            default:
                m0 m0Var = (m0) this.f3073e;
                q0 q0Var = m0Var.f7417b;
                Type type = q0Var != null ? (Type) q0Var.a() : null;
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    AbstractC0219i.d("{\n                      …                        }", componentType);
                    return componentType;
                }
                boolean z4 = type instanceof GenericArrayType;
                int i5 = this.f3074g;
                if (z4) {
                    if (i5 == 0) {
                        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                        AbstractC0219i.d("{\n                      …                        }", genericComponentType);
                        return genericComponentType;
                    }
                    throw new O2.e("Array type has been queried for a non-0th argument: " + m0Var, 2);
                }
                if (!(type instanceof ParameterizedType)) {
                    throw new O2.e("Non-generic type has been queried for arguments: " + m0Var, 2);
                }
                Type type2 = (Type) ((List) this.f.getValue()).get(i5);
                if (type2 instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type2;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    AbstractC0219i.d("argument.lowerBounds", lowerBounds);
                    Type type3 = lowerBounds.length != 0 ? lowerBounds[0] : null;
                    if (type3 == null) {
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        AbstractC0219i.d("argument.upperBounds", upperBounds);
                        type2 = (Type) P2.i.o0(upperBounds);
                    } else {
                        type2 = type3;
                    }
                }
                AbstractC0219i.d("{\n                      …                        }", type2);
                return type2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m0 m0Var, int i5, O2.c cVar) {
        super(0);
        this.f3072d = 2;
        this.f3073e = m0Var;
        this.f3074g = i5;
        this.f = cVar;
    }
}
