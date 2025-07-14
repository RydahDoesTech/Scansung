package S3;

import b3.AbstractC0219i;
import e4.AbstractC0438v;
import java.util.Arrays;
import m3.AbstractC0695h;
import p3.InterfaceC0781y;

/* loaded from: classes.dex */
public final class e extends n {
    @Override // S3.g
    public final AbstractC0438v a(InterfaceC0781y interfaceC0781y) {
        AbstractC0219i.e("module", interfaceC0781y);
        AbstractC0695h abstractC0695hG = interfaceC0781y.g();
        abstractC0695hG.getClass();
        return abstractC0695hG.r(m3.j.CHAR);
    }

    @Override // S3.g
    public final String toString() {
        String strValueOf;
        Object obj = this.f2531a;
        Integer numValueOf = Integer.valueOf(((Character) obj).charValue());
        char cCharValue = ((Character) obj).charValue();
        if (cCharValue == '\b') {
            strValueOf = "\\b";
        } else if (cCharValue == '\t') {
            strValueOf = "\\t";
        } else if (cCharValue == '\n') {
            strValueOf = "\\n";
        } else if (cCharValue == '\f') {
            strValueOf = "\\f";
        } else if (cCharValue == '\r') {
            strValueOf = "\\r";
        } else {
            byte type = (byte) Character.getType(cCharValue);
            strValueOf = (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? "?" : String.valueOf(cCharValue);
        }
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{numValueOf, strValueOf}, 2));
    }
}
