package y3;

import b3.AbstractC0219i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f9414a = new m();

    public static final C0929C a(String str, String str2, String str3, String str4) {
        ArrayList arrayList = F.f9373a;
        N3.f fVarE = N3.f.e(str2);
        String str5 = str2 + '(' + str3 + ')' + str4;
        AbstractC0219i.e("internalName", str);
        AbstractC0219i.e("jvmDescriptor", str5);
        return new C0929C(fVarE, str + '.' + str5);
    }
}
