package v3;

import b3.AbstractC0219i;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class x extends w implements E3.e {

    /* renamed from: a, reason: collision with root package name */
    public final Method f9266a;

    public x(Method method) {
        AbstractC0219i.e("member", method);
        this.f9266a = method;
    }

    @Override // v3.w
    public final Member a() {
        return this.f9266a;
    }

    public final AbstractC0890B e() {
        Type genericReturnType = this.f9266a.getGenericReturnType();
        AbstractC0219i.d("member.genericReturnType", genericReturnType);
        boolean z4 = genericReturnType instanceof Class;
        if (z4) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new z(cls);
            }
        }
        return ((genericReturnType instanceof GenericArrayType) || (z4 && ((Class) genericReturnType).isArray())) ? new i(genericReturnType) : genericReturnType instanceof WildcardType ? new C0893E((WildcardType) genericReturnType) : new q(genericReturnType);
    }

    public final List f() {
        Method method = this.f9266a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        AbstractC0219i.d("member.genericParameterTypes", genericParameterTypes);
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        AbstractC0219i.d("member.parameterAnnotations", parameterAnnotations);
        return c(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // E3.e
    public final ArrayList u() {
        TypeVariable<Method>[] typeParameters = this.f9266a.getTypeParameters();
        AbstractC0219i.d("member.typeParameters", typeParameters);
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new C0891C(typeVariable));
        }
        return arrayList;
    }
}
