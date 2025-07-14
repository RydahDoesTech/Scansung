package y3;

import b3.AbstractC0219i;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final N3.c f9439a;

    /* renamed from: b, reason: collision with root package name */
    public static final N3.b f9440b;

    static {
        N3.c cVar = new N3.c("kotlin.jvm.JvmField");
        f9439a = cVar;
        N3.b.j(cVar);
        N3.b.j(new N3.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f9440b = N3.b.e("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String str) {
        AbstractC0219i.e("propertyName", str);
        if (c(str)) {
            return str;
        }
        return "get" + J2.b.h(str);
    }

    public static final String b(String str) {
        String strH;
        StringBuilder sb = new StringBuilder("set");
        if (c(str)) {
            strH = str.substring(2);
            AbstractC0219i.d("this as java.lang.String).substring(startIndex)", strH);
        } else {
            strH = J2.b.h(str);
        }
        sb.append(strH);
        return sb.toString();
    }

    public static final boolean c(String str) {
        AbstractC0219i.e("name", str);
        if (!p4.h.o0(str, "is") || str.length() == 2) {
            return false;
        }
        char cCharAt = str.charAt(2);
        return ('a' >= cCharAt && 'a' != cCharAt) || (cCharAt >= 'z' && cCharAt != 'z');
    }
}
