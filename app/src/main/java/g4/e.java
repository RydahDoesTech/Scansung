package g4;

import P2.u;
import P2.w;
import X3.n;
import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import p3.AbstractC0771o;
import p3.InterfaceC0752N;
import p3.InterfaceC0763g;
import q3.C0797g;
import x3.EnumC0915b;

/* loaded from: classes.dex */
public class e implements n {

    /* renamed from: b, reason: collision with root package name */
    public final String f6798b;

    public e(String[] strArr, int i5) {
        String str;
        A3.f.q(i5, "kind");
        AbstractC0219i.e("formatParams", strArr);
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
        switch (i5) {
            case 1:
                str = "No member resolution should be done on captured type, it used only during constraint system resolution";
                break;
            case 2:
                str = "Scope for integer literal type (%s)";
                break;
            case 3:
                str = "Error scope for erased receiver type";
                break;
            case 4:
                str = "Scope for abbreviation %s";
                break;
            case 5:
                str = "Scope for stub type %s";
                break;
            case 6:
                str = "A scope for common supertype which is not a normal classifier";
                break;
            case 7:
                str = "Scope for error type %s";
                break;
            case 8:
                str = "Scope for unsupported type %s";
                break;
            case 9:
                str = "Error scope for class %s with arguments: %s";
                break;
            case 10:
                str = "Error resolution candidate for call %s";
                break;
            default:
                throw null;
        }
        this.f6798b = String.format(str, objArrCopyOf2);
    }

    @Override // X3.n
    public Set a() {
        return w.f2165d;
    }

    @Override // X3.n
    public Set b() {
        return w.f2165d;
    }

    @Override // X3.p
    public Collection d(X3.f fVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("kindFilter", fVar);
        AbstractC0219i.e("nameFilter", interfaceC0107b);
        return u.f2163d;
    }

    @Override // X3.n
    public Set f() {
        return w.f2165d;
    }

    @Override // X3.p
    public InterfaceC0763g g(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        AbstractC0219i.e("location", enumC0915b);
        return new a(N3.f.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{fVar}, 1))));
    }

    @Override // X3.n
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set e(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        a aVar = j.f6839c;
        AbstractC0219i.e("containingDeclaration", aVar);
        b bVar = new b(aVar, null, C0797g.f8481a, N3.f.g("<Error function>"), 1, InterfaceC0752N.f8400b);
        u uVar = u.f2163d;
        bVar.T0(null, null, uVar, uVar, uVar, j.c(i.f6817h, new String[0]), 3, AbstractC0771o.f8423e);
        return V1.a.l0(bVar);
    }

    @Override // X3.n
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set c(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        return j.f;
    }

    public String toString() {
        return "ErrorScope{" + this.f6798b + '}';
    }
}
