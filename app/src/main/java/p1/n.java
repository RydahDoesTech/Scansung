package p1;

import d2.C0393b;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements d2.d {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ n f8370b = new n(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ n f8371c = new n(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8372a;

    public /* synthetic */ n(int i5) {
        this.f8372a = i5;
    }

    @Override // d2.InterfaceC0392a
    public final void a(Object obj, Object obj2) {
        switch (this.f8372a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                d2.e eVar = (d2.e) obj2;
                Charset charset = o.f;
                eVar.e(o.f8373g, entry.getKey());
                eVar.e(o.f8374h, entry.getValue());
                return;
            default:
                String strValueOf = String.valueOf(obj.getClass().getCanonicalName());
                throw new C0393b(strValueOf.length() != 0 ? "Couldn't find encoder for type ".concat(strValueOf) : new String("Couldn't find encoder for type "));
        }
    }
}
