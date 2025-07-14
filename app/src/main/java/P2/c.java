package P2;

import b3.AbstractC0219i;
import com.idm.core.syncml.Constants;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class c extends d implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public final d f2150d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2151e;
    public final int f;

    public c(d dVar, int i5, int i6) {
        AbstractC0219i.e(Constants.SYNCML_PROPERTY_LIST, dVar);
        this.f2150d = dVar;
        this.f2151e = i5;
        Y0.j.f(i5, i6, dVar.l());
        this.f = i6 - i5;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        int i6 = this.f;
        if (i5 >= 0 && i5 < i6) {
            return this.f2150d.get(this.f2151e + i5);
        }
        throw new IndexOutOfBoundsException("index: " + i5 + ", size: " + i6);
    }

    @Override // P2.d
    public final int l() {
        return this.f;
    }
}
