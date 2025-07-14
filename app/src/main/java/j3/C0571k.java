package j3;

import b3.AbstractC0219i;
import java.lang.reflect.Field;
import v3.AbstractC0897d;

/* renamed from: j3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0571k extends s0 {

    /* renamed from: e, reason: collision with root package name */
    public final Field f7400e;

    public C0571k(Field field) {
        AbstractC0219i.e("field", field);
        this.f7400e = field;
    }

    @Override // j3.s0
    public final String d() {
        StringBuilder sb = new StringBuilder();
        Field field = this.f7400e;
        String name = field.getName();
        AbstractC0219i.d("field.name", name);
        sb.append(y3.w.a(name));
        sb.append("()");
        Class<?> type = field.getType();
        AbstractC0219i.d("field.type", type);
        sb.append(AbstractC0897d.b(type));
        return sb.toString();
    }
}
