package m3;

import b3.AbstractC0219i;
import e4.AbstractC0420c;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.C0421d;
import e4.J;
import e4.N;
import e4.O;
import e4.X;
import e4.Z;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import n3.C0696a;
import n3.EnumC0700e;
import p3.AbstractC0779w;
import p3.InterfaceC0742D;
import p3.InterfaceC0743E;
import p3.InterfaceC0750L;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import p3.InterfaceC0766j;
import p3.InterfaceC0776t;
import p3.InterfaceC0781y;
import q3.C0797g;
import q3.InterfaceC0798h;
import r3.C0815a;
import r3.InterfaceC0816b;
import r3.InterfaceC0818d;
import s3.AbstractC0828D;
import s3.C0826B;
import s3.C0835K;
import s3.C0836L;

/* renamed from: m3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0695h {

    /* renamed from: e, reason: collision with root package name */
    public static final N3.f f8064e = N3.f.g("<built-ins module>");

    /* renamed from: a, reason: collision with root package name */
    public C0826B f8065a;

    /* renamed from: b, reason: collision with root package name */
    public final d4.i f8066b;

    /* renamed from: c, reason: collision with root package name */
    public final d4.e f8067c;

    /* renamed from: d, reason: collision with root package name */
    public final d4.l f8068d;

    public AbstractC0695h(d4.l lVar) {
        this.f8068d = lVar;
        lVar.a(new C0693f(this, 0));
        this.f8066b = new d4.i(lVar, new C0693f(this, 1));
        this.f8067c = lVar.b(new Q3.m(1, this));
    }

    public static boolean A(AbstractC0438v abstractC0438v, N3.e eVar) {
        if (eVar != null) {
            return z(abstractC0438v, eVar) && !abstractC0438v.J0();
        }
        a(135);
        throw null;
    }

    public static boolean B(InterfaceC0776t interfaceC0776t) {
        if (interfaceC0776t.a().s().e(m.f8129m)) {
            return true;
        }
        if (!(interfaceC0776t instanceof InterfaceC0750L)) {
            return false;
        }
        InterfaceC0750L interfaceC0750L = (InterfaceC0750L) interfaceC0776t;
        boolean zT = interfaceC0750L.T();
        C0835K c0835kF = interfaceC0750L.f();
        C0836L c0836lE = interfaceC0750L.e();
        if (c0835kF != null && B(c0835kF)) {
            if (!zT) {
                return true;
            }
            if (c0836lE != null && B(c0836lE)) {
                return true;
            }
        }
        return false;
    }

    public static boolean C(AbstractC0438v abstractC0438v, N3.e eVar) {
        if (abstractC0438v == null) {
            a(105);
            throw null;
        }
        if (eVar != null) {
            return !abstractC0438v.J0() && z(abstractC0438v, eVar);
        }
        a(106);
        throw null;
    }

    public static boolean D(AbstractC0438v abstractC0438v) {
        if (abstractC0438v == null) {
            a(136);
            throw null;
        }
        if (abstractC0438v != null) {
            return z(abstractC0438v, m.f8117b) && !X.e(abstractC0438v);
        }
        a(138);
        throw null;
    }

    public static boolean E(AbstractC0438v abstractC0438v) {
        if (abstractC0438v == null) {
            a(94);
            throw null;
        }
        if (!abstractC0438v.J0()) {
            InterfaceC0763g interfaceC0763gI = abstractC0438v.I0().i();
            if (interfaceC0763gI instanceof InterfaceC0761e) {
                InterfaceC0761e interfaceC0761e = (InterfaceC0761e) interfaceC0763gI;
                if (interfaceC0761e == null) {
                    a(96);
                    throw null;
                }
                if (s(interfaceC0761e) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean F(J j5, N3.e eVar) {
        if (j5 == null) {
            a(101);
            throw null;
        }
        if (eVar != null) {
            InterfaceC0763g interfaceC0763gI = j5.i();
            return (interfaceC0763gI instanceof InterfaceC0761e) && b((InterfaceC0761e) interfaceC0763gI, eVar);
        }
        a(102);
        throw null;
    }

    public static boolean G(InterfaceC0763g interfaceC0763g) {
        if (interfaceC0763g == null) {
            a(10);
            throw null;
        }
        for (InterfaceC0763g interfaceC0763gL = interfaceC0763g; interfaceC0763gL != null; interfaceC0763gL = interfaceC0763gL.l()) {
            if (interfaceC0763gL instanceof InterfaceC0742D) {
                return ((AbstractC0828D) ((InterfaceC0742D) interfaceC0763gL)).f8745h.h(n.f8149i);
            }
        }
        return false;
    }

    public static /* synthetic */ void a(int i5) {
        String str;
        int i6;
        switch (i5) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i5) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                i6 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                i6 = 3;
                break;
        }
        Object[] objArr = new Object[i6];
        switch (i5) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
            case 160:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 53:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 162:
                objArr[0] = "type";
                break;
            case 46:
                objArr[0] = "classSimpleName";
                break;
            case 67:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 161:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i5) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKCallable";
                break;
            case 23:
                objArr[1] = "getKProperty";
                break;
            case 24:
                objArr[1] = "getKProperty0";
                break;
            case 25:
                objArr[1] = "getKProperty1";
                break;
            case 26:
                objArr[1] = "getKProperty2";
                break;
            case 27:
                objArr[1] = "getKMutableProperty0";
                break;
            case 28:
                objArr[1] = "getKMutableProperty1";
                break;
            case 29:
                objArr[1] = "getKMutableProperty2";
                break;
            case 30:
                objArr[1] = "getIterator";
                break;
            case 31:
                objArr[1] = "getIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterator";
                break;
            case 34:
                objArr[1] = "getCollection";
                break;
            case 35:
                objArr[1] = "getMutableCollection";
                break;
            case 36:
                objArr[1] = "getList";
                break;
            case 37:
                objArr[1] = "getMutableList";
                break;
            case 38:
                objArr[1] = "getSet";
                break;
            case 39:
                objArr[1] = "getMutableSet";
                break;
            case 40:
                objArr[1] = "getMap";
                break;
            case 41:
                objArr[1] = "getMutableMap";
                break;
            case 42:
                objArr[1] = "getMapEntry";
                break;
            case 43:
                objArr[1] = "getMutableMapEntry";
                break;
            case 44:
                objArr[1] = "getListIterator";
                break;
            case 45:
                objArr[1] = "getMutableListIterator";
                break;
            case 47:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 48:
                objArr[1] = "getNothingType";
                break;
            case 49:
                objArr[1] = "getNullableNothingType";
                break;
            case 50:
                objArr[1] = "getAnyType";
                break;
            case 51:
                objArr[1] = "getNullableAnyType";
                break;
            case 52:
                objArr[1] = "getDefaultBound";
                break;
            case 54:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 55:
                objArr[1] = "getNumberType";
                break;
            case 56:
                objArr[1] = "getByteType";
                break;
            case 57:
                objArr[1] = "getShortType";
                break;
            case 58:
                objArr[1] = "getIntType";
                break;
            case 59:
                objArr[1] = "getLongType";
                break;
            case 60:
                objArr[1] = "getFloatType";
                break;
            case 61:
                objArr[1] = "getDoubleType";
                break;
            case 62:
                objArr[1] = "getCharType";
                break;
            case 63:
                objArr[1] = "getBooleanType";
                break;
            case 64:
                objArr[1] = "getUnitType";
                break;
            case 65:
                objArr[1] = "getStringType";
                break;
            case 66:
                objArr[1] = "getIterableType";
                break;
            case 68:
            case 69:
            case 70:
                objArr[1] = "getArrayElementType";
                break;
            case 74:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 81:
            case 84:
                objArr[1] = "getArrayType";
                break;
            case 86:
                objArr[1] = "getEnumType";
                break;
            case 87:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i5) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 46:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 53:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 67:
                objArr[2] = "getArrayElementType";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isCloneable";
                break;
            case 161:
                objArr[2] = "isDeprecated";
                break;
            case 162:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i5) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                throw new IllegalStateException(str2);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean b(InterfaceC0761e interfaceC0761e, N3.e eVar) {
        if (interfaceC0761e == null) {
            a(103);
            throw null;
        }
        if (eVar != null) {
            return interfaceC0761e.getName().equals(eVar.f()) && eVar.equals(Q3.f.g(interfaceC0761e));
        }
        a(104);
        throw null;
    }

    public static j q(InterfaceC0763g interfaceC0763g) {
        if (interfaceC0763g == null) {
            a(77);
            throw null;
        }
        if (m.f8116a0.contains(interfaceC0763g.getName())) {
            return (j) m.f8120c0.get(Q3.f.g(interfaceC0763g));
        }
        return null;
    }

    public static j s(InterfaceC0761e interfaceC0761e) {
        if (interfaceC0761e == null) {
            a(76);
            throw null;
        }
        if (m.f8114Z.contains(interfaceC0761e.getName())) {
            return (j) m.f8118b0.get(Q3.f.g(interfaceC0761e));
        }
        return null;
    }

    public static boolean w(AbstractC0438v abstractC0438v) {
        if (abstractC0438v != null) {
            return z(abstractC0438v, m.f8115a);
        }
        a(139);
        throw null;
    }

    public static boolean x(AbstractC0438v abstractC0438v) {
        if (abstractC0438v != null) {
            return z(abstractC0438v, m.f8123g);
        }
        a(88);
        throw null;
    }

    public static boolean y(InterfaceC0766j interfaceC0766j) {
        if (interfaceC0766j != null) {
            return Q3.f.j(interfaceC0766j, b4.c.class, false) != null;
        }
        a(9);
        throw null;
    }

    public static boolean z(AbstractC0438v abstractC0438v, N3.e eVar) {
        if (abstractC0438v == null) {
            a(97);
            throw null;
        }
        if (eVar != null) {
            return F(abstractC0438v.I0(), eVar);
        }
        a(98);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [O2.c, java.lang.Object] */
    public final void c(boolean z4) {
        N3.f fVar = f8064e;
        AbstractC0219i.e("moduleName", fVar);
        d4.l lVar = this.f8068d;
        C0826B c0826b = new C0826B(fVar, lVar, this, 48);
        this.f8065a = c0826b;
        InterfaceC0690c.f8058a.getClass();
        InterfaceC0743E interfaceC0743EA = ((b4.b) ((InterfaceC0690c) C0689b.f8057b.getValue())).a(lVar, this.f8065a, l(), o(), d(), z4);
        AbstractC0219i.e("providerForModuleContent", interfaceC0743EA);
        c0826b.f8736k = interfaceC0743EA;
        C0826B c0826b2 = this.f8065a;
        c0826b2.getClass();
        c0826b2.f8735j = new K3.g(P2.i.w0(new C0826B[]{c0826b2}));
    }

    public InterfaceC0816b d() {
        return C0815a.f8580b;
    }

    public final AbstractC0442z e() {
        AbstractC0442z abstractC0442zQ = j("Any").q();
        if (abstractC0442zQ != null) {
            return abstractC0442zQ;
        }
        a(50);
        throw null;
    }

    public final AbstractC0438v f(AbstractC0438v abstractC0438v) {
        N3.b bVarF;
        N3.b bVar;
        InterfaceC0761e interfaceC0761eD;
        AbstractC0442z abstractC0442zQ = null;
        if (abstractC0438v == null) {
            a(67);
            throw null;
        }
        if (x(abstractC0438v)) {
            if (abstractC0438v.s0().size() != 1) {
                throw new IllegalStateException();
            }
            AbstractC0438v abstractC0438vB = ((N) abstractC0438v.s0().get(0)).b();
            if (abstractC0438vB != null) {
                return abstractC0438vB;
            }
            a(68);
            throw null;
        }
        Z zG = X.g(abstractC0438v, false);
        AbstractC0438v abstractC0438v2 = (AbstractC0438v) ((C0694g) this.f8066b.a()).f8063b.get(zG);
        if (abstractC0438v2 != null) {
            return abstractC0438v2;
        }
        int i5 = Q3.f.f2341a;
        InterfaceC0763g interfaceC0763gI = zG.I0().i();
        InterfaceC0781y interfaceC0781yE = interfaceC0763gI == null ? null : Q3.f.e(interfaceC0763gI);
        if (interfaceC0781yE != null) {
            InterfaceC0763g interfaceC0763gI2 = zG.I0().i();
            if (interfaceC0763gI2 != null) {
                Set set = r.f8164a;
                N3.f name = interfaceC0763gI2.getName();
                AbstractC0219i.e("name", name);
                if (r.f8167d.contains(name) && (bVarF = U3.f.f(interfaceC0763gI2)) != null && (bVar = (N3.b) r.f8165b.get(bVarF)) != null && (interfaceC0761eD = AbstractC0779w.d(interfaceC0781yE, bVar)) != null) {
                    abstractC0442zQ = interfaceC0761eD.q();
                }
            }
            if (abstractC0442zQ != null) {
                return abstractC0442zQ;
            }
        }
        throw new IllegalStateException("not array: " + abstractC0438v);
    }

    public final AbstractC0442z g(int i5, AbstractC0438v abstractC0438v, InterfaceC0798h interfaceC0798h) {
        if (i5 == 0) {
            a(78);
            throw null;
        }
        if (abstractC0438v != null) {
            return C0421d.q(AbstractC0420c.w(interfaceC0798h), j("Array"), Collections.singletonList(new O(i5, abstractC0438v)));
        }
        a(79);
        throw null;
    }

    public final AbstractC0442z h(Z z4) {
        if (z4 != null) {
            return g(1, z4, C0797g.f8481a);
        }
        a(83);
        throw null;
    }

    public final InterfaceC0761e i(N3.c cVar) {
        if (cVar == null) {
            a(12);
            throw null;
        }
        InterfaceC0761e interfaceC0761eJ = AbstractC0779w.j(k(), cVar);
        if (interfaceC0761eJ != null) {
            return interfaceC0761eJ;
        }
        a(13);
        throw null;
    }

    public final InterfaceC0761e j(String str) {
        if (str != null) {
            return (InterfaceC0761e) this.f8067c.d(N3.f.e(str));
        }
        a(14);
        throw null;
    }

    public final C0826B k() {
        this.f8065a.getClass();
        C0826B c0826b = this.f8065a;
        if (c0826b != null) {
            return c0826b;
        }
        a(7);
        throw null;
    }

    public Iterable l() {
        List listSingletonList = Collections.singletonList(new C0696a(this.f8068d, k()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    public final AbstractC0442z m() {
        AbstractC0442z abstractC0442zQ = j("Nothing").q();
        if (abstractC0442zQ != null) {
            return abstractC0442zQ;
        }
        a(48);
        throw null;
    }

    public final AbstractC0442z n() {
        AbstractC0442z abstractC0442zP0 = e().M0(true);
        if (abstractC0442zP0 != null) {
            return abstractC0442zP0;
        }
        a(51);
        throw null;
    }

    public InterfaceC0818d o() {
        return C0815a.f8582d;
    }

    public final AbstractC0442z p(j jVar) {
        if (jVar == null) {
            a(73);
            throw null;
        }
        AbstractC0442z abstractC0442z = (AbstractC0442z) ((C0694g) this.f8066b.a()).f8062a.get(jVar);
        if (abstractC0442z != null) {
            return abstractC0442z;
        }
        a(74);
        throw null;
    }

    public final AbstractC0442z r(j jVar) {
        if (jVar == null) {
            a(53);
            throw null;
        }
        AbstractC0442z abstractC0442zQ = j(jVar.f8080d.b()).q();
        if (abstractC0442zQ != null) {
            return abstractC0442zQ;
        }
        a(54);
        throw null;
    }

    public final AbstractC0442z t() {
        AbstractC0442z abstractC0442zQ = j("String").q();
        if (abstractC0442zQ != null) {
            return abstractC0442zQ;
        }
        a(65);
        throw null;
    }

    public final InterfaceC0761e u(int i5) {
        return i(n.f8146e.c(N3.f.e(EnumC0700e.f8182h.f8187e + i5)));
    }

    public final AbstractC0442z v() {
        AbstractC0442z abstractC0442zQ = j("Unit").q();
        if (abstractC0442zQ != null) {
            return abstractC0442zQ;
        }
        a(64);
        throw null;
    }
}
