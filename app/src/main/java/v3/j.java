package v3;

import a3.InterfaceC0107b;
import b3.AbstractC0217g;
import b3.AbstractC0219i;
import g3.InterfaceC0455e;
import java.lang.reflect.Member;

/* loaded from: classes.dex */
public final /* synthetic */ class j extends AbstractC0217g implements InterfaceC0107b {

    /* renamed from: l, reason: collision with root package name */
    public static final j f9253l = new j(1);

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        Member member = (Member) obj;
        AbstractC0219i.e("p0", member);
        return Boolean.valueOf(member.isSynthetic());
    }

    @Override // b3.AbstractC0212b, g3.InterfaceC0452b
    public final String getName() {
        return "isSynthetic";
    }

    @Override // b3.AbstractC0212b
    public final InterfaceC0455e j() {
        return b3.q.f5100a.b(Member.class);
    }

    @Override // b3.AbstractC0212b
    public final String l() {
        return "isSynthetic()Z";
    }
}
