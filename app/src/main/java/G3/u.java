package g3;

import b3.AbstractC0219i;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class u implements ParameterizedType, Type {

    /* renamed from: a, reason: collision with root package name */
    public final Class f6785a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f6786b;

    /* renamed from: c, reason: collision with root package name */
    public final Type[] f6787c;

    public u(Class cls, Type type, ArrayList arrayList) {
        this.f6785a = cls;
        this.f6786b = type;
        this.f6787c = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (AbstractC0219i.a(this.f6785a, parameterizedType.getRawType()) && AbstractC0219i.a(this.f6786b, parameterizedType.getOwnerType())) {
                if (Arrays.equals(this.f6787c, parameterizedType.getActualTypeArguments())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f6787c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f6786b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f6785a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.f6785a;
        Type type = this.f6786b;
        if (type != null) {
            sb.append(y.a(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(y.a(cls));
        }
        Type[] typeArr = this.f6787c;
        if (typeArr.length != 0) {
            P2.i.s0(typeArr, sb, ", ", "<", ">", -1, "...", t.f6784l);
        }
        String string = sb.toString();
        AbstractC0219i.d("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }

    public final int hashCode() {
        int iHashCode = this.f6785a.hashCode();
        Type type = this.f6786b;
        return Arrays.hashCode(this.f6787c) ^ (iHashCode ^ (type != null ? type.hashCode() : 0));
    }

    public final String toString() {
        return getTypeName();
    }
}
