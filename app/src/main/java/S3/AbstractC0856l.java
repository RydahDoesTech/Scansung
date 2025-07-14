package s3;

import p3.InterfaceC0752N;
import p3.InterfaceC0766j;

/* renamed from: s3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0856l extends AbstractC0846b {

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0766j f8829h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0752N f8830i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0856l(d4.o oVar, InterfaceC0766j interfaceC0766j, N3.f fVar, InterfaceC0752N interfaceC0752N) {
        super(oVar, fVar);
        if (oVar == null) {
            G(0);
            throw null;
        }
        if (interfaceC0766j == null) {
            G(1);
            throw null;
        }
        if (fVar == null) {
            G(2);
            throw null;
        }
        this.f8829h = interfaceC0766j;
        this.f8830i = interfaceC0752N;
    }

    public static /* synthetic */ void G(int i5) {
        String str = (i5 == 4 || i5 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i5 == 4 || i5 == 5) ? 2 : 3];
        if (i5 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i5 == 2) {
            objArr[0] = "name";
        } else if (i5 == 3) {
            objArr[0] = "source";
        } else if (i5 == 4 || i5 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i5 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i5 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i5 != 4 && i5 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i5 != 4 && i5 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public boolean E() {
        return false;
    }

    @Override // p3.InterfaceC0766j
    public final InterfaceC0766j l() {
        InterfaceC0766j interfaceC0766j = this.f8829h;
        if (interfaceC0766j != null) {
            return interfaceC0766j;
        }
        G(4);
        throw null;
    }

    @Override // p3.InterfaceC0767k
    public final InterfaceC0752N n() {
        InterfaceC0752N interfaceC0752N = this.f8830i;
        if (interfaceC0752N != null) {
            return interfaceC0752N;
        }
        G(5);
        throw null;
    }
}
