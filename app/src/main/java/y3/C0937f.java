package y3;

import b3.AbstractC0219i;
import p3.InterfaceC0776t;
import s3.AbstractC0859o;

/* renamed from: y3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0937f extends F {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f9406l = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC0776t a(InterfaceC0776t interfaceC0776t) {
        AbstractC0219i.e("functionDescriptor", interfaceC0776t);
        N3.f name = ((AbstractC0859o) interfaceC0776t).getName();
        AbstractC0219i.d("functionDescriptor.name", name);
        if (b(name)) {
            return (InterfaceC0776t) U3.f.b(interfaceC0776t, C0936e.f9399e);
        }
        return null;
    }

    public static boolean b(N3.f fVar) {
        AbstractC0219i.e("<this>", fVar);
        return F.f9377e.contains(fVar);
    }
}
