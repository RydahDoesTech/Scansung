package s3;

import e4.AbstractC0442z;
import e4.C0427j;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p3.AbstractC0756S;
import p3.AbstractC0771o;
import p3.C0770n;
import p3.InterfaceC0752N;
import p3.InterfaceC0761e;
import q3.InterfaceC0798h;

/* renamed from: s3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0863s extends AbstractC0856l {

    /* renamed from: j, reason: collision with root package name */
    public final C0427j f8846j;

    /* renamed from: k, reason: collision with root package name */
    public final C0862r f8847k;

    /* renamed from: l, reason: collision with root package name */
    public final d4.i f8848l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC0798h f8849m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0863s(d4.o oVar, InterfaceC0761e interfaceC0761e, AbstractC0442z abstractC0442z, N3.f fVar, d4.i iVar, InterfaceC0798h interfaceC0798h, InterfaceC0752N interfaceC0752N) {
        super(oVar, interfaceC0761e, fVar, interfaceC0752N);
        if (oVar == null) {
            G(6);
            throw null;
        }
        if (interfaceC0761e == null) {
            G(7);
            throw null;
        }
        if (abstractC0442z == null) {
            G(8);
            throw null;
        }
        if (fVar == null) {
            G(9);
            throw null;
        }
        if (iVar == null) {
            G(10);
            throw null;
        }
        this.f8849m = interfaceC0798h;
        this.f8846j = new C0427j(this, Collections.emptyList(), Collections.singleton(abstractC0442z), oVar);
        this.f8847k = new C0862r(this, oVar);
        this.f8848l = iVar;
    }

    public static /* synthetic */ void G(int i5) {
        String str;
        int i6;
        switch (i5) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i5) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i6 = 2;
                break;
            default:
                i6 = 3;
                break;
        }
        Object[] objArr = new Object[i6];
        switch (i5) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i5) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i5) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i5) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static C0863s s0(d4.o oVar, InterfaceC0761e interfaceC0761e, N3.f fVar, d4.i iVar, InterfaceC0798h interfaceC0798h, InterfaceC0752N interfaceC0752N) {
        if (oVar == null) {
            G(0);
            throw null;
        }
        if (interfaceC0761e == null) {
            G(1);
            throw null;
        }
        if (fVar == null) {
            G(2);
            throw null;
        }
        if (iVar != null) {
            return new C0863s(oVar, interfaceC0761e, interfaceC0761e.q(), fVar, iVar, interfaceC0798h, interfaceC0752N);
        }
        G(3);
        throw null;
    }

    @Override // p3.InterfaceC0764h
    public final boolean A() {
        return false;
    }

    @Override // p3.InterfaceC0761e
    public final boolean D0() {
        return false;
    }

    @Override // p3.InterfaceC0763g
    public final e4.J I() {
        C0427j c0427j = this.f8846j;
        if (c0427j != null) {
            return c0427j;
        }
        G(17);
        throw null;
    }

    @Override // p3.InterfaceC0761e
    public final int L() {
        return 4;
    }

    @Override // p3.InterfaceC0761e
    public final boolean N() {
        return false;
    }

    @Override // p3.InterfaceC0761e
    public final AbstractC0756S S() {
        return null;
    }

    @Override // p3.InterfaceC0761e
    public final C0855k V() {
        return null;
    }

    @Override // p3.InterfaceC0761e
    public final X3.n W() {
        return X3.m.f2791b;
    }

    @Override // p3.InterfaceC0761e, p3.InterfaceC0769m, p3.InterfaceC0780x
    public final C0770n b() {
        C0770n c0770n = AbstractC0771o.f8423e;
        if (c0770n != null) {
            return c0770n;
        }
        G(20);
        throw null;
    }

    @Override // p3.InterfaceC0761e
    public final boolean f0() {
        return false;
    }

    @Override // p3.InterfaceC0780x
    public final boolean h0() {
        return false;
    }

    @Override // p3.InterfaceC0761e, p3.InterfaceC0780x
    public final int i() {
        return 1;
    }

    @Override // p3.InterfaceC0761e
    public final boolean j() {
        return false;
    }

    @Override // p3.InterfaceC0761e
    public final Collection k() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        G(16);
        throw null;
    }

    @Override // p3.InterfaceC0761e, p3.InterfaceC0764h
    public final List r() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        G(22);
        throw null;
    }

    @Override // q3.InterfaceC0791a
    public final InterfaceC0798h s() {
        InterfaceC0798h interfaceC0798h = this.f8849m;
        if (interfaceC0798h != null) {
            return interfaceC0798h;
        }
        G(21);
        throw null;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // p3.InterfaceC0761e
    public final boolean v() {
        return false;
    }

    @Override // s3.AbstractC0825A
    public final X3.n x(f4.f fVar) {
        C0862r c0862r = this.f8847k;
        if (c0862r != null) {
            return c0862r;
        }
        G(14);
        throw null;
    }

    @Override // p3.InterfaceC0780x
    public final boolean z() {
        return false;
    }

    @Override // p3.InterfaceC0761e
    public final Collection z0() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        G(23);
        throw null;
    }
}
