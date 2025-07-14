package P2;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import e1.AbstractC0415a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class i extends AbstractC0415a {
    public static List i0(Object[] objArr) {
        AbstractC0219i.e("<this>", objArr);
        List listAsList = Arrays.asList(objArr);
        AbstractC0219i.d("asList(this)", listAsList);
        return listAsList;
    }

    public static o4.k j0(Object[] objArr) {
        return objArr.length == 0 ? o4.d.f8297a : new l(0, objArr);
    }

    public static boolean k0(Object obj, Object[] objArr) {
        AbstractC0219i.e("<this>", objArr);
        return r0(obj, objArr) >= 0;
    }

    public static void l0(Object[] objArr, Object[] objArr2, int i5, int i6, int i7) {
        AbstractC0219i.e("<this>", objArr);
        AbstractC0219i.e("destination", objArr2);
        System.arraycopy(objArr, i6, objArr2, i5, i7 - i6);
    }

    public static Object[] m0(Object[] objArr, int i5, int i6) {
        AbstractC0219i.e("<this>", objArr);
        int length = objArr.length;
        if (i6 <= length) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i5, i6);
            AbstractC0219i.d("copyOfRange(this, fromIndex, toIndex)", objArrCopyOfRange);
            return objArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i6 + ") is greater than size (" + length + ").");
    }

    public static ArrayList n0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object o0(Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object p0(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static Integer q0(int[] iArr, int i5) {
        AbstractC0219i.e("<this>", iArr);
        if (i5 < 0 || i5 > iArr.length - 1) {
            return null;
        }
        return Integer.valueOf(iArr[i5]);
    }

    public static int r0(Object obj, Object[] objArr) {
        AbstractC0219i.e("<this>", objArr);
        int i5 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i5 < length) {
                if (objArr[i5] == null) {
                    return i5;
                }
                i5++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i5 < length2) {
            if (obj.equals(objArr[i5])) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static final void s0(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i5, CharSequence charSequence4, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("<this>", objArr);
        AbstractC0219i.e("separator", charSequence);
        AbstractC0219i.e("prefix", charSequence2);
        AbstractC0219i.e("postfix", charSequence3);
        AbstractC0219i.e("truncated", charSequence4);
        sb.append(charSequence2);
        int i6 = 0;
        for (Object obj : objArr) {
            i6++;
            if (i6 > 1) {
                sb.append(charSequence);
            }
            if (i5 >= 0 && i6 > i5) {
                break;
            }
            g3.y.b(sb, obj, interfaceC0107b);
        }
        if (i5 >= 0 && i6 > i5) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String t0(Object[] objArr, String str, String str2, InterfaceC0107b interfaceC0107b) {
        StringBuilder sb = new StringBuilder();
        s0(objArr, sb, "", str, str2, -1, "...", interfaceC0107b);
        String string = sb.toString();
        AbstractC0219i.d("joinTo(StringBuilder(), …ed, transform).toString()", string);
        return string;
    }

    public static Object u0(Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object v0(Object[] objArr) {
        AbstractC0219i.e("<this>", objArr);
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static List w0(Object[] objArr) {
        AbstractC0219i.e("<this>", objArr);
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new g(objArr, false)) : g3.y.N(objArr[0]) : u.f2163d;
    }

    public static Set x0(Object[] objArr) {
        AbstractC0219i.e("<this>", objArr);
        int length = objArr.length;
        if (length == 0) {
            return w.f2165d;
        }
        if (length == 1) {
            return V1.a.l0(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(z.g0(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }
}
