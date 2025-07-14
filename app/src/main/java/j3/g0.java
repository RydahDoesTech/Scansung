package j3;

import b3.AbstractC0219i;
import com.idm.core.tnds.IDMTndsXmlWbxmlDefine;
import g3.InterfaceC0463m;
import g3.InterfaceC0466p;
import k3.InterfaceC0673e;
import p3.InterfaceC0749K;
import p3.InterfaceC0759c;
import s3.C0835K;

/* loaded from: classes.dex */
public abstract class g0 extends e0 implements InterfaceC0463m {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0466p[] f7389g;

    /* renamed from: e, reason: collision with root package name */
    public final q0 f7390e = s0.h(null, new f0(this, 1));
    public final Object f = g3.y.M(2, new f0(this, 0));

    static {
        b3.r rVar = b3.q.f5100a;
        f7389g = new InterfaceC0466p[]{rVar.e(new b3.n(rVar.b(g0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};
    }

    public final boolean equals(Object obj) {
        return (obj instanceof g0) && AbstractC0219i.a(q(), ((g0) obj).q());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O2.c, java.lang.Object] */
    @Override // j3.r
    public final InterfaceC0673e g() {
        return (InterfaceC0673e) this.f.getValue();
    }

    @Override // g3.InterfaceC0452b
    public final String getName() {
        return "<get-" + q().f + IDMTndsXmlWbxmlDefine.XML_CLOSE_TAG;
    }

    public final int hashCode() {
        return q().hashCode();
    }

    @Override // j3.r
    public final InterfaceC0759c l() {
        InterfaceC0466p interfaceC0466p = f7389g[0];
        Object objA = this.f7390e.a();
        AbstractC0219i.d("<get-descriptor>(...)", objA);
        return (C0835K) objA;
    }

    @Override // j3.e0
    public final InterfaceC0749K p() {
        InterfaceC0466p interfaceC0466p = f7389g[0];
        Object objA = this.f7390e.a();
        AbstractC0219i.d("<get-descriptor>(...)", objA);
        return (C0835K) objA;
    }

    public final String toString() {
        return "getter of " + q();
    }
}
