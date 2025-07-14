package d4;

import a3.InterfaceC0107b;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class j implements InterfaceC0107b {

    /* renamed from: d, reason: collision with root package name */
    public final l f6412d;

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f6413e;
    public final InterfaceC0107b f;

    public j(l lVar, ConcurrentHashMap concurrentHashMap, InterfaceC0107b interfaceC0107b) {
        if (lVar == null) {
            a(0);
            throw null;
        }
        this.f6412d = lVar;
        this.f6413e = concurrentHashMap;
        this.f = interfaceC0107b;
    }

    public static /* synthetic */ void a(int i5) {
        String str = (i5 == 3 || i5 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i5 == 3 || i5 == 4) ? 2 : 3];
        if (i5 == 1) {
            objArr[0] = "map";
        } else if (i5 == 2) {
            objArr[0] = "compute";
        } else if (i5 == 3 || i5 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i5 == 3) {
            objArr[1] = "recursionDetected";
        } else if (i5 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i5 != 3 && i5 != 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i5 != 3 && i5 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public final AssertionError b(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.f6412d);
        l.e(assertionError);
        return assertionError;
    }

    @Override // a3.InterfaceC0107b
    public Object d(Object obj) throws Throwable {
        ConcurrentHashMap concurrentHashMap = this.f6413e;
        Object obj2 = concurrentHashMap.get(obj);
        k kVar = k.f6415e;
        Object obj3 = n4.k.f8199a;
        if (obj2 != null && obj2 != kVar) {
            n4.k.j(obj2);
            if (obj2 == obj3) {
                return null;
            }
            return obj2;
        }
        l lVar = this.f6412d;
        n nVar = lVar.f6419a;
        n nVar2 = lVar.f6419a;
        nVar.E();
        try {
            Object obj4 = concurrentHashMap.get(obj);
            k kVar2 = k.f;
            if (obj4 == kVar) {
                A1.c cVarD = lVar.d("", obj);
                if (cVarD == null) {
                    a(3);
                    throw null;
                }
                if (!cVarD.f53e) {
                    Object obj5 = cVarD.f;
                    nVar2.z();
                    return obj5;
                }
                obj4 = kVar2;
            }
            if (obj4 == kVar2) {
                A1.c cVarD2 = lVar.d("", obj);
                if (cVarD2 == null) {
                    a(3);
                    throw null;
                }
                if (!cVarD2.f53e) {
                    Object obj6 = cVarD2.f;
                    nVar2.z();
                    return obj6;
                }
            }
            if (obj4 != null) {
                n4.k.j(obj4);
                assertionErrorB = obj4 != obj3 ? obj4 : null;
                nVar2.z();
                return assertionErrorB;
            }
            try {
                concurrentHashMap.put(obj, kVar);
                Object objD = this.f.d(obj);
                if (objD != null) {
                    obj3 = objD;
                }
                Object objPut = concurrentHashMap.put(obj, obj3);
                if (objPut == kVar) {
                    nVar2.z();
                    return objD;
                }
                assertionErrorB = b(obj, objPut);
                throw assertionErrorB;
            } catch (Throwable th) {
                if (n4.k.h(th)) {
                    concurrentHashMap.remove(obj);
                    throw th;
                }
                a aVar = lVar.f6420b;
                if (th == assertionErrorB) {
                    aVar.getClass();
                    throw th;
                }
                Object objPut2 = concurrentHashMap.put(obj, new n4.j(th));
                if (objPut2 != kVar) {
                    throw b(obj, objPut2);
                }
                aVar.getClass();
                throw th;
            }
        } catch (Throwable th2) {
            nVar2.z();
            throw th2;
        }
    }
}
