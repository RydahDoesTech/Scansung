package v3;

import b3.AbstractC0219i;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* loaded from: classes.dex */
public final class q extends AbstractC0890B implements E3.d {

    /* renamed from: a, reason: collision with root package name */
    public final Type f9260a;

    /* renamed from: b, reason: collision with root package name */
    public final s f9261b;

    public q(Type type) {
        s oVar;
        AbstractC0219i.e("reflectType", type);
        this.f9260a = type;
        if (type instanceof Class) {
            oVar = new o((Class) type);
        } else if (type instanceof TypeVariable) {
            oVar = new C0891C((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + type.getClass() + "): " + type);
            }
            Type rawType = ((ParameterizedType) type).getRawType();
            AbstractC0219i.c("null cannot be cast to non-null type java.lang.Class<*>", rawType);
            oVar = new o((Class) rawType);
        }
        this.f9261b = oVar;
    }

    @Override // v3.AbstractC0890B
    public final Type a() {
        return this.f9260a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList b() {
        /*
            r5 = this;
            java.lang.reflect.Type r5 = r5.f9260a
            java.util.List r5 = v3.AbstractC0897d.c(r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = P2.o.l0(r5)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L13:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r5.next()
            java.lang.reflect.Type r1 = (java.lang.reflect.Type) r1
            java.lang.String r2 = "type"
            b3.AbstractC0219i.e(r2, r1)
            boolean r2 = r1 instanceof java.lang.Class
            if (r2 == 0) goto L37
            r3 = r1
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r4 = r3.isPrimitive()
            if (r4 == 0) goto L37
            v3.z r1 = new v3.z
            r1.<init>(r3)
            goto L60
        L37:
            boolean r3 = r1 instanceof java.lang.reflect.GenericArrayType
            if (r3 != 0) goto L5a
            if (r2 == 0) goto L47
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2
            boolean r2 = r2.isArray()
            if (r2 == 0) goto L47
            goto L5a
        L47:
            boolean r2 = r1 instanceof java.lang.reflect.WildcardType
            if (r2 == 0) goto L54
            v3.E r2 = new v3.E
            java.lang.reflect.WildcardType r1 = (java.lang.reflect.WildcardType) r1
            r2.<init>(r1)
        L52:
            r1 = r2
            goto L60
        L54:
            v3.q r2 = new v3.q
            r2.<init>(r1)
            goto L52
        L5a:
            v3.i r2 = new v3.i
            r2.<init>(r1)
            goto L52
        L60:
            r0.add(r1)
            goto L13
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.q.b():java.util.ArrayList");
    }

    public final boolean c() {
        Type type = this.f9260a;
        if (!(type instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
        AbstractC0219i.d("getTypeParameters()", typeParameters);
        return !(typeParameters.length == 0);
    }

    @Override // E3.b
    public final Collection s() {
        return P2.u.f2163d;
    }

    @Override // v3.AbstractC0890B, E3.b
    public final C0898e t(N3.c cVar) {
        AbstractC0219i.e("fqName", cVar);
        return null;
    }
}
