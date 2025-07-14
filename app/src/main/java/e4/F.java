package e4;

import b3.AbstractC0219i;
import com.samsung.android.knox.ex.KnoxContract;
import java.util.ArrayList;
import p3.InterfaceC0755Q;
import p3.InterfaceC0763g;

/* loaded from: classes.dex */
public final class F extends L {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6645c;

    public F(ArrayList arrayList) {
        this.f6645c = arrayList;
    }

    @Override // e4.L
    public final N g(J j5) {
        AbstractC0219i.e(KnoxContract.KEY, j5);
        if (!this.f6645c.contains(j5)) {
            return null;
        }
        InterfaceC0763g interfaceC0763gI = j5.i();
        AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor", interfaceC0763gI);
        return X.j((InterfaceC0755Q) interfaceC0763gI);
    }
}
