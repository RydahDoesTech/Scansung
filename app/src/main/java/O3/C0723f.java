package o3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.util.ArrayList;
import java.util.List;
import p3.InterfaceC0781y;
import s3.y;

/* renamed from: o3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0723f extends b3.k implements InterfaceC0107b {

    /* renamed from: d, reason: collision with root package name */
    public static final C0723f f8261d = new C0723f(1);

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        InterfaceC0781y interfaceC0781y = (InterfaceC0781y) obj;
        AbstractC0219i.e("module", interfaceC0781y);
        List list = (List) V1.a.Q(((y) interfaceC0781y.D(C0724g.f)).f8901h, y.f8899k[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof b4.c) {
                arrayList.add(obj2);
            }
        }
        return (b4.c) P2.m.u0(arrayList);
    }
}
