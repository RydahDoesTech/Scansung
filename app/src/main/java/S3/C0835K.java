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

/* renamed from: s3.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0835K extends AbstractC0832H implements InterfaceC0749K {

    /* renamed from: p, reason: collision with root package name */
    public AbstractC0438v f8788p;

    /* renamed from: q, reason: collision with root package name */
    public final C0835K f8789q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0835K(InterfaceC0750L interfaceC0750L, InterfaceC0798h interfaceC0798h, int i5, C0770n c0770n, boolean z4, boolean z5, boolean z6, int i6, C0835K c0835k, InterfaceC0752N interfaceC0752N) {
        C0835K c0835k2;
        C0835K c0835k3;
        super(i5, c0770n, interfaceC0750L, interfaceC0798h, N3.f.g("<get-" + interfaceC0750L.getName() + ">"), z4, z5, z6, i6, interfaceC0752N);
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
        if (c0835k != null) {
            c0835k3 = this;
            c0835k2 = c0835k;
        } else {
            c0835k2 = this;
            c0835k3 = c0835k2;
        }
        c0835k3.f8789q = c0835k2;
    }

    public static /* synthetic */ void H0(int i5) {
        String str = (i5 == 6 || i5 == 7 || i5 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i5 == 6 || i5 == 7 || i5 == 8) ? 2 : 3];
        switch (i5) {
            case 1:
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
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i5 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i5 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i5 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i5 != 6 && i5 != 7 && i5 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i5 != 6 && i5 != 7 && i5 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // s3.AbstractC0860p, s3.AbstractC0859o, p3.InterfaceC0766j, p3.InterfaceC0763g
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final C0835K a() {
        C0835K c0835k = this.f8789q;
        if (c0835k != null) {
            return c0835k;
        }
        H0(8);
        throw null;
    }

    public final void R0(AbstractC0438v abstractC0438v) {
        if (abstractC0438v == null) {
            abstractC0438v = O0().d();
        }
        this.f8788p = abstractC0438v;
    }

    @Override // p3.InterfaceC0766j
    public final Object U(InterfaceC0768l interfaceC0768l, Object obj) {
        return interfaceC0768l.M(this, obj);
    }

    @Override // p3.InterfaceC0758b
    public final AbstractC0438v o() {
        return this.f8788p;
    }

    @Override // p3.InterfaceC0759c, p3.InterfaceC0758b
    public final Collection p() {
        return P0(true);
    }

    @Override // p3.InterfaceC0758b
    public final List v0() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        H0(7);
        throw null;
    }
}
