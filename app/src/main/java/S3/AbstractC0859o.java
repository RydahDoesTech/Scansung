package s3;

import p3.InterfaceC0766j;
import q3.InterfaceC0798h;

/* renamed from: s3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0859o extends H3.c implements InterfaceC0766j {

    /* renamed from: e, reason: collision with root package name */
    public final N3.f f8838e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0859o(InterfaceC0798h interfaceC0798h, N3.f fVar) {
        super(interfaceC0798h);
        if (interfaceC0798h == null) {
            H0(0);
            throw null;
        }
        if (fVar == null) {
            H0(1);
            throw null;
        }
        this.f8838e = fVar;
    }

    public static /* synthetic */ void H0(int i5) {
        String str = (i5 == 2 || i5 == 3 || i5 == 5 || i5 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i5 == 2 || i5 == 3 || i5 == 5 || i5 == 6) ? 2 : 3];
        switch (i5) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i5 == 2) {
            objArr[1] = "getName";
        } else if (i5 == 3) {
            objArr[1] = "getOriginal";
        } else if (i5 == 5 || i5 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i5 != 2 && i5 != 3) {
            if (i5 == 4) {
                objArr[2] = "toString";
            } else if (i5 != 5 && i5 != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i5 != 2 && i5 != 3 && i5 != 5 && i5 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static String M0(InterfaceC0766j interfaceC0766j) {
        try {
            String str = P3.g.f2195e.u(interfaceC0766j) + "[" + interfaceC0766j.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC0766j)) + "]";
            if (str != null) {
                return str;
            }
            H0(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = interfaceC0766j.getClass().getSimpleName() + " " + interfaceC0766j.getName();
            if (str2 != null) {
                return str2;
            }
            H0(6);
            throw null;
        }
    }

    public InterfaceC0766j a() {
        return this;
    }

    @Override // p3.InterfaceC0766j
    public final N3.f getName() {
        N3.f fVar = this.f8838e;
        if (fVar != null) {
            return fVar;
        }
        H0(2);
        throw null;
    }

    public String toString() {
        return M0(this);
    }
}
