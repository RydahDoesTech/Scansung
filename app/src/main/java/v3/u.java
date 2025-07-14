package v3;

import b3.AbstractC0219i;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* loaded from: classes.dex */
public final class u extends w {

    /* renamed from: a, reason: collision with root package name */
    public final Field f9264a;

    public u(Field field) {
        AbstractC0219i.e("member", field);
        this.f9264a = field;
    }

    @Override // v3.w
    public final Member a() {
        return this.f9264a;
    }
}
