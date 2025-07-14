package o3;

import b3.AbstractC0219i;
import g3.y;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import m3.C0691d;
import n3.EnumC0700e;

/* renamed from: o3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0721d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8248a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f8249b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f8250c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f8251d;

    /* renamed from: e, reason: collision with root package name */
    public static final N3.b f8252e;
    public static final N3.c f;

    /* renamed from: g, reason: collision with root package name */
    public static final N3.b f8253g;

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f8254h;

    /* renamed from: i, reason: collision with root package name */
    public static final HashMap f8255i;

    /* renamed from: j, reason: collision with root package name */
    public static final HashMap f8256j;

    /* renamed from: k, reason: collision with root package name */
    public static final HashMap f8257k;

    /* renamed from: l, reason: collision with root package name */
    public static final HashMap f8258l;

    /* renamed from: m, reason: collision with root package name */
    public static final HashMap f8259m;
    public static final List n;

    static {
        StringBuilder sb = new StringBuilder();
        EnumC0700e enumC0700e = EnumC0700e.f8181g;
        sb.append(enumC0700e.f8186d.f1834a.toString());
        sb.append('.');
        sb.append(enumC0700e.f8187e);
        f8248a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        EnumC0700e enumC0700e2 = EnumC0700e.f8183i;
        sb2.append(enumC0700e2.f8186d.f1834a.toString());
        sb2.append('.');
        sb2.append(enumC0700e2.f8187e);
        f8249b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        EnumC0700e enumC0700e3 = EnumC0700e.f8182h;
        sb3.append(enumC0700e3.f8186d.f1834a.toString());
        sb3.append('.');
        sb3.append(enumC0700e3.f8187e);
        f8250c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        EnumC0700e enumC0700e4 = EnumC0700e.f8184j;
        sb4.append(enumC0700e4.f8186d.f1834a.toString());
        sb4.append('.');
        sb4.append(enumC0700e4.f8187e);
        f8251d = sb4.toString();
        N3.b bVarJ = N3.b.j(new N3.c("kotlin.jvm.functions.FunctionN"));
        f8252e = bVarJ;
        f = bVarJ.b();
        f8253g = N3.i.n;
        d(Class.class);
        f8254h = new HashMap();
        f8255i = new HashMap();
        f8256j = new HashMap();
        f8257k = new HashMap();
        f8258l = new HashMap();
        f8259m = new HashMap();
        N3.b bVarJ2 = N3.b.j(m3.m.f8090A);
        N3.c cVar = m3.m.f8097I;
        N3.c cVarG = bVarJ2.g();
        N3.c cVarG2 = bVarJ2.g();
        AbstractC0219i.d("kotlinReadOnly.packageFqName", cVarG2);
        N3.c cVarA0 = y.a0(cVar, cVarG2);
        C0720c c0720c = new C0720c(d(Iterable.class), bVarJ2, new N3.b(cVarG, cVarA0, false));
        N3.b bVarJ3 = N3.b.j(m3.m.f8141z);
        N3.c cVar2 = m3.m.f8096H;
        N3.c cVarG3 = bVarJ3.g();
        N3.c cVarG4 = bVarJ3.g();
        AbstractC0219i.d("kotlinReadOnly.packageFqName", cVarG4);
        C0720c c0720c2 = new C0720c(d(Iterator.class), bVarJ3, new N3.b(cVarG3, y.a0(cVar2, cVarG4), false));
        N3.b bVarJ4 = N3.b.j(m3.m.f8091B);
        N3.c cVar3 = m3.m.f8098J;
        N3.c cVarG5 = bVarJ4.g();
        N3.c cVarG6 = bVarJ4.g();
        AbstractC0219i.d("kotlinReadOnly.packageFqName", cVarG6);
        C0720c c0720c3 = new C0720c(d(Collection.class), bVarJ4, new N3.b(cVarG5, y.a0(cVar3, cVarG6), false));
        N3.b bVarJ5 = N3.b.j(m3.m.f8092C);
        N3.c cVar4 = m3.m.f8099K;
        N3.c cVarG7 = bVarJ5.g();
        N3.c cVarG8 = bVarJ5.g();
        AbstractC0219i.d("kotlinReadOnly.packageFqName", cVarG8);
        C0720c c0720c4 = new C0720c(d(List.class), bVarJ5, new N3.b(cVarG7, y.a0(cVar4, cVarG8), false));
        N3.b bVarJ6 = N3.b.j(m3.m.E);
        N3.c cVar5 = m3.m.f8101M;
        N3.c cVarG9 = bVarJ6.g();
        N3.c cVarG10 = bVarJ6.g();
        AbstractC0219i.d("kotlinReadOnly.packageFqName", cVarG10);
        C0720c c0720c5 = new C0720c(d(Set.class), bVarJ6, new N3.b(cVarG9, y.a0(cVar5, cVarG10), false));
        N3.b bVarJ7 = N3.b.j(m3.m.f8093D);
        N3.c cVar6 = m3.m.f8100L;
        N3.c cVarG11 = bVarJ7.g();
        N3.c cVarG12 = bVarJ7.g();
        AbstractC0219i.d("kotlinReadOnly.packageFqName", cVarG12);
        C0720c c0720c6 = new C0720c(d(ListIterator.class), bVarJ7, new N3.b(cVarG11, y.a0(cVar6, cVarG12), false));
        N3.c cVar7 = m3.m.f8094F;
        N3.b bVarJ8 = N3.b.j(cVar7);
        N3.c cVar8 = m3.m.f8102N;
        N3.c cVarG13 = bVarJ8.g();
        N3.c cVarG14 = bVarJ8.g();
        AbstractC0219i.d("kotlinReadOnly.packageFqName", cVarG14);
        C0720c c0720c7 = new C0720c(d(Map.class), bVarJ8, new N3.b(cVarG13, y.a0(cVar8, cVarG14), false));
        N3.b bVarD = N3.b.j(cVar7).d(m3.m.f8095G.f());
        N3.c cVar9 = m3.m.f8103O;
        N3.c cVarG15 = bVarD.g();
        N3.c cVarG16 = bVarD.g();
        AbstractC0219i.d("kotlinReadOnly.packageFqName", cVarG16);
        List<C0720c> listH0 = P2.n.h0(c0720c, c0720c2, c0720c3, c0720c4, c0720c5, c0720c6, c0720c7, new C0720c(d(Map.Entry.class), bVarD, new N3.b(cVarG15, y.a0(cVar9, cVarG16), false)));
        n = listH0;
        c(Object.class, m3.m.f8115a);
        c(String.class, m3.m.f);
        c(CharSequence.class, m3.m.f8122e);
        a(d(Throwable.class), N3.b.j(m3.m.f8127k));
        c(Cloneable.class, m3.m.f8119c);
        c(Number.class, m3.m.f8125i);
        a(d(Comparable.class), N3.b.j(m3.m.f8128l));
        c(Enum.class, m3.m.f8126j);
        a(d(Annotation.class), N3.b.j(m3.m.f8134s));
        for (C0720c c0720c8 : listH0) {
            N3.b bVar = c0720c8.f8245a;
            N3.b bVar2 = c0720c8.f8246b;
            a(bVar, bVar2);
            N3.b bVar3 = c0720c8.f8247c;
            b(bVar3.b(), bVar);
            f8258l.put(bVar3, bVar2);
            f8259m.put(bVar2, bVar3);
            N3.c cVarB = bVar2.b();
            N3.c cVarB2 = bVar3.b();
            N3.e eVarI = bVar3.b().i();
            AbstractC0219i.d("mutableClassId.asSingleFqName().toUnsafe()", eVarI);
            f8256j.put(eVarI, cVarB);
            N3.e eVarI2 = cVarB.i();
            AbstractC0219i.d("readOnlyFqName.toUnsafe()", eVarI2);
            f8257k.put(eVarI2, cVarB2);
        }
        for (V3.c cVar10 : V3.c.values()) {
            N3.b bVarJ9 = N3.b.j(cVar10.e());
            m3.j jVarD = cVar10.d();
            AbstractC0219i.d("jvmType.primitiveType", jVarD);
            a(bVarJ9, N3.b.j(m3.n.f8150j.c(jVarD.f8080d)));
        }
        for (N3.b bVar4 : C0691d.f8059a) {
            a(N3.b.j(new N3.c("kotlin.jvm.internal." + bVar4.i().b() + "CompanionObject")), bVar4.d(N3.h.f1846b));
        }
        for (int i5 = 0; i5 < 23; i5++) {
            a(N3.b.j(new N3.c(A3.f.l(i5, "kotlin.jvm.functions.Function"))), new N3.b(m3.n.f8150j, N3.f.e("Function" + i5)));
            b(new N3.c(f8249b + i5), f8253g);
        }
        for (int i6 = 0; i6 < 22; i6++) {
            EnumC0700e enumC0700e5 = EnumC0700e.f8184j;
            b(new N3.c((enumC0700e5.f8186d.f1834a.toString() + '.' + enumC0700e5.f8187e) + i6), f8253g);
        }
        N3.c cVarG17 = m3.m.f8117b.g();
        AbstractC0219i.d("nothing.toSafe()", cVarG17);
        b(cVarG17, d(Void.class));
    }

    public static void a(N3.b bVar, N3.b bVar2) {
        N3.e eVarI = bVar.b().i();
        AbstractC0219i.d("javaClassId.asSingleFqName().toUnsafe()", eVarI);
        f8254h.put(eVarI, bVar2);
        b(bVar2.b(), bVar);
    }

    public static void b(N3.c cVar, N3.b bVar) {
        N3.e eVarI = cVar.i();
        AbstractC0219i.d("kotlinFqNameUnsafe.toUnsafe()", eVarI);
        f8255i.put(eVarI, bVar);
    }

    public static void c(Class cls, N3.e eVar) {
        N3.c cVarG = eVar.g();
        AbstractC0219i.d("kotlinFqName.toSafe()", cVarG);
        a(d(cls), N3.b.j(cVarG));
    }

    public static N3.b d(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        return declaringClass == null ? N3.b.j(new N3.c(cls.getCanonicalName())) : d(declaringClass).d(N3.f.e(cls.getSimpleName()));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e(N3.e r11, java.lang.String r12) {
        /*
            r0 = 0
            java.lang.String r11 = r11.f1838a
            if (r11 == 0) goto Lc3
            java.lang.String r1 = ""
            java.lang.String r11 = p4.h.p0(r11, r12, r1)
            int r12 = r11.length()
            r1 = 0
            if (r12 <= 0) goto Lc2
            int r12 = r11.length()
            r2 = 48
            if (r12 <= 0) goto L26
            char r12 = r11.charAt(r1)
            boolean r12 = e1.AbstractC0415a.i(r12, r2, r1)
            if (r12 == 0) goto L26
            goto Lc2
        L26:
            f3.c r12 = new f3.c
            r3 = 2
            r4 = 36
            r5 = 1
            r12.<init>(r3, r4, r5)
            r6 = 10
            boolean r12 = r12.l(r6)
            if (r12 == 0) goto La9
            int r12 = r11.length()
            r3 = 1
            if (r12 != 0) goto L40
            goto L9d
        L40:
            char r4 = r11.charAt(r1)
            if (r4 >= r2) goto L48
            r2 = -1
            goto L4d
        L48:
            if (r4 != r2) goto L4c
            r2 = r1
            goto L4d
        L4c:
            r2 = r3
        L4d:
            r5 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r2 >= 0) goto L65
            if (r12 != r3) goto L55
            goto L9d
        L55:
            r2 = 45
            if (r4 != r2) goto L5e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r3
        L5c:
            r4 = r2
            goto L67
        L5e:
            r2 = 43
            if (r4 != r2) goto L9d
            r4 = r1
            r2 = r3
            goto L67
        L65:
            r2 = r1
            goto L5c
        L67:
            r6 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r7 = r1
            r8 = r6
        L6c:
            if (r2 >= r12) goto L8f
            char r9 = r11.charAt(r2)
            r10 = 10
            int r9 = java.lang.Character.digit(r9, r10)
            if (r9 >= 0) goto L7b
            goto L9d
        L7b:
            if (r7 >= r8) goto L84
            if (r8 != r6) goto L9d
            int r8 = r5 / 10
            if (r7 >= r8) goto L84
            goto L9d
        L84:
            int r7 = r7 * 10
            int r10 = r5 + r9
            if (r7 >= r10) goto L8b
            goto L9d
        L8b:
            int r7 = r7 - r9
            int r2 = r2 + 1
            goto L6c
        L8f:
            if (r4 == 0) goto L97
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
        L95:
            r0 = r11
            goto L9d
        L97:
            int r11 = -r7
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L95
        L9d:
            if (r0 == 0) goto La8
            int r11 = r0.intValue()
            r12 = 23
            if (r11 < r12) goto La8
            r1 = r3
        La8:
            return r1
        La9:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "radix 10 was not in valid range "
            r12.<init>(r0)
            f3.c r0 = new f3.c
            r0.<init>(r3, r4, r5)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        Lc2:
            return r1
        Lc3:
            r11 = 4
            N3.e.a(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.C0721d.e(N3.e, java.lang.String):boolean");
    }

    public static N3.b f(N3.e eVar) {
        boolean zE = e(eVar, f8248a);
        N3.b bVar = f8252e;
        if (zE || e(eVar, f8250c)) {
            return bVar;
        }
        boolean zE2 = e(eVar, f8249b);
        N3.b bVar2 = f8253g;
        return (zE2 || e(eVar, f8251d)) ? bVar2 : (N3.b) f8255i.get(eVar);
    }
}
