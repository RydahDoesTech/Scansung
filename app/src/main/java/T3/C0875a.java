package t3;

import Q2.e;
import b3.AbstractC0219i;
import com.idm.fotaagent.restapi.restclient.push.campaign.button.Action;
import p3.Z;
import p3.a0;
import p3.b0;
import p3.e0;
import p3.f0;

/* renamed from: t3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0875a extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C0875a f8975c = new C0875a(Action.KEY_PACKAGENAME, false);

    @Override // p3.f0
    public final Integer a(f0 f0Var) {
        AbstractC0219i.e("visibility", f0Var);
        if (this == f0Var) {
            return 0;
        }
        e eVar = e0.f8414a;
        return (f0Var == Z.f8407c || f0Var == a0.f8408c) ? 1 : -1;
    }

    @Override // p3.f0
    public final String b() {
        return "public/*package*/";
    }

    @Override // p3.f0
    public final f0 c() {
        return b0.f8409c;
    }
}
