package s3;

import e4.AbstractC0442z;
import e4.V;
import java.util.Collections;
import java.util.List;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import p3.InterfaceC0766j;
import p3.InterfaceC0768l;

/* renamed from: s3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0846b extends AbstractC0825A {

    /* renamed from: d, reason: collision with root package name */
    public final N3.f f8808d;

    /* renamed from: e, reason: collision with root package name */
    public final d4.i f8809e;
    public final d4.i f;

    /* renamed from: g, reason: collision with root package name */
    public final d4.i f8810g;

    public AbstractC0846b(d4.o oVar, N3.f fVar) {
        if (oVar == null) {
            G(0);
            throw null;
        }
        if (fVar == null) {
            G(1);
            throw null;
        }
        this.f8808d = fVar;
        d4.l lVar = (d4.l) oVar;
        this.f8809e = new d4.i(lVar, new C0845a(this, 0));
        this.f = new d4.i(lVar, new C0845a(this, 1));
        this.f8810g = new d4.i(lVar, new C0845a(this, 2));
    }

    public static /* synthetic */ void G(int i5) {
        String str = (i5 == 2 || i5 == 3 || i5 == 4 || i5 == 5 || i5 == 6 || i5 == 9 || i5 == 12 || i5 == 14 || i5 == 16 || i5 == 17 || i5 == 19 || i5 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i5 == 2 || i5 == 3 || i5 == 4 || i5 == 5 || i5 == 6 || i5 == 9 || i5 == 12 || i5 == 14 || i5 == 16 || i5 == 17 || i5 == 19 || i5 == 20) ? 2 : 3];
        switch (i5) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i5 == 2) {
            objArr[1] = "getName";
        } else if (i5 == 3) {
            objArr[1] = "getOriginal";
        } else if (i5 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i5 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i5 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i5 == 9 || i5 == 12 || i5 == 14 || i5 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i5 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i5 == 19) {
            objArr[1] = "substitute";
        } else if (i5 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i5) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i5 != 2 && i5 != 3 && i5 != 4 && i5 != 5 && i5 != 6 && i5 != 9 && i5 != 12 && i5 != 14 && i5 != 16 && i5 != 17 && i5 != 19 && i5 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p3.InterfaceC0761e
    public final X3.n E0(e4.S s2) {
        U3.f.i(Q3.f.d(this));
        X3.n nVarM = m(s2, f4.f.f6740a);
        if (nVarM != null) {
            return nVarM;
        }
        G(16);
        throw null;
    }

    @Override // p3.InterfaceC0761e
    public final C0867w G0() {
        C0867w c0867w = (C0867w) this.f8810g.a();
        if (c0867w != null) {
            return c0867w;
        }
        G(5);
        throw null;
    }

    @Override // p3.InterfaceC0761e
    public X3.n R() {
        X3.n nVar = (X3.n) this.f.a();
        if (nVar != null) {
            return nVar;
        }
        G(4);
        throw null;
    }

    @Override // p3.InterfaceC0766j
    public final Object U(InterfaceC0768l interfaceC0768l, Object obj) {
        return interfaceC0768l.J(this, obj);
    }

    @Override // s3.AbstractC0825A, p3.InterfaceC0766j, p3.InterfaceC0763g
    public final InterfaceC0763g a() {
        return this;
    }

    @Override // p3.InterfaceC0761e
    public X3.n d0() {
        U3.f.i(Q3.f.d(this));
        X3.n nVarX = x(f4.f.f6740a);
        if (nVarX != null) {
            return nVarX;
        }
        G(17);
        throw null;
    }

    @Override // p3.InterfaceC0766j
    public final N3.f getName() {
        N3.f fVar = this.f8808d;
        if (fVar != null) {
            return fVar;
        }
        G(2);
        throw null;
    }

    @Override // s3.AbstractC0825A
    public X3.n m(e4.S s2, f4.f fVar) {
        if (!s2.e()) {
            return new X3.s(x(fVar), new V(s2));
        }
        X3.n nVarX = x(fVar);
        if (nVarX != null) {
            return nVarX;
        }
        G(12);
        throw null;
    }

    @Override // p3.InterfaceC0754P
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public InterfaceC0761e c(V v2) {
        if (v2 != null) {
            return v2.f6668a.e() ? this : new z(this, v2);
        }
        G(18);
        throw null;
    }

    @Override // p3.InterfaceC0761e, p3.InterfaceC0763g
    public final AbstractC0442z q() {
        AbstractC0442z abstractC0442z = (AbstractC0442z) this.f8809e.a();
        if (abstractC0442z != null) {
            return abstractC0442z;
        }
        G(20);
        throw null;
    }

    @Override // p3.InterfaceC0761e
    public List r0() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        G(6);
        throw null;
    }

    @Override // s3.AbstractC0825A, p3.InterfaceC0766j, p3.InterfaceC0763g
    public final InterfaceC0766j a() {
        return this;
    }

    @Override // s3.AbstractC0825A, p3.InterfaceC0766j, p3.InterfaceC0763g
    public final InterfaceC0761e a() {
        return this;
    }
}
