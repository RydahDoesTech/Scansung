package P2;

import c3.InterfaceC0226a;
import java.util.AbstractList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e extends AbstractList implements List, InterfaceC0226a {
    public abstract int l();

    public abstract Object m(int i5);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i5) {
        return m(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return l();
    }
}
