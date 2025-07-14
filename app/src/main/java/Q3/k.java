package Q3;

import c4.s;
import e1.AbstractC0415a;
import java.util.Comparator;
import p3.InterfaceC0750L;
import p3.InterfaceC0761e;
import p3.InterfaceC0765i;
import p3.InterfaceC0766j;
import p3.InterfaceC0776t;

/* loaded from: classes.dex */
public final class k implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final k f2348b = new k(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2349a;

    public /* synthetic */ k(int i5) {
        this.f2349a = i5;
    }

    public static int a(InterfaceC0766j interfaceC0766j) {
        if (f.n(interfaceC0766j)) {
            return 8;
        }
        if (interfaceC0766j instanceof InterfaceC0765i) {
            return 7;
        }
        if (interfaceC0766j instanceof InterfaceC0750L) {
            return ((InterfaceC0750L) interfaceC0766j).b0() == null ? 6 : 5;
        }
        if (interfaceC0766j instanceof InterfaceC0776t) {
            return ((InterfaceC0776t) interfaceC0766j).b0() == null ? 4 : 3;
        }
        if (interfaceC0766j instanceof InterfaceC0761e) {
            return 2;
        }
        return interfaceC0766j instanceof s ? 1 : 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer numValueOf;
        switch (this.f2349a) {
            case 0:
                InterfaceC0766j interfaceC0766j = (InterfaceC0766j) obj;
                InterfaceC0766j interfaceC0766j2 = (InterfaceC0766j) obj2;
                int iA = a(interfaceC0766j2) - a(interfaceC0766j);
                if (iA != 0) {
                    numValueOf = Integer.valueOf(iA);
                } else if (f.o(interfaceC0766j, 4) && f.o(interfaceC0766j2, 4)) {
                    numValueOf = 0;
                } else {
                    int iCompareTo = interfaceC0766j.getName().f1842d.compareTo(interfaceC0766j2.getName().f1842d);
                    numValueOf = iCompareTo != 0 ? Integer.valueOf(iCompareTo) : null;
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                return 0;
            default:
                return AbstractC0415a.e(U3.f.g((InterfaceC0761e) obj).b(), U3.f.g((InterfaceC0761e) obj2).b());
        }
    }
}
