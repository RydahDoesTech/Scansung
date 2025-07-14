package b4;

import C3.C0012d;
import I3.C;
import I3.E;
import I3.K;
import I3.L;
import U3.f;
import X3.n;
import a4.i;
import b3.AbstractC0219i;
import c4.p;
import com.google.firebase.messaging.q;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseInterface;
import d4.o;
import p3.InterfaceC0742D;
import p3.InterfaceC0781y;
import s3.AbstractC0828D;

/* loaded from: classes.dex */
public final class c extends AbstractC0828D implements InterfaceC0742D {

    /* renamed from: j, reason: collision with root package name */
    public final J3.a f5102j;

    /* renamed from: k, reason: collision with root package name */
    public final E0.d f5103k;

    /* renamed from: l, reason: collision with root package name */
    public final q f5104l;

    /* renamed from: m, reason: collision with root package name */
    public E f5105m;
    public p n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(N3.c cVar, o oVar, InterfaceC0781y interfaceC0781y, E e5, J3.a aVar) {
        super(interfaceC0781y, cVar);
        AbstractC0219i.e("fqName", cVar);
        AbstractC0219i.e("storageManager", oVar);
        AbstractC0219i.e("module", interfaceC0781y);
        this.f5102j = aVar;
        L l4 = e5.f978g;
        AbstractC0219i.d("proto.strings", l4);
        K k5 = e5.f979h;
        AbstractC0219i.d("proto.qualifiedNames", k5);
        E0.d dVar = new E0.d(l4, k5);
        this.f5103k = dVar;
        this.f5104l = new q(e5, dVar, aVar, new B3.d(14, this));
        this.f5105m = e5;
    }

    public final void P0(i iVar) {
        AbstractC0219i.e("components", iVar);
        E e5 = this.f5105m;
        if (e5 == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f5105m = null;
        C c2 = e5.f980i;
        AbstractC0219i.d("proto.`package`", c2);
        this.n = new p(this, c2, this.f5103k, this.f5102j, null, iVar, "scope of " + this, new C0012d(9, this));
    }

    @Override // p3.InterfaceC0742D
    public final n p0() {
        p pVar = this.n;
        if (pVar != null) {
            return pVar;
        }
        AbstractC0219i.g("_memberScope");
        throw null;
    }

    @Override // s3.AbstractC0828D, s3.AbstractC0859o
    public final String toString() {
        return "builtins package fragment for " + this.f8745h + IDMDatabaseInterface.IDM_SQL_FROM + f.j(this);
    }
}
