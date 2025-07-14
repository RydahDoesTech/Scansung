package e4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p3.C0753O;
import p3.InterfaceC0761e;
import s3.AbstractC0825A;

/* renamed from: e4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0427j extends AbstractC0419b {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0825A f6685c;

    /* renamed from: d, reason: collision with root package name */
    public final List f6686d;

    /* renamed from: e, reason: collision with root package name */
    public final Collection f6687e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0427j(AbstractC0825A abstractC0825A, List list, Collection collection, d4.o oVar) {
        super(oVar);
        if (list == null) {
            m(1);
            throw null;
        }
        if (collection == null) {
            m(2);
            throw null;
        }
        if (oVar == null) {
            m(3);
            throw null;
        }
        this.f6685c = abstractC0825A;
        this.f6686d = Collections.unmodifiableList(new ArrayList(list));
        this.f6687e = Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void m(int i5) {
        String str = (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) ? 2 : 3];
        switch (i5) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i5 == 4) {
            objArr[1] = "getParameters";
        } else if (i5 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i5 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i5 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i5 != 4 && i5 != 5 && i5 != 6 && i5 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i5 != 4 && i5 != 5 && i5 != 6 && i5 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // e4.AbstractC0424g
    public final Collection b() {
        Collection collection = this.f6687e;
        if (collection != null) {
            return collection;
        }
        m(6);
        throw null;
    }

    @Override // e4.AbstractC0424g
    public final C0753O d() {
        return C0753O.f;
    }

    @Override // e4.J
    public final boolean h() {
        return true;
    }

    @Override // e4.J
    public final List k() {
        List list = this.f6686d;
        if (list != null) {
            return list;
        }
        m(4);
        throw null;
    }

    @Override // e4.AbstractC0419b
    /* renamed from: n */
    public final InterfaceC0761e i() {
        AbstractC0825A abstractC0825A = this.f6685c;
        if (abstractC0825A != null) {
            return abstractC0825A;
        }
        m(5);
        throw null;
    }

    public final String toString() {
        String str = Q3.f.g(this.f6685c).f1838a;
        if (str != null) {
            return str;
        }
        N3.e.a(4);
        throw null;
    }
}
