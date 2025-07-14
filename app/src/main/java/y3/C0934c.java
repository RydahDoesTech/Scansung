package y3;

import b3.AbstractC0219i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p3.InterfaceC0761e;
import q3.InterfaceC0792b;
import q3.InterfaceC0798h;

/* renamed from: y3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0934c {

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f9395c;

    /* renamed from: a, reason: collision with root package name */
    public final t f9396a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f9397b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC0932a enumC0932a : EnumC0932a.values()) {
            String str = enumC0932a.f9388d;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, enumC0932a);
            }
        }
        f9395c = linkedHashMap;
    }

    public C0934c(t tVar) {
        AbstractC0219i.e("javaTypeEnhancementState", tVar);
        this.f9396a = tVar;
        this.f9397b = new ConcurrentHashMap();
    }

    public static ArrayList a(Object obj, boolean z4) {
        InterfaceC0792b interfaceC0792b = (InterfaceC0792b) obj;
        AbstractC0219i.e("<this>", interfaceC0792b);
        Map mapB = interfaceC0792b.b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapB.entrySet()) {
            P2.s.n0(arrayList, (!z4 || AbstractC0219i.a((N3.f) entry.getKey(), x.f9442b)) ? j((S3.g) entry.getValue()) : P2.u.f2163d);
        }
        return arrayList;
    }

    public static Object c(Object obj, N3.c cVar) {
        for (Object obj2 : e(obj)) {
            if (AbstractC0219i.a(d(obj2), cVar)) {
                return obj2;
            }
        }
        return null;
    }

    public static N3.c d(Object obj) {
        InterfaceC0792b interfaceC0792b = (InterfaceC0792b) obj;
        AbstractC0219i.e("<this>", interfaceC0792b);
        return interfaceC0792b.a();
    }

    public static Iterable e(Object obj) {
        InterfaceC0798h interfaceC0798hS;
        InterfaceC0792b interfaceC0792b = (InterfaceC0792b) obj;
        AbstractC0219i.e("<this>", interfaceC0792b);
        InterfaceC0761e interfaceC0761eD = U3.f.d(interfaceC0792b);
        return (interfaceC0761eD == null || (interfaceC0798hS = interfaceC0761eD.s()) == null) ? P2.u.f2163d : interfaceC0798hS;
    }

    public static boolean f(Object obj, N3.c cVar) {
        Iterable iterableE = e(obj);
        if ((iterableE instanceof Collection) && ((Collection) iterableE).isEmpty()) {
            return false;
        }
        Iterator it = iterableE.iterator();
        while (it.hasNext()) {
            if (AbstractC0219i.a(d(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    public static List j(S3.g gVar) {
        if (!(gVar instanceof S3.b)) {
            return gVar instanceof S3.i ? g3.y.N(((S3.i) gVar).f2534c.c()) : P2.u.f2163d;
        }
        Iterable iterable = (Iterable) ((S3.b) gVar).f2531a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            P2.s.n0(arrayList, j((S3.g) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0129  */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final y3.u b(y3.u r19, q3.InterfaceC0798h r20) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.C0934c.b(y3.u, q3.h):y3.u");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        if (r9.equals("ALWAYS") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        if (r9.equals("UNKNOWN") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
    
        if (r9.equals("NEVER") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
    
        if (r9.equals("MAYBE") == false) goto L45;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final F3.i g(java.lang.Object r9, boolean r10) {
        /*
            r8 = this;
            N3.c r0 = d(r9)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            y3.t r8 = r8.f9396a
            r8.getClass()
            y3.s r8 = y3.s.f9430l
            java.lang.Object r8 = r8.d(r0)
            y3.B r8 = (y3.EnumC0928B) r8
            r8.getClass()
            y3.B r2 = y3.EnumC0928B.IGNORE
            if (r8 != r2) goto L1d
            return r1
        L1d:
            java.util.List r2 = y3.y.f9461g
            boolean r2 = r2.contains(r0)
            F3.h r3 = F3.h.f644e
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L2b
            goto Lc6
        L2b:
            java.util.List r2 = y3.y.f9464j
            boolean r2 = r2.contains(r0)
            F3.h r6 = F3.h.f
            if (r2 == 0) goto L38
        L35:
            r3 = r6
            goto Lc6
        L38:
            N3.c r2 = y3.y.f9456a
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L42
            r2 = r4
            goto L48
        L42:
            N3.c r2 = y3.y.f9459d
            boolean r2 = r0.equals(r2)
        L48:
            if (r2 == 0) goto L4c
            goto Lc6
        L4c:
            N3.c r2 = y3.y.f9457b
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L56
            r2 = r4
            goto L5c
        L56:
            N3.c r2 = y3.y.f9460e
            boolean r2 = r0.equals(r2)
        L5c:
            F3.h r7 = F3.h.f643d
            if (r2 == 0) goto L62
        L60:
            r3 = r7
            goto Lc6
        L62:
            N3.c r2 = y3.y.f9462h
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto La2
            java.util.ArrayList r9 = a(r9, r5)
            java.lang.Object r9 = P2.m.v0(r9)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L35
            int r0 = r9.hashCode()
            switch(r0) {
                case 73135176: goto L99;
                case 74175084: goto L90;
                case 433141802: goto L87;
                case 1933739535: goto L7e;
                default: goto L7d;
            }
        L7d:
            goto La1
        L7e:
            java.lang.String r0 = "ALWAYS"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto La1
            goto L35
        L87:
            java.lang.String r0 = "UNKNOWN"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L60
            goto La1
        L90:
            java.lang.String r0 = "NEVER"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto Lc6
            goto La1
        L99:
            java.lang.String r0 = "MAYBE"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto Lc6
        La1:
            return r1
        La2:
            N3.c r9 = y3.y.f9465k
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto Lab
            goto Lc6
        Lab:
            N3.c r9 = y3.y.f9466l
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto Lb4
            goto L35
        Lb4:
            N3.c r9 = y3.y.n
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto Lbe
            goto L35
        Lbe:
            N3.c r9 = y3.y.f9467m
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto Ld9
        Lc6:
            F3.i r9 = new F3.i
            y3.B r0 = y3.EnumC0928B.WARN
            if (r8 != r0) goto Lce
            r8 = r4
            goto Lcf
        Lce:
            r8 = r5
        Lcf:
            if (r8 != 0) goto Ld5
            if (r10 == 0) goto Ld4
            goto Ld5
        Ld4:
            r4 = r5
        Ld5:
            r9.<init>(r3, r4)
            return r9
        Ld9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.C0934c.g(java.lang.Object, boolean):F3.i");
    }

    public final EnumC0928B h(Object obj) {
        String str;
        t tVar = this.f9396a;
        EnumC0928B enumC0928B = (EnumC0928B) tVar.f9432a.f9437c.get(d(obj));
        if (enumC0928B != null) {
            return enumC0928B;
        }
        Object objC = c(obj, AbstractC0933b.f9392d);
        if (objC == null || (str = (String) P2.m.v0(a(objC, false))) == null) {
            return null;
        }
        EnumC0928B enumC0928B2 = tVar.f9432a.f9436b;
        if (enumC0928B2 != null) {
            return enumC0928B2;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return EnumC0928B.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return EnumC0928B.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return EnumC0928B.WARN;
        }
        return null;
    }

    public final Object i(Object obj) {
        Object objI;
        AbstractC0219i.e("annotation", obj);
        if (this.f9396a.f9432a.f9438d) {
            return null;
        }
        if (P2.m.q0(AbstractC0933b.f9394g, d(obj)) || f(obj, AbstractC0933b.f9390b)) {
            return obj;
        }
        if (!f(obj, AbstractC0933b.f9389a)) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f9397b;
        InterfaceC0761e interfaceC0761eD = U3.f.d((InterfaceC0792b) obj);
        AbstractC0219i.b(interfaceC0761eD);
        Object obj2 = concurrentHashMap.get(interfaceC0761eD);
        if (obj2 != null) {
            return obj2;
        }
        Iterator it = e(obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                objI = null;
                break;
            }
            objI = i(it.next());
            if (objI != null) {
                break;
            }
        }
        if (objI == null) {
            return null;
        }
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(interfaceC0761eD, objI);
        return objPutIfAbsent == null ? objI : objPutIfAbsent;
    }
}
