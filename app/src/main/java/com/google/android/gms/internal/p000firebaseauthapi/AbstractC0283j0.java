package com.google.android.gms.internal.p000firebaseauthapi;

import A3.f;
import a4.v;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0283j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f5522a = Logger.getLogger(AbstractC0283j0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f5523b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f5524c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f5525d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f5526e;
    public static final ConcurrentHashMap f;

    static {
        new ConcurrentHashMap();
        f5526e = new ConcurrentHashMap();
        f = new ConcurrentHashMap();
    }

    public static synchronized T1 a(V1 v12) {
        U uB;
        uB = h(v12.q()).b();
        if (!((Boolean) f5525d.get(v12.q())).booleanValue()) {
            String strValueOf = String.valueOf(v12.q());
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(strValueOf) : new String("newKey-operation not permitted for key type "));
        }
        return uB.a(v12.p());
    }

    public static synchronized U4 b(V1 v12) {
        U uB;
        uB = h(v12.q()).b();
        if (!((Boolean) f5525d.get(v12.q())).booleanValue()) {
            String strValueOf = String.valueOf(v12.q());
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(strValueOf) : new String("newKey-operation not permitted for key type "));
        }
        return uB.d(v12.p());
    }

    public static Object c(String str, m5 m5Var, Class cls) throws GeneralSecurityException {
        U uG = g(cls, str);
        v vVar = (v) uG.f;
        String name = ((Class) vVar.f3093b).getName();
        String strConcat = name.length() != 0 ? "Expected proto of type ".concat(name) : new String("Expected proto of type ");
        if (!((Class) vVar.f3093b).isInstance(m5Var)) {
            throw new GeneralSecurityException(strConcat);
        }
        Class cls2 = (Class) uG.f5393e;
        if (Void.class.equals(cls2)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        vVar.s(m5Var);
        return vVar.q(m5Var, cls2);
    }

    public static Object d(String str, byte[] bArr) throws GeneralSecurityException {
        Y4 y4 = Z4.f5416e;
        Y4 y4Q = Z4.q(bArr, 0, bArr.length);
        U uG = g(Q.class, str);
        v vVar = (v) uG.f;
        try {
            U4 u4P = vVar.p(y4Q);
            Class cls = (Class) uG.f5393e;
            if (Void.class.equals(cls)) {
                throw new GeneralSecurityException("Cannot create a primitive for Void");
            }
            vVar.s(u4P);
            return vVar.q(u4P, cls);
        } catch (C0258f e5) {
            String name = ((Class) vVar.f3093b).getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e5);
        }
    }

    public static synchronized void e(v vVar) {
        try {
            String strR = vVar.r();
            i(strR, vVar.getClass(), vVar.n().c(), true);
            ConcurrentHashMap concurrentHashMap = f5523b;
            if (!concurrentHashMap.containsKey(strR)) {
                concurrentHashMap.put(strR, new C0265g0(vVar));
                f5524c.put(strR, new M(1));
                j(strR, vVar.n().c());
            }
            f5525d.put(strR, Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void f(InterfaceC0253e0 interfaceC0253e0) {
        try {
            Class clsB = interfaceC0253e0.b();
            ConcurrentHashMap concurrentHashMap = f5526e;
            if (concurrentHashMap.containsKey(clsB)) {
                InterfaceC0253e0 interfaceC0253e02 = (InterfaceC0253e0) concurrentHashMap.get(clsB);
                if (!interfaceC0253e0.getClass().getName().equals(interfaceC0253e02.getClass().getName())) {
                    Logger logger = f5522a;
                    Level level = Level.WARNING;
                    String strValueOf = String.valueOf(clsB);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 62);
                    sb.append("Attempted overwrite of a registered PrimitiveWrapper for type ");
                    sb.append(strValueOf);
                    logger.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", sb.toString());
                    throw new GeneralSecurityException("PrimitiveWrapper for primitive (" + clsB.getName() + ") is already registered to be " + interfaceC0253e02.getClass().getName() + ", cannot be re-registered with " + interfaceC0253e0.getClass().getName());
                }
            }
            concurrentHashMap.put(clsB, interfaceC0253e0);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static U g(Class cls, String str) {
        InterfaceC0277i0 interfaceC0277i0H = h(str);
        if (cls == null) {
            return interfaceC0277i0H.b();
        }
        if (interfaceC0277i0H.a().contains(cls)) {
            return interfaceC0277i0H.d(cls);
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(interfaceC0277i0H.e());
        Set<Class> setA = interfaceC0277i0H.a();
        StringBuilder sb = new StringBuilder();
        boolean z4 = true;
        for (Class cls2 : setA) {
            if (!z4) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z4 = false;
        }
        String string = sb.toString();
        int length = name.length();
        StringBuilder sb2 = new StringBuilder(length + 77 + strValueOf.length() + String.valueOf(string).length());
        sb2.append("Primitive type ");
        sb2.append(name);
        sb2.append(" not supported by key manager of type ");
        sb2.append(strValueOf);
        throw new GeneralSecurityException(f.p(sb2, ", supported primitives: ", string));
    }

    public static synchronized InterfaceC0277i0 h(String str) {
        ConcurrentHashMap concurrentHashMap;
        try {
            concurrentHashMap = f5523b;
            if (!concurrentHashMap.containsKey(str)) {
                String strValueOf = String.valueOf(str);
                throw new GeneralSecurityException(strValueOf.length() != 0 ? "No key manager found for key type ".concat(strValueOf) : new String("No key manager found for key type "));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC0277i0) concurrentHashMap.get(str);
    }

    public static synchronized void i(String str, Class cls, Map map, boolean z4) {
        try {
            ConcurrentHashMap concurrentHashMap = f5523b;
            InterfaceC0277i0 interfaceC0277i0 = (InterfaceC0277i0) concurrentHashMap.get(str);
            if (interfaceC0277i0 != null && !interfaceC0277i0.e().equals(cls)) {
                f5522a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", str.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(str) : new String("Attempted overwrite of a registered key manager for key type "));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + interfaceC0277i0.e().getName() + ", cannot be re-registered with " + cls.getName());
            }
            if (z4) {
                ConcurrentHashMap concurrentHashMap2 = f5525d;
                if (concurrentHashMap2.containsKey(str) && !((Boolean) concurrentHashMap2.get(str)).booleanValue()) {
                    throw new GeneralSecurityException(str.length() != 0 ? "New keys are already disallowed for key type ".concat(str) : new String("New keys are already disallowed for key type "));
                }
                if (concurrentHashMap.containsKey(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!f.containsKey(entry.getKey())) {
                            String str2 = (String) entry.getKey();
                            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 79 + str.length());
                            sb.append("Attempted to register a new key template ");
                            sb.append(str2);
                            sb.append(" from an existing key manager of type ");
                            sb.append(str);
                            throw new GeneralSecurityException(sb.toString());
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (f.containsKey(entry2.getKey())) {
                            String strValueOf = String.valueOf((String) entry2.getKey());
                            throw new GeneralSecurityException(strValueOf.length() != 0 ? "Attempted overwrite of a registered key template ".concat(strValueOf) : new String("Attempted overwrite of a registered key template "));
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void j(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f.put((String) entry.getKey(), V.a(((W) entry.getValue()).f5401a.c(), ((W) entry.getValue()).f5402b, str));
        }
    }
}
