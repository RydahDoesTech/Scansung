package v3;

import b3.AbstractC0219i;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* renamed from: v3.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0893E extends AbstractC0890B implements E3.d {

    /* renamed from: a, reason: collision with root package name */
    public final WildcardType f9234a;

    public C0893E(WildcardType wildcardType) {
        this.f9234a = wildcardType;
    }

    @Override // v3.AbstractC0890B
    public final Type a() {
        return this.f9234a;
    }

    public final AbstractC0890B b() {
        AbstractC0890B iVar;
        WildcardType wildcardType = this.f9234a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length != 1) {
            if (upperBounds.length == 1) {
                Type type = (Type) P2.i.v0(upperBounds);
                if (!AbstractC0219i.a(type, Object.class)) {
                    AbstractC0219i.d("ub", type);
                    boolean z4 = type instanceof Class;
                    if (z4) {
                        Class cls = (Class) type;
                        if (cls.isPrimitive()) {
                            return new z(cls);
                        }
                    }
                    iVar = ((type instanceof GenericArrayType) || (z4 && ((Class) type).isArray())) ? new i(type) : type instanceof WildcardType ? new C0893E((WildcardType) type) : new q(type);
                }
            }
            return null;
        }
        Object objV0 = P2.i.v0(lowerBounds);
        AbstractC0219i.d("lowerBounds.single()", objV0);
        Type type2 = (Type) objV0;
        boolean z5 = type2 instanceof Class;
        if (z5) {
            Class cls2 = (Class) type2;
            if (cls2.isPrimitive()) {
                return new z(cls2);
            }
        }
        iVar = ((type2 instanceof GenericArrayType) || (z5 && ((Class) type2).isArray())) ? new i(type2) : type2 instanceof WildcardType ? new C0893E((WildcardType) type2) : new q(type2);
        return iVar;
    }

    @Override // E3.b
    public final Collection s() {
        return P2.u.f2163d;
    }
}
