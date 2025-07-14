package C3;

import a3.InterfaceC0107b;
import b3.AbstractC0217g;
import b3.AbstractC0219i;
import g3.InterfaceC0455e;

/* loaded from: classes.dex */
public final /* synthetic */ class m extends AbstractC0217g implements InterfaceC0107b {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f422l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i5, Object obj, int i6) {
        super(i5, obj);
        this.f422l = i6;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        switch (this.f422l) {
            case 0:
                N3.f fVar = (N3.f) obj;
                AbstractC0219i.e("p0", fVar);
                return r.v((r) this.f5087e, fVar);
            case 1:
                N3.f fVar2 = (N3.f) obj;
                AbstractC0219i.e("p0", fVar2);
                return r.w((r) this.f5087e, fVar2);
            default:
                f4.f fVar3 = (f4.f) obj;
                AbstractC0219i.e("p0", fVar3);
                return new c4.g((c4.i) this.f5087e, fVar3);
        }
    }

    @Override // b3.AbstractC0212b, g3.InterfaceC0452b
    public final String getName() {
        switch (this.f422l) {
            case 0:
                return "searchMethodsByNameWithoutBuiltinMagic";
            case 1:
                return "searchMethodsInSupertypesWithoutBuiltinMagic";
            default:
                return "<init>";
        }
    }

    @Override // b3.AbstractC0212b
    public final InterfaceC0455e j() {
        switch (this.f422l) {
            case 0:
                return b3.q.f5100a.b(r.class);
            case 1:
                return b3.q.f5100a.b(r.class);
            default:
                return b3.q.f5100a.b(c4.g.class);
        }
    }

    @Override // b3.AbstractC0212b
    public final String l() {
        switch (this.f422l) {
            case 0:
                return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
            case 1:
                return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
            default:
                return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }
    }
}
