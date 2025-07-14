package r2;

import com.idm.core.tnds.IDMTndsXmlWbxmlDefine;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f8576a;

    /* renamed from: b, reason: collision with root package name */
    public final c f8577b;

    public b(Set set, c cVar) {
        this.f8576a = b(set);
        this.f8577b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb.append(aVar.f8574a);
            sb.append(IDMTndsXmlWbxmlDefine.XML_SLASH);
            sb.append(aVar.f8575b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        c cVar = this.f8577b;
        synchronized (cVar.f8579a) {
            setUnmodifiableSet = Collections.unmodifiableSet(cVar.f8579a);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f8576a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (cVar.f8579a) {
            setUnmodifiableSet2 = Collections.unmodifiableSet(cVar.f8579a);
        }
        sb.append(b(setUnmodifiableSet2));
        return sb.toString();
    }
}
