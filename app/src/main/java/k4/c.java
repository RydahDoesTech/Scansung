package k4;

import b3.AbstractC0219i;
import e4.C0425h;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f7940d;

    /* renamed from: e, reason: collision with root package name */
    public int f7941e;

    @Override // k4.a
    public final Object get(int i5) {
        Object[] objArr = this.f7940d;
        AbstractC0219i.e("<this>", objArr);
        if (i5 < 0 || i5 > objArr.length - 1) {
            return null;
        }
        return objArr[i5];
    }

    @Override // k4.a, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this);
    }

    @Override // k4.a
    public final int l() {
        return this.f7941e;
    }

    @Override // k4.a
    public final void m(int i5, C0425h c0425h) {
        Object[] objArr = this.f7940d;
        if (objArr.length <= i5) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length * 2);
            AbstractC0219i.d("copyOf(this, newSize)", objArrCopyOf);
            this.f7940d = objArrCopyOf;
        }
        Object[] objArr2 = this.f7940d;
        if (objArr2[i5] == null) {
            this.f7941e++;
        }
        objArr2[i5] = c0425h;
    }
}
