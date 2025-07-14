package e4;

import m3.AbstractC0695h;
import p3.InterfaceC0761e;

/* renamed from: e4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0419b extends AbstractC0424g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0419b(d4.o oVar) {
        super(oVar);
        if (oVar != null) {
        } else {
            m(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void m(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = r1
            goto L18
        L17:
            r5 = r4
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.AbstractC0419b.m(int):void");
    }

    @Override // e4.AbstractC0424g
    public final AbstractC0438v c() {
        InterfaceC0761e interfaceC0761eI = i();
        if (interfaceC0761eI == null) {
            AbstractC0695h.a(107);
            throw null;
        }
        N3.f fVar = AbstractC0695h.f8064e;
        if (AbstractC0695h.b(interfaceC0761eI, m3.m.f8115a) || AbstractC0695h.b(interfaceC0761eI, m3.m.f8117b)) {
            return null;
        }
        return g().e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        r4 = true;
     */
    @Override // e4.AbstractC0424g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(p3.InterfaceC0763g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p3.InterfaceC0761e
            r1 = 0
            if (r0 == 0) goto L73
            p3.e r4 = r4.i()
            java.lang.String r0 = "first"
            b3.AbstractC0219i.e(r0, r4)
            N3.f r0 = r4.getName()
            N3.f r2 = r5.getName()
            boolean r0 = b3.AbstractC0219i.a(r0, r2)
            r2 = 1
            if (r0 != 0) goto L1f
        L1d:
            r4 = r1
            goto L70
        L1f:
            p3.j r4 = r4.l()
            p3.j r5 = r5.l()
        L27:
            if (r4 == 0) goto L6f
            if (r5 == 0) goto L6f
            boolean r0 = r4 instanceof p3.InterfaceC0781y
            if (r0 == 0) goto L32
            boolean r4 = r5 instanceof p3.InterfaceC0781y
            goto L70
        L32:
            boolean r0 = r5 instanceof p3.InterfaceC0781y
            if (r0 == 0) goto L37
            goto L1d
        L37:
            boolean r0 = r4 instanceof p3.InterfaceC0742D
            if (r0 == 0) goto L52
            boolean r0 = r5 instanceof p3.InterfaceC0742D
            if (r0 == 0) goto L1d
            p3.D r4 = (p3.InterfaceC0742D) r4
            s3.D r4 = (s3.AbstractC0828D) r4
            p3.D r5 = (p3.InterfaceC0742D) r5
            s3.D r5 = (s3.AbstractC0828D) r5
            N3.c r4 = r4.f8745h
            N3.c r5 = r5.f8745h
            boolean r4 = b3.AbstractC0219i.a(r4, r5)
            if (r4 == 0) goto L1d
            goto L6f
        L52:
            boolean r0 = r5 instanceof p3.InterfaceC0742D
            if (r0 == 0) goto L57
            goto L1d
        L57:
            N3.f r0 = r4.getName()
            N3.f r3 = r5.getName()
            boolean r0 = b3.AbstractC0219i.a(r0, r3)
            if (r0 != 0) goto L66
            goto L1d
        L66:
            p3.j r4 = r4.l()
            p3.j r5 = r5.l()
            goto L27
        L6f:
            r4 = r2
        L70:
            if (r4 == 0) goto L73
            r1 = r2
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.AbstractC0419b.f(p3.g):boolean");
    }

    @Override // e4.J
    public final AbstractC0695h g() {
        AbstractC0695h abstractC0695hE = U3.f.e(i());
        if (abstractC0695hE != null) {
            return abstractC0695hE;
        }
        m(1);
        throw null;
    }

    @Override // e4.J
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceC0761e i();
}
