package d4;

import a3.InterfaceC0106a;

/* loaded from: classes.dex */
public class h implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final l f6410d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0106a f6411e;
    public volatile Object f;

    public h(l lVar, InterfaceC0106a interfaceC0106a) {
        if (lVar == null) {
            b(0);
            throw null;
        }
        this.f = k.f6414d;
        this.f6410d = lVar;
        this.f6411e = interfaceC0106a;
    }

    public static /* synthetic */ void b(int i5) {
        String str = (i5 == 2 || i5 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i5 == 2 || i5 == 3) ? 2 : 3];
        if (i5 == 1) {
            objArr[0] = "computable";
        } else if (i5 == 2 || i5 == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i5 == 2) {
            objArr[1] = "recursionDetected";
        } else if (i5 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i5 != 2 && i5 != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i5 != 2 && i5 != 3) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:16:0x002a, B:18:0x0035, B:20:0x003a, B:22:0x0043, B:23:0x0046, B:27:0x0055, B:29:0x005b, B:31:0x005f, B:32:0x0066, B:33:0x006d, B:34:0x006e, B:35:0x0074, B:24:0x0048), top: B:38:0x0011, inners: #1 }] */
    @Override // a3.InterfaceC0106a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a() throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f
            boolean r1 = r0 instanceof d4.k
            if (r1 != 0) goto La
            n4.k.j(r0)
            return r0
        La:
            d4.l r0 = r5.f6410d
            d4.n r0 = r0.f6419a
            r0.E()
            java.lang.Object r0 = r5.f     // Catch: java.lang.Throwable -> L22
            boolean r1 = r0 instanceof d4.k     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L24
            n4.k.j(r0)     // Catch: java.lang.Throwable -> L22
        L1a:
            d4.l r5 = r5.f6410d
            d4.n r5 = r5.f6419a
            r5.z()
            return r0
        L22:
            r0 = move-exception
            goto L75
        L24:
            d4.k r1 = d4.k.f6415e
            d4.k r2 = d4.k.f
            if (r0 != r1) goto L38
            r5.f = r2     // Catch: java.lang.Throwable -> L22
            r3 = 1
            A1.c r3 = r5.d(r3)     // Catch: java.lang.Throwable -> L22
            boolean r4 = r3.f53e     // Catch: java.lang.Throwable -> L22
            if (r4 != 0) goto L38
            java.lang.Object r0 = r3.f     // Catch: java.lang.Throwable -> L22
            goto L1a
        L38:
            if (r0 != r2) goto L46
            r0 = 0
            A1.c r0 = r5.d(r0)     // Catch: java.lang.Throwable -> L22
            boolean r2 = r0.f53e     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L46
            java.lang.Object r0 = r0.f     // Catch: java.lang.Throwable -> L22
            goto L1a
        L46:
            r5.f = r1     // Catch: java.lang.Throwable -> L22
            a3.a r0 = r5.f6411e     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.a()     // Catch: java.lang.Throwable -> L54
            r5.c(r0)     // Catch: java.lang.Throwable -> L54
            r5.f = r0     // Catch: java.lang.Throwable -> L54
            goto L1a
        L54:
            r0 = move-exception
            boolean r2 = n4.k.h(r0)     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L6e
            java.lang.Object r2 = r5.f     // Catch: java.lang.Throwable -> L22
            if (r2 != r1) goto L66
            n4.j r1 = new n4.j     // Catch: java.lang.Throwable -> L22
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L22
            r5.f = r1     // Catch: java.lang.Throwable -> L22
        L66:
            d4.l r1 = r5.f6410d     // Catch: java.lang.Throwable -> L22
            d4.a r1 = r1.f6420b     // Catch: java.lang.Throwable -> L22
            r1.getClass()     // Catch: java.lang.Throwable -> L22
            throw r0     // Catch: java.lang.Throwable -> L22
        L6e:
            d4.k r1 = d4.k.f6414d     // Catch: java.lang.Throwable -> L22
            r5.f = r1     // Catch: java.lang.Throwable -> L22
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L22
            throw r0     // Catch: java.lang.Throwable -> L22
        L75:
            d4.l r5 = r5.f6410d
            d4.n r5 = r5.f6419a
            r5.z()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.h.a():java.lang.Object");
    }

    public void c(Object obj) {
    }

    public A1.c d(boolean z4) {
        A1.c cVarD = this.f6410d.d("in a lazy value", null);
        if (cVarD != null) {
            return cVarD;
        }
        b(2);
        throw null;
    }
}
