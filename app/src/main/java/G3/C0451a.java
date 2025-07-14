package g3;

import b3.AbstractC0219i;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: g3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0451a implements GenericArrayType, Type {

    /* renamed from: a, reason: collision with root package name */
    public final Type f6779a;

    public C0451a(Type type) {
        AbstractC0219i.e("elementType", type);
        this.f6779a = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            if (AbstractC0219i.a(this.f6779a, ((GenericArrayType) obj).getGenericComponentType())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f6779a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return y.a(this.f6779a) + "[]";
    }

    public final int hashCode() {
        return this.f6779a.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
