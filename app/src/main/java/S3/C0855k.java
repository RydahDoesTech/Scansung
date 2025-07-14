package s3;

import e4.V;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p3.C0770n;
import p3.InterfaceC0752N;
import p3.InterfaceC0759c;
import p3.InterfaceC0761e;
import p3.InterfaceC0765i;
import p3.InterfaceC0766j;
import p3.InterfaceC0768l;
import p3.InterfaceC0776t;
import q3.InterfaceC0798h;

/* renamed from: s3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0855k extends AbstractC0866v implements InterfaceC0765i {

    /* renamed from: G, reason: collision with root package name */
    public final boolean f8828G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0855k(InterfaceC0761e interfaceC0761e, InterfaceC0765i interfaceC0765i, InterfaceC0798h interfaceC0798h, boolean z4, int i5, InterfaceC0752N interfaceC0752N) {
        super(i5, N3.h.f1849e, interfaceC0761e, interfaceC0765i, interfaceC0752N, interfaceC0798h);
        if (interfaceC0761e == null) {
            H0(0);
            throw null;
        }
        if (interfaceC0798h == null) {
            H0(1);
            throw null;
        }
        if (i5 == 0) {
            H0(2);
            throw null;
        }
        if (interfaceC0752N == null) {
            H0(3);
            throw null;
        }
        this.f8828G = z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void H0(int r8) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C0855k.H0(int):void");
    }

    @Override // s3.AbstractC0866v, p3.InterfaceC0759c
    public final void M(Collection collection) {
        if (collection != null) {
            return;
        }
        H0(22);
        throw null;
    }

    @Override // s3.AbstractC0866v, p3.InterfaceC0766j
    public final Object U(InterfaceC0768l interfaceC0768l, Object obj) {
        return interfaceC0768l.A(this, obj);
    }

    @Override // p3.InterfaceC0765i
    public final InterfaceC0761e X() {
        InterfaceC0761e interfaceC0761eL = l();
        if (interfaceC0761eL != null) {
            return interfaceC0761eL;
        }
        H0(18);
        throw null;
    }

    @Override // s3.AbstractC0866v
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public C0855k Q0(int i5, N3.f fVar, InterfaceC0766j interfaceC0766j, InterfaceC0776t interfaceC0776t, InterfaceC0752N interfaceC0752N, InterfaceC0798h interfaceC0798h) {
        if (interfaceC0766j == null) {
            H0(23);
            throw null;
        }
        if (i5 == 0) {
            H0(24);
            throw null;
        }
        if (interfaceC0798h == null) {
            H0(25);
            throw null;
        }
        if (i5 == 1 || i5 == 4) {
            return new C0855k((InterfaceC0761e) interfaceC0766j, this, interfaceC0798h, this.f8828G, 1, interfaceC0752N);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC0766j + "\nkind: " + g4.f.f(i5));
    }

    @Override // s3.AbstractC0866v, p3.InterfaceC0759c
    public final InterfaceC0759c a0(InterfaceC0761e interfaceC0761e, int i5, C0770n c0770n) {
        return (C0855k) O0(interfaceC0761e, i5, c0770n);
    }

    @Override // s3.AbstractC0860p, p3.InterfaceC0766j
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0761e l() {
        InterfaceC0761e interfaceC0761e = (InterfaceC0761e) super.l();
        if (interfaceC0761e != null) {
            return interfaceC0761e;
        }
        H0(17);
        throw null;
    }

    @Override // s3.AbstractC0866v, s3.AbstractC0860p, s3.AbstractC0859o, p3.InterfaceC0766j, p3.InterfaceC0763g
    /* renamed from: b1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C0855k a() {
        C0855k c0855k = (C0855k) super.a();
        if (c0855k != null) {
            return c0855k;
        }
        H0(19);
        throw null;
    }

    public final void c1(List list, C0770n c0770n) {
        if (list == null) {
            H0(13);
            throw null;
        }
        if (c0770n != null) {
            d1(list, c0770n, l().r());
        } else {
            H0(14);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d1(java.util.List r12, p3.C0770n r13, java.util.List r14) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L62
            if (r13 == 0) goto L5c
            if (r14 == 0) goto L56
            p3.e r1 = r11.l()
            boolean r2 = r1.A()
            if (r2 == 0) goto L21
            p3.j r1 = r1.l()
            boolean r2 = r1 instanceof p3.InterfaceC0761e
            if (r2 == 0) goto L21
            p3.e r1 = (p3.InterfaceC0761e) r1
            s3.w r1 = r1.G0()
            r4 = r1
            goto L22
        L21:
            r4 = r0
        L22:
            p3.e r1 = r11.l()
            java.util.List r2 = r1.r0()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L3e
            java.util.List r1 = r1.r0()
            if (r1 == 0) goto L38
        L36:
            r5 = r1
            goto L45
        L38:
            r11 = 15
            H0(r11)
            throw r0
        L3e:
            java.util.List r1 = java.util.Collections.emptyList()
            if (r1 == 0) goto L50
            goto L36
        L45:
            r3 = 0
            r8 = 0
            r9 = 1
            r2 = r11
            r6 = r14
            r7 = r12
            r10 = r13
            r2.T0(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L50:
            r11 = 16
            H0(r11)
            throw r0
        L56:
            r11 = 12
            H0(r11)
            throw r0
        L5c:
            r11 = 11
            H0(r11)
            throw r0
        L62:
            r11 = 10
            H0(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C0855k.d1(java.util.List, p3.n, java.util.List):void");
    }

    @Override // s3.AbstractC0866v, p3.InterfaceC0776t, p3.InterfaceC0754P
    /* renamed from: e1, reason: merged with bridge method [inline-methods] */
    public final C0855k c(V v2) {
        if (v2 != null) {
            return (C0855k) super.c(v2);
        }
        H0(20);
        throw null;
    }

    @Override // s3.AbstractC0866v, p3.InterfaceC0759c, p3.InterfaceC0758b
    public final Collection p() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet != null) {
            return setEmptySet;
        }
        H0(21);
        throw null;
    }
}
