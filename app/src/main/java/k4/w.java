package k4;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;

/* loaded from: classes.dex */
public abstract class w implements e {

    /* renamed from: a, reason: collision with root package name */
    public final b3.k f7996a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7997b;

    /* JADX WARN: Multi-variable type inference failed */
    public w(String str, InterfaceC0107b interfaceC0107b) {
        this.f7996a = (b3.k) interfaceC0107b;
        this.f7997b = "must return ".concat(str);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [a3.b, b3.k] */
    @Override // k4.e
    public final boolean a(A3.g gVar) {
        return AbstractC0219i.a(gVar.f8879j, this.f7996a.d(U3.f.e(gVar)));
    }

    @Override // k4.e
    public final String b() {
        return this.f7997b;
    }

    @Override // k4.e
    public final String c(A3.g gVar) {
        return V1.a.V(this, gVar);
    }
}
