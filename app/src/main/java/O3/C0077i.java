package O3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: O3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0077i {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2076b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Map f2077a;

    static {
        new C0077i(0);
    }

    public C0077i() {
        this.f2077a = new HashMap();
    }

    public final void a(C0083o c0083o) {
        this.f2077a.put(new C0076h(c0083o.f2089d.f2084d, c0083o.f2086a), c0083o);
    }

    public C0077i(int i5) {
        this.f2077a = Collections.emptyMap();
    }
}
