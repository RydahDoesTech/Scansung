package X3;

import P2.u;
import b3.AbstractC0219i;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final l f2761c = new l();

    /* renamed from: d, reason: collision with root package name */
    public static final int f2762d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f2763e;
    public static final int f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f2764g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f2765h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f2766i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f2767j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f2768k;

    /* renamed from: l, reason: collision with root package name */
    public static final int f2769l;

    /* renamed from: m, reason: collision with root package name */
    public static final f f2770m;
    public static final f n;

    /* renamed from: o, reason: collision with root package name */
    public static final f f2771o;

    /* renamed from: p, reason: collision with root package name */
    public static final f f2772p;

    /* renamed from: q, reason: collision with root package name */
    public static final f f2773q;

    /* renamed from: r, reason: collision with root package name */
    public static final ArrayList f2774r;

    /* renamed from: s, reason: collision with root package name */
    public static final ArrayList f2775s;

    /* renamed from: a, reason: collision with root package name */
    public final List f2776a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2777b;

    static {
        e eVar;
        int i5 = f2762d;
        int i6 = i5 << 1;
        f2763e = i5;
        int i7 = i5 << 2;
        f = i6;
        int i8 = i5 << 3;
        f2764g = i7;
        int i9 = i5 << 4;
        f2765h = i8;
        int i10 = i5 << 5;
        f2766i = i9;
        f2767j = i10;
        f2762d = i5 << 7;
        int i11 = (i5 << 6) - 1;
        f2768k = i11;
        int i12 = i5 | i6 | i7;
        f2769l = i12;
        f2770m = new f(i11);
        n = new f(i9 | i10);
        new f(i5);
        new f(i6);
        new f(i7);
        f2771o = new f(i12);
        new f(i8);
        f2772p = new f(i9);
        f2773q = new f(i10);
        new f(i6 | i9 | i10);
        Field[] fields = f.class.getFields();
        AbstractC0219i.d("T::class.java.fields", fields);
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            e eVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            f fVar = obj instanceof f ? (f) obj : null;
            if (fVar != null) {
                String name = field2.getName();
                AbstractC0219i.d("field.name", name);
                eVar2 = new e(fVar.f2777b, name);
            }
            if (eVar2 != null) {
                arrayList2.add(eVar2);
            }
        }
        f2774r = arrayList2;
        Field[] fields2 = f.class.getFields();
        AbstractC0219i.d("T::class.java.fields", fields2);
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (AbstractC0219i.a(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Field field4 = (Field) it3.next();
            Object obj2 = field4.get(null);
            AbstractC0219i.c("null cannot be cast to non-null type kotlin.Int", obj2);
            int iIntValue = ((Integer) obj2).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                AbstractC0219i.d("field.name", name2);
                eVar = new e(iIntValue, name2);
            } else {
                eVar = null;
            }
            if (eVar != null) {
                arrayList5.add(eVar);
            }
        }
        f2775s = arrayList5;
    }

    public f(int i5, List list) {
        AbstractC0219i.e("excludes", list);
        this.f2776a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i5 &= ~((d) it.next()).a();
        }
        this.f2777b = i5;
    }

    public final boolean a(int i5) {
        return (this.f2777b & i5) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter", obj);
        f fVar = (f) obj;
        return AbstractC0219i.a(this.f2776a, fVar.f2776a) && this.f2777b == fVar.f2777b;
    }

    public final int hashCode() {
        return (this.f2776a.hashCode() * 31) + this.f2777b;
    }

    public final String toString() {
        Object next;
        Iterator it = f2774r.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((e) next).f2759a == this.f2777b) {
                break;
            }
        }
        e eVar = (e) next;
        String strA0 = eVar != null ? eVar.f2760b : null;
        if (strA0 == null) {
            ArrayList arrayList = f2775s;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                e eVar2 = (e) it2.next();
                String str = a(eVar2.f2759a) ? eVar2.f2760b : null;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            strA0 = P2.m.A0(arrayList2, " | ", null, null, null, 62);
        }
        return "DescriptorKindFilter(" + strA0 + ", " + this.f2776a + ')';
    }

    public /* synthetic */ f(int i5) {
        this(i5, u.f2163d);
    }
}
