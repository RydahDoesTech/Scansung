package j3;

import I3.C0019a;
import I3.C0042y;
import O3.AbstractC0070b;
import O3.C0074f;
import O3.C0077i;
import O3.C0086s;
import b3.AbstractC0212b;
import b3.AbstractC0217g;
import b3.AbstractC0219i;
import b3.InterfaceC0216f;
import com.google.firebase.messaging.C0388e;
import e4.AbstractC0438v;
import g3.InterfaceC0453c;
import g3.InterfaceC0455e;
import g3.InterfaceC0456f;
import g3.InterfaceC0459i;
import g3.InterfaceC0465o;
import i3.C0482a;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import p3.InterfaceC0776t;
import s3.C0837M;

/* loaded from: classes.dex */
public class t0 extends b3.r {
    public static D h(AbstractC0212b abstractC0212b) {
        InterfaceC0455e interfaceC0455eJ = abstractC0212b.j();
        return interfaceC0455eJ instanceof D ? (D) interfaceC0455eJ : C0564d.f7383e;
    }

    @Override // b3.r
    public final InterfaceC0456f a(AbstractC0217g abstractC0217g) {
        D dH = h(abstractC0217g);
        String name = abstractC0217g.getName();
        String strL = abstractC0217g.l();
        AbstractC0219i.e("container", dH);
        AbstractC0219i.e("name", name);
        AbstractC0219i.e("signature", strL);
        return new F(dH, name, strL, null, abstractC0217g.f5087e);
    }

    @Override // b3.r
    public final InterfaceC0453c b(Class cls) {
        return AbstractC0563c.a(cls);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [a3.b, b3.k] */
    @Override // b3.r
    public final InterfaceC0455e c(Class cls, String str) {
        C0388e c0388e = AbstractC0563c.f7379a;
        AbstractC0219i.e("jClass", cls);
        C0388e c0388e2 = AbstractC0563c.f7380b;
        c0388e2.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0388e2.f;
        Object obj = concurrentHashMap.get(cls);
        if (obj == null) {
            Object objD = ((b3.k) c0388e2.f6142e).d(cls);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, objD);
            obj = objPutIfAbsent == null ? objD : objPutIfAbsent;
        }
        return (InterfaceC0455e) obj;
    }

    @Override // b3.r
    public final InterfaceC0459i d(b3.l lVar) {
        return new J(h(lVar), lVar.f5088g, lVar.f5089h, lVar.f5087e);
    }

    @Override // b3.r
    public final InterfaceC0465o e(b3.n nVar) {
        return new a0(h(nVar), nVar.f5088g, nVar.f5089h, nVar.f5087e);
    }

    @Override // b3.r
    public final String f(InterfaceC0216f interfaceC0216f) throws C0086s {
        F fB;
        AbstractC0219i.e("<this>", interfaceC0216f);
        Metadata metadata = (Metadata) interfaceC0216f.getClass().getAnnotation(Metadata.class);
        F f = null;
        if (metadata != null) {
            String[] strArrD1 = metadata.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 != null) {
                String[] strArrD2 = metadata.d2();
                C0077i c0077i = M3.h.f1826a;
                AbstractC0219i.e("strings", strArrD2);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(M3.a.a(strArrD1));
                C0077i c0077i2 = M3.h.f1826a;
                M3.g gVarG = M3.h.g(byteArrayInputStream, strArrD2);
                C0019a c0019a = C0042y.f1392y;
                C0077i c0077i3 = M3.h.f1826a;
                c0019a.getClass();
                C0074f c0074f = new C0074f(byteArrayInputStream);
                AbstractC0070b abstractC0070b = (AbstractC0070b) c0019a.a(c0074f, c0077i3);
                try {
                    c0074f.a(0);
                    if (!abstractC0070b.b()) {
                        C0086s c0086s = new C0086s(new O2.d().getMessage());
                        c0086s.f2092d = abstractC0070b;
                        throw c0086s;
                    }
                    C0042y c0042y = (C0042y) abstractC0070b;
                    M3.f fVar = new M3.f(metadata.mv(), (metadata.xi() & 8) != 0);
                    Class<?> cls = interfaceC0216f.getClass();
                    I3.X x4 = c0042y.f1405s;
                    AbstractC0219i.d("proto.typeTable", x4);
                    f = new F(C0564d.f7383e, (C0837M) x0.f(cls, c0042y, gVarG, new K3.g(x4), fVar, C0482a.f6920l));
                } catch (C0086s e5) {
                    e5.f2092d = abstractC0070b;
                    throw e5;
                }
            }
        }
        if (f == null || (fB = x0.b(f)) == null) {
            return super.f(interfaceC0216f);
        }
        P3.g gVar = u0.f7441a;
        InterfaceC0776t interfaceC0776tQ = fB.l();
        StringBuilder sb = new StringBuilder();
        u0.a(sb, interfaceC0776tQ);
        List listV0 = interfaceC0776tQ.v0();
        AbstractC0219i.d("invoke.valueParameters", listV0);
        P2.m.z0(listV0, sb, "(", ")", C0562b.f7375l, 48);
        sb.append(" -> ");
        AbstractC0438v abstractC0438vO = interfaceC0776tQ.o();
        AbstractC0219i.b(abstractC0438vO);
        sb.append(u0.d(abstractC0438vO));
        String string = sb.toString();
        AbstractC0219i.d("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }

    @Override // b3.r
    public final String g(b3.k kVar) {
        return f(kVar);
    }
}
