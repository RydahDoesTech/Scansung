package r0;

import N3.f;
import b3.AbstractC0219i;
import f3.C0446b;
import f3.C0447c;
import java.lang.reflect.Method;
import java.util.Iterator;
import p3.InterfaceC0742D;
import p4.h;
import s3.AbstractC0828D;
import x3.C0914a;
import x3.EnumC0915b;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0807a {
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static u3.C0881c a(java.lang.Class r14) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.AbstractC0807a.a(java.lang.Class):u3.c");
    }

    public static int b() {
        Method methodS = J2.b.s("com.samsung.android.widget.SemHoverPopupWindow", "hidden_TYPE_NONE", new Class[0]);
        Object objE = methodS != null ? J2.b.E(null, methodS, new Object[0]) : null;
        if (objE instanceof Integer) {
            return ((Integer) objE).intValue();
        }
        return 0;
    }

    public static boolean c() {
        Object objE;
        Method methodA = J2.b.A("com.samsung.android.view.SemWindowManager", "isTableMode", new Class[0]);
        if (methodA == null) {
            return false;
        }
        Method methodA2 = J2.b.A("com.samsung.android.view.SemWindowManager", "getInstance", new Class[0]);
        Object obj = null;
        if (methodA2 != null && (objE = J2.b.E(null, methodA2, new Object[0])) != null && objE.getClass().getName().equals("com.samsung.android.view.SemWindowManager")) {
            obj = objE;
        }
        Object objE2 = J2.b.E(obj, methodA, new Object[0]);
        if (objE2 instanceof Boolean) {
            return ((Boolean) objE2).booleanValue();
        }
        return false;
    }

    public static f d(f fVar, String str, String str2, int i5) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z4 = (i5 & 4) != 0;
        if ((i5 & 8) != 0) {
            str2 = null;
        }
        if (!fVar.f1843e) {
            String strC = fVar.c();
            if (h.o0(strC, str) && strC.length() != str.length() && ('a' > (cCharAt = strC.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return f.e(str2.concat(h.l0(strC, str)));
                }
                if (!z4) {
                    return fVar;
                }
                String strL0 = h.l0(strC, str);
                if (strL0.length() != 0 && J2.b.J(0, strL0)) {
                    if (strL0.length() != 1 && J2.b.J(1, strL0)) {
                        Iterator it = new C0447c(0, strL0.length() - 1, 1).iterator();
                        while (true) {
                            C0446b c0446b = (C0446b) it;
                            if (!c0446b.f) {
                                next = null;
                                break;
                            }
                            next = c0446b.next();
                            if (!J2.b.J(((Number) next).intValue(), strL0)) {
                                break;
                            }
                        }
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            String strSubstring = strL0.substring(0, iIntValue);
                            AbstractC0219i.d("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
                            String strB0 = J2.b.b0(strSubstring);
                            String strSubstring2 = strL0.substring(iIntValue);
                            AbstractC0219i.d("this as java.lang.String).substring(startIndex)", strSubstring2);
                            strL0 = strB0.concat(strSubstring2);
                        } else {
                            strL0 = J2.b.b0(strL0);
                        }
                    } else if (strL0.length() != 0 && 'A' <= (cCharAt2 = strL0.charAt(0)) && cCharAt2 < '[') {
                        char lowerCase = Character.toLowerCase(cCharAt2);
                        String strSubstring3 = strL0.substring(1);
                        AbstractC0219i.d("this as java.lang.String).substring(startIndex)", strSubstring3);
                        strL0 = lowerCase + strSubstring3;
                    }
                }
                if (f.f(strL0)) {
                    return f.e(strL0);
                }
            }
        }
        return null;
    }

    public static final void e(C0914a c0914a, EnumC0915b enumC0915b, InterfaceC0742D interfaceC0742D, f fVar) {
        AbstractC0219i.e("<this>", c0914a);
        AbstractC0219i.e("from", enumC0915b);
        AbstractC0219i.e("scopeOwner", interfaceC0742D);
        AbstractC0219i.e("name", fVar);
        ((AbstractC0828D) interfaceC0742D).f8745h.b();
        AbstractC0219i.d("name.asString()", fVar.b());
    }
}
