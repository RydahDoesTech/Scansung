package k4;

import c3.InterfaceC0226a;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class d implements Iterable, InterfaceC0226a {

    /* renamed from: d, reason: collision with root package name */
    public a f7942d;

    public final boolean isEmpty() {
        return this.f7942d.l() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f7942d.iterator();
    }
}
