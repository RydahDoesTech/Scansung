package g3;

import b3.AbstractC0219i;
import j3.m0;
import k.Q0;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final s f6781c = new s(0, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f6782a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f6783b;

    public s(int i5, m0 m0Var) {
        String string;
        this.f6782a = i5;
        this.f6783b = m0Var;
        if ((i5 == 0) == (m0Var == null)) {
            return;
        }
        if (i5 != 0) {
            StringBuilder sb = new StringBuilder("The projection variance ");
            sb.append(i5 != 1 ? i5 != 2 ? i5 != 3 ? "null" : "OUT" : "IN" : "INVARIANT");
            sb.append(" requires type to be specified.");
            string = sb.toString();
        } else {
            string = "Star projection must have no type specified.";
        }
        throw new IllegalArgumentException(string.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f6782a == sVar.f6782a && AbstractC0219i.a(this.f6783b, sVar.f6783b);
    }

    public final int hashCode() {
        int i5 = this.f6782a;
        int iC = (i5 == 0 ? 0 : Q0.c(i5)) * 31;
        m0 m0Var = this.f6783b;
        return iC + (m0Var != null ? m0Var.hashCode() : 0);
    }

    public final String toString() {
        int i5 = this.f6782a;
        int i6 = i5 == 0 ? -1 : AbstractC0468r.f6780a[Q0.c(i5)];
        if (i6 == -1) {
            return "*";
        }
        m0 m0Var = this.f6783b;
        if (i6 == 1) {
            return String.valueOf(m0Var);
        }
        if (i6 == 2) {
            return "in " + m0Var;
        }
        if (i6 != 3) {
            throw new O2.d();
        }
        return "out " + m0Var;
    }
}
