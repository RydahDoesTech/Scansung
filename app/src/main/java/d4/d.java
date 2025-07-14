package d4;

import C3.C0012d;
import com.google.firebase.messaging.C0388e;
import e4.C0423f;

/* loaded from: classes.dex */
public final class d extends h implements m {

    /* renamed from: g, reason: collision with root package name */
    public volatile C0388e f6405g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ B3.d f6406h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, C0012d c0012d, B3.d dVar) {
        super(lVar, c0012d);
        this.f6406h = dVar;
        if (lVar == null) {
            e(0);
            throw null;
        }
        this.f6405g = null;
    }

    public static /* synthetic */ void b(int i5) {
        String str = i5 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i5 != 2 ? 2 : 3];
        if (i5 != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i5 != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i5 == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i5 == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static /* synthetic */ void e(int i5) {
        String str = i5 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i5 != 2 ? 3 : 2];
        if (i5 == 1) {
            objArr[0] = "computable";
        } else if (i5 != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i5 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
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
        Object objA;
        C0388e c0388e = this.f6405g;
        if (c0388e == null || ((Thread) c0388e.f) != Thread.currentThread()) {
            objA = super.a();
        } else {
            if (((Thread) c0388e.f) != Thread.currentThread()) {
                throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
            }
            objA = c0388e.f6142e;
        }
        if (objA != null) {
            return objA;
        }
        e(2);
        throw null;
    }

    @Override // d4.h
    public final void c(Object obj) {
        this.f6405g = new C0388e(obj);
        try {
            if (obj != null) {
                this.f6406h.d(obj);
            } else {
                b(2);
                throw null;
            }
        } finally {
            this.f6405g = null;
        }
    }

    @Override // d4.h
    public final A1.c d(boolean z4) {
        return new A1.c(C0423f.f6678e.d(Boolean.valueOf(z4)), false, 4);
    }
}
