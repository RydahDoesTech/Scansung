package g4;

import P2.u;
import b3.AbstractC0219i;
import e4.J;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import p3.InterfaceC0766j;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f6837a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final c f6838b = c.f6794d;

    /* renamed from: c, reason: collision with root package name */
    public static final a f6839c = new a(N3.f.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));

    /* renamed from: d, reason: collision with root package name */
    public static final g f6840d = c(i.f6820k, new String[0]);

    /* renamed from: e, reason: collision with root package name */
    public static final g f6841e = c(i.f6832x, new String[0]);
    public static final Set f = V1.a.l0(new d());

    public static final e a(int i5, boolean z4, String... strArr) {
        A3.f.q(i5, "kind");
        AbstractC0219i.e("formatParams", strArr);
        if (!z4) {
            return new e((String[]) Arrays.copyOf(strArr, strArr.length), i5);
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        AbstractC0219i.e("formatParams", strArr2);
        return new k((String[]) Arrays.copyOf(strArr2, strArr2.length), i5);
    }

    public static final e b(String[] strArr, int i5) {
        A3.f.q(i5, "kind");
        return a(i5, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final g c(i iVar, String... strArr) {
        AbstractC0219i.e("kind", iVar);
        u uVar = u.f2163d;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        AbstractC0219i.e("formatParams", strArr2);
        return e(iVar, uVar, d(iVar, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static h d(i iVar, String... strArr) {
        AbstractC0219i.e("kind", iVar);
        AbstractC0219i.e("formatParams", strArr);
        return new h(iVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static g e(i iVar, List list, J j5, String... strArr) {
        AbstractC0219i.e("kind", iVar);
        AbstractC0219i.e("formatParams", strArr);
        return new g(j5, b(new String[]{j5.toString()}, 7), iVar, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean f(InterfaceC0766j interfaceC0766j) {
        return interfaceC0766j != null && ((interfaceC0766j instanceof a) || (interfaceC0766j.l() instanceof a) || interfaceC0766j == f6838b);
    }
}
