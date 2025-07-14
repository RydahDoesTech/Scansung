package j3;

import I3.C0042y;
import O3.AbstractC0081m;
import a3.InterfaceC0108c;
import b3.AbstractC0217g;
import b3.AbstractC0219i;
import com.idm.fotaagent.restapi.parser.XmlParser;
import com.idm.providers.mo.IDMMoInterface;
import g3.InterfaceC0452b;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o3.C0721d;
import p3.InterfaceC0752N;
import p3.InterfaceC0758b;
import p3.InterfaceC0759c;
import p3.InterfaceC0761e;
import p3.InterfaceC0766j;
import p3.InterfaceC0781y;
import q3.InterfaceC0791a;
import q3.InterfaceC0792b;
import q3.InterfaceC0798h;
import s0.AbstractC0823a;
import s3.C0867w;
import u3.C0879a;
import u3.C0884f;
import v3.AbstractC0897d;
import v3.C0898e;

/* loaded from: classes.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final N3.c f7455a = new N3.c("kotlin.jvm.JvmStatic");

    public static final r a(InterfaceC0452b interfaceC0452b) {
        r rVar = interfaceC0452b instanceof r ? (r) interfaceC0452b : null;
        if (rVar != null) {
            return rVar;
        }
        F fB = b(interfaceC0452b);
        return fB != null ? fB : c(interfaceC0452b);
    }

    public static final F b(Object obj) {
        F f = obj instanceof F ? (F) obj : null;
        if (f != null) {
            return f;
        }
        AbstractC0217g abstractC0217g = obj instanceof AbstractC0217g ? (AbstractC0217g) obj : null;
        InterfaceC0452b interfaceC0452bB = abstractC0217g != null ? abstractC0217g.b() : null;
        if (interfaceC0452bB instanceof F) {
            return (F) interfaceC0452bB;
        }
        return null;
    }

    public static final k0 c(Object obj) {
        k0 k0Var = obj instanceof k0 ? (k0) obj : null;
        if (k0Var != null) {
            return k0Var;
        }
        b3.o oVar = obj instanceof b3.o ? (b3.o) obj : null;
        InterfaceC0452b interfaceC0452bB = oVar != null ? oVar.b() : null;
        if (interfaceC0452bB instanceof k0) {
            return (k0) interfaceC0452bB;
        }
        return null;
    }

    public static final ArrayList d(InterfaceC0791a interfaceC0791a) throws IllegalAccessException, IllegalArgumentException, NegativeArraySizeException, InvocationTargetException {
        List listN;
        AbstractC0219i.e("<this>", interfaceC0791a);
        InterfaceC0798h interfaceC0798hS = interfaceC0791a.s();
        ArrayList arrayList = new ArrayList();
        Iterator it = interfaceC0798hS.iterator();
        while (true) {
            Annotation annotationI = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC0792b interfaceC0792b = (InterfaceC0792b) it.next();
            InterfaceC0752N interfaceC0752NN = interfaceC0792b.n();
            if (interfaceC0752NN instanceof C0879a) {
                annotationI = ((C0879a) interfaceC0752NN).f9185d;
            } else if (interfaceC0752NN instanceof u3.g) {
                v3.s sVar = ((u3.g) interfaceC0752NN).f9194d;
                C0898e c0898e = sVar instanceof C0898e ? (C0898e) sVar : null;
                if (c0898e != null) {
                    annotationI = c0898e.f9246a;
                }
            } else {
                annotationI = i(interfaceC0792b);
            }
            if (annotationI != null) {
                arrayList.add(annotationI);
            }
        }
        if (arrayList.isEmpty()) {
            return arrayList;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (g3.y.z(g3.y.s((Annotation) it2.next())).getSimpleName().equals("Container")) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Annotation annotation = (Annotation) it3.next();
                    Class clsZ = g3.y.z(g3.y.s(annotation));
                    if (!clsZ.getSimpleName().equals("Container") || clsZ.getAnnotation(b3.s.class) == null) {
                        listN = g3.y.N(annotation);
                    } else {
                        Object objInvoke = clsZ.getDeclaredMethod("value", null).invoke(annotation, null);
                        AbstractC0219i.c("null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>", objInvoke);
                        listN = P2.i.i0((Annotation[]) objInvoke);
                    }
                    P2.s.n0(arrayList2, listN);
                }
                return arrayList2;
            }
        }
        return arrayList;
    }

    public static final Object e(Type type) {
        AbstractC0219i.e("type", type);
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (type.equals(Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (type.equals(Character.TYPE)) {
            return (char) 0;
        }
        if (type.equals(Byte.TYPE)) {
            return (byte) 0;
        }
        if (type.equals(Short.TYPE)) {
            return (short) 0;
        }
        if (type.equals(Integer.TYPE)) {
            return 0;
        }
        if (type.equals(Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (type.equals(Long.TYPE)) {
            return 0L;
        }
        if (type.equals(Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (type.equals(Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final InterfaceC0758b f(Class cls, AbstractC0081m abstractC0081m, K3.f fVar, K3.g gVar, K3.a aVar, InterfaceC0108c interfaceC0108c) {
        List list;
        AbstractC0219i.e("moduleAnchor", cls);
        AbstractC0219i.e("proto", abstractC0081m);
        AbstractC0219i.e("nameResolver", fVar);
        AbstractC0219i.e("typeTable", gVar);
        AbstractC0219i.e("metadataVersion", aVar);
        C0884f c0884fA = p0.a(cls);
        if (abstractC0081m instanceof C0042y) {
            list = ((C0042y) abstractC0081m).f1399l;
        } else {
            if (!(abstractC0081m instanceof I3.G)) {
                throw new IllegalStateException(("Unsupported message: " + abstractC0081m).toString());
            }
            list = ((I3.G) abstractC0081m).f1006l;
        }
        List list2 = list;
        a4.i iVar = c0884fA.f9192a;
        InterfaceC0781y interfaceC0781y = iVar.f3038b;
        K3.h hVar = K3.h.f1697a;
        AbstractC0219i.d("typeParameters", list2);
        return (InterfaceC0758b) interfaceC0108c.c(new a4.s(new a4.k(iVar, fVar, interfaceC0781y, gVar, hVar, aVar, null, null, list2)), abstractC0081m);
    }

    public static final C0867w g(InterfaceC0759c interfaceC0759c) {
        AbstractC0219i.e("<this>", interfaceC0759c);
        if (interfaceC0759c.F() == null) {
            return null;
        }
        InterfaceC0766j interfaceC0766jL = interfaceC0759c.l();
        AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", interfaceC0766jL);
        return ((InterfaceC0761e) interfaceC0766jL).G0();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class h(ClassLoader classLoader, N3.b bVar, int i5) {
        String str = C0721d.f8248a;
        N3.e eVarI = bVar.b().i();
        AbstractC0219i.d("kotlinClassId.asSingleFqName().toUnsafe()", eVarI);
        N3.b bVarF = C0721d.f(eVarI);
        if (bVarF != null) {
            bVar = bVarF;
        }
        String strB = bVar.g().b();
        String strB2 = bVar.h().b();
        if (strB.equals("kotlin")) {
            switch (strB2.hashCode()) {
                case -901856463:
                    if (strB2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (strB2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (strB2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (strB2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (strB2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (strB2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (strB2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (strB2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (strB2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i5 > 0) {
            for (int i6 = 0; i6 < i5; i6++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (strB.length() > 0) {
            sb.append(strB.concat(IDMMoInterface.IDM_MO_ROOT_PATH));
        }
        sb.append(p4.h.m0(strB2, '.', '$'));
        if (i5 > 0) {
            sb.append(XmlParser.Polling.POLLING_VERSION_SEPARATOR);
        }
        String string = sb.toString();
        AbstractC0219i.d("StringBuilder().apply(builderAction).toString()", string);
        return AbstractC0823a.e(classLoader, string);
    }

    public static final Annotation i(InterfaceC0792b interfaceC0792b) throws NegativeArraySizeException {
        InterfaceC0761e interfaceC0761eD = U3.f.d(interfaceC0792b);
        Class clsJ = interfaceC0761eD != null ? j(interfaceC0761eD) : null;
        if (clsJ == null) {
            clsJ = null;
        }
        if (clsJ == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = interfaceC0792b.b().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            N3.f fVar = (N3.f) entry.getKey();
            S3.g gVar = (S3.g) entry.getValue();
            ClassLoader classLoader = clsJ.getClassLoader();
            AbstractC0219i.d("annotationClass.classLoader", classLoader);
            Object objK = k(gVar, classLoader);
            O2.f fVar2 = objK != null ? new O2.f(fVar.b(), objK) : null;
            if (fVar2 != null) {
                arrayList.add(fVar2);
            }
        }
        Map mapK0 = P2.z.k0(arrayList);
        Set setKeySet = mapK0.keySet();
        ArrayList arrayList2 = new ArrayList(P2.o.l0(setKeySet));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList2.add(clsJ.getDeclaredMethod((String) it.next(), null));
        }
        return (Annotation) V1.a.s(clsJ, mapK0, arrayList2);
    }

    public static final Class j(InterfaceC0761e interfaceC0761e) {
        AbstractC0219i.e("<this>", interfaceC0761e);
        InterfaceC0752N interfaceC0752NN = interfaceC0761e.n();
        AbstractC0219i.d("source", interfaceC0752NN);
        if (interfaceC0752NN instanceof G3.o) {
            return ((G3.o) interfaceC0752NN).f772d.f9187a;
        }
        if (interfaceC0752NN instanceof u3.g) {
            v3.s sVar = ((u3.g) interfaceC0752NN).f9194d;
            AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass", sVar);
            return ((v3.o) sVar).f9258a;
        }
        N3.b bVarF = U3.f.f(interfaceC0761e);
        if (bVarF == null) {
            return null;
        }
        return h(AbstractC0897d.d(interfaceC0761e.getClass()), bVarF, 0);
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r8v16, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r8v18, types: [byte[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r8v20, types: [int[]] */
    /* JADX WARN: Type inference failed for: r8v21, types: [float[]] */
    /* JADX WARN: Type inference failed for: r8v22, types: [long[]] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(S3.g r7, java.lang.ClassLoader r8) throws java.lang.NegativeArraySizeException {
        /*
            Method dump skipped, instructions count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.x0.k(S3.g, java.lang.ClassLoader):java.lang.Object");
    }
}
