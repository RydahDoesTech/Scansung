package F3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import e4.AbstractC0420c;
import e4.AbstractC0434q;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.C0421d;
import e4.Z;
import java.util.ArrayList;
import java.util.Collection;
import p3.InterfaceC0758b;
import p3.InterfaceC0759c;
import y3.EnumC0932a;

/* loaded from: classes.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static F3.c c(e4.AbstractC0442z r16, C3.q r17, int r18, int r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.d.c(e4.z, C3.q, int, int, boolean, boolean):F3.c");
    }

    public static A1.e d(Z z4, C3.q qVar, int i5, boolean z5) {
        AbstractC0438v abstractC0438vJ;
        Object objA = null;
        if (AbstractC0420c.i(z4)) {
            return new A1.e(1, (Object) null);
        }
        if (!(z4 instanceof AbstractC0434q)) {
            if (!(z4 instanceof AbstractC0442z)) {
                throw new O2.d();
            }
            c cVarC = c((AbstractC0442z) z4, qVar, i5, 3, false, z5);
            boolean z6 = cVarC.f632a;
            Z zA = (AbstractC0442z) cVarC.f634c;
            if (z6) {
                zA = AbstractC0420c.A(z4, zA);
            }
            return new A1.e(cVarC.f633b, zA);
        }
        boolean z7 = z4 instanceof D3.g;
        AbstractC0434q abstractC0434q = (AbstractC0434q) z4;
        c cVarC2 = c(abstractC0434q.f6693e, qVar, i5, 1, z7, z5);
        c cVarC3 = c(abstractC0434q.f, qVar, i5, 2, z7, z5);
        AbstractC0442z abstractC0442z = (AbstractC0442z) cVarC3.f634c;
        AbstractC0442z abstractC0442z2 = (AbstractC0442z) cVarC2.f634c;
        if (abstractC0442z2 != null || abstractC0442z != null) {
            if (cVarC2.f632a || cVarC3.f632a) {
                if (abstractC0442z != null) {
                    if (abstractC0442z2 == null) {
                        abstractC0442z2 = abstractC0442z;
                    }
                    abstractC0438vJ = C0421d.j(abstractC0442z2, abstractC0442z);
                } else {
                    AbstractC0219i.b(abstractC0442z2);
                    abstractC0438vJ = abstractC0442z2;
                }
                objA = AbstractC0420c.A(z4, abstractC0438vJ);
            } else {
                AbstractC0442z abstractC0442z3 = abstractC0434q.f;
                AbstractC0442z abstractC0442z4 = abstractC0434q.f6693e;
                AbstractC0442z abstractC0442z5 = abstractC0442z2;
                if (z7) {
                    AbstractC0442z abstractC0442z6 = abstractC0442z2;
                    if (abstractC0442z2 == null) {
                        abstractC0442z6 = abstractC0442z4;
                    }
                    if (abstractC0442z == null) {
                        abstractC0442z = abstractC0442z3;
                    }
                    objA = new D3.g(abstractC0442z6, abstractC0442z);
                } else {
                    if (abstractC0442z2 == null) {
                        abstractC0442z5 = abstractC0442z4;
                    }
                    if (abstractC0442z == null) {
                        abstractC0442z = abstractC0442z3;
                    }
                    objA = C0421d.j(abstractC0442z5, abstractC0442z);
                }
            }
        }
        return new A1.e(cVarC2.f633b, objA);
    }

    public AbstractC0438v a(A3.a aVar, InterfaceC0758b interfaceC0758b, boolean z4, B3.g gVar, EnumC0932a enumC0932a, q qVar, boolean z5, InterfaceC0107b interfaceC0107b) {
        p pVar = new p(interfaceC0758b, z4, gVar, enumC0932a, false);
        AbstractC0438v abstractC0438v = (AbstractC0438v) interfaceC0107b.d(aVar);
        Collection<InterfaceC0759c> collectionP = aVar.p();
        AbstractC0219i.d("overriddenDescriptors", collectionP);
        ArrayList arrayList = new ArrayList(P2.o.l0(collectionP));
        for (InterfaceC0759c interfaceC0759c : collectionP) {
            AbstractC0219i.d("it", interfaceC0759c);
            arrayList.add((AbstractC0438v) interfaceC0107b.d(interfaceC0759c));
        }
        return b(pVar, abstractC0438v, arrayList, qVar, z5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0425  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e4.AbstractC0438v b(F3.p r30, e4.AbstractC0438v r31, java.util.List r32, F3.q r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.d.b(F3.p, e4.v, java.util.List, F3.q, boolean):e4.v");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x028f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f6  */
    /* JADX WARN: Type inference failed for: r24v0, types: [F3.d] */
    /* JADX WARN: Type inference failed for: r3v2, types: [p3.b, p3.c, p3.j] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [A3.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList e(B3.g r25, java.util.SequencedCollection r26) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.d.e(B3.g, java.util.SequencedCollection):java.util.ArrayList");
    }
}
