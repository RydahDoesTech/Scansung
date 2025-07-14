package p4;

import com.google.firebase.messaging.C0388e;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class a extends P2.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0388e f8443d;

    public a(C0388e c0388e) {
        this.f8443d = c0388e;
    }

    @Override // P2.d, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        String strGroup = ((Matcher) this.f8443d.f6142e).group(i5);
        return strGroup == null ? "" : strGroup;
    }

    @Override // P2.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // P2.d
    public final int l() {
        return ((Matcher) this.f8443d.f6142e).groupCount() + 1;
    }

    @Override // P2.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
