package G3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class q extends b3.k implements InterfaceC0107b {

    /* renamed from: d, reason: collision with root package name */
    public static final q f774d = new q(1);

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        String str = (String) obj;
        AbstractC0219i.e("it", str);
        if (str.length() <= 1) {
            return str;
        }
        return "L" + str + ';';
    }
}
