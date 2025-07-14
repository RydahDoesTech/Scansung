package j3;

import b3.AbstractC0219i;
import com.idm.core.tnds.IDMTndsXmlWbxmlDefine;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;
import e4.C0429l;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import m3.AbstractC0695h;
import n3.C0696a;
import o3.C0724g;
import o3.C0726i;
import o3.C0730m;
import o3.C0731n;
import p3.C0753O;
import r3.C0815a;
import r3.InterfaceC0816b;
import r3.InterfaceC0818d;
import s3.C0826B;
import s3.C0858n;
import u3.C0880b;
import u3.C0883e;
import u3.C0884f;
import v3.AbstractC0897d;
import x3.C0914a;
import y3.C0934c;

/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f7428a = new ConcurrentHashMap();

    public static final C0884f a(Class cls) {
        d4.l lVar;
        InterfaceC0816b interfaceC0816bH;
        InterfaceC0818d interfaceC0818dH;
        AbstractC0219i.e("<this>", cls);
        ClassLoader classLoaderD = AbstractC0897d.d(cls);
        y0 y0Var = new y0(classLoaderD);
        ConcurrentHashMap concurrentHashMap = f7428a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(y0Var);
        if (weakReference != null) {
            C0884f c0884f = (C0884f) weakReference.get();
            if (c0884f != null) {
                return c0884f;
            }
            concurrentHashMap.remove(y0Var, weakReference);
        }
        C0880b c0880b = new C0880b(classLoaderD);
        ClassLoader classLoader = O2.l.class.getClassLoader();
        AbstractC0219i.d("Unit::class.java.classLoader", classLoader);
        C0880b c0880b2 = new C0880b(classLoader);
        C0880b c0880b3 = new C0880b(classLoaderD);
        String str = "runtime module for " + classLoaderD;
        C0883e c0883e = C0883e.f9190b;
        C0883e c0883e2 = C0883e.f9191c;
        AbstractC0219i.e("moduleName", str);
        d4.l lVar2 = new d4.l("DeserializationComponentsForJava.ModuleData");
        C0726i c0726i = new C0726i(lVar2);
        C0826B c0826b = new C0826B(N3.f.g("<" + str + IDMTndsXmlWbxmlDefine.XML_CLOSE_TAG), lVar2, c0726i, 56);
        d4.n nVar = lVar2.f6419a;
        nVar.E();
        try {
            if (c0726i.f8065a != null) {
                lVar = lVar2;
                try {
                    throw new AssertionError("Built-ins module is already set: " + c0726i.f8065a + " (attempting to reset to " + c0826b + ")");
                } catch (Throwable th) {
                    th = th;
                    try {
                        lVar.f6420b.getClass();
                        throw th;
                    } catch (Throwable th2) {
                        nVar.z();
                        throw th2;
                    }
                }
            }
            c0726i.f8065a = c0826b;
            nVar.z();
            c0726i.f = new m3.k(c0826b, 1);
            G3.f fVar = new G3.f();
            B.g gVar = new B.g(3, false);
            com.google.firebase.messaging.q qVar = new com.google.firebase.messaging.q(lVar2, c0826b);
            G3.g gVar2 = G3.g.f758c;
            z3.h hVar = z3.h.f9498c;
            z3.h hVar2 = z3.h.f9496a;
            P2.u uVar = P2.u.f2163d;
            b4.d dVar = new b4.d(lVar2);
            C0753O c0753o = C0753O.f;
            C0914a c0914a = C0914a.f9314a;
            m3.l lVar3 = new m3.l(c0826b, qVar);
            y0 y0Var2 = y0Var;
            y3.t tVar = y3.t.f9431c;
            C0934c c0934c = new C0934c(tVar);
            B3.c cVar = B3.c.f245a;
            F3.d dVar2 = new F3.d();
            y3.m mVar = y3.m.f9414a;
            f4.k.f6754b.getClass();
            f4.l lVar4 = f4.j.f6753b;
            ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
            B3.f fVar2 = new B3.f(new B3.b(lVar2, c0880b3, c0880b, fVar, hVar, c0883e, hVar2, dVar, c0883e2, gVar, gVar2, c0753o, c0914a, c0826b, lVar3, c0934c, dVar2, mVar, cVar, lVar4, tVar, new G3.g()));
            M3.f fVar3 = M3.f.f1821g;
            AbstractC0219i.e("jvmMetadataVersion", fVar3);
            E0.d dVar3 = new E0.d(c0880b, 4, fVar);
            G3.d dVar4 = new G3.d();
            dVar4.f746d = c0880b;
            dVar4.f747e = lVar2.b(new B3.d(7, dVar4));
            dVar4.f = c0826b;
            dVar4.f748g = qVar;
            dVar4.f749h = new E0.d(c0826b, qVar);
            dVar4.f750i = M3.f.f1821g;
            dVar4.f750i = fVar3;
            List listN = g3.y.N(C0429l.f6688a);
            AbstractC0695h abstractC0695h = c0826b.f8732g;
            C0726i c0726i2 = abstractC0695h instanceof C0726i ? (C0726i) abstractC0695h : null;
            G3.g gVar3 = G3.g.f757b;
            if (c0726i2 == null || (interfaceC0816bH = c0726i2.H()) == null) {
                interfaceC0816bH = C0815a.f8580b;
            }
            InterfaceC0816b interfaceC0816b = interfaceC0816bH;
            if (c0726i2 == null || (interfaceC0818dH = c0726i2.H()) == null) {
                interfaceC0818dH = C0815a.f8582d;
            }
            a4.i iVar = new a4.i(lVar2, c0826b, dVar3, dVar4, fVar2, c0883e, gVar3, uVar, qVar, interfaceC0816b, interfaceC0818dH, M3.h.f1826a, lVar4, new b4.d(lVar2), listN, NetworkAnalyticsConstants.DataPoints.FLAG_PARENT_PROCESS_HASH);
            fVar.f756a = iVar;
            gVar.f95e = new B.g(21, fVar2);
            C0730m c0730mH = c0726i.H();
            C0730m c0730mH2 = c0726i.H();
            b4.d dVar5 = new b4.d(lVar2);
            AbstractC0219i.e("additionalClassPartsProvider", c0730mH);
            AbstractC0219i.e("platformDependentDeclarationFilter", c0730mH2);
            C0731n c0731n = new C0731n(lVar2, c0880b2, c0826b);
            B.g gVar4 = new B.g(29, c0731n);
            b4.a aVar = b4.a.f5101m;
            c0731n.f8287c = new a4.i(lVar2, c0826b, gVar4, new E0.d(c0826b, qVar, aVar), c0731n, a4.l.f3066a, a4.j.f3056c, P2.n.h0(new C0696a(lVar2, c0826b), new C0724g(lVar2, c0826b)), qVar, c0730mH, c0730mH2, aVar.f2908a, lVar4, dVar5, null, 786432);
            c0826b.f8735j = new K3.g(P2.i.w0(new C0826B[]{c0826b}));
            c0826b.f8736k = new C0858n("CompositeProvider@RuntimeModuleData for " + c0826b, P2.n.h0(fVar2, c0731n));
            C0884f c0884f2 = new C0884f(iVar, new D3.c(fVar, c0880b));
            while (true) {
                y0 y0Var3 = y0Var2;
                ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
                WeakReference weakReference2 = (WeakReference) concurrentHashMap3.putIfAbsent(y0Var3, new WeakReference(c0884f2));
                if (weakReference2 == null) {
                    return c0884f2;
                }
                C0884f c0884f3 = (C0884f) weakReference2.get();
                if (c0884f3 != null) {
                    return c0884f3;
                }
                concurrentHashMap3.remove(y0Var3, weakReference2);
                y0Var2 = y0Var3;
                concurrentHashMap2 = concurrentHashMap3;
            }
        } catch (Throwable th3) {
            th = th3;
            lVar = lVar2;
        }
    }
}
