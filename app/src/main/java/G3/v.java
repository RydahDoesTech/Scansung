package g3;

import b3.AbstractC0219i;
import j3.n0;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class v implements TypeVariable, Type {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0467q f6788a;

    public v(InterfaceC0467q interfaceC0467q) {
        AbstractC0219i.e("typeParameter", interfaceC0467q);
        this.f6788a = interfaceC0467q;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !getName().equals(((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        n0 n0Var = (n0) this.f6788a;
        n0Var.getClass();
        InterfaceC0466p interfaceC0466p = n0.f7421g[0];
        Object objA = n0Var.f7423e.a();
        AbstractC0219i.d("<get-upperBounds>(...)", objA);
        List list = (List) objA;
        ArrayList arrayList = new ArrayList(P2.o.l0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(y.j((b3.j) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new O2.e(g4.f.d("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f6788a), 0);
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return ((n0) this.f6788a).a();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return getName();
    }

    public final int hashCode() {
        getName();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return getName();
    }
}
