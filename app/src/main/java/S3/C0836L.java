package s3;

import e4.AbstractC0438v;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p3.C0770n;
import p3.InterfaceC0749K;
import p3.InterfaceC0750L;
import p3.InterfaceC0752N;
import p3.InterfaceC0768l;
import q3.InterfaceC0798h;

/* renamed from: s3.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0836L extends AbstractC0832H implements InterfaceC0749K {

    /* renamed from: p, reason: collision with root package name */
    public C0843T f8790p;

    /* renamed from: q, reason: collision with root package name */
    public final C0836L f8791q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0836L(InterfaceC0750L interfaceC0750L, InterfaceC0798h interfaceC0798h, int i5, C0770n c0770n, boolean z4, boolean z5, boolean z6, int i6, C0836L c0836l, InterfaceC0752N interfaceC0752N) {
        C0836L c0836l2;
        C0836L c0836l3;
        super(i5, c0770n, interfaceC0750L, interfaceC0798h, N3.f.g("<set-" + interfaceC0750L.getName() + ">"), z4, z5, z6, i6, interfaceC0752N);
        if (interfaceC0798h == null) {
            H0(1);
            throw null;
        }
        if (i5 == 0) {
            H0(2);
            throw null;
        }
        if (c0770n == null) {
            H0(3);
            throw null;
        }
        if (i6 == 0) {
            H0(4);
            throw null;
        }
        if (interfaceC0752N == null) {
            H0(5);
            throw null;
        }
        if (c0836l != null) {
            c0836l3 = this;
            c0836l2 = c0836l;
        } else {
            c0836l2 = this;
            c0836l3 = c0836l2;
        }
        c0836l3.f8791q = c0836l2;
    }

    public static /* synthetic */ void H0(int i5) {
        String str;
        int i6;
        switch (i5) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i5) {
            case 10:
            case 11:
            case 12:
            case 13:
                i6 = 2;
                break;
            default:
                i6 = 3;
                break;
        }
        Object[] objArr = new Object[i6];
        switch (i5) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i5) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i5) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i5) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static C0843T Q0(C0836L c0836l, AbstractC0438v abstractC0438v, InterfaceC0798h interfaceC0798h) {
        if (abstractC0438v == null) {
            H0(8);
            throw null;
        }
        if (interfaceC0798h != null) {
            return new C0843T(c0836l, null, 0, interfaceC0798h, N3.h.f1850g, abstractC0438v, false, false, false, null, InterfaceC0752N.f8400b);
        }
        H0(9);
        throw null;
    }

    @Override // s3.AbstractC0860p, s3.AbstractC0859o, p3.InterfaceC0766j, p3.InterfaceC0763g
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public final C0836L a() {
        C0836L c0836l = this.f8791q;
        if (c0836l != null) {
            return c0836l;
        }
        H0(13);
        throw null;
    }

    @Override // p3.InterfaceC0766j
    public final Object U(InterfaceC0768l interfaceC0768l, Object obj) {
        return interfaceC0768l.f(this, obj);
    }

    @Override // p3.InterfaceC0758b
    public final AbstractC0438v o() {
        return U3.f.e(this).v();
    }

    @Override // p3.InterfaceC0759c, p3.InterfaceC0758b
    public final Collection p() {
        return P0(false);
    }

    @Override // p3.InterfaceC0758b
    public final List v0() {
        C0843T c0843t = this.f8790p;
        if (c0843t == null) {
            throw new IllegalStateException();
        }
        List listSingletonList = Collections.singletonList(c0843t);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        H0(11);
        throw null;
    }
}
