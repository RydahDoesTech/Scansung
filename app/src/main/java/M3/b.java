package M3;

import P2.m;
import P2.n;
import b3.AbstractC0219i;
import com.idm.agent.dm.uic.IDMDmUICInterface;
import com.idm.core.tnds.IDMTndsXmlWbxmlDefine;
import com.idm.fotaagent.enabler.fumo.IDMFumoExtInterface;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1814a = m.A0(n.h0('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f1815b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listH0 = n.h0("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", IDMDmUICInterface.IDM_UIC_OPTION_IT_I, "Float", IDMFumoExtInterface.IDM_FUMO_BINARY_CHECK_DISABLED, "Long", "J", "Double", IDMDmUICInterface.IDM_UIC_OPTION_IT_D);
        int iK = V1.a.K(0, listH0.size() - 1, 2);
        if (iK >= 0) {
            int i5 = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f1814a;
                sb.append(str);
                sb.append(IDMTndsXmlWbxmlDefine.XML_SLASH);
                sb.append((String) listH0.get(i5));
                int i6 = i5 + 1;
                linkedHashMap.put(sb.toString(), listH0.get(i6));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(IDMTndsXmlWbxmlDefine.XML_SLASH);
                linkedHashMap.put(A3.f.p(sb2, (String) listH0.get(i5), "Array"), "[" + ((String) listH0.get(i6)));
                if (i5 == iK) {
                    break;
                } else {
                    i5 += 2;
                }
            }
        }
        linkedHashMap.put(f1814a + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : n.h0("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : n.h0("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, g4.f.d("collections/", str3), "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i7 = 0; i7 < 23; i7++) {
            String strL = A3.f.l(i7, "Function");
            StringBuilder sb3 = new StringBuilder();
            String str4 = f1814a;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i7);
            a(linkedHashMap, strL, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i7, str4 + "/reflect/KFunction");
        }
        for (String str5 : n.h0("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, g4.f.c(str5, ".Companion"), f1814a + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f1815b = linkedHashMap;
    }

    public static final void a(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(f1814a + IDMTndsXmlWbxmlDefine.XML_SLASH + str, "L" + str2 + ';');
    }

    public static final String b(String str) {
        AbstractC0219i.e("classId", str);
        String str2 = (String) f1815b.get(str);
        if (str2 != null) {
            return str2;
        }
        return "L" + p4.h.m0(str, '.', '$') + ';';
    }
}
