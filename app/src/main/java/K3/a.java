package K3;

import P2.i;
import P2.j;
import P2.m;
import P2.u;
import b3.AbstractC0219i;
import com.idm.providers.mo.IDMMoInterface;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1652a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1653b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1654c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1655d;

    /* renamed from: e, reason: collision with root package name */
    public final List f1656e;

    public a(int... iArr) {
        List listO0;
        AbstractC0219i.e("numbers", iArr);
        this.f1652a = iArr;
        Integer numQ0 = i.q0(iArr, 0);
        this.f1653b = numQ0 != null ? numQ0.intValue() : -1;
        Integer numQ02 = i.q0(iArr, 1);
        this.f1654c = numQ02 != null ? numQ02.intValue() : -1;
        Integer numQ03 = i.q0(iArr, 2);
        this.f1655d = numQ03 != null ? numQ03.intValue() : -1;
        if (iArr.length <= 3) {
            listO0 = u.f2163d;
        } else {
            if (iArr.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + iArr.length + '.');
            }
            listO0 = m.O0(new P2.c(new j(iArr), 3, iArr.length));
        }
        this.f1656e = listO0;
    }

    public final boolean a(int i5, int i6, int i7) {
        int i8 = this.f1653b;
        if (i8 > i5) {
            return true;
        }
        if (i8 < i5) {
            return false;
        }
        int i9 = this.f1654c;
        if (i9 > i6) {
            return true;
        }
        return i9 >= i6 && this.f1655d >= i7;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass().equals(obj.getClass())) {
            a aVar = (a) obj;
            if (this.f1653b == aVar.f1653b && this.f1654c == aVar.f1654c && this.f1655d == aVar.f1655d && AbstractC0219i.a(this.f1656e, aVar.f1656e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.f1653b;
        int i6 = (i5 * 31) + this.f1654c + i5;
        int i7 = (i6 * 31) + this.f1655d + i6;
        return this.f1656e.hashCode() + (i7 * 31) + i7;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i5 : this.f1652a) {
            if (i5 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i5));
        }
        return arrayList.isEmpty() ? "unknown" : m.A0(arrayList, IDMMoInterface.IDM_MO_ROOT_PATH, null, null, null, 62);
    }
}
