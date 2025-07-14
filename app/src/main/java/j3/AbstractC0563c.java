package j3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import com.google.firebase.messaging.C0388e;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: j3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0563c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0388e f7379a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0388e f7380b;

    static {
        C0562b c0562b = C0562b.f7369e;
        int i5 = AbstractC0561a.f7367a;
        f7379a = new C0388e((InterfaceC0107b) c0562b);
        f7380b = new C0388e((InterfaceC0107b) C0562b.f);
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [a3.b, b3.k] */
    public static final C0585z a(Class cls) {
        AbstractC0219i.e("jClass", cls);
        C0388e c0388e = f7379a;
        c0388e.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0388e.f;
        Object obj = concurrentHashMap.get(cls);
        if (obj == null) {
            Object objD = ((b3.k) c0388e.f6142e).d(cls);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, objD);
            obj = objPutIfAbsent == null ? objD : objPutIfAbsent;
        }
        AbstractC0219i.c("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>", obj);
        return (C0585z) obj;
    }
}
