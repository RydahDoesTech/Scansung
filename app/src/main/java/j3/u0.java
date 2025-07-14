package j3;

import b3.AbstractC0219i;
import com.idm.providers.mo.IDMMoInterface;
import e4.AbstractC0438v;
import java.util.List;
import p3.InterfaceC0750L;
import p3.InterfaceC0759c;
import p3.InterfaceC0776t;
import s3.AbstractC0859o;
import s3.C0867w;

/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final P3.g f7441a = P3.g.f2193c;

    public static void a(StringBuilder sb, InterfaceC0759c interfaceC0759c) {
        C0867w c0867wG = x0.g(interfaceC0759c);
        C0867w c0867wB0 = interfaceC0759c.b0();
        if (c0867wG != null) {
            sb.append(d(c0867wG.d()));
            sb.append(IDMMoInterface.IDM_MO_ROOT_PATH);
        }
        boolean z4 = (c0867wG == null || c0867wB0 == null) ? false : true;
        if (z4) {
            sb.append("(");
        }
        if (c0867wB0 != null) {
            sb.append(d(c0867wB0.d()));
            sb.append(IDMMoInterface.IDM_MO_ROOT_PATH);
        }
        if (z4) {
            sb.append(")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String b(InterfaceC0776t interfaceC0776t) {
        AbstractC0219i.e("descriptor", interfaceC0776t);
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        a(sb, interfaceC0776t);
        N3.f name = ((AbstractC0859o) interfaceC0776t).getName();
        AbstractC0219i.d("descriptor.name", name);
        sb.append(f7441a.M(name, true));
        List listV0 = interfaceC0776t.v0();
        AbstractC0219i.d("descriptor.valueParameters", listV0);
        P2.m.z0(listV0, sb, "(", ")", C0562b.f7374k, 48);
        sb.append(": ");
        AbstractC0438v abstractC0438vO = interfaceC0776t.o();
        AbstractC0219i.b(abstractC0438vO);
        sb.append(d(abstractC0438vO));
        String string = sb.toString();
        AbstractC0219i.d("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }

    public static String c(InterfaceC0750L interfaceC0750L) {
        AbstractC0219i.e("descriptor", interfaceC0750L);
        StringBuilder sb = new StringBuilder();
        sb.append(interfaceC0750L.T() ? "var " : "val ");
        a(sb, interfaceC0750L);
        N3.f name = interfaceC0750L.getName();
        AbstractC0219i.d("descriptor.name", name);
        sb.append(f7441a.M(name, true));
        sb.append(": ");
        AbstractC0438v abstractC0438vD = interfaceC0750L.d();
        AbstractC0219i.d("descriptor.type", abstractC0438vD);
        sb.append(d(abstractC0438vD));
        String string = sb.toString();
        AbstractC0219i.d("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }

    public static String d(AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("type", abstractC0438v);
        return f7441a.W(abstractC0438v);
    }
}
