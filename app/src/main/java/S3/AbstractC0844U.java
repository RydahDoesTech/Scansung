package s3;

import e4.AbstractC0438v;
import java.util.Collections;
import java.util.List;
import p3.InterfaceC0752N;
import p3.InterfaceC0766j;
import q3.InterfaceC0798h;

/* renamed from: s3.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0844U extends AbstractC0860p implements p3.U {

    /* renamed from: h, reason: collision with root package name */
    public AbstractC0438v f8805h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0844U(InterfaceC0766j interfaceC0766j, InterfaceC0798h interfaceC0798h, N3.f fVar, AbstractC0438v abstractC0438v, InterfaceC0752N interfaceC0752N) {
        super(interfaceC0766j, interfaceC0798h, fVar, interfaceC0752N);
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
        this.f8805h = abstractC0438v;
    }

    public static /* synthetic */ void H0(int i5) {
        String str;
        int i6;
        switch (i5) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i5) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i6 = 2;
                break;
            default:
                i6 = 3;
                break;
        }
        Object[] objArr = new Object[i6];
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
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i5) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i5) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i5) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public C0867w F() {
        return null;
    }

    public C0867w b0() {
        return null;
    }

    @Override // H3.c, Y3.d
    public final AbstractC0438v d() {
        AbstractC0438v abstractC0438v = this.f8805h;
        if (abstractC0438v != null) {
            return abstractC0438v;
        }
        H0(4);
        throw null;
    }

    public AbstractC0438v o() {
        AbstractC0438v abstractC0438vD = d();
        if (abstractC0438vD != null) {
            return abstractC0438vD;
        }
        H0(10);
        throw null;
    }

    public boolean o0() {
        return false;
    }

    public List u() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        H0(8);
        throw null;
    }

    @Override // p3.InterfaceC0758b
    public final List v0() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        H0(6);
        throw null;
    }
}
