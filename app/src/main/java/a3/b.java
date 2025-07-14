package A3;

import P2.u;
import Q3.q;
import e4.AbstractC0438v;
import java.util.ArrayList;
import p3.InterfaceC0752N;
import p3.InterfaceC0757a;
import p3.InterfaceC0761e;
import p3.InterfaceC0766j;
import p3.InterfaceC0776t;
import q3.C0797g;
import q3.InterfaceC0798h;
import s3.AbstractC0866v;
import s3.C0855k;

/* loaded from: classes.dex */
public final class b extends C0855k implements a {

    /* renamed from: H, reason: collision with root package name */
    public Boolean f78H;

    /* renamed from: I, reason: collision with root package name */
    public Boolean f79I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC0761e interfaceC0761e, b bVar, InterfaceC0798h interfaceC0798h, boolean z4, int i5, InterfaceC0752N interfaceC0752N) {
        super(interfaceC0761e, bVar, interfaceC0798h, z4, i5, interfaceC0752N);
        if (interfaceC0761e == null) {
            H0(0);
            throw null;
        }
        if (interfaceC0798h == null) {
            H0(1);
            throw null;
        }
        if (i5 == 0) {
            H0(2);
            throw null;
        }
        if (interfaceC0752N == null) {
            H0(3);
            throw null;
        }
        this.f78H = null;
        this.f79I = null;
    }

    public static /* synthetic */ void H0(int i5) {
        String str = (i5 == 11 || i5 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i5 == 11 || i5 == 18) ? 2 : 3];
        switch (i5) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i5 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i5 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i5) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i5 != 11 && i5 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static b f1(InterfaceC0761e interfaceC0761e, InterfaceC0798h interfaceC0798h, boolean z4, u3.g gVar) {
        if (interfaceC0761e != null) {
            return new b(interfaceC0761e, null, interfaceC0798h, z4, 1, gVar);
        }
        H0(4);
        throw null;
    }

    @Override // s3.C0855k, s3.AbstractC0866v
    public final /* bridge */ /* synthetic */ AbstractC0866v Q0(int i5, N3.f fVar, InterfaceC0766j interfaceC0766j, InterfaceC0776t interfaceC0776t, InterfaceC0752N interfaceC0752N, InterfaceC0798h interfaceC0798h) {
        return g1(interfaceC0766j, interfaceC0776t, i5, interfaceC0798h, interfaceC0752N);
    }

    @Override // s3.AbstractC0866v
    public final void W0(boolean z4) {
        this.f78H = Boolean.valueOf(z4);
    }

    @Override // s3.AbstractC0866v
    public final void X0(boolean z4) {
        this.f79I = Boolean.valueOf(z4);
    }

    @Override // s3.C0855k
    /* renamed from: Z0 */
    public final /* bridge */ /* synthetic */ C0855k Q0(int i5, N3.f fVar, InterfaceC0766j interfaceC0766j, InterfaceC0776t interfaceC0776t, InterfaceC0752N interfaceC0752N, InterfaceC0798h interfaceC0798h) {
        return g1(interfaceC0766j, interfaceC0776t, i5, interfaceC0798h, interfaceC0752N);
    }

    public final b g1(InterfaceC0766j interfaceC0766j, InterfaceC0776t interfaceC0776t, int i5, InterfaceC0798h interfaceC0798h, InterfaceC0752N interfaceC0752N) {
        if (interfaceC0766j == null) {
            H0(7);
            throw null;
        }
        if (i5 == 0) {
            H0(8);
            throw null;
        }
        if (interfaceC0798h == null) {
            H0(9);
            throw null;
        }
        if (interfaceC0752N == null) {
            H0(10);
            throw null;
        }
        if (i5 != 1 && i5 != 4) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC0766j + "\nkind: " + g4.f.f(i5));
        }
        InterfaceC0761e interfaceC0761e = (InterfaceC0761e) interfaceC0766j;
        b bVar = (b) interfaceC0776t;
        if (i5 == 0) {
            H0(13);
            throw null;
        }
        b bVar2 = new b(interfaceC0761e, bVar, interfaceC0798h, this.f8828G, i5, interfaceC0752N);
        Boolean bool = this.f78H;
        bool.getClass();
        bVar2.f78H = bool;
        Boolean bool2 = this.f79I;
        bool2.getClass();
        bVar2.f79I = bool2;
        return bVar2;
    }

    @Override // s3.AbstractC0866v, p3.InterfaceC0758b
    public final boolean o0() {
        return this.f79I.booleanValue();
    }

    @Override // A3.a
    public final a t0(AbstractC0438v abstractC0438v, ArrayList arrayList, AbstractC0438v abstractC0438v2, O2.f fVar) {
        b bVarG1 = g1(l(), null, i0(), s(), n());
        bVarG1.T0(abstractC0438v == null ? null : q.k(bVarG1, abstractC0438v, C0797g.f8481a), this.f8882m, u.f2163d, u(), V1.a.n(arrayList, v0(), bVarG1), abstractC0438v2, i(), b());
        if (fVar != null) {
            bVarG1.V0((InterfaceC0757a) fVar.f2006d, fVar.f2007e);
        }
        return bVarG1;
    }
}
