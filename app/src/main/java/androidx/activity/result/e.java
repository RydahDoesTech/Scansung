package androidx.activity.result;

import b.AbstractC0195a;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3149a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0195a f3150b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f3151c;

    public e(h hVar, String str, AbstractC0195a abstractC0195a) {
        this.f3151c = hVar;
        this.f3149a = str;
        this.f3150b = abstractC0195a;
    }

    public final void a(Object obj) {
        h hVar = this.f3151c;
        HashMap map = hVar.f3157b;
        String str = this.f3149a;
        Integer num = (Integer) map.get(str);
        AbstractC0195a abstractC0195a = this.f3150b;
        if (num != null) {
            hVar.f3159d.add(str);
            try {
                hVar.b(num.intValue(), abstractC0195a, obj);
                return;
            } catch (Exception e5) {
                hVar.f3159d.remove(str);
                throw e5;
            }
        }
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC0195a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }

    public final void b() {
        this.f3151c.f(this.f3149a);
    }
}
