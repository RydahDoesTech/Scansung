package s3;

import e4.C0427j;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p3.AbstractC0756S;
import p3.AbstractC0771o;
import p3.C0753O;
import p3.C0770n;
import p3.InterfaceC0752N;
import p3.InterfaceC0766j;
import q3.C0797g;
import q3.InterfaceC0798h;

/* renamed from: s3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0857m extends AbstractC0856l {

    /* renamed from: j, reason: collision with root package name */
    public final int f8831j;

    /* renamed from: k, reason: collision with root package name */
    public final int f8832k;

    /* renamed from: l, reason: collision with root package name */
    public final C0427j f8833l;

    /* renamed from: m, reason: collision with root package name */
    public X3.n f8834m;
    public Set n;

    /* renamed from: o, reason: collision with root package name */
    public C0855k f8835o;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0857m(InterfaceC0766j interfaceC0766j, N3.f fVar, int i5, int i6, List list, d4.l lVar) {
        C0753O c0753o = InterfaceC0752N.f8400b;
        if (interfaceC0766j == null) {
            G(0);
            throw null;
        }
        if (fVar == null) {
            G(1);
            throw null;
        }
        if (i5 == 0) {
            G(2);
            throw null;
        }
        if (i6 == 0) {
            G(3);
            throw null;
        }
        if (lVar == null) {
            G(6);
            throw null;
        }
        super(lVar, interfaceC0766j, fVar, c0753o);
        this.f8831j = i5;
        this.f8832k = i6;
        this.f8833l = new C0427j(this, Collections.emptyList(), list, lVar);
    }

    public static /* synthetic */ void G(int i5) {
        String str;
        int i6;
        switch (i5) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i5) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i6 = 2;
                break;
            case 12:
            default:
                i6 = 3;
                break;
        }
        Object[] objArr = new Object[i6];
        switch (i5) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i5) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i5) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i5) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
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
        C0427j c0427j = this.f8833l;
        if (c0427j != null) {
            return c0427j;
        }
        G(10);
        throw null;
    }

    @Override // p3.InterfaceC0761e
    public final int L() {
        int i5 = this.f8832k;
        if (i5 != 0) {
            return i5;
        }
        G(15);
        throw null;
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
        return this.f8835o;
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
        G(17);
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
        int i5 = this.f8831j;
        if (i5 != 0) {
            return i5;
        }
        G(16);
        throw null;
    }

    @Override // p3.InterfaceC0761e
    public final boolean j() {
        return false;
    }

    @Override // p3.InterfaceC0761e
    public final Collection k() {
        Set set = this.n;
        if (set != null) {
            return set;
        }
        G(11);
        throw null;
    }

    @Override // p3.InterfaceC0761e, p3.InterfaceC0764h
    public final List r() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        G(18);
        throw null;
    }

    @Override // q3.InterfaceC0791a
    public final InterfaceC0798h s() {
        return C0797g.f8481a;
    }

    public final void s0(X3.n nVar, Set set, C0855k c0855k) {
        this.f8834m = nVar;
        this.n = set;
        this.f8835o = c0855k;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // p3.InterfaceC0761e
    public final boolean v() {
        return false;
    }

    @Override // s3.AbstractC0825A
    public final X3.n x(f4.f fVar) {
        X3.n nVar = this.f8834m;
        if (nVar != null) {
            return nVar;
        }
        G(13);
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
        G(19);
        throw null;
    }
}
