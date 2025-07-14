package b4;

import O3.C0077i;
import O3.C0083o;
import b3.AbstractC0219i;
import com.idm.core.tnds.IDMTndsXmlWbxmlDefine;
import p4.h;

/* loaded from: classes.dex */
public final class a extends Z3.a {

    /* renamed from: m, reason: collision with root package name */
    public static final a f5101m;

    static {
        C0077i c0077i = new C0077i();
        J3.b.a(c0077i);
        C0083o c0083o = J3.b.f1588a;
        AbstractC0219i.d("packageFqName", c0083o);
        C0083o c0083o2 = J3.b.f1590c;
        AbstractC0219i.d("constructorAnnotation", c0083o2);
        C0083o c0083o3 = J3.b.f1589b;
        AbstractC0219i.d("classAnnotation", c0083o3);
        C0083o c0083o4 = J3.b.f1591d;
        AbstractC0219i.d("functionAnnotation", c0083o4);
        C0083o c0083o5 = J3.b.f1592e;
        AbstractC0219i.d("propertyAnnotation", c0083o5);
        C0083o c0083o6 = J3.b.f;
        AbstractC0219i.d("propertyGetterAnnotation", c0083o6);
        C0083o c0083o7 = J3.b.f1593g;
        AbstractC0219i.d("propertySetterAnnotation", c0083o7);
        C0083o c0083o8 = J3.b.f1595i;
        AbstractC0219i.d("enumEntryAnnotation", c0083o8);
        C0083o c0083o9 = J3.b.f1594h;
        AbstractC0219i.d("compileTimeValue", c0083o9);
        C0083o c0083o10 = J3.b.f1596j;
        AbstractC0219i.d("parameterAnnotation", c0083o10);
        C0083o c0083o11 = J3.b.f1597k;
        AbstractC0219i.d("typeAnnotation", c0083o11);
        C0083o c0083o12 = J3.b.f1598l;
        AbstractC0219i.d("typeParameterAnnotation", c0083o12);
        f5101m = new a(c0077i, c0083o, c0083o2, c0083o3, c0083o4, c0083o5, c0083o6, c0083o7, c0083o8, c0083o9, c0083o10, c0083o11, c0083o12);
    }

    public static String a(N3.c cVar) {
        String strB;
        AbstractC0219i.e("fqName", cVar);
        StringBuilder sb = new StringBuilder();
        sb.append(h.m0(cVar.b(), '.', IDMTndsXmlWbxmlDefine.XML_SLASH));
        sb.append(IDMTndsXmlWbxmlDefine.XML_SLASH);
        if (cVar.d()) {
            strB = "default-package";
        } else {
            strB = cVar.f().b();
            AbstractC0219i.d("fqName.shortName().asString()", strB);
        }
        sb.append(strB.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
