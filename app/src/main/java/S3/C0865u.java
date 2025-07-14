package s3;

import e4.AbstractC0438v;
import java.util.LinkedHashMap;
import java.util.List;
import p3.C0770n;
import p3.InterfaceC0761e;
import p3.InterfaceC0766j;
import p3.InterfaceC0775s;
import p3.InterfaceC0776t;
import q3.InterfaceC0798h;

/* renamed from: s3.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0865u implements InterfaceC0775s {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ AbstractC0866v f8850A;

    /* renamed from: d, reason: collision with root package name */
    public e4.S f8851d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0766j f8852e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public C0770n f8853g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0776t f8854h;

    /* renamed from: i, reason: collision with root package name */
    public int f8855i;

    /* renamed from: j, reason: collision with root package name */
    public List f8856j;

    /* renamed from: k, reason: collision with root package name */
    public final List f8857k;

    /* renamed from: l, reason: collision with root package name */
    public C0867w f8858l;

    /* renamed from: m, reason: collision with root package name */
    public C0867w f8859m;
    public AbstractC0438v n;

    /* renamed from: o, reason: collision with root package name */
    public N3.f f8860o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8861p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8862q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8863r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8864s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8865t;

    /* renamed from: u, reason: collision with root package name */
    public P2.u f8866u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0798h f8867v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8868w;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedHashMap f8869x;

    /* renamed from: y, reason: collision with root package name */
    public Boolean f8870y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8871z;

    public C0865u(AbstractC0866v abstractC0866v, e4.S s2, InterfaceC0766j interfaceC0766j, int i5, C0770n c0770n, int i6, List list, List list2, C0867w c0867w, AbstractC0438v abstractC0438v) {
        if (s2 == null) {
            b(0);
            throw null;
        }
        if (interfaceC0766j == null) {
            b(1);
            throw null;
        }
        if (i5 == 0) {
            b(2);
            throw null;
        }
        if (c0770n == null) {
            b(3);
            throw null;
        }
        if (i6 == 0) {
            b(4);
            throw null;
        }
        if (list == null) {
            b(5);
            throw null;
        }
        if (list2 == null) {
            b(6);
            throw null;
        }
        if (abstractC0438v == null) {
            b(7);
            throw null;
        }
        this.f8850A = abstractC0866v;
        this.f8854h = null;
        this.f8859m = abstractC0866v.f8882m;
        this.f8861p = true;
        this.f8862q = false;
        this.f8863r = false;
        this.f8864s = false;
        this.f8865t = abstractC0866v.f8890v;
        this.f8866u = null;
        this.f8867v = null;
        this.f8868w = abstractC0866v.f8891w;
        this.f8869x = new LinkedHashMap();
        this.f8870y = null;
        this.f8871z = false;
        this.f8851d = s2;
        this.f8852e = interfaceC0766j;
        this.f = i5;
        this.f8853g = c0770n;
        this.f8855i = i6;
        this.f8856j = list;
        this.f8857k = list2;
        this.f8858l = c0867w;
        this.n = abstractC0438v;
        this.f8860o = null;
    }

    public static /* synthetic */ void b(int i5) {
        String str;
        int i6;
        switch (i5) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i5) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                i6 = 2;
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                i6 = 3;
                break;
        }
        Object[] objArr = new Object[i6];
        switch (i5) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case 4:
            case 14:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case 6:
                objArr[0] = "newContextReceiverParameters";
                break;
            case 7:
                objArr[0] = "newReturnType";
                break;
            case 8:
                objArr[0] = "owner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 10:
                objArr[0] = "modality";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 17:
                objArr[0] = "name";
                break;
            case 19:
            case 21:
                objArr[0] = "parameters";
                break;
            case 23:
                objArr[0] = "type";
                break;
            case 25:
                objArr[0] = "contextReceiverParameters";
                break;
            case 35:
                objArr[0] = "additionalAnnotations";
                break;
            case 37:
            default:
                objArr[0] = "substitution";
                break;
            case 39:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i5) {
            case 9:
                objArr[1] = "setOwner";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 11:
                objArr[1] = "setModality";
                break;
            case 13:
                objArr[1] = "setVisibility";
                break;
            case 15:
                objArr[1] = "setKind";
                break;
            case 16:
                objArr[1] = "setCopyOverrides";
                break;
            case 18:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case 22:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case 26:
                objArr[1] = "setContextReceiverParameters";
                break;
            case 27:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case 28:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case 29:
                objArr[1] = "setOriginal";
                break;
            case 30:
                objArr[1] = "setSignatureChange";
                break;
            case 31:
                objArr[1] = "setPreserveSourceElement";
                break;
            case 32:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case 33:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case 34:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case 36:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case 38:
                objArr[1] = "setSubstitution";
                break;
            case 40:
                objArr[1] = "putUserData";
                break;
            case 41:
                objArr[1] = "getSubstitution";
                break;
            case 42:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i5) {
            case 8:
                objArr[2] = "setOwner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                break;
            case 10:
                objArr[2] = "setModality";
                break;
            case 12:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case 17:
                objArr[2] = "setName";
                break;
            case 19:
                objArr[2] = "setValueParameters";
                break;
            case 21:
                objArr[2] = "setTypeParameters";
                break;
            case 23:
                objArr[2] = "setReturnType";
                break;
            case 25:
                objArr[2] = "setContextReceiverParameters";
                break;
            case 35:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case 39:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i5) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                throw new IllegalStateException(str2);
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p3.InterfaceC0775s
    public final InterfaceC0775s B() {
        this.f8869x.put(A3.g.f81J, Boolean.TRUE);
        return this;
    }

    @Override // p3.InterfaceC0775s
    public final InterfaceC0775s C() {
        this.f8868w = true;
        return this;
    }

    @Override // p3.InterfaceC0775s
    public final InterfaceC0775s D() {
        this.f8866u = P2.u.f2163d;
        return this;
    }

    @Override // p3.InterfaceC0775s
    public final InterfaceC0775s N() {
        this.f8865t = true;
        return this;
    }

    @Override // p3.InterfaceC0775s
    public final InterfaceC0775s O() {
        this.f8862q = true;
        return this;
    }

    @Override // p3.InterfaceC0775s
    public final InterfaceC0775s a(int i5) {
        if (i5 != 0) {
            this.f8855i = i5;
            return this;
        }
        b(14);
        throw null;
    }

    @Override // p3.InterfaceC0775s
    public final InterfaceC0775s e() {
        this.f8861p = false;
        return this;
    }

    @Override // p3.InterfaceC0775s
    public final InterfaceC0776t i() {
        return this.f8850A.R0(this);
    }

    @Override // p3.InterfaceC0775s
    public final InterfaceC0775s k() {
        this.f8863r = true;
        return this;
    }

    @Override // p3.InterfaceC0775s
    public final InterfaceC0775s m(AbstractC0438v abstractC0438v) {
        if (abstractC0438v != null) {
            this.n = abstractC0438v;
            return this;
        }
        b(23);
        throw null;
    }

    @Override // p3.InterfaceC0775s
    public final InterfaceC0775s n(C0770n c0770n) {
        if (c0770n != null) {
            this.f8853g = c0770n;
            return this;
        }
        b(12);
        throw null;
    }

    @Override // p3.InterfaceC0775s
    public final InterfaceC0775s o(List list) {
        this.f8856j = list;
        return this;
    }

    @Override // p3.InterfaceC0775s
    public final InterfaceC0775s r(InterfaceC0761e interfaceC0761e) {
        if (interfaceC0761e != null) {
            this.f8852e = interfaceC0761e;
            return this;
        }
        b(8);
        throw null;
    }

    @Override // p3.InterfaceC0775s
    public final InterfaceC0775s t(C0867w c0867w) {
        this.f8859m = c0867w;
        return this;
    }

    @Override // p3.InterfaceC0775s
    public final InterfaceC0775s v(N3.f fVar) {
        if (fVar != null) {
            this.f8860o = fVar;
            return this;
        }
        b(17);
        throw null;
    }

    @Override // p3.InterfaceC0775s
    public final InterfaceC0775s x(int i5) {
        if (i5 != 0) {
            this.f = i5;
            return this;
        }
        b(10);
        throw null;
    }

    @Override // p3.InterfaceC0775s
    public final InterfaceC0775s y(InterfaceC0798h interfaceC0798h) {
        if (interfaceC0798h != null) {
            this.f8867v = interfaceC0798h;
            return this;
        }
        b(35);
        throw null;
    }
}
