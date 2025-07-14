package v3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: v3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0896c extends b3.k implements InterfaceC0107b {

    /* renamed from: e, reason: collision with root package name */
    public static final C0896c f9239e = new C0896c(1, 0);
    public static final C0896c f = new C0896c(1, 1);

    /* renamed from: g, reason: collision with root package name */
    public static final C0896c f9240g = new C0896c(1, 2);

    /* renamed from: h, reason: collision with root package name */
    public static final C0896c f9241h = new C0896c(1, 3);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9242d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0896c(int i5, int i6) {
        super(i5);
        this.f9242d = i6;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        switch (this.f9242d) {
            case 0:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                AbstractC0219i.e("it", parameterizedType);
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 1:
                ParameterizedType parameterizedType2 = (ParameterizedType) obj;
                AbstractC0219i.e("it", parameterizedType2);
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                AbstractC0219i.d("it.actualTypeArguments", actualTypeArguments);
                return P2.i.j0(actualTypeArguments);
            case 2:
                return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
            default:
                String simpleName = ((Class) obj).getSimpleName();
                if (!N3.f.f(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return N3.f.e(simpleName);
                }
                return null;
        }
    }
}
