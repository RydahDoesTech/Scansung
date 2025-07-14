package p3;

import java.util.ArrayList;

/* renamed from: p3.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0782z extends AbstractC0756S {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8442a;

    public C0782z(ArrayList arrayList) {
        this.f8442a = arrayList;
        if (P2.z.k0(arrayList).size() != arrayList.size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.f8442a + ')';
    }
}
