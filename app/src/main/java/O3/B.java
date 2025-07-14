package O3;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class B extends AbstractC0073e {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f2021k;

    /* renamed from: e, reason: collision with root package name */
    public final int f2022e;
    public final AbstractC0073e f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0073e f2023g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2024h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2025i;

    /* renamed from: j, reason: collision with root package name */
    public int f2026j = 0;

    static {
        ArrayList arrayList = new ArrayList();
        int i5 = 1;
        int i6 = 1;
        while (i5 > 0) {
            arrayList.add(Integer.valueOf(i5));
            int i7 = i6 + i5;
            i6 = i5;
            i5 = i7;
        }
        arrayList.add(Integer.MAX_VALUE);
        f2021k = new int[arrayList.size()];
        int i8 = 0;
        while (true) {
            int[] iArr = f2021k;
            if (i8 >= iArr.length) {
                return;
            }
            iArr[i8] = ((Integer) arrayList.get(i8)).intValue();
            i8++;
        }
    }

    public B(AbstractC0073e abstractC0073e, AbstractC0073e abstractC0073e2) {
        this.f = abstractC0073e;
        this.f2023g = abstractC0073e2;
        int size = abstractC0073e.size();
        this.f2024h = size;
        this.f2022e = abstractC0073e2.size() + size;
        this.f2025i = Math.max(abstractC0073e.p(), abstractC0073e2.p()) + 1;
    }

    public final boolean equals(Object obj) {
        int iV;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0073e)) {
            return false;
        }
        AbstractC0073e abstractC0073e = (AbstractC0073e) obj;
        int size = abstractC0073e.size();
        int i5 = this.f2022e;
        if (i5 != size) {
            return false;
        }
        if (i5 == 0) {
            return true;
        }
        if (this.f2026j != 0 && (iV = abstractC0073e.v()) != 0 && this.f2026j != iV) {
            return false;
        }
        z zVar = new z(this);
        w wVarA = zVar.next();
        z zVar2 = new z(abstractC0073e);
        w wVarA2 = zVar2.next();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int length = wVarA.f2098e.length - i6;
            int length2 = wVarA2.f2098e.length - i7;
            int iMin = Math.min(length, length2);
            if (!(i6 == 0 ? wVarA.z(wVarA2, i7, iMin) : wVarA2.z(wVarA, i6, iMin))) {
                return false;
            }
            i8 += iMin;
            if (i8 >= i5) {
                if (i8 == i5) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == length) {
                wVarA = zVar.next();
                i6 = 0;
            } else {
                i6 += iMin;
            }
            if (iMin == length2) {
                wVarA2 = zVar2.next();
                i7 = 0;
            } else {
                i7 += iMin;
            }
        }
    }

    public final int hashCode() {
        int iT = this.f2026j;
        if (iT == 0) {
            int i5 = this.f2022e;
            iT = t(i5, 0, i5);
            if (iT == 0) {
                iT = 1;
            }
            this.f2026j = iT;
        }
        return iT;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new A(this);
    }

    @Override // O3.AbstractC0073e
    public final void o(int i5, int i6, int i7, byte[] bArr) {
        int i8 = i5 + i7;
        AbstractC0073e abstractC0073e = this.f;
        int i9 = this.f2024h;
        if (i8 <= i9) {
            abstractC0073e.o(i5, i6, i7, bArr);
            return;
        }
        AbstractC0073e abstractC0073e2 = this.f2023g;
        if (i5 >= i9) {
            abstractC0073e2.o(i5 - i9, i6, i7, bArr);
            return;
        }
        int i10 = i9 - i5;
        abstractC0073e.o(i5, i6, i10, bArr);
        abstractC0073e2.o(0, i6 + i10, i7 - i10, bArr);
    }

    @Override // O3.AbstractC0073e
    public final int p() {
        return this.f2025i;
    }

    @Override // O3.AbstractC0073e
    public final boolean q() {
        return this.f2022e >= f2021k[this.f2025i];
    }

    @Override // O3.AbstractC0073e
    public final boolean r() {
        int iU = this.f.u(0, 0, this.f2024h);
        AbstractC0073e abstractC0073e = this.f2023g;
        return abstractC0073e.u(iU, 0, abstractC0073e.size()) == 0;
    }

    @Override // O3.AbstractC0073e
    public final int size() {
        return this.f2022e;
    }

    @Override // O3.AbstractC0073e
    public final int t(int i5, int i6, int i7) {
        int i8 = i6 + i7;
        AbstractC0073e abstractC0073e = this.f;
        int i9 = this.f2024h;
        if (i8 <= i9) {
            return abstractC0073e.t(i5, i6, i7);
        }
        AbstractC0073e abstractC0073e2 = this.f2023g;
        if (i6 >= i9) {
            return abstractC0073e2.t(i5, i6 - i9, i7);
        }
        int i10 = i9 - i6;
        return abstractC0073e2.t(abstractC0073e.t(i5, i6, i10), 0, i7 - i10);
    }

    @Override // O3.AbstractC0073e
    public final int u(int i5, int i6, int i7) {
        int i8 = i6 + i7;
        AbstractC0073e abstractC0073e = this.f;
        int i9 = this.f2024h;
        if (i8 <= i9) {
            return abstractC0073e.u(i5, i6, i7);
        }
        AbstractC0073e abstractC0073e2 = this.f2023g;
        if (i6 >= i9) {
            return abstractC0073e2.u(i5, i6 - i9, i7);
        }
        int i10 = i9 - i6;
        return abstractC0073e2.u(abstractC0073e.u(i5, i6, i10), 0, i7 - i10);
    }

    @Override // O3.AbstractC0073e
    public final int v() {
        return this.f2026j;
    }

    @Override // O3.AbstractC0073e
    public final String w() {
        byte[] bArr;
        int i5 = this.f2022e;
        if (i5 == 0) {
            bArr = r.f2091a;
        } else {
            byte[] bArr2 = new byte[i5];
            o(0, 0, i5, bArr2);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // O3.AbstractC0073e
    public final void y(OutputStream outputStream, int i5, int i6) {
        int i7 = i5 + i6;
        AbstractC0073e abstractC0073e = this.f;
        int i8 = this.f2024h;
        if (i7 <= i8) {
            abstractC0073e.y(outputStream, i5, i6);
            return;
        }
        AbstractC0073e abstractC0073e2 = this.f2023g;
        if (i5 >= i8) {
            abstractC0073e2.y(outputStream, i5 - i8, i6);
            return;
        }
        int i9 = i8 - i5;
        abstractC0073e.y(outputStream, i5, i9);
        abstractC0073e2.y(outputStream, 0, i6 - i9);
    }
}
