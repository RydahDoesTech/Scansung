package p3;

import b3.AbstractC0219i;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8415a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8416b;

    public f0(String str, boolean z4) {
        this.f8415a = str;
        this.f8416b = z4;
    }

    public Integer a(f0 f0Var) {
        AbstractC0219i.e("visibility", f0Var);
        Q2.e eVar = e0.f8414a;
        if (this == f0Var) {
            return 0;
        }
        Q2.e eVar2 = e0.f8414a;
        Integer num = (Integer) eVar2.get(this);
        Integer num2 = (Integer) eVar2.get(f0Var);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public String b() {
        return this.f8415a;
    }

    public f0 c() {
        return this;
    }

    public final String toString() {
        return b();
    }
}
