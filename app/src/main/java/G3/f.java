package G3;

import P2.B;
import b3.AbstractC0219i;
import java.util.Set;
import u3.C0881c;
import v3.AbstractC0897d;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f752b = V1.a.l0(H3.a.CLASS);

    /* renamed from: c, reason: collision with root package name */
    public static final Set f753c = B.u0(H3.a.FILE_FACADE, H3.a.MULTIFILE_CLASS_PART);

    /* renamed from: d, reason: collision with root package name */
    public static final M3.f f754d;

    /* renamed from: e, reason: collision with root package name */
    public static final M3.f f755e;

    /* renamed from: a, reason: collision with root package name */
    public a4.i f756a;

    static {
        new M3.f(new int[]{1, 1, 2}, false);
        f754d = new M3.f(new int[]{1, 1, 11}, false);
        f755e = new M3.f(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final c4.p a(p3.InterfaceC0742D r13, u3.C0881c r14) {
        /*
            r12 = this;
            java.lang.String r4 = "Could not read data from "
            java.lang.String r0 = "descriptor"
            b3.AbstractC0219i.e(r0, r13)
            java.lang.String r0 = "kotlinClass"
            b3.AbstractC0219i.e(r0, r14)
            H3.b r0 = r14.f9188b
            java.io.Serializable r5 = r0.f
            java.lang.String[] r5 = (java.lang.String[]) r5
            if (r5 != 0) goto L18
            java.io.Serializable r5 = r0.f827g
            java.lang.String[] r5 = (java.lang.String[]) r5
        L18:
            r6 = 0
            if (r5 == 0) goto L28
            java.lang.Object r7 = r0.f825d
            H3.a r7 = (H3.a) r7
            java.util.Set r8 = G3.f.f753c
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L28
            goto L29
        L28:
            r5 = r6
        L29:
            if (r5 != 0) goto L2c
            return r6
        L2c:
            java.lang.Object r7 = r0.f826e
            M3.f r7 = (M3.f) r7
            java.io.Serializable r0 = r0.f828h
            java.lang.String[] r0 = (java.lang.String[]) r0
            if (r0 != 0) goto L37
            return r6
        L37:
            O2.f r0 = M3.h.h(r5, r0)     // Catch: java.lang.Throwable -> L3c O3.C0086s -> L3e
            goto L73
        L3c:
            r0 = move-exception
            goto L56
        L3e:
            r0 = move-exception
            r5 = r0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = r14.a()     // Catch: java.lang.Throwable -> L3c
            r8.append(r4)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L3c
            throw r0     // Catch: java.lang.Throwable -> L3c
        L56:
            a4.i r4 = r12.c()
            a4.j r4 = r4.f3039c
            r4.getClass()
            a4.i r4 = r12.c()
            java.lang.String r5 = "<this>"
            a4.j r4 = r4.f3039c
            b3.AbstractC0219i.e(r5, r4)
            M3.f r4 = M3.f.f1821g
            boolean r4 = r7.b(r4)
            if (r4 != 0) goto Lb6
            r0 = r6
        L73:
            if (r0 != 0) goto L76
            return r6
        L76:
            java.lang.Object r4 = r0.f2006d
            M3.g r4 = (M3.g) r4
            java.lang.Object r0 = r0.f2007e
            I3.C r0 = (I3.C) r0
            G3.h r6 = new G3.h
            r12.d(r14)
            r12.e(r14)
            int r5 = r12.b(r14)
            r6.<init>(r14, r0, r4, r5)
            c4.p r10 = new c4.p
            a4.i r8 = r12.c()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "scope for "
            r1.<init>(r3)
            r1.append(r6)
            java.lang.String r3 = " in "
            r1.append(r3)
            r1.append(r13)
            java.lang.String r9 = r1.toString()
            G3.e r11 = G3.e.f751d
            r1 = r10
            r2 = r13
            r3 = r0
            r5 = r7
            r7 = r8
            r8 = r9
            r9 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
        Lb6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.f.a(p3.D, u3.c):c4.p");
    }

    public final int b(C0881c c0881c) {
        c().f3039c.getClass();
        int i5 = c0881c.f9188b.f824c;
        if (((i5 & 64) != 0) && (i5 & 32) == 0) {
            return 2;
        }
        return ((i5 & 16) == 0 || (i5 & 32) != 0) ? 1 : 3;
    }

    public final a4.i c() {
        a4.i iVar = this.f756a;
        if (iVar != null) {
            return iVar;
        }
        AbstractC0219i.g("components");
        throw null;
    }

    public final a4.n d(C0881c c0881c) {
        c().f3039c.getClass();
        M3.f fVar = (M3.f) c0881c.f9188b.f826e;
        AbstractC0219i.e("<this>", c().f3039c);
        M3.f fVar2 = M3.f.f1821g;
        if (fVar.b(fVar2)) {
            return null;
        }
        M3.f fVar3 = (M3.f) c0881c.f9188b.f826e;
        AbstractC0219i.e("<this>", c().f3039c);
        AbstractC0219i.e("<this>", c().f3039c);
        fVar2.getClass();
        M3.f fVar4 = fVar3.f ? fVar2 : M3.f.f1822h;
        fVar4.getClass();
        int i5 = fVar2.f1653b;
        int i6 = fVar4.f1653b;
        return new a4.n(fVar3, fVar2, fVar2, (i6 <= i5 && (i6 < i5 || fVar4.f1654c <= fVar2.f1654c)) ? fVar2 : fVar4, c0881c.a(), AbstractC0897d.a(c0881c.f9187a));
    }

    public final boolean e(C0881c c0881c) {
        c().f3039c.getClass();
        c().f3039c.getClass();
        H3.b bVar = c0881c.f9188b;
        return (bVar.f824c & 2) != 0 && ((M3.f) bVar.f826e).equals(f754d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a4.d f(u3.C0881c r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Could not read data from "
            H3.b r1 = r7.f9188b
            java.io.Serializable r2 = r1.f
            java.lang.String[] r2 = (java.lang.String[]) r2
            if (r2 != 0) goto Le
            java.io.Serializable r2 = r1.f827g
            java.lang.String[] r2 = (java.lang.String[]) r2
        Le:
            r3 = 0
            if (r2 == 0) goto L1e
            java.lang.Object r4 = r1.f825d
            H3.a r4 = (H3.a) r4
            java.util.Set r5 = G3.f.f752b
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L1e
            goto L1f
        L1e:
            r2 = r3
        L1f:
            if (r2 != 0) goto L22
            return r3
        L22:
            java.lang.Object r4 = r1.f826e
            M3.f r4 = (M3.f) r4
            java.io.Serializable r1 = r1.f828h
            java.lang.String[] r1 = (java.lang.String[]) r1
            if (r1 != 0) goto L2d
            return r3
        L2d:
            O2.f r0 = M3.h.f(r2, r1)     // Catch: java.lang.Throwable -> L32 O3.C0086s -> L34
            goto L68
        L32:
            r0 = move-exception
            goto L4b
        L34:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r7.a()     // Catch: java.lang.Throwable -> L32
            r5.append(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L32
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L4b:
            a4.i r1 = r6.c()
            a4.j r1 = r1.f3039c
            r1.getClass()
            a4.i r1 = r6.c()
            java.lang.String r2 = "<this>"
            a4.j r1 = r1.f3039c
            b3.AbstractC0219i.e(r2, r1)
            M3.f r1 = M3.f.f1821g
            boolean r1 = r4.b(r1)
            if (r1 != 0) goto L88
            r0 = r3
        L68:
            if (r0 != 0) goto L6b
            return r3
        L6b:
            java.lang.Object r1 = r0.f2006d
            M3.g r1 = (M3.g) r1
            java.lang.Object r0 = r0.f2007e
            I3.j r0 = (I3.C0028j) r0
            G3.o r2 = new G3.o
            r6.d(r7)
            r6.e(r7)
            int r6 = r6.b(r7)
            r2.<init>(r7, r6)
            a4.d r6 = new a4.d
            r6.<init>(r1, r0, r4, r2)
            return r6
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.f.f(u3.c):a4.d");
    }
}
