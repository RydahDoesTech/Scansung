package n4;

import P2.m;
import P2.u;
import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import g3.y;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final i f8199a = new i();

    public static final void a(AbstractCollection abstractCollection, Object obj) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static final List d(ArrayList arrayList) {
        AbstractC0219i.e("<this>", arrayList);
        int size = arrayList.size();
        if (size == 0) {
            return u.f2163d;
        }
        if (size == 1) {
            return y.N(m.u0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static Object e(List list, a aVar, k kVar) {
        r2.c cVar = new r2.c(1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f(it.next(), aVar, cVar, kVar);
        }
        return kVar.i();
    }

    public static void f(Object obj, a aVar, r2.c cVar, k kVar) {
        if (obj != null) {
            if (cVar.f8579a.add(obj) && kVar.c(obj)) {
                Iterator it = aVar.p(obj).iterator();
                while (it.hasNext()) {
                    f(it.next(), aVar, cVar, kVar);
                }
                kVar.b(obj);
                return;
            }
            return;
        }
        Object[] objArr = new Object[3];
        switch (22) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (22) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static Boolean g(List list, a aVar, InterfaceC0107b interfaceC0107b) {
        return (Boolean) e(list, aVar, new U3.d(interfaceC0107b, new boolean[1]));
    }

    public static final boolean h(Throwable th) {
        Class<?> superclass = th.getClass();
        while (!AbstractC0219i.a(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static void j(Object obj) throws Throwable {
        if (obj instanceof j) {
            throw ((j) obj).f8198a;
        }
    }

    public void b(Object obj) {
    }

    public abstract boolean c(Object obj);

    public abstract Object i();
}
