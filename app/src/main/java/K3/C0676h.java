package k3;

import b3.AbstractC0219i;
import java.lang.reflect.Field;

/* renamed from: k3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0676h extends k implements InterfaceC0672d {

    /* renamed from: e, reason: collision with root package name */
    public final Object f7917e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0676h(Object obj, Field field) {
        super(field, false);
        AbstractC0219i.e("field", field);
        this.f7917e = obj;
    }

    @Override // k3.k, k3.InterfaceC0673e
    public final Object i(Object[] objArr) {
        Y0.j.d(this, objArr);
        return ((Field) this.f7925a).get(this.f7917e);
    }
}
