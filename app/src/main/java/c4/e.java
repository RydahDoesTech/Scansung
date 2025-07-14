package c4;

import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import e4.AbstractC0424g;
import java.util.Collection;

/* loaded from: classes.dex */
public final class e extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f5150e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, int i5) {
        super(0);
        this.f5149d = i5;
        this.f5150e = gVar;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        switch (this.f5149d) {
            case 0:
                X3.f fVar = X3.f.f2770m;
                X3.n.f2792a.getClass();
                return this.f5150e.i(fVar, X3.k.f2786e);
            default:
                g gVar = this.f5150e;
                gVar.f5153g.getClass();
                i iVar = gVar.f5156j;
                AbstractC0219i.e("classDescriptor", iVar);
                Collection collectionJ = ((AbstractC0424g) iVar.I()).j();
                AbstractC0219i.d("classDescriptor.typeConstructor.supertypes", collectionJ);
                return collectionJ;
        }
    }
}
