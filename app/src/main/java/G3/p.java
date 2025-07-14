package G3;

import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f773a;

    public p(String str) {
        this.f773a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && AbstractC0219i.a(this.f773a, ((p) obj).f773a);
    }

    public final int hashCode() {
        return this.f773a.hashCode();
    }

    public final String toString() {
        return "MemberSignature(signature=" + this.f773a + ')';
    }
}
