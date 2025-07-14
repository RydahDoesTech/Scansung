package s3;

import b3.AbstractC0219i;
import java.util.Collection;
import java.util.List;
import m3.AbstractC0695h;
import p3.InterfaceC0763g;

/* renamed from: s3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0849e implements e4.J {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c4.s f8813a;

    public C0849e(c4.s sVar) {
        this.f8813a = sVar;
    }

    @Override // e4.J
    public final AbstractC0695h g() {
        return U3.f.e(this.f8813a);
    }

    @Override // e4.J
    public final boolean h() {
        return true;
    }

    @Override // e4.J
    public final InterfaceC0763g i() {
        return this.f8813a;
    }

    @Override // e4.J
    public final Collection j() {
        Collection collectionJ = this.f8813a.Q0().I0().j();
        AbstractC0219i.d("declarationDescriptor.un…pe.constructor.supertypes", collectionJ);
        return collectionJ;
    }

    @Override // e4.J
    public final List k() {
        List list = this.f8813a.f5216s;
        if (list != null) {
            return list;
        }
        AbstractC0219i.g("typeConstructorParameters");
        throw null;
    }

    public final String toString() {
        return "[typealias " + this.f8813a.getName().b() + ']';
    }
}
