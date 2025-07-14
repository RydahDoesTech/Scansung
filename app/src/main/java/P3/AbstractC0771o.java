package p3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import s3.C0840P;
import s3.InterfaceC0839O;

/* renamed from: p3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0771o {

    /* renamed from: a, reason: collision with root package name */
    public static final C0770n f8419a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0770n f8420b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0770n f8421c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0770n f8422d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0770n f8423e;
    public static final C0770n f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0770n f8424g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0770n f8425h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0770n f8426i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0770n f8427j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0753O f8428k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0753O f8429l;

    /* renamed from: m, reason: collision with root package name */
    public static final C0753O f8430m;
    public static final k4.o n;

    /* renamed from: o, reason: collision with root package name */
    public static final HashMap f8431o;

    static {
        Z z4 = Z.f8407c;
        C0770n c0770n = new C0770n(z4, 0);
        f8419a = c0770n;
        a0 a0Var = a0.f8408c;
        C0770n c0770n2 = new C0770n(a0Var, 1);
        f8420b = c0770n2;
        b0 b0Var = b0.f8409c;
        C0770n c0770n3 = new C0770n(b0Var, 2);
        f8421c = c0770n3;
        W w3 = W.f8404c;
        C0770n c0770n4 = new C0770n(w3, 3);
        f8422d = c0770n4;
        c0 c0Var = c0.f8410c;
        C0770n c0770n5 = new C0770n(c0Var, 4);
        f8423e = c0770n5;
        Y y4 = Y.f8406c;
        C0770n c0770n6 = new C0770n(y4, 5);
        f = c0770n6;
        V v2 = V.f8403c;
        C0770n c0770n7 = new C0770n(v2, 6);
        f8424g = c0770n7;
        X x4 = X.f8405c;
        C0770n c0770n8 = new C0770n(x4, 7);
        f8425h = c0770n8;
        d0 d0Var = d0.f8413c;
        C0770n c0770n9 = new C0770n(d0Var, 8);
        f8426i = c0770n9;
        Collections.unmodifiableSet(P2.B.u0(c0770n, c0770n2, c0770n4, c0770n6));
        HashMap map = new HashMap(6);
        map.put(c0770n2, 0);
        map.put(c0770n, 0);
        map.put(c0770n4, 1);
        map.put(c0770n3, 1);
        map.put(c0770n5, 2);
        Collections.unmodifiableMap(map);
        f8427j = c0770n5;
        f8428k = new C0753O(2);
        f8429l = new C0753O(3);
        f8430m = new C0753O(4);
        try {
            Iterator it = Arrays.asList(new k4.o[0]).iterator();
            n = it.hasNext() ? (k4.o) it.next() : k4.o.f7969a;
            HashMap map2 = new HashMap();
            f8431o = map2;
            map2.put(z4, c0770n);
            map2.put(a0Var, c0770n2);
            map2.put(b0Var, c0770n3);
            map2.put(w3, c0770n4);
            map2.put(c0Var, c0770n5);
            map2.put(y4, c0770n6);
            map2.put(v2, c0770n7);
            map2.put(x4, c0770n8);
            map2.put(d0Var, c0770n9);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.AbstractC0771o.a(int):void");
    }

    public static Integer b(C0770n c0770n, C0770n c0770n2) {
        if (c0770n == null) {
            a(12);
            throw null;
        }
        if (c0770n2 == null) {
            a(13);
            throw null;
        }
        f0 f0Var = c0770n.f8417a;
        f0 f0Var2 = c0770n2.f8417a;
        Integer numA = f0Var.a(f0Var2);
        if (numA != null) {
            return numA;
        }
        Integer numA2 = f0Var2.a(f0Var);
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static InterfaceC0769m c(C0753O c0753o, InterfaceC0759c interfaceC0759c, InterfaceC0766j interfaceC0766j) {
        InterfaceC0769m interfaceC0769mC;
        if (interfaceC0759c == null) {
            a(8);
            throw null;
        }
        if (interfaceC0766j == null) {
            a(9);
            throw null;
        }
        for (InterfaceC0769m interfaceC0769m = (InterfaceC0769m) interfaceC0759c.a(); interfaceC0769m != null && interfaceC0769m.b() != f; interfaceC0769m = (InterfaceC0769m) Q3.f.j(interfaceC0769m, InterfaceC0769m.class, true)) {
            if (!interfaceC0769m.b().a(c0753o, interfaceC0769m, interfaceC0766j)) {
                return interfaceC0769m;
            }
        }
        if (!(interfaceC0759c instanceof InterfaceC0839O) || (interfaceC0769mC = c(c0753o, ((C0840P) ((InterfaceC0839O) interfaceC0759c)).f8797I, interfaceC0766j)) == null) {
            return null;
        }
        return interfaceC0769mC;
    }

    public static boolean d(InterfaceC0769m interfaceC0769m, InterfaceC0766j interfaceC0766j) {
        if (interfaceC0766j == null) {
            a(7);
            throw null;
        }
        C0753O c0753oF = Q3.f.f(interfaceC0766j);
        if (c0753oF != C0753O.f8401e) {
            return c0753oF.equals(Q3.f.f(interfaceC0769m));
        }
        return false;
    }

    public static boolean e(C0770n c0770n) {
        if (c0770n != null) {
            return c0770n == f8419a || c0770n == f8420b;
        }
        a(14);
        throw null;
    }

    public static C0770n f(f0 f0Var) {
        if (f0Var == null) {
            a(15);
            throw null;
        }
        C0770n c0770n = (C0770n) f8431o.get(f0Var);
        if (c0770n != null) {
            return c0770n;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + f0Var);
    }
}
