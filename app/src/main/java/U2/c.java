package U2;

import O2.g;
import b3.AbstractC0219i;
import b3.InterfaceC0216f;
import b3.q;
import com.idm.core.tnds.IDMTndsXmlWbxmlDefine;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class c implements InterfaceC0216f, S2.a, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final S2.a f2562d;

    public c(S2.a aVar) {
        this.f2562d = aVar;
        if (aVar != null && aVar.a() != S2.b.f2526d) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // S2.a
    public final S2.b a() {
        return S2.b.f2526d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // S2.a
    public final void b(Object obj) {
        while (true) {
            c cVar = this;
            S2.a aVar = cVar.f2562d;
            AbstractC0219i.b(aVar);
            try {
                obj = cVar.e(obj);
                if (obj == T2.a.f2554d) {
                    return;
                }
            } catch (Throwable th) {
                obj = new g(th);
            }
            cVar.getClass();
            if (!(aVar instanceof c)) {
                aVar.b(obj);
                return;
            }
            this = aVar;
        }
    }

    public abstract S2.a d(Object obj, S2.a aVar);

    public abstract Object e(Object obj);

    public void f() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StackTraceElement] */
    public final String g() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strC;
        StringBuilder sb = new StringBuilder("Continuation at ");
        a aVar = (a) getClass().getAnnotation(a.class);
        String name = null;
        if (aVar != null) {
            int iV = aVar.v();
            if (iV > 1) {
                throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
            }
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                iIntValue = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                iIntValue = -1;
            }
            int i5 = iIntValue >= 0 ? aVar.l()[iIntValue] : -1;
            D3.c cVar = b.f2561b;
            D3.c cVar2 = b.f2560a;
            if (cVar == null) {
                try {
                    D3.c cVar3 = new D3.c(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 5);
                    b.f2561b = cVar3;
                    cVar = cVar3;
                } catch (Exception unused2) {
                    b.f2561b = cVar2;
                    cVar = cVar2;
                }
            }
            if (cVar != cVar2) {
                Method method = (Method) cVar.f507e;
                Object objInvoke = method != null ? method.invoke(getClass(), null) : null;
                if (objInvoke != null) {
                    Method method2 = (Method) cVar.f;
                    Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
                    if (objInvoke2 != null) {
                        Method method3 = (Method) cVar.f508g;
                        String strInvoke = method3 != null ? method3.invoke(objInvoke2, null) : null;
                        if (strInvoke instanceof String) {
                            name = strInvoke;
                        }
                    }
                }
            }
            if (name == null) {
                strC = aVar.c();
            } else {
                strC = name + IDMTndsXmlWbxmlDefine.XML_SLASH + aVar.c();
            }
            name = new StackTraceElement(strC, aVar.m(), aVar.f(), i5);
        }
        if (name == null) {
            name = getClass().getName();
        }
        sb.append((Object) name);
        return sb.toString();
    }

    public final String toString() {
        if (this.f2562d != null) {
            return g();
        }
        String strF = q.f5100a.f(this);
        AbstractC0219i.d("renderLambdaToString(this)", strF);
        return strF;
    }
}
