package s3;

import e4.AbstractC0420c;
import e4.AbstractC0442z;
import java.util.ArrayList;
import java.util.List;
import p3.C0753O;
import p3.InterfaceC0766j;
import q3.C0796f;
import q3.C0797g;
import q3.InterfaceC0798h;

/* renamed from: s3.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0841Q extends AbstractC0854j {
    public final ArrayList n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8798o;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0841Q(InterfaceC0766j interfaceC0766j, InterfaceC0798h interfaceC0798h, boolean z4, int i5, N3.f fVar, int i6, d4.o oVar) {
        C0753O c0753o = C0753O.f;
        if (interfaceC0766j == null) {
            H0(19);
            throw null;
        }
        if (interfaceC0798h == null) {
            H0(20);
            throw null;
        }
        if (i5 == 0) {
            H0(21);
            throw null;
        }
        if (fVar == null) {
            H0(22);
            throw null;
        }
        if (oVar == null) {
            H0(25);
            throw null;
        }
        super(oVar, interfaceC0766j, interfaceC0798h, fVar, i5, z4, i6, c0753o);
        this.n = new ArrayList(1);
        this.f8798o = false;
    }

    public static /* synthetic */ void H0(int i5) {
        String str = (i5 == 5 || i5 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i5 == 5 || i5 == 28) ? 2 : 3];
        switch (i5) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i5 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i5 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i5) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i5 != 5 && i5 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static C0841Q Q0(InterfaceC0766j interfaceC0766j, InterfaceC0798h interfaceC0798h, boolean z4, int i5, N3.f fVar, int i6, d4.o oVar) {
        if (interfaceC0766j == null) {
            H0(6);
            throw null;
        }
        if (interfaceC0798h == null) {
            H0(7);
            throw null;
        }
        if (i5 == 0) {
            H0(8);
            throw null;
        }
        if (fVar == null) {
            H0(9);
            throw null;
        }
        if (oVar == null) {
            H0(11);
            throw null;
        }
        if (i5 != 0) {
            return new C0841Q(interfaceC0766j, interfaceC0798h, z4, i5, fVar, i6, oVar);
        }
        H0(14);
        throw null;
    }

    public static C0841Q R0(AbstractC0846b abstractC0846b, int i5, N3.f fVar, int i6, d4.o oVar) {
        C0796f c0796f = C0797g.f8481a;
        if (abstractC0846b == null) {
            H0(0);
            throw null;
        }
        if (i5 == 0) {
            H0(2);
            throw null;
        }
        if (oVar == null) {
            H0(4);
            throw null;
        }
        C0841Q c0841qQ0 = Q0(abstractC0846b, c0796f, false, i5, fVar, i6, oVar);
        AbstractC0442z abstractC0442zN = U3.f.e(abstractC0846b).n();
        if (c0841qQ0.f8798o) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + c0841qQ0.S0());
        }
        if (!AbstractC0420c.i(abstractC0442zN)) {
            c0841qQ0.n.add(abstractC0442zN);
        }
        if (!c0841qQ0.f8798o) {
            c0841qQ0.f8798o = true;
            return c0841qQ0;
        }
        throw new IllegalStateException("Type parameter descriptor is already initialized: " + c0841qQ0.S0());
    }

    @Override // s3.AbstractC0854j
    public final List P0() {
        if (!this.f8798o) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + S0());
        }
        ArrayList arrayList = this.n;
        if (arrayList != null) {
            return arrayList;
        }
        H0(28);
        throw null;
    }

    public final String S0() {
        return getName() + " declared in " + Q3.f.g(l());
    }
}
