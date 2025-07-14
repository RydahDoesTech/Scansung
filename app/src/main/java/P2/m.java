package P2;

import C3.C0012d;
import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import f3.C0447c;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class m extends s {
    public static String A0(Iterable iterable, String str, String str2, String str3, InterfaceC0107b interfaceC0107b, int i5) {
        if ((i5 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i5 & 2) != 0 ? "" : str2;
        String str6 = (i5 & 4) != 0 ? "" : str3;
        if ((i5 & 32) != 0) {
            interfaceC0107b = null;
        }
        AbstractC0219i.e("<this>", iterable);
        AbstractC0219i.e("separator", str4);
        AbstractC0219i.e("prefix", str5);
        AbstractC0219i.e("postfix", str6);
        StringBuilder sb = new StringBuilder();
        y0(iterable, sb, str4, str5, str6, -1, "...", interfaceC0107b);
        String string = sb.toString();
        AbstractC0219i.d("joinTo(StringBuilder(), …ed, transform).toString()", string);
        return string;
    }

    public static Object B0(Collection collection) {
        if (collection instanceof List) {
            return C0((List) collection);
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object C0(List list) {
        AbstractC0219i.e("<this>", list);
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(n.g0(list));
    }

    public static Object D0(List list) {
        AbstractC0219i.e("<this>", list);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList E0(Iterable iterable, Iterable iterable2) {
        AbstractC0219i.e("<this>", iterable);
        if (iterable instanceof Collection) {
            return G0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        s.n0(arrayList, iterable);
        s.n0(arrayList, iterable2);
        return arrayList;
    }

    public static ArrayList F0(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return H0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        s.n0(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList G0(Collection collection, Iterable iterable) {
        AbstractC0219i.e("<this>", collection);
        AbstractC0219i.e("elements", iterable);
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            s.n0(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList H0(Collection collection, Object obj) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object I0(Collection collection) {
        AbstractC0219i.e("<this>", collection);
        if (collection instanceof List) {
            return J0((List) collection);
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static Object J0(List list) {
        AbstractC0219i.e("<this>", list);
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object K0(Collection collection) {
        AbstractC0219i.e("<this>", collection);
        if (collection instanceof List) {
            List list = (List) collection;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object L0(List list) {
        AbstractC0219i.e("<this>", list);
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List M0(AbstractCollection abstractCollection, Comparator comparator) {
        AbstractC0219i.e("<this>", abstractCollection);
        if (abstractCollection.size() <= 1) {
            return O0(abstractCollection);
        }
        Object[] array = abstractCollection.toArray(new Object[0]);
        AbstractC0219i.e("<this>", array);
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return i.i0(array);
    }

    public static final void N0(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC0219i.e("<this>", iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List O0(Iterable iterable) {
        ArrayList arrayListP0;
        AbstractC0219i.e("<this>", iterable);
        boolean z4 = iterable instanceof Collection;
        if (!z4) {
            if (z4) {
                arrayListP0 = P0((Collection) iterable);
            } else {
                ArrayList arrayList = new ArrayList();
                N0(iterable, arrayList);
                arrayListP0 = arrayList;
            }
            return n.j0(arrayListP0);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return u.f2163d;
        }
        if (size != 1) {
            return P0(collection);
        }
        return g3.y.N(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static ArrayList P0(Collection collection) {
        AbstractC0219i.e("<this>", collection);
        return new ArrayList(collection);
    }

    public static Set Q0(Iterable iterable) {
        AbstractC0219i.e("<this>", iterable);
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        N0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set R0(Iterable iterable) {
        AbstractC0219i.e("<this>", iterable);
        boolean z4 = iterable instanceof Collection;
        w wVar = w.f2165d;
        if (!z4) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            N0(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : V1.a.l0(linkedHashSet.iterator().next()) : wVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return wVar;
        }
        if (size2 == 1) {
            return V1.a.l0(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(z.g0(collection.size()));
        N0(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static k S0(List list) {
        AbstractC0219i.e("<this>", list);
        return new k(new C0012d(2, list));
    }

    public static ArrayList T0(Collection collection, Collection collection2) {
        AbstractC0219i.e("<this>", collection);
        AbstractC0219i.e("other", collection2);
        Iterator it = collection.iterator();
        Iterator it2 = collection2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(o.l0(collection), o.l0(collection2)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new O2.f(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final int o0(A a5, int i5) {
        if (new C0447c(0, n.g0(a5), 1).l(i5)) {
            return n.g0(a5) - i5;
        }
        throw new IndexOutOfBoundsException("Element index " + i5 + " must be in range [" + new C0447c(0, n.g0(a5), 1) + "].");
    }

    public static l p0(Iterable iterable) {
        AbstractC0219i.e("<this>", iterable);
        return new l(1, iterable);
    }

    public static boolean q0(Iterable iterable, Object obj) {
        int iIndexOf;
        AbstractC0219i.e("<this>", iterable);
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i5 = 0;
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    break;
                }
                Object next = it.next();
                if (i5 < 0) {
                    n.k0();
                    throw null;
                }
                if (AbstractC0219i.a(obj, next)) {
                    iIndexOf = i5;
                    break;
                }
                i5++;
            }
        } else {
            iIndexOf = ((List) iterable).indexOf(obj);
        }
        return iIndexOf >= 0;
    }

    public static List r0(List list) {
        int size = list.size() - 1;
        if (size <= 0) {
            return u.f2163d;
        }
        if (size == 1) {
            return g3.y.N(B0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            for (int i5 = 1; i5 < size2; i5++) {
                arrayList.add(list.get(i5));
            }
        } else {
            ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static List s0(List list) {
        AbstractC0219i.e("<this>", list);
        int size = list.size() - 1;
        int i5 = 0;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            throw new IllegalArgumentException(("Requested element count " + size + " is less than zero.").toString());
        }
        if (size == 0) {
            return u.f2163d;
        }
        if (size >= list.size()) {
            return O0(list);
        }
        if (size == 1) {
            return g3.y.N(t0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i5++;
            if (i5 == size) {
                break;
            }
        }
        return n.j0(arrayList);
    }

    public static Object t0(Collection collection) {
        AbstractC0219i.e("<this>", collection);
        if (collection instanceof List) {
            return u0((List) collection);
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object u0(List list) {
        AbstractC0219i.e("<this>", list);
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object v0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object w0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object x0(int i5, List list) {
        AbstractC0219i.e("<this>", list);
        if (i5 < 0 || i5 > n.g0(list)) {
            return null;
        }
        return list.get(i5);
    }

    public static final void y0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i5, CharSequence charSequence4, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("<this>", iterable);
        AbstractC0219i.e("buffer", sb);
        AbstractC0219i.e("separator", charSequence);
        AbstractC0219i.e("prefix", charSequence2);
        AbstractC0219i.e("postfix", charSequence3);
        AbstractC0219i.e("truncated", charSequence4);
        sb.append(charSequence2);
        int i6 = 0;
        for (Object obj : iterable) {
            i6++;
            if (i6 > 1) {
                sb.append(charSequence);
            }
            if (i5 >= 0 && i6 > i5) {
                break;
            } else {
                g3.y.b(sb, obj, interfaceC0107b);
            }
        }
        if (i5 >= 0 && i6 > i5) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void z0(Collection collection, StringBuilder sb, String str, String str2, InterfaceC0107b interfaceC0107b, int i5) {
        String str3 = (i5 & 4) != 0 ? "" : str;
        String str4 = (i5 & 8) != 0 ? "" : str2;
        if ((i5 & 64) != 0) {
            interfaceC0107b = null;
        }
        y0(collection, sb, ", ", str3, str4, -1, "...", interfaceC0107b);
    }
}
