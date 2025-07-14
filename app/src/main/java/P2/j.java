package P2;

import b3.AbstractC0219i;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class j extends d implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f2157d;

    public j(int[] iArr) {
        this.f2157d = iArr;
    }

    @Override // P2.d, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f2157d;
        AbstractC0219i.e("<this>", iArr);
        int length = iArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i5 = -1;
                break;
            }
            if (iIntValue == iArr[i5]) {
                break;
            }
            i5++;
        }
        return i5 >= 0;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        return Integer.valueOf(this.f2157d[i5]);
    }

    @Override // P2.d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f2157d;
        AbstractC0219i.e("<this>", iArr);
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (iIntValue == iArr[i5]) {
                return i5;
            }
        }
        return -1;
    }

    @Override // P2.d, java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f2157d.length == 0;
    }

    @Override // P2.d
    public final int l() {
        return this.f2157d.length;
    }

    @Override // P2.d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f2157d;
        AbstractC0219i.e("<this>", iArr);
        int length = iArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i5 = length - 1;
            if (iIntValue == iArr[length]) {
                return length;
            }
            if (i5 < 0) {
                return -1;
            }
            length = i5;
        }
    }
}
