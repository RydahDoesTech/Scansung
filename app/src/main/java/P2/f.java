package P2;

import c3.InterfaceC0227b;
import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class f extends AbstractSet implements Set, InterfaceC0227b {
    public abstract int l();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return l();
    }
}
