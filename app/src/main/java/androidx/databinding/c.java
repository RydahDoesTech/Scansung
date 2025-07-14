package androidx.databinding;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class c implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f3625d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public long f3626e = 0;
    public long[] f;

    /* renamed from: g, reason: collision with root package name */
    public int f3627g;

    /* renamed from: h, reason: collision with root package name */
    public final b f3628h;

    public c(b bVar) {
        this.f3628h = bVar;
    }

    public final synchronized void a(Object obj) {
        try {
            if (obj == null) {
                throw new IllegalArgumentException("callback cannot be null");
            }
            int iLastIndexOf = this.f3625d.lastIndexOf(obj);
            if (iLastIndexOf < 0 || b(iLastIndexOf)) {
                this.f3625d.add(obj);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean b(int i5) {
        int i6;
        if (i5 < 64) {
            return (this.f3626e & (1 << i5)) != 0;
        }
        long[] jArr = this.f;
        if (jArr != null && (i6 = (i5 / 64) - 1) < jArr.length) {
            return ((1 << (i5 % 64)) & jArr[i6]) != 0;
        }
        return false;
    }

    public final synchronized void c(a aVar, int i5) {
        try {
            this.f3627g++;
            int size = this.f3625d.size();
            int length = this.f == null ? -1 : r0.length - 1;
            e(aVar, i5, length);
            d(aVar, i5, (length + 2) * 64, size, 0L);
            int i6 = this.f3627g - 1;
            this.f3627g = i6;
            if (i6 == 0) {
                long[] jArr = this.f;
                if (jArr != null) {
                    for (int length2 = jArr.length - 1; length2 >= 0; length2--) {
                        long j5 = this.f[length2];
                        if (j5 != 0) {
                            g((length2 + 1) * 64, j5);
                            this.f[length2] = 0;
                        }
                    }
                }
                long j6 = this.f3626e;
                if (j6 != 0) {
                    g(0, j6);
                    this.f3626e = 0L;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Object clone() {
        c cVar;
        CloneNotSupportedException e5;
        synchronized (this) {
            try {
                cVar = (c) super.clone();
                try {
                    cVar.f3626e = 0L;
                    cVar.f = null;
                    cVar.f3627g = 0;
                    cVar.f3625d = new ArrayList();
                    int size = this.f3625d.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        if (!b(i5)) {
                            cVar.f3625d.add(this.f3625d.get(i5));
                        }
                    }
                } catch (CloneNotSupportedException e6) {
                    e5 = e6;
                    e5.printStackTrace();
                    return cVar;
                }
            } catch (CloneNotSupportedException e7) {
                cVar = null;
                e5 = e7;
            }
        }
        return cVar;
    }

    public final void d(a aVar, int i5, int i6, int i7, long j5) {
        long j6 = 1;
        while (i6 < i7) {
            if ((j5 & j6) == 0) {
                this.f3628h.a(this.f3625d.get(i6), aVar, i5);
            }
            j6 <<= 1;
            i6++;
        }
    }

    public final void e(a aVar, int i5, int i6) {
        if (i6 < 0) {
            d(aVar, i5, 0, Math.min(64, this.f3625d.size()), this.f3626e);
            return;
        }
        long j5 = this.f[i6];
        int i7 = (i6 + 1) * 64;
        int iMin = Math.min(this.f3625d.size(), i7 + 64);
        e(aVar, i5, i6 - 1);
        d(aVar, i5, i7, iMin, j5);
    }

    public final synchronized void f(Object obj) {
        try {
            if (this.f3627g == 0) {
                this.f3625d.remove(obj);
            } else {
                int iLastIndexOf = this.f3625d.lastIndexOf(obj);
                if (iLastIndexOf >= 0) {
                    h(iLastIndexOf);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void g(int i5, long j5) {
        long j6 = Long.MIN_VALUE;
        for (int i6 = i5 + 63; i6 >= i5; i6--) {
            if ((j5 & j6) != 0) {
                this.f3625d.remove(i6);
            }
            j6 >>>= 1;
        }
    }

    public final void h(int i5) {
        if (i5 < 64) {
            this.f3626e = (1 << i5) | this.f3626e;
            return;
        }
        int i6 = (i5 / 64) - 1;
        long[] jArr = this.f;
        if (jArr == null) {
            this.f = new long[this.f3625d.size() / 64];
        } else if (jArr.length <= i6) {
            long[] jArr2 = new long[this.f3625d.size() / 64];
            long[] jArr3 = this.f;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f = jArr2;
        }
        long[] jArr4 = this.f;
        jArr4[i6] = (1 << (i5 % 64)) | jArr4[i6];
    }
}
