package y3;

import com.google.firebase.messaging.C0388e;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final N3.c f9422a;

    /* renamed from: b, reason: collision with root package name */
    public static final N3.c[] f9423b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0388e f9424c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f9425d;

    static {
        N3.c cVar = new N3.c("org.jspecify.nullness");
        N3.c cVar2 = new N3.c("org.jspecify.annotations");
        f9422a = cVar2;
        N3.c cVar3 = new N3.c("io.reactivex.rxjava3.annotations");
        N3.c cVar4 = new N3.c("org.checkerframework.checker.nullness.compatqual");
        String strB = cVar3.b();
        f9423b = new N3.c[]{new N3.c(strB.concat(".Nullable")), new N3.c(strB.concat(".NonNull"))};
        N3.c cVar5 = new N3.c("org.jetbrains.annotations");
        r rVar = r.f9426d;
        O2.f fVar = new O2.f(cVar5, rVar);
        O2.f fVar2 = new O2.f(new N3.c("androidx.annotation"), rVar);
        O2.f fVar3 = new O2.f(new N3.c("android.support.annotation"), rVar);
        O2.f fVar4 = new O2.f(new N3.c("android.annotation"), rVar);
        O2.f fVar5 = new O2.f(new N3.c("com.android.annotations"), rVar);
        O2.f fVar6 = new O2.f(new N3.c("org.eclipse.jdt.annotation"), rVar);
        O2.f fVar7 = new O2.f(new N3.c("org.checkerframework.checker.nullness.qual"), rVar);
        O2.f fVar8 = new O2.f(cVar4, rVar);
        O2.f fVar9 = new O2.f(new N3.c("javax.annotation"), rVar);
        O2.f fVar10 = new O2.f(new N3.c("edu.umd.cs.findbugs.annotations"), rVar);
        O2.f fVar11 = new O2.f(new N3.c("io.reactivex.annotations"), rVar);
        N3.c cVar6 = new N3.c("androidx.annotation.RecentlyNullable");
        EnumC0928B enumC0928B = EnumC0928B.WARN;
        O2.f fVar12 = new O2.f(cVar6, new r(enumC0928B, 4));
        O2.f fVar13 = new O2.f(new N3.c("androidx.annotation.RecentlyNonNull"), new r(enumC0928B, 4));
        O2.f fVar14 = new O2.f(new N3.c("lombok"), rVar);
        O2.b bVar = new O2.b(9, 0);
        EnumC0928B enumC0928B2 = EnumC0928B.STRICT;
        f9424c = new C0388e(P2.z.i0(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12, fVar13, fVar14, new O2.f(cVar, new r(enumC0928B, bVar, enumC0928B2)), new O2.f(cVar2, new r(enumC0928B, new O2.b(9, 0), enumC0928B2)), new O2.f(cVar3, new r(enumC0928B, new O2.b(8, 0), enumC0928B2))));
        f9425d = new r(enumC0928B, 4);
    }
}
