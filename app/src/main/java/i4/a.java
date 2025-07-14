package i4;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import b3.k;
import c4.s;
import e4.Z;
import p3.InterfaceC0755Q;
import p3.InterfaceC0763g;

/* loaded from: classes.dex */
public final class a extends k implements InterfaceC0107b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f6921e = new a(1, 0);
    public static final a f = new a(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6922d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i5, int i6) {
        super(i5);
        this.f6922d = i6;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        switch (this.f6922d) {
            case 0:
                Z z4 = (Z) obj;
                AbstractC0219i.e("it", z4);
                InterfaceC0763g interfaceC0763gI = z4.I0().i();
                boolean z5 = false;
                if (interfaceC0763gI != null && (interfaceC0763gI instanceof InterfaceC0755Q) && (((InterfaceC0755Q) interfaceC0763gI).l() instanceof s)) {
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            default:
                Z z6 = (Z) obj;
                AbstractC0219i.e("it", z6);
                InterfaceC0763g interfaceC0763gI2 = z6.I0().i();
                boolean z7 = false;
                if (interfaceC0763gI2 != null && ((interfaceC0763gI2 instanceof s) || (interfaceC0763gI2 instanceof InterfaceC0755Q))) {
                    z7 = true;
                }
                return Boolean.valueOf(z7);
        }
    }
}
