package O3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: O3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0083o {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0081m f2086a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2087b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0084p f2088c;

    /* renamed from: d, reason: collision with root package name */
    public final C0082n f2089d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f2090e;

    public C0083o(AbstractC0081m abstractC0081m, Object obj, AbstractC0084p abstractC0084p, C0082n c0082n, Class cls) {
        if (abstractC0081m == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (c0082n.f2085e == Q.f2045i && abstractC0084p == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.f2086a = abstractC0081m;
        this.f2087b = obj;
        this.f2088c = abstractC0084p;
        this.f2089d = c0082n;
        if (!InterfaceC0085q.class.isAssignableFrom(cls)) {
            this.f2090e = null;
            return;
        }
        try {
            this.f2090e = cls.getMethod("valueOf", Integer.TYPE);
        } catch (NoSuchMethodException e5) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(name.length() + 52);
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"valueOf\".");
            throw new RuntimeException(sb.toString(), e5);
        }
    }

    public final Object a(Object obj) {
        if (this.f2089d.f2085e.f2048d != S.ENUM) {
            return obj;
        }
        try {
            return this.f2090e.invoke(null, (Integer) obj);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e5);
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final Object b(Object obj) {
        return this.f2089d.f2085e.f2048d == S.ENUM ? Integer.valueOf(((InterfaceC0085q) obj).a()) : obj;
    }
}
