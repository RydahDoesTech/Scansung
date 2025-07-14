package k3;

import b0.C0198c;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class t implements InterfaceC0673e {

    /* renamed from: a, reason: collision with root package name */
    public final Member f7925a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f7926b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f7927c;

    /* renamed from: d, reason: collision with root package name */
    public final List f7928d;

    public t(Member member, Type type, Class cls, Type[] typeArr) {
        List listW0;
        this.f7925a = member;
        this.f7926b = type;
        this.f7927c = cls;
        if (cls != null) {
            C0198c c0198c = new C0198c(2);
            c0198c.P(cls);
            c0198c.Q(typeArr);
            ArrayList arrayList = (ArrayList) c0198c.f5001d;
            listW0 = P2.n.h0(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            listW0 = P2.i.w0(typeArr);
        }
        this.f7928d = listW0;
    }

    public void a(Object[] objArr) {
        Y0.j.d(this, objArr);
    }

    public final void b(Object obj) {
        if (obj == null || !this.f7925a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // k3.InterfaceC0673e
    public final Type o() {
        return this.f7926b;
    }

    @Override // k3.InterfaceC0673e
    public final List p() {
        return this.f7928d;
    }

    @Override // k3.InterfaceC0673e
    public final Member q() {
        return this.f7925a;
    }
}
