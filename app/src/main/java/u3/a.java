package U3;

import P2.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import s3.C0843T;

/* loaded from: classes.dex */
public final class a implements n4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f2563d = new a();

    @Override // n4.a
    public final Iterable p(Object obj) {
        int i5 = f.f2570a;
        Collection collectionP = ((C0843T) obj).p();
        ArrayList arrayList = new ArrayList(o.l0(collectionP));
        Iterator it = ((ArrayList) collectionP).iterator();
        while (it.hasNext()) {
            arrayList.add(((C0843T) it.next()).a());
        }
        return arrayList;
    }
}
