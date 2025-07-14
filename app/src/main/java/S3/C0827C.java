package s3;

import e4.C0427j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import o3.C0728k;
import p3.AbstractC0756S;
import p3.C0753O;
import p3.C0770n;
import p3.InterfaceC0752N;
import q3.C0797g;
import q3.InterfaceC0798h;

/* renamed from: s3.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0827C extends AbstractC0856l {

    /* renamed from: j, reason: collision with root package name */
    public final int f8739j;

    /* renamed from: k, reason: collision with root package name */
    public int f8740k;

    /* renamed from: l, reason: collision with root package name */
    public C0770n f8741l;

    /* renamed from: m, reason: collision with root package name */
    public C0427j f8742m;
    public ArrayList n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f8743o;

    /* renamed from: p, reason: collision with root package name */
    public final d4.b f8744p;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0827C(C0728k c0728k, N3.f fVar, d4.b bVar) {
        C0753O c0753o = InterfaceC0752N.f8400b;
        if (fVar == null) {
            G(2);
            throw null;
        }
        if (bVar == null) {
            G(4);
            throw null;
        }
        super(bVar, c0728k, fVar, c0753o);
        this.f8743o = new ArrayList();
        this.f8744p = bVar;
        this.f8739j = 2;
    }

    public static /* synthetic */ void G(int i5) {
        String str;
        int i6;
        switch (i5) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i5) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i6 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i6 = 3;
                break;
        }
        Object[] objArr = new Object[i6];
        switch (i5) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i5) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i5) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i5) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
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
        C0427j c0427j = this.f8742m;
        if (c0427j != null) {
            return c0427j;
        }
        G(11);
        throw null;
    }

    @Override // p3.InterfaceC0761e
    public final int L() {
        int i5 = this.f8739j;
        if (i5 != 0) {
            return i5;
        }
        G(8);
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
        return null;
    }

    @Override // p3.InterfaceC0761e
    public final X3.n W() {
        return X3.m.f2791b;
    }

    @Override // p3.InterfaceC0761e, p3.InterfaceC0769m, p3.InterfaceC0780x
    public final C0770n b() {
        C0770n c0770n = this.f8741l;
        if (c0770n != null) {
            return c0770n;
        }
        G(10);
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
        int i5 = this.f8740k;
        if (i5 != 0) {
            return i5;
        }
        G(7);
        throw null;
    }

    @Override // p3.InterfaceC0761e
    public final boolean j() {
        return false;
    }

    @Override // p3.InterfaceC0761e
    public final Collection k() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet != null) {
            return setEmptySet;
        }
        G(13);
        throw null;
    }

    @Override // p3.InterfaceC0761e, p3.InterfaceC0764h
    public final List r() {
        ArrayList arrayList = this.n;
        if (arrayList != null) {
            return arrayList;
        }
        G(15);
        throw null;
    }

    @Override // q3.InterfaceC0791a
    public final InterfaceC0798h s() {
        return C0797g.f8481a;
    }

    public final String toString() {
        return AbstractC0859o.M0(this);
    }

    @Override // p3.InterfaceC0761e
    public final boolean v() {
        return false;
    }

    @Override // s3.AbstractC0825A
    public final X3.n x(f4.f fVar) {
        return X3.m.f2791b;
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
