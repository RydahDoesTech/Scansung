package v3;

import b3.AbstractC0219i;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* loaded from: classes.dex */
public final class i extends AbstractC0890B implements E3.d {

    /* renamed from: a, reason: collision with root package name */
    public final Type f9250a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0890B f9251b;

    /* renamed from: c, reason: collision with root package name */
    public final P2.u f9252c;

    /* JADX WARN: Multi-variable type inference failed */
    public i(Type type) {
        AbstractC0890B zVar;
        AbstractC0890B zVar2;
        this.f9250a = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    AbstractC0219i.d("getComponentType()", componentType);
                    zVar = componentType.isPrimitive() ? new z(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new i(componentType) : componentType instanceof WildcardType ? new C0893E((WildcardType) componentType) : new q(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        AbstractC0219i.d("genericComponentType", genericComponentType);
        boolean z4 = genericComponentType instanceof Class;
        if (z4) {
            Class cls2 = (Class) genericComponentType;
            if (cls2.isPrimitive()) {
                zVar2 = new z(cls2);
                this.f9251b = zVar2;
                this.f9252c = P2.u.f2163d;
            }
        }
        zVar = ((genericComponentType instanceof GenericArrayType) || (z4 && ((Class) genericComponentType).isArray())) ? new i(genericComponentType) : genericComponentType instanceof WildcardType ? new C0893E((WildcardType) genericComponentType) : new q(genericComponentType);
        zVar2 = zVar;
        this.f9251b = zVar2;
        this.f9252c = P2.u.f2163d;
    }

    @Override // v3.AbstractC0890B
    public final Type a() {
        return this.f9250a;
    }

    @Override // E3.b
    public final Collection s() {
        return this.f9252c;
    }
}
