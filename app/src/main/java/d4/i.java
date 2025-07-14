package d4;

import a3.InterfaceC0106a;

/* loaded from: classes.dex */
public class i extends h implements m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, InterfaceC0106a interfaceC0106a) {
        super(lVar, interfaceC0106a);
        if (lVar != null) {
        } else {
            b(0);
            throw null;
        }
    }

    public static /* synthetic */ void b(int i5) {
        String str = i5 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i5 != 2 ? 3 : 2];
        if (i5 == 1) {
            objArr[0] = "computable";
        } else if (i5 != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
        }
        if (i5 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
        } else {
            objArr[1] = "invoke";
        }
        if (i5 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i5 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // d4.h, a3.InterfaceC0106a
    public final Object a() throws Throwable {
        Object objA = super.a();
        if (objA != null) {
            return objA;
        }
        b(2);
        throw null;
    }
}
