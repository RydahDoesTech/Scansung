package s3;

import e4.V;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p3.C0770n;
import p3.InterfaceC0749K;
import p3.InterfaceC0750L;
import p3.InterfaceC0752N;
import p3.InterfaceC0757a;
import p3.InterfaceC0759c;
import p3.InterfaceC0761e;
import p3.InterfaceC0767k;
import p3.InterfaceC0776t;
import q3.InterfaceC0798h;

/* renamed from: s3.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0832H extends AbstractC0860p implements InterfaceC0749K {

    /* renamed from: h, reason: collision with root package name */
    public boolean f8751h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8752i;

    /* renamed from: j, reason: collision with root package name */
    public final int f8753j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0750L f8754k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8755l;

    /* renamed from: m, reason: collision with root package name */
    public final int f8756m;
    public C0770n n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0776t f8757o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0832H(int i5, C0770n c0770n, InterfaceC0750L interfaceC0750L, InterfaceC0798h interfaceC0798h, N3.f fVar, boolean z4, boolean z5, boolean z6, int i6, InterfaceC0752N interfaceC0752N) {
        super(interfaceC0750L.l(), interfaceC0798h, fVar, interfaceC0752N);
        if (i5 == 0) {
            H0(0);
            throw null;
        }
        if (c0770n == null) {
            H0(1);
            throw null;
        }
        if (interfaceC0798h == null) {
            H0(3);
            throw null;
        }
        if (interfaceC0752N == null) {
            H0(5);
            throw null;
        }
        this.f8757o = null;
        this.f8753j = i5;
        this.n = c0770n;
        this.f8754k = interfaceC0750L;
        this.f8751h = z4;
        this.f8752i = z5;
        this.f8755l = z6;
        this.f8756m = i6;
    }

    public static /* synthetic */ void H0(int i5) {
        String str;
        int i6;
        switch (i5) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i5) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i6 = 2;
                break;
            case 7:
            default:
                i6 = 3;
                break;
        }
        Object[] objArr = new Object[i6];
        switch (i5) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i5) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i5) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i5) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p3.InterfaceC0758b
    public final Object B0(InterfaceC0757a interfaceC0757a) {
        return null;
    }

    @Override // p3.InterfaceC0776t
    public final InterfaceC0776t C() {
        return this.f8757o;
    }

    @Override // p3.InterfaceC0780x
    public final boolean E() {
        return this.f8752i;
    }

    @Override // p3.InterfaceC0758b
    public final C0867w F() {
        return O0().F();
    }

    @Override // p3.InterfaceC0776t
    public final boolean J() {
        return false;
    }

    @Override // p3.InterfaceC0759c
    public final void M(Collection collection) {
        if (collection != null) {
            return;
        }
        H0(16);
        throw null;
    }

    @Override // p3.InterfaceC0776t
    public final boolean O() {
        return false;
    }

    public final InterfaceC0750L O0() {
        InterfaceC0750L interfaceC0750L = this.f8754k;
        if (interfaceC0750L != null) {
            return interfaceC0750L;
        }
        H0(13);
        throw null;
    }

    public final ArrayList P0(boolean z4) {
        ArrayList arrayList = new ArrayList(0);
        for (InterfaceC0750L interfaceC0750L : O0().p()) {
            H3.c cVarF = z4 ? interfaceC0750L.f() : interfaceC0750L.e();
            if (cVarF != null) {
                arrayList.add(cVarF);
            }
        }
        return arrayList;
    }

    @Override // p3.InterfaceC0776t
    public final boolean Q() {
        return false;
    }

    @Override // p3.InterfaceC0776t
    public final boolean Z() {
        return false;
    }

    @Override // p3.InterfaceC0759c
    public final InterfaceC0759c a0(InterfaceC0761e interfaceC0761e, int i5, C0770n c0770n) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // p3.InterfaceC0769m, p3.InterfaceC0780x
    public final C0770n b() {
        C0770n c0770n = this.n;
        if (c0770n != null) {
            return c0770n;
        }
        H0(11);
        throw null;
    }

    @Override // p3.InterfaceC0758b
    public final C0867w b0() {
        return O0().b0();
    }

    @Override // p3.InterfaceC0776t, p3.InterfaceC0754P
    public final InterfaceC0776t c(V v2) {
        if (v2 != null) {
            return this;
        }
        H0(7);
        throw null;
    }

    @Override // p3.InterfaceC0776t
    public final boolean h() {
        return false;
    }

    @Override // p3.InterfaceC0780x
    public final boolean h0() {
        return false;
    }

    @Override // p3.InterfaceC0780x
    public final int i() {
        int i5 = this.f8753j;
        if (i5 != 0) {
            return i5;
        }
        H0(10);
        throw null;
    }

    @Override // p3.InterfaceC0759c
    public final int i0() {
        int i5 = this.f8756m;
        if (i5 != 0) {
            return i5;
        }
        H0(6);
        throw null;
    }

    @Override // p3.InterfaceC0776t
    public final boolean j() {
        return this.f8755l;
    }

    @Override // p3.InterfaceC0758b
    public final boolean o0() {
        return false;
    }

    @Override // p3.InterfaceC0758b
    public final List u() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        H0(9);
        throw null;
    }

    @Override // p3.InterfaceC0758b
    public final List u0() {
        List listU0 = O0().u0();
        if (listU0 != null) {
            return listU0;
        }
        H0(14);
        throw null;
    }

    @Override // p3.InterfaceC0776t
    public final boolean w0() {
        return false;
    }

    @Override // p3.InterfaceC0780x
    public final boolean z() {
        return false;
    }

    @Override // p3.InterfaceC0754P
    public final /* bridge */ /* synthetic */ InterfaceC0767k c(V v2) {
        c(v2);
        return this;
    }
}
