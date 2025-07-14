package O3;

import java.io.Serializable;
import java.util.Collections;

/* renamed from: O3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0084p extends AbstractC0070b implements Serializable {
    public static C0083o g(AbstractC0081m abstractC0081m, AbstractC0084p abstractC0084p, int i5, O o5, Class cls) {
        return new C0083o(abstractC0081m, Collections.emptyList(), abstractC0084p, new C0082n(i5, o5, true), cls);
    }

    public static C0083o h(AbstractC0081m abstractC0081m, Serializable serializable, AbstractC0084p abstractC0084p, int i5, Q q5, Class cls) {
        return new C0083o(abstractC0081m, serializable, abstractC0084p, new C0082n(i5, q5, false), cls);
    }
}
