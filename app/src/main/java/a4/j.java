package a4;

import I3.Q;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import java.util.ArrayList;
import p3.InterfaceC0759c;
import p3.InterfaceC0761e;

/* loaded from: classes.dex */
public final class j implements m, l {

    /* renamed from: b, reason: collision with root package name */
    public static final j f3055b = new j();

    /* renamed from: c, reason: collision with root package name */
    public static final j f3056c = new j();

    /* renamed from: d, reason: collision with root package name */
    public static final j f3057d = new j();

    public static /* synthetic */ void d(int i5) {
        Object[] objArr = new Object[3];
        if (i5 != 1) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "unresolvedSuperClasses";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
        if (i5 != 2) {
            objArr[2] = "reportIncompleteHierarchy";
        } else {
            objArr[2] = "reportCannotInferVisibility";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static int e(I3.A a5) {
        int i5 = a5 == null ? -1 : w.f3096a[a5.ordinal()];
        if (i5 == 1) {
            return 1;
        }
        if (i5 == 2) {
            return 3;
        }
        if (i5 != 3) {
            return i5 != 4 ? 1 : 2;
        }
        return 4;
    }

    @Override // a4.l
    public void a(InterfaceC0761e interfaceC0761e, ArrayList arrayList) {
        if (interfaceC0761e != null) {
            return;
        }
        d(0);
        throw null;
    }

    @Override // a4.l
    public void b(InterfaceC0759c interfaceC0759c) {
        if (interfaceC0759c != null) {
            return;
        }
        d(2);
        throw null;
    }

    @Override // a4.m
    public AbstractC0438v c(Q q5, String str, AbstractC0442z abstractC0442z, AbstractC0442z abstractC0442z2) {
        AbstractC0219i.e("proto", q5);
        AbstractC0219i.e("flexibleId", str);
        AbstractC0219i.e("lowerBound", abstractC0442z);
        AbstractC0219i.e("upperBound", abstractC0442z2);
        throw new IllegalArgumentException("This method should not be used.");
    }
}
