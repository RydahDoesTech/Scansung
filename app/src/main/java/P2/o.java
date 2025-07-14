package P2;

import b3.AbstractC0219i;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class o extends n {
    public static int l0(Iterable iterable) {
        AbstractC0219i.e("<this>", iterable);
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
