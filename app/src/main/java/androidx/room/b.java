package androidx.room;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import x0.InterfaceC0908c;
import y0.C0925g;

/* loaded from: classes.dex */
public abstract class b extends m {
    public abstract void bind(InterfaceC0908c interfaceC0908c, Object obj);

    public final void insert(Object obj) {
        InterfaceC0908c interfaceC0908cAcquire = acquire();
        try {
            bind(interfaceC0908cAcquire, obj);
            C0925g c0925g = (C0925g) interfaceC0908cAcquire;
            c0925g.f9357e.executeInsert();
            release(c0925g);
        } catch (Throwable th) {
            release(interfaceC0908cAcquire);
            throw th;
        }
    }

    public final long insertAndReturnId(Object obj) {
        InterfaceC0908c interfaceC0908cAcquire = acquire();
        try {
            bind(interfaceC0908cAcquire, obj);
            return ((C0925g) interfaceC0908cAcquire).f9357e.executeInsert();
        } finally {
            release(interfaceC0908cAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<Object> collection) {
        InterfaceC0908c interfaceC0908cAcquire = acquire();
        try {
            long[] jArr = new long[collection.size()];
            Iterator<Object> it = collection.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                bind(interfaceC0908cAcquire, it.next());
                jArr[i5] = ((C0925g) interfaceC0908cAcquire).f9357e.executeInsert();
                i5++;
            }
            return jArr;
        } finally {
            release(interfaceC0908cAcquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<Object> collection) {
        InterfaceC0908c interfaceC0908cAcquire = acquire();
        try {
            Long[] lArr = new Long[collection.size()];
            Iterator<Object> it = collection.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                bind(interfaceC0908cAcquire, it.next());
                lArr[i5] = Long.valueOf(((C0925g) interfaceC0908cAcquire).f9357e.executeInsert());
                i5++;
            }
            return lArr;
        } finally {
            release(interfaceC0908cAcquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Object[] objArr) {
        InterfaceC0908c interfaceC0908cAcquire = acquire();
        try {
            ArrayList arrayList = new ArrayList(objArr.length);
            int i5 = 0;
            for (Object obj : objArr) {
                bind(interfaceC0908cAcquire, obj);
                arrayList.add(i5, Long.valueOf(((C0925g) interfaceC0908cAcquire).f9357e.executeInsert()));
                i5++;
            }
            return arrayList;
        } finally {
            release(interfaceC0908cAcquire);
        }
    }

    public final void insert(Object[] objArr) {
        InterfaceC0908c interfaceC0908cAcquire = acquire();
        try {
            for (Object obj : objArr) {
                bind(interfaceC0908cAcquire, obj);
                ((C0925g) interfaceC0908cAcquire).f9357e.executeInsert();
            }
        } finally {
            release(interfaceC0908cAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Object[] objArr) {
        InterfaceC0908c interfaceC0908cAcquire = acquire();
        try {
            long[] jArr = new long[objArr.length];
            int i5 = 0;
            for (Object obj : objArr) {
                bind(interfaceC0908cAcquire, obj);
                jArr[i5] = ((C0925g) interfaceC0908cAcquire).f9357e.executeInsert();
                i5++;
            }
            return jArr;
        } finally {
            release(interfaceC0908cAcquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Object[] objArr) {
        InterfaceC0908c interfaceC0908cAcquire = acquire();
        try {
            Long[] lArr = new Long[objArr.length];
            int i5 = 0;
            for (Object obj : objArr) {
                bind(interfaceC0908cAcquire, obj);
                lArr[i5] = Long.valueOf(((C0925g) interfaceC0908cAcquire).f9357e.executeInsert());
                i5++;
            }
            return lArr;
        } finally {
            release(interfaceC0908cAcquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<Object> collection) {
        InterfaceC0908c interfaceC0908cAcquire = acquire();
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator<Object> it = collection.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                bind(interfaceC0908cAcquire, it.next());
                arrayList.add(i5, Long.valueOf(((C0925g) interfaceC0908cAcquire).f9357e.executeInsert()));
                i5++;
            }
            return arrayList;
        } finally {
            release(interfaceC0908cAcquire);
        }
    }

    public final void insert(Iterable<Object> iterable) {
        InterfaceC0908c interfaceC0908cAcquire = acquire();
        try {
            Iterator<Object> it = iterable.iterator();
            while (it.hasNext()) {
                bind(interfaceC0908cAcquire, it.next());
                ((C0925g) interfaceC0908cAcquire).f9357e.executeInsert();
            }
        } finally {
            release(interfaceC0908cAcquire);
        }
    }
}
