package O2;

import b3.AbstractC0219i;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class m implements c, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public b3.k f2017d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2018e;

    /* JADX WARN: Type inference failed for: r0v1, types: [a3.a, b3.k, java.lang.Object] */
    @Override // O2.c
    public final Object getValue() {
        if (this.f2018e == k.f2015a) {
            ?? r02 = this.f2017d;
            AbstractC0219i.b(r02);
            this.f2018e = r02.a();
            this.f2017d = null;
        }
        return this.f2018e;
    }

    public final String toString() {
        return this.f2018e != k.f2015a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
