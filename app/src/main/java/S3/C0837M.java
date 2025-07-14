package s3;

import e4.AbstractC0438v;
import e4.V;
import java.util.List;
import p3.C0770n;
import p3.InterfaceC0752N;
import p3.InterfaceC0761e;
import p3.InterfaceC0766j;
import p3.InterfaceC0775s;
import p3.InterfaceC0776t;
import q3.C0796f;
import q3.C0797g;
import q3.InterfaceC0798h;

/* renamed from: s3.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0837M extends AbstractC0866v {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0837M(InterfaceC0766j interfaceC0766j, C0837M c0837m, InterfaceC0798h interfaceC0798h, N3.f fVar, int i5, InterfaceC0752N interfaceC0752N) {
        super(i5, fVar, interfaceC0766j, c0837m, interfaceC0752N, interfaceC0798h);
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
        if (i5 == 0) {
            H0(3);
            throw null;
        }
        if (interfaceC0752N != null) {
        } else {
            H0(4);
            throw null;
        }
    }

    public static /* synthetic */ void H0(int i5) {
        String str = (i5 == 13 || i5 == 18 || i5 == 23 || i5 == 24 || i5 == 29 || i5 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i5 == 13 || i5 == 18 || i5 == 23 || i5 == 24 || i5 == 29 || i5 == 30) ? 2 : 3];
        switch (i5) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i5 == 13 || i5 == 18 || i5 == 23) {
            objArr[1] = "initialize";
        } else if (i5 == 24) {
            objArr[1] = "getOriginal";
        } else if (i5 == 29) {
            objArr[1] = "copy";
        } else if (i5 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i5) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i5 != 13 && i5 != 18 && i5 != 23 && i5 != 24 && i5 != 29 && i5 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static C0837M Z0(InterfaceC0761e interfaceC0761e, N3.f fVar, int i5, InterfaceC0752N interfaceC0752N) {
        C0796f c0796f = C0797g.f8481a;
        if (interfaceC0761e == null) {
            H0(5);
            throw null;
        }
        if (fVar == null) {
            H0(7);
            throw null;
        }
        if (i5 == 0) {
            H0(8);
            throw null;
        }
        if (interfaceC0752N != null) {
            return new C0837M(interfaceC0761e, null, c0796f, fVar, i5, interfaceC0752N);
        }
        H0(9);
        throw null;
    }

    @Override // s3.AbstractC0866v
    public AbstractC0866v Q0(int i5, N3.f fVar, InterfaceC0766j interfaceC0766j, InterfaceC0776t interfaceC0776t, InterfaceC0752N interfaceC0752N, InterfaceC0798h interfaceC0798h) {
        if (interfaceC0766j == null) {
            H0(25);
            throw null;
        }
        if (i5 == 0) {
            H0(26);
            throw null;
        }
        if (interfaceC0798h == null) {
            H0(27);
            throw null;
        }
        C0837M c0837m = (C0837M) interfaceC0776t;
        if (fVar == null) {
            fVar = getName();
        }
        return new C0837M(interfaceC0766j, c0837m, interfaceC0798h, fVar, i5, interfaceC0752N);
    }

    @Override // s3.AbstractC0866v, s3.AbstractC0860p, s3.AbstractC0859o, p3.InterfaceC0766j, p3.InterfaceC0763g
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public final C0837M a() {
        C0837M c0837m = (C0837M) super.a();
        if (c0837m != null) {
            return c0837m;
        }
        H0(24);
        throw null;
    }

    @Override // s3.AbstractC0866v
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public final C0837M T0(C0867w c0867w, C0867w c0867w2, List list, List list2, List list3, AbstractC0438v abstractC0438v, int i5, C0770n c0770n) {
        if (list == null) {
            H0(14);
            throw null;
        }
        if (list2 == null) {
            H0(15);
            throw null;
        }
        if (list3 == null) {
            H0(16);
            throw null;
        }
        if (c0770n != null) {
            return c1(c0867w, c0867w2, list, list2, list3, abstractC0438v, i5, c0770n, null);
        }
        H0(17);
        throw null;
    }

    @Override // s3.AbstractC0866v, p3.InterfaceC0776t
    public InterfaceC0775s c0() {
        return U0(V.f6667b);
    }

    public C0837M c1(C0867w c0867w, C0867w c0867w2, List list, List list2, List list3, AbstractC0438v abstractC0438v, int i5, C0770n c0770n, P2.v vVar) {
        if (list == null) {
            H0(19);
            throw null;
        }
        if (list2 == null) {
            H0(20);
            throw null;
        }
        if (list3 == null) {
            H0(21);
            throw null;
        }
        if (c0770n != null) {
            super.T0(c0867w, c0867w2, list, list2, list3, abstractC0438v, i5, c0770n);
            return this;
        }
        H0(22);
        throw null;
    }
}
