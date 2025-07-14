package d4;

import a3.InterfaceC0107b;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class e extends j {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6407g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(l lVar, ConcurrentHashMap concurrentHashMap, InterfaceC0107b interfaceC0107b, int i5) {
        super(lVar, concurrentHashMap, interfaceC0107b);
        this.f6407g = i5;
    }

    public static /* synthetic */ void a(int i5) {
        String str = i5 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i5 != 3 ? 3 : 2];
        if (i5 == 1) {
            objArr[0] = "map";
        } else if (i5 == 2) {
            objArr[0] = "computation";
        } else if (i5 != 3) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        }
        if (i5 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        } else {
            objArr[1] = "computeIfAbsent";
        }
        if (i5 == 2) {
            objArr[2] = "computeIfAbsent";
        } else if (i5 != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i5 == 3) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // d4.j, a3.InterfaceC0107b
    public Object d(Object obj) throws Throwable {
        switch (this.f6407g) {
            case 1:
                Object objD = super.d(obj);
                if (objD != null) {
                    return objD;
                }
                throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull", "invoke"));
            default:
                return super.d(obj);
        }
    }
}
