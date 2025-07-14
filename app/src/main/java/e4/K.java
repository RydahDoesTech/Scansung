package e4;

import b3.AbstractC0219i;
import com.samsung.android.knox.ex.KnoxContract;
import java.util.Map;

/* loaded from: classes.dex */
public final class K extends L {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f6658c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f6659d;

    public K(Map map, boolean z4) {
        this.f6658c = map;
        this.f6659d = z4;
    }

    @Override // e4.S
    public final boolean a() {
        return this.f6659d;
    }

    @Override // e4.S
    public final boolean e() {
        return this.f6658c.isEmpty();
    }

    @Override // e4.L
    public final N g(J j5) {
        AbstractC0219i.e(KnoxContract.KEY, j5);
        return (N) this.f6658c.get(j5);
    }
}
