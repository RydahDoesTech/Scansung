package u3;

import a4.l;
import b3.AbstractC0219i;
import java.util.ArrayList;
import p3.InterfaceC0759c;
import p3.InterfaceC0761e;
import v3.s;

/* renamed from: u3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0883e implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final C0883e f9190b = new C0883e();

    /* renamed from: c, reason: collision with root package name */
    public static final C0883e f9191c = new C0883e();

    @Override // a4.l
    public void a(InterfaceC0761e interfaceC0761e, ArrayList arrayList) {
        AbstractC0219i.e("descriptor", interfaceC0761e);
        throw new IllegalStateException("Incomplete hierarchy for class " + interfaceC0761e.getName() + ", unresolved classes " + arrayList);
    }

    @Override // a4.l
    public void b(InterfaceC0759c interfaceC0759c) {
        AbstractC0219i.e("descriptor", interfaceC0759c);
        throw new IllegalStateException("Cannot infer visibility for " + interfaceC0759c);
    }

    public g c(E3.c cVar) {
        AbstractC0219i.e("javaElement", cVar);
        return new g((s) cVar);
    }
}
