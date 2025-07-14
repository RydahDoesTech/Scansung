package O3;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class t extends AbstractList implements RandomAccess, u {

    /* renamed from: e, reason: collision with root package name */
    public static final L f2093e = new L(new t());

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2094d;

    public t() {
        this.f2094d = new ArrayList();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        this.f2094d.add(i5, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f2094d.size(), collection);
    }

    @Override // O3.u
    public final L b() {
        return new L(this);
    }

    @Override // O3.u
    public final void c(w wVar) {
        this.f2094d.add(wVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f2094d.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        String str;
        ArrayList arrayList = this.f2094d;
        Object obj = arrayList.get(i5);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0073e) {
            AbstractC0073e abstractC0073e = (AbstractC0073e) obj;
            str = abstractC0073e.x();
            if (abstractC0073e.r()) {
                arrayList.set(i5, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = r.f2091a;
            try {
                str = new String(bArr, "UTF-8");
                if (F.c(bArr, 0, bArr.length) == 0) {
                    arrayList.set(i5, str);
                }
            } catch (UnsupportedEncodingException e5) {
                throw new RuntimeException("UTF-8 not supported?", e5);
            }
        }
        return str;
    }

    @Override // O3.u
    public final List i() {
        return Collections.unmodifiableList(this.f2094d);
    }

    @Override // O3.u
    public final AbstractC0073e j(int i5) {
        AbstractC0073e wVar;
        ArrayList arrayList = this.f2094d;
        Object obj = arrayList.get(i5);
        if (obj instanceof AbstractC0073e) {
            wVar = (AbstractC0073e) obj;
        } else if (obj instanceof String) {
            try {
                wVar = new w(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e5) {
                throw new RuntimeException("UTF-8 not supported?", e5);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            wVar = new w(bArr2);
        }
        if (wVar != obj) {
            arrayList.set(i5, wVar);
        }
        return wVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        Object objRemove = this.f2094d.remove(i5);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof AbstractC0073e) {
            return ((AbstractC0073e) objRemove).x();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = r.f2091a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e5) {
            throw new RuntimeException("UTF-8 not supported?", e5);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        Object obj2 = this.f2094d.set(i5, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC0073e) {
            return ((AbstractC0073e) obj2).x();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = r.f2091a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e5) {
            throw new RuntimeException("UTF-8 not supported?", e5);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2094d.size();
    }

    public t(u uVar) {
        this.f2094d = new ArrayList(uVar.size());
        addAll(uVar);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i5, Collection collection) {
        if (collection instanceof u) {
            collection = ((u) collection).i();
        }
        boolean zAddAll = this.f2094d.addAll(i5, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
