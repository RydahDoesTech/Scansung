package P2;

import f3.C0447c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class A extends e {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2146d;

    public A(ArrayList arrayList) {
        this.f2146d = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        if (new C0447c(0, l(), 1).l(i5)) {
            this.f2146d.add(l() - i5, obj);
            return;
        }
        throw new IndexOutOfBoundsException("Position index " + i5 + " must be in range [" + new C0447c(0, l(), 1) + "].");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f2146d.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        return this.f2146d.get(m.o0(this, i5));
    }

    @Override // P2.e
    public final int l() {
        return this.f2146d.size();
    }

    @Override // P2.e
    public final Object m(int i5) {
        return this.f2146d.remove(m.o0(this, i5));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        return this.f2146d.set(m.o0(this, i5), obj);
    }
}
