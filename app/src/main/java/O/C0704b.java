package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0704b extends C0713k implements Map {

    /* renamed from: k, reason: collision with root package name */
    public C0703a f8201k;

    public C0704b(C0713k c0713k) {
        int i5 = c0713k.f;
        b(i5);
        if (this.f != 0) {
            for (int i6 = 0; i6 < i5; i6++) {
                put(c0713k.h(i6), c0713k.j(i6));
            }
        } else if (i5 > 0) {
            System.arraycopy(c0713k.f8236d, 0, this.f8236d, 0, i5);
            System.arraycopy(c0713k.f8237e, 0, this.f8237e, 0, i5 << 1);
            this.f = i5;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f8201k == null) {
            this.f8201k = new C0703a(0, this);
        }
        C0703a c0703a = this.f8201k;
        if (((C0710h) c0703a.f3093b) == null) {
            c0703a.f3093b = new C0710h(c0703a, 0);
        }
        return (C0710h) c0703a.f3093b;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f8201k == null) {
            this.f8201k = new C0703a(0, this);
        }
        C0703a c0703a = this.f8201k;
        if (((C0710h) c0703a.f3094c) == null) {
            c0703a.f3094c = new C0710h(c0703a, 1);
        }
        return (C0710h) c0703a.f3094c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f8201k == null) {
            this.f8201k = new C0703a(0, this);
        }
        C0703a c0703a = this.f8201k;
        if (((C0712j) c0703a.f3095d) == null) {
            c0703a.f3095d = new C0712j(c0703a);
        }
        return (C0712j) c0703a.f3095d;
    }
}
