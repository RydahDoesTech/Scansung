package t3;

import Q2.e;
import b3.AbstractC0219i;
import p3.W;
import p3.Z;
import p3.a0;
import p3.b0;
import p3.e0;
import p3.f0;

/* loaded from: classes.dex */
public final class b extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final b f8976c = new b("protected_and_package", true);

    @Override // p3.f0
    public final Integer a(f0 f0Var) {
        AbstractC0219i.e("visibility", f0Var);
        if (equals(f0Var)) {
            return 0;
        }
        if (f0Var == W.f8404c) {
            return null;
        }
        e eVar = e0.f8414a;
        return f0Var == Z.f8407c || f0Var == a0.f8408c ? 1 : -1;
    }

    @Override // p3.f0
    public final String b() {
        return "protected/*protected and package*/";
    }

    @Override // p3.f0
    public final f0 c() {
        return b0.f8409c;
    }
}
