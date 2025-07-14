package f4;

import b3.AbstractC0219i;
import e4.AbstractC0420c;
import e4.C0430m;
import e4.H;
import e4.Z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: d, reason: collision with root package name */
    public static final p f6759d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f6760e;
    public static final q f;

    /* renamed from: g, reason: collision with root package name */
    public static final o f6761g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ r[] f6762h;

    static {
        p pVar = new p();
        f6759d = pVar;
        n nVar = new n();
        f6760e = nVar;
        q qVar = new q();
        f = qVar;
        o oVar = new o();
        f6761g = oVar;
        f6762h = new r[]{pVar, nVar, qVar, oVar};
    }

    public static r b(Z z4) {
        AbstractC0219i.e("<this>", z4);
        if (z4.J0()) {
            return f6760e;
        }
        if (z4 instanceof C0430m) {
        }
        return AbstractC0420c.f(g.l(false, true, e.f6739e, null, null, 24), AbstractC0420c.k(z4), H.f6647b) ? f6761g : f;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f6762h.clone();
    }

    public abstract r a(Z z4);
}
