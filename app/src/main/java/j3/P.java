package j3;

import com.idm.providers.mo.IDMMoDatabaseConstants;
import g3.InterfaceC0466p;

/* loaded from: classes.dex */
public final class P extends AbstractC0559A {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0466p[] f7347g;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f7348c;

    /* renamed from: d, reason: collision with root package name */
    public final q0 f7349d;

    /* renamed from: e, reason: collision with root package name */
    public final r0 f7350e;
    public final r0 f;

    static {
        b3.r rVar = b3.q.f5100a;
        f7347g = new InterfaceC0466p[]{rVar.e(new b3.n(rVar.b(P.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), rVar.e(new b3.n(rVar.b(P.class), IDMMoDatabaseConstants.IDM_SCOPE, "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), rVar.e(new b3.n(rVar.b(P.class), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), rVar.e(new b3.n(rVar.b(P.class), "metadata", "getMetadata()Lkotlin/Triple;")), rVar.e(new b3.n(rVar.b(P.class), "members", "getMembers()Ljava/util/Collection;"))};
    }

    public P(S s2) {
        super(s2);
        this.f7348c = s0.h(null, new M(s2, 0));
        this.f7349d = s0.h(null, new O(this, 1));
        this.f7350e = new r0(new N(this, s2));
        this.f = new r0(new O(this, 0));
        s0.h(null, new N(s2, this));
    }
}
