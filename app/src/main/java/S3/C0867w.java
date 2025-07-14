package s3;

import e4.AbstractC0438v;
import e4.V;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p3.AbstractC0771o;
import p3.C0770n;
import p3.InterfaceC0748J;
import p3.InterfaceC0752N;
import p3.InterfaceC0758b;
import p3.InterfaceC0761e;
import p3.InterfaceC0766j;
import p3.InterfaceC0768l;
import q3.C0797g;
import q3.InterfaceC0798h;

/* renamed from: s3.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0867w extends AbstractC0859o implements InterfaceC0748J {
    public final /* synthetic */ int f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0766j f8895g;

    /* renamed from: h, reason: collision with root package name */
    public final Y3.d f8896h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0867w(InterfaceC0761e interfaceC0761e) {
        super(C0797g.f8481a, N3.h.f1848d);
        if (interfaceC0761e == null) {
            H0(0);
            throw null;
        }
        this.f8895g = interfaceC0761e;
        this.f8896h = new Y3.c(interfaceC0761e);
    }

    public static /* synthetic */ void H0(int i5) {
        String str = (i5 == 1 || i5 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i5 == 1 || i5 == 2) ? 2 : 3];
        if (i5 == 1 || i5 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i5 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i5 == 1) {
            objArr[1] = "getValue";
        } else if (i5 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i5 != 1 && i5 != 2) {
            if (i5 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i5 != 1 && i5 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void I0(int i5) {
        String str = (i5 == 7 || i5 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i5 == 7 || i5 == 8) ? 2 : 3];
        switch (i5) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i5 == 7) {
            objArr[1] = "getValue";
        } else if (i5 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i5) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i5 != 7 && i5 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void N0(int i5) {
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
            case 11:
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
            case 11:
                i6 = 2;
                break;
            default:
                i6 = 3;
                break;
        }
        Object[] objArr = new Object[i6];
        switch (i5) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i5) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i5) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
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
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p3.InterfaceC0758b
    public final C0867w F() {
        return null;
    }

    public final Y3.d O0() {
        switch (this.f) {
            case 0:
                Y3.c cVar = (Y3.c) this.f8896h;
                if (cVar != null) {
                    return cVar;
                }
                H0(1);
                throw null;
            default:
                H3.c cVar2 = (H3.c) this.f8896h;
                if (cVar2 != null) {
                    return cVar2;
                }
                I0(7);
                throw null;
        }
    }

    @Override // p3.InterfaceC0754P
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public final C0867w c(V v2) {
        if (v2 == null) {
            N0(3);
            throw null;
        }
        if (v2.f6668a.e()) {
            return this;
        }
        AbstractC0438v abstractC0438vI = l() instanceof InterfaceC0761e ? v2.i(3, d()) : v2.i(1, d());
        if (abstractC0438vI == null) {
            return null;
        }
        return abstractC0438vI == d() ? this : new C0867w(l(), new Y3.e(abstractC0438vI), s());
    }

    @Override // p3.InterfaceC0766j
    public final Object U(InterfaceC0768l interfaceC0768l, Object obj) {
        return interfaceC0768l.s(this, obj);
    }

    @Override // s3.AbstractC0859o, p3.InterfaceC0766j, p3.InterfaceC0763g
    public final InterfaceC0758b a() {
        return this;
    }

    @Override // p3.InterfaceC0769m, p3.InterfaceC0780x
    public final C0770n b() {
        C0770n c0770n = AbstractC0771o.f;
        if (c0770n != null) {
            return c0770n;
        }
        N0(9);
        throw null;
    }

    @Override // p3.InterfaceC0758b
    public final C0867w b0() {
        return null;
    }

    @Override // H3.c, Y3.d
    public final AbstractC0438v d() {
        AbstractC0438v abstractC0438vD = O0().d();
        if (abstractC0438vD != null) {
            return abstractC0438vD;
        }
        N0(6);
        throw null;
    }

    @Override // p3.InterfaceC0766j
    public final InterfaceC0766j l() {
        switch (this.f) {
            case 0:
                InterfaceC0761e interfaceC0761e = (InterfaceC0761e) this.f8895g;
                if (interfaceC0761e != null) {
                    return interfaceC0761e;
                }
                H0(2);
                throw null;
            default:
                InterfaceC0766j interfaceC0766j = this.f8895g;
                if (interfaceC0766j != null) {
                    return interfaceC0766j;
                }
                I0(8);
                throw null;
        }
    }

    @Override // p3.InterfaceC0767k
    public final InterfaceC0752N n() {
        return InterfaceC0752N.f8400b;
    }

    @Override // p3.InterfaceC0758b
    public final AbstractC0438v o() {
        return d();
    }

    @Override // p3.InterfaceC0758b
    public final boolean o0() {
        return false;
    }

    @Override // p3.InterfaceC0758b
    public final Collection p() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet != null) {
            return setEmptySet;
        }
        N0(8);
        throw null;
    }

    @Override // s3.AbstractC0859o
    public String toString() {
        switch (this.f) {
            case 0:
                return "class " + ((InterfaceC0761e) this.f8895g).getName() + "::this";
            default:
                return super.toString();
        }
    }

    @Override // p3.InterfaceC0758b
    public final List u() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        N0(5);
        throw null;
    }

    @Override // p3.InterfaceC0758b
    public final List v0() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        N0(7);
        throw null;
    }

    @Override // s3.AbstractC0859o, p3.InterfaceC0766j, p3.InterfaceC0763g
    public final InterfaceC0766j a() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0867w(InterfaceC0766j interfaceC0766j, H3.c cVar, InterfaceC0798h interfaceC0798h) {
        this(interfaceC0766j, cVar, interfaceC0798h, N3.h.f1848d);
        if (interfaceC0766j == null) {
            I0(0);
            throw null;
        }
        if (interfaceC0798h != null) {
        } else {
            I0(2);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0867w(InterfaceC0766j interfaceC0766j, H3.c cVar, InterfaceC0798h interfaceC0798h, N3.f fVar) {
        super(interfaceC0798h, fVar);
        if (interfaceC0766j == null) {
            I0(3);
            throw null;
        }
        if (interfaceC0798h == null) {
            I0(5);
            throw null;
        }
        if (fVar != null) {
            this.f8895g = interfaceC0766j;
            this.f8896h = cVar;
            return;
        }
        I0(6);
        throw null;
    }
}
