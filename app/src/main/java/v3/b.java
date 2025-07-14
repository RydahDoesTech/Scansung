package V3;

import com.idm.core.tnds.IDMTndsXmlWbxmlDefine;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2625a;

    public b(String str) {
        if (str != null) {
            this.f2625a = str;
        } else {
            a(5);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i5) {
        String str = (i5 == 3 || i5 == 6 || i5 == 7 || i5 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i5 == 3 || i5 == 6 || i5 == 7 || i5 == 8) ? 2 : 3];
        switch (i5) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i5 == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i5 == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i5 == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i5 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i5) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i5 != 3 && i5 != 6 && i5 != 7 && i5 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static b b(N3.b bVar) {
        N3.c cVarG = bVar.g();
        String strReplace = bVar.h().b().replace('.', '$');
        if (cVarG.d()) {
            return new b(strReplace);
        }
        return new b(cVarG.b().replace('.', IDMTndsXmlWbxmlDefine.XML_SLASH) + "/" + strReplace);
    }

    public static b c(N3.c cVar) {
        if (cVar != null) {
            return new b(cVar.b().replace('.', IDMTndsXmlWbxmlDefine.XML_SLASH));
        }
        a(2);
        throw null;
    }

    public static b d(String str) {
        if (str != null) {
            return new b(str);
        }
        a(0);
        throw null;
    }

    public final String e() {
        String str = this.f2625a;
        if (str != null) {
            return str;
        }
        a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f2625a.equals(((b) obj).f2625a);
    }

    public final int hashCode() {
        return this.f2625a.hashCode();
    }

    public final String toString() {
        return this.f2625a;
    }
}
