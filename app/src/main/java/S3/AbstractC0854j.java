package s3;

import e4.AbstractC0442z;
import java.util.List;
import p3.C0753O;
import p3.InterfaceC0752N;
import p3.InterfaceC0755Q;
import p3.InterfaceC0763g;
import p3.InterfaceC0766j;
import p3.InterfaceC0767k;
import p3.InterfaceC0768l;
import q3.InterfaceC0798h;

/* renamed from: s3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0854j extends AbstractC0860p implements InterfaceC0755Q {

    /* renamed from: h, reason: collision with root package name */
    public final int f8822h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8823i;

    /* renamed from: j, reason: collision with root package name */
    public final int f8824j;

    /* renamed from: k, reason: collision with root package name */
    public final d4.i f8825k;

    /* renamed from: l, reason: collision with root package name */
    public final d4.i f8826l;

    /* renamed from: m, reason: collision with root package name */
    public final d4.l f8827m;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC0854j(d4.o oVar, InterfaceC0766j interfaceC0766j, InterfaceC0798h interfaceC0798h, N3.f fVar, int i5, boolean z4, int i6, C0753O c0753o) {
        C0753O c0753o2 = InterfaceC0752N.f8400b;
        if (oVar == null) {
            H0(0);
            throw null;
        }
        if (interfaceC0766j == null) {
            H0(1);
            throw null;
        }
        if (interfaceC0798h == null) {
            H0(2);
            throw null;
        }
        if (fVar == null) {
            H0(3);
            throw null;
        }
        if (i5 == 0) {
            H0(4);
            throw null;
        }
        if (c0753o == null) {
            H0(6);
            throw null;
        }
        super(interfaceC0766j, interfaceC0798h, fVar, c0753o2);
        this.f8822h = i5;
        this.f8823i = z4;
        this.f8824j = i6;
        C0850f c0850f = new C0850f(this, oVar, c0753o);
        d4.l lVar = (d4.l) oVar;
        this.f8825k = new d4.i(lVar, c0850f);
        this.f8826l = new d4.i(lVar, new C0852h(this, fVar, 0));
        this.f8827m = lVar;
    }

    public static /* synthetic */ void H0(int i5) {
        String str;
        int i6;
        switch (i5) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i5) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
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
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i5) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i5) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i5) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p3.InterfaceC0755Q
    public final int B() {
        int i5 = this.f8822h;
        if (i5 != 0) {
            return i5;
        }
        H0(7);
        throw null;
    }

    @Override // p3.InterfaceC0763g
    public final e4.J I() {
        e4.J j5 = (e4.J) this.f8825k.a();
        if (j5 != null) {
            return j5;
        }
        H0(9);
        throw null;
    }

    @Override // p3.InterfaceC0755Q
    public final d4.o K() {
        d4.l lVar = this.f8827m;
        if (lVar != null) {
            return lVar;
        }
        H0(14);
        throw null;
    }

    @Override // s3.AbstractC0860p
    /* renamed from: N0 */
    public final InterfaceC0767k a() {
        return this;
    }

    public List O0(List list) {
        return list;
    }

    public abstract List P0();

    @Override // p3.InterfaceC0766j
    public final Object U(InterfaceC0768l interfaceC0768l, Object obj) {
        return interfaceC0768l.g(this, obj);
    }

    @Override // s3.AbstractC0860p, s3.AbstractC0859o, p3.InterfaceC0766j, p3.InterfaceC0763g
    public final InterfaceC0763g a() {
        return this;
    }

    @Override // p3.InterfaceC0755Q
    public final List getUpperBounds() {
        List listJ = ((C0853i) I()).j();
        if (listJ != null) {
            return listJ;
        }
        H0(8);
        throw null;
    }

    @Override // p3.InterfaceC0755Q
    public final boolean k0() {
        return false;
    }

    @Override // p3.InterfaceC0755Q
    public final boolean l0() {
        return this.f8823i;
    }

    @Override // p3.InterfaceC0763g
    public final AbstractC0442z q() {
        AbstractC0442z abstractC0442z = (AbstractC0442z) this.f8826l.a();
        if (abstractC0442z != null) {
            return abstractC0442z;
        }
        H0(10);
        throw null;
    }

    @Override // p3.InterfaceC0755Q
    public final int x0() {
        return this.f8824j;
    }

    @Override // s3.AbstractC0860p, s3.AbstractC0859o, p3.InterfaceC0766j, p3.InterfaceC0763g
    public final InterfaceC0766j a() {
        return this;
    }

    @Override // s3.AbstractC0860p, s3.AbstractC0859o, p3.InterfaceC0766j, p3.InterfaceC0763g
    public final InterfaceC0755Q a() {
        return this;
    }
}
