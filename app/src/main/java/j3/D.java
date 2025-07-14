package j3;

import b3.AbstractC0215e;
import b3.AbstractC0219i;
import b3.InterfaceC0213c;
import com.idm.core.tnds.IDMTndsXmlWbxmlDefine;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p3.InterfaceC0750L;
import s0.AbstractC0823a;
import v3.AbstractC0897d;

/* loaded from: classes.dex */
public abstract class D implements InterfaceC0213c {

    /* renamed from: d, reason: collision with root package name */
    public static final b3.p f7326d = new b3.p("<v#(\\d+)>");

    public static Method m(Class cls, String str, Class[] clsArr, Class cls2, boolean z4) throws NoSuchMethodException, SecurityException {
        Class clsE;
        Method methodM;
        if (z4) {
            clsArr[0] = cls;
        }
        Method methodP = p(cls, str, clsArr, cls2);
        if (methodP != null) {
            return methodP;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodM = m(superclass, str, clsArr, cls2, z4)) != null) {
            return methodM;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        AbstractC0219i.d("interfaces", interfaces);
        for (Class<?> cls3 : interfaces) {
            AbstractC0219i.d("superInterface", cls3);
            Method methodM2 = m(cls3, str, clsArr, cls2, z4);
            if (methodM2 != null) {
                return methodM2;
            }
            if (z4 && (clsE = AbstractC0823a.e(AbstractC0897d.d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method methodP2 = p(clsE, str, clsArr, cls2);
                if (methodP2 != null) {
                    return methodP2;
                }
            }
        }
        return null;
    }

    public static Constructor o(Class cls, ArrayList arrayList) {
        try {
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method p(Class cls, String str, Class[] clsArr, Class cls2) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (AbstractC0219i.a(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            AbstractC0219i.d("declaredMethods", declaredMethods);
            for (Method method : declaredMethods) {
                if (AbstractC0219i.a(method.getName(), str) && AbstractC0219i.a(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final void b(ArrayList arrayList, String str, boolean z4) {
        ArrayList arrayListJ = j(str);
        arrayList.addAll(arrayListJ);
        int size = (arrayListJ.size() + 31) / 32;
        for (int i5 = 0; i5 < size; i5++) {
            Class cls = Integer.TYPE;
            AbstractC0219i.d("TYPE", cls);
            arrayList.add(cls);
        }
        if (!z4) {
            arrayList.add(Object.class);
        } else {
            arrayList.remove(AbstractC0215e.class);
            arrayList.add(AbstractC0215e.class);
        }
    }

    public final Method c(String str, String str2) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodM;
        AbstractC0219i.e("name", str);
        AbstractC0219i.e("desc", str2);
        if (str.equals("<init>")) {
            return null;
        }
        Class[] clsArr = (Class[]) j(str2).toArray(new Class[0]);
        Class clsN = n(p4.h.k0(str2, ')', 0, false, 6) + 1, str2.length(), str2);
        Method methodM2 = m(h(), str, clsArr, clsN, false);
        if (methodM2 != null) {
            return methodM2;
        }
        if (!h().isInterface() || (methodM = m(Object.class, str, clsArr, clsN, false)) == null) {
            return null;
        }
        return methodM;
    }

    public abstract Collection d();

    public abstract Collection e(N3.f fVar);

    public abstract InterfaceC0750L f(int i5);

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List g(X3.n r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            b3.AbstractC0219i.e(r0, r8)
            java.lang.String r0 = "belonginess"
            A3.f.q(r9, r0)
            j3.C r0 = new j3.C
            r0.<init>(r7)
            r7 = 0
            r1 = 3
            java.util.Collection r8 = V1.a.A(r8, r7, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L1e:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r8.next()
            p3.j r2 = (p3.InterfaceC0766j) r2
            boolean r3 = r2 instanceof p3.InterfaceC0759c
            if (r3 == 0) goto L57
            r3 = r2
            p3.c r3 = (p3.InterfaceC0759c) r3
            p3.n r4 = r3.b()
            p3.n r5 = p3.AbstractC0771o.f8425h
            boolean r4 = b3.AbstractC0219i.a(r4, r5)
            if (r4 != 0) goto L57
            int r3 = r3.i0()
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == r4) goto L48
            r3 = r6
            goto L49
        L48:
            r3 = r5
        L49:
            if (r9 != r6) goto L4c
            r5 = r6
        L4c:
            if (r3 != r5) goto L57
            O2.l r3 = O2.l.f2016a
            java.lang.Object r2 = r2.U(r0, r3)
            j3.r r2 = (j3.r) r2
            goto L58
        L57:
            r2 = r7
        L58:
            if (r2 == 0) goto L1e
            r1.add(r2)
            goto L1e
        L5e:
            java.util.List r7 = P2.m.O0(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.D.g(X3.n, int):java.util.List");
    }

    public Class h() {
        Class clsA = a();
        List list = AbstractC0897d.f9243a;
        AbstractC0219i.e("<this>", clsA);
        Class cls = (Class) AbstractC0897d.f9245c.get(clsA);
        return cls == null ? a() : cls;
    }

    public abstract Collection i(N3.f fVar);

    public final ArrayList j(String str) {
        int iK0;
        ArrayList arrayList = new ArrayList();
        int i5 = 1;
        while (str.charAt(i5) != ')') {
            int i6 = i5;
            while (str.charAt(i6) == '[') {
                i6++;
            }
            char cCharAt = str.charAt(i6);
            if (p4.h.k0("VZCBSIFJD", cCharAt, 0, false, 2) >= 0) {
                iK0 = i6 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new O2.e("Unknown type prefix in the method signature: ".concat(str), 2);
                }
                iK0 = p4.h.k0(str, ';', i5, false, 4) + 1;
            }
            arrayList.add(n(i5, iK0, str));
            i5 = iK0;
        }
        return arrayList;
    }

    public final Class n(int i5, int i6, String str) throws ClassNotFoundException {
        char cCharAt = str.charAt(i5);
        if (cCharAt == 'L') {
            ClassLoader classLoaderD = AbstractC0897d.d(a());
            String strSubstring = str.substring(i5 + 1, i6 - 1);
            AbstractC0219i.d("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
            Class<?> clsLoadClass = classLoaderD.loadClass(p4.h.m0(strSubstring, IDMTndsXmlWbxmlDefine.XML_SLASH, '.'));
            AbstractC0219i.d("jClass.safeClassLoader.l…d - 1).replace('/', '.'))", clsLoadClass);
            return clsLoadClass;
        }
        if (cCharAt == '[') {
            Class clsN = n(i5 + 1, i6, str);
            N3.c cVar = x0.f7455a;
            AbstractC0219i.e("<this>", clsN);
            return Array.newInstance((Class<?>) clsN, 0).getClass();
        }
        if (cCharAt == 'V') {
            Class cls = Void.TYPE;
            AbstractC0219i.d("TYPE", cls);
            return cls;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == 'C') {
            return Character.TYPE;
        }
        if (cCharAt == 'B') {
            return Byte.TYPE;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'D') {
            return Double.TYPE;
        }
        throw new O2.e("Unknown type prefix in the method signature: ".concat(str), 2);
    }
}
