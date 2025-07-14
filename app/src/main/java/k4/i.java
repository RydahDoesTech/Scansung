package k4;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final N3.f f7955a;

    /* renamed from: b, reason: collision with root package name */
    public final b3.p f7956b;

    /* renamed from: c, reason: collision with root package name */
    public final Collection f7957c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0107b f7958d;

    /* renamed from: e, reason: collision with root package name */
    public final e[] f7959e;

    public i(N3.f fVar, b3.p pVar, Collection collection, InterfaceC0107b interfaceC0107b, e... eVarArr) {
        this.f7955a = fVar;
        this.f7956b = pVar;
        this.f7957c = collection;
        this.f7958d = interfaceC0107b;
        this.f7959e = eVarArr;
    }

    public /* synthetic */ i(N3.f fVar, e[] eVarArr) {
        this(fVar, eVarArr, h.f7946e);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(N3.f fVar, e[] eVarArr, InterfaceC0107b interfaceC0107b) {
        this(fVar, null, null, interfaceC0107b, (e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        AbstractC0219i.e("name", fVar);
        AbstractC0219i.e("additionalChecks", interfaceC0107b);
    }

    public /* synthetic */ i(Set set, e[] eVarArr) {
        this(set, eVarArr, h.f7947g);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Collection collection, e[] eVarArr, InterfaceC0107b interfaceC0107b) {
        this(null, null, collection, interfaceC0107b, (e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        AbstractC0219i.e("nameList", collection);
        AbstractC0219i.e("additionalChecks", interfaceC0107b);
    }
}
