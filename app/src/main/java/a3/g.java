package A3;

import P2.v;
import Q3.q;
import b3.AbstractC0219i;
import b3.p;
import e4.AbstractC0438v;
import e4.V;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import k4.r;
import p3.C0770n;
import p3.InterfaceC0752N;
import p3.InterfaceC0757a;
import p3.InterfaceC0766j;
import p3.InterfaceC0776t;
import q3.C0797g;
import q3.InterfaceC0798h;
import s3.AbstractC0866v;
import s3.C0837M;
import s3.C0865u;
import s3.C0867w;

/* loaded from: classes.dex */
public final class g extends C0837M implements a {

    /* renamed from: I, reason: collision with root package name */
    public static final e f80I = new e();

    /* renamed from: J, reason: collision with root package name */
    public static final e f81J = new e();

    /* renamed from: G, reason: collision with root package name */
    public int f82G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f83H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InterfaceC0766j interfaceC0766j, C0837M c0837m, InterfaceC0798h interfaceC0798h, N3.f fVar, int i5, InterfaceC0752N interfaceC0752N, boolean z4) {
        super(interfaceC0766j, c0837m, interfaceC0798h, fVar, i5, interfaceC0752N);
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
        this.f82G = 0;
        this.f83H = z4;
    }

    public static /* synthetic */ void H0(int i5) {
        String str = (i5 == 13 || i5 == 18 || i5 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i5 == 13 || i5 == 18 || i5 == 21) ? 2 : 3];
        switch (i5) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i5 == 13) {
            objArr[1] = "initialize";
        } else if (i5 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i5 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i5) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i5 != 13 && i5 != 18 && i5 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static g d1(InterfaceC0766j interfaceC0766j, B3.e eVar, N3.f fVar, u3.g gVar, boolean z4) {
        if (interfaceC0766j == null) {
            H0(5);
            throw null;
        }
        if (fVar != null) {
            return new g(interfaceC0766j, null, eVar, fVar, 1, gVar, z4);
        }
        H0(7);
        throw null;
    }

    @Override // s3.C0837M, s3.AbstractC0866v
    public final AbstractC0866v Q0(int i5, N3.f fVar, InterfaceC0766j interfaceC0766j, InterfaceC0776t interfaceC0776t, InterfaceC0752N interfaceC0752N, InterfaceC0798h interfaceC0798h) {
        if (interfaceC0766j == null) {
            H0(14);
            throw null;
        }
        if (i5 == 0) {
            H0(15);
            throw null;
        }
        if (interfaceC0798h == null) {
            H0(16);
            throw null;
        }
        C0837M c0837m = (C0837M) interfaceC0776t;
        if (fVar == null) {
            fVar = getName();
        }
        g gVar = new g(interfaceC0766j, c0837m, interfaceC0798h, fVar, i5, interfaceC0752N, this.f83H);
        int i6 = this.f82G;
        boolean z4 = false;
        if (i6 != 1) {
            if (i6 == 2) {
                z4 = true;
            } else if (i6 != 3) {
                if (i6 != 4) {
                    throw null;
                }
                z4 = true;
            }
        }
        gVar.e1(z4, f.g(i6));
        return gVar;
    }

    @Override // s3.C0837M
    public final C0837M c1(C0867w c0867w, C0867w c0867w2, List list, List list2, List list3, AbstractC0438v abstractC0438v, int i5, C0770n c0770n, v vVar) {
        k4.f fVar;
        if (list == null) {
            H0(9);
            throw null;
        }
        if (list2 == null) {
            H0(10);
            throw null;
        }
        if (list3 == null) {
            H0(11);
            throw null;
        }
        if (c0770n == null) {
            H0(12);
            throw null;
        }
        super.c1(c0867w, c0867w2, list, list2, list3, abstractC0438v, i5, c0770n, vVar);
        for (k4.i iVar : r.f7974i) {
            iVar.getClass();
            N3.f fVar2 = iVar.f7955a;
            if (fVar2 == null || AbstractC0219i.a(getName(), fVar2)) {
                p pVar = iVar.f7956b;
                if (pVar != null) {
                    String strB = getName().b();
                    AbstractC0219i.d("functionDescriptor.name.asString()", strB);
                    if (!((Pattern) pVar.f5099e).matcher(strB).matches()) {
                        continue;
                    }
                }
                Collection collection = iVar.f7957c;
                if (collection == null || collection.contains(getName())) {
                    k4.e[] eVarArr = iVar.f7959e;
                    int length = eVarArr.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            fVar = ((String) iVar.f7958d.d(this)) != null ? new k4.f(false) : k4.f.f7944c;
                        } else {
                            if (eVarArr[i6].c(this) != null) {
                                fVar = new k4.f(false);
                                break;
                            }
                            i6++;
                        }
                    }
                    this.f8884p = fVar.f7945a;
                    return this;
                }
            }
        }
        fVar = k4.f.f7943b;
        this.f8884p = fVar.f7945a;
        return this;
    }

    public final void e1(boolean z4, boolean z5) {
        this.f82G = z4 ? z5 ? 4 : 2 : z5 ? 3 : 1;
    }

    @Override // s3.AbstractC0866v, p3.InterfaceC0758b
    public final boolean o0() {
        return f.g(this.f82G);
    }

    @Override // A3.a
    public final a t0(AbstractC0438v abstractC0438v, ArrayList arrayList, AbstractC0438v abstractC0438v2, O2.f fVar) {
        ArrayList arrayListN = V1.a.n(arrayList, v0(), this);
        C0867w c0867wK = abstractC0438v == null ? null : q.k(this, abstractC0438v, C0797g.f8481a);
        C0865u c0865uU0 = U0(V.f6667b);
        c0865uU0.f8856j = arrayListN;
        c0865uU0.n = abstractC0438v2;
        c0865uU0.f8858l = c0867wK;
        c0865uU0.f8864s = true;
        c0865uU0.f8863r = true;
        g gVar = (g) c0865uU0.f8850A.R0(c0865uU0);
        if (fVar != null) {
            gVar.V0((InterfaceC0757a) fVar.f2006d, fVar.f2007e);
        }
        if (gVar != null) {
            return gVar;
        }
        H0(21);
        throw null;
    }
}
