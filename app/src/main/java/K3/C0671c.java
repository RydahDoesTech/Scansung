package k3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.util.Arrays;
import java.util.Map;

/* renamed from: k3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0671c extends b3.k implements InterfaceC0107b {

    /* renamed from: d, reason: collision with root package name */
    public static final C0671c f7914d = new C0671c(1);

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        String string;
        Map.Entry entry = (Map.Entry) obj;
        AbstractC0219i.e("entry", entry);
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = Arrays.toString((boolean[]) value);
            AbstractC0219i.d("toString(this)", string);
        } else if (value instanceof char[]) {
            string = Arrays.toString((char[]) value);
            AbstractC0219i.d("toString(this)", string);
        } else if (value instanceof byte[]) {
            string = Arrays.toString((byte[]) value);
            AbstractC0219i.d("toString(this)", string);
        } else if (value instanceof short[]) {
            string = Arrays.toString((short[]) value);
            AbstractC0219i.d("toString(this)", string);
        } else if (value instanceof int[]) {
            string = Arrays.toString((int[]) value);
            AbstractC0219i.d("toString(this)", string);
        } else if (value instanceof float[]) {
            string = Arrays.toString((float[]) value);
            AbstractC0219i.d("toString(this)", string);
        } else if (value instanceof long[]) {
            string = Arrays.toString((long[]) value);
            AbstractC0219i.d("toString(this)", string);
        } else if (value instanceof double[]) {
            string = Arrays.toString((double[]) value);
            AbstractC0219i.d("toString(this)", string);
        } else if (value instanceof Object[]) {
            string = Arrays.toString((Object[]) value);
            AbstractC0219i.d("toString(this)", string);
        } else {
            string = value.toString();
        }
        return str + '=' + string;
    }
}
