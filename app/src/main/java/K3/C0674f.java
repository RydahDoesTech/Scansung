package k3;

import b0.C0198c;
import b3.AbstractC0219i;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: k3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0674f extends t implements InterfaceC0672d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7915e;
    public final Object f;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0674f(Constructor constructor, Object obj, int i5) {
        this.f7915e = i5;
        switch (i5) {
            case 1:
                AbstractC0219i.e("constructor", constructor);
                Class declaringClass = constructor.getDeclaringClass();
                AbstractC0219i.d("constructor.declaringClass", declaringClass);
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                AbstractC0219i.d("constructor.genericParameterTypes", genericParameterTypes);
                super(constructor, declaringClass, null, genericParameterTypes);
                this.f = obj;
                break;
            default:
                AbstractC0219i.e("constructor", constructor);
                Class declaringClass2 = constructor.getDeclaringClass();
                AbstractC0219i.d("constructor.declaringClass", declaringClass2);
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                AbstractC0219i.d("constructor.genericParameterTypes", genericParameterTypes2);
                super(constructor, declaringClass2, null, (Type[]) (genericParameterTypes2.length <= 2 ? new Type[0] : P2.i.m0(genericParameterTypes2, 1, genericParameterTypes2.length - 1)));
                this.f = obj;
                break;
        }
    }

    @Override // k3.InterfaceC0673e
    public final Object i(Object[] objArr) {
        switch (this.f7915e) {
            case 0:
                Y0.j.d(this, objArr);
                Constructor constructor = (Constructor) this.f7925a;
                C0198c c0198c = new C0198c(3);
                c0198c.P(this.f);
                c0198c.Q(objArr);
                c0198c.P(null);
                ArrayList arrayList = (ArrayList) c0198c.f5001d;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                Y0.j.d(this, objArr);
                Constructor constructor2 = (Constructor) this.f7925a;
                C0198c c0198c2 = new C0198c(2);
                c0198c2.P(this.f);
                c0198c2.Q(objArr);
                ArrayList arrayList2 = (ArrayList) c0198c2.f5001d;
                return constructor2.newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
