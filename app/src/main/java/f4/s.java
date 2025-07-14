package f4;

import a3.InterfaceC0108c;
import b3.AbstractC0217g;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import g3.InterfaceC0455e;

/* loaded from: classes.dex */
public final /* synthetic */ class s extends AbstractC0217g implements InterfaceC0108c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6763l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i5, Object obj, int i6) {
        super(i5, obj);
        this.f6763l = i6;
    }

    @Override // a3.InterfaceC0108c
    public final Object c(Object obj, Object obj2) {
        switch (this.f6763l) {
            case 0:
                AbstractC0438v abstractC0438v = (AbstractC0438v) obj;
                AbstractC0438v abstractC0438v2 = (AbstractC0438v) obj2;
                AbstractC0219i.e("p0", abstractC0438v);
                AbstractC0219i.e("p1", abstractC0438v2);
                ((t) this.f5087e).getClass();
                k.f6754b.getClass();
                l lVar = j.f6753b;
                return Boolean.valueOf(lVar.b(abstractC0438v, abstractC0438v2) && !lVar.b(abstractC0438v2, abstractC0438v));
            default:
                AbstractC0438v abstractC0438v3 = (AbstractC0438v) obj;
                AbstractC0438v abstractC0438v4 = (AbstractC0438v) obj2;
                AbstractC0219i.e("p0", abstractC0438v3);
                AbstractC0219i.e("p1", abstractC0438v4);
                return Boolean.valueOf(((l) this.f5087e).a(abstractC0438v3, abstractC0438v4));
        }
    }

    @Override // b3.AbstractC0212b, g3.InterfaceC0452b
    public final String getName() {
        switch (this.f6763l) {
            case 0:
                return "isStrictSupertype";
            default:
                return "equalTypes";
        }
    }

    @Override // b3.AbstractC0212b
    public final InterfaceC0455e j() {
        switch (this.f6763l) {
            case 0:
                return b3.q.f5100a.b(t.class);
            default:
                return b3.q.f5100a.b(l.class);
        }
    }

    @Override // b3.AbstractC0212b
    public final String l() {
        switch (this.f6763l) {
            case 0:
                return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
            default:
                return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }
}
