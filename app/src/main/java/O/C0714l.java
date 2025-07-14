package o;

/* renamed from: o.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0714l implements Cloneable {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f8238g = new Object();

    /* renamed from: d, reason: collision with root package name */
    public int[] f8239d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f8240e;
    public int f;

    public C0714l() {
        int i5;
        int i6 = 4;
        while (true) {
            i5 = 40;
            if (i6 >= 32) {
                break;
            }
            int i7 = (1 << i6) - 12;
            if (40 <= i7) {
                i5 = i7;
                break;
            }
            i6++;
        }
        int i8 = i5 / 4;
        this.f8239d = new int[i8];
        this.f8240e = new Object[i8];
    }

    public final Object a(int i5, Integer num) {
        Object obj;
        int iA = AbstractC0706d.a(this.f8239d, this.f, i5);
        return (iA < 0 || (obj = this.f8240e[iA]) == f8238g) ? num : obj;
    }

    public final void b(int i5, Object obj) {
        int iA = AbstractC0706d.a(this.f8239d, this.f, i5);
        if (iA >= 0) {
            this.f8240e[iA] = obj;
            return;
        }
        int i6 = ~iA;
        int i7 = this.f;
        if (i6 < i7) {
            Object[] objArr = this.f8240e;
            if (objArr[i6] == f8238g) {
                this.f8239d[i6] = i5;
                objArr[i6] = obj;
                return;
            }
        }
        if (i7 >= this.f8239d.length) {
            int i8 = (i7 + 1) * 4;
            int i9 = 4;
            while (true) {
                if (i9 >= 32) {
                    break;
                }
                int i10 = (1 << i9) - 12;
                if (i8 <= i10) {
                    i8 = i10;
                    break;
                }
                i9++;
            }
            int i11 = i8 / 4;
            int[] iArr = new int[i11];
            Object[] objArr2 = new Object[i11];
            int[] iArr2 = this.f8239d;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f8240e;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f8239d = iArr;
            this.f8240e = objArr2;
        }
        int i12 = this.f - i6;
        if (i12 != 0) {
            int[] iArr3 = this.f8239d;
            int i13 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i13, i12);
            Object[] objArr4 = this.f8240e;
            System.arraycopy(objArr4, i6, objArr4, i13, this.f - i6);
        }
        this.f8239d[i6] = i5;
        this.f8240e[i6] = obj;
        this.f++;
    }

    public final Object clone() {
        try {
            C0714l c0714l = (C0714l) super.clone();
            c0714l.f8239d = (int[]) this.f8239d.clone();
            c0714l.f8240e = (Object[]) this.f8240e.clone();
            return c0714l;
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }

    public final String toString() {
        int i5 = this.f;
        if (i5 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i5 * 28);
        sb.append('{');
        for (int i6 = 0; i6 < this.f; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            sb.append(this.f8239d[i6]);
            sb.append('=');
            Object obj = this.f8240e[i6];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
