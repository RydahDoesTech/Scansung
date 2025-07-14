package U3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import b3.p;
import java.io.Serializable;
import n4.k;
import o3.C0732o;
import o3.EnumC0727j;
import p3.InterfaceC0759c;
import p3.InterfaceC0761e;

/* loaded from: classes.dex */
public final class d extends k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2566b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2567c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f2568d;

    /* JADX WARN: Multi-variable type inference failed */
    public d(InterfaceC0107b interfaceC0107b, boolean[] zArr) {
        this.f2567c = interfaceC0107b;
        this.f2568d = zArr;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [a3.b, b3.k] */
    @Override // n4.k
    public void b(Object obj) {
        switch (this.f2566b) {
            case 0:
                InterfaceC0759c interfaceC0759c = (InterfaceC0759c) obj;
                AbstractC0219i.e("current", interfaceC0759c);
                p pVar = (p) this.f2567c;
                if (pVar.f5099e == null && ((Boolean) ((b3.k) this.f2568d).d(interfaceC0759c)).booleanValue()) {
                    pVar.f5099e = interfaceC0759c;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [a3.b, java.lang.Object] */
    @Override // n4.k
    public final boolean c(Object obj) {
        switch (this.f2566b) {
            case 0:
                AbstractC0219i.e("current", (InterfaceC0759c) obj);
                return ((p) this.f2567c).f5099e == null;
            case 1:
                boolean zBooleanValue = ((Boolean) this.f2567c.d(obj)).booleanValue();
                boolean[] zArr = (boolean[]) this.f2568d;
                if (zBooleanValue) {
                    zArr[0] = true;
                }
                return !zArr[0];
            default:
                InterfaceC0761e interfaceC0761e = (InterfaceC0761e) obj;
                AbstractC0219i.e("javaClassDescriptor", interfaceC0761e);
                String strZ = J2.b.Z(interfaceC0761e, (String) this.f2568d);
                boolean zContains = C0732o.f8290b.contains(strZ);
                p pVar = (p) this.f2567c;
                if (zContains) {
                    pVar.f5099e = EnumC0727j.f8272d;
                } else if (C0732o.f8291c.contains(strZ)) {
                    pVar.f5099e = EnumC0727j.f8273e;
                } else if (C0732o.f8289a.contains(strZ)) {
                    pVar.f5099e = EnumC0727j.f8274g;
                }
                return pVar.f5099e == null;
        }
    }

    @Override // n4.k
    public final Object i() {
        switch (this.f2566b) {
            case 0:
                return (InterfaceC0759c) ((p) this.f2567c).f5099e;
            case 1:
                return Boolean.valueOf(((boolean[]) this.f2568d)[0]);
            default:
                EnumC0727j enumC0727j = (EnumC0727j) ((p) this.f2567c).f5099e;
                return enumC0727j == null ? EnumC0727j.f : enumC0727j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(p pVar, InterfaceC0107b interfaceC0107b) {
        this.f2567c = pVar;
        this.f2568d = (b3.k) interfaceC0107b;
    }

    public d(String str, p pVar) {
        this.f2568d = str;
        this.f2567c = pVar;
    }
}
