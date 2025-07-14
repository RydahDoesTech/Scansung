package s3;

import p3.InterfaceC0752N;
import p3.InterfaceC0766j;
import p3.InterfaceC0767k;
import q3.InterfaceC0798h;

/* renamed from: s3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0860p extends AbstractC0859o implements InterfaceC0767k {
    public final InterfaceC0766j f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0752N f8839g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0860p(InterfaceC0766j interfaceC0766j, InterfaceC0798h interfaceC0798h, N3.f fVar, InterfaceC0752N interfaceC0752N) {
        super(interfaceC0798h, fVar);
        if (interfaceC0766j == null) {
            H0(0);
            throw null;
        }
        if (interfaceC0798h == null) {
            H0(1);
            throw null;
        }
        if (fVar == null) {
            H0(2);
            throw null;
        }
        if (interfaceC0752N == null) {
            H0(3);
            throw null;
        }
        this.f = interfaceC0766j;
        this.f8839g = interfaceC0752N;
    }

    public static /* synthetic */ void H0(int i5) {
        String str = (i5 == 4 || i5 == 5 || i5 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i5 == 4 || i5 == 5 || i5 == 6) ? 2 : 3];
        switch (i5) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i5 == 4) {
            objArr[1] = "getOriginal";
        } else if (i5 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i5 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i5 != 4 && i5 != 5 && i5 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i5 != 4 && i5 != 5 && i5 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // s3.AbstractC0859o, p3.InterfaceC0766j, p3.InterfaceC0763g
    /* renamed from: N0 */
    public InterfaceC0767k a() {
        return this;
    }

    public InterfaceC0766j l() {
        InterfaceC0766j interfaceC0766j = this.f;
        if (interfaceC0766j != null) {
            return interfaceC0766j;
        }
        H0(5);
        throw null;
    }

    public InterfaceC0752N n() {
        InterfaceC0752N interfaceC0752N = this.f8839g;
        if (interfaceC0752N != null) {
            return interfaceC0752N;
        }
        H0(6);
        throw null;
    }
}
