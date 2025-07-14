package V2;

import b3.AbstractC0219i;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f2624a;

    static {
        b bVar;
        Object objNewInstance;
        try {
            objNewInstance = X2.b.class.newInstance();
            AbstractC0219i.d("forName(\"kotlin.internal…entations\").newInstance()", objNewInstance);
        } catch (ClassNotFoundException unused) {
            Object objNewInstance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
            AbstractC0219i.d("forName(\"kotlin.internal…entations\").newInstance()", objNewInstance2);
            try {
                try {
                    bVar = (b) objNewInstance2;
                } catch (ClassCastException e5) {
                    ClassLoader classLoader = objNewInstance2.getClass().getClassLoader();
                    ClassLoader classLoader2 = b.class.getClassLoader();
                    if (AbstractC0219i.a(classLoader, classLoader2)) {
                        throw e5;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e5);
                }
            } catch (ClassNotFoundException unused2) {
                Object objNewInstance3 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                AbstractC0219i.d("forName(\"kotlin.internal…entations\").newInstance()", objNewInstance3);
                try {
                    bVar = (b) objNewInstance3;
                } catch (ClassCastException e6) {
                    ClassLoader classLoader3 = objNewInstance3.getClass().getClassLoader();
                    ClassLoader classLoader4 = b.class.getClassLoader();
                    if (AbstractC0219i.a(classLoader3, classLoader4)) {
                        throw e6;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e6);
                }
            }
        }
        try {
            try {
                bVar = (b) objNewInstance;
            } catch (ClassNotFoundException unused3) {
                Object objNewInstance4 = W2.b.class.newInstance();
                AbstractC0219i.d("forName(\"kotlin.internal…entations\").newInstance()", objNewInstance4);
                try {
                    try {
                        bVar = (b) objNewInstance4;
                    } catch (ClassCastException e7) {
                        ClassLoader classLoader5 = objNewInstance4.getClass().getClassLoader();
                        ClassLoader classLoader6 = b.class.getClassLoader();
                        if (AbstractC0219i.a(classLoader5, classLoader6)) {
                            throw e7;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e7);
                    }
                } catch (ClassNotFoundException unused4) {
                    bVar = new b();
                }
            }
            f2624a = bVar;
        } catch (ClassCastException e8) {
            ClassLoader classLoader7 = objNewInstance.getClass().getClassLoader();
            ClassLoader classLoader8 = b.class.getClassLoader();
            if (AbstractC0219i.a(classLoader7, classLoader8)) {
                throw e8;
            }
            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e8);
        }
    }
}
