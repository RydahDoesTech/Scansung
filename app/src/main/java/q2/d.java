package Q2;

import b3.AbstractC0219i;
import c3.InterfaceC0226a;
import java.util.Map;

/* loaded from: classes.dex */
public final class d implements Map.Entry, InterfaceC0226a {

    /* renamed from: d, reason: collision with root package name */
    public final e f2317d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2318e;

    public d(e eVar, int i5) {
        AbstractC0219i.e("map", eVar);
        this.f2317d = eVar;
        this.f2318e = i5;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC0219i.a(entry.getKey(), getKey()) && AbstractC0219i.a(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2317d.f2319d[this.f2318e];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f2317d.f2320e;
        AbstractC0219i.b(objArr);
        return objArr[this.f2318e];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        e eVar = this.f2317d;
        eVar.b();
        Object[] objArr = eVar.f2320e;
        if (objArr == null) {
            int length = eVar.f2319d.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            eVar.f2320e = objArr;
        }
        int i5 = this.f2318e;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
