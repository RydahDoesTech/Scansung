package z3;

import Q3.m;
import Q3.p;
import Q3.q;
import a4.l;
import java.util.Collection;
import java.util.LinkedHashSet;
import p3.InterfaceC0759c;

/* renamed from: z3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0946a extends q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f9479b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f9480c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f9481d;

    public C0946a(l lVar, LinkedHashSet linkedHashSet, boolean z4) {
        this.f9479b = lVar;
        this.f9480c = linkedHashSet;
        this.f9481d = z4;
    }

    public static /* synthetic */ void a(int i5) {
        Object[] objArr = new Object[3];
        if (i5 == 1) {
            objArr[0] = "fromSuper";
        } else if (i5 == 2) {
            objArr[0] = "fromCurrent";
        } else if (i5 == 3) {
            objArr[0] = "member";
        } else if (i5 != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i5 == 1 || i5 == 2) {
            objArr[2] = "conflict";
        } else if (i5 == 3 || i5 == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // Q3.q
    public final void b(InterfaceC0759c interfaceC0759c) {
        if (interfaceC0759c == null) {
            a(0);
            throw null;
        }
        p.r(interfaceC0759c, new m(3, this));
        this.f9480c.add(interfaceC0759c);
    }

    @Override // Q3.q
    public final void d(InterfaceC0759c interfaceC0759c, InterfaceC0759c interfaceC0759c2) {
        if (interfaceC0759c2 != null) {
            return;
        }
        a(2);
        throw null;
    }

    @Override // Q3.q
    public final void p(InterfaceC0759c interfaceC0759c, Collection collection) {
        if (interfaceC0759c == null) {
            a(3);
            throw null;
        }
        if (!this.f9481d || interfaceC0759c.i0() == 2) {
            interfaceC0759c.M(collection);
        }
    }
}
