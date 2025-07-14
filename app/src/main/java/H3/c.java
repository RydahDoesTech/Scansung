package H3;

import G3.m;
import G3.n;
import com.google.firebase.messaging.q;
import e4.AbstractC0438v;
import java.util.ArrayList;
import q3.InterfaceC0791a;
import q3.InterfaceC0798h;

/* loaded from: classes.dex */
public abstract class c implements n, Y3.d, InterfaceC0791a {

    /* renamed from: d, reason: collision with root package name */
    public Object f829d;

    public c(InterfaceC0798h interfaceC0798h) {
        if (interfaceC0798h != null) {
            this.f829d = interfaceC0798h;
        } else {
            I0(0);
            throw null;
        }
    }

    public static /* synthetic */ void H0(int i5) {
        String str = (i5 == 1 || i5 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i5 == 1 || i5 == 2) ? 2 : 3];
        if (i5 == 1 || i5 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i5 == 1) {
            objArr[1] = "getType";
        } else if (i5 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i5 != 1 && i5 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i5 != 1 && i5 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void I0(int i5) {
        String str = i5 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i5 != 1 ? 3 : 2];
        if (i5 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i5 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i5 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i5 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // G3.n
    public m G(N3.b bVar) {
        return null;
    }

    public abstract void J0(q qVar);

    public abstract String K0();

    public abstract void L0(String[] strArr);

    @Override // Y3.d
    public AbstractC0438v d() {
        AbstractC0438v abstractC0438v = (AbstractC0438v) this.f829d;
        if (abstractC0438v != null) {
            return abstractC0438v;
        }
        H0(1);
        throw null;
    }

    @Override // G3.n
    public void m() {
        L0((String[]) ((ArrayList) this.f829d).toArray(new String[0]));
    }

    @Override // G3.n
    public void n0(N3.b bVar, N3.f fVar) {
    }

    public InterfaceC0798h s() {
        InterfaceC0798h interfaceC0798h = (InterfaceC0798h) this.f829d;
        if (interfaceC0798h != null) {
            return interfaceC0798h;
        }
        I0(1);
        throw null;
    }

    @Override // G3.n
    public void s0(Object obj) {
        if (obj instanceof String) {
            ((ArrayList) this.f829d).add((String) obj);
        }
    }

    @Override // G3.n
    public void x(S3.f fVar) {
    }

    public c(AbstractC0438v abstractC0438v) {
        if (abstractC0438v != null) {
            this.f829d = abstractC0438v;
        } else {
            H0(0);
            throw null;
        }
    }

    public c() {
        this.f829d = new ArrayList();
    }
}
