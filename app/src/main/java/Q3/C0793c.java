package q3;

import e4.AbstractC0438v;
import e4.AbstractC0442z;
import java.util.Map;
import p3.InterfaceC0752N;
import p3.InterfaceC0761e;

/* renamed from: q3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0793c implements InterfaceC0792b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0442z f8464a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f8465b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0752N f8466c;

    public C0793c(AbstractC0442z abstractC0442z, Map map, InterfaceC0752N interfaceC0752N) {
        if (abstractC0442z == null) {
            c(0);
            throw null;
        }
        if (map == null) {
            c(1);
            throw null;
        }
        this.f8464a = abstractC0442z;
        this.f8465b = map;
        this.f8466c = interfaceC0752N;
    }

    public static /* synthetic */ void c(int i5) {
        String str = (i5 == 3 || i5 == 4 || i5 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i5 == 3 || i5 == 4 || i5 == 5) ? 2 : 3];
        if (i5 == 1) {
            objArr[0] = "valueArguments";
        } else if (i5 == 2) {
            objArr[0] = "source";
        } else if (i5 == 3 || i5 == 4 || i5 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i5 == 3) {
            objArr[1] = "getType";
        } else if (i5 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i5 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i5 != 3 && i5 != 4 && i5 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i5 != 3 && i5 != 4 && i5 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // q3.InterfaceC0792b
    public final N3.c a() {
        InterfaceC0761e interfaceC0761eD = U3.f.d(this);
        if (interfaceC0761eD == null) {
            return null;
        }
        if (g4.j.f(interfaceC0761eD)) {
            interfaceC0761eD = null;
        }
        if (interfaceC0761eD != null) {
            return U3.f.c(interfaceC0761eD);
        }
        return null;
    }

    @Override // q3.InterfaceC0792b
    public final Map b() {
        Map map = this.f8465b;
        if (map != null) {
            return map;
        }
        c(4);
        throw null;
    }

    @Override // q3.InterfaceC0792b
    public final AbstractC0438v d() {
        AbstractC0442z abstractC0442z = this.f8464a;
        if (abstractC0442z != null) {
            return abstractC0442z;
        }
        c(3);
        throw null;
    }

    @Override // q3.InterfaceC0792b
    public final InterfaceC0752N n() {
        InterfaceC0752N interfaceC0752N = this.f8466c;
        if (interfaceC0752N != null) {
            return interfaceC0752N;
        }
        c(5);
        throw null;
    }

    public final String toString() {
        return P3.g.f2193c.v(this, null);
    }
}
