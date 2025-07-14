package B0;

import java.util.ArrayList;
import o.C0704b;

/* loaded from: classes.dex */
public final class v extends u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0704b f175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f176b;

    public v(w wVar, C0704b c0704b) {
        this.f176b = wVar;
        this.f175a = c0704b;
    }

    @Override // B0.s
    public final void d(t tVar) {
        ((ArrayList) this.f175a.getOrDefault(this.f176b.f178e, null)).remove(tVar);
        tVar.w(this);
    }
}
