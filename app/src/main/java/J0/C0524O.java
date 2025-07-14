package j0;

import android.util.SparseArray;
import java.util.Set;

/* renamed from: j0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0524O {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f7083a;

    /* renamed from: b, reason: collision with root package name */
    public int f7084b;

    /* renamed from: c, reason: collision with root package name */
    public Set f7085c;

    public final C0523N a(int i5) {
        SparseArray sparseArray = this.f7083a;
        C0523N c0523n = (C0523N) sparseArray.get(i5);
        if (c0523n != null) {
            return c0523n;
        }
        C0523N c0523n2 = new C0523N();
        sparseArray.put(i5, c0523n2);
        return c0523n2;
    }
}
