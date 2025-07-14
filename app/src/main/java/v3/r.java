package v3;

import b3.AbstractC0219i;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r extends w implements E3.e {

    /* renamed from: a, reason: collision with root package name */
    public final Constructor f9262a;

    public r(Constructor constructor) {
        AbstractC0219i.e("member", constructor);
        this.f9262a = constructor;
    }

    @Override // v3.w
    public final Member a() {
        return this.f9262a;
    }

    @Override // E3.e
    public final ArrayList u() {
        TypeVariable[] typeParameters = this.f9262a.getTypeParameters();
        AbstractC0219i.d("member.typeParameters", typeParameters);
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new C0891C(typeVariable));
        }
        return arrayList;
    }
}
