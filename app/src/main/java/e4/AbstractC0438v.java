package e4;

import java.util.List;
import q3.InterfaceC0791a;
import q3.InterfaceC0798h;

/* renamed from: e4.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0438v implements InterfaceC0791a, h4.c {

    /* renamed from: d, reason: collision with root package name */
    public int f6702d;

    public abstract G H0();

    public abstract J I0();

    public abstract boolean J0();

    public abstract AbstractC0438v K0(f4.f fVar);

    public abstract Z L0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0438v)) {
            return false;
        }
        AbstractC0438v abstractC0438v = (AbstractC0438v) obj;
        if (J0() == abstractC0438v.J0()) {
            if (AbstractC0420c.t(f4.e.f6739e, L0(), abstractC0438v.L0())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i5 = this.f6702d;
        if (i5 != 0) {
            return i5;
        }
        if (AbstractC0420c.i(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (J0() ? 1 : 0) + ((s0().hashCode() + (I0().hashCode() * 31)) * 31);
        }
        this.f6702d = iHashCode;
        return iHashCode;
    }

    public abstract X3.n p0();

    @Override // q3.InterfaceC0791a
    public final InterfaceC0798h s() {
        return AbstractC0426i.a(H0());
    }

    public abstract List s0();
}
