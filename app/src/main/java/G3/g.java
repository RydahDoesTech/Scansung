package G3;

import I3.Q;
import b3.AbstractC0219i;
import e1.AbstractC0415a;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.C0421d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class g implements a4.m {

    /* renamed from: b, reason: collision with root package name */
    public static final g f757b = new g();

    /* renamed from: c, reason: collision with root package name */
    public static final g f758c = new g();

    /* renamed from: d, reason: collision with root package name */
    public static final g f759d = new g();

    public static String[] a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static l b(String str) {
        V3.c cVar;
        l jVar;
        AbstractC0219i.e("representation", str);
        char cCharAt = str.charAt(0);
        V3.c[] cVarArrValues = V3.c.values();
        int length = cVarArrValues.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i5];
            if (cVar.c().charAt(0) == cCharAt) {
                break;
            }
            i5++;
        }
        if (cVar != null) {
            return new k(cVar);
        }
        if (cCharAt == 'V') {
            return new k(null);
        }
        if (cCharAt == '[') {
            String strSubstring = str.substring(1);
            AbstractC0219i.d("this as java.lang.String).substring(startIndex)", strSubstring);
            jVar = new i(b(strSubstring));
        } else {
            if (cCharAt == 'L' && str.length() > 0) {
                AbstractC0415a.i(str.charAt(p4.h.h0(str)), ';', false);
            }
            String strSubstring2 = str.substring(1, str.length() - 1);
            AbstractC0219i.d("this as java.lang.String…ing(startIndex, endIndex)", strSubstring2);
            jVar = new j(strSubstring2);
        }
        return jVar;
    }

    public static j d(String str) {
        AbstractC0219i.e("internalName", str);
        return new j(str);
    }

    public static LinkedHashSet e(String str, String... strArr) {
        AbstractC0219i.e("internalName", str);
        AbstractC0219i.e("signatures", strArr);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet f(String str, String... strArr) {
        AbstractC0219i.e("signatures", strArr);
        return e("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static LinkedHashSet g(String str, String... strArr) {
        return e("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static String h(l lVar) {
        String strC;
        AbstractC0219i.e("type", lVar);
        if (lVar instanceof i) {
            return "[" + h(((i) lVar).f762i);
        }
        if (lVar instanceof k) {
            V3.c cVar = ((k) lVar).f764i;
            return (cVar == null || (strC = cVar.c()) == null) ? "V" : strC;
        }
        if (!(lVar instanceof j)) {
            throw new O2.d();
        }
        return "L" + ((j) lVar).f763i + ';';
    }

    @Override // a4.m
    public AbstractC0438v c(Q q5, String str, AbstractC0442z abstractC0442z, AbstractC0442z abstractC0442z2) {
        AbstractC0219i.e("proto", q5);
        AbstractC0219i.e("flexibleId", str);
        AbstractC0219i.e("lowerBound", abstractC0442z);
        AbstractC0219i.e("upperBound", abstractC0442z2);
        return !str.equals("kotlin.jvm.PlatformType") ? g4.j.c(g4.i.f6824p, str, abstractC0442z.toString(), abstractC0442z2.toString()) : q5.l(L3.k.f1801g) ? new D3.g(abstractC0442z, abstractC0442z2) : C0421d.j(abstractC0442z, abstractC0442z2);
    }
}
