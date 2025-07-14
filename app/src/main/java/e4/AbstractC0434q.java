package e4;

import b3.AbstractC0219i;
import java.util.List;

/* renamed from: e4.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0434q extends Z implements h4.c {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0442z f6693e;
    public final AbstractC0442z f;

    public AbstractC0434q(AbstractC0442z abstractC0442z, AbstractC0442z abstractC0442z2) {
        AbstractC0219i.e("lowerBound", abstractC0442z);
        AbstractC0219i.e("upperBound", abstractC0442z2);
        this.f6693e = abstractC0442z;
        this.f = abstractC0442z2;
    }

    @Override // e4.AbstractC0438v
    public final G H0() {
        return P0().H0();
    }

    @Override // e4.AbstractC0438v
    public final J I0() {
        return P0().I0();
    }

    @Override // e4.AbstractC0438v
    public final boolean J0() {
        return P0().J0();
    }

    public abstract AbstractC0442z P0();

    public abstract String Q0(P3.g gVar, P3.g gVar2);

    @Override // e4.AbstractC0438v
    public X3.n p0() {
        return P0().p0();
    }

    @Override // e4.AbstractC0438v
    public final List s0() {
        return P0().s0();
    }

    public String toString() {
        return P3.g.f2195e.W(this);
    }
}
