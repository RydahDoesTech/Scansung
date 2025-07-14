package j4;

import b3.AbstractC0219i;
import com.samsung.android.knox.ex.KnoxContract;
import e4.J;
import e4.L;
import e4.N;
import e4.O;

/* loaded from: classes.dex */
public final class c extends L {
    @Override // e4.L
    public final N g(J j5) {
        AbstractC0219i.e(KnoxContract.KEY, j5);
        R3.b bVar = j5 instanceof R3.b ? (R3.b) j5 : null;
        if (bVar == null) {
            return null;
        }
        return bVar.a().c() ? new O(3, bVar.a().b()) : bVar.a();
    }
}
