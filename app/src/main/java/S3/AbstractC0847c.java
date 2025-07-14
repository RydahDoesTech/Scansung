package s3;

import p3.C0753O;
import p3.InterfaceC0766j;
import q3.InterfaceC0798h;

/* renamed from: s3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0847c extends AbstractC0854j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0847c(d4.o oVar, InterfaceC0766j interfaceC0766j, InterfaceC0798h interfaceC0798h, N3.f fVar, int i5, boolean z4, int i6, C0753O c0753o) {
        super(oVar, interfaceC0766j, interfaceC0798h, fVar, i5, z4, i6, c0753o);
        if (oVar == null) {
            H0(0);
            throw null;
        }
        if (interfaceC0766j == null) {
            H0(1);
            throw null;
        }
        if (i5 == 0) {
            H0(4);
            throw null;
        }
        if (c0753o != null) {
        } else {
            H0(6);
            throw null;
        }
    }

    public static /* synthetic */ void H0(int i5) {
        Object[] objArr = new Object[3];
        switch (i5) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // s3.AbstractC0859o
    public final String toString() {
        return (this.f8823i ? "reified " : "") + (B() != 1 ? A3.f.v(B()).concat(" ") : "") + getName();
    }
}
