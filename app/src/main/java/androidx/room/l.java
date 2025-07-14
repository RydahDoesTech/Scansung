package androidx.room;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import x0.InterfaceC0907b;
import y0.C0924f;

/* loaded from: classes.dex */
public final class l implements InterfaceC0907b, Closeable {

    /* renamed from: l, reason: collision with root package name */
    public static final TreeMap f4915l = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    public volatile String f4916d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f4917e;
    public final double[] f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f4918g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[][] f4919h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f4920i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4921j;

    /* renamed from: k, reason: collision with root package name */
    public int f4922k;

    public l(int i5) {
        this.f4921j = i5;
        int i6 = i5 + 1;
        this.f4920i = new int[i6];
        this.f4917e = new long[i6];
        this.f = new double[i6];
        this.f4918g = new String[i6];
        this.f4919h = new byte[i6][];
    }

    public static l l(int i5, String str) {
        TreeMap treeMap = f4915l;
        synchronized (treeMap) {
            try {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i5));
                if (entryCeilingEntry == null) {
                    l lVar = new l(i5);
                    lVar.f4916d = str;
                    lVar.f4922k = i5;
                    return lVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                l lVar2 = (l) entryCeilingEntry.getValue();
                lVar2.f4916d = str;
                lVar2.f4922k = i5;
                return lVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // x0.InterfaceC0907b
    public final void g(C0924f c0924f) {
        for (int i5 = 1; i5 <= this.f4922k; i5++) {
            int i6 = this.f4920i[i5];
            if (i6 == 1) {
                c0924f.m(i5);
            } else if (i6 == 2) {
                c0924f.l(i5, this.f4917e[i5]);
            } else if (i6 == 3) {
                c0924f.h(i5, this.f[i5]);
            } else if (i6 == 4) {
                c0924f.n(i5, this.f4918g[i5]);
            } else if (i6 == 5) {
                c0924f.g(i5, this.f4919h[i5]);
            }
        }
    }

    @Override // x0.InterfaceC0907b
    public final String h() {
        return this.f4916d;
    }

    public final void m(int i5) {
        this.f4920i[i5] = 1;
    }

    public final void n(int i5, String str) {
        this.f4920i[i5] = 4;
        this.f4918g[i5] = str;
    }

    public final void o() {
        TreeMap treeMap = f4915l;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f4921j), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i5 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i5;
                }
            }
        }
    }
}
