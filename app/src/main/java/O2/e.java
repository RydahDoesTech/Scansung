package O2;

import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class e extends Error {
    public e() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, int i5) {
        super(str);
        switch (i5) {
            case 2:
                AbstractC0219i.e("message", str);
                super(str);
                break;
            default:
                AbstractC0219i.e("message", str);
                break;
        }
    }
}
