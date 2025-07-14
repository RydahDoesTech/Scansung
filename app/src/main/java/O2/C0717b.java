package o2;

import E0.d;
import b1.AbstractC0203C;
import java.util.Arrays;

/* renamed from: o2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0717b {

    /* renamed from: a, reason: collision with root package name */
    public String f8243a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0717b) {
            return AbstractC0203C.h(this.f8243a, ((C0717b) obj).f8243a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8243a});
    }

    public final String toString() {
        d dVar = new d(this);
        dVar.C0("token", this.f8243a);
        return dVar.toString();
    }
}
