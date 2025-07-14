package Q3;

import com.idm.providers.mo.IDMMoDatabaseConstants;
import com.samsung.android.knox.ex.KnoxContract;
import e4.AbstractC0438v;
import e4.J;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p3.AbstractC0771o;
import p3.C0753O;
import p3.InterfaceC0742D;
import p3.InterfaceC0747I;
import p3.InterfaceC0758b;
import p3.InterfaceC0759c;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import p3.InterfaceC0766j;
import p3.InterfaceC0767k;
import p3.InterfaceC0769m;
import p3.InterfaceC0781y;
import s3.AbstractC0828D;
import s3.C0836L;
import s3.y;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2341a = 0;

    static {
        new N3.c("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i5) {
        String str;
        int i6;
        switch (i5) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i5) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i6 = 2;
                break;
            default:
                i6 = 3;
                break;
        }
        Object[] objArr = new Object[i6];
        switch (i5) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = KnoxContract.Config.DateTime.PARAM_SECOND;
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 67:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case 90:
            case 92:
                objArr[0] = IDMMoDatabaseConstants.IDM_SCOPE;
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i5) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i5) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i5) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static void b(InterfaceC0758b interfaceC0758b, LinkedHashSet linkedHashSet) {
        if (interfaceC0758b == null) {
            a(73);
            throw null;
        }
        if (linkedHashSet.contains(interfaceC0758b)) {
            return;
        }
        Iterator it = interfaceC0758b.a().p().iterator();
        while (it.hasNext()) {
            InterfaceC0758b interfaceC0758bA = ((InterfaceC0758b) it.next()).a();
            b(interfaceC0758bA, linkedHashSet);
            linkedHashSet.add(interfaceC0758bA);
        }
    }

    public static InterfaceC0761e c(AbstractC0438v abstractC0438v) {
        if (abstractC0438v == null) {
            a(45);
            throw null;
        }
        J jI0 = abstractC0438v.I0();
        if (jI0 == null) {
            a(46);
            throw null;
        }
        InterfaceC0761e interfaceC0761e = (InterfaceC0761e) jI0.i();
        if (interfaceC0761e != null) {
            return interfaceC0761e;
        }
        a(47);
        throw null;
    }

    public static InterfaceC0781y d(InterfaceC0766j interfaceC0766j) {
        if (interfaceC0766j == null) {
            a(21);
            throw null;
        }
        InterfaceC0781y interfaceC0781yE = e(interfaceC0766j);
        if (interfaceC0781yE != null) {
            return interfaceC0781yE;
        }
        a(22);
        throw null;
    }

    public static InterfaceC0781y e(InterfaceC0766j interfaceC0766j) {
        if (interfaceC0766j == null) {
            a(23);
            throw null;
        }
        while (interfaceC0766j != null) {
            if (interfaceC0766j instanceof InterfaceC0781y) {
                return (InterfaceC0781y) interfaceC0766j;
            }
            if (interfaceC0766j instanceof InterfaceC0747I) {
                return ((y) ((InterfaceC0747I) interfaceC0766j)).f;
            }
            interfaceC0766j = interfaceC0766j.l();
        }
        return null;
    }

    public static C0753O f(InterfaceC0766j interfaceC0766j) {
        if (interfaceC0766j == null) {
            a(82);
            throw null;
        }
        if (interfaceC0766j instanceof C0836L) {
            interfaceC0766j = ((C0836L) interfaceC0766j).O0();
        }
        boolean z4 = interfaceC0766j instanceof InterfaceC0767k;
        C0753O c0753o = C0753O.f8401e;
        if (z4) {
            ((InterfaceC0767k) interfaceC0766j).n().getClass();
        }
        return c0753o;
    }

    public static N3.e g(InterfaceC0766j interfaceC0766j) {
        if (interfaceC0766j != null) {
            N3.c cVarH = h(interfaceC0766j);
            return cVarH != null ? cVarH.i() : i(interfaceC0766j);
        }
        a(2);
        throw null;
    }

    public static N3.c h(InterfaceC0766j interfaceC0766j) {
        if (interfaceC0766j == null) {
            a(5);
            throw null;
        }
        if ((interfaceC0766j instanceof InterfaceC0781y) || g4.j.f(interfaceC0766j)) {
            return N3.c.f1833c;
        }
        if (interfaceC0766j instanceof InterfaceC0747I) {
            return ((y) ((InterfaceC0747I) interfaceC0766j)).f8900g;
        }
        if (interfaceC0766j instanceof InterfaceC0742D) {
            return ((AbstractC0828D) ((InterfaceC0742D) interfaceC0766j)).f8745h;
        }
        return null;
    }

    public static N3.e i(InterfaceC0766j interfaceC0766j) {
        if (interfaceC0766j != null) {
            return g(interfaceC0766j.l()).b(interfaceC0766j.getName());
        }
        a(6);
        throw null;
    }

    public static InterfaceC0766j j(InterfaceC0766j interfaceC0766j, Class cls, boolean z4) {
        if (interfaceC0766j == null) {
            return null;
        }
        if (z4) {
            interfaceC0766j = interfaceC0766j.l();
        }
        while (interfaceC0766j != null) {
            if (cls.isInstance(interfaceC0766j)) {
                return interfaceC0766j;
            }
            interfaceC0766j = interfaceC0766j.l();
        }
        return null;
    }

    public static InterfaceC0761e k(InterfaceC0761e interfaceC0761e) {
        if (interfaceC0761e == null) {
            a(44);
            throw null;
        }
        Iterator it = interfaceC0761e.I().j().iterator();
        while (it.hasNext()) {
            InterfaceC0761e interfaceC0761eC = c((AbstractC0438v) it.next());
            if (interfaceC0761eC.L() != 2) {
                return interfaceC0761eC;
            }
        }
        return null;
    }

    public static boolean l(InterfaceC0766j interfaceC0766j) {
        if (interfaceC0766j != null) {
            return o(interfaceC0766j, 1) && interfaceC0766j.getName().equals(N3.h.f1845a);
        }
        a(34);
        throw null;
    }

    public static boolean m(InterfaceC0766j interfaceC0766j) {
        return o(interfaceC0766j, 6) && ((InterfaceC0761e) interfaceC0766j).N();
    }

    public static boolean n(InterfaceC0766j interfaceC0766j) {
        if (interfaceC0766j != null) {
            return o(interfaceC0766j, 4);
        }
        a(36);
        throw null;
    }

    public static boolean o(InterfaceC0766j interfaceC0766j, int i5) {
        if (i5 != 0) {
            return (interfaceC0766j instanceof InterfaceC0761e) && ((InterfaceC0761e) interfaceC0766j).L() == i5;
        }
        a(37);
        throw null;
    }

    public static boolean p(InterfaceC0766j interfaceC0766j) {
        if (interfaceC0766j == null) {
            a(1);
            throw null;
        }
        while (interfaceC0766j != null) {
            if (l(interfaceC0766j) || ((interfaceC0766j instanceof InterfaceC0769m) && ((InterfaceC0769m) interfaceC0766j).b() == AbstractC0771o.f)) {
                return true;
            }
            interfaceC0766j = interfaceC0766j.l();
        }
        return false;
    }

    public static boolean q(AbstractC0438v abstractC0438v, InterfaceC0761e interfaceC0761e) {
        if (abstractC0438v == null) {
            a(30);
            throw null;
        }
        if (interfaceC0761e == null) {
            a(31);
            throw null;
        }
        InterfaceC0763g interfaceC0763gI = abstractC0438v.I0().i();
        if (interfaceC0763gI == null) {
            return false;
        }
        InterfaceC0766j interfaceC0766jA = interfaceC0763gI.a();
        return (interfaceC0766jA instanceof InterfaceC0763g) && interfaceC0761e.I().equals(((InterfaceC0763g) interfaceC0766jA).I());
    }

    public static boolean r(InterfaceC0766j interfaceC0766j) {
        return (o(interfaceC0766j, 1) || o(interfaceC0766j, 2)) && ((InterfaceC0761e) interfaceC0766j).i() == 2;
    }

    public static boolean s(AbstractC0438v abstractC0438v, InterfaceC0761e interfaceC0761e) {
        if (abstractC0438v == null) {
            a(32);
            throw null;
        }
        if (interfaceC0761e == null) {
            a(33);
            throw null;
        }
        if (q(abstractC0438v, interfaceC0761e)) {
            return true;
        }
        Iterator it = abstractC0438v.I0().j().iterator();
        while (it.hasNext()) {
            if (s((AbstractC0438v) it.next(), interfaceC0761e)) {
                return true;
            }
        }
        return false;
    }

    public static boolean t(InterfaceC0766j interfaceC0766j) {
        return interfaceC0766j != null && (interfaceC0766j.l() instanceof InterfaceC0742D);
    }

    public static InterfaceC0759c u(InterfaceC0759c interfaceC0759c) {
        if (interfaceC0759c == null) {
            a(59);
            throw null;
        }
        while (interfaceC0759c.i0() == 2) {
            Collection collectionP = interfaceC0759c.p();
            if (collectionP.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + interfaceC0759c);
            }
            interfaceC0759c = (InterfaceC0759c) collectionP.iterator().next();
        }
        return interfaceC0759c;
    }
}
