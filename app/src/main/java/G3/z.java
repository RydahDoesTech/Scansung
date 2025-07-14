package g3;

import b3.AbstractC0219i;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z implements WildcardType, Type {

    /* renamed from: c, reason: collision with root package name */
    public static final z f6791c = new z(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final Type f6792a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f6793b;

    public z(Type type, Type type2) {
        this.f6792a = type;
        this.f6793b = type2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f6793b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.f6793b;
        if (type != null) {
            return "? super " + y.a(type);
        }
        Type type2 = this.f6792a;
        if (type2 == null || AbstractC0219i.a(type2, Object.class)) {
            return "?";
        }
        return "? extends " + y.a(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.f6792a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getLowerBounds()) ^ Arrays.hashCode(getUpperBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
