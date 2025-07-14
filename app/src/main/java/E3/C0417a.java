package e3;

import b3.AbstractC0219i;
import d3.AbstractC0394a;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0417a extends AbstractC0394a {
    @Override // d3.AbstractC0394a
    public final Random b() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC0219i.d("current()", threadLocalRandomCurrent);
        return threadLocalRandomCurrent;
    }
}
