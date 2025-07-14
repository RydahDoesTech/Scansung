package s3;

import b3.AbstractC0219i;
import e4.AbstractC0424g;
import e4.AbstractC0438v;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import m3.AbstractC0695h;
import p3.C0753O;
import p3.InterfaceC0755Q;
import p3.InterfaceC0763g;

/* renamed from: s3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0853i extends AbstractC0424g {

    /* renamed from: c, reason: collision with root package name */
    public final C0753O f8820c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0854j f8821d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0853i(AbstractC0854j abstractC0854j, d4.o oVar, C0753O c0753o) {
        super(oVar);
        if (oVar == null) {
            m(0);
            throw null;
        }
        this.f8821d = abstractC0854j;
        this.f8820c = c0753o;
    }

    public static /* synthetic */ void m(int i5) {
        String str = (i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4 || i5 == 5 || i5 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4 || i5 == 5 || i5 == 8) ? 2 : 3];
        switch (i5) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = "type";
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i5 == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i5 == 2) {
            objArr[1] = "getParameters";
        } else if (i5 == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i5 == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i5 == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i5 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i5) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i5 != 1 && i5 != 2 && i5 != 3 && i5 != 4 && i5 != 5 && i5 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // e4.AbstractC0424g
    public final Collection b() {
        List listP0 = this.f8821d.P0();
        if (listP0 != null) {
            return listP0;
        }
        m(1);
        throw null;
    }

    @Override // e4.AbstractC0424g
    public final AbstractC0438v c() {
        return g4.j.c(g4.i.f6819j, new String[0]);
    }

    @Override // e4.AbstractC0424g
    public final C0753O d() {
        C0753O c0753o = this.f8820c;
        if (c0753o != null) {
            return c0753o;
        }
        m(5);
        throw null;
    }

    @Override // e4.AbstractC0424g
    public final boolean f(InterfaceC0763g interfaceC0763g) {
        if (interfaceC0763g instanceof InterfaceC0755Q) {
            AbstractC0854j abstractC0854j = this.f8821d;
            AbstractC0219i.e("a", abstractC0854j);
            if (Q3.d.f2340a.d(abstractC0854j, (InterfaceC0755Q) interfaceC0763g, true, Q3.b.f)) {
                return true;
            }
        }
        return false;
    }

    @Override // e4.J
    public final AbstractC0695h g() {
        AbstractC0695h abstractC0695hE = U3.f.e(this.f8821d);
        if (abstractC0695hE != null) {
            return abstractC0695hE;
        }
        m(4);
        throw null;
    }

    @Override // e4.J
    public final boolean h() {
        return true;
    }

    @Override // e4.J
    public final InterfaceC0763g i() {
        AbstractC0854j abstractC0854j = this.f8821d;
        if (abstractC0854j != null) {
            return abstractC0854j;
        }
        m(3);
        throw null;
    }

    @Override // e4.J
    public final List k() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m(2);
        throw null;
    }

    @Override // e4.AbstractC0424g
    public final List l(List list) {
        List listO0 = this.f8821d.O0(list);
        if (listO0 != null) {
            return listO0;
        }
        m(8);
        throw null;
    }

    public final String toString() {
        return this.f8821d.getName().f1842d;
    }
}
