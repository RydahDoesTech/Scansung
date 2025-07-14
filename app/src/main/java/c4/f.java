package c4;

import b3.AbstractC0219i;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import p3.C0772p;
import p3.InterfaceC0759c;
import s3.AbstractC0866v;

/* loaded from: classes.dex */
public final class f extends Q3.q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5151b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractCollection f5152c;

    public /* synthetic */ f(AbstractCollection abstractCollection, int i5) {
        this.f5151b = i5;
        this.f5152c = abstractCollection;
    }

    public static /* synthetic */ void a(int i5) {
        Object[] objArr = new Object[3];
        if (i5 == 1) {
            objArr[0] = "fromSuper";
        } else if (i5 != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i5 == 1 || i5 == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // Q3.q
    public final void b(InterfaceC0759c interfaceC0759c) {
        switch (this.f5151b) {
            case 0:
                AbstractC0219i.e("fakeOverride", interfaceC0759c);
                Q3.p.r(interfaceC0759c, null);
                ((ArrayList) this.f5152c).add(interfaceC0759c);
                return;
            default:
                if (interfaceC0759c == null) {
                    a(0);
                    throw null;
                }
                Q3.p.r(interfaceC0759c, null);
                ((LinkedHashSet) this.f5152c).add(interfaceC0759c);
                return;
        }
    }

    @Override // Q3.q
    public final void d(InterfaceC0759c interfaceC0759c, InterfaceC0759c interfaceC0759c2) {
        switch (this.f5151b) {
            case 0:
                AbstractC0219i.e("fromCurrent", interfaceC0759c2);
                if (interfaceC0759c2 instanceof AbstractC0866v) {
                    ((AbstractC0866v) interfaceC0759c2).V0(C0772p.f8432a, interfaceC0759c);
                    return;
                }
                return;
            default:
                if (interfaceC0759c2 != null) {
                    return;
                }
                a(2);
                throw null;
        }
    }
}
