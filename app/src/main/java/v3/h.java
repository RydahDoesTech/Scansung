package v3;

import b3.AbstractC0219i;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends f implements E3.a {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f9249b;

    public h(N3.f fVar, Object[] objArr) {
        super(fVar);
        this.f9249b = objArr;
    }

    public final ArrayList a() {
        Object[] objArr = this.f9249b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            AbstractC0219i.b(obj);
            Class<?> cls = obj.getClass();
            List list = AbstractC0897d.f9243a;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new t(null, (Enum) obj) : obj instanceof Annotation ? new g(null, (Annotation) obj) : obj instanceof Object[] ? new h(null, (Object[]) obj) : obj instanceof Class ? new p(null, (Class) obj) : new v(null, obj));
        }
        return arrayList;
    }
}
