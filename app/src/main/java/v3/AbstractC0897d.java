package v3;

import a3.InterfaceC0106a;
import a3.InterfaceC0107b;
import a3.InterfaceC0108c;
import a3.InterfaceC0109d;
import b3.AbstractC0219i;
import com.idm.agent.dm.uic.IDMDmUICInterface;
import com.idm.core.tnds.IDMTndsXmlWbxmlDefine;
import com.idm.fotaagent.enabler.fumo.IDMFumoExtInterface;
import g3.InterfaceC0453c;
import j3.InterfaceC0565e;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: v3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0897d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f9243a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f9244b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f9245c;

    static {
        Class cls = Boolean.TYPE;
        b3.r rVar = b3.q.f5100a;
        List<InterfaceC0453c> listH0 = P2.n.h0(rVar.b(cls), rVar.b(Byte.TYPE), rVar.b(Character.TYPE), rVar.b(Double.TYPE), rVar.b(Float.TYPE), rVar.b(Integer.TYPE), rVar.b(Long.TYPE), rVar.b(Short.TYPE));
        f9243a = listH0;
        ArrayList arrayList = new ArrayList(P2.o.l0(listH0));
        for (InterfaceC0453c interfaceC0453c : listH0) {
            arrayList.add(new O2.f(g3.y.A(interfaceC0453c), g3.y.B(interfaceC0453c)));
        }
        f9244b = P2.z.k0(arrayList);
        List<InterfaceC0453c> list = f9243a;
        ArrayList arrayList2 = new ArrayList(P2.o.l0(list));
        for (InterfaceC0453c interfaceC0453c2 : list) {
            arrayList2.add(new O2.f(g3.y.B(interfaceC0453c2), g3.y.A(interfaceC0453c2)));
        }
        f9245c = P2.z.k0(arrayList2);
        List listH02 = P2.n.h0(InterfaceC0106a.class, InterfaceC0107b.class, InterfaceC0108c.class, InterfaceC0109d.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class);
        ArrayList arrayList3 = new ArrayList(P2.o.l0(listH02));
        int i5 = 0;
        for (Object obj : listH02) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                P2.n.k0();
                throw null;
            }
            arrayList3.add(new O2.f((Class) obj, Integer.valueOf(i5)));
            i5 = i6;
        }
        P2.z.k0(arrayList3);
    }

    public static final N3.b a(Class cls) {
        N3.b bVarA;
        AbstractC0219i.e("<this>", cls);
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null && cls.getSimpleName().length() != 0) {
            Class<?> declaringClass = cls.getDeclaringClass();
            return (declaringClass == null || (bVarA = a(declaringClass)) == null) ? N3.b.j(new N3.c(cls.getName())) : bVarA.d(N3.f.e(cls.getSimpleName()));
        }
        N3.c cVar = new N3.c(cls.getName());
        return new N3.b(cVar.e(), N3.c.j(cVar.f()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final String b(Class cls) {
        AbstractC0219i.e("<this>", cls);
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return p4.h.m0(cls.getName(), '.', IDMTndsXmlWbxmlDefine.XML_SLASH);
            }
            return "L" + p4.h.m0(cls.getName(), '.', IDMTndsXmlWbxmlDefine.XML_SLASH) + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return IDMDmUICInterface.IDM_UIC_OPTION_IT_D;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return IDMDmUICInterface.IDM_UIC_OPTION_IT_I;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return IDMFumoExtInterface.IDM_FUMO_BINARY_CHECK_DISABLED;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final List c(Type type) {
        AbstractC0219i.e("<this>", type);
        if (!(type instanceof ParameterizedType)) {
            return P2.u.f2163d;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return o4.m.k0(new o4.h(o4.m.h0(type, C0896c.f9239e), C0896c.f, o4.p.f8320l));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        AbstractC0219i.d("actualTypeArguments", actualTypeArguments);
        return P2.i.w0(actualTypeArguments);
    }

    public static final ClassLoader d(Class cls) {
        AbstractC0219i.e("<this>", cls);
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        AbstractC0219i.d("getSystemClassLoader()", systemClassLoader);
        return systemClassLoader;
    }
}
