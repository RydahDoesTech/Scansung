package J3;

import b3.AbstractC0219i;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends K3.a {
    public static final a f = new a(1, 0, 7);

    static {
        new a(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        AbstractC0219i.e("numbers", iArr);
    }
}
