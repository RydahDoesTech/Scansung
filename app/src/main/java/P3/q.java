package P3;

import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class q extends s {
    public q() {
        super("HTML", 1);
    }

    @Override // P3.s
    public final String a(String str) {
        AbstractC0219i.e("string", str);
        return p4.h.n0(p4.h.n0(str, "<", "&lt;"), ">", "&gt;");
    }
}
